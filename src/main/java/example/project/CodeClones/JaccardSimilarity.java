package example.project.CodeClones;

import java.util.HashSet;
import java.util.Set;

public class JaccardSimilarity {

    public static double computeJaccardSimilarity(Set<String> set1, Set<String> set2) {
        // DoneTODO: implement this function to compute the Jaccard similarity between two string arrays
        Set<String> intersection = new HashSet<String>(set1);
        intersection.retainAll(set2);
        double intersectionSize = intersection.size();

        Set<String> union = new HashSet<String>(set1);
        union.addAll(set2);
        double unionSize = union.size();
        
        double similarity = intersectionSize / unionSize;
        return similarity;
    }

}
