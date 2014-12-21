
package calendar.service.jaxws;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "hebDayOfWeek", namespace = "http://service.calendar/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hebDayOfWeek", namespace = "http://service.calendar/")
public class HebDayOfWeek {

	@XmlElement(name = "arg0", namespace = "")
	private Date arg0;

	/**
	 *
	 * @return
	 *	 returns Date
	 */
	public Date getArg0() {
		return this.arg0;
	}

	/**
	 *
	 * @param arg0
	 *	 the value for the arg0 property
	 */
	public void setArg0(Date arg0) {
		this.arg0 = arg0;
	}

}
