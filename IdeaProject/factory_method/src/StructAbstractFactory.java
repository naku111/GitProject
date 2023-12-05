public class StructAbstractFactory implements Factory{
    @Override
    public Gongxing show() {
        return new StructAbstract();
    }
}
