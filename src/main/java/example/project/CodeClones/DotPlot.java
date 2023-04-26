package example.project.CodeClones;

public class DotPlot {

    public static void printDotPlot(char[] sequence1, char[] sequence2) {
        // TODO: complete this function to print the dot plot of two string arrays
        
        // Top row
        for (int i = 0; i < sequence2.length; i++) {
            System.out.print("\t" + sequence2[i]);
        }
        System.out.println();

        for (int i = 0; i < sequence1.length; i++) {
            System.out.print(sequence1[i]);
            for (int j = 0; j < sequence2.length; j++) {
                String dot = " ";
                if (sequence1[i] == sequence2[j]) {
                    dot = "+";    
                }
                System.out.print("\t" + dot);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[] seq1 = {'t', 'h', 'i', 's', 'i', 's', 'a', 't', 'e', 's', 't'};
        char[] seq2 = {'t', 'h', 'i', 's', 'i', 's', 'a', 'b', 'i', 'g', 't', 'e', 's', 't'};
        printDotPlot(seq1, seq2);
    }

}
