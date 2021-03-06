package dev.luanfernandes.app.entity;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@NoArgsConstructor
@Embeddable
public class PedidosPK implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "NUMPEDIDO")
    private int codigo;

    @Column(name = "CATEGORIA")
    private String categoria;

    public PedidosPK(int codigo, String categoria) {
        this.codigo = codigo;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof PedidosPK) {
            PedidosPK pk = (PedidosPK) o;
            if (this.getCodigo() != pk.getCodigo()) {
                return false;
            }
            if (!this.getCategoria().equals(pk.getCategoria())) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getCategoria().hashCode() + this.getCodigo();
    }
}