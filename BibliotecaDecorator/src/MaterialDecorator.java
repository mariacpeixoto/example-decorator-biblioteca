
public abstract class MaterialDecorator implements Material {
    protected Material material;

    public MaterialDecorator(Material material) {
        this.material = material;
    }

    @Override
    public String getDescricao() {
        return material.getDescricao();
    }
}
