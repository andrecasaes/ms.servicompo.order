package servicompo.com.br.msservices.Models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name="vw_ms_getorders")
@Table(name = "VW_MS_GETORDERS")
public class Orders   {
    
   // @Column(name = "CPF_CNPJ", nullable = false)
    private String CPF_CNPJ;
    @Id
    //@Column(name = "NumOS")
    private  String NumOS;
    //@Column(name = "NumeroSinistro", nullable = false)
    private String NumeroSinistro;
    //@Column(name = "Marca", nullable = true)
    private String Marca;
    //@Column(name = "Modelo", nullable = true)
    private String Modelo;
    //@Column(name = "Tipo", nullable = true)
    private String Tipo;
    //@Column(name = "SN", nullable = true)
    private String SN ;
    //@Column(name = "DataCri", nullable = true)
    private LocalDate DataCri ;
   // @Column(name = "Ststr", nullable = true)
    private String ststr;

    public Orders() {
    }

    public Orders(String CPF_CNPJ, String NumOS, String NumeroSinistro, String Marca, String Modelo, String Tipo, String SN, LocalDate DataCri, String ststr) {
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
  
    public LocalDate getDataCri() {
        return this.DataCri;
    }

    public void setDataCri(LocalDate DataCri) {
        this.DataCri = DataCri;
    }
  
    public String getStstr() {
        return this.ststr;
    }

    public void setStstr(String ststr) {
        this.ststr = ststr;
    }

    public Orders CPF_CNPJ(String CPF_CNPJ) {
        this.CPF_CNPJ = CPF_CNPJ;
        return this;
    }

    public Orders NumOS(String NumOS) {
        this.NumOS = NumOS;
        return this;
    }

    public Orders NumeroSinistro(String NumeroSinistro) {
        this.NumeroSinistro = NumeroSinistro;
        return this;
    }

    public Orders Marca(String Marca) {
        this.Marca = Marca;
        return this;
    }

    public Orders Modelo(String Modelo) {
        this.Modelo = Modelo;
        return this;
    }

    public Orders Tipo(String Tipo) {
        this.Tipo = Tipo;
        return this;
    }

    public Orders SN(String SN) {
        this.SN = SN;
        return this;
    }

    public Orders DataCri(LocalDate DataCri) {
        this.DataCri = DataCri;
        return this;
    }

    public Orders ststr(String ststr) {
        this.ststr = ststr;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Orders)) {
            return false;
        }
        Orders orders = (Orders) o;
        return Objects.equals(CPF_CNPJ, orders.CPF_CNPJ) && Objects.equals(NumOS, orders.NumOS) && Objects.equals(NumeroSinistro, orders.NumeroSinistro) && Objects.equals(Marca, orders.Marca) && Objects.equals(Modelo, orders.Modelo) && Objects.equals(Tipo, orders.Tipo) && Objects.equals(SN, orders.SN) && Objects.equals(DataCri, orders.DataCri) && Objects.equals(ststr, orders.ststr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CPF_CNPJ, NumOS, NumeroSinistro, Marca, Modelo, Tipo, SN, DataCri, ststr);
    }

    @Override
    public String toString() {
        return "{" +
            " CPF_CNPJ='" + getCPF_CNPJ() + "'" +
            ", NumOS='" + getNumOS() + "'" +
            ", NumeroSinistro='" + getNumeroSinistro() + "'" +
            ", Marca='" + getMarca() + "'" +
            ", Modelo='" + getModelo() + "'" +
            ", Tipo='" + getTipo() + "'" +
            ", SN='" + getSN() + "'" +
            ", DataCri='" + getDataCri() + "'" +
            ", ststr='" + getStstr() + "'" +
            "}";
    }
}