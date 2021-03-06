/*EXERCICIO 1*/
SELECT SUM(P.QT_ESTOQUE*P.VL_PRECO_UNITARIO) "VALOR TOTAL EM ESTOQUE"
FROM T_SPV_PRODUTO P;

/*EXERCICIO 2*/
SELECT MAX(NF.VL_TOTAL_NF) "NF DE MAIOR VALOR"
FROM T_SPV_NOTA_FISCAL NF;

/*EXERCICIO 3*/
SELECT MIN(NF.VL_TOTAL_NF) "NF DE MENOR VALOR"
FROM T_SPV_NOTA_FISCAL NF;

/*EXERCICIO 4*/
SELECT AVG(NF.VL_DESCONTO) "VALOR MEDIO DE DESCONTO"
FROM T_SPV_NOTA_FISCAL NF;

/*EXERCCIO 5*/
SELECT AVG(NF.VL_TOTAL_NF)
FROM T_SPV_NOTA_FISCAL NF;

/*EXERCICIO 6*/
SELECT C.CD_CLIENTE "CODIGO CLIENTE", C.NM_CLIENTE "NOME", COUNT(NF.NR_NOTA_FISCAL) "QTDE NOTA FISCAL POR CLIENTE"
FROM T_SPV_CLIENTE C INNER JOIN T_SPV_NOTA_FISCAL NF ON(C.CD_CLIENTE = NF.CD_CLIENTE)
GROUP BY C.NM_CLIENTE, C.CD_CLIENTE;

/*EXERCICIO 7*/
SELECT C.CD_CLIENTE "CODIGO CLIENTE", C.NM_CLIENTE "NOME", COUNT(NF.NR_NOTA_FISCAL) "QTDE NOTA FISCAL POR CLIENTE"
FROM T_SPV_CLIENTE C INNER JOIN T_SPV_NOTA_FISCAL NF ON(C.CD_CLIENTE = NF.CD_CLIENTE)
HAVING COUNT(NF.NR_NOTA_FISCAL) >= 1
GROUP BY C.CD_CLIENTE, C.NM_CLIENTE;

/*EXERCICIO 8*/
SELECT COUNT(NF.NR_NOTA_FISCAL)
FROM T_SPV_NOTA_FISCAL NF
/*WHERE NF.DT_EMISSAO > TO_DATE('01/08/2014', 'DD/MM/YYYY');*/
WHERE TO_CHAR(NF.DT_EMISSAO, 'MM/YYYY') = '08/2014';

/*EXERCICIO 9*/
SELECT SUM(NF.VL_TOTAL_NF)
FROM T_SPV_CLIENTE C INNER JOIN T_SPV_NOTA_FISCAL NF USING(CD_CLIENTE)
GROUP BY CD_CLIENTE;

/*EXERCICIO 10*/
SELECT SUM(NF.VL_DESCONTO)
FROM T_SPV_CLIENTE C INNER JOIN T_SPV_NOTA_FISCAL NF USING(CD_CLIENTE)
GROUP BY CD_CLIENTE;

/*EXERCICIO 11*/
SELECT
FROM T_SPV_CLIENTE C INNER JOIN T_SPV_