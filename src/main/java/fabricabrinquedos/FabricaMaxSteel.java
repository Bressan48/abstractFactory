package fabricabrinquedos;

public class FabricaPF implements FabricaAbstrata{

    @Override
    public Boneco createContrato() {
        return new BonecoPF();
    }

    @Override
    public Carrinho createProcuracao() {
        return new CarrinhoPF();
    }
}
