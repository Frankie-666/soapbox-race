package br.com.soapboxrace.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemsType", propOrder = { "basketItemTrans" })
public class ItemsType {

	@XmlElement(name = "BasketItemTrans", required = true)
	protected BasketItemTransType basketItemTrans;

	public BasketItemTransType getBasketItemTrans() {
		return basketItemTrans;
	}

	public void setBasketItemTrans(BasketItemTransType value) {
		this.basketItemTrans = value;
	}

}
