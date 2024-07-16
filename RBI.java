abstract public class RBI {
    abstract public int ROI();
}

class SBI extends RBI{
    @Override
    public int ROI(){
        return 10;
    }
}
class AXIS extends RBI{
    @Override
    public int ROI(){
        return 1;
    }
}

class Driver{
    void main(){
        AXIS ax=new AXIS();
        System.out.println(ax.ROI());

        SBI sb=new SBI();
        System.out.println(sb.ROI());
    }
}