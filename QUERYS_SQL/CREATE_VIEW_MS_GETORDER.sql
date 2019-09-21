CREATE VIEW VW_MS_GETORDERS  
AS 
Select  
	dbo.GetOnlyNumeric(c.CNPJ) as CPF_CNPJ
	,os.osID as NumOS
	,dbo.GetOnlyNumeric(osNroRef) as NumeroSinistro
	,os.Sinistro
	,equip.Marca
	,equip.Modelo
	,equip.Tipo
	,equip.SN
	,equip.DataCri
	,status.stStr
from OS as os
INNER JOIN Clientes as c on os.osCustID=c.CustID
INNER JOIN Equipamentos as equip on os.osEquipID=equip.EquipID
INNER JOIN tblStatus as status on os.osPosicao=status.stNum 