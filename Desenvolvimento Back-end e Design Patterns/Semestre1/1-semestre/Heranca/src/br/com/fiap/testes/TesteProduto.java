 ackage br.com.fiap.testes;

i port javax.swing.JOptionPane;
 
import br.com.fiap.beans.CD;
 mport br.com.fiap.beans.Livro; 
public class TesteProduto {
 
	/*
	 static String texto(St ing msg){
	   return JOptionPa e.showInputDialog(msg);
	  }
   static int inteiro (String ms ){
	   return Integer.parseInt JOptionPane.showInputDialog(msg );
	  }
	  objLivro.setAutor( exto("Digite o autor"));
	  ob Livro.setCodigo(inteiro("Digite o codigo"));
	  
	 
	 */
	 	
	public static void main(Str ng[] args) {
		String resposta = new String();
		resposta = J ptionPane.showInputDialog("Dese a preencer livro ? (sim/nao)"). oLowerCase();
		if(resposta.eq als("sim")){
			Livro objLivro = new Livro();
			objLivro.set otalPaginas(Integer.parseInt(JO tionPane.showInputDialog("Digit  o total de p�ginas: ")));
			 bjLivro.setAutor(JOptionPane.sh wInputDialog("Digite o nome do  utor: "));
			objLivro.setEdit ra(JOptionPane.showInputDialog( Digite o nome da editora: ")); 			objLivro.setDescricao(JOptio Pane.showInputDialog("Digite a  escri��o: "));
			objLivro.set alor(Double.parseDouble(JOption ane.showInputDialog("Digite o v lor: ")));
			objLivro.setCodi o(Integer.parseInt(JOptionPane. howInputDialog("Digite o c�digo  ")));
			JOptionPane.showMess geDialog(null, objLivro.getTudo ));
		}
		else{
			CD objCD   new CD();
			objCD.setTotalFa xas(Integer.parseInt(JOptionPan .showInputDialog("Digite o tota  de faixas: ")));
			objCD.set ancamento(Boolean.parseBoolean( OptionPane.showInputDialog("Ser  lan�ado?")));
			objCD.setArt sta(JOptionPane.showInputDialog "Digite o nome do artista: ")); 
			objCD.setDescricao(JOptionP ne.showInputDialog("Digite a de cri��o: "));
			objCD.setValor Double.parseDouble(JOptionPane. howInputDialog("Digite o valor: ")));
			objCD.setCodigo(Integ r.parseInt(JOptionPane.showInpu Dialog("Digite o c�digo: "))); 			JOptionPane.showMessageDialo (null, objCD.getTudo());
		}
 	//Produto objProduto = new Pro uto("Baralho", 555.5, 99);
		/ Pedido objPedido = new Pedido(1 , "vagner", 666.6);
		//ItemPe ido objItemPedido = new ItemPed do(objPedido, objProduto, 444.4  11);
		//System.out.println(o jItemPedido.getTudo());
		
	} 
}
                                                                                                                                                                                                                                                                                                                                                            .fiap.beans/Pedido,Produto,doub e,int/pedido,produto,valorUnita io,qtde/ ���� CD/0/ /br.com. iap.beans/         Livro/br. om.fiap.beans// ���� Pedido/b .com.fiap.beans// ���� #TesteP oduto/br.com.fiap.testes// ���  CD/br.com.fiap.beans//       Produto/br.com.fiap.beans// �� �  ItemPedido/br.com.fiap.beans / ����    -Object//TesteProdu o///br.com.fiap.testes/CC����  Produto//CD///br.com.fiap.beans CC     &Produto//Livro///br.co .fiap.beans/CC���� *Object//It mPedido///br.com.fiap.beans/CC ��� 'Object//Produto///br.com.f ap.beans/CC���� &Object//Pedid ///br.com.fiap.beans/CC����    /      q    	fieldDecl   p  methodRef  I 
methodDecl  �  ef  � constructorRef  A con tructorDecl  � typeDecl  
q  uperRef  H                                                                                                                                                                                                                                                                                     nymous Type Global" description "Promotes anonymous type to glo al level and replaces its refer nces" category="_R2coAPyuEeWsIe E8AeYIw"/>
  <commands xmi:id= _R2mZ8vyuEeWsIeCE8AeYIw" elemen Id="oracle.eclipse.tools.webtie .jsf.ui.refactor.facet.selectio .command" commandName="Facet Se ection" category="_R2coHPyuEeWs eCE8AeYIw"/>
  <commands xmi:i ="_R2mZ8_yuEeWsIeCE8AeYIw" elem ntId="org.eclipse.jdt.ui.edit.t xt.java.search.implementors.in. roject" commandName="Implemento s in Project" description="Sear NDEX VERSION 1.127+F:\FIAP\dese volvimento back end\1-semestre\ metadata\.plugins\org.eclipse.j t.core
3414683811.index
2292250 93.index
491469424.index
185975 54.index
2345470644.index
51467 96.index
3000975533.index
45233 869.index
4020602821.index
2899 65704.index
2526935410.index
19 3297441.index
1429456332.index
 233791618.index
3349413686.inde 
2690778029.index
2959957318.in ex
2744285192.index
279464321.i dex
3706135349.index
1887880100 index
2127704158.index
36186730 5.index
1870255979.index
       �� toLowerCase/0���� showInpu Dialog/1���� parseDouble/1���� equals/1���� setLancamento/1� �� setTotalPaginas/1���� show essageDialog/2����   " 	setQtde 1���� getTotalFaixas/0     se TotalFaixas/1     setPedido/1� �� 	getQtde/0���� 
setTotal/1�� � getValorUnitario/0���� setD scricao/1���� setTotalPaginas/ ���� 	getTudo/0     setVa orUnitario/1���� getTotalPagin s/0���� setNumero/1���� 
setVa or/1���� getPedido/0���� setL ncamento/1     getArtista/0     setCodigo/1���� main/1���� 	 etData/1���� 
getTotal/0���� s tArtista/1     	getData/0����  etNumero/0���� 
getValor/0����  getCodigo/0���� getProduto/0�� � 
setAutor/1���� setProduto/1 ��� getEditora/0���� isLancam nto/0     getDescricao/0���� 
 etAutor/0���� setEditora/1����   - c���� totalPaginas���� o jCD���� totalFaixas     
lanca ento     String     voi      Object    Dou le���� v���� Boolean���� br� �� javax���� CD���� Livro���  Produto     codigo      autor���� editora���� qtde���  objLivro���� JOptionPane���� valorUnitario���� Pedido����  fiap���� lang    pedido� �� com���� data���� boolean     beans���� artista     int     swing���� resposta�� � String[]���� valor     d uble     java    	de cricao     total���� numero ��� Integer���� produto����  ����    DPedido/3/ /br.com.fi p.beans/int,String,double/numer ,data,total/ ���� $TesteProdut /#/ /br.com.fiap.testes���� $I emPedido/0/ /br.com.fiap.beans  ���� CD/0/ /br.com.fiap.bea ���      /   �      
  ����    4org.eclipse.b3:org.eclipse. 3.p2.edit:zip:call:0.0.0��� >uckminster:org.eclipse.buckmi ster.jarprocessor:zip:call:1.0. ���?core:org.eclipse.core runtime.compatibility.auth:zip: all:3.0.0���*dltk:org.ecl pse.dltk.debug:zip:call:4.0.0 ��4ecf:org.eclipse.ecf.disc very.ui.edit:zip:call:3.0.0� �4gf:org.eclipse.egf.portfol o.task.jet:zip:call:1.0.0�� /mf:org.eclipse.emf.diffmerge gmf:zip:call:0.0.0��� %eda t.declaration.edit:zip:call:0.0 0��� 6facet.infra.browser. icore.examples.cnf:zip:call:0.0 0��� search.ecore.ui:zip: all:0.0.0���Dquinox:org.e lipse.equinox.p2.discovery.comp tibility:zip:call:1.0.0��� Egmf:org.eclipse.gmf.examples.r ntime.diagram.decorator:zip:cal :1.0.0���9yrex:org.eclips .gyrex.frameworklogadapter:zip: all:1.0.0���-jetty:org.ec ipse.jetty.webapp:zip:call:9.0. ���;st:org.eclipse.jst.ws axis2.consumption.core:zip:call 1.0.0���>ubula:org.eclips .jubula.toolkit.provider.swing: ip:call:1.0.0���9linuxtoo s:org.eclipse.linuxtools.man.co e:zip:call:1.0.0���3m2m:o g.eclipse.m2m.qvt.oml.emf.util: ip:call:3.0.0���9ylyn:org eclipse.mylyn.gerrit.dashboard. i:zip:call:2.0.0���8ocl:o g.eclipse.ocl.examples.codegen. sm5:zip:call:1.0.0���8omp :org.eclipse.oomph.workingsets. ditor:zip:call:1.0.0���Fp pyrus:org.eclipse.papyrus.infra gmfdiag.modelexplorer:zip:call: .0.0���((uml.diagram.commo .groups:zip:call:0.0.0���, textedit.state.xtext:zip:call:0 0.0���*tp:org.eclipse.ptp debug.ui:zip:call:5.0.0��� ,qvtd:org.eclipse.qvtd.codegen: ip:call:0.0.0���7rcptt:or .eclipse.rcptt.launching.ext.ui zip:call:2.0.0���7iena:or .eclipse.riena.sample.app.serve :zip:call:6.0.0���.scout: rg.eclipse.scout.nls.sdk:zip:ca l:4.0.0���/irius:org.ecli se.sirius.diagram:zip:call:1.0. ���:tardust:org.eclipse.s ardust.ide.wst.common:zip:call: .0.0���'tcf:org.eclipse.t f.core:zip:call:1.0.0���. i:org.eclipse.ui.editors.tests: ip:call:3.0.0���4wst:org. clipse.wst.common.frameworks:zi :call:1.0.0���.tp:org.ecl pse.wtp.releng.tools:zip:call:1 0.0���,acceleo:org.eclips .acceleo.engine:jar:3.5.0 ��� �/tf:org.eclipse.actf.visual zation.gui:jar:1.0.2 ���,b rt:org.eclipse.birt.chart.engin :jar:4.4.0 ���"(report.desi ner.ui.samples.ide:jar:4.4.0 � ��'pel:org.eclipse.bpel.runt mes:jar:1.0.1 ���9cdt:org. clipse.cdt.debug.ui.memory.trad tional:jar:1.2.1 ���Fdatat ols:org.eclipse.datatools.conne tivity.apache.derby.ui:jar:1.0.  ���)ltk:org.eclipse.dltk. onsole.ui:jar:4.0.0 ���"va idators.core:jar:4.0.0 ��� ecf:org.eclipse.ecf.presence.co lab.ui:jar:1.3.0 ���-gf:or .eclipse.egf.emf.pattern.base:j r:1.3.0 ���"it:org.eclipse egit.core:jar:2.2.0 ���.mf org.eclipse.emf.cdo.security.ui jar:4.3.100 ��� databindin .edit:jar:1.2.1 ��� )ecp.vi w.control.multireference:jar:1. .0 ���!ef.components:jar:1 3.0 ��� facet.custom.sdk.c re:jar:0.2.2 ���&2widgets.c lleditors.ecore.tests.samplemm: ar:1.0.0 ���  query2.string yntax.ui:jar:1.0.0 ���,qui ox:org.eclipse.equinox.console: ar:1.1.0 ���(p2.ui:jar:2.4 0 ���+gmf:org.eclipse.gmf. odegen.xtend:jar:1.0.0 ��� t:org.eclipse.gmt.modisco.infra browser.custom.examples.uml:jar 0.13.0 ���/raphiti:org.ecl pse.graphiti.pattern:jar:0.12.0 ���'iam:org.eclipse.iam.wt .core:jar:0.11.0 ���2jetty org.eclipse.jetty.websocket.com on:jar:9.2.9 ���#st:org.ec ipse.jst.j2ee:jar:1.1.302 ��  ws.cxf.creation.ui:jar:1.0.3 0 ���8ubula:org.eclipse.ju ula.toolkit.provider.html:jar:1 2.2 ���2libra:org.eclipse. ibra.warproducts.core:jar:0.2.2 ���1tk:org.eclipse.ltk.ui. efactoring.tests:jar:3.7.0 �� �+m2m:org.eclipse.m2m.atl.eng ne.vm:jar:3.5.0 ���Lodisco org.eclipse.modisco.java.compos tion.browser.customization:jar: .10.2 ���-ylyn:org.eclipse mylyn.commons.net:jar:3.12.0 � ��$github.ui:jar:3.4.0 �� $wikitext.textile.core:jar:2. .0 ���3ocl:org.eclipse.ocl examples.codegen.asm3:jar:2.0.0 ���3omph:org.eclipse.oomph preferences.editor:jar:1.1.0 � ��:papyrus:org.eclipse.papyr s.emf.facet.query.java:jar:1.0.  ���(!infra.gmfdiag.hyperli k:jar:1.0.0 ���.widgets:ja :1.1.0 ���(uml.diagram.seq ence:jar:1.1.0 ���,textedi .port.xtext:jar:1.0.0 ���9 rsistence:org.eclipse.persisten e.dbws.builder:jar:2.4.2 ��� 1tp:org.eclipse.ptp.pldt.opena c.fortran:jar:6.0.0 ���1qv d:org.eclipse.qvtd.xtext.qvtcor .ui:jar:0.12.0 ���2rcptt:o g.eclipse.rcptt.launching.ext.u :jar:2.0.0 ���8iena:org.ec ipse.riena.communication.publis er:jar:6.1.0 ���4se:org.ec ipse.rse.subsystems.shells.ssh: ar:2.1.400 ���-scout:org.e lipse.scout.rt.ui.swing:jar:4.0 0 ���/oa:org.eclipse.soa.s a.sca1_0.diagram:jar:2.3.0 �� �=tardust:org.eclipse.stardus .modeling.authorization:jar:3.0 0 ���+wtbot:org.eclipse.sw bot.junit4_x:jar:2.3.0 ��� tcf:org.eclipse.tcf.te.ui:jar:1 2.0 ���-ui:org.eclipse.ui. de.application:jar:1.0.400 �� �$wb:org.eclipse.wb.core.xml: ar:1.7.0 ���2st:org.eclips .wst.internet.monitor.ui:jar:1. .606 ��� xml.ui.tests:jar: .0.301 ���3xtext:org.eclip e.xtext.common.types.edit:jar:2 3.1 ��� (014020f2239e4dc312 c97a4cbbd31436975db34���' ab22d5f9e1f95e24e277788918e0891 a6c676���+'a1a2ca9c44e8a11 e23ccb96dc841289c955c2b���+ 'e6446d16179a8d818e4bbe405f64a3 f416fb8d���+ (12712f4ecf36b 5c88009897c96983b750b0f9a8�� �+'6bd63408f565e4509462557c5d6 2343dfe7700���+'b6d1d5b46b 5613f05203fbaaf00827caac7462� ��+ (207af557edd6b3bbe1785e550 2c55aa9a3ec406���+'4af4c11 209199499cd17016d9392ac1475ee06 ���+'84212e23fd4503f665a3da c5b164003ce1259f���+'cc875 8e76bf2cc6933808eedd86e0926b521 c���+ (30ca2892005de40e689a 37bf6434a3af8f70b35���+'55 c44bc862893fdc3f194921591e638e4 52c7���+'9e1e10c02d722c1f3 2ee230dd40e02bb4bfd68���+' 8c925e89a0a71fb966c308aa58d83b0 339dfa���+ (42742d264270743 db3e36f8bf2c659cff7683f9��� '690f0cbef9ab1d8d8de1798878d5e 3f53d7394���+'a448d94e5c87 6e7685d7e681c8999c88ecbc30�� �+'e8de0ebd8e22153b277f88beebd bd5bcf76a51���+ (52d59a32ea 5ba685a03ed943cbcd74e71d3be50 ��+'6eec102675ab22fb92ea0599 5ef59e6caa0d4f���+'bc60533 27f7dbc2c8a75a2aea007278a198302 ���+ (60ae59c5f9851533bd28e5 3963854c89450c447���+'490f adc31551f9c1a2091e7bd060ffb93b6 38���+'8d130bc5a2f4f7a7dad 16896b40f511868438a���+'d3 f2d965d6a3f2f3d248145c3818521b8 9352���+ (7116b3a4697fef42e 372b912debba5ed45a3033���+ 574f818872cd24ce6ed9916cb399aad 98fdf94���+'98ffc555769e43 0d22f54712fdbe8a38e61580��� 'df34e3c64b0675a3e566316bf3d61 d74270b2f���+ (827a92ad882c c88030b334ed824ee69cff7fd2e� �+'77ee9b1b386fcc8920934da2de 55b060dd05ae���+'b0e9b74c1 38fd4f0b0933bb404680faff9f394 ��+'f39a0e70631f36d203c69f56 b1ea872755cbc1���+ (93c592e 91fb67f13575f53ce4e519e54310214 ���+'7de548171afd392f2f6a6 2fa49c8cf763609bd���+'bf92 76402ff15f7ebb5c167b5af3edc757b a5���+'fe346f5f688bcfdf997 acd834f304482216b8c���+ (a3 d13583cf416b87b6f181d7c77b6e1f2 dcbf5���+'85af7a4110a1dbcf e0bbe95f195e19757ad476���+ c952407ecefccae4dc341b6d7738315 75b6956���+ (b10cecada55396 a387a01d3d60b24cce2398365�� +'4e8973787d6a235421e2386224a3 9886aede66���+'a2e0ebd5e44 85e78047ec336ba507791cbf6ad� �+'e80874b33616ea7e15d47bb6d4 fd87894223ad���+ (c34a78211 666b43570a926d02f0e69ccb92786c ���+'7bf1f5a9d5231609ff131f5 1a39a579e764dba���+'c40ad6 8008233f542f35253796ebece3d0f3b ���+ (d0a181275147de1ff3573 fc38b7e75ebf628124���+'528 d0313787d3ac0befa26eb6d794a3cad 4e3���+'9b9cc806bb0b4f6df4 c38edb80ec0ff02b4848���+'e 46bb024779a2ee01af9baa7ed7ee413 c5a05���+ (e3755501dbe90c00 4b9957f9d869095c0cbbc0c���+ '7526ee73f7150e21d93f071162388d 1b9a3d9f���+'c4963219e5f25 72da09ad0744f399df7d6cc05�� + (f09b7e4aaba51caa08d74bd3d06c bf2aa8b5b68���+'49a85ba629 6984b6131283342c1c8330307013� ��+'88bcbd51f0ced41a22ad68410 ef48c0b89af40���+'d0736354 130ef18518e9959fd7d54f0b92c398 ���+ 4org.eclipse.amp:org.ecl pse.amp.agf3d:zip:ovrd:0.0.0� ��';buckminster:org.eclipse.b ckminster.rmap.pde:zip:ovrd:1.0 0���Bdatatools:org.eclips .datatools.modelbase.sql.query: ip:ovrd:1.0.0���5ecf:org. clipse.ecf.discovery.ui.model:z p:ovrd:3.0.0���1mf:org.ec ipse.emf.cdo.transfer.ui:zip:ov d:4.0.0��� !emfstore.clien .ui:zip:ovrd:0.0.0��� que y2.core:zip:ovrd:1.0.0��� fx:org.eclipse.fx.ide.css.cssex .ui:zip:ovrd:2.0.0���<gra hiti:org.eclipse.graphiti.examp es.common:zip:ovrd:0.0.0��� 8jface:org.eclipse.jface.tests databinding:zip:ovrd:1.0.0�� �1ubula:org.eclipse.jubula.rc javafx:zip:ovrd:2.0.0���9 tk:org.eclipse.ltk.core.refacto ing.tests:zip:ovrd:3.0.0��� 0mylyn:org.eclipse.mylyn.githu .ui:zip:ovrd:2.0.0���+ocl org.eclipse.ocl.uml.edit:zip:ov d:5.0.0���8papyrus:org.ec ipse.papyrus.infra.filters:zip: vrd:1.0.0���(4uml.diagram. aletteconfiguration.edit:zip:ov d:0.0.0���6ersistence:org eclipse.persistence.dbws:zip:ov d:2.0.0���+rap:org.eclips .rap.examples:zip:ovrd:3.0.0� ��3iena:org.eclipse.riena.na igation.ui:zip:ovrd:6.0.0�� /scout:org.eclipse.scout.sdk. til:zip:ovrd:5.0.0���Atar ust:org.eclipse.stardust.ide.ws .server.tomcat:zip:ovrd:3.0.0 ��1tm:org.eclipse.tm.termin l.control:zip:ovrd:4.0.0��� *wst:org.eclipse.wst.html.ui:z p:ovrd:1.0.0���0xtext:org eclipse.xtext.xbase.lib:zip:ovr :2.0.0���Dbirt:org.eclips .birt.report.designer.ui.lib.ex lorer:zip:ovrm:4.0.0	���0c re:org.eclipse.core.expressions zip:ovrm:3.0.0	���<dltk:or .eclipse.dltk.tcl.activestatede ugger:zip:ovrm:5.0.0	���:e f:org.eclipse.egf.portfolio.ecl pse.build:zip:ovrm:1.0.0	��� .mf:org.eclipse.emf.ecp.edit.s t:zip:ovrm:1.0.0	��� (facet query.ocl.metamodel:zip:ovrm:0. .0	���4quinox:org.eclipse. quinox.concurrent:zip:ovrm:1.0. 	���;gmf:org.eclipse.gmf.r ntime.common.ui.action:zip:ovrm 1.0.0	���<jdt:org.eclipse. dt.groovy.core.tests.builder:zi :ovrm:3.0.0	���.st:org.ecl pse.jst.pagedesigner:zip:ovrm:1 0.0	���?linuxtools:org.ecl pse.linuxtools.changelog.core:z p:ovrm:2.0.0	���=modisco:o g.eclipse.modisco.jee.jsp.disco erer:zip:ovrm:0.0.0	���)ne 4j:org.eclipse.net4j.ui:zip:ovr :4.0.0	���Npapyrus:org.ecl pse.papyrus.customization.prope ties.generation:zip:ovrm:1.0.0	 ���((infra.viewpoints.iso420 0:zip:ovrm:1.0.0	���(*uml.t xtedit.property.xtext:zip:ovrm: .0.0	���-tp:org.eclipse.pt .remote.core:zip:ovrm:6.0.0	� �?rcptt:org.eclipse.rcptt.te la.recording.core.ecl:zip:ovrm: .0.0	���*scout:org.eclipse scout.net:zip:ovrm:5.0.0	��� Coa:org.eclipse.soa.sca.sca1_0 runtime.frascati.model:zip:ovrm 2.0.0	���1wtbot:org.eclips .swtbot.generator:zip:ovrm:2.0. 	���2virgo:org.eclipse.vir o.util.common:zip:ovrm:3.0.0	� ��,wst:org.eclipse.wst.xsl.x lan:zip:ovrm:1.0.0	���6amp org.eclipse.amp.amf.parameters. dit:zip:ovrp:0.0.0���5buc minster:org.eclipse.buckminster ui:zip:ovrp:1.0.0���Edata ools:org.eclipse.datatools.sqlt ols.debugger.core:zip:ovrp:1.0. ���5ecf:org.eclipse.ecf.p esence.collab.ui:zip:ovrp:1.0.0 ���%mf:org.eclipse.emf.cdo zip:ovrp:4.0.0��� $emfstor .examplemodel:zip:ovrp:0.0.0� �� search.common:zip:ovrp:0. .0���)fx:org.eclipse.fx.i e.l10n:zip:ovrp:2.0.0���/ yrex:org.eclipse.gyrex.admin.ui zip:ovrp:1.0.0���$jgit:or .eclipse.jgit:zip:ovrp:4.0.0� ��.ubula:org.eclipse.jubula. c.swt:zip:ovrp:3.0.0���0m e:org.eclipse.m2e.maven.runtime zip:ovrp:1.0.0���0ylyn:or .eclipse.mylyn.mft.gmf.ui:zip:o rp:0.0.0���/ocl:org.eclip e.ocl.xtext.markup:zip:ovrp:1.0 0���Gpapyrus:org.eclipse. apyrus.infra.gmfdiag.css.proper ies:zip:ovrp:1.0.0���(-uml diagram.stereotype.edition:zip: vrp:1.0.0���6hotran:org.e lipse.photran.cdtinterface:zip: vrp:8.0.0���&rap:org.ecli se.rap.rwt:zip:ovrp:2.0.0�� 0iena:org.eclipse.riena.ui.sw .rcp:zip:ovrp:6.0.0���1sc ut:org.eclipse.scout.svg.client zip:ovrp:4.0.0���Dtardust org.eclipse.stardust.modeling.c mmon.ui.jface:zip:ovrp:2.0.0� ��Ftracecompass:org.eclipse. racecompass.lttng2.control.ui:z p:ovrp:1.0.0���3wst:org.e lipse.wst.jsdt.debug.rhino:zip: vrp:1.0.0���"xwt:org.ecli se.xwt:zip:ovrp:0.0.0���? irt:org.eclipse.birt.report.eng ne.emitter.odt:zip:selfc:4.0.0 ���3core:org.eclipse.core.t sts.harness:zip:selfc:3.0.0� �,dltk:org.eclipse.dltk.tcl. i:zip:selfc:4.0.0���0egit org.eclipse.egit.gitflow.ui:zip selfc:4.0.0���>mf:org.ecl pse.emf.ecp.view.categorization swt:zip:selfc:1.0.0��� >fa et.widgets.celleditors.ecore.te ts.samplemm:zip:selfc:0.0.0� �5quinox:org.eclipse.equinox jmx.client:zip:selfc:1.0.0�� �Agmf:org.eclipse.gmf.runtime diagram.ui.properties:zip:selfc 1.0.0���,jdt:org.eclipse. dt.ui.tests:zip:selfc:3.0.0� �4st:org.eclipse.jst.validat on.sample:zip:selfc:1.0.0�� <linuxtools:org.eclipse.linux ools.lttng.core:zip:selfc:1.0.0 ���3mylyn:org.eclipse.myly .builds.core:zip:selfc:1.0.0� ��;objectteams:org.eclipse.o jectteams.otdt.ui:zip:selfc:2.0 0���Apapyrus:org.eclipse. apyrus.emf.facet.efacet.edit:zi :selfc:1.0.0���((sysml.dia ram.parametric:zip:selfc:1.0.0 ���(-uml.textedit.transition xtext:zip:selfc:1.0.0���5 p:org.eclipse.ptp.rm.jaxb.contr l.ui:zip:selfc:2.0.0���9r ptt:org.eclipse.rcptt.verificat ons.log:zip:selfc:2.0.0��� ;scout:org.eclipse.scout.rt.ext nsion.client:zip:selfc:5.0.0� ��4phinx:org.eclipse.sphinx. mf.editors:zip:selfc:0.0.0�� �7tcf:org.eclipse.tcf.te.runt me.services:zip:selfc:1.0.0� �1wb:org.eclipse.wb.rcp.Grou Layout:zip:selfc:1.0.0��� xtend:org.eclipse.xtend.backend compiler:zip:selfc:1.0.0��� +amp:org.eclipse.amp.axf.ide:z p:selfm:0.0.0���5cdt:org. clipse.cdt.core.lrparser.xlc:zi :selfm:5.0.0���?datatools org.eclipse.datatools.sqltools. esult:zip:selfm:1.0.0���A cf:org.eclipse.ecf.examples.rem teservices.hello:zip:selfm:4.0. ���-mf:org.eclipse.emf.cd .server:zip:selfm:4.0.0��� $eef.codegen.launcher:zip:selfm 1.0.0��� -facet.widgets.ta le.metamodel:zip:selfm:0.0.0� ��4quinox:org.eclipse.equino .p2.engine:zip:selfm:2.0.0�� �5gmf:org.eclipse.gmf.runtime draw2d.ui:zip:selfm:1.0.0�� .jetty:org.eclipse.jetty.clie t:zip:selfm:8.0.0���2st:o g.eclipse.jst.ws.jaxws.dom.ui:z p:selfm:1.0.0���;linuxtoo s:org.eclipse.linuxtools.lttng. ni:zip:selfm:1.0.0���3mod sco:org.eclipse.modisco.omg.smm zip:selfm:0.0.0���<object eams:org.eclipse.objectteams.ot t.apt:zip:selfm:2.0.0���O apyrus:org.eclipse.papyrus.cust mization.properties.generation: ip:selfm:0.0.0���('infra.s rvices.semantic:zip:selfm:1.0.0 ���(3uml.textedit.collabora ionuse.xtext:zip:selfm:0.0.0� ��0tp:org.eclipse.ptp.etfw.f edback:zip:selfm:5.0.0��� rap:org.eclipse.rap.ui.workbenc :zip:selfm:2.0.0���1iena: rg.eclipse.riena.ui.ridgets:zip selfm:6.0.0���9scout:org. clipse.scout.sdk.compatibility: ip:selfm:4.0.0���Htardust org.eclipse.stardust.ide.thirdp rty.runtime.j2ee:zip:selfm:2.0. ���(team:org.eclipse.team ui:zip:selfm:3.0.0���8wst org.eclipse.wst.common.moduleco e.ui:zip:selfm:1.0.0���1x ext:org.eclipse.xtext.purexbase zip:selfm:2.0.0���
amp.ax .sd���bpmn2.editor�� core.databinding.beans�� dltk.console���ecf.pr vider.jmdns���mf.cdo.exp orer���ecp.view.categori ation.swt���facet.custom sdk.core���	search.ui� �quinox.p2.metadata��� gmf.examples.runtime.ui.pde� ��	yrex.jobs���
jgit.i log���	ubula.app��� linuxtools.callgraph���m m.atl.profiler.emfvm���y yn.docs.intent.core���oc .examples.debug.vm���"pap rus.emf.facet.custom.metamodel ���infra.tools���um .textedit.state.xtext.ui��� tp.rdt.managedbuilder.gnu.ui ���rcptt.core.launching� ��emote.ui���scout.r .server.jms���phinx.xten xpand���tcf.te.tcf.files stem.ui��� ui.tests.views properties.tabbed���wst. sdt.core.tests.compiler��� xtext.common.types.ui���                                                                                                                                                                                                                                                                                                                                                                                                                                                                  .eclipse.egit.ui.PushHeadToGerr t" commandName="Push Current He d to Gerrit" category="_R2coM_y EeWsIeCE8AeYIw"/>
  <commands  mi:id="_R2maU_yuEeWsIeCE8AeYIw" elementId="org.eclipse.jdt.ui.e it.text.java.show.outline" comm ndName="Quick Outline" descript on="Show the quick outline for  he editor input" category="_R2c JvyuEeWsIeCE8AeYIw"/>
  <comma ds xmi:id="_R2maVPyuEeWsIeCE8Ae Iw" elementId="org.eclipse.jst. sp.ui.refactor.move" commandNam ="Move" description="Move a Jav  Element to another package" ca egory="_R2coAPyuEeWsIeCE8AeYIw" >
  <commands xmi:id="_R2maVfy EeWsIeCE8AeYIw" elementId="org. clipse.jdt.ui.edit.text.java.go o.next.member" commandName="Go  o Next Member" description="Mov  the caret to the next member o  the compilation unit" category "_R2coJvyuEeWsIeCE8AeYIw"/>
   commands xmi:id="_R2maVvyuEeWsI CE8AeYIw" elementId="org.eclips .ui.project.rebuildProject" com andName="Rebuild Project" descr ption="Rebuild the selected pro ects" category="_R2coMPyuEeWsIe E8AeYIw"/>
  <commands xmi:id= _R2maV_yuEeWsIeCE8AeYIw" elemen Id="org.jboss.ide.eclipse.archi es.ui.buildArchiveCommand" comm ndName="Build Project Archives" description="This will build th  project archives for the selec ed project" category="_R2coDvyu eWsIeCE8AeYIw"/>
  <commands x i:id="_R2maWPyuEeWsIeCE8AeYIw"  lementId="org.eclipse.datatools enablement.sybase.asa.schemaobj cteditor.examples.tableschemaed tor.pastecolumn" commandName="P ste" category="_R2coLPyuEeWsIeC 8AeYIw"/>
  <commands xmi:id=" R2maWfyuEeWsIeCE8AeYIw" element ���      �"   �      
 jre:jr :zip:call:1.0.0   @org.eclips .acceleo:org.eclipse.acceleo.co mon.ui:zip:call:3.0.0.:zip call:3.0.0+patibility.ui:z p:call:3.0.05:zip:call:3.0 0(engine:zip:call:3.0.0 )xamples:zip:call:3.0.0(i e.ui:zip:call:3.0.0(model. dit:zip:call:3.0.0-:zip:ca l:3.0.0(parser:zip:call:3. .0)rofiler.edit:zip:call:3 0.05or:zip:call:3.0.00 :zip:call:3.0.0(query.ide. i:zip:call:3.0.0-:zip:call 3.0.0(!traceability.model:z p:call:3.0.04:zip:call:3.0 0(ui.interpreter:zip:call: .0.0-tf:org.eclipse.actf.a .tts.msp:zip:call:1.0.0)sa i:zip:call:1.0.0%voice:zip call:1.0.0"core:zip:call:1 0.0"+examples.adesigner.eva .html:zip:call:1.0.0:odf:z p:call:1.0.0"mediator:zip: all:1.0.0#&odel.dom.dombyco .flash:zip:call:1.0.04:zip call:1.0.0,html:zip:call:1 0.0,odf:zip:call:1.0.0 flash.proxy:zip:call:1.0.0 :zip:call:1.0.0(ui.editor .ie:zip:call:1.0.03ooo.ini ializer:zip:call:1.0.06:zi :call:1.0.0*:zip:call:1.0. "ui:zip:call:1.0.0#ti .httpproxy:zip:call:1.0.0' ocab:zip:call:1.0.0'win32. omclutch:zip:call:1.0.0,:z p:call:1.0.0"'visualization blind.html:zip:call:1.0.06 dfbyhtml:zip:call:1.0.05:z p:call:1.0.00!engines.blind html:zip:call:1.0.0=:zip:c ll:1.0.08lowvision:zip:cal :1.0.08voicebrowser:zip:ca l:1.0.01val:zip:call:1.0.0 0flash:zip:call:1.0.00 ui:zip:call:1.0.00lowvisio :zip:call:1.0.00presentati n:zip:call:1.0.00ui.pdt:zi :call:1.0.03report:zip:cal :1.0.0/:zip:call:1.0.0 +ether:org.eclipse.aether.api:z p:call:1.0.0&connector.bas c:zip:call:1.0.0&impl:zip: all:1.0.0&spi:zip:call:1.0 0&transport.file:zip:call: .0.00http:zip:call:1.0.0 &util:zip:call:1.0.0-jdt org.eclipse.ajdt.pde.build:zip: all:2.0.08malgam:org.eclip e.amalgam.discovery.core:zip:ca l:1.0.02modeling:zip:call: .0.02ui:zip:call:1.0.0 *p:org.eclipse.amp.agf.chart:zi :call:0.0.0%ore:zip:call:0 0.0$ide:zip:call:0.0.0 zest.ide:zip:call:0.0.0(: ip:call:0.0.0#3d:zip:call: .0.0!ll:zip:call:0.0.0 mf.abase.edit:zip:call:0.0.0 .or:zip:call:0.0.0*ui:zi :call:0.0.0):zip:call:0.0. %core.edit:zip:call:0.0.0 .or:zip:call:0.0.0):zip call:0.0.0$data.edit:zip:c ll:0.0.0-or:zip:call:0.0.0 (:zip:call:0.0.0$gen.a cape:zip:call:0.0.0(escape zip:call:0.0.0)xtras:zip:c ll:0.0.0(ide:zip:call:0.0. ':zip:call:0.0.0$ide. scape:zip:call:0.0.0':zip: all:0.0.0$parameters.edit: ip:call:0.0.03or:zip:call: .0.0/ui:zip:call:0.0.0 :zip:call:0.0.0$sd.edit:z p:call:0.0.0+or:zip:call:0 0.0'gen:zip:call:0.0.0 :zip:call:0.0.0$testing.e it:zip:call:0.0.00or:zip:c ll:0.0.0,ui:zip:call:0.0.0 +:zip:call:0.0.0!xf.co e:zip:call:0.0.0$ide:zip:c ll:0.0.0$sd:zip:call:0.0.0 $views:zip:call:0.0.0  scape.amf.ide:zip:call:0.0.0 (scape.agf3d:zip:call:0.0.0 .chart:zip:call:0.0.0-:zi :call:0.0.0'ide:zip:call:0 0.0'runtime:zip:call:0.0.0 'testing.ide:zip:call:0.0.0 &nt:org.eclipse.ant.core:zi :call:3.0.0 launching:zip: all:1.0.0 tests.core:zip:c ll:3.0.0&ui:zip:call:3.0.0  ui:zip:call:3.0.00b3: rg.eclipse.b3.aggregator.edit:z p:call:0.0.0-or:zip:call:0 0.0*ngine.maven:zip:call:0 0.0/:zip:call:0.0.0)l gacy.ui:zip:call:0.0.0/:zi :call:0.0.0(:zip:call:0.0. cli:zip:call:0.0.0p .edit:zip:call:0.0.0!maven zip:call:0.0.0 :zip:call:0 0.0util:zip:call:0.0.0 :irt:org.eclipse.birt.chart.de ice.extension:zip:call:4.0.0 /pdf:zip:call:4.0.0/svg:z p:call:4.0.00wt:zip:call:4 0.0(engine.extension:zip:c ll:4.0.0.:zip:call:4.0.0 )xamples.core:zip:call:4.0.0 0:zip:call:4.0.0(report tem.ui:zip:call:4.0.02:zip call:4.0.0(ui.extension:zi :call:4.0.0*:zip:call:4.0. #"ore.script.function:zip:c ll:4.0.0'ui:zip:call:4.0.0 &:zip:call:4.0.0"data. ggregation:zip:call:4.0.0' da.mongodb.ui:zip:call:4.0.0 2:zip:call:4.0.0+pojo.ui: ip:call:4.0.0/:zip:call:4. .0&:zip:call:4.0.0""re ort.data.adapter:zip:call:4.0.0 .bidi.utils.ui:zip:call:4.0 08:zip:call:4.0.0.oda excel.ui:zip:call:4.0.07:z p:call:4.0.02hive.ui:zip:c ll:4.0.06:zip:call:4.0.0 2&jdbc.dbprofile.sampledb:zip: all:4.0.0Aui:zip:call:4.0. @:zip:call:4.0.07ui:z p:call:4.0.06:zip:call:4.0 02sampledb.ui:zip:call:4.0 0::zip:call:4.0.02xml zip:call:4.0.0*ebug.core:z p:call:4.0.0/ui:zip:call:4 0.0+signer.core:zip:call:4 0.02ui.cubebuilder:zip:cal :4.0.05data:zip:call:4.0.0 5editor.script:zip:call:4.0 0<xml.wtp:zip:call:4.0.0 ;s.schematic:zip:call:4.0.0 <:zip:call:4.0.05ide:zip call:4.0.05lib.explorer:zi :call:4.0.08:zip:call:4.0. 5preview.web:zip:call:4.0. 5samples.ide:zip:call:4.0. <view:zip:call:4.0.05 iews:zip:call:4.0.04:zip:c ll:4.0.0)$engine.dataextrac ion:zip:call:4.0.00"emitter config.docx:zip:call:4.0.0? excel:zip:call:4.0.0?html: ip:call:4.0.0?odp:zip:call 4.0.0As:zip:call:4.0.0 t:zip:call:4.0.0?pdf:zip: all:4.0.0@ostscript:zip:ca l:4.0.0@pt:zip:call:4.0.0 Bx:zip:call:4.0.0?wpml: ip:call:4.0.0>:zip:call:4. .08docx:zip:call:4.0.0 html:zip:call:4.0.08odp:z p:call:4.0.0:s:zip:call:4. .0:t:zip:call:4.0.08p f:zip:call:4.0.09ostscript zip:call:4.0.09pt:zip:call 4.0.0;x:zip:call:4.0.0 rototype.excel:zip:call:4.0.0 8wpml:zip:call:4.0.00od :zip:call:4.0.01oxml:zip:c ll:4.0.00 script.javascript zip:call:4.0.0/:zip:call:4 0.0)!item.crosstab.core:zip call:4.0.07ui:zip:call:4.0 0) model.adapter.oda:zip:ca l:4.0.0.:zip:call:4.0.0 )viewer:zip:call:4.0.0;pe :org.eclipse.bpel.apache.ode.de loy.model:zip:call:1.0.04u :zip:call:1.0.0-runtime:zi :call:1.0.0"cheatsheet:zip call:1.0.0#ommon.model:zip call:1.0.0)ui:zip:call:1.0 0)wsdl:zip:call:1.0.0" jboss.riftsaw.runtime:zip:call: .0.0"model:zip:call:1.0.0 "runtimes:zip:call:1.0.0 ui:zip:call:1.0.0"validat r:zip:call:1.0.0"wsil.mode :zip:call:1.0.0"xpath10:zi :call:1.0.0)mn2:org.eclips .bpmn2.edit:zip:call:0.0.02 1.0.0(or:zip:call:0.0.0 41.0.0$modeler.core:zip:c ll:1.0.0,"examples.customta k:zip:call:1.0.05dynamic:z p:call:1.0.0,help:zip:call 1.0.0,"runtime.jboss.jbpm5: ip:call:1.0.0,ui:zip:call: .0.0,wsil:zip:call:1.0.0 #:zip:call:0.0.0-1.0.0 5uckminster:org.eclipse.buckm nster.ant:zip:call:1.0.00c dline:zip:call:1.0.01ore:z p:call:1.0.01vs:zip:call:1 0.00download:zip:call:1.0. 0executor:zip:call:1.0.0 0fetcher:zip:call:1.0.00 eneric.ui:zip:call:1.0.07: ip:call:1.0.01it:zip:call: .0.00installer:zip:call:1. .00jarprocessor:zip:call:1 0.01dt:zip:call:1.0.01 unit:zip:call:1.0.00maven: ip:call:1.0.01odel.common. dit:zip:call:1.0.0<:zip:ca l:1.0.01spec.edit:zip:call 1.0.0:or:zip:call:1.0.0 5:zip:call:1.0.00osgi.fil er:zip:call:1.0.00pde:zip: all:1.0.00rmap.edit:zip:ca l:1.0.09or:zip:call:1.0.0 5maven.edit:zip:call:1.0.0 ::zip:call:1.0.05pde.edi :zip:call:1.0.08:zip:call: .0.06sf.edit:zip:call:1.0. 8:zip:call:1.0.04:zip call:1.0.01untime:zip:call 1.0.00sax:zip:call:1.0.0 1ubclipse:zip:call:1.0.03 version:zip:call:1.0.08ve: ip:call:1.0.00team.psf:zip call:1.0.04:zip:call:1.0.0 0'ui.dependency.visualizer:z p:call:1.0.02:zip:call:1.0 0/cdt:org.eclipse.cdt.ardu no.core:zip:call:1.0.0(ui: ip:call:1.0.0!utotools.cor :zip:call:1.0.0*ui:zip:cal :1.0.0 build.crossgcc:zip: all:1.0.0  codan.checkers.u :zip:call:1.0.0;3.0.0. :zip:call:1.0.083.0.0' ore.cxx:zip:call:1.0.083.0 0*:zip:call:2.0.043.0 0&ui.cxx:zip:call:3.0.0 (:zip:call:2.0.023.0.0 "re.aix:zip:call:5.0.0%li ux:zip:call:5.0.0&rparser. lc:zip:call:5.0.0-:zip:cal :5.0.0%macosx:zip:call:5.0 0%native:zip:call:5.0.0 %parser.upc:zip:call:5.0.0 solaris:zip:call:5.0.0%wi 32:zip:call:5.0.0$:zip:cal :5.0.0  debug.application:z p:call:1.0.0&core:zip:call 7.0.0&gdbjtag.core:zip:cal :8.0.0.ui:zip:call:7.0.0 &mi.core:zip:call:7.0.0) i:zip:call:6.0.0&&ui.memory floatingpoint:zip:call:1.0.0 0memorybrowser:zip:call:1.0.0 0search:zip:call:1.0.00 raditional:zip:call:1.0.03 sport:zip:call:2.0.0(:zip: all:7.0.0!,sf.gdb.multicore isualizer.ui:zip:call:1.0.0 ui:zip:call:2.0.0':zip:ca l:4.0.0$ui:zip:call:2.0.0 #:zip:call:2.0.0 errorp rsers.xlc:zip:call:5.0.0!!x mples.dsf.pda.ui:zip:call:2.0.0 0:zip:call:2.0.0,:zip: all:2.0.0 gdb.ui:zip:call: .0.0#:zip:call:7.0.0  aunch.remote:zip:call:2.0.0 :zip:call:7.0.0 make.core zip:call:7.0.0%ui:zip:call 7.0.0%xlc.core:zip:call:5. .0"#nagedbuilder.bupc.ui:zi :call:1.0.0/core:zip:call: .0.0/gnu.ui:zip:call:8.0.0 /llvm.ui:zip:call:1.0.0 ui:zip:call:8.0.0/xlc.ui: ip:call:6.0.01upc.ui:zip:c ll:1.0.0!sw.build:zip:call 1.0.0!ylyn.ui:zip:call:3.0 0 native.serial:zip:call:1 0.0 qt.core:zip:call:1.0.0 #ui:zip:call:1.0.0 rem te.core:zip:call:1.0.0  tes srunner.boost:zip:call:7.0.0 ,gtest:zip:call:7.0.0,qtt st:zip:call:7.0.0+:zip:cal :7.0.0 ui:zip:call:5.0.0  visualizer.core:zip:call:1.0 0+ui:zip:call:1.0.0.o pare:org.eclipse.compare.core:z p:call:3.0.0(examples.xml: ip:call:3.0.00:zip:call:3. .0(tests:zip:call:3.0.0 (win32:zip:call:1.0.0':zi :call:3.0.0<ntribution:org eclipse.contribution.xref.core: ip:call:2.0.07ui:zip:call: .0.0+re:org.eclipse.core.c mmands:zip:call:3.0.0$nten type:zip:call:3.0.0" databi ding.beans:zip:call:1.0.0. bservable:zip:call:1.0.0.p operty:zip:call:1.0.0-:zip call:1.0.0" expressions.tes s:zip:call:3.0.0-:zip:call 3.0.0$ternaltools:zip:call 1.0.0" filebuffers.tests:zi :call:3.0.0-:zip:call:3.0. &system.java7:zip:call:1.0 0,:zip:call:1.0.0"job :zip:call:3.0.0"net:zip:ca l:1.0.0"resources.jmx:zip: all:1.0.0+:zip:call:3.0.0 #(untime.compatibility.auth:z p:call:3.0.08registry:zip: all:3.0.07:zip:call:3.0.0 ):zip:call:3.0.0"tests. arness:zip:call:3.0.0(net: ip:call:1.0.0(resources:zi :call:3.0.0)untime:zip:cal :3.0.0"variables:zip:call: .0.0Kdatatools:org.eclipse datatools.connectivity.apache.d rby.ui:zip:call:1.0.0E:zip call:1.0.09console.profile zip:call:1.0.09db.generic. i:zip:call:1.0.0C:zip:call 1.0.09oda.consumer:zip:cal :3.0.0=design.ui:zip:call: .0.0C:zip:call:3.0.0= latfile.ui:zip:call:3.0.0E zip:call:3.0.0=profile:zip call:3.0.0=template.ui:zip call:3.0.0<:zip:call:3.0.0 9sqm.core.ui:zip:call:1.0.0 A:zip:call:1.0.0=serve .ui:zip:call:1.0.09ui.dse: ip:call:1.0.0<templates:zi :call:1.0.0;:zip:call:1.0. 8:zip:call:1.0.0,#enab ement.hsqldb.ui:zip:call:1.0.0 =:zip:call:1.0.07!ibm.db .iseries.ui:zip:call:1.0.0F :zip:call:1.0.0?luw.ui:zip call:1.0.0B:zip:call:1.0.0 ?zseries.ui:zip:call:1.0.0 F:zip:call:1.0.0>:zip:c ll:1.0.0;informix.ui:zip:c ll:1.0.0C:zip:call:1.0.0 ;ui:zip:call:1.0.0::zip: all:1.0.08ngres.ui:zip:cal :1.0.0=:zip:call:1.0.0 jdt.classpath:zip:call:1.0.0 7 msft.sqlserver.ui:zip:call:1 0.0E:zip:call:1.0.08y ql.ui:zip:call:1.0.0<:zip: all:1.0.07oda.ws.ui:zip:ca l:1.0.0=:zip:call:1.0.0 ;xml.ui:zip:call:1.0.0>:z p:call:1.0.08racle.ui:zip: all:1.0.0=:zip:call:1.0.0 7postgresql.ui:zip:call:1.0. A:zip:call:1.0.07sap. axdb.ui:zip:call:1.0.0@:zi :call:1.0.08qlite.ui:zip:c ll:1.0.0=:zip:call:1.0.0 8ybase.asa.models:zip:call:1. .0B*schemaobjecteditor.exam les:zip:call:2.0.0Bui:zip: all:1.0.0A:zip:call:1.0.0 @e.models:zip:call:1.0.0 ui:zip:call:1.0.0A:zip:ca l:1.0.0>models:zip:call:1. .0>ui:zip:call:1.0.0= zip:call:1.0.0,help:zip:ca l:1.0.0,%modelbase.dbdefini ion:zip:call:1.0.07erby:zi :call:1.0.06sql.edit:zip:c ll:1.0.0:query.edit:zip:ca l:1.0.0?:zip:call:1.0.0 :xml.query:zip:call:1.0.09 :zip:call:1.0.0,!sqltools.c mmon.ui:zip:call:1.0.05dat .core:zip:call:1.0.0:ui:zi :call:1.0.06b.derby.ui:zip call:1.0.0=:zip:call:1.0.0 8generic.ui:zip:call:1.0.0 ?:zip:call:1.0.06dlgen. i:zip:call:1.0.06ebugger.c re.ui:zip:call:1.0.0B:zip: all:1.0.05editor.core.ui:z p:call:1.0.0@:zip:call:1.0 05 parsers.sql.lexer:zip:ca l:1.0.0Aquery:zip:call:1.0 0Axml.query:zip:call:1.0.0 @:zip:call:1.0.06lan:z p:call:1.0.05result.ui:zip call:1.0.0;:zip:call:1.0.0 6outineeditor.ui:zip:call:1 0.0B:zip:call:1.0.05*s hemaobjecteditor.ui.pages:zip:c ll:1.0.0J:zip:call:1.0.0 G:zip:call:1.0.06ql.ui:z p:call:1.0.08:zip:call:1.0 08builder:zip:call:1.0.0 8editor:zip:call:1.0.08s rapbook:zip:call:1.0.05tab edataeditor:zip:call:1.0.0 ebug:org.eclipse.debug.core:zip call:3.0.0$examples.core:z p:call:1.0.0-ui:zip:call:1 0.0$tests:zip:call:3.0.0 $ui:zip:call:3.0.0.ltk:o g.eclipse.dltk.console.ui:zip:c ll:4.0.065.0.0):zip:c ll:4.0.035.0.0$re.ind x.sql.h2:zip:call:4.0.0=5. .00:zip:call:4.0.0:5. .0'manipulation:zip:call:4 0.0=5.0.0&:zip:call:4 0.005.0.0"debug.ui:zi :call:4.0.045.0.0':zi :call:4.0.015.0.0"for atter:zip:call:4.0.055.0.0 "itcl.core:zip:call:4.0.0 55.0.0'ui:zip:call:4.0.0 35.0.0"launching:zip:c ll:4.0.055.0.0#ogcons le.ui:zip:call:4.0.095.0.0 ,:zip:call:4.0.065.0.0 "mylyn:zip:call:4.0.01 .0.0"rse.core:zip:call:4.0 045.0.0&ui:zip:call:4 0.025.0.0##uby.abstrac debugger:zip:call:4.0.0A5. .0(!ctivestatedebugger:zip: all:4.0.0D5.0.0'basic ebugger:zip:call:4.0.0>5.0 0'core:zip:call:4.0.05 5.0.0'debug.ui:zip:call:4. .095.0.0,:zip:call:4. .065.0.0'fastdebugger zip:call:4.0.0=5.0.0( rmatter:zip:call:4.0.0:5.0 0'launching:zip:call:4.0.0 :5.0.0'testing:zip:cal :4.0.085.0.0'ui:zip:c ll:4.0.035.0.0"ssh.co e:zip:call:4.0.045.0.0 &tcl.activestatedebugger:zip:ca l:4.0.0C5.0.0&core:zi :call:4.0.045.0.0&deb g.ui:zip:call:4.0.085.0.0 +:zip:call:4.0.055.0.0 &formatter:zip:call:4.0.0 95.0.0&launching:zip:call 4.0.095.0.0&parser:zi :call:4.0.065.0.0&tcl hecker:zip:call:4.0.0:5.0. 'esting.tcltest:zip:call:4 0.0?5.0.0-:zip:call:4 0.075.0.0&ui:zip:call 4.0.025.0.0&validator :zip:call:4.0.0:5.0.0# esting:zip:call:4.0.035.0. "ui:zip:call:4.0.0.5. .0"validators.core:zip:cal :4.0.0;5.0.0-external hecker:zip:call:4.0.0F5.0. -ui:zip:call:4.0.095. .0"xotcl.core:zip:call:4.0 065.0.0(testing.xouni :zip:call:4.0.0@5.0.0( ui:zip:call:4.0.045.0.0 'raw2d:org.eclipse.draw2d:zip: all:3.0.0-3d:org.eclipse.d aw3d.geometry:zip:call:0.0.0 'raphics3d:zip:call:0.0.0& ui:zip:call:0.0.0%:zip:cal :0.0.0,store:org.eclipse.d tore.core:zip:call:3.0.0&e tra:zip:call:2.0.0.e4:org. clipse.e4.core.commands:zip:cal :0.0.0%ntexts:zip:call:1.0 0#di.extensions:zip:call:0 0.0%:zip:call:1.0.0#s rvices:zip:call:1.0.052.0. emf.xpath:zip:call:0.0.0 tools.compat:zip:call:4.0.0 ���   4 �  br/com/fiap/test s/TesteProduto  java/lang/O ject <init> ()V Code
  	    LineNumberTable LocalV riableTable this !Lbr/com/fi p/testes/TesteProduto; main  ([Ljava/lang/String;)V  jav /lang/String
  	  !Deseja p eencer livro ? (sim/nao)
     javax/swing/JOptionPane    showInputDialog &(Ljava/lang Object;)Ljava/lang/String;
      toLowerCase ()Ljava/la g/String;   sim
  " # $  quals (Ljava/lang/Object;)Z   br/com/fiap/beans/Livro
 % 	  ) Digite o total de páginas  
 + - , java/lang/Integer   / parseInt (Ljava/lang/Str ng;)I
 % 1 2 3 setTotalPagin s (I)V 5 Digite o nome do  utor: 
 % 7 8 9 setAutor ( java/lang/String;)V ; Digite o nome da editora: 
 % = > 9  setEditora @ Digite a descri �ão: 
 % B C 9 setDescricao  E Digite o valor: 
 G I H  java/lang/Double J K parseDo ble (Ljava/lang/String;)D
 %   N O setValor (D)V Q Di ite o código: 
 % S T 3 	set odigo
 % V W  getTudo
  Y Z [ showMessageDialog )(Ljav /awt/Component;Ljava/lang/Objec ;)V ] br/com/fiap/beans/CD
   	 ` Digite o total de faixa : 
 \ b c 3 setTotalFaixas   Será lançado?
 g i h ja a/lang/Boolean j k parseBool an (Ljava/lang/String;)Z
 \ m  n o setLancamento (Z)V q Digite o nome do artista: 
 \   t 9 
setArtista
 \ B
 \ M
 \ S
 \ V args [Ljava/lang/Str ng; resposta Ljava/lang/Str ng; objLivro Lbr/com/fiap/b ans/Livro; objCD Lbr/com/fi p/beans/CD; StackMapTable 
S urceFile TesteProduto.java !                /     *  �    
                    	      h     �� Y  L� � L+� !� U� %Y� 'M, � � *� 0,4� � 6,:� � <,?� � A,D� � F� L,P� � *� R,� U� X� U� \Y� ^M,_� � *� a,d� � f� l,p� � r,?� � u,D�   F� v,P� � *� w,� x� X�        V           "  .     @   I ! U " a # i $ l & t '   ( � ) � * � + � , � - � 4         � y z    � { |  " G } ~   t J  �  �    � l � Q  �    �                                      �M�H�H M�H�     .          �M�H�H M�H     . l o g    ������������  ���� OG~1        �M�H�H  �>�H       ROFILES   =M�H�H M�H      r k s   �� �������������  ���� i n i t i  �a l i z e r   M a  NITIA~1    �@M�H�H AM�H�3                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                �M�H�H M�H�     .          �M�H�H M�H�     w r i t e  	. l o c k     ���� RITE~1 LOC  �,M�H�H  -M�H       0      FDT n<M�H�H @FjH!    0      FDX ,=M�H�H @FjH!    0      TIS KAM�H�H @FjH�!    0      TII |AM�H�H @FjH�!    0      FRQ �AM�H�H  @FjH       0      NRM dCM�H�H @FjH�!    0      FNM �EM�H�H @FjH!    s e g m e  n t s _ 1     ���� EGMEN~1     �]M�H�H @FjH �    EGMENTSGEN �cM�H�H @FjH!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ackage br.com.fiap.testes;

i port javax.swing.JOptionPane;
 
import br.com.fiap.beans.CD;
 mport br.com.fiap.beans.ItemPed do;
import br.com.fiap.beans.L vro;
import br.com.fiap.beans. edido;
import br.com.fiap.bean .Produto;

public class Teste roduto {
	
	/*
	 static Stri g texto(String msg){
	   retur  JOptionPane.showInputDialog(ms );
	  }
	  static int inteiro (String msg){
	   return Integ r.parseInt(JOptionPane.showInpu Dialog(msg));
	  }
	  objLivr .setAutor(texto("Digite o autor ));
	  objLivro.setCodigo(inte ro("Digite o codigo"));
	  
	 
	 */
	
	
	public static vo d main(String[] args) {
		Stri g resposta = new String();
		r sposta = JOptionPane.showInputD alog("Deseja preencer livro ? ( im/nao)").toLowerCase();
		if( esposta.equals("sim")){
			Liv o objLivro = new Livro();
			o jLivro.setTotalPaginas(Integer. arseInt(JOptionPane.showInputDi log("Digite o total de p�ginas: ")));
			objLivro.setAutor(JOp ionPane.showInputDialog("Digite o nome do autor: "));
			objLi ro.setEditora(JOptionPane.showI putDialog("Digite o nome da edi ora: "));
			objLivro.setDescr cao(JOptionPane.showInputDialog "Digite a descri��o: "));
			o jLivro.setValor(Double.parseDou le(JOptionPane.showInputDialog( Digite o valor: ")));
			objLi ro.setCodigo(Integer.parseInt(J ptionPane.showInputDialog("Digi e o c�digo: ")));
			JOptionPa e.showMessageDialog(null, objLi ro.getTudo());
		}
		else{
	 	CD objCD = new CD();
			objCD setTotalFaixas(Integer.parseInt JOptionPane.showInputDialog("Di ite o total de faixas: ")));
	 	objCD.setLancamento(Boolean.pa seBoolean(JOptionPane.showInput ialog("Ser� lan�ado?")));
			o jCD.setArtista(JOptionPane.show nputDialog("Digite o nome do ar ista: "));
			objCD.setDescric o(JOptionPane.showInputDialog(" igite a descri��o: "));
			obj D.setValor(Double.parseDouble(J ptionPane.showInputDialog("Digi e o valor: ")));
			objCD.setC digo(Integer.parseInt(JOptionPa e.showInputDialog("Digite o c�d go: ")));
			JOptionPane.showM ssageDialog(null, objCD.getTudo ));
		}
		//Produto objProdut  = new Produto("Baralho", 555.5  99);
		//Pedido objPedido = n w Pedido(15, "vagner", 666.6); 		//ItemPedido objItemPedido =  ew ItemPedido(objPedido, objPro uto, 444.4, 11);
		//System.ou .println(objItemPedido.getTudo( );
	}
}
                                                                                                                                                                                                                                                     eDouble/1���� equals/1���� 
pa seInt/1���� toLowerCase/0����  setArtista/1���� setLancamento 1���� parseBoolean/1���� show essageDialog/2����   " setProd to/1���� getDescricao/0���� 
g tTotal/0���� 
getValor/0���� 	g tTudo/0     setLancamento 1     	setQtde/1���� 	getData/0 ��� setEditora/1���� setArtis a/1     getTotalPaginas/0����  setCodigo/1���� setTotalPagina /1���� getProduto/0���� getVa orUnitario/0���� setPedido/1�� � 	getQtde/0���� getTotalFaixa /0     isLancamento/0     set alorUnitario/1���� getEditora/ ���� setNumero/1���� 
setAutor 1���� setDescricao/1���� 	setD ta/1���� 
setTotal/1���� getCo igo/0���� setTotalFaixas/1     
setValor/1���� main/1���� ge Artista/0     getPedido/0����  getNumero/0���� 
getAutor/0����   0 
lancamento     totalFaixa      editora���� c���� d���� Double���� Object    bo lean     codigo     Produto     com���� v���� valorU itario���� lang    total ��� numero���� resposta����  wing���� String[]���� double     void     qtde�� � 	objPedido���� produto����  ata���� Integer���� fiap����  br���� valor     JOptionPan ���� Boolean���� totalPaginas ��� objCD���� java    L vro���� String     
Item edido���� CD���� 	descricao      beans���� artista     aut r���� int     pedido���� 
objProduto���� objLivro����  avax���� Pedido       Liv o/0���� Pedido/3���� ItemPedi o/4���� Object/0    CD/0 ��� 	Produto/3     	Produto/      String/0����    wCD/6/ clipse.preferences.version=1
o g.eclipse.m2e.discovery.pref.pr jects=
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   IM�H�H M�H�     .          IM�H�H M�H�     w r i t e  	. l o c k     ���� RITE~1 LOC  +M�H�H  ,M�H       0      FDT Y<M�H�H @FjH�!    0      FDX )=M�H�H @FjH�!    0      TIS AM�H�H @FjH�!    0      TII zAM�H�H @FjH�!    0      FRQ �AM�H�H  @FjH       0      NRM �CM�H�H @FjH�!    0      FNM �EM�H�H @FjH�!    s e g m e  n t s _ 1     ���� EGMEN~1     qbM�H�H @FjH  �    EGMENTSGEN  dM�H�H @FjH"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                �tM�H�H uM�H�     .          �tM�H�H uM�H(      r y   ���� �������������  ���� p r o f i  �l e R e g i   s t  ROFIL~1    muM�H�H vM�H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                �tM�H�H uM�H�     .          �tM�H�H uM�H%      ILESETS   vM�H�H wM�H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 w�K�H�H �K�H      .          w�K�H�H �K�H�     . c l a s  �s p a t h     ���� LASSP~1     �K�H�H 0W�H-   . p r o j  ~e c t   ����  ���� ROJEC~1     J�K�H�H 0W�H   . s e t t  Hi n g s   ��  ���� ETTIN~1    L�K�H�H bK�H     IN        S�K�H�H bK�H     RC        o�K�H�H bK�H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ?xml version="1.0" encoding="UT -8"?>
<classpath>
	<classpath ntry kind="src" path="src"/>
	 classpathentry kind="con" path= org.eclipse.jdt.launching.JRE_C NTAINER/org.eclipse.jdt.interna .debug.ui.launcher.StandardVMTy e/JavaSE-1.8"/>
	<classpathent y kind="output" path="bin"/>
< classpath>
                                                                                                                                                                                                                    ava.search.read.access.in.proje t" commandName="Read Access in  roject" description="Search for read references to the selected element in the enclosing projec " category="_R2coMvyuEeWsIeCE8A YIw"/>
  <commands xmi:id="_R2 bEfyuEeWsIeCE8AeYIw" elementId= org.eclipse.mylyn.context.ui.co mands.attachment.retrieveContex " commandName="Retrieve Context Attachment" category="_R2coB_yu eWsIeCE8AeYIw"/>
  <commands x i:id="_R2mbEvyuEeWsIeCE8AeYIw"  lementId="org.eclipse.ui.edit.t xt.toggleOverwrite" commandName "Toggle Overwrite" description= Toggle overwrite mode" category "_R2coBvyuEeWsIeCE8AeYIw"/>
   commands xmi:id="_R2mbE_yuEeWsI CE8AeYIw" elementId="org.eclips .jdt.ui.edit.text.java.pull.up" commandName="Pull Up" descripti n="Move members to a superclass  category="_R2coLfyuEeWsIeCE8Ae Iw"/>
  <commands xmi:id="_R2m FPyuEeWsIeCE8AeYIw" elementId=" rg.eclipse.ui.edit.text.folding collapse_all" commandName="Coll pse All" description="Collapses all folded regions" category="_ 2coBvyuEeWsIeCE8AeYIw"/>
  <co mands xmi:id="_R2mbFfyuEeWsIeCE AeYIw" elementId="org.eclipse.w t.jsdt.ui.edit.text.java.surrou d.with.try.catch" commandName=" urround with try/catch Block" d scription="Surround the selecte  text with a try/catch block" c tegory="_R2coCPyuEeWsIeCE8AeYIw />
  <commands xmi:id="_R2mbFv uEeWsIeCE8AeYIw" elementId="org eclipse.mylyn.tasks.ui.command. efreshRepositoryTasks" commandN me="Synchronize Changed" catego y="_R2coHPyuEeWsIeCE8AeYIw"/>
  <commands xmi:id="_R2mbF_yuEeW IeCE8AeYIw" elementId="org.ecli ?xml version="1.0" encoding="UT -8"?>
<projectDescription>
	< ame>Heranca</name>
	<comment>< comment>
	<projects>
	</proje ts>
	<buildSpec>
		<buildComm nd>
			<name>org.eclipse.jdt.c re.javabuilder</name>
			<argu ents>
			</arguments>
		</bui dCommand>
	</buildSpec>
	<nat res>
		<nature>org.eclipse.jdt core.javanature</nature>
	</na ures>
</projectDescription>
                                                                                                                                  commands>
  <commands xmi:id=" R2mbGvyuEeWsIeCE8AeYIw" element d="org.eclipse.debug.ui.command .closeRendering" commandName="C ose Rendering" description="Clo e the selected rendering." cate ory="_R2coEfyuEeWsIeCE8AeYIw"/> 
  <commands xmi:id="_R2mbG_yuE WsIeCE8AeYIw" elementId="org.ec ipse.egit.ui.RepositoriesViewOp nInEditor" commandName="Open in Editor" category="_R2coM_yuEeWs eCE8AeYIw"/>
  <commands xmi:i ="_R2mbHPyuEeWsIeCE8AeYIw" elem ntId="org.eclipse.wst.jsdt.ui.e it.text.java.introduce.paramete " commandName="Introduce Parame er" description="Introduce a ne  function parameter based on th  selected expression" category= _R2coHfyuEeWsIeCE8AeYIw"/>
  < ommands xmi:id="_R2mbHfyuEeWsIe E8AeYIw" elementId="org.eclipse egit.ui.team.submodule.update"  ommandName="Update Submodule" c tegory="_R2coM_yuEeWsIeCE8AeYIw />
  <commands xmi:id="_R2mbHv uEeWsIeCE8AeYIw" elementId="org eclipse.debug.ui.commands.Profi eLast" commandName="Profile" de cription="Launch in profile mod " category="_R2coEfyuEeWsIeCE8A YIw"/>
  <commands xmi:id="_R2 bH_yuEeWsIeCE8AeYIw" elementId= org.eclipse.egit.ui.team.Pull"  ommandName="Pull" category="_R2 oM_yuEeWsIeCE8AeYIw"/>
  <comm nds xmi:id="_R2mbIPyuEeWsIeCE8A YIw" elementId="org.eclipse.wst jsdt.ui.TypeHierarchy" commandN me="JavaScript Type Hierarchy"  escription="Show the Type Hiera chy view" category="_R2coH_yuEe sIeCE8AeYIw"/>
  <commands xmi id="_R2mbIfyuEeWsIeCE8AeYIw" el mentId="org.eclipse.ui.edit.tex .swap.mark" commandName="Swap M rk" description="Swap the mark             L�K�H�H �K�H     .          L�K�H�H �K�H      d t . c o  }r e . p r e   f s  o r g . e  }c l i p s e   . j  RGECL~1PRE  O�K�H�H 0W�HV                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   clipse.preferences.version=1
o g.eclipse.jdt.core.compiler.cod gen.inlineJsrBytecode=enabled
 rg.eclipse.jdt.core.compiler.co egen.targetPlatform=1.8
org.ec ipse.jdt.core.compiler.codegen. nusedLocal=preserve
org.eclips .jdt.core.compiler.compliance=1 8
org.eclipse.jdt.core.compile .debug.lineNumber=generate
org eclipse.jdt.core.compiler.debug localVariable=generate
org.ecl pse.jdt.core.compiler.debug.sou ceFile=generate
org.eclipse.jd .core.compiler.problem.assertId ntifier=error
org.eclipse.jdt. ore.compiler.problem.enumIdenti ier=error
org.eclipse.jdt.core compiler.source=1.8
                                                                                                                                                                                                                                                                                                                                                                                                                                           e code for the EMF models in th  workspace" category="_R2coLvyu eWsIeCE8AeYIw"/>
  <commands x i:id="_R2mbMPyuEeWsIeCE8AeYIw"  lementId="org.eclipse.wst.jsdt. i.generate.javadoc" commandName "Generate JSDoc" description="G nerates JSDoc for a selectable  et of JavaScript resources" cat gory="_R2coMPyuEeWsIeCE8AeYIw"/ 
  <commands xmi:id="_R2mbMfyu eWsIeCE8AeYIw" elementId="org.j oss.tools.jmx.ui.navigate.refre h" commandName="Refresh" descri tion="Refreshes the tree" categ ry="_R2coJvyuEeWsIeCE8AeYIw"/>   <commands xmi:id="_R2mbMvyuEe sIeCE8AeYIw" elementId="org.ecl pse.egit.ui.team.stash.drop" co mandName="Delete Stashed Commit .." category="_R2coM_yuEeWsIeCE AeYIw"/>
  <commands xmi:id="_ 2mbM_yuEeWsIeCE8AeYIw" elementI ="org.eclipse.debug.ui.DebugPer pective" commandName="Debug" de cription="Open the debug perspe tive" category="_R2coNfyuEeWsIe E8AeYIw"/>
  <commands xmi:id= _R2mbNPyuEeWsIeCE8AeYIw" elemen Id="org.eclipse.egit.ui.history RenameBranch" commandName="Rena e Branch..." category="_R2coHPy            S�K�H�H �K�H     .          S�K�H�H �K�H      R         U�K�H�H bK�H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                U�K�H�H �K�H     .          U�K�H�H �K�H     OM        X�K�H�H bK�H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                X�K�H�H �K�H     .          X�K�H�H �K�H     IAP       Z�K�H�H bK�H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                Z�K�H�H �K�H     .          Z�K�H�H �K�H     EANS      \�K�H�H bK�H	     ESTES     j�K�H�H bK�H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                \�K�H�H �K�H	     .          \�K�H�H �K�H     C D . c l  �a s s   ����  ���� D05EC~1CLA  ^�K�H�H J�H
�   a s s   �� ������������  ���� I t e m P  e d i d o .   c l  TEMPE~1CLA  a�K�H�H J�H   L i v r o  �. c l a s s     �� IVRO~1 CLA  c�K�H�H J�H]   P e d i d  �o . c l a s   s    EDIDO~1CLA  e�K�H�H J�H�   P r o d u  �t o . c l a   s s  RODUT~1CLA  g�K�H�H J�H>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ���   4 L  br/com/fiap/bean /CD  br/com/fiap/beans/Prod to totalFaixas I 
lancamen o Z artista Ljava/lang/St ing; <init> +(Ljava/lang/Str ng;DIIZLjava/lang/String;)V C de
     (Ljava/lang/Stri g;DI)V	    	    	    	 
 LineNumberTable LocalV riableTable this Lbr/com/fi p/beans/CD; d v D codig  ()V
  !   getTotalFaix s ()I setTotalFaixas (I)V  isLancamento ()Z setLanca ento (Z)V 
getArtista ()Lj va/lang/String; 
setArtista  Ljava/lang/String;)V getTudo 0 java/lang/StringBuilder
    . +
 4 6 5 java/lang/Strin  7 8 valueOf &(Ljava/lang/O ject;)Ljava/lang/String;
 / :   -
 / < = > append (I)Ljav /lang/StringBuilder; @ 

 /   = C -(Ljava/lang/String;)Lja a/lang/StringBuilder;
 / E = F  (Z)Ljava/lang/StringBuilder;
 / H I + toString 
SourceFil  CD.java !                  	 
   	        �      *+(� *� *� *� �           	  
          H             
                             	 
         /     *�  �                          " #     /      *� �                         $ %     >     *  �       
                          & '     /     *� �                          ( )     >      *� �       
                             +     /     *� �                          , -     >     *+� �       
    #  $                	 
   . +     g     1� /Y � 1� 3� 9*� � ;?� A*� � D?� A*� � A� G�           &    & ( - &        1      J    K                                                                                                                                                                                                                                                                                                                                                                                            ���   4 T  br/com/fiap/bean /ItemPedido  java/lang/Obje t pedido Lbr/com/fiap/beans Pedido; produto Lbr/com/fia /beans/Produto; valorUnitario  D qtde I <init> :(Lbr/ om/fiap/beans/Pedido;Lbr/com/fi p/beans/Produto;DI)V Code
      ()V	    	        	 
	     LineNumbe Table LocalVariableTable th s Lbr/com/fiap/beans/ItemPedi o; 	getPedido ()Lbr/com/fiap beans/Pedido; 	setPedido (Lb /com/fiap/beans/Pedido;)V 
get roduto ()Lbr/com/fiap/beans/P oduto; 
setProduto (Lbr/com/ iap/beans/Produto;)V getValor nitario ()D setValorUnitari  (D)V getQtde ()I setQt e (I)V getTudo ()Ljava/la g/String; 2 java/lang/String uilder
 4 6 5 br/com/fiap/be ns/Pedido / 0
 8 : 9 java/l ng/String ; < valueOf &(Lja a/lang/Object;)Ljava/lang/Strin ;
 1 >  ? (Ljava/lang/Strin ;)V A 

 1 C D E append  (Ljava/lang/String;)Ljava/lang/ tringBuilder;
 G 6 H br/com/ iap/beans/Produto
 1 J D K ( )Ljava/lang/StringBuilder;
 1 M  D N (I)Ljava/lang/StringBuil er;
 1 P Q 0 toString 
Sour eFile ItemPedido.java !                 	 
                �     *� *+  *,� *)� *� �           	  
 	           4                        	 
               3     *� �       
                                  *� �                         ! "     >     *+� �       
                          # $     /     *� �                          % &      >     *+� �       
                            ' (     /     *� �                         ) *     >     *'� �       
    "  #                	 
   + ,     /     *� �           %               - .     >      *� �       
    (  )                     / 0      v     <� 1Y*� � 3� 7� =@  B*� � F� B@� B*� � I@� B*� � L� O�           ,  - %   1 / 8 ,        <      R    S                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            e" description="Mark as Deploya le" category="_R2coDPyuEeWsIeCE AeYIw"/>
  <commands xmi:id="_ 2mbfPyuEeWsIeCE8AeYIw" elementI ="org.tigris.subversion.subclip e.ui.revert" commandName="Rever " category="_R2coAvyuEeWsIeCE8A YIw"/>
  <commands xmi:id="_R2 bffyuEeWsIeCE8AeYIw" elementId= org.eclipse.mylyn.tasks.ui.view ource.command" commandName="Vie  Unformatted Text" category="_R coCfyuEeWsIeCE8AeYIw"/>
  <com ands xmi:id="_R2mbfvyuEeWsIeCE8 eYIw" elementId="org.eclipse.ui edit.text.moveLineDown" command ame="Move Lines Down" descripti n="Moves the selected lines dow " category="_R2coBvyuEeWsIeCE8A YIw"/>
  <commands xmi:id="_R2 bf_yuEeWsIeCE8AeYIw" elementId= org.eclipse.jst.j2ee.internal.u .deploy" commandName="Prepare f r Deployment" description="Prep re for Deployment" category="_R coO_yuEeWsIeCE8AeYIw"/>
  <com ands xmi:id="_R2mbgPyuEeWsIeCE8 eYIw" elementId="org.eclipse.ws .jsdt.ui.SourceView" commandNam ="JavaScript Declaration" descr ption="Show the Declaration vie " category="_R2coH_yuEeWsIeCE8A YIw"/>
  <commands xmi:id="_R2 bgfyuEeWsIeCE8AeYIw" elementId= org.eclipse.equinox.p2.ui.sdk.u date" commandName="Check for Up ates" category="_R2coHPyuEeWsIe E8AeYIw"/>
  <commands xmi:id= _R2mbgvyuEeWsIeCE8AeYIw" elemen Id="org.eclipse.pde.ui.searchTa getRepositories" commandName="A d Artifact to Target Platform"  escription="Add an artifact to  our target platform" category=" R2coHPyuEeWsIeCE8AeYIw">
    < arameters xmi:id="_R2mbg_yuEeWs eCE8AeYIw" elementId="org.eclip e.pde.ui.searchTargetRepositori ���   4 F  br/com/fiap/bean /Livro  br/com/fiap/beans/P oduto totalPaginas I auto  Ljava/lang/String; editora  <init> <(ILjava/lang/String; java/lang/String;Ljava/lang/Str ng;DI)V Code
   
  (Lja a/lang/String;DI)V	    	    	   	  LineNumberTa le LocalVariableTable this Lbr/com/fiap/beans/Livro; d v D c ()V
    
  ge Tudo ()Ljava/lang/String; $ java/lang/StringBuilder
  &   "
 ( * ) java/lang/String   , valueOf &(Ljava/lang/Obje t;)Ljava/lang/String;
 # . 
 /  (Ljava/lang/String;)V 1 

 # 3 4 5 append -(Ljava/lang String;)Ljava/lang/StringBuilde ;
 # 7 4 8 (I)Ljava/lang/Str ngBuilder;
 # : ; " toString  getTotalPaginas ()I setTo alPaginas (I)V getAutor s tAutor 
getEditora 
setEditor  
SourceFile 
Livro.java !                  	    	   
      �     *� * � *,� *-� �           
             H                        	                             3     *� �       
                    ! "     l     6� #Y*� %� '� -0� 2*� � 60� 2*� � 20� 2*  � 2� 9�                2         6      < =     /     *� �                         > ?     >     *� �       
                            @ "     /     *� �                         A /     >     *+� �       
    "  #                    B "     /      � �           %               C /     >     *+� �       
    (  )                	    D    E                                                                                                                                                                                                                                                                                                                                                                                                                                    ���   4 @  br/com/fiap/bean /Pedido  java/lang/Object  numero I data Ljava/lang/ tring; total D <init> ( Ljava/lang/String;D)V Code
     ()V	    	     	   	 
 LineNumberTable  ocalVariableTable this Lbr/ om/fiap/beans/Pedido; 	getNume o ()I 	setNumero (I)V ge Data ()Ljava/lang/String; s tData (Ljava/lang/String;)V  getTotal ()D setTotal (D)  getTudo ) java/lang/Strin Builder
 + - , java/lang/Str ng . / valueOf (D)Ljava/la g/String;
 ( 1  " 3 

 ( 5  6 7 append -(Ljava/lang/Str ng;)Ljava/lang/StringBuilder;
   9 6 : (I)Ljava/lang/StringB ilder;
 ( < =   toString 
S urceFile Pedido.java !                  	 
   	         l     *� *� *,� * � �             	 	 
         *                         	 
         3     *� �       
                          /     *� �                                      *� �       
                                   /     *� �                         ! "     >     *+� �       
                          # $     /     *� �                          % &     >     *'�         
       !                 	 
   '       T      *� (Y*� � *� 02� 4*� �  2� 4*� � 8� ;�                    *      >    ?                                                                                                    rtype" commandName="Use Superty e Where Possible" description=" hange occurrences of a type to  se a supertype instead" categor ="_R2coLfyuEeWsIeCE8AeYIw"/>
  <commands xmi:id="_R2mblPyuEeWs eCE8AeYIw" elementId="org.eclip e.mylyn.tasks.ui.command.markTa kUnread" commandName="Mark Task Unread" category="_R2coCfyuEeWs eCE8AeYIw"/>
  <commands xmi:i ="_R2mblfyuEeWsIeCE8AeYIw" elem ntId="org.eclipse.search.ui.per ormTextSearchFile" commandName= Find Text in File" description= Searches the files in the file  ���   4 C  br/com/fiap/bean /Produto  java/lang/Object 	descricao Ljava/lang/String;  valor D codigo I <ini > (Ljava/lang/String;DI)V C de
     ()V	    	    	   	 
 LineNumberTa le LocalVariableTable this Lbr/com/fiap/beans/Produto;  Ljava/lang/String;)V getTudo ()Ljava/lang/String;  java lang/StringBuilder
 ! # " ja a/lang/String $ % valueOf & Ljava/lang/Object;)Ljava/lang/S ring;
  '   ) 

  + ,   append -(Ljava/lang/String; Ljava/lang/StringBuilder;
  / , 0 (D)Ljava/lang/StringBuild r;
  2 , 3 (I)Ljava/lang/St ingBuilder;
  5 6  toStrin  getDescricao setDescricao getValor ()D setValor (D V 	getCodigo ()I 	setCodigo  (I)V 
SourceFile Produto.j va !                   
   
        m     *�  *+� *(� *� �             	 	 
        *                        	 
         F     
*� *+�  �              	         
       
           3     *� �       
                            T     *� Y*� �  � &(� * � � .(� **� � 1� 4�                    *      7       /     *� �                         8      >     *+� �       
                          9 :     /     *� �                           ; <     >     *'� �        
    "  #                    = >     /      *� �           %              ? @     >     *  �       
    (  )                	 
   A    B                                                                                                                                                                                                                                                                                                                                                                                                                                                                              j�K�H�H �K�H     .          j�K�H�H �K�H     c l a s s  �  ����������  ���� T e s t e  �P r o d u t   o .  ESTEP~1CLA  l�K�H�H J�H�	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ���   4 �  br/com/fiap/test s/TesteProduto  java/lang/O ject <init> ()V Code
  	    LineNumberTable LocalV riableTable this !Lbr/com/fi p/testes/TesteProduto; texto &(Ljava/lang/String;)Ljava/lang String;
    javax/swing/J ptionPane   showInputDialo  &(Ljava/lang/Object;)Ljava/la g/String; m Ljava/lang/Stri g; inteiro (Ljava/lang/Stri g;)I
    
    java/l ng/Integer    parseInt de imal (Ljava/lang/String;)D
 $ & % java/lang/Double ' "  arseDouble logico (Ljava/la g/String;)Z
 + - , java/lang Boolean . ) parseBoolean m in ([Ljava/lang/String;)V 2 Deseja cadastrar Livros
 4 6   java/lang/String 7 8 toUp erCase ()Ljava/lang/String;   SIM
 4 < = > equals (Lj va/lang/Object;)Z @ br/com/f ap/beans/Livro B Total de p� ginas
  D   F Autor H  Editora J Descrição L V lor
  N ! " P Codigo
 ? R  S <(ILjava/lang/String;Ljava lang/String;Ljava/lang/String;D )V U br/com/fiap/beans/CD W  Total de Faixas Y Lançame to
  [ ( ) ] Artista
 T _  ` +(Ljava/lang/String;DIIZLj va/lang/String;)V b br/com/f ap/beans/Pedido d Número do pedido f Data h Total
 a    k (ILjava/lang/String;D)V  m br/com/fiap/beans/ItemPedi o o Valor Unitário q 
Qua tidade
 l s  t :(Lbr/com/fia /beans/Pedido;Lbr/com/fiap/bean /Produto;DI)V	 v x w java/la g/System y z out Ljava/io/ rintStream;
 l | } 8 getTudo   � � java/io/PrintStream   � println (Ljava/lang/Stri g;)V args [Ljava/lang/Strin ; 
objProduto Lbr/com/fiap/b ans/Produto; 	objPedido Lbr/ om/fiap/beans/Pedido; objItem  Lbr/com/fiap/beans/ItemPedido  StackMapTable � br/com/fi p/beans/Produto 
SourceFile  esteProduto.java !                /     *� �    
                           /     *� �    
                             6     *� � �    
   
                     !       6     *� � #�    
   
                     ( )     6     *� � *�     
   
                    	 / 0    v 	    �1� �  9� ;� ,� ?YA� CE� G� I�  K� MO� C� QL� )� TYI� K� M O� CV� CX� Z\� � ^L� aYc�  e� g� M� iM� lY,+n� Mp� C� rN� u-� {� ~�    
   � !          "  #  $  % # & ( ' - ( 2 " 6 * 9 , = - B . G / L 0 Q 1 V 2 [ , _ 5 c 6 h 7 m 8 r 5 v : z ; { < | = � > � : � A � B    4    � � �   6  � �  _ 6 � �  v  � �  �  � �  �   	  � % �  �    �                                                .text.java.show.in.package.view  commandName="Show in Script Ex lorer" description="Show the se ected element in the Script Exp orer" category="_R2coJvyuEeWsIe E8AeYIw"/>
  <commands xmi:id= _R2mbtfyuEeWsIeCE8AeYIw" elemen Id="org.eclipse.ui.edit.text.go o.pageUp" commandName="Page Up" description="Go up one page" ca egory="_R2coBvyuEeWsIeCE8AeYIw" >
  <commands xmi:id="_R2mbtvy EeWsIeCE8AeYIw" elementId="org. clipse.tm.terminal.copy" comman Name="Copy" category="_R2coMfyu eWsIeCE8AeYIw"/>
  <commands x i:id="_R2mbt_yuEeWsIeCE8AeYIw"  lementId="org.eclipse.ui.edit.t xt.goto.columnPrevious" command ame="Previous Column" descripti n="Go to the previous column" c tegory="_R2coBvyuEeWsIeCE8AeYIw />
  <commands xmi:id="_R2mbuP uEeWsIeCE8AeYIw" elementId="org eclipse.egit.ui.team.submodule. ync" commandName="Sync Submodul " category="_R2coM_yuEeWsIeCE8A YIw"/>
  <commands xmi:id="_R2 bufyuEeWsIeCE8AeYIw" elementId= org.eclipse.egit.ui.team.Delete ranch" commandName="Delete Bran h" category="_R2coM_yuEeWsIeCE8 eYIw"/>
  <commands xmi:id="_R mbuvyuEeWsIeCE8AeYIw" elementId "org.eclipse.graphiti.ui.intern l.action.SaveImageAction" comma dName="Export Diagram" descript on="Export Diagram" category="_ 2coFPyuEeWsIeCE8AeYIw"/>
  <co mands xmi:id="_R2mbu_yuEeWsIeCE AeYIw" elementId="org.eclipse.c mpare.selectNextChange" command ame="Select Next Change" descri tion="Select Next Change" categ ry="_R2coKvyuEeWsIeCE8AeYIw"/>   <commands xmi:id="_R2mbvPyuEe sIeCE8AeYIw" elementId="org.ecl pse.wst.jsdt.ui.correction.spli            o�K�H�H �K�H     .          o�K�H�H �K�H      R         q�K�H�H bK�H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                q�K�H�H �K�H     .          q�K�H�H �K�H     OM        s�K�H�H bK�H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                s�K�H�H �K�H     .          s�K�H�H �K�H     IAP       u�K�H�H bK�H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                u�K�H�H �K�H     .          u�K�H�H �K�H     EANS      x�K�H�H bK�H     ESTES     ��K�H�H bK�H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                x�K�H�H �K�H     .          x�K�H�H �K�H     C D . j a  �v a   ������  ���� DC1D2~1JAV  z�K�H�H 
J�H�   v a   ���� �������������  ���� I t e m P  �e d i d o .   j a  TEMPE~1JAV  |�K�H�H 
J�H>   L i v r o  :. j a v a     ���� IVRO~1 JAV  �K�H�H 
J�H�   P e d i d  �o . j a v a     �� EDIDO~1JAV  ��K�H�H 
J�H�   P r o d u  �t o . j a v   a    RODUT~1JAV  ��K�H�H 
J�H_                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ackage br.com.fiap.beans;

pu lic class CD extends Produto{
 private int totalFaixas;
	priv te boolean lancamento;
	privat  String artista;
	
	public CD String d, double v, int codigo, int totalFaixas, boolean lancam nto, String artista) {
		super d, v, codigo);
		this.totalFai as = totalFaixas;
		this.lanca ento = lancamento;
		this.arti ta = artista;
	}
	
	public C () {}
	
	
	
	public int get otalFaixas() {
		return totalF ixas;
	}
	public void setTota Faixas(int totalFaixas) {
		th s.totalFaixas = totalFaixas;
	 
	public boolean isLancamento(  {
		return lancamento;
	}
	 ublic void setLancamento(boolea  lancamento) {
		this.lancamen o = lancamento;
	}
	public St ing getArtista() {
		return ar ista;
	}
	public void setArti ta(String artista) {
		this.ar ista = artista;
	}
	public St ing getTudo(){
		return super. etTudo() + totalFaixas +
				" n" + lancamento + "\n" + 
				 rtista;
	}

}
                                                                              ="Show Perspective" description "Show a particular perspective" category="_R2coNfyuEeWsIeCE8AeY w">
    <parameters xmi:id="_R vjGvyuEeWsIeCE8AeYIw" elementId "org.eclipse.ui.perspectives.sh wPerspective.perspectiveId" nam ="Parameter"/>
    <parameters xmi:id="_R2vjG_yuEeWsIeCE8AeYIw  elementId="org.eclipse.ui.pers ectives.showPerspective.newWind w" name="In New Window"/>
  </ ommands>
  <commands xmi:id="_ 2vjHPyuEeWsIeCE8AeYIw" elementI ="org.eclipse.jpt.jpa.eclipseli k.ui.newDynamicEntity" commandN me="EclipseLink Dynamic Entity" category="_R2coHPyuEeWsIeCE8AeY w"/>
  <commands xmi:id="_R2vj fyuEeWsIeCE8AeYIw" elementId="o g.eclipse.ui.edit.text.goto.lin " commandName="Go to Line" desc iption="Go to a specified line  f text" category="_R2coJvyuEeWs eCE8AeYIw"/>
  <commands xmi:i ="_R2vjHvyuEeWsIeCE8AeYIw" elem ntId="org.eclipse.ui.editors.qu ckdiff.revert" commandName="Rev rt Lines" description="Revert t e current selection, block or d leted lines" category="_R2coBvy EeWsIeCE8AeYIw"/>
  <commands  ackage br.com.fiap.beans;

pu lic class ItemPedido {
	privat  Pedido pedido;
	private Produ o produto;
	private double val rUnitario;
	private int qtde; 	public ItemPedido(Pedido pedid , Produto produto, double valor nitario, int qtde) {
		super() 
		this.pedido = pedido;
		th s.produto = produto;
		this.va orUnitario = valorUnitario;
		 his.qtde = qtde;
	}
	public I emPedido() {
		super();
	}
	 ublic Pedido getPedido() {
		r turn pedido;
	}
	public void  etPedido(Pedido pedido) {
		th s.pedido = pedido;
	}
	public Produto getProduto() {
		retur  produto;
	}
	public void set roduto(Produto produto) {
		th s.produto = produto;
	}
	publ c double getValorUnitario() {
 	return valorUnitario;
	}
	pu lic void setValorUnitario(doubl  valorUnitario) {
		this.valor nitario = valorUnitario;
	}
	 ublic int getQtde() {
		return qtde;
	}
	public void setQtde int qtde) {
		this.qtde = qtde 
	}
	
	public String getTudo ){
		return pedido.getTudo() + "\n" + 
				produto.getTudo()   "\n" + 
				valorUnitario + " n" + 
				qtde;
	}


}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                   i.correction.convertAnonymousTo ocal.assist" commandName="Quick Assist - Convert anonymous to l cal class" description="Invokes quick assist and selects 'Conve t anonymous to local class'" ca egory="_R2coOfyuEeWsIeCE8AeYIw" >
  <commands xmi:id="_R2vjJ_y EeWsIeCE8AeYIw" elementId="org. clipse.compare.copyLeftToRight" commandName="Copy from Left to  ight" description="Copy Current Change from Left to Right" cate ory="_R2coKvyuEeWsIeCE8AeYIw"/> 
  <commands xmi:id="_R2vjKPyuE WsIeCE8AeYIw" elementId="org.ec ackage br.com.fiap.beans;

pu lic class Livro extends Produto 
	private int totalPaginas;
	 rivate String autor;
	private  tring editora;
	public Livro(i t totalPaginas, 
			String aut r, String editora, 
			String  , double v, int c) {
		super(d v,c);
		//super.setDescricao(d ;
		this.totalPaginas = totalP ginas;
		this.autor = autor;
 	this.editora = editora;
	}
	 ublic Livro() {
		super();
	} 
	public String getTudo(){
		r turn super.getTudo() + 
				"\ " + totalPaginas + "\n" 
				+ editora + "\n" + autor;
	}
	p blic int getTotalPaginas() {
	 return totalPaginas;
	}
	publ c void setTotalPaginas(int tota Paginas) {
		this.totalPaginas = totalPaginas;
	}
	public St ing getAutor() {
		return auto ;
	}
	public void setAutor(St ing autor) {
		this.autor = au or;
	}
	public String getEdit ra() {
		return editora;
	}
 public void setEditora(String e itora) {
		this.editora = edit ra;
	}

}
                                                                                  ory="_R2coF_yuEeWsIeCE8AeYIw"/> 
  <commands xmi:id="_R2vjLvyuE WsIeCE8AeYIw" elementId="org.ec ipse.wst.jsdt.ui.edit.text.java push.down" commandName="Push Do n" description="Move members to subclasses" category="_R2coHfyu eWsIeCE8AeYIw"/>
  <commands x i:id="_R2vjL_yuEeWsIeCE8AeYIw"  lementId="org.eclipse.jdt.ui.ed t.text.java.search.write.access in.project" commandName="Write  ccess in Project" description=" earch for write references to t e selected element in the enclo ing project" category="_R2coMvy EeWsIeCE8AeYIw"/>
  <commands  mi:id="_R2vjMPyuEeWsIeCE8AeYIw" elementId="org.eclipse.ui.proje t.properties" commandName="Prop rties" description="Display the properties of the selected item s project " category="_R2coMPyu eWsIeCE8AeYIw"/>
  <commands x i:id="_R2vjMfyuEeWsIeCE8AeYIw"  lementId="org.eclipse.jpt.jpa.u .persistentTypeMapAs" commandNa e="Map As" category="_R2coF_yuE WsIeCE8AeYIw">
    <parameters xmi:id="_R2vjMvyuEeWsIeCE8AeYIw  elementId="persistentTypeMappi gKey" name="mapping key" option ackage br.com.fiap.beans;

pu lic class Pedido {
	private in  numero;
	private String data; 
	private double total;
	publi  Pedido(int numero, String data  double total) {
		super();
	 this.numero = numero;
		this.d ta = data;
		this.total = tota ;
	}
	public Pedido() {
		su er();
	}
	public int getNumer () {
		return numero;
	}
	pu lic void setNumero(int numero)  
		this.numero = numero;
	}
 public String getData() {
		re urn data;
	}
	public void set ata(String data) {
		this.data = data;
	}
	public double get otal() {
		return total;
	}
 public void setTotal(double tot l) {
		this.total = total;
	} 
	public String getTudo(){
		r turn total + "\n"+data + "\n"+n mero; 
	}

}
                                                                                                                                                                                                                                                                                                               
  <commands xmi:id="_R2vjOPyuE WsIeCE8AeYIw" elementId="org.ti ris.subversion.subclipse.ui.exp rt" commandName="Export..." cat gory="_R2coAvyuEeWsIeCE8AeYIw"/ 
  <commands xmi:id="_R2vjOfyu eWsIeCE8AeYIw" elementId="org.e lipse.jdt.ui.correction.extract ocalNotReplaceOccurrences.assis " commandName="Quick Assist - E tract local variable" descripti n="Invokes quick assist and sel cts 'Extract local variable'" c tegory="_R2coOfyuEeWsIeCE8AeYIw />
  <commands xmi:id="_R2vjOv uEeWsIeCE8AeYIw" elementId="org eclipse.datatools.sqltools.sqle itor.attachProfileAction" comma dName="Set Connection Informati n" category="_R2coNPyuEeWsIeCE8 eYIw"/>
  <commands xmi:id="_R vjO_yuEeWsIeCE8AeYIw" elementId "org.tigris.subversion.subclips .ui.ignore" commandName="Add to svn:ignore" category="_R2coAvyu eWsIeCE8AeYIw"/>
  <commands x i:id="_R2vjPPyuEeWsIeCE8AeYIw"  lementId="org.eclipse.egit.ui.R positoriesToggleBranchHierarchy  commandName="Toggle Branch Rep esentation" category="_R2coM_yu eWsIeCE8AeYIw"/>
  <commands x ackage br.com.fiap.beans;

pu lic class Produto {
	private S ring descricao;
	private doubl  valor;
	private int codigo;
 public Produto(String descricao  double valor, int codigo) {
	 super();
		this.descricao = de cricao;
		this.valor = valor; 		this.codigo = codigo;
	}
	p blic Produto(String descricao)  
		super();
		this.descricao   descricao;
	}

	public Prod to() {
		super();
	}
	public String getTudo(){
		return des ricao+"\n"+valor+"\n"+codigo;
 }
	public String getDescricao(  {
		return descricao;
	}
	p blic void setDescricao(String d scricao) {
		this.descricao =  escricao;
	}
	public double g tValor() {
		return valor;
	} 
	public void setValor(double v lor) {
		this.valor = valor;
 }
	public int getCodigo() {
	 return codigo;
	}
	public voi  setCodigo(int codigo) {
		thi .codigo = codigo;
	}


}
                                                                                                                                                                  _R2coAPyuEeWsIeCE8AeYIw"/>
  < ommands xmi:id="_R2vjQvyuEeWsIe E8AeYIw" elementId="org.eclipse datatools.connectivity.commands import" commandName="Import Pro iles Command" description="Comm nd to import connection profile " category="_R2coHPyuEeWsIeCE8A YIw"/>
  <commands xmi:id="_R2 jQ_yuEeWsIeCE8AeYIw" elementId= org.eclipse.ui.edit.text.showRu erContextMenu" commandName="Sho  Ruler Context Menu" descriptio ="Show the context menu for the ruler" category="_R2coDfyuEeWsI CE8AeYIw"/>
  <commands xmi:id "_R2vjRPyuEeWsIeCE8AeYIw" eleme tId="org.eclipse.jdt.ui.edit.te t.java.search.references.in.wor ing.set" commandName="Reference  in Working Set" description="S arch for references to the sele ted element in a working set" c tegory="_R2coMvyuEeWsIeCE8AeYIw />
  <commands xmi:id="_R2vjRf uEeWsIeCE8AeYIw" elementId="org eclipse.mylyn.tasks.ui.command. ask.clearOutgoing" commandName= Clear Outgoing Changes" categor ="_R2coCfyuEeWsIeCE8AeYIw"/>
  <commands xmi:id="_R2vjRvyuEeWs eCE8AeYIw" elementId="org.eclip            ��K�H�H �K�H     .          ��K�H�H �K�H     j a v a    Y������������  ���� T e s t e  YP r o d u t   o .  ESTEP~1JAV  ��K�H�H 
J�H�                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ackage br.com.fiap.testes;

i port javax.swing.JOptionPane;
 
import br.com.fiap.beans.CD;
 mport br.com.fiap.beans.ItemPed do;
import br.com.fiap.beans.L vro;
import br.com.fiap.beans. edido;
import br.com.fiap.bean .Produto;

public class Teste roduto {

	static String text (String m){
		return JOptionPa e.showInputDialog(m);
	}
	sta ic int inteiro(String m){
		re urn Integer.parseInt
				(text (m));
	}
	static double decim l(String m){
		return Double.p rseDouble
				(texto(m));
	} 	static boolean logico(String m {
		return Boolean.parseBoolea 
				(texto(m));
	}
	public  tatic void main(String[] args)  
		Produto objProduto;
		if(J ptionPane.showInputDialog
				 "Deseja cadastrar Livros")
			 .toUpperCase().equals("SIM")){ 			
			objProduto = new Livro( 
					inteiro("Total de p�ginas ),
					texto("Autor"),
					 exto("Editora"),
					texto("D scri��o"),
					decimal("Valor ),
					inteiro("Codigo")
			 	);
		}else{
			
			objProdu o = new CD(
					texto("Descri �o"),
					decimal("Valor"),
 				inteiro("Codigo"),
					in eiro("Total de Faixas"),
					 ogico("Lan�amento"),
					text ("Artista")
					);
		}
		Pe ido objPedido = new Pedido(
		 	inteiro("N�mero do pedido"),
 			texto("Data"),
				decimal( Total")
				);
		ItemPedido o jItem = new ItemPedido(
				ob Pedido,
				objProduto,
				d cimal("Valor Unit�rio"),
				i teiro("Quantidade")
				);
		 
		System.out.println(objItem.g tTudo());
	}

}
                                            "org.eclipse.ui.ide.configureFi ters" commandName="Configure Co tents..." description="Configur  the filters to apply to the ma kers view" category="_R2coHPyuE WsIeCE8AeYIw"/>
  <commands xm :id="_R2vjV_yuEeWsIeCE8AeYIw" e ementId="org.eclipse.ui.navigat .previousTab" commandName="Prev ous Tab" description="Switch to the previous tab" category="_R2 oJvyuEeWsIeCE8AeYIw"/>
  <comm nds xmi:id="_R2vjWPyuEeWsIeCE8A YIw" elementId="org.eclipse.wst jsdt.ui.edit.text.java.search.d clarations.in.hierarchy" comman            muM�H�H vM�H     .          muM�H�H vM�H�     2 7 7 6 0  X7 . d l l     ���� 8 0 0 3 1  X2 1 8 0 9 1   4 1  w r i t t  Xa b l e A r   e a  RITTA~1DLL  �vM�H�H  wM�H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  vM�H�H wM�H      .          vM�H�H wM�H�     EFAULT    �vM�H�H wM�H"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     o r g . j  kb o s s . i   d e  RGJBO~270   ��M�H�H hFjH �                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               �vM�H�H wM�H"     .          �vM�H�H wM�H      2   ������ K������������  ���� . e c l i  Kp s e . a s   . 3  o r g . j  Kb o s s . i   d e  RGJBO~132   �vM�H�H hFjH(�    0   ������ �������������  ���� . e c l i  �p s e . a s   . 4  o r g . j  �b o s s . i   d e  RGJBO~140   �vM�H�H hFjH)�    2   ������ �������������  ���� . e c l i  �p s e . a s   . 4  o r g . j  �b o s s . i   d e  RGJBO~142   wM�H�H hFjH*�    0   ������ �������������  ���� . e c l i  �p s e . a s   . 5  o r g . j  �b o s s . i   d e  RGJBO~150   wM�H�H hFjH,�    1   ������ K������������  ���� . e c l i  Kp s e . a s   . 5  o r g . j  Kb o s s . i   d e  RGJBO~151   �yM�H�H hFjH/�    0   ������ 
������������  ���� . e c l i  
p s e . a s   . 6  o r g . j  
b o s s . i   d e  RGJBO~160   O{M�H�H hFjHV�    0   ������ K������������  ���� . e c l i  Kp s e . a s   . 7  o r g . j  Kb o s s . i   d e  RGJBO~170   T{M�H�H hFjH2�    1   ������ �������������  ���� . e c l i  �p s e . a s   . 7  o r g . j  �b o s s . i   d e  RGJBO~171   6|M�H�H hFjH5�    i l d f l  �y . 8 0   ��  ���� . e c l i  �p s e . a s   . w  o r g . j  �b o s s . i   d e  RGJBO~180   Y}M�H�H hFjH* �    i l d f l  �y . 9 0   ��  ���� . e c l i  �p s e . a s   . w  o r g . j  �b o s s . i   d e  RGJBO~190    �M�H�H hFjH9�    i l d f l  �y . 1 0 0     ���� . e c l i  �p s e . a s   . w  o r g . j  �b o s s . i   d e  RGJBO~1100  !�M�H�H hFjH�!�    a p . 4 3    ����������  ���� . e c l i  p s e . a s   . e  o r g . j  b o s s . i   d e  RGJBO~143   '�M�H�H hFjH$ �    a p . 5 0  �  ����������  ���� . e c l i  �p s e . a s   . e  o r g . j  �b o s s . i   d e  RGJBO~250   ��M�H�H hFjH:�    a p . 6 0  �  ����������  ���� . e c l i  �p s e . a s   . e  o r g . j  �b o s s . i   d e  RGJBO~260   ��M�H�H hFjHY�    a p . 6 1  �  ����������  ���� . e c l i  �p s e . a s   . e  o r g . j  �b o s s . i   d e  RGJBO~161   ��M�H�H hFjH��    a p . 7 0  k  ����������  ���� . e c l i  kp s e . a s   . e        �               �    $org.tigris.subversion.subclips .core svn-bc-sync-key    org eclipse.wst.jsdt.core org.ecli se.jdt.core $oracle.eclipse.too s.common.services org.eclipse. st.jsp.core    DescansoBoleti   org.eclipse.jdt.core.javabuil er     Heranca  org.eclipse.jd .core.javabuilder     Manipula tring  org.eclipse.jdt.core.jav builder     PrimeiroProjeto  o g.eclipse.jdt.core.javabuilder     TomadaDecisao  org.eclipse. dt.core.javabuilder    
	      DescansoBoletim      S�t�       �           
 classpath     S�@       �          �  .project      �t�       �          �  	.set ings     S�ʐ       �           � org.eclipse.jdt.core.p efs     S�vp       �          �  bin   B  S��`       �           � br   B  S�'        �           � com   B   S�'�       �           �  iap   B  S�'�       �           � modelo   B  S�'�       �           � Aluno.class    A  S��G`       �             Boletim.class   A  S���0       �          �  teste   B   S�'�       �           �  ondicionais.class   A  S����       �          �  Operadore .class   A  S���        �           �  TesteBoletim.class   A  S��p       �          �  TesteEleitores.class   A   ��}�       �          �  src      S橊@       �             br     S��0       �           � com     S��        �           � fiap      ��        �           � mode o     S歨�       �           � 
Aluno.java    S���       �         �  Boletim.ja a    S�ؑP       �         �  teste     S�-�       �           � Condicionais.ja a    S���P       �         �  Operadores.java    S �j�       �         �  Teste oletim.java    S��9�       �           TesteEleitores. ava    S��V�       �           modelo   ��������       �    ��������  teste   � ������       �    ��������  He anca     T.�`p      3           
.classpath     T.�       9         ;  .projec      T.�`p      4         7  	.settings     T.�h@      7          8 org.eclipse. dt.core.prefs     T.��      8         ;  bin   B  T �`p      6          7 br   B  T.���      >          ? com   B  T.���      ?          @ fiap   B  T.���      @          A beans   B   T.���      A          B CD. lass   A  T.��`      I         M  ItemPedido.class   A  T\�\�      �         �  L vro.class   A  T.�9�      G         L  Pedido.class   A   T\��      �         �   roduto.class   A  T.Ы�      E         I  testes   B   T.�P      C          D Tes eProduto.class   A  T\��      K         Y  src      .�X�      5          6 br     T.���      :          ;  com     T.���      ;          < fiap     T.���      <          = beans     T.���      =          > CD java    T.��       H         �  ItemPedido.java    T\�       �         �  
Li ro.java    T.�0      F         ~  Pedido.java     T\��@      �         �  Pro uto.java    T.Є�      D         �  testes     T.� �      B          C TestePr duto.java    T\��       J         	�  ManipulaString     T
�P      N           
.classpath     T
��       T         V  .project     T
�P      O         R  	.s ttings     T
��      R          S org.eclipse.jdt.core prefs     T
�%�      S         V  bin   B  T
�P      Q          R br   B  T
 ��      Y          Z com   B  T
���      Z          [ fiap   B  T
���      [          \ beans   B  T
���      \          ] Aluno.class   A  Tf8       `          w  testes   B  T
��                 _ Maiuscula.class    A  T��      �            Teste.class   A  T
��p      b   
      m  src      
�P      P          Q br     T
��       U          V  com     T
���      V          W fiap     T
���      W          X beans     T
���      X          Y 
Al no.java    Tf �      _         {  testes     T
��       ]          ^ Maiuscul .java    T��0      �           
Teste.java    T
 �0      a         9  Primei oProjeto     S`b�                   
.classpath      S`b�        
            .pr ject     S`b�                    	.settings     S`b�                   	 org.ecli se.jdt.core.prefs     S`b�        	            bin   B  S`b�                    b    B  S`fZ�                   com   B  S`fjp                   fiap   B  S`fjp                   modelo   B  S`fr@                   Fabricante.class   A  S̶��       L          T  Produto.c ass   A  S����                 '  Telefone.class   A   ̶��       k          p  test    B  S`f�`                   Teste.class   A  S���                 /  Teste2.cla s   A  S���       J          W  Teste3.class   A  S̤        i          z  Teste4.c ass   A  S̸��       m          u  src     S`b�                    br     S`f;                    com      S`fK0                    iap     S`fK0                   modelo     S`fS                    Fabricante.j va    S̶y@       K         �  Produto.java    S�� p                N  Telefon .java    S̵�p       j         z  teste     S`f��                   
Teste.java     S|�                   Teste2.java    S��f�       I         N  Teste3.java     S̛��       h            Teste4.java    S̸�        l         �  RemoteSystem TempFiles     S`_�`                  .project      `_�`                   Toma aDecisao     S�p       �           
.classpath      S�܀       �          �  .pr ject     S�p       �          �  	.settings     S��        �           � org.ecli se.jdt.core.prefs     S���       �          �  bin   B  S�p       �           � b    B  S�)�       �           � com   B  S�)�       �           � fiap   B  S�)�       �           � teste      S�)�       �           �  TesteTamanho.class   A  S��'        �         	  src      S�p       �           �  r     S�!�       �           � com     S�)�       �           � fiap     S�)        �           � teste     S�)�       �           � TesteTamanho.java    S���        �         �                             DescansoBoletim bin  br com fiap teste C ndicionais.class  Operadores. lass  TesteEleitores.class   src br com fiap tes e Condicionais.java  Opera ores.java  TesteEleitores.jav   Heranca  ManipulaString  TomadaDecisao                                                                                                                                                                                                                                                 ="_R2coDfyuEeWsIeCE8AeYIw"/>
  <commands xmi:id="_R2vjp_yuEeWs eCE8AeYIw" elementId="org.eclip e.wst.jsdt.ui.edit.text.java.se f.encapsulate.field" commandNam ="Encapsulate Var" description= Create getting and setting func ions for the var and use only t ose to access the var" category "_R2coHfyuEeWsIeCE8AeYIw"/>
   commands xmi:id="_R2vjqPyuEeWsI CE8AeYIw" elementId="org.eclips .jdt.ui.edit.text.java.generate tostring" commandName="Generate toString()" description="Genera es the toString() method for th  type" category="_R2coOfyuEeWsI CE8AeYIw"/>
  <commands xmi:id "_R2vjqfyuEeWsIeCE8AeYIw" eleme tId="org.eclipse.jdt.ui.edit.te t.java.organize.imports" comman Name="Organize Imports" descrip ion="Evaluate all required impo ts and replace the current impo ts" category="_R2coOfyuEeWsIeCE AeYIw"/>
  <commands xmi:id="_ 2vjqvyuEeWsIeCE8AeYIw" elementI ="org.jboss.tools.openshift.ui. ommand.project.manage" commandN me="Manage Projects..." descrip ion="Manage Projects" category= _R2coHPyuEeWsIeCE8AeYIw"/>
  < clipse.preferences.version=1
w tchedFolder=C\:\\opensource\\ec ipse45\\configuration\\updates                                                                                                                                                                                                                                                                                                                                                                                                                                 i.tools.ui.compare.to.baseline" commandName="API Baseline..." d scription="Allows to compare th  selected resource with the cur ent baseline" category="_R2coHP uEeWsIeCE8AeYIw"/>
  <commands xmi:id="_R2vjrvyuEeWsIeCE8AeYIw  elementId="org.eclipse.pde.ui. magebrowser.saveToWorkspace" co mandName="Save Image" descripti n="Save the selected image into a project in the workspace" cat gory="_R2coHPyuEeWsIeCE8AeYIw"/ 
  <commands xmi:id="_R2vjr_yu eWsIeCE8AeYIw" elementId="org.e lipse.jdt.debug.ui.commands.Dis lay" commandName="Display" desc iption="Display result of evalu ting selected text" category="_ 2coEfyuEeWsIeCE8AeYIw"/>
  <co mands xmi:id="_R2vjsPyuEeWsIeCE AeYIw" elementId="org.eclipse.j t.ui.edit.text.java.search.exce tion.occurrences" commandName=" earch Exception Occurrences in  ile" description="Search for ex eption occurrences of a selecte  exception type" category="_R2c MvyuEeWsIeCE8AeYIw"/>
  <comma ds xmi:id="_R2vjsfyuEeWsIeCE8Ae Iw" elementId="org.eclipse.tm.t rminal.view.ui.command.disconne t" commandName="Disconnect Term nal" category="_R2coKfyuEeWsIeC 8AeYIw"/>
  <commands xmi:id=" R2vjsvyuEeWsIeCE8AeYIw" element d="org.eclipse.jdt.ui.correctio .assignToField.assist" commandN me="Quick Assist - Assign to fi ld" description="Invokes quick  ssist and selects 'Assign to fi ld'" category="_R2coOfyuEeWsIeC 8AeYIw"/>
  <commands xmi:id=" R2vjs_yuEeWsIeCE8AeYIw" element d="org.eclipse.ui.edit.text.fol ing.expand" commandName="Expand  description="Expands the folde  region at the current selectio ?xml version="1.0" encoding="UT -8" standalone="no"?>
<fileset >
  <fileset excludes="" folde ="${jboss_config_dir}/conf" inc udes="jboss-log4j.xml" name="Lo 4j.xml"/>
</filesets>
                                                                                                                                                                                                                                                                                                                                        AeYIw" elementId="org.eclipse.j t.jpa.eclipselink.ui.newEclipse inkMappingFile" commandName="Ec ipseLink ORM Mapping File" cate ory="_R2coHPyuEeWsIeCE8AeYIw"/> 
  <commands xmi:id="_R2vjt_yuE WsIeCE8AeYIw" elementId="org.ec ipse.mylyn.tasks.ui.command.ope RemoteTask" commandName="Open R mote Task" category="_R2coJvyuE WsIeCE8AeYIw"/>
  <commands xm :id="_R2vjuPyuEeWsIeCE8AeYIw" e ementId="org.eclipse.debug.ui.c mmands.nextMemoryBlock" command ame="Next Memory Monitor" descr ption="Show renderings from nex  memory monitor." category="_R2 oEfyuEeWsIeCE8AeYIw"/>
  <comm nds xmi:id="_R2vjufyuEeWsIeCE8A YIw" elementId="org.eclipse.egi .ui.internal.reflog.OpenInCommi ViewerCommand" commandName="Ope  in Commit Viewer" category="_R coHPyuEeWsIeCE8AeYIw"/>
  <com ands xmi:id="_R2vjuvyuEeWsIeCE8 eYIw" elementId="org.eclipse.my yn.context.ui.commands.task.ret ieveContext" commandName="Retri ve Context" category="_R2coB_yu eWsIeCE8AeYIw"/>
  <commands x i:id="_R2vju_yuEeWsIeCE8AeYIw"  lementId="org.eclipse.jst.jsp.u .refactor.rename" commandName=" ename" description="Rename a Ja a Element" category="_R2coAPyuE WsIeCE8AeYIw"/>
  <commands xm :id="_R2vjvPyuEeWsIeCE8AeYIw" e ementId="com.ibm.etools.webtool .json.ui.edit.compress" command ame="Compress" description="Com ress the JSON document" categor ="_R2coAPyuEeWsIeCE8AeYIw"/>
  <commands xmi:id="_R2vjvfyuEeWs eCE8AeYIw" elementId="org.eclip e.egit.ui.team.Fetch" commandNa e="Fetch" category="_R2coM_yuEe sIeCE8AeYIw"/>
  <commands xmi id="_R2vjvvyuEeWsIeCE8AeYIw" el ?xml version="1.0" encoding="UT -8" standalone="no"?>
<fileset >
  <fileset excludes="" folde ="${jboss_config_dir}/conf" inc udes="jboss-log4j.xml" name="Lo 4j.xml"/>
</filesets>
                                                                                                                                                                                                                                                                                                                                        "Rename the selected text." cat gory="_R2coLfyuEeWsIeCE8AeYIw"/ 
  <commands xmi:id="_R2vjwfyu eWsIeCE8AeYIw" elementId="org.e lipse.mylyn.task.ui.editor.Quic Outline" commandName="Quick Out ine" description="Show the quic  outline for the editor input"  ategory="_R2coCfyuEeWsIeCE8AeYI "/>
  <commands xmi:id="_R2vjw yuEeWsIeCE8AeYIw" elementId="or cle.eclipse.tools.webtier.jsf.u .refactor.externalize.command"  ommandName="Externalize Strings  category="_R2coHPyuEeWsIeCE8Ae Iw"/>
  <commands xmi:id="_R2v w_yuEeWsIeCE8AeYIw" elementId=" rg.eclipse.debug.ui.commands.eo " commandName="EOF" description "Send end of file" category="_R coEfyuEeWsIeCE8AeYIw"/>
  <com ands xmi:id="_R2vjxPyuEeWsIeCE8 eYIw" elementId="org.eclipse.js .pagedesigner.horizotal" comman Name="Horizontal Layout" catego y="_R2coIfyuEeWsIeCE8AeYIw"/>
  <commands xmi:id="_R2vjxfyuEeW IeCE8AeYIw" elementId="org.ecli se.ui.navigate.showInQuickMenu" commandName="Show In..." descri tion="Open the Show In menu" ca egory="_R2coJvyuEeWsIeCE8AeYIw" >
  <commands xmi:id="_R2vjxvy EeWsIeCE8AeYIw" elementId="org. clipse.ui.edit.text.copyLineUp" commandName="Duplicate Lines" d scription="Duplicates the selec ed lines and leaves the selecti n unchanged" category="_R2coBvy EeWsIeCE8AeYIw"/>
  <commands  mi:id="_R2vjx_yuEeWsIeCE8AeYIw" elementId="oracle.eclipse.tools webtier.jsf.ui.refactor.fixId.c mmand" commandName="Fix Tag IDs  category="_R2coHPyuEeWsIeCE8Ae Iw"/>
  <commands xmi:id="_R2v yPyuEeWsIeCE8AeYIw" elementId=" rg.eclipse.debug.ui.commands.To ?xml version="1.0" encoding="UT -8" standalone="no"?>
<fileset >
  <fileset excludes="" folde ="${jboss_config_dir}/conf" inc udes="jboss-log4j.xml" name="Lo 4j.xml"/>
</filesets>
                                                                                                                                                                                                                                                                                                                                        Assist - Assign to local variab e" description="Invokes quick a sist and selects 'Assign to loc l variable'" category="_R2coCPy EeWsIeCE8AeYIw"/>
  <commands  mi:id="_R2vjy_yuEeWsIeCE8AeYIw" elementId="org.eclipse.ui.navig te.next" commandName="Next" des ription="Navigate to the next i em" category="_R2coJvyuEeWsIeCE AeYIw"/>
  <commands xmi:id="_ 2vjzPyuEeWsIeCE8AeYIw" elementI ="org.cloudfoundry.ide.eclipse. erver.ui.internal.actions.pushc mmand" commandName="Push" descr ption="Push application" catego y="_R2coHPyuEeWsIeCE8AeYIw"/>
  <commands xmi:id="_R2vjzfyuEeW IeCE8AeYIw" elementId="org.ecli se.mylyn.tasks.bugs.commands.ne TaskFromMarker" commandName="Ne  Task from Marker..." descripti n="Report as Bug from Marker" c tegory="_R2coHPyuEeWsIeCE8AeYIw />
  <commands xmi:id="_R2vjzv uEeWsIeCE8AeYIw" elementId="org eclipse.wst.jsdt.ui.refactor.ap ly.refactoring.script" commandN me="Apply Script" description=" erform refactorings from a refa toring script on the local work pace" category="_R2coHfyuEeWsIe E8AeYIw"/>
  <commands xmi:id= _R2vjz_yuEeWsIeCE8AeYIw" elemen Id="org.eclipse.wst.server.run" commandName="Run" description=" un server" category="_R2coCvyuE WsIeCE8AeYIw"/>
  <commands xm :id="_R2vj0PyuEeWsIeCE8AeYIw" e ementId="org.eclipse.mylyn.cont xt.ui.commands.focus.view" comm ndName="Focus View" category="_ 2coHPyuEeWsIeCE8AeYIw">
    <p rameters xmi:id="_R2vj0fyuEeWsI CE8AeYIw" elementId="viewId" na e="View ID to Focus" optional=" alse"/>
  </commands>
  <comm nds xmi:id="_R2vj0vyuEeWsIeCE8A safe table
#Thu Apr 28 09:44:3  BRT 2016
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     .eclipse.rse.core=true
clearDe ta_oracle.eclipse.tools.common. ervices=true
clearDelta_org.ec ipse.rse.files.ui=true
clearDe ta_org.eclipse.pde.core=true
� ��#� Q�{�w�                                                                                                                                                                                                                                                                                                                                                  g" category="_R2coL_yuEeWsIeCE8 eYIw"/>
  <commands xmi:id="_R vj2fyuEeWsIeCE8AeYIw" elementId "org.eclipse.wst.common.project facet.ui.ConvertProjectToFacete Form" commandName="Convert to F ceted Form..." category="_R2coD yuEeWsIeCE8AeYIw"/>
  <command  xmi:id="_R2vj2vyuEeWsIeCE8AeYI " elementId="org.eclipse.jdt.ui edit.text.java.annotate.classFi e" commandName="Annotate Class  ile" description="Externally ad  Annotations to a Class File."  ategory="_R2coOfyuEeWsIeCE8AeYI "/>
  <commands xmi:id="_R2vj2 yuEeWsIeCE8AeYIw" elementId="or .eclipse.wst.jsdt.ui.edit.text. ava.replace.invocations" comman Name="Replace Invocations" desc iption="Replace invocations of  he selected function" category= _R2coHfyuEeWsIeCE8AeYIw"/>
  < ommands xmi:id="_R2vj3PyuEeWsIe E8AeYIw" elementId="org.eclipse egit.ui.team.stash.create" comm ndName="Stash Changes..." categ ry="_R2coM_yuEeWsIeCE8AeYIw"/>   <commands xmi:id="_R2vj3fyuEe sIeCE8AeYIw" elementId="org.ecl pse.mylyn.tasks.ui.command.acti ateSelectedTask" commandName="A ?xml version="1.0" encoding="UT -8" standalone="no"?>
<fileset >
  <fileset excludes="" folde ="${jboss_config_dir}/conf" inc udes="jboss-log4j.xml" name="Lo 4j.xml"/>
</filesets>
                                                                                                                                                                                                                                                                                                                                        :id="_R2vj4PyuEeWsIeCE8AeYIw" e ementId="org.eclipse.wst.sse.ui format.document" commandName="F rmat" description="Format selec ion" category="_R2coAPyuEeWsIeC 8AeYIw"/>
  <commands xmi:id=" R2vj4fyuEeWsIeCE8AeYIw" element d="org.eclipse.jdt.ui.correctio .addNonNLS" commandName="Quick  ix - Add non-NLS tag" descripti n="Invokes quick assist and sel cts 'Add non-NLS tag'" category "_R2coOfyuEeWsIeCE8AeYIw"/>
   commands xmi:id="_R2vj4vyuEeWsI CE8AeYIw" elementId="org.eclips .graphiti.ui.internal.action.Re oveAction" commandName="Remove" description="Remove selected Pi togram Elements" category="_R2c FPyuEeWsIeCE8AeYIw"/>
  <comma ds xmi:id="_R2vj4_yuEeWsIeCE8Ae Iw" elementId="org.eclipse.wst. sdt.ui.edit.text.java.search.wr te.access.in.workspace" command ame="Write Access in Workspace" description="Search for write r ferences to the selected elemen  in the workspace" category="_R coMvyuEeWsIeCE8AeYIw"/>
  <com ands xmi:id="_R2vj5PyuEeWsIeCE8 eYIw" elementId="org.eclipse.eg t.ui.team.RemoveFromIndex" comm ndName="Remove from Index" cate ory="_R2coM_yuEeWsIeCE8AeYIw"/> 
  <commands xmi:id="_R2vj5fyuE WsIeCE8AeYIw" elementId="org.ec ipse.ui.newWizard" commandName= New" description="Open the New  tem wizard" category="_R2coDPyu eWsIeCE8AeYIw">
    <parameter  xmi:id="_R2vj5vyuEeWsIeCE8AeYI " elementId="newWizardId" name= New Wizard"/>
  </commands>
  <commands xmi:id="_R2vj5_yuEeWs eCE8AeYIw" elementId="org.eclip e.ui.window.newWindow" commandN me="New Window" description="Op n another window" category="_R2 OCK_PERSPECTIVE_BAR=topRight
S OW_PROGRESS_ON_STARTUP=true
SH W_TRADITIONAL_STYLE_TABS=false eclipse.preferences.version=1
 howIntro=false
                                                                                                                                                                                                                                                                                                                                                                                _ALWAYS_FALSE_ON_TYPE=ignore
o g.eclipse.jst.jsf.core.VALUE_EX RESSION_EXPECTED=warning
                                                                                                                                                                                                                                                                                                                                                                                                                                      ePerspective" commandName="Cust mize Perspective" description=" ustomize the current perspectiv " category="_R2coDfyuEeWsIeCE8A YIw"/>
  <commands xmi:id="_R2 j7vyuEeWsIeCE8AeYIw" elementId= org.eclipse.mylyn.context.ui.co mands.interest.decrement" comma dName="Make Less Interesting" d scription="Make Less Interestin " category="_R2coB_yuEeWsIeCE8A YIw"/>
  <commands xmi:id="_R2 j7_yuEeWsIeCE8AeYIw" elementId= org.eclipse.ui.externaltools.Ex ernalToolMenuDelegateToolbar" c mmandName="Run Last Launched Ex ernal Tool" description="Runs t e last launched external Tool"  ategory="_R2coEfyuEeWsIeCE8AeYI "/>
  <commands xmi:id="_R2vj8 yuEeWsIeCE8AeYIw" elementId="or .eclipse.jdt.ui.edit.text.java. earch.occurrences.in.file" comm ndName="Search All Occurrences  n File" description="Search for all occurrences of the selected element in its declaring file"  ategory="_R2coMvyuEeWsIeCE8AeYI "/>
  <commands xmi:id="_R2vj8 yuEeWsIeCE8AeYIw" elementId="or .eclipse.egit.ui.CheckoutComman " commandName="Checkout" catego � w                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           covery.commands.DirectoryParame er" name="Directory URL"/>
    <parameters xmi:id="_R2vj9fyuEe sIeCE8AeYIw" elementId="org.ecl pse.equinox.p2.ui.discovery.com ands.TagsParameter" name="Tags" >
  </commands>
  <commands x i:id="_R2vj9vyuEeWsIeCE8AeYIw"  lementId="org.eclipse.jdt.ui.ed t.text.java.gotoBreadcrumb" com andName="Show In Breadcrumb" de cription="Shows the Java editor breadcrumb and sets the keyboar  focus into it" category="_R2co vyuEeWsIeCE8AeYIw"/>
  <comman s xmi:id="_R2vj9_yuEeWsIeCE8AeY w" elementId="org.eclipse.pde.u .runtimeWorkbenchShortcut.debug  commandName="Debug Eclipse App ication" description="Debug Ecl pse Application" category="_R2c EfyuEeWsIeCE8AeYIw"/>
  <comma ds xmi:id="_R2vj-PyuEeWsIeCE8Ae Iw" elementId="org.eclipse.jpt. pa.ui.makePersistent" commandNa e="Make Persistent..." category "_R2coHPyuEeWsIeCE8AeYIw"/>
   commands xmi:id="_R2vj-fyuEeWsI CE8AeYIw" elementId="org.eclips .datatools.sqltools.sqleditor.E ecuteSelectionAction" commandNa e="Execute Selected Text" categ ry="_R2coNPyuEeWsIeCE8AeYIw"/>   <commands xmi:id="_R2vj-vyuEe sIeCE8AeYIw" elementId="org.ecl pse.jpt.jaxb.ui.command.createP ckageInfo" commandName="Create  ackage-info.java" category="_R2 oHPyuEeWsIeCE8AeYIw"/>
  <comm nds xmi:id="_R2vj-_yuEeWsIeCE8A YIw" elementId="org.eclipse.jdt ui.edit.text.java.extract.class  commandName="Extract Class..." description="Extracts fields in o a new class" category="_R2coL yuEeWsIeCE8AeYIw"/>
  <command  xmi:id="_R2vj_PyuEeWsIeCE8AeYI " elementId="org.eclipse.jdt.ui ?xml version="1.0" encoding="UT -8" standalone="no"?>
<fileset >
  <fileset excludes="" folde ="${jboss_config_dir}/conf" inc udes="jboss-log4j.xml" name="Lo 4j.xml"/>
</filesets>
                                                                                                                                                                                                                                                                                                                                        "false"/>
  </commands>
  <co mands xmi:id="_R2vj__yuEeWsIeCE AeYIw" elementId="org.eclipse.c mpare.copyRightToLeft" commandN me="Copy from Right to Left" de cription="Copy Current Change f om Right to Left" category="_R2 oKvyuEeWsIeCE8AeYIw"/>
  <comm nds xmi:id="_R2vkAPyuEeWsIeCE8A YIw" elementId="org.eclipse.deb g.ui.commands.OpenProfileConfig rations" commandName="Profile.. " description="Open profile lau ch configuration dialog" catego y="_R2coEfyuEeWsIeCE8AeYIw"/>
  <commands xmi:id="_R2vkAfyuEeW IeCE8AeYIw" elementId="org.ecli se.jpt.jpa.ui.newMappingFile" c mmandName="JPA ORM Mapping File  category="_R2coHPyuEeWsIeCE8Ae Iw"/>
  <commands xmi:id="_R2v AvyuEeWsIeCE8AeYIw" elementId=" rg.eclipse.ui.ide.markCompleted  commandName="Mark Completed" d scription="Mark the selected ta ks as completed" category="_R2c HPyuEeWsIeCE8AeYIw"/>
  <comma ds xmi:id="_R2vkA_yuEeWsIeCE8Ae Iw" elementId="org.eclipse.wst. sdt.ui.edit.text.java.comment"  ommandName="Comment" descriptio ="Turn the selected lines into  avaScript comments" category="_ 2coCPyuEeWsIeCE8AeYIw"/>
  <co mands xmi:id="_R2vkBPyuEeWsIeCE AeYIw" elementId="org.eclipse.u .edit.text.recenter" commandNam ="Recenter" description="Scroll cursor line to center, top and  ottom" category="_R2coBvyuEeWsI CE8AeYIw"/>
  <commands xmi:id "_R2vkBfyuEeWsIeCE8AeYIw" eleme tId="org.eclipse.jpt.jpa.ui.xml ileUpgradeToLatestVersion" comm ndName="Upgrade JPA Document Ve sion" category="_R2coHPyuEeWsIe E8AeYIw"/>
  <commands xmi:id= _R2vkBvyuEeWsIeCE8AeYIw" elemen clipse.preferences.version=1
m grated.task.repositories.secure store=true
org.eclipse.mylyn.t sks.ui.filters.nonmatching=true 
org.eclipse.mylyn.tasks.ui.fil ers.nonmatching.encouraged=true 
                                                                                                                                                                                                                                                                                                                               r Visibility" description="Togg es the visibility of the window toolbar" category="_R2coDfyuEeW IeCE8AeYIw"/>
  <commands xmi: d="_R2vkCfyuEeWsIeCE8AeYIw" ele entId="org.eclipse.wst.jsdt.ui. avigate.open.type.in.hierarchy" commandName="Open Type in Hiera chy" description="Open a type i  the type hierarchy view" categ ry="_R2coJvyuEeWsIeCE8AeYIw"/>   <commands xmi:id="_R2vkCvyuEe sIeCE8AeYIw" elementId="org.ecl pse.wst.sse.ui.outline.customFi ter" commandName="&amp;Filters" category="_R2coHPyuEeWsIeCE8AeY w"/>
  <commands xmi:id="_R2vk _yuEeWsIeCE8AeYIw" elementId="c m.google.gdt.eclipse.drive.impo tAppsScriptProject" commandName "Import Apps Script Project" ca egory="_R2coHPyuEeWsIeCE8AeYIw" >
  <commands xmi:id="_R2vkDPy EeWsIeCE8AeYIw" elementId="org. clipse.datatools.sqltools.sqlsc apbook.commands.openscrapbook"  ommandName="Open SQL Scrapboo&a p;k" category="_R2coHPyuEeWsIeC 8AeYIw"/>
  <commands xmi:id=" R2vkDfyuEeWsIeCE8AeYIw" element d="org.eclipse.ui.navigate.open esource" commandName="Open Reso rce" description="Open an edito  on a particular resource" cate ory="_R2coJvyuEeWsIeCE8AeYIw">     <parameters xmi:id="_R2vkDv uEeWsIeCE8AeYIw" elementId="fil Path" name="File Path" typeId=" rg.eclipse.ui.ide.resourcePath" >
  </commands>
  <commands x i:id="_R2vkD_yuEeWsIeCE8AeYIw"  lementId="org.jboss.tools.opens ift.common.ui.command.editconne tion" commandName="Edit Connect on..." category="_R2coHPyuEeWsI CE8AeYIw"/>
  <commands xmi:id "_R2vkEPyuEeWsIeCE8AeYIw" eleme tId="org.eclipse.wst.jsdt.ui.co clipse.preferences.version=1
v rsion=1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ementId="org.eclipse.egit.ui.te m.CompareWithCommit" commandNam ="org.eclipse.egit.ui.team.Comp reWithCommit"/>
  <commands xm :id="_TICLsfyuEeWsIeCE8AeYIw" e ementId="org.eclipse.egit.ui.te m.CompareWithRevision" commandN me="org.eclipse.egit.ui.team.Co pareWithRevision"/>
  <command  xmi:id="_TICLsvyuEeWsIeCE8AeYI " elementId="org.eclipse.egit.u .team.ReplaceWithPrevious" comm ndName="org.eclipse.egit.ui.tea .ReplaceWithPrevious"/>
  <com ands xmi:id="_Uq9XAPyuEeWsIeCE8 eYIw" elementId="AUTOGEN:::org. clipse.ant.ui.actionSet.present tion/org.eclipse.ant.ui.toggleA toReconcile" commandName="Toggl  Ant Editor Auto Reconcile" des ription="Toggle Ant Editor Auto Reconcile" category="_R2coHPyuE WsIeCE8AeYIw"/>
  <commands xm :id="_Uq9XAfyuEeWsIeCE8AeYIw" e ementId="AUTOGEN:::org.eclipse. atatools.sqltools.sqlscrapbook. ctionSet/org.eclipse.datatools. qltools.sqlscrapbook.actions.Op nScrapbookAction" commandName=" pen SQL Scrapbook" description= Open scrapbook to edit SQL stat ments" category="_R2coHPyuEeWsI CE8AeYIw"/>
  <commands xmi:id "_Ur0SoPyuEeWsIeCE8AeYIw" eleme tId="AUTOGEN:::org.eclipse.debu .ui.launchActionSet/org.eclipse debug.internal.ui.actions.RunWi hConfigurationAction" commandNa e="Run As" category="_R2coHPyuE WsIeCE8AeYIw"/>
  <commands xm :id="_Ur05sPyuEeWsIeCE8AeYIw" e ementId="AUTOGEN:::org.eclipse. ebug.ui.launchActionSet/org.ecl pse.debug.internal.ui.actions.R nHistoryMenuAction" commandName "Run History" category="_R2coHP uEeWsIeCE8AeYIw"/>
  <commands xmi:id="_Ur1gwPyuEeWsIeCE8AeYIw ?xml version="1.0" encoding="UT -8" standalone="no"?>
<fileset >
  <fileset excludes="" folde ="${jboss_config_dir}" includes "${jboss_config_file}" name="Co figuration File"/>
</filesets> 
                                                                                                                                                                                                                                                                                                                               clipse.debug.internal.ui.action .DebugHistoryMenuAction" comman Name="Debug History" category=" R2coHPyuEeWsIeCE8AeYIw"/>
  <c mmands xmi:id="_Ur2u4PyuEeWsIeC 8AeYIw" elementId="AUTOGEN:::or .eclipse.debug.ui.launchActionS t/org.eclipse.debug.internal.ui actions.DebugDropDownAction" co mandName="Debug" category="_R2c HPyuEeWsIeCE8AeYIw"/>
  <comma ds xmi:id="_Ur2u4fyuEeWsIeCE8Ae Iw" elementId="AUTOGEN:::org.ec ipse.debug.ui.profileActionSet/ rg.eclipse.debug.internal.ui.ac ions.ProfileDropDownAction" com andName="Profile" category="_R2 oHPyuEeWsIeCE8AeYIw"/>
  <comm nds xmi:id="_Ur3V8PyuEeWsIeCE8A YIw" elementId="AUTOGEN:::org.e lipse.debug.ui.profileActionSet org.eclipse.debug.internal.ui.a tions.ProfileWithConfigurationA tion" commandName="Profile As"  ategory="_R2coHPyuEeWsIeCE8AeYI "/>
  <commands xmi:id="_Ur3V8 yuEeWsIeCE8AeYIw" elementId="AU OGEN:::org.eclipse.debug.ui.pro ileActionSet/org.eclipse.debug. nternal.ui.actions.ProfileHisto yMenuAction" commandName="Profi e History" category="_R2coHPyuE WsIeCE8AeYIw"/>
  <commands xm :id="_UtE24PyuEeWsIeCE8AeYIw" e ementId="AUTOGEN:::org.eclipse. dt.ui.JavaElementCreationAction et/org.eclipse.jdt.ui.actions.N wTypeDropDown" commandName="Cla s..." description="New Java Cla s" category="_R2coHPyuEeWsIeCE8 eYIw"/>
  <commands xmi:id="_U E24fyuEeWsIeCE8AeYIw" elementId "AUTOGEN:::org.eclipse.jdt.ui.J vaElementCreationActionSet/org. clipse.jdt.ui.actions.OpenPacka eWizard" commandName="Package.. " description="New Java Package  category="_R2coHPyuEeWsIeCE8Ae clipse.preferences.version=1
r moteHelpHost=www-01.ibm.com
re oteHelpICEnabled=true
remoteHe pName=WebSphere Application Ser er Developer Tools
remoteHelpO =true
remoteHelpPath=/support/ nowledgecenter/SSHR6W_8.5.5
re oteHelpPort=80
remoteHelpPrefe red=true
remoteHelpProtocol=ht p
                                                                                                                                                                                                                             AeYIw" elementId="AUTOGEN:::org eclipse.jst.j2ee.J2eeMainAction et/org.eclipse.jst.j2ee.interna .actions.NewJavaEEArtifact" com andName="Servlet" description=" reate a new Servlet" category=" R2coHPyuEeWsIeCE8AeYIw"/>
  <c mmands xmi:id="_UtE25fyuEeWsIeC 8AeYIw" elementId="AUTOGEN:::or .eclipse.jst.j2ee.J2eeMainActio Set/org.eclipse.jst.j2ee.intern l.actions.NewJavaEEProject" com andName="Dynamic Web Project" d scription="Create a Dynamic Web project" category="_R2coHPyuEeW IeCE8AeYIw"/>
  <commands xmi: d="_UtE25vyuEeWsIeCE8AeYIw" ele entId="AUTOGEN:::org.eclipse.my yn.java.actionSet.browsing/org. clipse.mylyn.java.ui.actions.Ap lyMylynToBrowsingPerspectiveAct on" commandName="Focus Browsing Perspective" description="Focus Java Browsing Views on Active T sk" category="_R2coHPyuEeWsIeCE AeYIw"/>
  <commands xmi:id="_ tE25_yuEeWsIeCE8AeYIw" elementI ="AUTOGEN:::org.eclipse.mylyn.d c.actionSet/org.eclipse.mylyn.t sks.ui.bug.report" commandName= Report Bug or Enhancement..." d scription="Report Bug or Enhanc ment" category="_R2coHPyuEeWsIe E8AeYIw"/>
  <commands xmi:id= _UtE26PyuEeWsIeCE8AeYIw" elemen Id="AUTOGEN:::org.eclipse.mylyn tasks.ui.navigation.additions/o g.eclipse.mylyn.tasks.ui.naviga e.task.history" commandName="Ac ivate Previous Task" descriptio ="Activate Previous Task" categ ry="_R2coHPyuEeWsIeCE8AeYIw"/>   <commands xmi:id="_UtE26fyuEe sIeCE8AeYIw" elementId="AUTOGEN ::org.eclipse.pde.ui.SearchActi nSet/org.eclipse.pde.ui.actions OpenPluginSearchPage" commandNa e="Plug-in..." category="_R2coH dkRegistrants_1449597500412=
e lipse.preferences.version=1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                   .eclipse.rse.core=true
clearDe ta_oracle.eclipse.tools.common. ervices=true
clearDelta_org.ec ipse.rse.files.ui=true
clearDe ta_org.eclipse.pde.core=true
� ��#� Q�{�w�@���#� %�磓�# aster table
#Thu Apr 28 09:44: 5 BRT 2016
saveNumber_oracle.e lipse.tools.common.services=1
 learDelta_org.eclipse.debug.cor =false
clearDelta_org.eclipse. st.jsp.core=false
/.tree=1
cl arDelta_org.eclipse.mylyn.tasks ui=false
clearDelta_org.eclips .jdt.core=false
clearDelta_org eclipse.wst.validation=false
d ltaExpiration_org.eclipse.jst.j p.core=1461847465883
clearDelt _org.eclipse.jdt.launching=fals 
deltaExpiration_oracle.eclips .tools.common.services=14618474 5883
deltaExpiration_org.eclip e.jdt.core=1461847465883
clear elta_org.eclipse.rse.core=false 
clearDelta_oracle.eclipse.tool .common.services=false
clearDe ta_org.eclipse.rse.files.ui=fal e
clearDelta_org.eclipse.pde.c re=false
�X��#� Q�{�w�                                                                                                      eCE8AeYIw"/>
  <commands xmi:i ="_UtPO8PyuEeWsIeCE8AeYIw" elem ntId="AUTOGEN:::org.eclipse.wst jsdt.ui.JavaElementCreationActi nSet/org.eclipse.wst.jsdt.ui.ac ions.OpenFileWizard" commandNam ="JavaScript Source File" descr ption="New JavaScript file" cat gory="_R2coHPyuEeWsIeCE8AeYIw"/ 
  <commands xmi:id="_UtPO8fyu eWsIeCE8AeYIw" elementId="AUTOG N:::org.eclipse.wst.jsdt.ui.Jav ElementCreationActionSet/org.ec ipse.wst.jsdt.ui.actions.OpenPr jectWizard" commandName="JavaSc ipt Project..." description="Ne ?xml version="1.0" encoding="UT -8" standalone="no"?>
<fileset >
  <fileset excludes="" folde ="${jboss_config_dir}" includes "${jboss_config_file}" name="Co figuration File"/>
</filesets> 
                                                                                                                                                                                                                                                                                                                               tId="AUTOGEN:::org.eclipse.wst. erver.ui.new.actionSet/org.ecli se.wst.server.ui.action.new.ser er" commandName="Create Server" description="Create Server" cat gory="_R2coHPyuEeWsIeCE8AeYIw"/ 
  <commands xmi:id="_UtRrMPyu eWsIeCE8AeYIw" elementId="AUTOG N:::org.eclipse.wst.server.ui.i ternal.webbrowser.actionSet/org eclipse.wst.server.ui.internal. ebbrowser.action.open" commandN me="Open Web Browser" descripti n="Open Web Browser" category=" R2coHPyuEeWsIeCE8AeYIw"/>
  <c mmands xmi:id="_UtRrMfyuEeWsIeC 8AeYIw" elementId="AUTOGEN:::or .eclipse.wst.server.ui.internal webbrowser.actionSet/org.eclips .wst.server.ui.internal.webbrow er.action.switch" commandName=" eb Browser" description="Web Br wser" category="_R2coHPyuEeWsIe E8AeYIw"/>
  <commands xmi:id= _UtSSQPyuEeWsIeCE8AeYIw" elemen Id="AUTOGEN:::org.eclipse.wst.w b.ui.wizardsActionSet/org.eclip e.wst.web.ui.actions.newCSSFile  commandName="CSS" description= Create a new Cascading Style Sh et" category="_R2coHPyuEeWsIeCE AeYIw"/>
  <commands xmi:id="_ tSSQfyuEeWsIeCE8AeYIw" elementI ="AUTOGEN:::org.eclipse.wst.web ui.wizardsActionSet/org.eclipse wst.web.ui.actions.newJSFile" c mmandName="JavaScript" descript on="Create a new JavaScript fil " category="_R2coHPyuEeWsIeCE8A YIw"/>
  <commands xmi:id="_Ut SQvyuEeWsIeCE8AeYIw" elementId= AUTOGEN:::org.eclipse.wst.web.u .wizardsActionSet/org.eclipse.w t.web.ui.actions.newHTMLFile" c mmandName="HTML" description="C eate a new HTML page" category= _R2coHPyuEeWsIeCE8AeYIw"/>
  < ommands xmi:id="_UtSSQ_yuEeWsIe clipse.preferences.version=1
o g.eclipse.jdt.debug.PREF_REQUES _TIMEOUT=20000
                                                                                                                                                                                                                                                                                                                                                                                                                                                w" elementId="org.jboss.ide.ecl pse.packages.ui.actions.BuildAr hivesAction" commandName="Build Packages" category="_R2coHPyuEe sIeCE8AeYIw"/>
  <commands xmi id="_UtTgYfyuEeWsIeCE8AeYIw" el mentId="AUTOGEN:::org.jboss.too s.jst.web.ui.server.actionSet/o g.jboss.tools.jst.web.ui.action server.SelectServerActionDelega e" commandName="label1" descrip ion="JBoss Tools WTP Server Act ons" category="_R2coHPyuEeWsIeC 8AeYIw"/>
  <commands xmi:id=" UtUHcPyuEeWsIeCE8AeYIw" element d="AUTOGEN:::org.jboss.tools.js .web.ui.server.actionSet/org.jb ss.tools.jst.web.ui.action.serv r.ChangeTimeStampActionDelegate  commandName="label2" descripti n="Touch descriptors" category= _R2coHPyuEeWsIeCE8AeYIw"/>
  < ommands xmi:id="_UtUHcfyuEeWsIe E8AeYIw" elementId="AUTOGEN:::o g.jboss.tools.jst.web.ui.server actionSet/org.jboss.tools.jst.w b.ui.action.server.StopServerAc ionDelegate" commandName="label " description="Stop Server" cat gory="_R2coHPyuEeWsIeCE8AeYIw"/ 
  <commands xmi:id="_UtUHcvyu eWsIeCE8AeYIw" elementId="AUTOG N:::org.jboss.tools.jst.web.ui. erver.actionSet/org.jboss.tools jst.web.ui.action.server.DebugS rverActionDelegate" commandName "label6" description="Start Ser er" category="_R2coHPyuEeWsIeCE AeYIw"/>
  <commands xmi:id="_ tUugPyuEeWsIeCE8AeYIw" elementI ="AUTOGEN:::org.jboss.tools.jst web.ui.server.actionSet/org.jbo s.tools.jst.web.ui.action.serve .RunServerActionDelegate" comma dName="label7" description="Sta t Server" category="_R2coHPyuEe sIeCE8AeYIw"/>
  <commands xmi id="_UtUugfyuEeWsIeCE8AeYIw" el            �|M�H�H }M�H7     .          �|M�H�H }M�H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     howIntroEditor=false
eclipse.p eferences.version=1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                           emf.importer.genModelEditorCont ibution/org.eclipse.emf.importe .ui.GenModelReloadActionDelegat .Editor" commandName="Reload...  category="_R2coHPyuEeWsIeCE8Ae Iw"/>
  <commands xmi:id="_UtY 8fyuEeWsIeCE8AeYIw" elementId=" UTOGEN:::org.eclipse.emf.mappin .ecore2ecore.presentation.Ecore EcoreContributionID/org.eclipse emf.mapping.action.RemoveMappin ActionID" commandName="Remove M pping" description="Remove the  apping associated with the sele ted objects." category="_R2coHP uEeWsIeCE8AeYIw"/>
  <commands xmi:id="_UtY_8vyuEeWsIeCE8AeYIw  elementId="AUTOGEN:::org.eclip e.emf.mapping.ecore2ecore.prese tation.Ecore2EcoreContributionI /org.eclipse.emf.mapping.action TypeMatchMappingActionID" comma dName="Match Mapping by Type" d scription="Create child mapping  automatically by type." catego y="_R2coHPyuEeWsIeCE8AeYIw"/>
  <commands xmi:id="_UtZnAPyuEeW IeCE8AeYIw" elementId="AUTOGEN: :org.eclipse.emf.mapping.ecore2 core.presentation.Ecore2EcoreCo tributionID/org.eclipse.emf.map ing.action.NameMatchMappingActi nID" commandName="Match Mapping by Name" description="Create ch ld mappings automatically by na e." category="_R2coHPyuEeWsIeCE AeYIw"/>
  <commands xmi:id="_ tZnAfyuEeWsIeCE8AeYIw" elementI ="AUTOGEN:::org.eclipse.emf.map ing.ecore2ecore.presentation.Ec re2EcoreContributionID/org.ecli se.emf.mapping.action.CreateOne idedMappingActionID" commandNam ="Create One-sided Mapping" des ription="Create a new mapping f r the selected object." categor ="_R2coHPyuEeWsIeCE8AeYIw"/>
  <commands xmi:id="_UtZnAvyuEeWs ?xml version="1.0" encoding="UT -8" standalone="no"?>
<fileset >
  <fileset excludes="" folde ="${jboss_config_dir}" includes "${jboss_config_file}" name="Co figuration File"/>
</filesets> 
                                                                                                                                                                                                                                                                                                                               Add Output Root..." description "Add new output root." category "_R2coHPyuEeWsIeCE8AeYIw"/>
   commands xmi:id="_UtaOEfyuEeWsI CE8AeYIw" elementId="AUTOGEN::: rg.eclipse.emf.mapping.ecore2ec re.presentation.Ecore2EcoreCont ibutionID/org.eclipse.emf.mappi g.ecore2ecore.action.AddInputRo tActionID" commandName="Add Inp t Root..." description="Add new input root." category="_R2coHPy EeWsIeCE8AeYIw"/>
  <commands  mi:id="_Uta1IPyuEeWsIeCE8AeYIw" elementId="AUTOGEN:::org.eclips .jdt.debug.CompilationUnitEdito .BreakpointRulerActions/org.ecl pse.jdt.debug.ui.actions.Manage reakpointRulerAction" commandNa e="Toggle Breakpoint" category= _R2coHPyuEeWsIeCE8AeYIw"/>
  < ommands xmi:id="_Uta1IfyuEeWsIe E8AeYIw" elementId="AUTOGEN:::o g.eclipse.jdt.debug.ClassFileEd tor.BreakpointRulerActions/org. clipse.jdt.debug.ui.actions.Man geBreakpointRulerAction" comman Name="Toggle Breakpoint" catego y="_R2coHPyuEeWsIeCE8AeYIw"/>
  <commands xmi:id="_Uta1IvyuEeW IeCE8AeYIw" elementId="AUTOGEN: :org.eclipse.jdt.debug.ui.JavaS ippetToolbarActions/org.eclipse jdt.debug.ui.SnippetExecute" co mandName="Execute" description= Execute the Selected Text" cate ory="_R2coHPyuEeWsIeCE8AeYIw"/> 
  <commands xmi:id="_Ut3hEPyuE WsIeCE8AeYIw" elementId="AUTOGE :::org.eclipse.jdt.debug.ui.Jav SnippetToolbarActions/org.eclip e.jdt.debug.ui.SnippetDisplay"  ommandName="Display" descriptio ="Display Result of Evaluating  elected Text" category="_R2coHP uEeWsIeCE8AeYIw"/>
  <commands xmi:id="_Ut4IIPyuEeWsIeCE8AeYIw  elementId="AUTOGEN:::org.eclip ?xml version="1.0" encoding="UT -8" standalone="no"?>
<fileset >
  <fileset excludes="" folde ="${jboss_config_dir}/conf" inc udes="jboss-log4j.xml" name="Lo 4j.xml"/>
</filesets>
                                                                                                                                                                                                                                                                                                                                        8AeYIw" elementId="AUTOGEN:::or .eclipse.jdt.internal.ui.Compil tionUnitEditor.ruler.actions/or .eclipse.jdt.internal.ui.javaed tor.JavaSelectRulerAction" comm ndName="Java Editor Ruler Singl -Click" category="_R2coHPyuEeWs eCE8AeYIw"/>
  <commands xmi:i ="_Ut4II_yuEeWsIeCE8AeYIw" elem ntId="AUTOGEN:::org.eclipse.jdt internal.ui.ClassFileEditor.rul r.actions/org.eclipse.jdt.inter al.ui.javaeditor.JavaSelectRule Action" commandName="Java Edito  Ruler Single-Click" category=" R2coHPyuEeWsIeCE8AeYIw"/>
  <c mmands xmi:id="_Ut4vMPyuEeWsIeC 8AeYIw" elementId="AUTOGEN:::or .eclipse.jdt.internal.ui.Proper iesFileEditor.ruler.actions/org eclipse.jdt.internal.ui.propert esfileeditor.BookmarkRulerActio " commandName="Java Editor Book ark Ruler Action" category="_R2 oHPyuEeWsIeCE8AeYIw"/>
  <comm nds xmi:id="_Ut4vMfyuEeWsIeCE8A YIw" elementId="AUTOGEN:::org.e lipse.jdt.internal.ui.Propertie FileEditor.ruler.actions/org.ec ipse.jdt.internal.ui.properties ileeditor.SelectRulerAction" co mandName="Java Editor Ruler Sin le-Click" category="_R2coHPyuEe sIeCE8AeYIw"/>
  <commands xmi id="_Ut5WQPyuEeWsIeCE8AeYIw" el mentId="AUTOGEN:::org.eclipse.j t.jsp.core.jspsource.ruler.acti ns/org.eclipse.ui.texteditor.Bo kmarkRulerAction" commandName=" dd Bookmark..." category="_R2co PyuEeWsIeCE8AeYIw"/>
  <comman s xmi:id="_Ut59UPyuEeWsIeCE8AeY w" elementId="AUTOGEN:::org.ecl pse.jst.jsp.core.jspsource.rule .actions/org.eclipse.ui.textedi or.SelectRulerAction" commandNa e="Select Ruler" category="_R2c HPyuEeWsIeCE8AeYIw"/>
  <comma .javaee.cdi.ui.internal.quickfi .CDIUtils.isJavaVersionSupporte (CDIUtils.java:177)
	at com.ib .etools.javaee.cdi.ui.quickfix. ddCDISupportQuickFixProcessor.g tCorrections(AddCDISupportQuick ixProcessor.java:46)
	at org.e lipse.jdt.internal.ui.text.corr ction.JavaCorrectionProcessor$S feCorrectionCollector.safeRun(J vaCorrectionProcessor.java:378) 
	at org.eclipse.jdt.internal.u .text.correction.JavaCorrection rocessor$SafeCorrectionProcesso Access.run(JavaCorrectionProces or.java:339)
	at org.eclipse.c re.runtime.SafeRunner.run(SafeR nner.java:42)
	at org.eclipse. dt.internal.ui.text.correction. avaCorrectionProcessor$SafeCorr ctionProcessorAccess.process(Ja aCorrectionProcessor.java:335) 	at org.eclipse.jdt.internal.ui text.correction.JavaCorrectionP ocessor.collectCorrections(Java orrectionProcessor.java:468)
	 t org.eclipse.jdt.internal.ui.t xt.java.hover.ProblemHover$Prob emInfo.getJavaAnnotationFixes(P oblemHover.java:225)
	at org.e lipse.jdt.internal.ui.text.java hover.ProblemHover$ProblemInfo. etCompletionProposals(ProblemHo er.java:199)
	at org.eclipse.j t.internal.ui.text.java.hover.A stractAnnotationHover$Annotatio InformationControl.deferredCrea eContent(AbstractAnnotationHove .java:285)
	at org.eclipse.jdt internal.ui.text.java.hover.Abs ractAnnotationHover$AnnotationI formationControl.setInput(Abstr ctAnnotationHover.java:186)
	a  org.eclipse.jface.text.Abstrac InformationControlManager.inter alShowInformationControl(Abstra tInformationControlManager.java 1181)
	at org.eclipse.jface.te t.AbstractInformationControlMan ger.presentInformation(Abstract nformationControlManager.java:1 50)
	at org.eclipse.jface.text AbstractHoverInformationControl anager.presentInformation(Abstr ctHoverInformationControlManage .java:902)
	at org.eclipse.jfa e.text.TextViewerHoverManager.d PresentInformation(TextViewerHo erManager.java:243)
	at org.ec ipse.jface.text.TextViewerHover anager$5.run(TextViewerHoverMan ger.java:233)
	at org.eclipse. wt.widgets.RunnableLock.run(Run ableLock.java:35)
	at org.ecli se.swt.widgets.Synchronizer.run syncMessages(Synchronizer.java: 35)
	at org.eclipse.swt.widget .Display.runAsyncMessages(Displ y.java:4155)
	at org.eclipse.s t.widgets.Display.readAndDispat h(Display.java:3772)
	at org.e lipse.e4.ui.internal.workbench. wt.PartRenderingEngine$4.run(Pa tRenderingEngine.java:1127)
	a  org.eclipse.core.databinding.o servable.Realm.runWithDefault(R alm.java:337)
	at org.eclipse. 4.ui.internal.workbench.swt.Par RenderingEngine.run(PartRenderi gEngine.java:1018)
	at org.ecl pse.e4.ui.internal.workbench.E4 orkbench.createAndRunUI(E4Workb nch.java:156)
	at org.eclipse. i.internal.Workbench$5.run(Work ench.java:654)
	at org.eclipse core.databinding.observable.Rea m.runWithDefault(Realm.java:337 
	at org.eclipse.ui.internal.W rkbench.createAndRunWorkbench(W rkbench.java:598)
	at org.ecli se.ui.PlatformUI.createAndRunWo kbench(PlatformUI.java:150)
	a  org.eclipse.ui.internal.ide.ap lication.IDEApplication.start(I EApplication.java:139)
	at org eclipse.equinox.internal.app.Ec ipseAppHandle.run(EclipseAppHan le.java:196)
	at org.eclipse.c re.runtime.internal.adaptor.Ecl pseAppLauncher.runApplication(E lipseAppLauncher.java:134)
	at org.eclipse.core.runtime.intern l.adaptor.EclipseAppLauncher.st rt(EclipseAppLauncher.java:104) 
	at org.eclipse.core.runtime.a aptor.EclipseStarter.run(Eclips Starter.java:380)
	at org.ecli se.core.runtime.adaptor.Eclipse tarter.run(EclipseStarter.java: 35)
	at sun.reflect.NativeMeth dAccessorImpl.invoke0(Native Me hod)
	at sun.reflect.NativeMet odAccessorImpl.invoke(Unknown S urce)
	at sun.reflect.Delegati gMethodAccessorImpl.invoke(Unkn wn Source)
	at java.lang.refle t.Method.invoke(Unknown Source) 
	at org.eclipse.equinox.launch r.Main.invokeFramework(Main.jav :669)
	at org.eclipse.equinox. auncher.Main.basicRun(Main.java 608)
	at org.eclipse.equinox.l uncher.Main.run(Main.java:1515) 
Caused by: java.lang.IllegalAr umentException: Project facet c m.ibm.etools.javaee.cdi has not been defined.
	at org.eclipse. st.common.project.facet.core.in ernal.FacetedProjectFrameworkIm l.getProjectFacet(FacetedProjec FrameworkImpl.java:234)
	at or .eclipse.wst.common.project.fac t.core.ProjectFacetsManager.get rojectFacet(ProjectFacetsManage .java:75)
	at com.ibm.etools.j vaee.cdi.ui.internal.quickfix.C IFacet.<init>(CDIFacet.java:46) 
	at com.ibm.etools.javaee.cdi. i.internal.quickfix.CDIFacet.<c init>(CDIFacet.java:31)
	... 4  more

!ENTRY org.eclipse.jdt ui 4 10001 2016-04-28 09:21:59. 58
!MESSAGE Internal Error
!S ACK 1
Java Model Exception: ja ax.net.ssl.SSLHandshakeExceptio : sun.security.validator.Valida orException: PKIX path building failed: sun.security.provider.c rtpath.SunCertPathBuilderExcept on: unable to find valid certif cation path to requested target 
	at org.eclipse.jdt.internal.c re.JavaElement.getURLContents(J vaElement.java:928)
	at org.ec ipse.jdt.internal.core.BinaryTy e.getJavadocContents(BinaryType java:1039)
	at org.eclipse.jdt internal.core.BinaryMethod.getA tachedJavadoc(BinaryMethod.java 717)
	at org.eclipse.jdt.inter al.core.ResolvedBinaryMethod.ge AttachedJavadoc(ResolvedBinaryM thod.java:1)
	at org.eclipse.j t.internal.ui.text.javadoc.Java ocContentAccess2.getHTMLContent JavadocContentAccess2.java:533) 
	at org.eclipse.jdt.internal.u .text.java.hover.JavadocHover.g tHoverInfo(JavadocHover.java:72 )
	at org.eclipse.jdt.internal ui.text.java.hover.JavadocHover internalGetHoverInfo(JavadocHov r.java:639)
	at org.eclipse.jd .internal.ui.text.java.hover.Ja adocHover.getHoverInfo2(Javadoc over.java:631)
	at org.eclipse jdt.internal.ui.text.java.hover BestMatchHover.getHoverInfo2(Be tMatchHover.java:163)
	at org. clipse.jdt.internal.ui.text.jav .hover.BestMatchHover.getHoverI fo2(BestMatchHover.java:129)
	 t org.eclipse.jdt.internal.ui.t xt.java.hover.JavaEditorTextHov rProxy.getHoverInfo2(JavaEditor extHoverProxy.java:85)
	at org eclipse.jface.text.TextViewerHo erManager$4.run(TextViewerHover anager.java:166)
Caused by: ja ax.net.ssl.SSLHandshakeExceptio : sun.security.validator.Valida orException: PKIX path building .reflect.NativeMethodAccessorIm l.invoke0(Native Method)
	at s n.reflect.NativeMethodAccessorI pl.invoke(Unknown Source)
	at  un.reflect.DelegatingMethodAcce sorImpl.invoke(Unknown Source) 	at java.lang.reflect.Method.in oke(Unknown Source)
	at org.ec ipse.recommenders.internal.rcp. cpModule$Listener$1.executeMeth d(RcpModule.java:293)
	at org. clipse.recommenders.internal.rc .RcpModule$Listener$1.access$0( cpModule.java:290)
	at org.ecl pse.recommenders.internal.rcp.R pModule$Listener$1$1.postShutdo n(RcpModule.java:309)
	at org. clipse.ui.internal.Workbench$8. un(Workbench.java:971)
	at org eclipse.core.runtime.SafeRunner run(SafeRunner.java:42)
	at or .eclipse.ui.internal.JFaceUtil$ .run(JFaceUtil.java:50)
	at or .eclipse.jface.util.SafeRunnabl .run(SafeRunnable.java:173)
	a  org.eclipse.ui.internal.Workbe ch.firePostShutdown(Workbench.j va:968)
	at org.eclipse.ui.int rnal.Workbench.shutdown(Workben h.java:3152)
	at org.eclipse.u .internal.Workbench.busyClose(W rkbench.java:1161)
	at org.ecl pse.ui.internal.Workbench.acces $21(Workbench.java:1073)
	at o g.eclipse.ui.internal.Workbench 19.run(Workbench.java:1414)
	a  org.eclipse.swt.custom.BusyInd cator.showWhile(BusyIndicator.j va:70)
	at org.eclipse.ui.inte nal.Workbench.close(Workbench.j va:1411)
	at org.eclipse.ui.in ernal.Workbench.close(Workbench java:1384)
	at org.eclipse.ui. nternal.WorkbenchWindow.busyClo e(WorkbenchWindow.java:1571)
	 t org.eclipse.ui.internal.Workb nchWindow.access$16(WorkbenchWi dow.java:1542)
	at org.eclipse ui.internal.WorkbenchWindow$11. un(WorkbenchWindow.java:1603)
 at org.eclipse.swt.custom.BusyI dicator.showWhile(BusyIndicator java:70)
	at org.eclipse.ui.in ernal.WorkbenchWindow.close(Wor benchWindow.java:1600)
	at org eclipse.ui.internal.WorkbenchWi dow.close(WorkbenchWindow.java: 614)
	at org.eclipse.ui.intern l.WorkbenchWindow$6.close(Workb nchWindow.java:523)
	at org.ec ipse.e4.ui.workbench.renderers. wt.WBWRenderer$7.shellClosed(WB Renderer.java:518)
	at org.ecl pse.swt.widgets.TypedListener.h ndleEvent(TypedListener.java:98 
	at org.eclipse.swt.widgets.E entTable.sendEvent(EventTable.j va:84)
	at org.eclipse.swt.wid ets.Display.sendEvent(Display.j va:4362)
	at org.eclipse.swt.w dgets.Widget.sendEvent(Widget.j va:1113)
	at org.eclipse.swt.w dgets.Widget.sendEvent(Widget.j va:1137)
	at org.eclipse.swt.w dgets.Widget.sendEvent(Widget.j va:1122)
	at org.eclipse.swt.w dgets.Decorations.closeWidget(D corations.java:308)
	at org.ec ipse.swt.widgets.Decorations.WM CLOSE(Decorations.java:1703)
	 t org.eclipse.swt.widgets.Contr l.windowProc(Control.java:4678) 
	at org.eclipse.swt.widgets.Ca vas.windowProc(Canvas.java:339) 
	at org.eclipse.swt.widgets.De orations.windowProc(Decorations java:1633)
	at org.eclipse.swt widgets.Shell.windowProc(Shell. ava:2117)
	at org.eclipse.swt. idgets.Display.windowProc(Displ y.java:5050)
	at org.eclipse.s t.internal.win32.OS.DefWindowPr cW(Native Method)
	at org.ecli se.swt.internal.win32.OS.DefWin owProc(OS.java:2544)
	at org.e lipse.swt.widgets.Shell.callWin owProc(Shell.java:498)
	at org eclipse.swt.widgets.Control.win owProc(Control.java:4774)
	at  rg.eclipse.swt.widgets.Canvas.w ndowProc(Canvas.java:339)
	at  rg.eclipse.swt.widgets.Decorati ns.windowProc(Decorations.java: 633)
	at org.eclipse.swt.widge s.Shell.windowProc(Shell.java:2 17)
	at org.eclipse.swt.widget .Display.windowProc(Display.jav :5063)
	at org.eclipse.swt.int rnal.win32.OS.DispatchMessageW( ative Method)
	at org.eclipse. wt.internal.win32.OS.DispatchMe sage(OS.java:2549)
	at org.ecl pse.swt.widgets.Display.readAnd ispatch(Display.java:3767)
	at org.eclipse.e4.ui.internal.work ench.swt.PartRenderingEngine$4. un(PartRenderingEngine.java:112 )
	at org.eclipse.core.databin ing.observable.Realm.runWithDef ult(Realm.java:337)
	at org.ec ipse.e4.ui.internal.workbench.s t.PartRenderingEngine.run(PartR nderingEngine.java:1018)
	at o g.eclipse.e4.ui.internal.workbe ch.E4Workbench.createAndRunUI(E Workbench.java:156)
	at org.ec ipse.ui.internal.Workbench$5.ru (Workbench.java:654)
	at org.e lipse.core.databinding.observab e.Realm.runWithDefault(Realm.ja a:337)
	at org.eclipse.ui.inte nal.Workbench.createAndRunWorkb nch(Workbench.java:598)
	at or .eclipse.ui.PlatformUI.createAn RunWorkbench(PlatformUI.java:15 )
	at org.eclipse.ui.internal. de.application.IDEApplication.s art(IDEApplication.java:139)
	 t org.eclipse.equinox.internal. pp.EclipseAppHandle.run(Eclipse ppHandle.java:196)
	at org.ecl pse.core.runtime.internal.adapt r.EclipseAppLauncher.runApplica ion(EclipseAppLauncher.java:134 
	at org.eclipse.core.runtime. nternal.adaptor.EclipseAppLaunc er.start(EclipseAppLauncher.jav :104)
	at org.eclipse.core.run ime.adaptor.EclipseStarter.run( clipseStarter.java:380)
	at or .eclipse.core.runtime.adaptor.E lipseStarter.run(EclipseStarter java:235)
	at sun.reflect.Nati eMethodAccessorImpl.invoke0(Nat ve Method)
	at sun.reflect.Nat veMethodAccessorImpl.invoke(Unk own Source)
	at sun.reflect.De egatingMethodAccessorImpl.invok (Unknown Source)
	at java.lang reflect.Method.invoke(Unknown S urce)
	at org.eclipse.equinox. auncher.Main.invokeFramework(Ma n.java:669)
	at org.eclipse.eq inox.launcher.Main.basicRun(Mai .java:608)
	at org.eclipse.equ nox.launcher.Main.run(Main.java 1515)

!ENTRY com.google.gwt. clipse.core 4 0 2016-04-28 09:3 :50.169
!MESSAGE Could not sto  source viewer server.
!STACK  
java.lang.ExceptionInInitiali erError
	at com.google.gdt.ecl pse.platform.jetty.JettyServer. nitLogging(JettyServer.java:40) 
	at com.google.gdt.eclipse.pla form.jetty.JettyServer.<clinit> JettyServer.java:30)
	at com.g ogle.gwt.eclipse.core.GWTPlugin stop(GWTPlugin.java:147)
	at o g.eclipse.osgi.internal.framewo k.BundleContextImpl$4.run(Bundl ContextImpl.java:827)
	at org. clipse.osgi.internal.framework. undleContextImpl$4.run(BundleCo textImpl.java:1)
	at java.secu ity.AccessController.doPrivileg d(Native Method)
	at org.eclip e.osgi.internal.framework.Bundl ContextImpl.stop(BundleContextI pl.java:820)
	at org.eclipse.o gi.internal.framework.EquinoxBu dle.stopWorker0(EquinoxBundle.j va:955)
	at org.eclipse.osgi.i ternal.framework.EquinoxBundle$ quinoxModule.stopWorker(Equinox undle.java:323)
	at org.eclips .osgi.container.Module.doStop(M dule.java:626)
	at org.eclipse osgi.container.Module.stop(Modu e.java:488)
	at org.eclipse.os i.container.ModuleContainer$Con ainerStartLevel.decStartLevel(M duleContainer.java:1623)
	at o g.eclipse.osgi.container.Module ontainer$ContainerStartLevel.do ontainerStartLevel(ModuleContai er.java:1542)
	at org.eclipse. sgi.container.SystemModule.stop orker(SystemModule.java:248)
	 t org.eclipse.osgi.internal.fra ework.EquinoxBundle$SystemBundl $EquinoxSystemModule.stopWorker EquinoxBundle.java:144)
	at or .eclipse.osgi.container.Module. oStop(Module.java:626)
	at org eclipse.osgi.container.Module.s op(Module.java:488)
	at org.ec ipse.osgi.container.SystemModul .stop(SystemModule.java:186)
	 t org.eclipse.osgi.internal.fra ework.EquinoxBundle$SystemBundl $EquinoxSystemModule$1.run(Equi oxBundle.java:159)
	at java.la g.Thread.run(Unknown Source)
C used by: java.lang.IllegalArgum ntException: Logging bundle mus  not be null.
	at org.eclipse. ore.internal.runtime.Log.<init> Log.java:30)
	at org.eclipse.c re.internal.runtime.InternalPla form.getLog(InternalPlatform.ja a:351)
	at org.eclipse.core.ru time.Platform.getLog(Platform.j va:1017)
	at com.google.gdt.ec ipse.platform.jetty.JettyEclips Logger.<clinit>(JettyEclipseLog er.java:35)
	... 20 more
                                                                                                     mmands xmi:id="_UuBSFfyuEeWsIeC 8AeYIw" elementId="AUTOGEN:::or .eclipse.jdt.debug.ui.Expressio ViewActions/org.eclipse.jdt.deb g.ui.expressionViewActions.AllR ferencesInView" commandName="Sh w References" description="Show &amp;References" category="_R2c HPyuEeWsIeCE8AeYIw"/>
  <comma ds xmi:id="_UuBSFvyuEeWsIeCE8Ae Iw" elementId="AUTOGEN:::org.ec ipse.jdt.debug.ui.ExpressionVie Actions/org.eclipse.jdt.debug.u .variableViewActions.ShowNullEn ries" commandName="Show Null Ar ay Entries" description="Show N ations/GoogleInternal; <init>  ()V  
  	 this :Lcom/g ogle/appengine/repackaged/com/g ogle/common/base/X; 
assertTru  (Z)V java/lang/RuntimeExce tion  Assertion failed   (Ljava/lang/String;)V  
    b Z (ZLjava/lang/String;)  java/lang/StringBuilder 
   	 Assertion failed:   ap end -(Ljava/lang/String;)Ljava lang/StringBuilder;  
     toString ()Ljava/lang/String;  " #
  $ msg Ljava/lang/St ing; Code LocalVariableTabl  LineNumberTable 
SourceFile  RuntimeInvisibleAnnotations 1            (   /      � 
�    )            *        " 	    (   A     �  � Y� ��    )            *       )  *  , 	    (   \      � � Y� Y� � ! � !� %� ��    )                 & '  *       4  5  7  +     ,       PK
       ! ��ȯ  �  H   com/google/a pengine/repackaged/com/google/c mmon/base/XmlEscapers.class����   1 O Bcom/google/appengine/re ackaged/com/google/common/base/ mlEscapers  java/lang/Objec   XmlEscapers.java NLcom/g ogle/appengine/repackaged/com/g ogle/common/annotations/GoogleI ternal; MLcom/google/appengine repackaged/com/google/common/an otations/GwtCompatible; Gcom/g ogle/appengine/repackaged/com/g ogle/common/base/Escapers$Build r  ?com/google/appengine/rep ckaged/com/google/common/base/E capers 
 Builder MIN_ASCII CONTROL_CHAR C     MAX_ASC I_CONTROL_CHAR    XML_ESCAP R DLcom/google/appengine/repac aged/com/google/common/base/Cha Escaper; XML_CONTENT_ESCAPER <init> ()V  
   this DLcom/google/appengine/repackag d/com/google/common/base/XmlEsc pers; 
xmlEscaper F()Lcom/goo le/appengine/repackaged/com/goo le/common/base/CharEscaper;   	   xmlContentEscaper  	    <clinit> builder K()Lc m/google/appengine/repackaged/c m/google/common/base/Escapers$B ilder; # $
  %  �� setSafe ange M(CC)Lcom/google/appengin /repackaged/com/google/common/b se/Escapers$Builder; ( )
 	 *   , setUnsafeReplacement ]( java/lang/String;)Lcom/google/a pengine/repackaged/com/google/c mmon/base/Escapers$Builder; .  
 	 0 	addEscape ^(CLjava/lan /String;)Lcom/google/appengine/ epackaged/com/google/common/bas /Escapers$Builder; 2 3
 	 4  amp; 6 &lt; 8 &gt; : b ild B()Lcom/google/appengine/r packaged/com/google/common/base Escaper; < =
 	 > Bcom/google appengine/repackaged/com/google common/base/CharEscaper @ &a os; B &quot; D c ILcom/g ogle/appengine/repackaged/com/g ogle/common/base/Escapers$Build r; ConstantValue Code Loc lVariableTable LineNumberTabl  
SourceFile InnerClasses  untimeInvisibleAnnotations !           H         H                        /     *� �    J            K       . 	    I         � �    K       S 	    I         � !�    K       n  "   I   �     �  K*'� +W*-� 1W<� %	�  
� � *-� 5W`�<���*&7  5W*<9� 5W*>;� 5W*� ?� A� ! 'C� 5W*"E� 5W*� ?� A� �     J      ( F    z # G   K   >    t  y  {  �  � - � 5   = � F � O � X � b � k � t � ~    L     M   
  	    N           PK
      ! ��15)  5)  I   com/google/appengine/re ackaged/com/google/common/net/I etAddresses.class����   1� Cc m/google/appengine/repackaged/c m/google/common/net/InetAddress s  java/lang/Object  In tAddresses.java DLcom/google/a pengine/repackaged/com/google/c mmon/annotations/Beta; Ncom/go gle/appengine/repackaged/com/go gle/common/net/InetAddresses$Te edoInfo  
TeredoInfo IPV4_ ART_COUNT I    IPV6_PART_ OUNT    	LOOPBACK4 Ljava/n t/Inet4Address; ANY4 <init>  ()V  
   this ELcom/g ogle/appengine/repackaged/com/g ogle/common/net/InetAddresses; getInet4Address ([B)Ljava/ne /Inet4Address; java/net/Unkno nHostException  ;Byte array  as invalid length for an IPv4 a dress: %s != 4.  java/lang/ nteger  valueOf (I)Ljava/ ang/Integer;   !
  " Dcom/go gle/appengine/repackaged/com/go gle/common/base/Preconditions   checkArgument )(ZLjava/lang String;[Ljava/lang/Object;)V & '
 % ( java/net/InetAddress   getByAddress ([B)Ljava/net InetAddress; , -
 + . java/n t/Inet4Address 0 '%s' is not an IPv4 address. 2 getHostAd ress ()Ljava/lang/String; 4  
 + 6 java/lang/String 8 f rmat 9(Ljava/lang/String;[Ljav /lang/Object;)Ljava/lang/String  : ;
 9 < (Ljava/lang/String )V  >
  ? "java/lang/Illega ArgumentException A .Host add ess '%s' is not a valid IPv4 ad ress. C java/util/Arrays E toString ([B)Ljava/lang/Stri g; G H
 F I *(Ljava/lang/Stri g;Ljava/lang/Throwable;)V  K
 B L ipv4 Ljava/net/InetAddr ss; e Ljava/net/UnknownHost xception; bytes [B 	forStr ng *(Ljava/lang/String;)Ljava/ et/InetAddress; textToNumeric ormatV4 (Ljava/lang/String;)[  V W
  X textToNumericForma V6 Z W
  [ !'%s' is not an I  string literal. ]
 B ? '%s' is extremely broken. ` ipStr ng Ljava/lang/String; addr isInetAddress (Ljava/lang/St ing;)Z T U
  g $Ljava/lang/I legalArgumentException; java/ ang/NumberFormatException j   l contains (Ljava/lang/Ch rSequence;)Z n o
 9 p \. r split '(Ljava/lang/String;)[L ava/lang/String; t u
 9 v pa seInt (Ljava/lang/String;)I   y
  z 0 | 
startsWith ~  
 9  length ()I � �
 9 � piece i ex !Ljava/lang/Nu berFormatException; address  [Ljava/lang/String; ::: �   � convertDottedQuadToHex & Ljava/lang/String;)Ljava/lang/S ring; � �
  � java/nio/Byte uffer � allocate (I)Ljava/ io/ByteBuffer; � �
 � � ::   ((Ljava/lang/String;I)[Ljava/ ang/String; t �
 9 �   � e uals (Ljava/lang/Object;)Z � �
 9 � (Ljava/lang/String;I)I  x �
  � putShort (IS)Ljav /nio/ByteBuffer; � �
 � � ar ay ()[B � �
 � � parts 
p rtsIndex 
bytesIndex rawByte  Ljava/nio/ByteBuffer; part Hi partsLo addressHalves 
 otalParts lastIndexOf (I)I � �
 9 � 	substring (II)Ljav /lang/String; � �
 9 � (I)Lj va/lang/String; � �
 9 � toH xString � �
  � java/lang/S ringBuilder �
 �  append - Ljava/lang/String;)Ljava/lang/S ringBuilder; � �
 � � G 5
 �   	lastColon initialPart 
do tedQuad quad penultimate  ltimate toUriString *(Ljava/ et/InetAddress;)Ljava/lang/Stri g; java/net/Inet6Address �  [ � ] � ip forUriString  checkNotNull &(Ljava/lang/Ob ect;)Ljava/lang/Object; � �
 % � host string is empty � ( Ljava/lang/Object;)V & �
 % � endsWith � f
 9 � Not a val d address: " � (C)Ljava/lang StringBuilder; � �
 � � host ddr retval isUriInetAddress  � U
  � isCompatIPv4Address  (Ljava/net/Inet6Address;)Z  sIPv4CompatibleAddress ()Z � �
 � � 
getAddress � �
 � �  Ljava/net/Inet6Address; getCo patIPv4Address 0(Ljava/net/Ine 6Address;)Ljava/net/Inet4Addres ; � �
  $Address '%s' is n t IPv4-compatible.
 � 6 co yOfRange ([BII)[B
    
 
 is6to4Address get6t 4IPv4Address �
  #Addres  '%s' is not a 6to4 address.  isTeredoAddress getTeredoIn o i(Ljava/net/Inet6Address;)Lc m/google/appengine/repackaged/c m/google/common/net/InetAddress s$TeredoInfo; �
  %Addre s '%s' is not a Teredo address.  @com/google/appengine/repac aged/com/google/common/io/ByteS reams newDataInput N([BI) com/google/appengine/repackaged com/google/common/io/ByteArrayD taInput;
 Gcom/google appengine/repackaged/com/google common/io/ByteArrayDataInput  	readShort ()S!" #  �  3(Ljava/net/Inet4Address;Ljav /net/Inet4Address;II)V &
   server flags port clie tBytes client isIsatapAddre s getIsatapIPv4Address. �
  0 &Address '%s' is not an ISA AP address.2 hasEmbeddedIPv ClientAddress getEmbeddedIPv4 lientAddress � 
 6 
  
 : 	getClient ()Ljav /net/Inet4Address;<=
 > " %s' has no embedded IPv4 addres .@ getCoercedIPv4Address / Ljava/net/InetAddress;)Ljava/ne /Inet4Address;
 + �  	 E   	 G4 �
 I5 
 K h shCodeM �
 1N wrap ([BII Ljava/nio/ByteBuffer;PQ
 �R  getLong ()JTU
 �V 
has 64To32 (J)IXY
 Z�    A om/google/appengine/repackaged/ om/google/common/primitives/Int ] toByteArray (I)[B_`
 ^a leadingBytesOfZero Z  p6 addressAsLong J coerce Hash QLcom/google/appengine/re ackaged/com/google/common/annot tions/VisibleForTesting;������ �        key coerceToInte er (Ljava/net/InetAddress;)I BC
 q
 1 � M([B)Lcom/google appengine/repackaged/com/google common/io/ByteArrayDataInput; t
u readIntw � x f omInteger (I)Ljava/net/Inet4A dress; fromLittleEndianByteAr ay reversed java/lang/Math ~ min (II)I��
� jav /lang/System� 	arraycopy *( java/lang/Object;ILjava/lang/Ob ect;II)V��
�� original  from to end result 
acce s$000 <clinit> 	127.0.0.1�  0.0.0.0� ConstantValue  ode LocalVariableTable Line umberTable RuntimeInvisibleAn otations 
Exceptions 
SourceF le InnerClasses 1       
  �        �                   �   /     *� �   �                    
   �   �      *�� � � Y*�� #S� )*�  L+� 1� � Y3� Y+� 7S� =� @ +� 1�L� BYD� Y*� JS� =+� M�   D E  �      ! $ N O  F  P Q    _ R S  �       �  � ! � ( � @ � E � F � 	 T U �   �     C*� YL+� *� \L+� �  Y^� Y*S� =� _�+� /�M� BYa  Y*S� =,� M�  ' + ,  �      -  P Q    C b c    > d S  �   "    �  � 	 �  �  � '   , � - � 	 e f �   R     
*  hW�L�      B �        P i    
 b c  �       �     �  � 
 V W �        h* m� q� �*s� wL+�� ��M> �� =+2� {6�  �� �+2 � �� +2� �� �,�T���ç N�,�   < c k = S c k T ` c   �   >  . , �     @ �      � �    h b c    V � �     R S �   J    � 	 �  �  �   �  �  � & � . � ; � = R   Z � ` c	 d
 f 
 Z W    �  
  <*m� q� �*�� q�  �*�� q� *� �K*� �� �L= *�� �:2�� �� V2m�  :6�� 02�� �� � 2� �6+h�� �W�����=� :�� =�� w2�� �� i 2m� �:6�� C�dd6 2�� �� �2� �6 dh6	+	�� �W�����>� : � >`6� ��� � �+� ��  V o � k p � � k � �  k � k �   �  |  �     5 �   �  � �  V C � �  �   �   �  �   � 
 �  	 � H      � �  � V � �   < b     0 � �  2
 �   4 �    = � � �   �  �   � 1    	     $ ( *  0" 2# 4% =' I( V* a+ n  p/ |0 �* �2 �5 �3 �4 �  �8 �= �> �? �A �B �C �  �G �H �IA	KNL OQVW%X'Z5\7  
 � � �   �     u*:� �<* `� �M*`� �N-� Y:� �3  �~x3 �~�� �:3 �~x 3 �~�� �:� �Y� �,� �� �m  �� ̶ ΰ   �   H    u b c    n �    e � c   ] � c   W � S  > 7 � c  W  � c �   & 	  c d e f g #h % j >k Wl 	 � � �   Z     ( � ؙ � �Y� �ڶ �*� 7� �ܶ ̶ ΰ*� 7�   �       ( � O  �      � � #� 	 � U �       �*� �W*� �� � � �L � hL+� 1� +�� M*ڶ �� *ܶ  � #� BY� �Y� �� �*� �"� � �  _�**� �d� �� hL+� ؙ +�� BY  �Y� �� �*� �"� � η _�   % ) B �      *   P i    � � c    | � O �   :   � �  � � � $� &� )� *� <� \ � k� r� t� 	 � f �   R     
*� �W�L�      B �       P i    
 b c  �       � � � � 	 � � �   ~     6*� �� �*� �L+3� "+3�  3� +3� +3� ��   �       6 � �    ( R S �      � � 	� � 2� 4� 	 �  �   R     $*�� Y*� S� )*� ��	��   �       $ � �  �   
   � � 	 � �   R     *� �L+3 � +3 � � �   �        � �     R S �   
     	  �   Q     #*�� Y*� S� )*� ��	��   �       # � �  �   
    " 	 �  �   ^     &*� �L+3 � +3  +3� +3� � �   �        & � �    ! R S �   
     { 	 �       �*� � Y*�S� )*� �L+�	�M ��$ %~>+
��$ �% 6+�	:6��  ��T�����:� Y,�(�   �   R  U  �     � � �    k R S  % `)   5 P*   H =+   R 3, S  w -  �   .   � � � %� 5� H� R� ]� j� p� w� 	. � �   �     9*�� �*� �L+3�� � 	3� +
3^� +3�� � �   �       9 � �    + R S        � � 	� � � �  /  �   R     $*�13�  *�S� )*� ��	��   �       $ � �  �   
   � �  4 � �   E     *�� *�  
*�� � �   �        � �  �      � 	5  �   �     @*�� *�7�*�� *�9� �� *�;�?�� BYA� Y*� � =� _�   �       @ � �  �      � � � � � � '  	BC �  V     �*� 1� *  1�*�DL=>� +3� =� 	� ���� +3� �F�� +3� � H�*� �N	7-�J� -�L�O�7� -  ��S�W7�[6\�6  �6�b��   �   H    �     � � O    � R S   �c d  P He �  S Efg  } h  �   ^       ! "  # !$ #% &" ,( 8) <* G+ K . P/ S0 Z1 g5 v9 }< �@ � A �D XY �   r     0j ya?}�?li?}�?y ?}�?��   �       0ng  �      S T U V W & X -Y�    i   	op �   :     *�r�s�v�y �   �        � O  �      r 	z{ �   2     �b��   �        �   �      } 	| - �   q     #*��L=*�� +* �dd3T����+� /�   �         �     # d S    } S �      � � � � ��       
 �   �     !*� �W* ��>d�:*d���   �   4    !� S     !�     !�    �    � S �      � � � � ��= �         �H�   �       w  �  �   5      �� h� 1�F �� h� 1�H�   �   
    z    �    �   
    	 �        PK
      ! ��8z  z  C   com/google/appengine/repack ged/com/google/common/util/Base 4.class����   1 � =com/google/ ppengine/repackaged/com/google/ ommon/util/Base64  java/lan /Object  Base64.java PADD NG_BYTE B   = NEW_LINE     ALPHABET [B WEBSAFE_ALPH BET 	DECODABET WEBSAFE_DECOD BET WHITE_SPACE_ENC���� EQ ALS_SIGN_ENC���� $assertions isabled Z <init> ()V      this ?Lcom/google/appen ine/repackaged/com/google/commo /util/Base64; 
encode3to4 ([ II[BI[B)[B source 	srcOffset  I numSigBytes destination  
destOffset alphabet inBuf  encode ([B)Ljava/lang/Stri g;  	  ( ([BII[BZ)Ljava/l ng/String; & *
  + encodeWe Safe ([BZ)Ljava/lang/String;  	  / 	doPadding��� ([B I[BI)[B & 3
  4 java/lang/S ring 6 ([BII)V  8
 7 9 o f len outBuff outLen     ?  	  A java/lang/Asse tionError C
 D  maxLineLeng h lenDiv3 len43 d e l n2 
lineLength 
decode4to3  [BI[BI[B)I 	decodabet decode  (Ljava/lang/String;)[B Mcom/ oogle/appengine/repackaged/com/ oogle/common/util/Base64Decoder xception R getBytes ()[B   U
 7 V ([BII)[B P X
  Y   Ljava/lang/String; bytes  decodeWebSafe ^ X
  _ ([B)[   	  b 
([BII[B)[B P d
  e  	  g java/lang/StringB ilder i
 j  Bad Base64 inpu  character at  l append -(L ava/lang/String;)Ljava/lang/Str ngBuilder; n o
 j p (I)Ljava lang/StringBuilder; n r
 j s  :  u 	(decimal) w toString  ()Ljava/lang/String; y z
 j   (Ljava/lang/String;)V  }
   ~ 'Invalid padding byte found in position  � 'encoded value has invalid trailing byte � 0 ata found after trailing paddin  byte at index  � M N
  � $ ingle trailing character at off et  � java/lang/System � 	 rraycopy *(Ljava/lang/Object;I java/lang/Object;II)V � �
 � �  lastByte len34 outBuffPos  b4 b4Posn i sbiCrop 	 biDecode paddingByteSeen ou  <clinit> java/lang/Class   desiredAssertionStatus ()Z  � �
 � � ConstantValue Cod  LocalVariableTable LineNum erTable 
Exceptions 
SourceFi e 1     	     �      	   �    
                         �         �              �   3     *� �    �             �   
    �  � 
       �     �� *3x|�   *`3x|� �� *`3x |� �6�    �         �       -|3T-`|?~ T-`|?~3T-`?~3 -�-|3T-`|?~3T `|?~3T-`=T-�- |3T-`|?~3T-`=T `=T-�-�    �   H    �       �       � !      � "     � #      � $   = � %    �   J    � = � X � d � u � � � � � � � � � � � � � � � � � � � � � � � � � � � 	 & '  �   6     **�� )� ,�    �            �       � 	 - .  �   @     **�� 0� ,�    �               1   �       	 & *  �   �     <*-2� 5: �6� � d3=� � 	� ���� 7Y� :�    �   H    <       < ;      < <      < $     < 1    1 =    , >    �          & ) /  	 & 3  �       l6h6l`�:66	d 
6
� �*`3x|*``3 x|�*``3x|�6	- |3T	`-|?~3T	`- ?~3T	`-?~3T��  	`
T�	6��	��r� .* d	-� @W�� 	`
 �	�	� B� 	�� � DY� E��    �   �  Z U %            ;      <      $      F     � G     � H     � =    � I     � J   	 $ � K   
 ' � L    �   r   / 0  1 4 5 6 $7 '8 .= ZA f B wC �D �F �G �H �I �J � 8 �N �O �Q �R �T �U �W � Z �[ 
 M N  �  {     �*` =� +*33x|*`33x| 6,|�T�*`3=� E*33 |*`33x|�*`33x �6,|�T,`|�T�*33 x|*`33x|�*`33x |�*`33x|�6,z�T, `z�T,`�T�    �   R     =    h  =    �  =              �       � "     �        � O   �   :   | 
}  � 0� 2� <� h� q� |� ~�  � �� �� �� 	 P Q  �   E      *� WL++�� Z�    �        [ \     ]   �   
   �  � �     S 	 ^ Q  �   E     *� WL++�� `�    �          \     ]   �   
   � �       S 	 P a  �   2     * *�� Z�    �            �      � �     S 	 ^ a  �         **�� `�    �             �      � �     S 	   X  �   H     
*� c� f�     �        
       
 ;        <    �      � �     S 	   X  �   H     
*� h� f�     �        
       
 ;        <    �      � �     S 	   d  �  �    vhl6`� 6�:66	6
666		� �*	`3~�6
-
36�� 2� SY� jY� km� q	� tv� q*	`3� tx  q� |� �� �
=� X� � � � � SY� jY� k�� q	� t� |�  6*d`3~�6=� 
� � SY�� �� G� � SY� jY� k��  	� t� |� ��
T�  -� �`66�	��	� =�  � SY� jY� k�� qd� t� |� � =T-� �`6�: � ��    �   �  �  �    v      v ;     v <       O   o �    g =   d      _ �   \ �    Y �   	  V �  
 #S �   &P �   h  �   �   � '  � � �         # & /   A
 H w } � � �   � � � � �" �# �' (
)*#6(7.8K; <b?h@sA �     S  �    �  	1     		� �� � � B �YATYBTYCTYDTYETYF YGTYHTYITY	JTY
KTY LTYMTYNTYOTYPTY QTYRTYSTYTTYUTYV YWTYXTYYTYZTYaTY bTYcTYdTYeTYfTY  gTY!hTY"iTY#jTY$kTY%l Y&mTY'nTY(oTY)pTY*qTY +rTY,sTY-tTY.uTY/vTY0 wTY1xTY2yTY3zTY40TY51 Y62TY73TY84TY95TY:6TY ;7TY<8TY=9TY>+TY?/T� ) @�YATYBTYCTYDTYETY TYGTYHTYITY	JTY
KT LTYMTYNTYOTYPTY QTYRTYSTYTTYUTY TYWTYXTYYTYZTYaT bTYcTYdTYeTYfTY gTY!hTY"iTY#jTY$kTY% TY&mTY'nTY(oTY)pTY*qT +rTY,sTY-tTY.uTY/vTY wTY1xTY2yTY3zTY40TY5 TY62TY73TY84TY95TY:6T ;7TY<8TY=9TY>-TY?_T�   ��Y�TY�TY�TY�TY�TY �TY�TY�TY�TY	�TY
 TY�TY�TY�TY�TY�T �TY�TY�TY�TY�TY �TY�TY�TY�TY�TY TY�TY�TY�TY�TY�T  �TY!�TY"�TY#�TY$�TY �TY&�TY'�TY(�TY)�TY* TY+>TY,�TY-�TY.�TY/?T 04TY15TY26TY37TY48TY 9TY6:TY7;TY8<TY9=TY: TY;�TY<�TY=TY>�TY?�TY @�TYATYBTYCTYDTYETY TYGTYHTYITYJ	TYK
 YLTYMTYNTYOTYPTY QTYRTYSTYTTYUTYV TYWTYXTYYTYZTY[� Y\�TY]�TY^�TY_�TY`�TY aTYbTYcTYdTYeTYf TYg TYh!TYi"TYj#TYk$ Yl%TYm&TYn'TYo(TYp)TY q*TYr+TYs,TYt-TYu.TYv /TYw0TYx1TYy2TYz3TY{� Y|�TY}�TY~�TY�T� c �� Y�TY�TY�TY�TY�TY�TY �TY�TY�TY	�TY
�TY �TY�TY�TY�TY�TY� Y�TY�TY�TY�TY�TY �TY�TY�TY�TY�TY �TY�TY�TY�TY�TY � Y!�TY"�TY#�TY$�TY%�TY &�TY'�TY(�TY)�TY*�TY+ �TY,�TY->TY.�TY/�TY04 Y15TY26TY37TY48TY59TY 6:TY7;TY8<TY9=TY:�TY; �TY<�TY=TY>�TY?�TY@�T ATYBTYCTYDTYETYFTY TYHTYITYJ	TYK
TYL TYMTYNTYOTYPTYQT RTYSTYTTYUTYVTY TYXTYYTYZTY[�TY\ TY]�TY^�TY_?TY`�TYaT bTYcTYdTYeTYfTY  TYh!TYi"TYj#TYk$TYl TYm&TYn'TYo(TYp)TYq*T r+TYs,TYt-TYu.TYv/TY 0TYx1TYy2TYz3TY{�TY| TY}�TY~�TY�T� h�    �       )  9� M ` �  �    PK
      ! I���  �  S    om/google/appengine/repackaged/ om/google/common/util/Base64Dec derException.class����   1  M om/google/appengine/repackaged/ om/google/common/util/Base64Dec derException  java/lang/Exc ption  Base64DecoderExcepti n.java MLcom/google/appengine/ epackaged/com/google/common/ann tations/GwtCompatible; serial ersionUID J        <init>  ()V  
   this OLcom/g ogle/appengine/repackaged/com/g ogle/common/util/Base64DecoderE ception; (Ljava/lang/String;)   
   s Ljava/lang/Str ng; ConstantValue Code Lo alVariableTable LineNumberTab e 
SourceFile RuntimeInvisib eAnnotations !               	         3     *  �                   
              >      +� �                         
                     PK
      ! 	Q��  �  O   com/google/appengine/r packaged/com/google/io/protocol BaseMessageVisitor.class����     C Icom/google/appengine/repac aged/com/google/io/protocol/Bas MessageVisitor  java/lang/O ject  Ecom/google/appengine/ epackaged/com/google/io/protoco /MessageVisitor  BaseMessag Visitor.java Mcom/google/appen ine/repackaged/com/google/io/pr tocol/ProtocolType$FieldType   Ccom/google/appengine/repackag d/com/google/io/protocol/Protoc lType 
 	FieldType <init>  ()V  
   this KLcom/goo le/appengine/repackaged/com/goo le/io/protocol/BaseMessageVisit r; shouldVisitField S(Lcom/g ogle/appengine/repackaged/com/g ogle/io/protocol/ProtocolType$F eldType;I)Z 'java/lang/Unsuppo tedOperationException  Not  mplemented  (Ljava/lang/Str ng;)V  
   	fieldType OL om/google/appengine/repackaged/ om/google/io/protocol/ProtocolT pe$FieldType; count I vis tBoolean T(Lcom/google/appengi e/repackaged/com/google/io/prot col/ProtocolType$FieldType;IZ)V  index value Z visitByte rray U(Lcom/google/appengine/r packaged/com/google/io/protocol ProtocolType$FieldType;I[B)V  B visitDouble T(Lcom/google/ ppengine/repackaged/com/google/ o/protocol/ProtocolType$FieldTy e;ID)V D 
visitFloat T(Lcom google/appengine/repackaged/com google/io/protocol/ProtocolType FieldType;IF)V F visitForei n �(Lcom/google/appengine/repa kaged/com/google/io/protocol/Pr tocolType$FieldType;ILcom/googl /appengine/repackaged/com/googl /io/protocol/ProtocolMessage;)V  HLcom/google/appengine/repacka ed/com/google/io/protocol/Proto olMessage; 
visitGroup visit nteger T(Lcom/google/appengine repackaged/com/google/io/protoc l/ProtocolType$FieldType;II)V  visitLong T(Lcom/google/appeng ne/repackaged/com/google/io/pro ocol/ProtocolType$FieldType;IJ)  J visitRawMessage (Ljava nio/ByteBuffer;)V message L ava/nio/ByteBuffer; visitStri g e(Lcom/google/appengine/repa kaged/com/google/io/protocol/Pr tocolType$FieldType;ILjava/lang String;)V Ljava/lang/String; Code LocalVariableTable Li eNumberTable 
SourceFile Inn rClasses !                /     *� �    ?            @            >   H     
� Y� �    ?        
       
      
    @           !  >   I           ?   *                   "      # $  @          % &  >   I      �    ?   *                  "      # '  @         ( )  >   I      �    ?   *                   "      #    @       "  + ,  >   I       �    ?   *                  "      # -  @       &  . /  >   I      �     ?   *                   "      # 0  @       *    /  >   I      �    ?   *                  "      # 0  @       .  2 3  >   I      �    ?   *                  "      #           2  4 5  >   I       �    ?   *                  "      # 6  @       6  7 8  >   5      �    ?               9 :  @        :  ; <  >   I      �    ?   *                  "      # =  @       >  A     B   
  	   	PK
       ! )o��  �  P   com/google/a pengine/repackaged/com/google/i /protocol/CategoryInformation.c ass����   1  Jcom/google/appe gine/repackaged/com/google/io/p otocol/CategoryInformation   <T:Lcom/google/appengine/repack ged/com/google/io/protocol/Prot colMessage;>Ljava/lang/Object; java/lang/Object  Category nformation.java getSimpleClas Name \(Lcom/google/appengine/r packaged/com/google/io/protocol ProtocolMessage;)Ljava/lang/Str ng; getFullClassName parse �(Ljava/lang/CharSequence;Lcom/ oogle/appengine/repackaged/com/ oogle/io/protocol/ProtocolMessa e;)Lcom/google/appengine/repack ged/com/google/io/protocol/Prot colMessage; 	Signature (TT;) java/lang/String;  (Ljava/lang CharSequence;TT;)TT; 
SourceFi e                	        
                  PK
      ! �Q ��;  �;  V   com/google/appengi e/repackaged/com/google/io/prot col/ExtendableProtocolMessage.c ass����   1 � Pcom/google/appe gine/repackaged/com/google/io/p otocol/ExtendableProtocolMessag   �<T:Lcom/google/appengine/ epackaged/com/google/io/protoco /ExtendableProtocolMessage<TT;> >Lcom/google/appengine/repackag d/com/google/io/protocol/Protoc lMessage<TT;>; Fcom/google/app ngine/repackaged/com/google/io/ rotocol/ProtocolMessage  Ex endableProtocolMessage.java Kc m/google/appengine/repackaged/c m/google/io/protocol/Extensions Extension  Acom/google/appen ine/repackaged/com/google/io/pr tocol/Extensions 	 	Extension  Scom/google/appengine/repackag d/com/google/io/protocol/Extens ons$RepeatedExtension  Repe tedExtension uninterpreted F com/google/appengine/repackaged com/google/io/protocol/Extensio Tags; <init> ()V  
   this WLcom/google/appengine/r packaged/com/google/io/protocol ExtendableProtocolMessage<TT;>;  RLcom/google/appengine/repacka ed/com/google/io/protocol/Exten ableProtocolMessage; hasExten ion P(Lcom/google/appengine/re ackaged/com/google/io/protocol/ xtensions$Extension;)Z  	    
getWireTag ()I  
    java/lang/Integer   valueOf (I)Ljava/lang/Integer; " #
 ! $ Dcom/google/appengine/repack ged/com/google/io/protocol/Exte sionTags & containsKey (Lj va/lang/Integer;)Z ( )
 ' * 	 xtension SLcom/google/appengin /repackaged/com/google/io/proto ol/Extensions$Extension<TT;*>; MLcom/google/appengine/repackag d/com/google/io/protocol/Extens ons$Extension; X(Lcom/google/a pengine/repackaged/com/google/i /protocol/Extensions$RepeatedEx ension;)Z
   get b(Ljava/l ng/Integer;)Lcom/google/appengi e/repackaged/com/google/io/prot col/LazyParsingExtension; 1 2
 ' 3 Kcom/google/appengine/repa kaged/com/google/io/protocol/La yParsingExtension 5 read a( com/google/appengine/repackaged com/google/io/protocol/Extensio s$Extension;)Ljava/lang/Object;  7 8
 6 9 java/util/List ;  isEmpty ()Z = > < ? [Lcom/ oogle/appengine/repackaged/com/ oogle/io/protocol/Extensions$Re eatedExtension<TT;*>; ULcom/go gle/appengine/repackaged/com/go gle/io/protocol/Extensions$Repe tedExtension; getExtension  efaultValue ()Ljava/lang/Obje t; D E
  F unmodifiable &( java/lang/Object;)Ljava/lang/Ob ect; H I
  J VLcom/google/ap engine/repackaged/com/google/io protocol/Extensions$Extension<T