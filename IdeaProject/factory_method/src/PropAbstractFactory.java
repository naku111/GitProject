public class PropAbstractFactory implements Factory{
    @Override
    public Gongxing show() {
        return new PropAbstract();
    }
}
