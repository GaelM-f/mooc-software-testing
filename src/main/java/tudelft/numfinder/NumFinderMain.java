package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        // this works
        // nf.find(new int[] {4, 25, 7, 9});

        // this crashes
        // nf.find(new int[] {4, 3, 2, 1});
        // nf.find(null);
        nf.find(new int[] {Integer.MAX_VALUE});

        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());
    }
}
