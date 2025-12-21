package org.hobbiesofar.SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class RepeatedDNASequence {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> sequenceCount = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for(int i = 0; i <= s.length() - 10; i++) {
            String currentSequece = s.substring(i, i + 10);
            int newCount = sequenceCount.merge(currentSequece, 1, Integer::sum);
            if(newCount == 2){
                ans.add(currentSequece);
            }
        }
        return ans;
    }
}
