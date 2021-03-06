package br.com.fiap.beans;

public class ItemPedido {
 private Pedido pedido;
 private Produto produto;
 private double valorUnitario;
 private int qtde;
 
 
 public ItemPedido() {
	 super();
 }
 public ItemPedido(Pedido pedido, Produto produto, double valorUnitario, int qtde) {
	 super();
	 this.pedido = pedido;
	 this.produto = produto;
	 this.valorUnitario = valorUnitario;
	 this.qtde = qtde;
 }
 public Pedido getPedido() {
	 return pedido;
 }
 public void setPedido(Pedido pedido) {
	 this.pedido = pedido;
 }
 public Produto getProduto() {
	 return produto;
 }
 public void setProduto(Produto produto) {
	 this.produto = produto;
 }
 public double getValorUnitario() {
	 return valorUnitario;
 }
 public void setValorUnitario(double valorUnitario) {
	 this.valorUnitario = valorUnitario;
 }
 public int getQtde() {
	 return qtde;
 }
 public void setQtde(int qtde) {
	 this.qtde = qtde;
 }
 public String getTudo(){
	 return pedido.getTudo() + "\n" + produto.getTudo() + "\n" + valorUnitario +
			 "\n" + qtde;
 }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                tion" oid="A89FC924-7AB1-80EC-AF74-8A969FDB138A" otype="Relation" vid_source="180AFFC3-8FC2-D2B1-8C15-CD8D5366ED0B" vid_target="2794F8D7-A0A1-6B22-5E13-E3AB75A165C5">
<hideElementsInCurrentOnly>false</hideElementsInCurrentOnly>
<lineWidth>1</lineWidth>
<points>
<point x="290" y="96"/>
<point x="117" y="260"/>
</points>
</Connector>
<Connector class="oracle.dbtools.crest.swingui.logical.TVRelation" oid="DFAB0238-C9CF-536A-5A81-87AAC09E6717" otype="Relation" vid_source="180AFFC3-8FC2-D2B1-8C15-CD8D5366ED0B" vid_target="C0A90A8B-EBF7-3E65-0A25-B61A8D1EF7EB">
<hideElementsInCurrentOnly>false</hideElementsInCurrentOnly>
<lineWidth>1</lineWidth>
<points>
<point x="450" y="96"/>
<point x="629" y="251"/>
</points>
</Connector>
</connectors>
</Diagram>                                                                                                                                                                                                                                                                               olor>-1</diagramColor>
<display>false</display>
<notation>1</notation>
<objectViews>
<OView class="oracle.dbtools.crest.swingui.logical.TVEntity" oid="1CD07D0F-6B0D-A530-E594-517721009710" otype="Entity" vid="2794F8D7-A0A1-6B22-5E13-E3AB75A165C5">
<hideElementsInCurrentOnly>false</hideElementsInCurrentOnly>
<bounds x="32" y="260" width="170" height="110"/>
</OView>
<OView class="oracle.dbtools.crest.swingui.logical.TVEntity" oid="61DA632A-43DF-9B9B-6ACC-B3335644810C" otype="Entity" vid="C0A90A8B-EBF7-3E65-0A25-B61A8D1EF7EB">
<hideElementsInCurrentOnly>false</hideElementsInCurrentOnly>
<bounds x="544" y="251" width="170" height="110"/>
</OView>
<OView class="oracle.dbtools.crest.swingui.logical.TVEntity" oid="D9AC3650-A7FA-97D6-31B3-A215BE8CE849" otype="Entity" vid="180AFFC3-8FC2-D2B1-8C15-CD8D5366ED0B">
<hideElementsInCurrentOnly>false</hideElementsInCurrentOnly>
<bounds x="290" y="23" width="160" height="146"/>
</OView>
</objectViews>
<connectors>
<Connector class="oracle.dbtools.crest.swingui.logical.TVRelation" oid="A89FC924-7AB1-80EC-AF74-8A969FDB138A" otype="Relation" vid_source="180AFFC3-8FC2-D2B1-8C15-CD8D5366ED0B" vid_target="2794F8D7-A0A1-6B22-5E13-E3AB75A165C5">
<hideElementsInCurrentOnly>false</hideElementsInCurrentOnly>
<lineWidth>1</lineWidth>
<points>
<point x="290" y="96"/>
<point x="117" y="260"/>
</points>
</Connector>
<Connector class="oracle.dbtools.crest.swingui.logical.TVRelation" oid="DFAB0238-C9CF-536A-5A81-87AAC09E6717" otype="Relation" vid_source="180AFFC3-8FC2-D2B1-8C15-CD8D5366ED0B" v