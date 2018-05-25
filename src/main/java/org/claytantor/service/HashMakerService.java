package org.claytantor.service;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by claytongraham on 5/25/18.
 */
@Component
public class HashMakerService {

    /**
     * this is a hash lookup for values.
     * @param items
     * @return
     */
    public Map<Integer,Integer> makeIntegerHash(List<Integer> items){

        Map<Integer,Integer> result = new HashMap<>();
        for (int i = 0; i < items.size(); i++) {
            result.put(items.get(i),i);
        }
        return result;
    }

}
