package WebDriver.function;

import static WebDriver.function.Keywords.*;

import java.util.HashMap;

import com.relevantcodes.extentreports.LogStatus;

/**
 * This is a collection of the large functions that handle over three dozen test steps
 * at once. The function takes an array as one of its arguments which allows more
 * control running selected or all test steps handled.
 * @author Anthony Chan
 *     Created a majority of the functions, including the ones for these jurisdictions:
 *     BioInfo, Canada, Japan, USA
 * @author Swetha Ramakrishna
 *     Created functions for these jurisdictions: EU, Switzerland
 *
 */
public class SD_Function1 {
	
	public static void CanadaMegaFunction(HashMap<String, String> TestData, String[] heading) {
		String[] csvValueArray;
		boolean headingMatch;
		for (String s : heading) {
			switch(s) {
			case "CanadaOSFIEntity" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("CA_OSFI"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "CanadaOSFIEntity heading", "verified");
					if (parser(csvValueArray, GetText("CA_OSFI_yes_text"))) {
						test.log(LogStatus.PASS, "CanadaOSFIEntity radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "CanadaOSFIEntity radio text 1", "not verified");
					}
					if (click("CA_OSFI_yes")==true) {
						test.log(LogStatus.PASS, "Click CanadaOSFIEntity radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click CanadaOSFIEntity radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("CA_OSFI_no_text"))) {
						test.log(LogStatus.PASS, "CanadaOSFIEntity radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "CanadaOSFIEntity radio text 2", "not verified");
					}
					if (click("CA_OSFI_no")==true) {
						test.log(LogStatus.PASS, "Click CanadaOSFIEntity radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click CanadaOSFIEntity radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "CanadaOSFIEntity heading", "not verified");
				}
				break;
			case "CanadaOSFIEntity2" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("CA_OSFI2"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "CanadaOSFIEntity2 heading", "verified");
				} else {
					test.log(LogStatus.FAIL, "CanadaOSFIEntity2 heading", "not verified");
				}
				break;
			case "CanadaBranchFRFI" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("CA_FRFI"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "CanadaBranchFRFI heading", "verified");
					if (parser(csvValueArray, GetText("CA_FRFI_yes_text"))) {
						test.log(LogStatus.PASS, "CanadaBranchFRFI radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "CanadaBranchFRFI radio text 1", "not verified");
					}
					if (click("CA_FRFI_yes")==true) {
						test.log(LogStatus.PASS, "Click CanadaBranchFRFI radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click CanadaBranchFRFI radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("CA_FRFI_no_text"))) {
						test.log(LogStatus.PASS, "CanadaBranchFRFI radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "CanadaBranchFRFI radio text 2", "not verified");
					}
					if (click("CA_FRFI_no")==true) {
						test.log(LogStatus.PASS, "Click CanadaBranchFRFI radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click CanadaBranchFRFI radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "CanadaBranchFRFI heading", "not verified");
				}
				break;
			case "CanadaCoveredEntity" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("CA_CoveredEntity"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "CanadaCoveredEntity heading", "verified");
					if (parser(csvValueArray, GetText("CA_CoveredEntity_yes_text"))) {
						test.log(LogStatus.PASS, "CanadaCoveredEntity radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "CanadaCoveredEntity radio text 1", "not verified");
					}
					if (click("CA_CoveredEntity_yes")==true) {
						test.log(LogStatus.PASS, "Click CanadaCoveredEntity radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click CanadaCoveredEntity radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("CA_CoveredEntity_no_text"))) {
						test.log(LogStatus.PASS, "CanadaCoveredEntity radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "CanadaCoveredEntity radio text 2", "not verified");
					}
					if (click("CA_CoveredEntity_no")==true) {
						test.log(LogStatus.PASS, "Click CanadaCoveredEntity radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click CanadaCoveredEntity radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "CanadaCoveredEntity heading", "not verified");
				}
				break;
			case "CanadaCrossBorderStatus" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("CA_CrossBorderStatus"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "CanadaCrossBorderStatus heading", "verified");
					if (parser(csvValueArray, GetText("CA_CrossBorderStatus_yes_text"))) {
						test.log(LogStatus.PASS, "CanadaCrossBorderStatus radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "CanadaCrossBorderStatus radio text 1", "not verified");
					}
					if (click("CA_CrossBorderStatus_yes")==true) {
						test.log(LogStatus.PASS, "Click CanadaCrossBorderStatus radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click CanadaCrossBorderStatus radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("CA_CrossBorderStatus_no_text"))) {
						test.log(LogStatus.PASS, "CanadaCrossBorderStatus radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "CanadaCrossBorderStatus radio text 2", "not verified");
					}
					if (click("CA_CrossBorderStatus_no")==true) {
						test.log(LogStatus.PASS, "Click CanadaCrossBorderStatus radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click CanadaCrossBorderStatus radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "CanadaCrossBorderStatus heading", "not verified");
				}
				break;
			case "CanadaCrossBorderStatus2" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("CA_CrossBorderStatus2"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "CanadaCrossBorderStatus2 heading", "verified");
				} else {
					test.log(LogStatus.FAIL, "CanadaCrossBorderStatus2 heading", "not verified");
				}
				break;
			case "CanadaAANAInformation" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("CA_AANAGroupInfo"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "CanadaAANAInformation heading", "verified");
					if (parser(csvValueArray, GetText("CA_AANAGroupInfo_yes_text"))) {
						test.log(LogStatus.PASS, "CanadaAANAInformation radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "CanadaAANAInformation radio text 1", "not verified");
					}
					if (click("CA_AANAGroupInfo_yes")==true) {
						test.log(LogStatus.PASS, "Click CanadaAANAInformation radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click CanadaAANAInformation radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("CA_AANAGroupInfo_no_text"))) {
						test.log(LogStatus.PASS, "CanadaAANAInformation radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "CanadaAANAInformation radio text 2", "not verified");
					}
					if (click("CA_AANAGroupInfo_no")==true) {
						test.log(LogStatus.PASS, "Click CanadaAANAInformation radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click CanadaAANAInformation radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "CanadaAANAInformation heading", "not verified");
				}
				break;
			case "CanadaAANAInformation2" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("CA_AANAGroupInfo2"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "CanadaAANAInformation2 heading", "verified");
				} else {
					test.log(LogStatus.FAIL, "CanadaAANAInformation2 heading", "not verified");
				}
				break;
			case "CanadaAANAThreshold" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("CA_AANAThreshold"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "CanadaAANAThreshold heading", "verified");
					if (parser(csvValueArray, GetText("CA_AANAThreshold_above_text"))) {
						test.log(LogStatus.PASS, "CanadaAANAThreshold radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "CanadaAANAThreshold radio text 1", "not verified");
					}
					if (click("CA_AANAThreshold_above")==true) {
						test.log(LogStatus.PASS, "Click CanadaAANAThreshold radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click CanadaAANAThreshold radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("CA_AANAThreshold_notAbove_text"))) {
						test.log(LogStatus.PASS, "CanadaAANAThreshold radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "CanadaAANAThreshold radio text 2", "not verified");
					}
					if (click("CA_AANAThreshold_notAbove")==true) {
						test.log(LogStatus.PASS, "Click CanadaAANAThreshold radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click CanadaAANAThreshold radio 2", "not verified");
					}
					if (parser(csvValueArray, GetText("CA_AANAThreshold_ultimate_text"))) {
						test.log(LogStatus.PASS, "CanadaAANAThreshold radio text 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "CanadaAANAThreshold radio text 3", "not verified");
					}
					if (click("CA_AANAThreshold_ultimate")==true) {
						test.log(LogStatus.PASS, "Click CanadaAANAThreshold radio 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click CanadaAANAThreshold radio 3", "not verified");
					}
					if (parser(csvValueArray, GetText("CA_AANAThreshold_person_text"))) {
						test.log(LogStatus.PASS, "CanadaAANAThreshold radio text 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "CanadaAANAThreshold radio text 4", "not verified");
					}
					if (click("CA_AANAThreshold_person")==true) {
						test.log(LogStatus.PASS, "Click CanadaAANAThreshold radio 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click CanadaAANAThreshold radio 4", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "CanadaAANAThreshold heading", "not verified");
				}
				break;
			case "CanadaAANAThresholdEstimate" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("CA_AANAThresholdEstimate"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "CanadaAANAThresholdEstimate heading", "verified");
					if (parser(csvValueArray, GetText("CA_AANAThresholdEstimate_2017_text"))) {
						test.log(LogStatus.PASS, "CanadaAANAThresholdEstimate radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "CanadaAANAThresholdEstimate radio text 1", "not verified");
					}
					if (click("CA_AANAThresholdEstimate_2017")==true) {
						test.log(LogStatus.PASS, "Click CanadaAANAThresholdEstimate radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click CanadaAANAThresholdEstimate radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("CA_AANAThresholdEstimate_2018_text"))) {
						test.log(LogStatus.PASS, "CanadaAANAThresholdEstimate radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "CanadaAANAThresholdEstimate radio text 2", "not verified");
					}
					if (click("CA_AANAThresholdEstimate_2018")==true) {
						test.log(LogStatus.PASS, "Click CanadaAANAThresholdEstimate radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click CanadaAANAThresholdEstimate radio 2", "not verified");
					}
					if (parser(csvValueArray, GetText("CA_AANAThresholdEstimate_2019_text"))) {
						test.log(LogStatus.PASS, "CanadaAANAThresholdEstimate radio text 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "CanadaAANAThresholdEstimate radio text 3", "not verified");
					}
					if (click("CA_AANAThresholdEstimate_2019")==true) {
						test.log(LogStatus.PASS, "Click CanadaAANAThresholdEstimate radio 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click CanadaAANAThresholdEstimate radio 3", "not verified");
					}
					if (parser(csvValueArray, GetText("CA_AANAThresholdEstimate_2020_text"))) {
						test.log(LogStatus.PASS, "CanadaAANAThresholdEstimate radio text 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "CanadaAANAThresholdEstimate radio text 4", "not verified");
					}
					if (click("CA_AANAThresholdEstimate_2020")==true) {
						test.log(LogStatus.PASS, "Click CanadaAANAThresholdEstimate radio 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click CanadaAANAThresholdEstimate radio 4", "not verified");
					}
					if (parser(csvValueArray, GetText("CA_AANAThresholdEstimate_none_text"))) {
						test.log(LogStatus.PASS, "CanadaAANAThresholdEstimate radio text 5", "verified");
					}else {
						test.log(LogStatus.FAIL, "CanadaAANAThresholdEstimate radio text 5", "not verified");
					}
					if (click("CA_AANAThresholdEstimate_none")==true) {
						test.log(LogStatus.PASS, "Click CanadaAANAThresholdEstimate radio 5", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click CanadaAANAThresholdEstimate radio 5", "not verified");
					}
					if (parser(csvValueArray, GetText("CA_AANAThresholdEstimate_decline_text"))) {
						test.log(LogStatus.PASS, "CanadaAANAThresholdEstimate radio text 6", "verified");
					}else {
						test.log(LogStatus.FAIL, "CanadaAANAThresholdEstimate radio text 6", "not verified");
					}
					if (click("CA_AANAThresholdEstimate_decline")==true) {
						test.log(LogStatus.PASS, "Click CanadaAANAThresholdEstimate radio 6", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click CanadaAANAThresholdEstimate radio 6", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "CanadaAANAThresholdEstimate heading", "not verified");
				}
				break;
			}
		}
	}
	
	public static void EUMegaFunction(HashMap<String, String> TestData, String[] heading) {
		String[] csvValueArray;
		boolean headingMatch;
		for (String s : heading) {
			switch(s) {
			case "EUEntityStatus" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("EU_Entity"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "EUEntityStatus heading", "verified");
					if (parser(csvValueArray, GetText("EU_Exempt_text"))) {
						test.log(LogStatus.PASS, "EUEntityStatus radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "EUEntityStatus radio text 1", "not verified");
					}
					if (click("EU_Exempt")==true) {
						test.log(LogStatus.PASS, "Click EUEntityStatus radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EUEntityStatus radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("EU_NonExempt_text"))) {
						test.log(LogStatus.PASS, "EUEntityStatus radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "EUEntityStatus radio text 2", "not verified");
					}
					if (click("EU_NonExempt")==true) {
						test.log(LogStatus.PASS, "Click EUEntityStatus radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EUEntityStatus radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "EUEntityStatus heading", "not verified");
				}
				break;
			case "EUExempt" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("EU_Exempt_text"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "EUExempt heading", "verified");
					if (parser(csvValueArray, GetText("EU_Exempt4a_text"))) {
						test.log(LogStatus.PASS, "EUExempt radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "EUExempt radio text 1", "not verified");
					}
					if (click("EU_Exempt4a")==true) {
						test.log(LogStatus.PASS, "Click EUExempt radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EUExempt radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("EU_Exempt4b_text"))) {
						test.log(LogStatus.PASS, "EUExempt radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "EUExempt radio text 2", "not verified");
					}
					if (click("EU_Exempt4b")==true) {
						test.log(LogStatus.PASS, "Click EUExempt radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EUExempt radio 2", "not verified");
					}
					if (parser(csvValueArray, GetText("EU_Exempt4c_text"))) {
						test.log(LogStatus.PASS, "EUExempt radio text 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "EUExempt radio text 3", "not verified");
					}
					if (click("EU_Exempt4c")==true) {
						test.log(LogStatus.PASS, "Click EUExempt radio 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EUExempt radio 3", "not verified");
					}
					if (parser(csvValueArray, GetText("EU_Exempt5a_text"))) {
						test.log(LogStatus.PASS, "EUExempt radio text 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "EUExempt radio text 4", "not verified");
					}
					if (click("EU_Exempt5a")==true) {
						test.log(LogStatus.PASS, "Click EUExempt radio 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EUExempt radio 4", "not verified");
					}
					if (parser(csvValueArray, GetText("EU_Exempt5b_text"))) {
						test.log(LogStatus.PASS, "EUExempt radio text 5", "verified");
					}else {
						test.log(LogStatus.FAIL, "EUExempt radio text 5", "not verified");
					}
					if (click("EU_Exempt5b")==true) {
						test.log(LogStatus.PASS, "Click EUExempt radio 5", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EUExempt radio 5", "not verified");
					}
					if (parser(csvValueArray, GetText("EU_Exempt5c_text"))) {
						test.log(LogStatus.PASS, "EUExempt radio text 6", "verified");
					}else {
						test.log(LogStatus.FAIL, "EUExempt radio text 6", "not verified");
					}
					if (click("EU_Exempt5c")==true) {
						test.log(LogStatus.PASS, "Click EUExempt radio 6", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EUExempt radio 6", "not verified");
					}
					if (parser(csvValueArray, GetText("EU_ExemptNonUndertaking_text"))) {
						test.log(LogStatus.PASS, "EUExempt radio text 7", "verified");
					}else {
						test.log(LogStatus.FAIL, "EUExempt radio text 7", "not verified");
					}
					if (click("EU_ExemptNonUndertaking")==true) {
						test.log(LogStatus.PASS, "Click EUExempt radio 7", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EUExempt radio 7", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "EUExempt heading", "not verified");
				}
				break;
			case "EUNonExempt" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("EU_NonExempt_text"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "EUNonExempt heading", "verified");
				if (parser(csvValueArray, GetText("EU_NonExemptFC_text"))) {
					test.log(LogStatus.PASS, "EUNonExempt radio text 1", "verified");
				}else {
					test.log(LogStatus.FAIL, "EUNonExempt radio text 1", "not verified");
				}
				if (click("EU_NonExemptFC")==true) {
					test.log(LogStatus.PASS, "Click EUNonExempt radio 1", "verified");
				}else {
					test.log(LogStatus.FAIL, "Click EUNonExempt radio 1", "not verified");
				}
				if (parser(csvValueArray, GetText("EU_NonExemptNFC+_text"))) {
					test.log(LogStatus.PASS, "EUNonExempt radio text 2", "verified");
				}else {
					test.log(LogStatus.FAIL, "EUNonExempt radio text 2", "not verified");
				}
				if (click("EU_NonExemptNFC+")==true) {
					test.log(LogStatus.PASS, "Click EUNonExempt radio 2", "verified");
				}else {
					test.log(LogStatus.FAIL, "Click EUNonExempt radio 2", "not verified");
				}
				if (parser(csvValueArray, GetText("EU_NonExemptNFC-_text"))) {
					test.log(LogStatus.PASS, "EUExempt EUNonExempt text 3", "verified");
				}else {
					test.log(LogStatus.FAIL, "EUExempt EUNonExempt text 3", "not verified");
				}
				if (click("EU_NonExemptNFC-")==true) {
					test.log(LogStatus.PASS, "Click EUNonExempt radio 3", "verified");
				}else {
					test.log(LogStatus.FAIL, "Click EUNonExempt radio 3", "not verified");
				}
			} else {
				test.log(LogStatus.FAIL, "EUNonExempt heading", "not verified");
			}
			break;
			
			case "EUThirdCountryEntity" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("EU_ThirdCountryEntity"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "EUThirdCountryEntity heading", "verified");
					if (parser(csvValueArray, GetText("EU_CrossBorder_yes_text"))) {
						test.log(LogStatus.PASS, "EUThirdCountryEntity radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "EUThirdCountryEntity radio text 1", "not verified");
					}
					if (click("EU_CrossBorder_yes")==true) {
						test.log(LogStatus.PASS, "Click EUThirdCountryEntity radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EUThirdCountryEntity radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("EU_CrossBorder_no_text"))) {
						test.log(LogStatus.PASS, "EUThirdCountryEntity radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "EUThirdCountryEntity radio text 2", "not verified");
					}
					if (click("EU_CrossBorder_no")==true) {
						test.log(LogStatus.PASS, "Click EUThirdCountryEntity radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EUThirdCountryEntity radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "EUThirdCountryEntity heading", "not verified");
				}
				break;
				
			case "EuCrossBorderStatus" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("EU_CrossBorder"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "EuCrossBorderStatus heading", "verified");
				} else {
					test.log(LogStatus.FAIL, "EuCrossBorderStatus heading", "not verified");
				}
				break;
				
			case "EU_DSF" :
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("EU_DSF"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "EudsfGuarantees heading", "verified");
					if (parser(csvValueArray, GetText("EU_DSF_yes_text"))) {
						test.log(LogStatus.PASS, "EU_DSF radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "EU_DSF radio text 1", "not verified");
					}
					if (click("EU_DSF_yes")==true) {
						test.log(LogStatus.PASS, "Click EU_DSF radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EU_DSF radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("EU_DSF_no_text"))) {
						test.log(LogStatus.PASS, "EU_DSF radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "EU_DSF radio text 2", "not verified");
					}
					if (click("EU_DSF_no")==true) {
						test.log(LogStatus.PASS, "Click EU_DSF radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EU_DSF radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "EU_DSF heading", "not verified");
				}
				break;
			
			case "EUBranchTransaction" :
				//csvValueArray = TestData.get(s.toUpperCase()).split(";");
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				
				headingMatch = parser(csvValueArray, GetText("EU_Branch"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "EUBranchTransaction heading", "verified");
					if (parser(csvValueArray, GetText("EU_Branch_yes_text"))) {
						test.log(LogStatus.PASS, "EUBranchTransaction radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "EUBranchTransaction radio text 1", "not verified");
					}
					if (click("EU_Branch_yes")==true) {
						test.log(LogStatus.PASS, "Click EUBranchTransaction radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EUBranchTransaction radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("EU_Branch_no_text"))) {
						test.log(LogStatus.PASS, "EUBranchTransaction radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "EUBranchTransaction radio text 2", "not verified");
					}
					if (click("EU_Branch_no")==true) {
						test.log(LogStatus.PASS, "Click EUBranchTransaction radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EUBranchTransaction radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "EUBranchTransaction heading", "not verified");
				}
				break;
			case "EUAANAGroupInformation" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("EU_AANAGroup"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "EUAANAGroupInformation heading", "verified");
					if (parser(csvValueArray, GetText("EU_AANAGroup_yes_text"))) {
						test.log(LogStatus.PASS, "EUAANAGroupInformation radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "EUAANAGroupInformation radio text 1", "not verified");
					}
					if (click("EU_AANAGroup_yes")==true) {
						test.log(LogStatus.PASS, "Click EUAANAGroupInformation radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EUAANAGroupInformation radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("EU_AANAGroup_no_text"))) {
						test.log(LogStatus.PASS, "EUAANAGroupInformation radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "EUAANAGroupInformation radio text 2", "not verified");
					}
					if (click("EU_AANAGroup_no")==true) {
						test.log(LogStatus.PASS, "Click EUAANAGroupInformation radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EUAANAGroupInformation radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "EUAANAGroupInformation heading", "not verified");
				}
				break;
			case "EUAANAGroupInfo2" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("EU_AANAGroupInfoheading"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "EUAANAGroupInfo2 heading", "verified");
				} else {
					test.log(LogStatus.FAIL, "EUAANAGroupInfo2 heading", "not verified");
				}
				break;
			case "EU_AANAThreshold" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("EU_AANAThreshold"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "EU_AANAThreshold heading", "verified");
					if (parser(csvValueArray, GetText("EU_AANAThreshold_above_text"))) {
						test.log(LogStatus.PASS, "EU_AANAThreshold radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "EU_AANAThreshold radio text 1", "not verified");
					}
					if (click("EU_AANAThreshold_above")==true) {
						test.log(LogStatus.PASS, "Click EU_AANAThreshold radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EUAANAThreshold radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("EU_AANAThreshold_notabove_text"))) {
						test.log(LogStatus.PASS, "EU_AANAThreshold radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "EU_AANAThreshold radio text 2", "not verified");
					}
					if (click("EU_AANAThreshold_notabove")==true) {
						test.log(LogStatus.PASS, "Click EU_AANAThreshold radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EU_AANAThreshold radio 2", "not verified");
					}
					if (parser(csvValueArray, GetText("EU_AANAThreshold_ultimate_text"))) {
						test.log(LogStatus.PASS, "EU_AANAThreshold radio text 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "EU_AANAThreshold radio text 3", "not verified");
					}
					if (click("EU_AANAThreshold_ultimate")==true) {
						test.log(LogStatus.PASS, "Click EU_AANAThreshold radio 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EU_AANAThreshold radio 3", "not verified");
					}
					System.out.println(GetText("EU_AANAThreshold_person_text"));
					if (parser(csvValueArray, GetText("EU_AANAThreshold_person_text"))) {
						test.log(LogStatus.PASS, "EU_AANAThreshold radio text 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "EU_AANAThreshold radio text 4", "not verified");
					}
					if (click("EU_AANAThreshold_person")==true) {
						test.log(LogStatus.PASS, "Click EU_AANAThreshold radio 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EU_AANAThreshold radio 4", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "EU_AANAThreshold heading", "not verified");
				}
				break;
			case "EUAANAThresholdEstimate" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("EU_AANAThresholdEstimate"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "EUAANAThresholdEstimate heading", "verified");
					if (parser(csvValueArray, GetText("EU_AANAThresholdEstimate_2017_text"))) {
						test.log(LogStatus.PASS, "EUAANAThresholdEstimate radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "EUAANAThresholdEstimate radio text 1", "not verified");
					}
					if (click("EU_AANAThresholdEstimate_2017")==true) {
						test.log(LogStatus.PASS, "Click EUAANAThresholdEstimate radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EUAANAThresholdEstimate radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("EU_AANAThresholdEstimate_2018_text"))) {
						test.log(LogStatus.PASS, "EUAANAThresholdEstimate radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "EUAANAThresholdEstimate radio text 2", "not verified");
					}
					if (click("EU_AANAThresholdEstimate_2018")==true) {
						test.log(LogStatus.PASS, "Click EUAANAThresholdEstimate radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EUAANAThresholdEstimate radio 2", "not verified");
					}
					if (parser(csvValueArray, GetText("EU_AANAThresholdEstimate_2019_text"))) {
						test.log(LogStatus.PASS, "EUAANAThresholdEstimate radio text 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "EUAANAThresholdEstimate radio text 3", "not verified");
					}
					if (click("EU_AANAThresholdEstimate_2019")==true) {
						test.log(LogStatus.PASS, "Click EUAANAThresholdEstimate radio 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EUAANAThresholdEstimate radio 3", "not verified");
					}
					if (parser(csvValueArray, GetText("EU_AANAThresholdEstimate_2020_text"))) {
						test.log(LogStatus.PASS, "EUAANAThresholdEstimate radio text 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "EUAANAThresholdEstimate radio text 4", "not verified");
					}
					if (click("EU_AANAThresholdEstimate_2020")==true) {
						test.log(LogStatus.PASS, "Click EUAANAThresholdEstimate radio 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EUAANAThresholdEstimate radio 4", "not verified");
					}
					if (parser(csvValueArray, GetText("EU_AANAThresholdEstimate_none_text"))) {
						test.log(LogStatus.PASS, "EUAANAThresholdEstimate radio text 5", "verified");
					}else {
						test.log(LogStatus.FAIL, "EUAANAThresholdEstimate radio text 5", "not verified");
					}
					if (click("EU_AANAThresholdEstimate_none")==true) {
						test.log(LogStatus.PASS, "Click EUAANAThresholdEstimate radio 5", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EUAANAThresholdEstimate radio 5", "not verified");
					}
					if (parser(csvValueArray, GetText("EU_AANAThresholdEstimate_decline_text"))) {
						test.log(LogStatus.PASS, "EUAANAThresholdEstimate radio text 6", "verified");
					}else {
						test.log(LogStatus.FAIL, "EUAANAThresholdEstimate radio text 6", "not verified");
					}
					if (click("EU_AANAThresholdEstimate_decline")==true) {
						test.log(LogStatus.PASS, "Click EUAANAThresholdEstimate radio 6", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click EUAANAThresholdEstimate radio 6", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "EUAANAThresholdEstimate", "not verified");
				}
				break;
			}
		}
	}
	
	public static void JapanMegaFunction(HashMap<String, String> TestData, String[] heading) {
		String[] csvValueArray;
		boolean headingMatch;
		for (String s : heading) {
			switch(s) {
			case "JP_Entities" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("JP_Entities"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "JP_Entities heading", "verified");
					if (parser(csvValueArray, GetText("JP_Entities_FIBO_text"))) {
						test.log(LogStatus.PASS, "JP_Entities radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "JP_Entities radio text 1", "not verified");
					}
					if (click("JP_Entities_FIBO")==true) {
						test.log(LogStatus.PASS, "Click JP_Entities radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click JP_Entities radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("JP_Entities_trustee_text"))) {
						test.log(LogStatus.PASS, "JP_Entities radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "JP_Entities radio text 2", "not verified");
					}
					if (click("JP_Entities_trustee")==true) {
						test.log(LogStatus.PASS, "Click JP_Entities radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click JP_Entities radio 2", "not verified");
					}
					if (parser(csvValueArray, GetText("JP_Entities_exempt_text"))) {
						test.log(LogStatus.PASS, "JP_Entities radio text 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "JP_Entities radio text 3", "not verified");
					}
					if (click("JP_Entities_exempt")==true) {
						test.log(LogStatus.PASS, "Click JP_Entities radio 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click JP_Entities radio 3", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "JP_Entities heading", "not verified");
				}
				break;
				/*
			case "CanadaOSFIEntity2" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("CA_OSFI2"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "CanadaOSFIEntity2 heading", "verified");
				} else {
					test.log(LogStatus.FAIL, "CanadaOSFIEntity2 heading", "not verified");
				}
				break;
			case "CanadaBranchFRFI" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("CA_FRFI"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "CanadaBranchFRFI heading", "verified");
					if (parser(csvValueArray, GetText("CA_FRFI_yes_text"))) {
						test.log(LogStatus.PASS, "CanadaBranchFRFI radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "CanadaBranchFRFI radio text 1", "not verified");
					}
					if (click("CA_FRFI_yes")==true) {
						test.log(LogStatus.PASS, "Click CanadaBranchFRFI radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click CanadaBranchFRFI radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("CA_FRFI_no_text"))) {
						test.log(LogStatus.PASS, "CanadaBranchFRFI radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "CanadaBranchFRFI radio text 2", "not verified");
					}
					if (click("CA_FRFI_no")==true) {
						test.log(LogStatus.PASS, "Click CanadaBranchFRFI radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click CanadaBranchFRFI radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "CanadaBranchFRFI heading", "not verified");
				}
				break;
			case "CanadaCoveredEntity" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("CA_CoveredEntity"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "CanadaCoveredEntity heading", "verified");
					if (parser(csvValueArray, GetText("CA_CoveredEntity_yes_text"))) {
						test.log(LogStatus.PASS, "CanadaCoveredEntity radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "CanadaCoveredEntity radio text 1", "not verified");
					}
					if (click("CA_CoveredEntity_yes")==true) {
						test.log(LogStatus.PASS, "Click CanadaCoveredEntity radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click CanadaCoveredEntity radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("CA_CoveredEntity_no_text"))) {
						test.log(LogStatus.PASS, "CanadaCoveredEntity radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "CanadaCoveredEntity radio text 2", "not verified");
					}
					if (click("CA_CoveredEntity_no")==true) {
						test.log(LogStatus.PASS, "Click CanadaCoveredEntity radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click CanadaCoveredEntity radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "CanadaCoveredEntity heading", "not verified");
				}
				break;
				*/
			case "JP_EntitiesNotAMultiBranch" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("JP_EntitiesNotAMultiBranch"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "JP_EntitiesNotAMultiBranch heading", "verified");
					if (parser(csvValueArray, GetText("JP_NotMultiBranch_regulated_text"))) {
						test.log(LogStatus.PASS, "JP_EntitiesNotAMultiBranch radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "JP_EntitiesNotAMultiBranch radio text 1", "not verified");
					}
					if (click("JP_NotMultiBranch_regulated")==true) {
						test.log(LogStatus.PASS, "Click JP_EntitiesNotAMultiBranch radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click JP_EntitiesNotAMultiBranch radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("JP_NotMultiBranch_notRegulated_text"))) {
						test.log(LogStatus.PASS, "JP_EntitiesNotAMultiBranch radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "JP_EntitiesNotAMultiBranch radio text 2", "not verified");
					}
					if (click("JP_NotMultiBranch_notRegulated")==true) {
						test.log(LogStatus.PASS, "Click JP_EntitiesNotAMultiBranch radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click JP_EntitiesNotAMultiBranch radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "JP_EntitiesNotAMultiBranch heading", "not verified");
				}
				break;

			case "JP_AANAGroup" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("JP_AANAGroup"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "JP_AANAGroup heading", "verified");
					if (parser(csvValueArray, GetText("JP_AANAGroup_yes_text"))) {
						test.log(LogStatus.PASS, "JP_AANAGroup radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "JP_AANAGroup radio text 1", "not verified");
					}
					if (click("JP_AANAGroup_yes")==true) {
						test.log(LogStatus.PASS, "Click JP_AANAGroup radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click JP_AANAGroup radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("JP_AANAGroup_no_text"))) {
						test.log(LogStatus.PASS, "JP_AANAGroup radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "JP_AANAGroup radio text 2", "not verified");
					}
					if (click("JP_AANAGroup_no")==true) {
						test.log(LogStatus.PASS, "Click JP_AANAGroup radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click JP_AANAGroup radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "JP_AANAGroup heading", "not verified");
				}
				break;
			case "JP_AANAGroup2" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("JP_AANAGroup2"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "JP_AANAGroup2 heading", "verified");
				} else {
					test.log(LogStatus.FAIL, "JP_AANAGroup2 heading", "not verified");
				}
				break;
			case "JP_AANAThreshold" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("JP_AANAThreshold"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "JP_AANAThreshold heading", "verified");
					if (parser(csvValueArray, GetText("JP_AANAThreshold_above_text"))) {
						test.log(LogStatus.PASS, "JP_AANAThreshold radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "JP_AANAThreshold radio text 1", "not verified");
					}
					if (click("JP_AANAThreshold_above")==true) {
						test.log(LogStatus.PASS, "Click JP_AANAThreshold radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click JP_AANAThreshold radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("JP_AANAThreshold_notabove_text"))) {
						test.log(LogStatus.PASS, "JP_AANAThreshold radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "JP_AANAThreshold radio text 2", "not verified");
					}
					if (click("JP_AANAThreshold_notabove")==true) {
						test.log(LogStatus.PASS, "Click JP_AANAThreshold radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click JP_AANAThreshold radio 2", "not verified");
					}
					if (parser(csvValueArray, GetText("JP_AANAThreshold_ultimate_text"))) {
						test.log(LogStatus.PASS, "JP_AANAThreshold radio text 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "JP_AANAThreshold radio text 3", "not verified");
					}
					if (click("JP_AANAThreshold_ultimate")==true) {
						test.log(LogStatus.PASS, "Click JP_AANAThreshold radio 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click JP_AANAThreshold radio 3", "not verified");
					}
					if (parser(csvValueArray, GetText("JP_AANAThreshold_person_text"))) {
						test.log(LogStatus.PASS, "JP_AANAThreshold radio text 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "JP_AANAThreshold radio text 4", "not verified");
					}
					if (click("JP_AANAThreshold_person")==true) {
						test.log(LogStatus.PASS, "Click JP_AANAThreshold radio 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click JP_AANAThreshold radio 4", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "JP_AANAThreshold heading", "not verified");
				}
				break;
			case "JP_AANAThresholdEstimate" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("JP_AANAThresholdEstimate"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "JP_AANAThresholdEstimate heading", "verified");
					if (parser(csvValueArray, GetText("JP_AANAThresholdEstimate_2017_text"))) {
						test.log(LogStatus.PASS, "JP_AANAThresholdEstimate radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "JP_AANAThresholdEstimate radio text 1", "not verified");
					}
					if (click("JP_AANAThresholdEstimate_2017")==true) {
						test.log(LogStatus.PASS, "Click JP_AANAThresholdEstimate radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click JP_AANAThresholdEstimate radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("JP_AANAThresholdEstimate_2018_text"))) {
						test.log(LogStatus.PASS, "JP_AANAThresholdEstimate radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "JP_AANAThresholdEstimate radio text 2", "not verified");
					}
					if (click("JP_AANAThresholdEstimate_2018")==true) {
						test.log(LogStatus.PASS, "Click JP_AANAThresholdEstimate radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click JP_AANAThresholdEstimate radio 2", "not verified");
					}
					if (parser(csvValueArray, GetText("JP_AANAThresholdEstimate_2019_text"))) {
						test.log(LogStatus.PASS, "JP_AANAThresholdEstimate radio text 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "JP_AANAThresholdEstimate radio text 3", "not verified");
					}
					if (click("JP_AANAThresholdEstimate_2019")==true) {
						test.log(LogStatus.PASS, "Click JP_AANAThresholdEstimate radio 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click JP_AANAThresholdEstimate radio 3", "not verified");
					}
					if (parser(csvValueArray, GetText("JP_AANAThresholdEstimate_2020_text"))) {
						test.log(LogStatus.PASS, "JP_AANAThresholdEstimate radio text 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "JP_AANAThresholdEstimate radio text 4", "not verified");
					}
					if (click("JP_AANAThresholdEstimate_2020")==true) {
						test.log(LogStatus.PASS, "Click JP_AANAThresholdEstimate radio 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click JP_AANAThresholdEstimate radio 4", "not verified");
					}
					if (parser(csvValueArray, GetText("JP_AANAThresholdEstimate_none_text"))) {
						test.log(LogStatus.PASS, "JP_AANAThresholdEstimate radio text 5", "verified");
					}else {
						test.log(LogStatus.FAIL, "JP_AANAThresholdEstimate radio text 5", "not verified");
					}
					if (click("JP_AANAThresholdEstimate_none")==true) {
						test.log(LogStatus.PASS, "Click JP_AANAThresholdEstimate radio 5", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click JP_AANAThresholdEstimate radio 5", "not verified");
					}
					if (parser(csvValueArray, GetText("JP_AANAThresholdEstimate_decline_text"))) {
						test.log(LogStatus.PASS, "JP_AANAThresholdEstimate radio text 6", "verified");
					}else {
						test.log(LogStatus.FAIL, "JP_AANAThresholdEstimate radio text 6", "not verified");
					}
					if (click("JP_AANAThresholdEstimate_decline")==true) {
						test.log(LogStatus.PASS, "Click JP_AANAThresholdEstimate radio 6", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click JP_AANAThresholdEstimate radio 6", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "JP_AANAThresholdEstimate heading", "not verified");
				}
				break;
			}
		}
	}
	
	public static void SwitzerlandMegaFunction(HashMap<String, String> TestData, String[] heading) {
		String[] csvValueArray;
		boolean headingMatch;
		for (String s : heading) {
			switch(s) {
			case "SwissFMIAEntityStatus" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("CH_FMIAEntityStatus"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "SwissFMIAEntityStatus heading", "verified");
					if (parser(csvValueArray, GetText("CH_Exempt_text"))) {
						test.log(LogStatus.PASS, "SwissFMIAEntityStatus radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "SwissFMIAEntityStatus radio text 1", "not verified");
					}
					if (click("CH_Exempt")==true) {
						test.log(LogStatus.PASS, "Click SwissFMIAEntityStatus radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click SwissFMIAEntityStatus radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("CH_NonExempt_text"))) {
						test.log(LogStatus.PASS, "SwissFMIAEntityStatus radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "SwissFMIAEntityStatus radio text 2", "not verified");
					}
					if (click("CH_NonExempt")==true) {
						test.log(LogStatus.PASS, "Click SwissFMIAEntityStatus radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click SwissFMIAEntityStatus radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "SwissFMIAEntityStatus heading", "not verified");
				}
				break;
			
			case "SwissExempt":
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("CH_Exempt_text"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "SwissExempt heading", "verified");
					if (parser(csvValueArray, GetText("CH_Exempt4a_text"))) {
						test.log(LogStatus.PASS, "SwissExempt radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "SwissExempt radio text 1", "not verified");
					}
					if (click("CH_Exempt4a")==true) {
						test.log(LogStatus.PASS, "Click SwissExempt radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click SwissExempt radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("CH_Exempt4b_text"))) {
						test.log(LogStatus.PASS, "SwissExempt radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "SwissExempt radio text 2", "not verified");
					}
					if (click("CH_Exempt4b")==true) {
						test.log(LogStatus.PASS, "Click SwissExempt radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click SwissExempt radio 2", "not verified");
					}
					if (parser(csvValueArray, GetText("CH_Exempt1a_text"))) {
						test.log(LogStatus.PASS, "SwissExempt radio text 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "SwissExempt radio text 3", "not verified");
					}
					if (click("CH_Exempt1a")==true) {
						test.log(LogStatus.PASS, "Click SwissExempt radio 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click SwissExempt radio 3", "not verified");
					}
					if (parser(csvValueArray, GetText("CH_Exempt1b_text"))) {
						test.log(LogStatus.PASS, "SwissExempt radio text 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "SwissExempt radio text 4", "not verified");
					}
					if (click("CH_Exempt1b")==true) {
						test.log(LogStatus.PASS, "Click SwissExempt radio 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click SwissExempt radio 4", "not verified");
					}
					if (parser(csvValueArray, GetText("CH_Exempt1c_text"))) {
						test.log(LogStatus.PASS, "SwissExempt radio text 5", "verified");
					}else {
						test.log(LogStatus.FAIL, "SwissExempt radio text 5", "not verified");
					}
					if (click("CH_Exempt1c")==true) {
						test.log(LogStatus.PASS, "Click SwissExempt radio 5", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click SwissExempt radio 5", "not verified");
					}
					if (parser(csvValueArray, GetText("CH_Exempt2_text"))) {
						test.log(LogStatus.PASS, "SwissExempt radio text 6", "verified");
					}else {
						test.log(LogStatus.FAIL, "SwissExempt radio text 6", "not verified");
					}
					if (click("CH_Exempt2")==true) {
						test.log(LogStatus.PASS, "Click SwissExempt radio 6", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click SwissExempt radio 6", "not verified");
					}
					if (parser(csvValueArray, GetText("CH_ExemptNonUndertaking_text"))) {
						test.log(LogStatus.PASS, "SwissExempt radio text 7", "verified");
					}else {
						test.log(LogStatus.FAIL, "SwissExempt radio text 7", "not verified");
					}
					if (click("CH_ExemptNonUndertaking")==true) {
						test.log(LogStatus.PASS, "Click SwissExempt radio 7", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click SwissExempt radio 7", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "SwissExempt heading", "not verified");
				}
				break;
			case "SwissNonExempt" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("CH_NonExempt_text"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "SwissNonExempt heading", "verified");
					if (parser(csvValueArray, GetText("CH_NonExempt_FC+_text"))) {
						test.log(LogStatus.PASS, "SwissNonExempt radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "SwissNonExempt radio text 1", "not verified");
					}
					if (click("CH_NonExempt_FC+")==true) {
						test.log(LogStatus.PASS, "Click SwissNonExempt radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click SwissNonExempt radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("CH_NonExempt_FC-_text"))) {
						test.log(LogStatus.PASS, "SwissNonExempt radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "SwissNonExempt radio text 2", "not verified");
					}
					if (click("CH_NonExempt_FC-")==true) {
						test.log(LogStatus.PASS, "Click SwissNonExempt radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click SwissNonExempt radio 2", "not verified");
					}
					if (parser(csvValueArray, GetText("CH_NonExempt_NFC+_text"))) {
						test.log(LogStatus.PASS, "SwissNonExempt radio text 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "SwissNonExempt radio text 3", "not verified");
					}
					if (click("CH_NonExempt_NFC+")==true) {
						test.log(LogStatus.PASS, "Click SwissNonExempt radio 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click SwissNonExempt radio 3", "not verified");
					}
					if (parser(csvValueArray, GetText("CH_NonExempt_NFC-_text"))) {
						test.log(LogStatus.PASS, "SwissNonExempt radio text 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "SwissNonExempt radio text 4", "not verified");
					}
					if (click("CH_NonExempt_NFC-")==true) {
						test.log(LogStatus.PASS, "Click SwissNonExempt radio 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click SwissNonExempt radio 4", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "SwissNonExempt heading", "not verified");
				}
				break;
			case "SwissThirdCountryEntity" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("CH_ThirdCountryEntity"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "SwissThirdCountryEntity heading", "verified");
					if (parser(csvValueArray, GetText("CH_ThirdCountry_yes_text"))) {
						test.log(LogStatus.PASS, "SwissThirdCountryEntity radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "SwissThirdCountryEntity radio text 1", "not verified");
					}
					if (click("CH_ThirdCountry_yes")==true) {
						test.log(LogStatus.PASS, "Click SwissThirdCountryEntity radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click SwissThirdCountryEntity radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("CH_ThirdCountry_no_text"))) {
						test.log(LogStatus.PASS, "SwissThirdCountryEntity radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "SwissThirdCountryEntity radio text 2", "not verified");
					}
					if (click("CH_ThirdCountry_no")==true) {
						test.log(LogStatus.PASS, "Click SwissThirdCountryEntity radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click SwissThirdCountryEntity radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "SwissThirdCountryEntity heading", "not verified");
				}
				break;
			
			case "FMIAAANAGroupInformation" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("CH_FMIAAANAGroup"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "FMIAAANAGroupInformation heading", "verified");
					if (parser(csvValueArray, GetText("CH_AANAGroup_yes_text"))) {
						test.log(LogStatus.PASS, "FMIAAANAGroupInformation radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "FMIAAANAGroupInformation radio text 1", "not verified");
					}
					if (click("CH_AANAGroup_yes")==true) {
						test.log(LogStatus.PASS, "Click FMIAAANAGroupInformation radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click FMIAAANAGroupInformation radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("CH_AANAGroup_no_text"))) {
						test.log(LogStatus.PASS, "FMIAAANAGroupInformation radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "FMIAAANAGroupInformation radio text 2", "not verified");
					}
					if (click("CH_AANAGroup_no")==true) {
						test.log(LogStatus.PASS, "Click FMIAAANAGroupInformation radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click FMIAAANAGroupInformation radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "FMIAAANAGroupInformation heading", "not verified");
				}
				break;
			case "FMIAAANAGroupInformation2" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("CH_FMIAAANAGroupInfo2"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "FMIAAANAGroupInformation2 heading", "verified");
				} else {
					test.log(LogStatus.FAIL, "FMIAAANAGroupInformation2 heading", "not verified");
				}
				break;
			case "SwissAANAThreshold" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("CH_AANAThreshold"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "SwissAANAThreshold heading", "verified");
					if (parser(csvValueArray, GetText("CH_AANAThreshold_above_text"))) {
						test.log(LogStatus.PASS, "SwissAANAThreshold radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "SwissAANAThreshold radio text 1", "not verified");
					}
					if (click("CH_AANAThreshold_above")==true) {
						test.log(LogStatus.PASS, "Click SwissAANAThreshold radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click SwissAANAThreshold radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("CH_AANAThreshold_notabove_text"))) {
						test.log(LogStatus.PASS, "SwissAANAThreshold radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "SwissAANAThreshold radio text 2", "not verified");
					}
					if (click("CH_AANAThreshold_notabove")==true) {
						test.log(LogStatus.PASS, "Click SwissAANAThreshold radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click SwissAANAThreshold radio 2", "not verified");
					}
					System.out.println(GetText("CH_AANAThreshold_ultimate_text"));
					if (parser(csvValueArray, GetText("CH_AANAThreshold_ultimate_text"))) {
						test.log(LogStatus.PASS, "SwissAANAThreshold radio text 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "SwissAANAThreshold radio text 3", "not verified");
					}
					if (click("CH_AANAThreshold_ultimate")==true) {
						test.log(LogStatus.PASS, "Click SwissAANAThreshold radio 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click SwissAANAThreshold radio 3", "not verified");
					}
					System.out.println(GetText("CH_AANAThreshold_person_text"));
					if (parser(csvValueArray, GetText("CH_AANAThreshold_person_text"))) {
						test.log(LogStatus.PASS, "SwissAANAThreshold radio text 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "SwissAANAThreshold radio text 4", "not verified");
					}
					if (click("CH_AANAThreshold_person")==true) {
						test.log(LogStatus.PASS, "Click SwissAANAThreshold radio 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click SwissAANAThreshold radio 4", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "SwissAANAThreshold heading", "not verified");
				}
				break;
			case "FMIAAANAThresholdEstimate" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("CH_AANAThresholdEstimate"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "FMIAAANAThresholdEstimate heading", "verified");
					if (parser(csvValueArray, GetText("CH_AANAThresholdEstimate_2017_text"))) {
						test.log(LogStatus.PASS, "FMIAAANAThresholdEstimate radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "FMIAAANAThresholdEstimate radio text 1", "not verified");
					}
					if (click("CH_AANAThresholdEstimate_2017")==true) {
						test.log(LogStatus.PASS, "Click FMIAAANAThresholdEstimate radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click FMIAAANAThresholdEstimate radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("CH_AANAThresholdEstimate_2018_text"))) {
						test.log(LogStatus.PASS, "FMIAAANAThresholdEstimate radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "FMIAAANAThresholdEstimate radio text 2", "not verified");
					}
					if (click("CH_AANAThresholdEstimate_2018")==true) {
						test.log(LogStatus.PASS, "Click FMIAAANAThresholdEstimate radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click FMIAAANAThresholdEstimate radio 2", "not verified");
					}
					if (parser(csvValueArray, GetText("CH_AANAThresholdEstimate_2019_text"))) {
						test.log(LogStatus.PASS, "FMIAAANAThresholdEstimate radio text 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "FMIAAANAThresholdEstimate radio text 3", "not verified");
					}
					if (click("CH_AANAThresholdEstimate_2019")==true) {
						test.log(LogStatus.PASS, "Click FMIAAANAThresholdEstimate radio 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click FMIAAANAThresholdEstimate radio 3", "not verified");
					}
					if (parser(csvValueArray, GetText("CH_AANAThresholdEstimate_2020_text"))) {
						test.log(LogStatus.PASS, "FMIAAANAThresholdEstimate radio text 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "FMIAAANAThresholdEstimate radio text 4", "not verified");
					}
					if (click("CH_AANAThresholdEstimate_2020")==true) {
						test.log(LogStatus.PASS, "Click FMIAAANAThresholdEstimate radio 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click FMIAAANAThresholdEstimate radio 4", "not verified");
					}
					if (parser(csvValueArray, GetText("CH_AANAThresholdEstimate_none_text"))) {
						test.log(LogStatus.PASS, "FMIAAANAThresholdEstimate radio text 5", "verified");
					}else {
						test.log(LogStatus.FAIL, "FMIAAANAThresholdEstimate radio text 5", "not verified");
					}
					if (click("CH_AANAThresholdEstimate_none")==true) {
						test.log(LogStatus.PASS, "Click FMIAAANAThresholdEstimate radio 5", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click FMIAAANAThresholdEstimate radio 5", "not verified");
					}
					if (parser(csvValueArray, GetText("CH_AANAThresholdEstimate_decline_text"))) {
						test.log(LogStatus.PASS, "FMIAAANAThresholdEstimate radio text 6", "verified");
					}else {
						test.log(LogStatus.FAIL, "FMIAAANAThresholdEstimate radio text 6", "not verified");
					}
					if (click("CH_AANAThresholdEstimate_decline_text")==true) {
						test.log(LogStatus.PASS, "Click FMIAAANAThresholdEstimate radio 6", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click FMIAAANAThresholdEstimate radio 6", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "FMIAAANAThresholdEstimate heading", "not verified");
				}
				break;
			}
		}
	}
	
	
	public static void USAMegaFunction(HashMap<String, String> TestData, String[] heading) {
		String[] csvValueArray;
		boolean headingMatch;
		for (String s : heading) {
			switch(s) {
			case "US_CFTCEntityStatus" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("US_CFTCEntityStatus"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "US_CFTCEntityStatus heading", "verified");
					if (parser(csvValueArray, GetText("US_CFTCEntityStatus_SD_noPR_text"))) {
						test.log(LogStatus.PASS, "US_CFTCEntityStatus radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "US_CFTCEntityStatus radio text 1", "not verified");
					}
					if (click("US_CFTCEntityStatus_SD_noPR")==true) {
						test.log(LogStatus.PASS, "Click US_CFTCEntityStatus radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_CFTCEntityStatus radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("US_CFTCEntityStatus_MSP_noPR_text"))) {
						test.log(LogStatus.PASS, "US_CFTCEntityStatus radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_CFTCEntityStatus radio text 2", "not verified");
					}
					if (click("US_CFTCEntityStatus_MSP_noPR")==true) {
						test.log(LogStatus.PASS, "Click US_CFTCEntityStatus radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_CFTCEntityStatus radio 2", "not verified");
					}
					if (parser(csvValueArray, GetText("US_CFTCEntityStatus_SD_PR_text"))) {
						test.log(LogStatus.PASS, "US_CFTCEntityStatus radio text 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_CFTCEntityStatus radio text 3", "not verified");
					}
					if (click("US_CFTCEntityStatus_SD_PR")==true) {
						test.log(LogStatus.PASS, "Click US_CFTCEntityStatus radio 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_CFTCEntityStatus radio 3", "not verified");
					}
					if (parser(csvValueArray, GetText("US_CFTCEntityStatus_endUser_text"))) {
						test.log(LogStatus.PASS, "US_CFTCEntityStatus radio text 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_CFTCEntityStatus radio text 4", "not verified");
					}
					if (click("US_CFTCEntityStatus_endUser")==true) {
						test.log(LogStatus.PASS, "Click US_CFTCEntityStatus radio 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_CFTCEntityStatus radio 4", "not verified");
					}
					if (parser(csvValueArray, GetText("US_CFTCEntityStatus_none_text"))) {
						test.log(LogStatus.PASS, "US_CFTCEntityStatus radio text 5", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_CFTCEntityStatus radio text 5", "not verified");
					}
					if (click("US_CFTCEntityStatus_none")==true) {
						test.log(LogStatus.PASS, "Click US_CFTCEntityStatus radio 5", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_CFTCEntityStatus radio 5", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "US_CFTCEntityStatus heading", "not verified");
				}
				break;
			case "US_CFTC_General" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("US_CFTC_General"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "US_CFTC_General heading", "verified");
					if (parser(csvValueArray, GetText("US_CFTC_person_text"))) {
						test.log(LogStatus.PASS, "US_CFTC_General radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "US_CFTC_General radio text 1", "not verified");
					}
					if (click("US_CFTC_person")==true) {
						test.log(LogStatus.PASS, "Click US_CFTC_General radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_CFTC_General radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("US_CFTC_foreign_text"))) {
						test.log(LogStatus.PASS, "US_CFTC_General radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_CFTC_General radio text 2", "not verified");
					}
					if (click("US_CFTC_foreign")==true) {
						test.log(LogStatus.PASS, "Click US_CFTC_General radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_CFTC_General radio 2", "not verified");
					}
					if (parser(csvValueArray, GetText("US_CFTC_none_text"))) {
						test.log(LogStatus.PASS, "US_CFTC_General radio text 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_CFTC_General radio text 3", "not verified");
					}
					if (click("US_CFTC_none")==true) {
						test.log(LogStatus.PASS, "Click US_CFTC_General radio 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_CFTC_General radio 3", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "US_CFTC_General heading", "not verified");
				}
				break;
			case "US_CFTC_Branches" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("USCFTCBranches"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "US_CFTC_Branches heading", "verified");
					if (parser(csvValueArray, GetText("US_CFTC_noBranch_text"))) {
						test.log(LogStatus.PASS, "US_CFTC_Branches radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "US_CFTC_Branches radio text 1", "not verified");
					}
					if (click("US_CFTC_noBranch")==true) {
						test.log(LogStatus.PASS, "Click US_CFTC_Branches radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_CFTC_Branches radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("US_CFTC_someOrAllBranch_text"))) {
						test.log(LogStatus.PASS, "US_CFTC_Branches radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_CFTC_Branches radio text 2", "not verified");
					}
					if (click("US_CFTC_someOrAllBranch")==true) {
						test.log(LogStatus.PASS, "Click US_CFTC_Branches radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_CFTC_Branches radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "US_CFTC_Branches heading", "not verified");
				}
				break;
			case "US_CFTC_Guarantees" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("USCFTCGuarantees"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "US_CFTC_Guarantees heading", "verified");
					if (parser(csvValueArray, GetText("US_CFTC_noGuarentees_text"))) {
						test.log(LogStatus.PASS, "US_CFTC_Guarantees radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "US_CFTC_Guarantees radio text 1", "not verified");
					}
					if (click("US_CFTC_noGuarentees")==true) {
						test.log(LogStatus.PASS, "Click US_CFTC_Guarantees radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_CFTC_Guarantees radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("US_CFTC_guarentees_text"))) {
						test.log(LogStatus.PASS, "US_CFTC_Guarantees radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_CFTC_Guarantees radio text 2", "not verified");
					}
					if (click("US_CFTC_guarentees")==true) {
						test.log(LogStatus.PASS, "Click US_CFTC_Guarantees radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_CFTC_Guarantees radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "US_CFTC_Guarantees heading", "not verified");
				}
				break;
			case "US_PREntityStatus" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("US_PREntityStatus"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "US_PREntityStatus heading", "verified");
					if (parser(csvValueArray, GetText("US_PREntityStatus_SD_PR_text"))) {
						test.log(LogStatus.PASS, "US_PREntityStatus radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "US_PREntityStatus radio text 1", "not verified");
					}
					if (click("US_PREntityStatus_SD_PR")==true) {
						test.log(LogStatus.PASS, "Click US_PREntityStatus radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_PREntityStatus radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("US_PREntityStatus_MSP_PR_text"))) {
						test.log(LogStatus.PASS, "US_PREntityStatus radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_PREntityStatus radio text 2", "not verified");
					}
					if (click("US_PREntityStatus_MSP_PR")==true) {
						test.log(LogStatus.PASS, "Click US_PREntityStatus radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_PREntityStatus radio 2", "not verified");
					}
					if (parser(csvValueArray, GetText("US_PREntityStatus_SE_noPR_text"))) {
						test.log(LogStatus.PASS, "US_PREntityStatus radio text 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_PREntityStatus radio text 3", "not verified");
					}
					if (click("US_PREntityStatus_SE_noPR")==true) {
						test.log(LogStatus.PASS, "Click US_PREntityStatus radio 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_PREntityStatus radio 3", "not verified");
					}
					if (parser(csvValueArray, GetText("US_PREntityStatus_endUser_text"))) {
						test.log(LogStatus.PASS, "US_PREntityStatus radio text 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_PREntityStatus radio text 4", "not verified");
					}
					if (click("US_PREntityStatus_endUser")==true) {
						test.log(LogStatus.PASS, "Click US_PREntityStatus radio 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_PREntityStatus radio 4", "not verified");
					}
					if (parser(csvValueArray, GetText("US_PREntityStatus_none_text"))) {
						test.log(LogStatus.PASS, "US_PREntityStatus radio text 5", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_PREntityStatus radio text 5", "not verified");
					}
					if (click("US_PREntityStatus_none")==true) {
						test.log(LogStatus.PASS, "Click US_PREntityStatus radio 5", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_PREntityStatus radio 5", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "US_PREntityStatus heading", "not verified");
				}
				break;
			case "US_PR_General" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("US_PR_General"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "US_PR_General heading", "verified");
					if (parser(csvValueArray, GetText("US_PR_person_text"))) {
						test.log(LogStatus.PASS, "US_PR_General radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "US_PR_General radio text 1", "not verified");
					}
					if (click("US_PR_person")==true) {
						test.log(LogStatus.PASS, "Click US_PR_General radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_PR_General radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("US_PR_foreign_text"))) {
						test.log(LogStatus.PASS, "US_PR_General radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_PR_General radio text 2", "not verified");
					}
					if (click("US_PR_foreign")==true) {
						test.log(LogStatus.PASS, "Click US_PR_General radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_PR_General radio 2", "not verified");
					}
					if (parser(csvValueArray, GetText("US_PR_none_text"))) {
						test.log(LogStatus.PASS, "US_PR_General radio text 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_PR_General radio text 3", "not verified");
					}
					if (click("US_PR_none")==true) {
						test.log(LogStatus.PASS, "Click US_PR_General radio 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_PR_General radio 3", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "US_PR_General heading", "not verified");
				}
				break;
			case "US_PR_Branches" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("US_PR_Branches"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "US_PR_Branches heading", "verified");
					if (parser(csvValueArray, GetText("US_PR_noBranch_text"))) {
						test.log(LogStatus.PASS, "US_PR_Branches radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "US_PR_Branches radio text 1", "not verified");
					}
					if (click("US_PR_noBranch")==true) {
						test.log(LogStatus.PASS, "Click US_PR_Branches radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_PR_Branches radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("US_PR_someOrAllBranch_text"))) {
						test.log(LogStatus.PASS, "US_PR_Branches radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_PR_Branches radio text 2", "not verified");
					}
					if (click("US_PR_someOrAllBranch")==true) {
						test.log(LogStatus.PASS, "Click US_PR_Branches radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_PR_Branches radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "US_PR_Branches heading", "not verified");
				}
				break;
			case "US_PR_Guarentees" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("US_PR_Guarentees"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "US_PR_Guarentees heading", "verified");
					if (parser(csvValueArray, GetText("US_PR_noGuarentees_text"))) {
						test.log(LogStatus.PASS, "US_PR_Guarentees radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "US_PR_Guarentees radio text 1", "not verified");
					}
					if (click("US_PR_noGuarentees")==true) {
						test.log(LogStatus.PASS, "Click US_PR_Guarentees radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_PR_Guarentees radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("US_PR_guarentees_text"))) {
						test.log(LogStatus.PASS, "US_PR_Guarentees radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_PR_Guarentees radio text 2", "not verified");
					}
					if (click("US_PR_guarentees")==true) {
						test.log(LogStatus.PASS, "Click US_PR_Guarentees radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_PR_Guarentees radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "US_PR_Guarentees heading", "not verified");
				}
				break;
				
				//first double heading
				
			case "US_CFTC_Hedging_Exception_Status" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("US_CFTC_Hedging_Exception_Status"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "US_CFTC_Hedging_Exception_Status heading", "verified");
					if (parser(csvValueArray, GetText("US_CFTC_nonfinancial_text"))) {
						test.log(LogStatus.PASS, "US_CFTC_Hedging_Exception_Status radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "US_CFTC_Hedging_Exception_Status radio text 1", "not verified");
					}
					if (click("US_CFTC_nonfinancial")==true) {
						test.log(LogStatus.PASS, "Click US_CFTC_Hedging_Exception_Status radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_CFTC_Hedging_Exception_Status radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("US_CFTC_small_text"))) {
						test.log(LogStatus.PASS, "US_CFTC_Hedging_Exception_Status radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_CFTC_Hedging_Exception_Status radio text 2", "not verified");
					}
					if (click("US_CFTC_small")==true) {
						test.log(LogStatus.PASS, "Click US_CFTC_Hedging_Exception_Status radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_CFTC_Hedging_Exception_Status radio 2", "not verified");
					}
					if (parser(csvValueArray, GetText("US_CFTC_captive_text"))) {
						test.log(LogStatus.PASS, "US_CFTC_Hedging_Exception_Status radio text 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_CFTC_Hedging_Exception_Status radio text 3", "not verified");
					}
					if (click("US_CFTC_captive")==true) {
						test.log(LogStatus.PASS, "Click US_CFTC_Hedging_Exception_Status radio 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_CFTC_Hedging_Exception_Status radio 3", "not verified");
					}
					if (parser(csvValueArray, GetText("US_CFTC_exempt_text"))) {
						test.log(LogStatus.PASS, "US_CFTC_Hedging_Exception_Status radio text 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_CFTC_Hedging_Exception_Status radio text 4", "not verified");
					}
					if (click("US_CFTC_exempt")==true) {
						test.log(LogStatus.PASS, "Click US_CFTC_Hedging_Exception_Status radio 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_CFTC_Hedging_Exception_Status radio 4", "not verified");
					}
					if (parser(csvValueArray, GetText("US_CFTC_treasury_text"))) {
						test.log(LogStatus.PASS, "US_CFTC_Hedging_Exception_Status radio text 5", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_CFTC_Hedging_Exception_Status radio text 5", "not verified");
					}
					if (click("US_CFTC_treasury")==true) {
						test.log(LogStatus.PASS, "Click US_CFTC_Hedging_Exception_Status radio 5", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_CFTC_Hedging_Exception_Status radio 5", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "US_CFTC_Hedging_Exception_Status heading", "not verified");
				}
				break;

			case "US_CFTC_Hedging_Exception_Status2" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("US_CFTC_Hedging_Exception_Status2"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "US_CFTC_Hedging_Exception_Status2 heading", "verified");
				} else {
					test.log(LogStatus.FAIL, "US_CFTC_Hedging_Exception_Status2 heading", "not verified");
				}
				break;
			case "US_Swaps_Elections" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("US_Swaps_Elections"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "US_Swaps_Elections heading", "verified");
					if (parser(csvValueArray, GetText("US_Swaps_allTransactions_text"))) {
						test.log(LogStatus.PASS, "US_Swaps_Elections radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "US_Swaps_Elections radio text 1", "not verified");
					}
					if (click("US_Swaps_allTransactions")==true) {
						test.log(LogStatus.PASS, "Click US_Swaps_Elections radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_Swaps_Elections radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("US_Swaps_notAllTransactions_text"))) {
						test.log(LogStatus.PASS, "US_Swaps_Elections radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_Swaps_Elections radio text 2", "not verified");
					}
					if (click("US_Swaps_notAllTransactions")==true) {
						test.log(LogStatus.PASS, "Click US_Swaps_Elections radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_Swaps_Elections radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "US_Swaps_Elections heading", "not verified");
				}
				break;
			case "US_Swaps_Reporting" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("US_Swaps_Reporting"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "US_Swaps_Reporting heading", "verified");
					if (parser(csvValueArray, GetText("US_Swaps_annualFiling_text"))) {
						test.log(LogStatus.PASS, "US_Swaps_Reporting radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "US_Swaps_Reporting radio text 1", "not verified");
					}
					if (click("US_Swaps_annualFiling")==true) {
						test.log(LogStatus.PASS, "Click US_Swaps_Reporting radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_Swaps_Reporting radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("US_Swaps_tradeFiling_text"))) {
						test.log(LogStatus.PASS, "US_Swaps_Reporting radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_Swaps_Reporting radio text 2", "not verified");
					}
					if (click("US_Swaps_tradeFiling")==true) {
						test.log(LogStatus.PASS, "Click US_Swaps_Reporting radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_Swaps_Reporting radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "US_Swaps_Reporting heading", "not verified");
				}
				break;
			case "US_Financial_Obligations" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("US_Financial_Obligations"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "US_Financial_Obligations heading", "verified");
					if (parser(csvValueArray, GetText("US_Financial_writtenCredit_text"))) {
						test.log(LogStatus.PASS, "US_Financial_Obligations radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "US_Financial_Obligations radio text 1", "not verified");
					}
					if (click("US_Financial_writtenCredit")==true) {
						test.log(LogStatus.PASS, "Click US_Financial_Obligations radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_Financial_Obligations radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("US_Financial_pledged_text"))) {
						test.log(LogStatus.PASS, "US_Financial_Obligations radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_Financial_Obligations radio text 2", "not verified");
					}
					if (click("US_Financial_pledged")==true) {
						test.log(LogStatus.PASS, "Click US_Financial_Obligations radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_Financial_Obligations radio 2", "not verified");
					}
					if (parser(csvValueArray, GetText("US_Financial_writtenThirdParty_text"))) {
						test.log(LogStatus.PASS, "US_Financial_Obligations radio text 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_Financial_Obligations radio text 3", "not verified");
					}
					if (click("US_Financial_writtenThirdParty")==true) {
						test.log(LogStatus.PASS, "Click US_Financial_Obligations radio 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_Financial_Obligations radio 3", "not verified");
					}
					if (parser(csvValueArray, GetText("US_Financial_available_text"))) {
						test.log(LogStatus.PASS, "US_Financial_Obligations radio text 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_Financial_Obligations radio text 4", "not verified");
					}
					if (click("US_Financial_available")==true) {
						test.log(LogStatus.PASS, "Click US_Financial_Obligations radio 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_Financial_Obligations radio 4", "not verified");
					}
					if (parser(csvValueArray, GetText("US_Financial_other_text"))) {
						test.log(LogStatus.PASS, "US_Financial_Obligations radio text 5", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_Financial_Obligations radio text 5", "not verified");
					}
					if (click("US_Financial_other")==true) {
						test.log(LogStatus.PASS, "Click US_Financial_Obligations radio 5", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_Financial_Obligations radio 5", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "US_Financial_Obligations heading", "not verified");
				}
				break;
			case "US_SEC_IssuerHeading" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("US_SEC_IssuerHeading"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "US_SEC_IssuerHeading heading", "verified");
					if (parser(csvValueArray, GetText("US_SEC_Issuer_text"))) {
						test.log(LogStatus.PASS, "US_SEC_IssuerHeading radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "US_SEC_IssuerHeading radio text 1", "not verified");
					}
					if (click("US_SEC_Issuer")==true) {
						test.log(LogStatus.PASS, "Click US_SEC_IssuerHeading radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_SEC_IssuerHeading radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("US_SEC_notIssuer_text"))) {
						test.log(LogStatus.PASS, "US_SEC_IssuerHeading radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_SEC_IssuerHeading radio text 2", "not verified");
					}
					if (click("US_SEC_notIssuer")==true) {
						test.log(LogStatus.PASS, "Click US_SEC_IssuerHeading radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_SEC_IssuerHeading radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "US_SEC_IssuerHeading heading", "not verified");
				}
				break;
				
			case "US_SEC_centralIndexKeyHeading" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("US_SEC_centralIndexKeyHeading"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "US_SEC_centralIndexKeyHeading heading", "verified");
				} else {
					test.log(LogStatus.FAIL, "US_SEC_centralIndexKeyHeading heading", "not verified");
				}
				break;
			case "US_BoardApproval" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("US_BoardApproval"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "US_BoardApproval heading", "verified");
					if (parser(csvValueArray, GetText("US_BoardApproval_approved_text"))) {
						test.log(LogStatus.PASS, "US_BoardApproval radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "US_BoardApproval radio text 1", "not verified");
					}
					if (click("US_BoardApproval_approved")==true) {
						test.log(LogStatus.PASS, "Click US_BoardApproval radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_BoardApproval radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("US_BoardApproval_noApproval_text"))) {
						test.log(LogStatus.PASS, "US_BoardApproval radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_BoardApproval radio text 2", "not verified");
					}
					if (click("US_BoardApproval_noApproval")==true) {
						test.log(LogStatus.PASS, "Click US_BoardApproval radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_BoardApproval radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "US_BoardApproval heading", "not verified");
				}
				break;
				
				// second double heading
				
			case "US_AANAGroup" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("US_AANAGroup"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "US_AANAGroup heading", "verified");
					if (parser(csvValueArray, GetText("US_AANAGroup_yes_text"))) {
						test.log(LogStatus.PASS, "US_AANAGroup radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "US_AANAGroup radio text 1", "not verified");
					}
					if (click("US_AANAGroup_yes")==true) {
						test.log(LogStatus.PASS, "Click US_AANAGroup radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_AANAGroup radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("US_AANAGroup_no_text"))) {
						test.log(LogStatus.PASS, "US_AANAGroup radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_AANAGroup radio text 2", "not verified");
					}
					if (click("US_AANAGroup_no")==true) {
						test.log(LogStatus.PASS, "Click US_AANAGroup radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_AANAGroup radio 2", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "US_AANAGroup heading", "not verified");
				}
				break;
			case "US_AANAGroup2" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("US_AANAGroup2"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "US_AANAGroup2 heading", "verified");
				} else {
					test.log(LogStatus.FAIL, "US_AANAGroup2 heading", "not verified");
				}
				break;
			case "US_AANAThreshold" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("US_AANAThreshold"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "US_AANAThreshold heading", "verified");
					if (parser(csvValueArray, GetText("US_AANAThreshold_above_text"))) {
						test.log(LogStatus.PASS, "US_AANAThreshold radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "US_AANAThreshold radio text 1", "not verified");
					}
					if (click("US_AANAThreshold_above")==true) {
						test.log(LogStatus.PASS, "Click US_AANAThreshold radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_AANAThreshold radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("US_AANAThreshold_notabove_text"))) {
						test.log(LogStatus.PASS, "US_AANAThreshold radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_AANAThreshold radio text 2", "not verified");
					}
					if (click("US_AANAThreshold_notabove")==true) {
						test.log(LogStatus.PASS, "Click US_AANAThreshold radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_AANAThreshold radio 2", "not verified");
					}
					if (parser(csvValueArray, GetText("US_AANAThreshold_ultimate_text"))) {
						test.log(LogStatus.PASS, "US_AANAThreshold radio text 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_AANAThreshold radio text 3", "not verified");
					}
					if (click("US_AANAThreshold_ultimate")==true) {
						test.log(LogStatus.PASS, "Click US_AANAThreshold radio 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_AANAThreshold radio 3", "not verified");
					}
					if (parser(csvValueArray, GetText("US_AANAThreshold_person_text"))) {
						test.log(LogStatus.PASS, "US_AANAThreshold radio text 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_AANAThreshold radio text 4", "not verified");
					}
					if (click("US_AANAThreshold_person")==true) {
						test.log(LogStatus.PASS, "Click US_AANAThreshold radio 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_AANAThreshold radio 4", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "US_AANAThreshold heading", "not verified");
				}
				break;
			case "US_AANAThresholdEstimate" : 
				csvValueArray = TestData.get(s.toUpperCase()).split(";");
				headingMatch = parser(csvValueArray, GetText("US_AANAThresholdEstimate"));
				if (headingMatch) {
					test.log(LogStatus.PASS, "US_AANAThresholdEstimate heading", "verified");
					if (parser(csvValueArray, GetText("US_AANAThresholdEstimate_2017_text"))) {
						test.log(LogStatus.PASS, "US_AANAThresholdEstimate radio text 1", "verified");
					} else {
						test.log(LogStatus.FAIL, "US_AANAThresholdEstimate radio text 1", "not verified");
					}
					if (click("US_AANAThresholdEstimate_2017")==true) {
						test.log(LogStatus.PASS, "Click US_AANAThresholdEstimate radio 1", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_AANAThresholdEstimate radio 1", "not verified");
					}
					if (parser(csvValueArray, GetText("US_AANAThresholdEstimate_2018_text"))) {
						test.log(LogStatus.PASS, "US_AANAThresholdEstimate radio text 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_AANAThresholdEstimate radio text 2", "not verified");
					}
					if (click("US_AANAThresholdEstimate_2018")==true) {
						test.log(LogStatus.PASS, "Click US_AANAThresholdEstimate radio 2", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_AANAThresholdEstimate radio 2", "not verified");
					}
					if (parser(csvValueArray, GetText("US_AANAThresholdEstimate_2019_text"))) {
						test.log(LogStatus.PASS, "US_AANAThresholdEstimate radio text 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_AANAThresholdEstimate radio text 3", "not verified");
					}
					if (click("US_AANAThresholdEstimate_2019")==true) {
						test.log(LogStatus.PASS, "Click US_AANAThresholdEstimate radio 3", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_AANAThresholdEstimate radio 3", "not verified");
					}
					if (parser(csvValueArray, GetText("US_AANAThresholdEstimate_2020_text"))) {
						test.log(LogStatus.PASS, "US_AANAThresholdEstimate radio text 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_AANAThresholdEstimate radio text 4", "not verified");
					}
					if (click("US_AANAThresholdEstimate_2020")==true) {
						test.log(LogStatus.PASS, "Click US_AANAThresholdEstimate radio 4", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_AANAThresholdEstimate radio 4", "not verified");
					}
					if (parser(csvValueArray, GetText("US_AANAThresholdEstimate_none_text"))) {
						test.log(LogStatus.PASS, "US_AANAThresholdEstimate radio text 5", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_AANAThresholdEstimate radio text 5", "not verified");
					}
					if (click("US_AANAThresholdEstimate_none")==true) {
						test.log(LogStatus.PASS, "Click US_AANAThresholdEstimate radio 5", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_AANAThresholdEstimate radio 5", "not verified");
					}
					if (parser(csvValueArray, GetText("US_AANAThresholdEstimate_decline_text"))) {
						test.log(LogStatus.PASS, "US_AANAThresholdEstimate radio text 6", "verified");
					}else {
						test.log(LogStatus.FAIL, "US_AANAThresholdEstimate radio text 6", "not verified");
					}
					if (click("US_AANAThresholdEstimate_decline")==true) {
						test.log(LogStatus.PASS, "Click US_AANAThresholdEstimate radio 6", "verified");
					}else {
						test.log(LogStatus.FAIL, "Click US_AANAThresholdEstimate radio 6", "not verified");
					}
				} else {
					test.log(LogStatus.FAIL, "US_AANAThresholdEstimate heading", "not verified");
				}
				break;
			}
		}
	}
	//HELPER FUNCTION 
	public static boolean parser(String[] array, String data) {
		String[] innerArray;
		for (int i = 0; i < array.length; i++) {
			if (data.equals(array[i]))
				return true;
		}
		return false;
	}
	
	// TESTING AND DEBUGGING FUNCTIONS
	public static void Tester(HashMap<String, String> TestData, String heading) {
		boolean headingMatch;
		String headingTitle = TestData.get(heading.toUpperCase());
		switch(heading) {
		case "CanadaOSFIEntity2" : 
			headingMatch = headingTitle.equals(GetText("CA_OSFI2"));
			if (headingMatch) {
				test.log(LogStatus.PASS, "CanadaOSFIEntity2 heading", "verified");
			} else {
				test.log(LogStatus.FAIL, "CanadaOSFIEntity2 heading", "not verified");
			}
			break;
		}
	}
	
	public static void Tester2(HashMap<String, String> TestData, String heading) {
		boolean headingMatch;
		String headingTitle = TestData.get(heading.toUpperCase());
		switch(heading) {
		case "CanadaOSFIEntity2" : 
			headingMatch = headingTitle.equals(GetText("CA_OSFI2"));
			if (headingMatch) {
				test.log(LogStatus.PASS, "CanadaOSFIEntity2 heading", "verified");
			} else {
				test.log(LogStatus.FAIL, "CanadaOSFIEntity2 heading", "not verified");
			}
			break;
		}
	}
	


}
