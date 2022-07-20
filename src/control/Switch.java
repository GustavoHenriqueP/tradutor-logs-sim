package control;

public class Switch {

	private String linhafinal;

	public String alterar(String linhafinal, String aux)
	{
		this.linhafinal = linhafinal;
		switch(aux)
		{
			case "00001":
				aux = "MODEM" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00002":
				aux = "DATALOG" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00003":
				aux = "EVENTLOG" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00004":
				aux = "RS485_REGION" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00005":
				aux = "RS232_REGION" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00006":
				aux = "ANALOGDATA" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00007":
				aux = "IHMDATA" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00011":
				aux = "READ_CHANNEL" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00012":
				aux = "READ_BATTERY" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00013":
				aux = "FRAME_MODBUS" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00014":
				aux = "SYSTEM_RESET" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00015":
				aux = "POWER_OFF" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00016":
				aux = "POWER_ON" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00017":
				aux = "MODBUS_MESTRE_TIMEOUT" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00018":
				aux = "MODBUS_MESTRE_FUNCTION" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00019":
				aux = "LAST_FUNCTION_RUNNIG" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00020":
				aux = "ERROR_RTC" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00041":
				aux = "RTC_UPDATED" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00042":
				aux = "GSM_CONNECTED" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00043":
				aux = "DATA_SERVICE_CONNECTED" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00044":
				aux = "DATA_SENT_TO_SERVER" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00045":
				aux = "HTTP_DATA_SENT_TO_SERVER" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00046":
				aux = "NO_DATA_TO_SEND" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00047":
				aux = "CFG_CHANGED" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00048":
				aux = "RESET_REQUEST" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00061":
				aux = "ERR_SIMCARD" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00062":
				aux = "ERR_OPERATOR_NOT_FOUND" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00063":
				aux = "ERR_NOT_REGISTERED" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00064":
				aux = "ERR_FTP_CONNECTION" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00065":
				aux = "ERR_LOADING_FILE_FTP" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00066":
				aux = "ERR_RTC_NOT_SYNCHRONIZED" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00067":
				aux = "ERR_MODEM_RESET" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00068":
				aux = "ERR_CMD_FILE" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00069":
				aux = "ERR_NO_SIGNAL" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00070":
				aux = "DATA_SERVICE_REFUSED" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00071":
				aux = "ERR_DEL_CFG_FILE" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00072":
				aux = "DEL_CFG_FILE_OK" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00073":
				aux = "ERR_SENDING_DATA_HTTP" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00074":
				aux = "ERR_RECEIVING_TICKET_HTTP" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00075":
				aux = "ERR_POST_HTTP" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00101":
				aux = "ERR_EVENT_TABLE_WRITE" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00102":
				aux = "ERR_INVALID_MODEM_CODE" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00103":
				aux = "ERR_FLASH_WRITING" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00104":
				aux = "ERR_MEMORY_ALLOCATION" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00105":
				aux = "ERR_TASK_CREATION" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			default:
				this.linhafinal = this.linhafinal + aux + ";";
				break;
		}
		/*if (aux2.equals("00000"))
		{
			aux2 = "Teste" + ";";
			//System.out.print(aux2);
			linhafinal = linhafinal+aux2;
		}
		else 
		{
			//System.out.print(aux2+";");
			linhafinal = linhafinal + aux2 + ";";
		}*/
		return this.linhafinal;
	}
	
}
