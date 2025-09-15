import WorkFive.WorkFive;
import WorkSix.WorkSix;

public class Controller {
    public void getWorkFive(){
        WorkFive workFive = new WorkFive();
        workFive.cycleFOR();
        workFive.cycleWhile();
        workFive.cycleDoWhile();
        workFive.factorial();
    }

    public void getWorkSix(){
        WorkSix workSix = new WorkSix();
        workSix.mass();
    }

}
