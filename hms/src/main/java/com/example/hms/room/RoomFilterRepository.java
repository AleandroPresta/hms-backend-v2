package com.example.hms.room;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;

import com.example.hms.room.RoomEntity.RoomType;

@Repository
@RequiredArgsConstructor
public class RoomFilterRepository {
    
    private final EntityManager em;

    public Iterable<RoomEntity> findAllByQuery(
        String roomName/*,
        List<RoomType> roomTypes,
        Integer minRoomCapacity,
        Integer maxRoomCapacity,
        String roomLocation,
        Integer minRoomSize,
        Integer maxRoomSize,
        List<String> roomFeatures,
        Double minRoomPrice,
        Double maxRoomPrice,
        Double minRoomRating,
        Double maxRoomRating,
        Integer pageNo,
        Integer pageSize,
        String sortBy */
    ) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<RoomEntity> cq = cb.createQuery(RoomEntity.class);
        Root<RoomEntity> root = cq.from(RoomEntity.class);

        List<Predicate> predicates = new ArrayList<>();

        if (validRoomName(roomName)) {
            predicates.add(predicateByRoomName(cb, root, roomName));
        }

        /*if (sortBy != null) {
            cq.orderBy(cb.asc(root.get(sortBy)));
        } */

        cq.where(predicates.toArray(new Predicate[0]));

        /* if (pageNo != null && pageSize != null) {
            int offset = (pageNo - 1) * pageSize;
            return em.createQuery(cq).setFirstResult(offset).setMaxResults(pageSize).getResultList();
        }*/
        
        return em.createQuery(cq).getResultList();
    }

    private boolean validRoomName(String roomName) {
        return roomName != null && !roomName.isEmpty();
    }

    private Predicate predicateByRoomName(CriteriaBuilder cb, Root<RoomEntity> root, String roomName) {
        return cb.like(root.get("roomName"), "%" + roomName + "%");
    }

}
