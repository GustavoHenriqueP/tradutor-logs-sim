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
				aux = "RS485" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00005":
				aux = "RS232" + ";";
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
				aux = "READ_DATA" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00012":
				aux = "READ_FRAME" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00013":
				aux = "RESET_MODBUS" + ";";
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
				aux = "MODBUS_TIMEOUT" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00018":
				aux = "MODBUS_MESTRE_FUNCTION" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00019":
				aux = "RUNNING" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00020":
				aux = "ERROR_CLOCK" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00041":
				aux = "CLOCK_UPDATED" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00042":
				aux = "CONNECTED_LINE" + ";";
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
				aux = "HTTP_SENDED" + ";";
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
				aux = "ERROR_SIM_1" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00062":
				aux = "ERROR_SIM_2" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00063":
				aux = "ERROR_SIM_3" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00064":
				aux = "ERROR_SIM_4" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00065":
				aux = "ERROR_SIM_5" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00066":
				aux = "ERROR_SIM_6" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00067":
				aux = "ERROR_SIM_7" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00068":
				aux = "ERROR_SIM_8" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00069":
				aux = "ERROR_SIM_9" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00070":
				aux = "DATA_REFUSED" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00071":
				aux = "ERROR_SIM_10" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00072":
				aux = "DEL_FILE" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00073":
				aux = "ERROR_SIM_11" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00074":
				aux = "ERROR_SIM_12" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00075":
				aux = "ERROR_FTP" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			case "00101":
				aux = "ERROR_SIM_13" + ";";
				this.linhafinal = this.linhafinal + aux;
				break;
			default:
				this.linhafinal = this.linhafinal + aux + ";";
				break;
		}

		return this.linhafinal;
	}
	
}
