package fabricabrinquedos;

public class FabricaPJ implements FabricaAbstrata{

    @Override
    public Boneco createContrato() {
        return new BonecoPJ();
    }

    @Override
    public Carrinho createProcuracao() {
        return new CarrinhoPJ();
    }
}