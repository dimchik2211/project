public class SquareTripleProcessor {
    private SquareTriple obj;
    public SquareTripleProcessor(SquareTriple obj){
        this.obj = new SquareTriple(obj);
    }
    public double getGreatestRoot() throws SolutionEx{
        double[] rootArray = obj.rootSearch();
        if(rootArray.length == 0)throw new SolutionEx("No roots");
        else if(rootArray.length == 1)return rootArray[0];
        else return Math.max(rootArray[0],rootArray[1]);
    }

}
