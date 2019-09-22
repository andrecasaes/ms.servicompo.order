package servicompo.com.br.msservices.Models;

import java.io.Serializable;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name="vw_ms_getorders")
@Table(name = "VW_MS_GETORDERS")
public class Order implements Serializable {
    
    // @Column(name = "CPF_CNPJ", nullable = false)

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "numos")
    private  String NumOS;
    @Column(name = "cpf_cnpj")
    private String CPF_CNPJ;
    @Column(name = "numerosinistro", nullable = false)
    private String NumeroSinistro;
    @Column(name = "marca", nullable = true)
    private String Marca;
    @Column(name = "modelo", nullable = true)
    private String Modelo;
    @Column(name = "tipo", nullable = true)
    private String Tipo;
    @Column(name = "sn", nullable = true)
    private String SN ;
    @Column(name = "datacri", nullable = true)
    private LocalDateTime DataCri ;
    @Column(name = "ststr", nullable = true)
    private String ststr;

    public Order() {
    }

    public Order(String CPF_CNPJ, String NumOS, String NumeroSinistro, String Marca, String Modelo, String Tipo, String SN, LocalDateTime DataCri, String ststr) {
        this.CPF_CNPJ = CPF_CNPJ;
        this.NumOS = NumOS;
        this.NumeroSinistro = NumeroSinistro;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Tipo = Tipo;
        this.SN = SN;
        this.DataCri = DataCri;
        this.ststr = ststr;
    }
   
    public String getCPF_CNPJ() {
        return this.CPF_CNPJ;
    }

    public void setCPF_CNPJ(String CPF_CNPJ) {
        this.CPF_CNPJ = CPF_CNPJ;
    }
   
    public String getNumOS() {
        return this.NumOS;
    }

    public void setNumOS(String NumOS) {
        this.NumOS = NumOS;
    }
   
    public String getNumeroSinistro() {
        return this.NumeroSinistro;
    }

    public void setNumeroSinistro(String NumeroSinistro) {
        this.NumeroSinistro = NumeroSinistro;
    }
    
    public String getMarca() {
        return this.Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    public String getModelo() {
        return this.Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    
    public String getTipo() {
        return this.Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    public String getSN() {
        return this.SN;
    }

    public void setSN(String SN) {
        this.SN = SN;
    }
  
    public LocalDateTime getDataCri() {
        return this.DataCri;
    }

    public void setDataCri(LocalDateTime DataCri) {
        this.DataCri = DataCri;
    }
  
    public String getStstr() {
        return this.ststr;
    }

    public void setStstr(String ststr) {
        this.ststr = ststr;
    }

    public Order CPF_CNPJ(String CPF_CNPJ) {
        this.CPF_CNPJ = CPF_CNPJ;
        return this;
    }

    public Order NumOS(String NumOS) {
        this.NumOS = NumOS;
        return this;
    }

    public Order NumeroSinistro(String NumeroSinistro) {
        this.NumeroSinistro = NumeroSinistro;
        return this;
    }

    public Order Marca(String Marca) {
        this.Marca = Marca;
        return this;
    }

    public Order Modelo(String Modelo) {
        this.Modelo = Modelo;
        return this;
    }

    public Order Tipo(String Tipo) {
        this.Tipo = Tipo;
        return this;
    }

    public Order SN(String SN) {
        this.SN = SN;
        return this;
    }

    public Order DataCri(LocalDateTime DataCri) {
        this.DataCri = DataCri;
        return this;
    }

    public Order ststr(String ststr) {
        this.ststr = ststr;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Order)) {
            return false;
        }
        Order order = (Order) o;
        return Objects.equals(CPF_CNPJ, order.CPF_CNPJ) && Objects.equals(NumOS, order.NumOS) && Objects.equals(NumeroSinistro, order.NumeroSinistro) && Objects.equals(Marca, order.Marca) && Objects.equals(Modelo, order.Modelo) && Objects.equals(Tipo, order.Tipo) && Objects.equals(SN, order.SN) && Objects.equals(DataCri, order.DataCri) && Objects.equals(ststr, order.ststr);
    }

@Override
    public int hashCode() {
       return Objects.hash(CPF_CNPJ, NumOS, NumeroSinistro, Marca, Modelo, Tipo, SN, DataCri, ststr);
    }

    @Override
    public String toString() {
        return "{" +
            " CF_CNPJ='" + getCPF_CNPJ() + "'" +
            ", NumOS='" + getNumOS() + "'" +
          ", NumeroSinistro='" + getNumeroSinistro() + "'" +
            ", Marca='" + getMarca() + "'" +
            ", Modelo='" + getModelo() + "" +
            ", Tipo='" + getTipo() + "'" +
           ", SN='" + getSN() + "'" +
           ", DataCri='" + getDataCri() + "'" +
            ", ststr='" + getStstr() + "'" +
            "}";
    }
}