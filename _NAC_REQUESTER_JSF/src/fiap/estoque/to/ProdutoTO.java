/**
 * ProdutoTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fiap.estoque.to;

public class ProdutoTO  implements java.io.Serializable {
    private java.lang.String campanha_promocional;

    private int cd_produto;

    private java.lang.String descricao;

    private double preco;

    private int quantidade;

    public ProdutoTO() {
    }

    public ProdutoTO(
           java.lang.String campanha_promocional,
           int cd_produto,
           java.lang.String descricao,
           double preco,
           int quantidade) {
           this.campanha_promocional = campanha_promocional;
           this.cd_produto = cd_produto;
           this.descricao = descricao;
           this.preco = preco;
           this.quantidade = quantidade;
    }


    /**
     * Gets the campanha_promocional value for this ProdutoTO.
     * 
     * @return campanha_promocional
     */
    public java.lang.String getCampanha_promocional() {
        return campanha_promocional;
    }


    /**
     * Sets the campanha_promocional value for this ProdutoTO.
     * 
     * @param campanha_promocional
     */
    public void setCampanha_promocional(java.lang.String campanha_promocional) {
        this.campanha_promocional = campanha_promocional;
    }


    /**
     * Gets the cd_produto value for this ProdutoTO.
     * 
     * @return cd_produto
     */
    public int getCd_produto() {
        return cd_produto;
    }


    /**
     * Sets the cd_produto value for this ProdutoTO.
     * 
     * @param cd_produto
     */
    public void setCd_produto(int cd_produto) {
        this.cd_produto = cd_produto;
    }


    /**
     * Gets the descricao value for this ProdutoTO.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this ProdutoTO.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the preco value for this ProdutoTO.
     * 
     * @return preco
     */
    public double getPreco() {
        return preco;
    }


    /**
     * Sets the preco value for this ProdutoTO.
     * 
     * @param preco
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }


    /**
     * Gets the quantidade value for this ProdutoTO.
     * 
     * @return quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }


    /**
     * Sets the quantidade value for this ProdutoTO.
     * 
     * @param quantidade
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProdutoTO)) return false;
        ProdutoTO other = (ProdutoTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campanha_promocional==null && other.getCampanha_promocional()==null) || 
             (this.campanha_promocional!=null &&
              this.campanha_promocional.equals(other.getCampanha_promocional()))) &&
            this.cd_produto == other.getCd_produto() &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            this.preco == other.getPreco() &&
            this.quantidade == other.getQuantidade();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCampanha_promocional() != null) {
            _hashCode += getCampanha_promocional().hashCode();
        }
        _hashCode += getCd_produto();
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        _hashCode += new Double(getPreco()).hashCode();
        _hashCode += getQuantidade();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProdutoTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://to.estoque.fiap", "ProdutoTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campanha_promocional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://to.estoque.fiap", "campanha_promocional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cd_produto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://to.estoque.fiap", "cd_produto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://to.estoque.fiap", "descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://to.estoque.fiap", "preco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://to.estoque.fiap", "quantidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
