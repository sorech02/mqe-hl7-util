package org.immregistries.mqe.hl7util.parser.profile.generator;

import java.util.HashMap;
import java.util.Map;

public class GeneratedHL7Profile20160426 implements MessageProfile {

  /**
   * These maps contain the profile information for each segment.
   */
  private final Map<String, String> fieldDataTypeMap = new HashMap<String, String>();

  /**
   * This contains complexity information for each datatype encountered.
   */
  private final Map<String, FieldComplexity> dataTypeComplexityMap = new HashMap<String, FieldComplexity>();
  ;
  /**
   * This contains Descriptions of each field defined in the xml profile document.
   */
  private final Map<String, String> fieldDescMap = new HashMap<String, String>();
  ;

  public GeneratedHL7Profile20160426() {
    populateProfileMap();
  }

  /**
   * This puts values into the maps.  This could possibly be in the constructor... except that in
   * the XML version, it's going to be doing disk IO, and that would be terrible in a constructor.
   */
  public void populateProfileMap() {
    populateFieldDataTypes();
    populateDataTypeComplexity();
    populateFieldDescriptions();
  }

  public void populateDataTypeComplexity() {
    dataTypeComplexityMap.put("XCN_IZ", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("MOP", FieldComplexity.SIMPLE);
    dataTypeComplexityMap.put("DT", FieldComplexity.SIMPLE);
    dataTypeComplexityMap.put("LA2_IZ", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("AUI", FieldComplexity.SIMPLE);
    dataTypeComplexityMap.put("MSG_IZ", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("VID_IZ", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("CWE_IZ", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("DR", FieldComplexity.SIMPLE);
    dataTypeComplexityMap.put("ID", FieldComplexity.SIMPLE);
    dataTypeComplexityMap.put("SAD", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("EI_IZ", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("XTN", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("DTM", FieldComplexity.SIMPLE);
    dataTypeComplexityMap.put("DTN", FieldComplexity.SIMPLE);
    dataTypeComplexityMap.put("FC", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("CWE", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("PTA", FieldComplexity.SIMPLE);
    dataTypeComplexityMap.put("IS", FieldComplexity.SIMPLE);
    dataTypeComplexityMap.put("MO", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("DDI", FieldComplexity.SIMPLE);
    dataTypeComplexityMap.put("varies", FieldComplexity.SIMPLE);
    dataTypeComplexityMap.put("XPN", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("HD_IZ_0361", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("HD_IZ_0362", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("XAD_IZ", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("HD_IZ_0363", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("NM", FieldComplexity.SIMPLE);
    dataTypeComplexityMap.put("DLD", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("TX", FieldComplexity.SIMPLE);
    dataTypeComplexityMap.put("XTN_IZ", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("EI", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("CX_IZ", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("XON", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("TM", FieldComplexity.SIMPLE);
    dataTypeComplexityMap.put("DLN", FieldComplexity.SIMPLE);
    dataTypeComplexityMap.put("TS", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("TQ", FieldComplexity.SIMPLE);
    dataTypeComplexityMap.put("PT_IZ", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("FT", FieldComplexity.SIMPLE);
    dataTypeComplexityMap.put("ST", FieldComplexity.SIMPLE);
    dataTypeComplexityMap.put("FN", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("RMC", FieldComplexity.SIMPLE);
    dataTypeComplexityMap.put("TS_IZ", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("XCN", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("(TBD)", FieldComplexity.SIMPLE);
    dataTypeComplexityMap.put("FN_IZ", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("RPT", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("CX", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("HD", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("JCC", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("EIP", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("SI", FieldComplexity.SIMPLE);
    dataTypeComplexityMap.put("ICD", FieldComplexity.SIMPLE);
    dataTypeComplexityMap.put("SAD_IZ", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("unknown", FieldComplexity.UNKNOWN);
    dataTypeComplexityMap.put("XPN_IZ", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("GTS", FieldComplexity.SIMPLE);
    dataTypeComplexityMap.put("XAD", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("PL", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("CNE", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("CE_IZ", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("CE", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("CQ", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("CP", FieldComplexity.COMPLEX);
    dataTypeComplexityMap.put("variable", FieldComplexity.UNKNOWN);
  }

  public void populateFieldDataTypes() {
    fieldDataTypeMap.put("IN1-4-10", "ST");
    fieldDataTypeMap.put("IN1-30-20-1", "DTM");
    fieldDataTypeMap.put("IN1-30-20-2", "ID");
    fieldDataTypeMap.put("PD1-4-2-5", "ST");
    fieldDataTypeMap.put("PD1-4-2-4", "ST");
    fieldDataTypeMap.put("PV1-6-7", "IS");
    fieldDataTypeMap.put("PV1-6-8", "IS");
    fieldDataTypeMap.put("PV1-6-5", "IS");
    fieldDataTypeMap.put("PV1-6-6", "IS");
    fieldDataTypeMap.put("PV1-6-3", "IS");
    fieldDataTypeMap.put("PV1-6-4", "HD");
    fieldDataTypeMap.put("PV1-6-1", "IS");
    fieldDataTypeMap.put("PV1-6-2", "IS");
    fieldDataTypeMap.put("IN2-25-6-1", "IS");
    fieldDataTypeMap.put("IN2-25-6-2", "ST");
    fieldDataTypeMap.put("IN2-25-6-3", "ID");
    fieldDataTypeMap.put("PD1-4-2-2", "ST");
    fieldDataTypeMap.put("PD1-4-2-3", "ST");
    fieldDataTypeMap.put("PD1-4-2-1", "ST");
    fieldDataTypeMap.put("IN2-49-1-3", "ST");
    fieldDataTypeMap.put("IN2-49-1-2", "ST");
    fieldDataTypeMap.put("NK1-26-13-2", "ID");
    fieldDataTypeMap.put("IN2-49-1-1", "ST");
    fieldDataTypeMap.put("NK1-26-13-1", "DTM");
    fieldDataTypeMap.put("PV1-5-4-1", "IS");
    fieldDataTypeMap.put("PV1-5-4-2", "ST");
    fieldDataTypeMap.put("GT1-4-12-2", "ID");
    fieldDataTypeMap.put("RXA-16-1", "DTM");
    fieldDataTypeMap.put("RXA-16-2", "ID");
    fieldDataTypeMap.put("IN2-49-1-4", "ST");
    fieldDataTypeMap.put("IN2-49-1-5", "ST");
    fieldDataTypeMap.put("GT1-4-12-1", "DTM");
    fieldDataTypeMap.put("IN1-49-10-2", "ST");
    fieldDataTypeMap.put("IN1-49-10-1", "ST");
    fieldDataTypeMap.put("PV1-11-11-1", "IS");
    fieldDataTypeMap.put("IN1-49-10-6", "ID");
    fieldDataTypeMap.put("IN1-49-10-5", "ST");
    fieldDataTypeMap.put("IN1-30-9-2", "ST");
    fieldDataTypeMap.put("IN1-49-10-4", "ST");
    fieldDataTypeMap.put("IN1-30-9-1", "IS");
    fieldDataTypeMap.put("IN1-49-10-3", "ID");
    fieldDataTypeMap.put("NTE-1", "SI");
    fieldDataTypeMap.put("NTE-0", "ST");
    fieldDataTypeMap.put("NTE-3", "FT");
    fieldDataTypeMap.put("NTE-2", "ID");
    fieldDataTypeMap.put("NTE-4", "CE");
    fieldDataTypeMap.put("PV1-17-9-2", "ST");
    fieldDataTypeMap.put("PV1-17-9-1", "IS");
    fieldDataTypeMap.put("PV1-17-9-3", "ID");
    fieldDataTypeMap.put("PV1-6-10-3", "ST");
    fieldDataTypeMap.put("PV1-6-10-4", "ID");
    fieldDataTypeMap.put("PV1-6-10-1", "ST");
    fieldDataTypeMap.put("PV1-6-10-2", "IS");
    fieldDataTypeMap.put("PV1-5-4-3", "ID");
    fieldDataTypeMap.put("IN1-30-9-3", "ID");
    fieldDataTypeMap.put("IN1-49-10-9", "ST");
    fieldDataTypeMap.put("PV1-11-11-2", "ST");
    fieldDataTypeMap.put("IN1-49-10-7", "ST");
    fieldDataTypeMap.put("PV1-11-11-3", "ID");
    fieldDataTypeMap.put("IN1-49-10-8", "ST");
    fieldDataTypeMap.put("IN2-69-10", "ST");
    fieldDataTypeMap.put("ORC-10-14-3", "ID");
    fieldDataTypeMap.put("ORC-10-14-2", "ST");
    fieldDataTypeMap.put("ORC-10-14-1", "IS");
    fieldDataTypeMap.put("IN3-6-1", "DTM");
    fieldDataTypeMap.put("IN3-6-2", "ID");
    fieldDataTypeMap.put("IN3-14-8", "IS");
    fieldDataTypeMap.put("IN3-14-7", "IS");
    fieldDataTypeMap.put("IN3-14-9", "HD");
    fieldDataTypeMap.put("IN3-14-4", "ST");
    fieldDataTypeMap.put("IN3-14-3", "ST");
    fieldDataTypeMap.put("IN3-14-6", "ST");
    fieldDataTypeMap.put("IN3-14-5", "ST");
    fieldDataTypeMap.put("RXR-5-2", "ST");
    fieldDataTypeMap.put("RXR-5-1", "ST");
    fieldDataTypeMap.put("RXR-5-4", "ST");
    fieldDataTypeMap.put("IN3-14-2", "FN");
    fieldDataTypeMap.put("RXR-5-3", "ID");
    fieldDataTypeMap.put("IN3-14-1", "ST");
    fieldDataTypeMap.put("RXR-5-6", "ID");
    fieldDataTypeMap.put("RXR-5-5", "ST");
    fieldDataTypeMap.put("IN3-3-12", "ID");
    fieldDataTypeMap.put("IN3-3-13", "ID");
    fieldDataTypeMap.put("IN1-7-12", "ST");
    fieldDataTypeMap.put("IN3-3-10", "ID");
    fieldDataTypeMap.put("IN3-3-11", "ST");
    fieldDataTypeMap.put("IN3-3-16", "CE");
    fieldDataTypeMap.put("IN3-3-17", "DR");
    fieldDataTypeMap.put("IN3-3-14", "HD");
    fieldDataTypeMap.put("IN3-3-15", "ID");
    fieldDataTypeMap.put("IN1-7-11", "ST");
    fieldDataTypeMap.put("IN1-7-10", "ST");
    fieldDataTypeMap.put("GT1-4-2", "ST");
    fieldDataTypeMap.put("IN2-22-9", "CE");
    fieldDataTypeMap.put("GT1-4-3", "ST");
    fieldDataTypeMap.put("GT1-4-4", "ST");
    fieldDataTypeMap.put("GT1-4-5", "ST");
    fieldDataTypeMap.put("GT1-4-6", "IS");
    fieldDataTypeMap.put("IN2-22-5", "ST");
    fieldDataTypeMap.put("GT1-4-7", "ID");
    fieldDataTypeMap.put("IN2-22-6", "IS");
    fieldDataTypeMap.put("GT1-4-8", "ID");
    fieldDataTypeMap.put("IN2-22-7", "ID");
    fieldDataTypeMap.put("GT1-4-9", "CE");
    fieldDataTypeMap.put("IN2-22-8", "ID");
    fieldDataTypeMap.put("PD1-4-23-2", "ST");
    fieldDataTypeMap.put("IN2-22-1", "FN");
    fieldDataTypeMap.put("PD1-4-23-1", "ST");
    fieldDataTypeMap.put("IN2-22-2", "ST");
    fieldDataTypeMap.put("IN2-22-3", "ST");
    fieldDataTypeMap.put("IN2-22-4", "ST");
    fieldDataTypeMap.put("IN3-3-19", "TS");
    fieldDataTypeMap.put("IN3-3-18", "ID");
    fieldDataTypeMap.put("GT1-45-13-1", "DTM");
    fieldDataTypeMap.put("GT1-45-13-2", "ID");
    fieldDataTypeMap.put("PD1-4-23-9", "ST");
    fieldDataTypeMap.put("PD1-4-23-7", "ST");
    fieldDataTypeMap.put("PD1-4-23-8", "ST");
    fieldDataTypeMap.put("IN3-3-21", "ST");
    fieldDataTypeMap.put("PD1-4-23-5", "ST");
    fieldDataTypeMap.put("IN3-3-22", "CWE");
    fieldDataTypeMap.put("PD1-4-23-6", "ID");
    fieldDataTypeMap.put("IN3-3-23", "CWE");
    fieldDataTypeMap.put("PD1-4-23-3", "ID");
    fieldDataTypeMap.put("PD1-4-23-4", "ST");
    fieldDataTypeMap.put("PV1-6-9", "ST");
    fieldDataTypeMap.put("IN3-3-20", "TS");
    fieldDataTypeMap.put("GT1-4-1", "FN");
    fieldDataTypeMap.put("PV1-9-20-1", "DTM");
    fieldDataTypeMap.put("PV1-9-20-2", "ID");
    fieldDataTypeMap.put("ORC-22-1-1", "ST");
    fieldDataTypeMap.put("ORC-22-1-3", "ST");
    fieldDataTypeMap.put("ORC-22-1-2", "ST");
    fieldDataTypeMap.put("IN1-30-11", "ST");
    fieldDataTypeMap.put("IN1-30-10", "ID");
    fieldDataTypeMap.put("GT1-14", "DT");
    fieldDataTypeMap.put("GT1-15", "NM");
    fieldDataTypeMap.put("GT1-16", "XPN");
    fieldDataTypeMap.put("GT1-17", "XAD");
    fieldDataTypeMap.put("GT1-10", "IS");
    fieldDataTypeMap.put("GT1-11", "CE");
    fieldDataTypeMap.put("GT1-12", "ST");
    fieldDataTypeMap.put("GT1-13", "DT");
    fieldDataTypeMap.put("OBX-18-1", "ST");
    fieldDataTypeMap.put("OBX-18-4", "ID");
    fieldDataTypeMap.put("GT1-19", "CX");
    fieldDataTypeMap.put("GT1-18", "XTN");
    fieldDataTypeMap.put("OBX-18-2", "IS");
    fieldDataTypeMap.put("OBX-18-3", "ST");
    fieldDataTypeMap.put("IN1-30-18", "ID");
    fieldDataTypeMap.put("IN1-30-19", "TS");
    fieldDataTypeMap.put("IN1-30-16", "CE");
    fieldDataTypeMap.put("IN1-30-17", "DR");
    fieldDataTypeMap.put("IN1-30-14", "HD");
    fieldDataTypeMap.put("IN1-30-15", "ID");
    fieldDataTypeMap.put("IN1-30-12", "ID");
    fieldDataTypeMap.put("IN1-30-13", "ID");
    fieldDataTypeMap.put("GT1-2-4-3", "ID");
    fieldDataTypeMap.put("GT1-2-4-2", "ST");
    fieldDataTypeMap.put("GT1-2-4-1", "IS");
    fieldDataTypeMap.put("GT1-30", "CE");
    fieldDataTypeMap.put("GT1-31", "DT");
    fieldDataTypeMap.put("GT1-32", "DT");
    fieldDataTypeMap.put("GT1-33", "IS");
    fieldDataTypeMap.put("GT1-34", "IS");
    fieldDataTypeMap.put("GT1-35", "CE");
    fieldDataTypeMap.put("GT1-36", "CE");
    fieldDataTypeMap.put("GT1-37", "IS");
    fieldDataTypeMap.put("GT1-38", "CE");
    fieldDataTypeMap.put("GT1-39", "ID");
    fieldDataTypeMap.put("PV1-17-23-7", "ST");
    fieldDataTypeMap.put("IN1-30-20", "TS");
    fieldDataTypeMap.put("PV1-17-23-8", "ST");
    fieldDataTypeMap.put("GT1-20", "IS");
    fieldDataTypeMap.put("PV1-17-23-9", "ST");
    fieldDataTypeMap.put("IN1-30-22", "CWE");
    fieldDataTypeMap.put("IN1-30-21", "ST");
    fieldDataTypeMap.put("GT1-23", "CE");
    fieldDataTypeMap.put("GT1-24", "TS");
    fieldDataTypeMap.put("GT1-21", "XON");
    fieldDataTypeMap.put("GT1-22", "ID");
    fieldDataTypeMap.put("GT1-27", "CP");
    fieldDataTypeMap.put("GT1-28", "NM");
    fieldDataTypeMap.put("GT1-25", "ID");
    fieldDataTypeMap.put("GT1-26", "CE");
    fieldDataTypeMap.put("GT1-29", "CX");
    fieldDataTypeMap.put("NK1-16-1", "DTM");
    fieldDataTypeMap.put("NK1-16-2", "ID");
    fieldDataTypeMap.put("PV1-17-23-4", "ST");
    fieldDataTypeMap.put("IN1-30-23", "CWE");
    fieldDataTypeMap.put("PV1-17-23-3", "ID");
    fieldDataTypeMap.put("PV1-17-23-6", "ID");
    fieldDataTypeMap.put("PV1-17-23-5", "ST");
    fieldDataTypeMap.put("PV1-17-23-2", "ST");
    fieldDataTypeMap.put("PV1-17-23-1", "ST");
    fieldDataTypeMap.put("ORC-22-14-2", "ID");
    fieldDataTypeMap.put("OBX-3-1", "ST");
    fieldDataTypeMap.put("ORC-22-14-1", "DTM");
    fieldDataTypeMap.put("ORC-12-16-1", "ST");
    fieldDataTypeMap.put("ORC-12-16-2", "ST");
    fieldDataTypeMap.put("OBX-3-6", "ID");
    fieldDataTypeMap.put("ORC-12-16-3", "ID");
    fieldDataTypeMap.put("ORC-12-16-4", "ST");
    fieldDataTypeMap.put("OBX-3-4", "ST");
    fieldDataTypeMap.put("ORC-12-16-5", "ST");
    fieldDataTypeMap.put("OBX-3-5", "ST");
    fieldDataTypeMap.put("ORC-12-16-6", "ID");
    fieldDataTypeMap.put("OBX-3-2", "ST");
    fieldDataTypeMap.put("OBX-3-3", "ID");
    fieldDataTypeMap.put("GT1-19-6-3", "ID");
    fieldDataTypeMap.put("PV1-7-14-1", "IS");
    fieldDataTypeMap.put("GT1-19-6-1", "IS");
    fieldDataTypeMap.put("GT1-19-6-2", "ST");
    fieldDataTypeMap.put("PV1-9-14-1", "IS");
    fieldDataTypeMap.put("PV1-9-14-3", "ID");
    fieldDataTypeMap.put("PV1-9-14-2", "ST");
    fieldDataTypeMap.put("NK1-26-9", "CE");
    fieldDataTypeMap.put("NK1-26-8", "ID");
    fieldDataTypeMap.put("NK1-26-5", "ST");
    fieldDataTypeMap.put("NK1-26-4", "ST");
    fieldDataTypeMap.put("NK1-26-7", "ID");
    fieldDataTypeMap.put("NK1-26-6", "IS");
    fieldDataTypeMap.put("NK1-26-1", "FN");
    fieldDataTypeMap.put("RXA-4-1", "DTM");
    fieldDataTypeMap.put("NK1-26-3", "ST");
    fieldDataTypeMap.put("RXA-4-2", "ID");
    fieldDataTypeMap.put("NK1-26-2", "ST");
    fieldDataTypeMap.put("ORC-24-13-1", "DTM");
    fieldDataTypeMap.put("ORC-24-13-2", "ID");
    fieldDataTypeMap.put("PID-39-4", "ST");
    fieldDataTypeMap.put("IN1-44-1-2", "ST");
    fieldDataTypeMap.put("PID-39-3", "ID");
    fieldDataTypeMap.put("IN1-44-1-3", "ST");
    fieldDataTypeMap.put("PID-39-2", "ST");
    fieldDataTypeMap.put("PID-39-1", "ST");
    fieldDataTypeMap.put("IN1-44-1-1", "ST");
    fieldDataTypeMap.put("ORC-24-6", "ID");
    fieldDataTypeMap.put("ORC-24-7", "ID");
    fieldDataTypeMap.put("ORC-24-8", "ST");
    fieldDataTypeMap.put("ORC-24-9", "IS");
    fieldDataTypeMap.put("ORC-24-2", "ST");
    fieldDataTypeMap.put("ORC-24-3", "ST");
    fieldDataTypeMap.put("ORC-24-4", "ST");
    fieldDataTypeMap.put("ORC-24-5", "ST");
    fieldDataTypeMap.put("ORC-24-1", "SAD");
    fieldDataTypeMap.put("IN1-5-8", "ST");
    fieldDataTypeMap.put("IN1-5-7", "ID");
    fieldDataTypeMap.put("PID-39-9", "ST");
    fieldDataTypeMap.put("IN1-5-6", "ID");
    fieldDataTypeMap.put("IN1-5-5", "ST");
    fieldDataTypeMap.put("PID-39-7", "ST");
    fieldDataTypeMap.put("IN1-5-4", "ST");
    fieldDataTypeMap.put("IN2-10", "ST");
    fieldDataTypeMap.put("PID-39-8", "ST");
    fieldDataTypeMap.put("IN1-5-3", "ST");
    fieldDataTypeMap.put("PID-39-5", "ST");
    fieldDataTypeMap.put("IN1-5-2", "ST");
    fieldDataTypeMap.put("PID-39-6", "ID");
    fieldDataTypeMap.put("IN1-5-1", "SAD");
    fieldDataTypeMap.put("PV2-23-5", "ID");
    fieldDataTypeMap.put("IN2-15", "IS");
    fieldDataTypeMap.put("PV2-23-6", "HD");
    fieldDataTypeMap.put("IN2-16", "IS");
    fieldDataTypeMap.put("IN2-41-6", "ID");
    fieldDataTypeMap.put("PV2-23-3", "NM");
    fieldDataTypeMap.put("IN2-17", "DT");
    fieldDataTypeMap.put("IN2-41-5", "ST");
    fieldDataTypeMap.put("PV2-23-4", "NM");
    fieldDataTypeMap.put("IN2-18", "ID");
    fieldDataTypeMap.put("IN2-41-4", "ST");
    fieldDataTypeMap.put("PV2-23-9", "ID");
    fieldDataTypeMap.put("IN2-11", "CE");
    fieldDataTypeMap.put("IN2-41-3", "ID");
    fieldDataTypeMap.put("IN2-12", "ST");
    fieldDataTypeMap.put("IN2-41-2", "ST");
    fieldDataTypeMap.put("PV2-23-7", "ID");
    fieldDataTypeMap.put("IN2-13", "ST");
    fieldDataTypeMap.put("IN2-41-1", "ST");
    fieldDataTypeMap.put("PV2-23-8", "HD");
    fieldDataTypeMap.put("IN2-14", "IS");
    fieldDataTypeMap.put("PID-13-12", "ST");
    fieldDataTypeMap.put("PID-13-11", "ST");
    fieldDataTypeMap.put("PID-13-10", "ST");
    fieldDataTypeMap.put("PV2-23-1", "ST");
    fieldDataTypeMap.put("IN2-19", "ID");
    fieldDataTypeMap.put("PV2-23-2", "IS");
    fieldDataTypeMap.put("OBX-24-10", "IS");
    fieldDataTypeMap.put("OBX-24-11", "ID");
    fieldDataTypeMap.put("OBX-24-12", "DR");
    fieldDataTypeMap.put("TQ1-3-1-8", "ST");
    fieldDataTypeMap.put("OBX-24-13", "TS");
    fieldDataTypeMap.put("TQ1-3-1-7", "ST");
    fieldDataTypeMap.put("OBX-24-14", "TS");
    fieldDataTypeMap.put("TQ1-3-1-9", "ST");
    fieldDataTypeMap.put("TQ1-3-1-4", "ST");
    fieldDataTypeMap.put("MSH-9-1", "ID");
    fieldDataTypeMap.put("TQ1-3-1-3", "ID");
    fieldDataTypeMap.put("MSH-9-2", "ID");
    fieldDataTypeMap.put("TQ1-3-1-6", "ID");
    fieldDataTypeMap.put("IN2-21", "ST");
    fieldDataTypeMap.put("TQ1-3-1-5", "ST");
    fieldDataTypeMap.put("IN2-20", "ID");
    fieldDataTypeMap.put("TQ1-3-1-2", "ST");
    fieldDataTypeMap.put("MSH-9-3", "ID");
    fieldDataTypeMap.put("TQ1-3-1-1", "ST");
    fieldDataTypeMap.put("IN2-28", "RMC");
    fieldDataTypeMap.put("IN2-29", "PTA");
    fieldDataTypeMap.put("IN2-26", "CX");
    fieldDataTypeMap.put("IN2-27", "IS");
    fieldDataTypeMap.put("IN2-24", "IS");
    fieldDataTypeMap.put("IN2-25", "CX");
    fieldDataTypeMap.put("IN2-22", "XPN");
    fieldDataTypeMap.put("IN2-23", "ST");
    fieldDataTypeMap.put("PID-5-13", "TS");
    fieldDataTypeMap.put("PID-5-14", "ST");
    fieldDataTypeMap.put("PID-5-11", "ID");
    fieldDataTypeMap.put("PID-5-12", "TS");
    fieldDataTypeMap.put("PID-5-10", "DR");
    fieldDataTypeMap.put("IN2-32", "IS");
    fieldDataTypeMap.put("IN2-31", "IS");
    fieldDataTypeMap.put("IN2-30", "DDI");
    fieldDataTypeMap.put("PD1-10-7", "DT");
    fieldDataTypeMap.put("PD1-10-6", "HD");
    fieldDataTypeMap.put("PD1-10-9", "CWE");
    fieldDataTypeMap.put("PD1-10-8", "DT");
    fieldDataTypeMap.put("IN2-11-6", "ID");
    fieldDataTypeMap.put("IN2-40-13-1", "DTM");
    fieldDataTypeMap.put("IN2-11-5", "ST");
    fieldDataTypeMap.put("IN2-11-2", "ST");
    fieldDataTypeMap.put("IN2-34", "CE");
    fieldDataTypeMap.put("IN2-11-1", "ST");
    fieldDataTypeMap.put("IN2-33", "CE");
    fieldDataTypeMap.put("PD1-10-1", "ST");
    fieldDataTypeMap.put("IN2-11-4", "ST");
    fieldDataTypeMap.put("IN2-36", "CE");
    fieldDataTypeMap.put("TQ2-10", "ID");
    fieldDataTypeMap.put("IN2-11-3", "ID");
    fieldDataTypeMap.put("IN2-35", "IS");
    fieldDataTypeMap.put("IN2-40-13-2", "ID");
    fieldDataTypeMap.put("PD1-10-3", "ID");
    fieldDataTypeMap.put("IN2-38", "IS");
    fieldDataTypeMap.put("PD1-10-2", "ST");
    fieldDataTypeMap.put("IN2-37", "ID");
    fieldDataTypeMap.put("PD1-10-5", "ID");
    fieldDataTypeMap.put("PD1-10-4", "HD");
    fieldDataTypeMap.put("IN2-39", "CE");
    fieldDataTypeMap.put("OBX-23-6-1", "IS");
    fieldDataTypeMap.put("OBX-23-6-2", "ST");
    fieldDataTypeMap.put("IN2-40", "XPN");
    fieldDataTypeMap.put("IN2-41", "CE");
    fieldDataTypeMap.put("IN2-42", "CE");
    fieldDataTypeMap.put("OBX-25-23-1", "ST");
    fieldDataTypeMap.put("IN2-43", "CE");
    fieldDataTypeMap.put("OBX-25-23-2", "ST");
    fieldDataTypeMap.put("OBX-25-23-3", "ID");
    fieldDataTypeMap.put("IN2-70-1", "ST");
    fieldDataTypeMap.put("PV1-8-20-1", "DTM");
    fieldDataTypeMap.put("OBX-25-23-4", "ST");
    fieldDataTypeMap.put("IN2-70-2", "IS");
    fieldDataTypeMap.put("PV1-8-20-2", "ID");
    fieldDataTypeMap.put("OBX-25-23-5", "ST");
    fieldDataTypeMap.put("IN2-70-3", "NM");
    fieldDataTypeMap.put("OBX-25-23-6", "ID");
    fieldDataTypeMap.put("OBX-25-23-7", "ST");
    fieldDataTypeMap.put("OBX-25-23-8", "ST");
    fieldDataTypeMap.put("OBX-23-6-3", "ID");
    fieldDataTypeMap.put("OBX-25-23-9", "ST");
    fieldDataTypeMap.put("IN2-70-9", "ID");
    fieldDataTypeMap.put("IN2-70-8", "HD");
    fieldDataTypeMap.put("IN2-70-7", "ID");
    fieldDataTypeMap.put("IN2-70-6", "HD");
    fieldDataTypeMap.put("IN2-70-5", "ID");
    fieldDataTypeMap.put("IN2-70-4", "NM");
    fieldDataTypeMap.put("IN2-47", "JCC");
    fieldDataTypeMap.put("IN2-46", "ST");
    fieldDataTypeMap.put("IN2-45", "DT");
    fieldDataTypeMap.put("IN2-44", "DT");
    fieldDataTypeMap.put("IN2-49", "XPN");
    fieldDataTypeMap.put("GT1-7-12", "ST");
    fieldDataTypeMap.put("IN2-48", "IS");
    fieldDataTypeMap.put("IN2-50", "XTN");
    fieldDataTypeMap.put("IN2-53", "XTN");
    fieldDataTypeMap.put("IN2-54", "IS");
    fieldDataTypeMap.put("IN2-51", "IS");
    fieldDataTypeMap.put("IN2-52", "XPN");
    fieldDataTypeMap.put("IN2-59", "IS");
    fieldDataTypeMap.put("IN2-56", "DT");
    fieldDataTypeMap.put("IN2-55", "DT");
    fieldDataTypeMap.put("IN2-58", "XTN");
    fieldDataTypeMap.put("IN2-57", "IS");
    fieldDataTypeMap.put("IN2-62", "CE");
    fieldDataTypeMap.put("IN2-63", "XTN");
    fieldDataTypeMap.put("PV1-7-2-5", "ST");
    fieldDataTypeMap.put("IN2-64", "XTN");
    fieldDataTypeMap.put("PV1-7-2-4", "ST");
    fieldDataTypeMap.put("NK1-2-10", "DR");
    fieldDataTypeMap.put("IN2-65", "CE");
    fieldDataTypeMap.put("PV1-7-2-3", "ST");
    fieldDataTypeMap.put("NK1-2-12", "TS");
    fieldDataTypeMap.put("NK1-2-11", "ID");
    fieldDataTypeMap.put("IN2-60", "IS");
    fieldDataTypeMap.put("NK1-2-14", "ST");
    fieldDataTypeMap.put("GT1-7-10", "ST");
    fieldDataTypeMap.put("IN2-61", "CX");
    fieldDataTypeMap.put("NK1-2-13", "TS");
    fieldDataTypeMap.put("GT1-7-11", "ST");
    fieldDataTypeMap.put("OBX-25-2-3", "ST");
    fieldDataTypeMap.put("OBX-25-2-4", "ST");
    fieldDataTypeMap.put("OBX-25-2-1", "ST");
    fieldDataTypeMap.put("OBX-25-2-2", "ST");
    fieldDataTypeMap.put("IN1-44-13-2", "ID");
    fieldDataTypeMap.put("IN1-44-13-1", "DTM");
    fieldDataTypeMap.put("IN2-69", "XON");
    fieldDataTypeMap.put("IN2-68", "ID");
    fieldDataTypeMap.put("OBX-25-2-5", "ST");
    fieldDataTypeMap.put("IN2-67", "ID");
    fieldDataTypeMap.put("PV1-7-2-1", "ST");
    fieldDataTypeMap.put("IN2-66", "ID");
    fieldDataTypeMap.put("PV1-7-2-2", "ST");
    fieldDataTypeMap.put("IN2-71", "CE");
    fieldDataTypeMap.put("IN2-72", "CE");
    fieldDataTypeMap.put("IN2-70", "XON");
    fieldDataTypeMap.put("PV1-52-20-2", "ID");
    fieldDataTypeMap.put("PV1-52-20-1", "DTM");
    fieldDataTypeMap.put("IN3-8-23-4", "ST");
    fieldDataTypeMap.put("IN3-8-23-5", "ST");
    fieldDataTypeMap.put("IN3-8-23-6", "ID");
    fieldDataTypeMap.put("IN3-8-23-7", "ST");
    fieldDataTypeMap.put("IN3-8-23-1", "ST");
    fieldDataTypeMap.put("IN3-8-23-2", "ST");
    fieldDataTypeMap.put("IN3-8-23-3", "ID");
    fieldDataTypeMap.put("NK1-4-1-3", "ST");
    fieldDataTypeMap.put("NK1-14", "CE");
    fieldDataTypeMap.put("NK1-4-1-2", "ST");
    fieldDataTypeMap.put("NK1-15", "IS");
    fieldDataTypeMap.put("NK1-16", "TS");
    fieldDataTypeMap.put("NK1-17", "IS");
    fieldDataTypeMap.put("NK1-10", "ST");
    fieldDataTypeMap.put("IN2-26-6-1", "IS");
    fieldDataTypeMap.put("NK1-11", "JCC");
    fieldDataTypeMap.put("NK1-4-1-1", "ST");
    fieldDataTypeMap.put("NK1-12", "CX");
    fieldDataTypeMap.put("IN2-26-6-3", "ID");
    fieldDataTypeMap.put("NK1-13", "XON");
    fieldDataTypeMap.put("IN2-26-6-2", "ST");
    fieldDataTypeMap.put("PID-16-6", "ID");
    fieldDataTypeMap.put("IN3-8-23-9", "ST");
    fieldDataTypeMap.put("IN3-8-23-8", "ST");
    fieldDataTypeMap.put("ORC-12-23-3", "ID");
    fieldDataTypeMap.put("ORC-11-9-1", "IS");
    fieldDataTypeMap.put("PID-16-2", "ST");
    fieldDataTypeMap.put("ORC-12-23-4", "ST");
    fieldDataTypeMap.put("PID-16-3", "ID");
    fieldDataTypeMap.put("IN1-49-6-1", "IS");
    fieldDataTypeMap.put("ORC-12-23-1", "ST");
    fieldDataTypeMap.put("ORC-11-9-3", "ID");
    fieldDataTypeMap.put("PID-16-4", "ST");
    fieldDataTypeMap.put("ORC-12-23-2", "ST");
    fieldDataTypeMap.put("ORC-11-9-2", "ST");
    fieldDataTypeMap.put("PID-16-5", "ST");
    fieldDataTypeMap.put("IN1-49-6-2", "ST");
    fieldDataTypeMap.put("PID-16-1", "ST");
    fieldDataTypeMap.put("IN1-49-6-3", "ID");
    fieldDataTypeMap.put("PV1-42-11-2", "ST");
    fieldDataTypeMap.put("PV1-42-11-3", "ID");
    fieldDataTypeMap.put("ORC-12-23-9", "ST");
    fieldDataTypeMap.put("PV1-42-11-1", "IS");
    fieldDataTypeMap.put("ORC-12-23-7", "ST");
    fieldDataTypeMap.put("ORC-12-23-8", "ST");
    fieldDataTypeMap.put("ORC-12-23-5", "ST");
    fieldDataTypeMap.put("ORC-12-23-6", "ID");
    fieldDataTypeMap.put("PV1-52-16-1", "ST");
    fieldDataTypeMap.put("TQ2-8-2", "CE");
    fieldDataTypeMap.put("TQ2-8-1", "NM");
    fieldDataTypeMap.put("PV1-52-16-4", "ST");
    fieldDataTypeMap.put("PV1-52-16-5", "ST");
    fieldDataTypeMap.put("PV1-52-16-2", "ST");
    fieldDataTypeMap.put("PV1-52-16-3", "ID");
    fieldDataTypeMap.put("TQ1-5-2", "CE");
    fieldDataTypeMap.put("PV1-52-16-6", "ID");
    fieldDataTypeMap.put("TQ1-5-1", "NM");
    fieldDataTypeMap.put("IN2-63-1", "ST");
    fieldDataTypeMap.put("IN2-63-3", "ID");
    fieldDataTypeMap.put("IN2-63-2", "ID");
    fieldDataTypeMap.put("ORC-14-4", "ST");
    fieldDataTypeMap.put("IN2-63-5", "NM");
    fieldDataTypeMap.put("ORC-14-3", "ID");
    fieldDataTypeMap.put("IN2-63-4", "ST");
    fieldDataTypeMap.put("ORC-14-2", "ID");
    fieldDataTypeMap.put("IN2-63-7", "NM");
    fieldDataTypeMap.put("ORC-14-1", "ST");
    fieldDataTypeMap.put("IN2-63-6", "NM");
    fieldDataTypeMap.put("ORC-14-8", "NM");
    fieldDataTypeMap.put("IN3-25-2-1", "ST");
    fieldDataTypeMap.put("IN2-63-9", "ST");
    fieldDataTypeMap.put("ORC-14-7", "NM");
    fieldDataTypeMap.put("IN2-63-8", "NM");
    fieldDataTypeMap.put("ORC-14-6", "NM");
    fieldDataTypeMap.put("ORC-14-5", "NM");
    fieldDataTypeMap.put("IN3-25-2-5", "ST");
    fieldDataTypeMap.put("IN3-25-2-4", "ST");
    fieldDataTypeMap.put("IN3-25-2-3", "ST");
    fieldDataTypeMap.put("ORC-14-9", "ST");
    fieldDataTypeMap.put("IN3-25-2-2", "ST");
    fieldDataTypeMap.put("PID-28-5", "ST");
    fieldDataTypeMap.put("PID-28-6", "ID");
    fieldDataTypeMap.put("PID-28-2", "ST");
    fieldDataTypeMap.put("PID-28-1", "ST");
    fieldDataTypeMap.put("PID-28-4", "ST");
    fieldDataTypeMap.put("PID-28-3", "ID");
    fieldDataTypeMap.put("NK1-20", "CE");
    fieldDataTypeMap.put("NK1-24", "IS");
    fieldDataTypeMap.put("GT1-45-1-2", "ST");
    fieldDataTypeMap.put("NK1-23", "ID");
    fieldDataTypeMap.put("GT1-45-1-1", "ST");
    fieldDataTypeMap.put("NK1-22", "CE");
    fieldDataTypeMap.put("NK1-21", "IS");
    fieldDataTypeMap.put("NK1-28", "CE");
    fieldDataTypeMap.put("NK1-27", "CE");
    fieldDataTypeMap.put("GT1-45-1-5", "ST");
    fieldDataTypeMap.put("NK1-26", "XPN");
    fieldDataTypeMap.put("GT1-45-1-4", "ST");
    fieldDataTypeMap.put("NK1-25", "CE");
    fieldDataTypeMap.put("GT1-45-1-3", "ST");
    fieldDataTypeMap.put("PV1-52-3", "ST");
    fieldDataTypeMap.put("PV1-52-2", "FN");
    fieldDataTypeMap.put("PV1-52-5", "ST");
    fieldDataTypeMap.put("NK1-18", "IS");
    fieldDataTypeMap.put("PV1-52-4", "ST");
    fieldDataTypeMap.put("NK1-19", "CE");
    fieldDataTypeMap.put("PV1-52-1", "ST");
    fieldDataTypeMap.put("GT1-5-11", "ID");
    fieldDataTypeMap.put("GT1-5-10", "IS");
    fieldDataTypeMap.put("GT1-5-13", "TS");
    fieldDataTypeMap.put("GT1-5-12", "DR");
    fieldDataTypeMap.put("IN1-5-9", "IS");
    fieldDataTypeMap.put("PV1-52-7", "IS");
    fieldDataTypeMap.put("PV1-52-6", "ST");
    fieldDataTypeMap.put("GT1-5-14", "TS");
    fieldDataTypeMap.put("PV1-52-9", "HD");
    fieldDataTypeMap.put("PV1-52-8", "IS");
    fieldDataTypeMap.put("IN3-8-19-2", "ID");
    fieldDataTypeMap.put("IN3-8-19-1", "DTM");
    fieldDataTypeMap.put("NK1-31", "XTN");
    fieldDataTypeMap.put("NK1-30", "XPN");
    fieldDataTypeMap.put("NK1-33", "CX");
    fieldDataTypeMap.put("NK1-32", "XAD");
    fieldDataTypeMap.put("NK1-35", "CE");
    fieldDataTypeMap.put("NK1-34", "IS");
    fieldDataTypeMap.put("NK1-37", "ST");
    fieldDataTypeMap.put("NK1-36", "IS");
    fieldDataTypeMap.put("NK1-39", "IS");
    fieldDataTypeMap.put("NK1-38", "ST");
    fieldDataTypeMap.put("NK1-29", "CE");
    fieldDataTypeMap.put("NK1-31-10", "ST");
    fieldDataTypeMap.put("NK1-31-11", "ST");
    fieldDataTypeMap.put("NK1-31-12", "ST");
    fieldDataTypeMap.put("IN2-69-8-2", "ST");
    fieldDataTypeMap.put("IN2-69-8-1", "IS");
    fieldDataTypeMap.put("IN2-69-8-3", "ID");
    fieldDataTypeMap.put("NK1-30-1-4", "ST");
    fieldDataTypeMap.put("NK1-30-1-3", "ST");
    fieldDataTypeMap.put("NK1-30-1-5", "ST");
    fieldDataTypeMap.put("IN3-7-1", "DTM");
    fieldDataTypeMap.put("IN3-7-2", "ID");
    fieldDataTypeMap.put("GT1-2-10-1", "ST");
    fieldDataTypeMap.put("GT1-2-10-3", "ID");
    fieldDataTypeMap.put("GT1-2-10-2", "ST");
    fieldDataTypeMap.put("GT1-2-10-5", "ST");
    fieldDataTypeMap.put("GT1-2-10-4", "ST");
    fieldDataTypeMap.put("GT1-2-10-7", "ST");
    fieldDataTypeMap.put("GT1-2-10-6", "ID");
    fieldDataTypeMap.put("GT1-2-10-9", "ST");
    fieldDataTypeMap.put("GT1-2-10-8", "ST");
    fieldDataTypeMap.put("PV2-13-14-1", "IS");
    fieldDataTypeMap.put("PV2-13-14-3", "ID");
    fieldDataTypeMap.put("PV2-13-14-2", "ST");
    fieldDataTypeMap.put("OBX-16-9-1", "IS");
    fieldDataTypeMap.put("OBX-16-9-3", "ID");
    fieldDataTypeMap.put("OBX-16-9-2", "ST");
    fieldDataTypeMap.put("OBX-16-19-1", "DTM");
    fieldDataTypeMap.put("OBX-16-19-2", "ID");
    fieldDataTypeMap.put("OBX-24-13-2", "ID");
    fieldDataTypeMap.put("OBX-24-13-1", "DTM");
    fieldDataTypeMap.put("IN1-37-1-2", "ID");
    fieldDataTypeMap.put("IN1-37-1-1", "NM");
    fieldDataTypeMap.put("PID-6-1-3", "ST");
    fieldDataTypeMap.put("PID-6-1-4", "ST");
    fieldDataTypeMap.put("PID-6-1-1", "ST");
    fieldDataTypeMap.put("PID-6-1-2", "ST");
    fieldDataTypeMap.put("PD1-4-19-2", "ID");
    fieldDataTypeMap.put("PD1-4-19-1", "DTM");
    fieldDataTypeMap.put("SFT-1-6-3", "ID");
    fieldDataTypeMap.put("SFT-1-6-1", "IS");
    fieldDataTypeMap.put("SFT-1-6-2", "ST");
    fieldDataTypeMap.put("PID-6-1-5", "ST");
    fieldDataTypeMap.put("PV1-6-11-2", "ST");
    fieldDataTypeMap.put("PV1-6-11-3", "ID");
    fieldDataTypeMap.put("PV1-6-11-1", "IS");
    fieldDataTypeMap.put("PID-6-14", "ST");
    fieldDataTypeMap.put("PID-6-13", "TS");
    fieldDataTypeMap.put("PID-6-12", "TS");
    fieldDataTypeMap.put("PID-6-11", "ID");
    fieldDataTypeMap.put("PID-6-10", "DR");
    fieldDataTypeMap.put("ORC-12-22-3", "ID");
    fieldDataTypeMap.put("IN2-61-9-5", "ST");
    fieldDataTypeMap.put("ORC-12-22-2", "ST");
    fieldDataTypeMap.put("IN2-61-9-4", "ST");
    fieldDataTypeMap.put("ORC-12-22-5", "ST");
    fieldDataTypeMap.put("IN2-61-9-3", "ID");
    fieldDataTypeMap.put("ORC-12-22-4", "ST");
    fieldDataTypeMap.put("IN2-61-9-2", "ST");
    fieldDataTypeMap.put("IN2-61-9-1", "ST");
    fieldDataTypeMap.put("ORC-12-22-1", "ST");
    fieldDataTypeMap.put("ORC-12-22-7", "ST");
    fieldDataTypeMap.put("ORC-12-22-6", "ID");
    fieldDataTypeMap.put("ORC-12-22-9", "ST");
    fieldDataTypeMap.put("ORC-12-22-8", "ST");
    fieldDataTypeMap.put("PV1-17-2-2", "ST");
    fieldDataTypeMap.put("PV1-17-2-3", "ST");
    fieldDataTypeMap.put("ORC-11-20-2", "ID");
    fieldDataTypeMap.put("ORC-11-20-1", "DTM");
    fieldDataTypeMap.put("PV1-17-2-1", "ST");
    fieldDataTypeMap.put("IN2-61-9-8", "ST");
    fieldDataTypeMap.put("IN2-61-9-9", "ST");
    fieldDataTypeMap.put("IN2-61-9-6", "ID");
    fieldDataTypeMap.put("PV1-17-2-4", "ST");
    fieldDataTypeMap.put("IN2-61-9-7", "ST");
    fieldDataTypeMap.put("PV1-17-2-5", "ST");
    fieldDataTypeMap.put("NK1-12-9-1", "ST");
    fieldDataTypeMap.put("IN1-16-12-1", "DTM");
    fieldDataTypeMap.put("NK1-12-9-2", "ST");
    fieldDataTypeMap.put("IN1-16-12-2", "ID");
    fieldDataTypeMap.put("ORC-4-1", "ST");
    fieldDataTypeMap.put("ORC-4-2", "IS");
    fieldDataTypeMap.put("PV1-5-1", "ST");
    fieldDataTypeMap.put("NK1-12-9-5", "ST");
    fieldDataTypeMap.put("ORC-4-3", "ST");
    fieldDataTypeMap.put("NK1-12-9-6", "ID");
    fieldDataTypeMap.put("ORC-4-4", "ID");
    fieldDataTypeMap.put("NK1-12-9-3", "ID");
    fieldDataTypeMap.put("NK1-12-9-4", "ST");
    fieldDataTypeMap.put("PV1-5-5", "ID");
    fieldDataTypeMap.put("PV1-5-4", "HD");
    fieldDataTypeMap.put("PV1-5-3", "ID");
    fieldDataTypeMap.put("PV1-5-2", "ST");
    fieldDataTypeMap.put("PV1-5-9", "CWE");
    fieldDataTypeMap.put("PV1-5-8", "DT");
    fieldDataTypeMap.put("PV1-5-7", "DT");
    fieldDataTypeMap.put("PV1-5-6", "HD");
    fieldDataTypeMap.put("NK1-12-9-9", "ST");
    fieldDataTypeMap.put("NK1-12-9-8", "ST");
    fieldDataTypeMap.put("NK1-12-9-7", "ST");
    fieldDataTypeMap.put("NK1-26-12-1", "DTM");
    fieldDataTypeMap.put("NK1-26-12-2", "ID");
    fieldDataTypeMap.put("ORC-13-1", "IS");
    fieldDataTypeMap.put("ORC-13-2", "IS");
    fieldDataTypeMap.put("GT1-5-9", "IS");
    fieldDataTypeMap.put("ORC-13-3", "IS");
    fieldDataTypeMap.put("ORC-13-4", "HD");
    fieldDataTypeMap.put("ORC-13-5", "IS");
    fieldDataTypeMap.put("ORC-13-6", "IS");
    fieldDataTypeMap.put("GT1-5-5", "ST");
    fieldDataTypeMap.put("GT1-42-2", "ST");
    fieldDataTypeMap.put("ORC-13-7", "IS");
    fieldDataTypeMap.put("GT1-5-6", "ID");
    fieldDataTypeMap.put("GT1-42-3", "ST");
    fieldDataTypeMap.put("ORC-13-8", "IS");
    fieldDataTypeMap.put("GT1-5-7", "ID");
    fieldDataTypeMap.put("GT1-42-4", "ST");
    fieldDataTypeMap.put("ORC-13-9", "ST");
    fieldDataTypeMap.put("GT1-5-8", "ST");
    fieldDataTypeMap.put("GT1-42-5", "ST");
    fieldDataTypeMap.put("GT1-5-1", "SAD");
    fieldDataTypeMap.put("GT1-5-2", "ST");
    fieldDataTypeMap.put("GT1-5-3", "ST");
    fieldDataTypeMap.put("GT1-5-4", "ST");
    fieldDataTypeMap.put("GT1-42-1", "FN");
    fieldDataTypeMap.put("GT1-42-7", "ID");
    fieldDataTypeMap.put("GT1-42-6", "IS");
    fieldDataTypeMap.put("GT1-42-9", "CE");
    fieldDataTypeMap.put("GT1-42-8", "ID");
    fieldDataTypeMap.put("GT1-3-12-1", "DTM");
    fieldDataTypeMap.put("GT1-3-12-2", "ID");
    fieldDataTypeMap.put("IN2-25-10", "CWE");
    fieldDataTypeMap.put("IN1-3-9-3", "ID");
    fieldDataTypeMap.put("IN1-3-9-4", "ST");
    fieldDataTypeMap.put("IN1-3-9-5", "ST");
    fieldDataTypeMap.put("IN1-3-9-6", "ID");
    fieldDataTypeMap.put("IN1-3-9-1", "ST");
    fieldDataTypeMap.put("IN1-3-9-2", "ST");
    fieldDataTypeMap.put("ORC-21-8-3", "ID");
    fieldDataTypeMap.put("ORC-21-8-2", "ST");
    fieldDataTypeMap.put("ORC-21-8-1", "IS");
    fieldDataTypeMap.put("IN1-3-9-7", "ST");
    fieldDataTypeMap.put("IN1-3-9-8", "ST");
    fieldDataTypeMap.put("IN1-3-9-9", "ST");
    fieldDataTypeMap.put("IN3-3-14-3", "ID");
    fieldDataTypeMap.put("PV1-19-6-2", "ST");
    fieldDataTypeMap.put("PV1-19-6-3", "ID");
    fieldDataTypeMap.put("IN3-3-14-1", "IS");
    fieldDataTypeMap.put("IN3-3-14-2", "ST");
    fieldDataTypeMap.put("PV1-19-6-1", "IS");
    fieldDataTypeMap.put("PV2-1-10", "EI");
    fieldDataTypeMap.put("PV2-1-11", "HD");
    fieldDataTypeMap.put("IN2-40-12-1", "DTM");
    fieldDataTypeMap.put("IN2-40-12-2", "ID");
    fieldDataTypeMap.put("IN1-10-4-3", "ID");
    fieldDataTypeMap.put("IN1-10-4-2", "ST");
    fieldDataTypeMap.put("IN1-10-4-1", "IS");
    fieldDataTypeMap.put("PD1-10-4-2", "ST");
    fieldDataTypeMap.put("PD1-10-4-1", "IS");
    fieldDataTypeMap.put("PD1-10-4-3", "ID");
    fieldDataTypeMap.put("PV1-3-10-1", "ST");
    fieldDataTypeMap.put("IN1-3-10", "CWE");
    fieldDataTypeMap.put("PV1-3-10-2", "IS");
    fieldDataTypeMap.put("PV1-3-10-3", "ST");
    fieldDataTypeMap.put("PV1-3-10-4", "ID");
    fieldDataTypeMap.put("IN2-22-1-3", "ST");
    fieldDataTypeMap.put("IN2-22-1-4", "ST");
    fieldDataTypeMap.put("IN2-22-1-1", "ST");
    fieldDataTypeMap.put("IN2-22-1-2", "ST");
    fieldDataTypeMap.put("IN2-22-1-5", "ST");
    fieldDataTypeMap.put("ORC-12-9-1", "IS");
    fieldDataTypeMap.put("ORC-12-9-2", "ST");
    fieldDataTypeMap.put("IN2-22-9-6", "ID");
    fieldDataTypeMap.put("IN2-22-9-5", "ST");
    fieldDataTypeMap.put("IN2-22-9-2", "ST");
    fieldDataTypeMap.put("IN2-22-9-1", "ST");
    fieldDataTypeMap.put("IN2-22-9-4", "ST");
    fieldDataTypeMap.put("IN2-22-9-3", "ID");
    fieldDataTypeMap.put("SFT-1-5", "ID");
    fieldDataTypeMap.put("SFT-1-4", "NM");
    fieldDataTypeMap.put("SFT-1-7", "ID");
    fieldDataTypeMap.put("SFT-1-6", "HD");
    fieldDataTypeMap.put("SFT-1-1", "ST");
    fieldDataTypeMap.put("SFT-1-3", "NM");
    fieldDataTypeMap.put("SFT-1-2", "IS");
    fieldDataTypeMap.put("ORC-12-9-3", "ID");
    fieldDataTypeMap.put("PID-18-4-3", "ID");
    fieldDataTypeMap.put("PID-18-4-2", "ST");
    fieldDataTypeMap.put("NK1-33-10", "CWE");
    fieldDataTypeMap.put("PID-18-4-1", "IS");
    fieldDataTypeMap.put("SFT-1-8", "HD");
    fieldDataTypeMap.put("SFT-1-9", "ID");
    fieldDataTypeMap.put("PV2-30-2", "ST");
    fieldDataTypeMap.put("PV2-30-1", "ST");
    fieldDataTypeMap.put("PV2-30-6", "ID");
    fieldDataTypeMap.put("PV2-30-5", "ST");
    fieldDataTypeMap.put("PV2-30-4", "ST");
    fieldDataTypeMap.put("PV2-30-3", "ID");
    fieldDataTypeMap.put("OBX-25-23", "CWE");
    fieldDataTypeMap.put("OBX-25-22", "CWE");
    fieldDataTypeMap.put("OBX-25-21", "ST");
    fieldDataTypeMap.put("OBX-25-20", "TS");
    fieldDataTypeMap.put("GT1-35-1", "ST");
    fieldDataTypeMap.put("ORC-25-1", "ST");
    fieldDataTypeMap.put("ORC-25-2", "ST");
    fieldDataTypeMap.put("IN2-22-14", "ST");
    fieldDataTypeMap.put("ORC-25-3", "ID");
    fieldDataTypeMap.put("ORC-25-4", "ST");
    fieldDataTypeMap.put("ORC-25-5", "ST");
    fieldDataTypeMap.put("ORC-25-6", "ID");
    fieldDataTypeMap.put("ORC-25-7", "ST");
    fieldDataTypeMap.put("ORC-25-8", "ST");
    fieldDataTypeMap.put("ORC-25-9", "ST");
    fieldDataTypeMap.put("OBX-25-18", "ID");
    fieldDataTypeMap.put("OBX-25-17", "DR");
    fieldDataTypeMap.put("OBX-25-19", "TS");
    fieldDataTypeMap.put("OBX-25-10", "ID");
    fieldDataTypeMap.put("IN2-22-10", "DR");
    fieldDataTypeMap.put("IN2-22-11", "ID");
    fieldDataTypeMap.put("OBX-25-12", "ID");
    fieldDataTypeMap.put("IN2-22-12", "TS");
    fieldDataTypeMap.put("OBX-25-11", "ST");
    fieldDataTypeMap.put("GT1-35-6", "ID");
    fieldDataTypeMap.put("IN2-22-13", "TS");
    fieldDataTypeMap.put("OBX-25-14", "HD");
    fieldDataTypeMap.put("GT1-35-5", "ST");
    fieldDataTypeMap.put("OBX-25-13", "ID");
    fieldDataTypeMap.put("GT1-35-4", "ST");
    fieldDataTypeMap.put("OBX-25-16", "CE");
    fieldDataTypeMap.put("GT1-35-3", "ID");
    fieldDataTypeMap.put("OBX-25-15", "ID");
    fieldDataTypeMap.put("GT1-35-2", "ST");
    fieldDataTypeMap.put("IN2-3-19-1", "DTM");
    fieldDataTypeMap.put("IN2-3-19-2", "ID");
    fieldDataTypeMap.put("IN3-8-10", "ID");
    fieldDataTypeMap.put("IN3-8-13", "ID");
    fieldDataTypeMap.put("GT1-42-11", "ID");
    fieldDataTypeMap.put("IN3-8-14", "HD");
    fieldDataTypeMap.put("GT1-42-12", "TS");
    fieldDataTypeMap.put("IN3-8-11", "ST");
    fieldDataTypeMap.put("IN3-8-12", "ID");
    fieldDataTypeMap.put("GT1-42-10", "DR");
    fieldDataTypeMap.put("IN3-8-17", "DR");
    fieldDataTypeMap.put("IN3-8-18", "ID");
    fieldDataTypeMap.put("PV2-13-9-1", "IS");
    fieldDataTypeMap.put("IN3-8-15", "ID");
    fieldDataTypeMap.put("GT1-42-13", "TS");
    fieldDataTypeMap.put("IN3-8-16", "CE");
    fieldDataTypeMap.put("GT1-42-14", "ST");
    fieldDataTypeMap.put("OBX-25-19-1", "DTM");
    fieldDataTypeMap.put("IN3-8-19", "TS");
    fieldDataTypeMap.put("PV2-13-9-2", "ST");
    fieldDataTypeMap.put("OBX-25-19-2", "ID");
    fieldDataTypeMap.put("PV2-13-9-3", "ID");
    fieldDataTypeMap.put("PV2-38-4", "ST");
    fieldDataTypeMap.put("PV2-38-3", "ID");
    fieldDataTypeMap.put("PV2-38-6", "ID");
    fieldDataTypeMap.put("PV2-38-5", "ST");
    fieldDataTypeMap.put("PV2-38-2", "ST");
    fieldDataTypeMap.put("PV2-38-1", "ST");
    fieldDataTypeMap.put("NK1-33-4-2", "ST");
    fieldDataTypeMap.put("NK1-33-4-1", "IS");
    fieldDataTypeMap.put("NK1-33-4-3", "ID");
    fieldDataTypeMap.put("IN3-8-20", "TS");
    fieldDataTypeMap.put("IN3-8-21", "ST");
    fieldDataTypeMap.put("IN3-8-22", "CWE");
    fieldDataTypeMap.put("IN3-8-23", "CWE");
    fieldDataTypeMap.put("OBX-25-22-7", "ST");
    fieldDataTypeMap.put("OBX-25-22-8", "ST");
    fieldDataTypeMap.put("OBX-25-22-9", "ST");
    fieldDataTypeMap.put("OBX-25-22-3", "ID");
    fieldDataTypeMap.put("OBX-25-22-4", "ST");
    fieldDataTypeMap.put("ORC-21-10", "ST");
    fieldDataTypeMap.put("OBX-25-22-5", "ST");
    fieldDataTypeMap.put("OBX-25-22-6", "ID");
    fieldDataTypeMap.put("PID-3-10-1", "ST");
    fieldDataTypeMap.put("OBX-25-22-1", "ST");
    fieldDataTypeMap.put("OBX-25-22-2", "ST");
    fieldDataTypeMap.put("OBX-17-2", "ST");
    fieldDataTypeMap.put("OBX-17-1", "ST");
    fieldDataTypeMap.put("PD1-10-10", "CWE");
    fieldDataTypeMap.put("OBX-17-4", "ST");
    fieldDataTypeMap.put("PV2-45-2", "ST");
    fieldDataTypeMap.put("OBX-17-3", "ID");
    fieldDataTypeMap.put("PV2-45-1", "ST");
    fieldDataTypeMap.put("OBX-17-6", "ID");
    fieldDataTypeMap.put("OBX-17-5", "ST");
    fieldDataTypeMap.put("PV2-45-6", "ID");
    fieldDataTypeMap.put("IN2-49-5", "ST");
    fieldDataTypeMap.put("PV2-45-5", "ST");
    fieldDataTypeMap.put("IN2-49-4", "ST");
    fieldDataTypeMap.put("PV2-45-4", "ST");
    fieldDataTypeMap.put("IN2-49-7", "ID");
    fieldDataTypeMap.put("PV2-45-3", "ID");
    fieldDataTypeMap.put("IN2-49-6", "IS");
    fieldDataTypeMap.put("PV1-42-10-2", "IS");
    fieldDataTypeMap.put("IN2-49-1", "FN");
    fieldDataTypeMap.put("PV1-42-10-1", "ST");
    fieldDataTypeMap.put("PV1-42-10-4", "ID");
    fieldDataTypeMap.put("IN2-49-3", "ST");
    fieldDataTypeMap.put("PV1-42-10-3", "ST");
    fieldDataTypeMap.put("IN2-49-2", "ST");
    fieldDataTypeMap.put("IN2-49-8", "ID");
    fieldDataTypeMap.put("IN2-49-9", "CE");
    fieldDataTypeMap.put("ORC-19-22-2", "ST");
    fieldDataTypeMap.put("ORC-19-22-1", "ST");
    fieldDataTypeMap.put("ORC-19-22-4", "ST");
    fieldDataTypeMap.put("ORC-19-22-3", "ID");
    fieldDataTypeMap.put("IN2-7-13-2", "ID");
    fieldDataTypeMap.put("IN2-7-13-1", "DTM");
    fieldDataTypeMap.put("PV1-8-9-3", "ID");
    fieldDataTypeMap.put("ORC-19-22-7", "ST");
    fieldDataTypeMap.put("IN1-44-14-1", "DTM");
    fieldDataTypeMap.put("ORC-19-22-8", "ST");
    fieldDataTypeMap.put("ORC-19-22-5", "ST");
    fieldDataTypeMap.put("PV1-8-9-1", "IS");
    fieldDataTypeMap.put("ORC-19-22-6", "ID");
    fieldDataTypeMap.put("PV1-8-9-2", "ST");
    fieldDataTypeMap.put("ORC-19-22-9", "ST");
    fieldDataTypeMap.put("IN1-44-14-2", "ID");
    fieldDataTypeMap.put("ORC-11-14-3", "ID");
    fieldDataTypeMap.put("ORC-11-14-2", "ST");
    fieldDataTypeMap.put("ORC-11-14-1", "IS");
    fieldDataTypeMap.put("PD1-11-5", "ST");
    fieldDataTypeMap.put("PD1-11-6", "ID");
    fieldDataTypeMap.put("RXR-6-2", "ST");
    fieldDataTypeMap.put("ORC-13-4-1", "IS");
    fieldDataTypeMap.put("PD1-11-3", "ID");
    fieldDataTypeMap.put("RXR-6-3", "ID");
    fieldDataTypeMap.put("ORC-13-4-2", "ST");
    fieldDataTypeMap.put("PD1-11-4", "ST");
    fieldDataTypeMap.put("PD1-11-1", "ST");
    fieldDataTypeMap.put("RXR-6-1", "ST");
    fieldDataTypeMap.put("PD1-11-2", "ST");
    fieldDataTypeMap.put("RXR-6-6", "ID");
    fieldDataTypeMap.put("RXR-6-7", "ST");
    fieldDataTypeMap.put("PID-29-1", "DTM");
    fieldDataTypeMap.put("RXR-6-4", "ST");
    fieldDataTypeMap.put("ORC-13-4-3", "ID");
    fieldDataTypeMap.put("PID-29-2", "ID");
    fieldDataTypeMap.put("RXR-6-5", "ST");
    fieldDataTypeMap.put("RXR-6-9", "ST");
    fieldDataTypeMap.put("GT1-29-9", "CWE");
    fieldDataTypeMap.put("RXR-6-8", "ST");
    fieldDataTypeMap.put("GT1-29-5", "ID");
    fieldDataTypeMap.put("IN1-19-1", "SAD");
    fieldDataTypeMap.put("GT1-29-6", "HD");
    fieldDataTypeMap.put("GT1-29-7", "DT");
    fieldDataTypeMap.put("IN1-19-3", "ST");
    fieldDataTypeMap.put("GT1-29-8", "DT");
    fieldDataTypeMap.put("IN1-19-2", "ST");
    fieldDataTypeMap.put("GT1-29-1", "ST");
    fieldDataTypeMap.put("GT1-29-2", "ST");
    fieldDataTypeMap.put("GT1-29-3", "ID");
    fieldDataTypeMap.put("GT1-29-4", "HD");
    fieldDataTypeMap.put("GT1-6-7", "NM");
    fieldDataTypeMap.put("GT1-41-6", "ID");
    fieldDataTypeMap.put("GT1-6-6", "NM");
    fieldDataTypeMap.put("GT1-41-5", "ST");
    fieldDataTypeMap.put("ORC-19-19-1", "DTM");
    fieldDataTypeMap.put("GT1-6-5", "NM");
    fieldDataTypeMap.put("GT1-41-4", "ST");
    fieldDataTypeMap.put("ORC-19-19-2", "ID");
    fieldDataTypeMap.put("GT1-6-4", "ST");
    fieldDataTypeMap.put("GT1-41-3", "ID");
    fieldDataTypeMap.put("GT1-6-3", "ID");
    fieldDataTypeMap.put("GT1-41-2", "ST");
    fieldDataTypeMap.put("GT1-6-2", "ID");
    fieldDataTypeMap.put("GT1-41-1", "ST");
    fieldDataTypeMap.put("GT1-6-1", "ST");
    fieldDataTypeMap.put("IN1-19-4", "ST");
    fieldDataTypeMap.put("IN1-19-5", "ST");
    fieldDataTypeMap.put("PID-15-1", "ST");
    fieldDataTypeMap.put("IN1-19-6", "ID");
    fieldDataTypeMap.put("PID-15-2", "ST");
    fieldDataTypeMap.put("IN1-19-7", "ID");
    fieldDataTypeMap.put("PID-15-3", "ID");
    fieldDataTypeMap.put("IN1-19-8", "ST");
    fieldDataTypeMap.put("PID-15-4", "ST");
    fieldDataTypeMap.put("IN1-19-9", "IS");
    fieldDataTypeMap.put("PID-15-5", "ST");
    fieldDataTypeMap.put("GT1-6-9", "ST");
    fieldDataTypeMap.put("PID-15-6", "ID");
    fieldDataTypeMap.put("GT1-6-8", "NM");
    fieldDataTypeMap.put("PV1-7-23-2", "ST");
    fieldDataTypeMap.put("PV1-7-23-3", "ID");
    fieldDataTypeMap.put("IN2-7-14", "ST");
    fieldDataTypeMap.put("PV1-7-23-1", "ST");
    fieldDataTypeMap.put("IN2-7-13", "TS");
    fieldDataTypeMap.put("IN2-7-12", "TS");
    fieldDataTypeMap.put("IN2-7-11", "ID");
    fieldDataTypeMap.put("IN2-7-10", "DR");
    fieldDataTypeMap.put("PV2-1-4-1", "IS");
    fieldDataTypeMap.put("GT1-29-10", "CWE");
    fieldDataTypeMap.put("PV2-1-4-3", "ID");
    fieldDataTypeMap.put("PV2-1-4-2", "ST");
    fieldDataTypeMap.put("IN1-9-8-1", "IS");
    fieldDataTypeMap.put("IN2-64-8", "NM");
    fieldDataTypeMap.put("IN2-64-7", "NM");
    fieldDataTypeMap.put("IN2-64-9", "ST");
    fieldDataTypeMap.put("IN2-64-4", "ST");
    fieldDataTypeMap.put("PV1-7-23-5", "ST");
    fieldDataTypeMap.put("IN2-64-3", "ID");
    fieldDataTypeMap.put("PV1-7-23-4", "ST");
    fieldDataTypeMap.put("IN2-64-6", "NM");
    fieldDataTypeMap.put("PV1-7-23-7", "ST");
    fieldDataTypeMap.put("IN2-64-5", "NM");
    fieldDataTypeMap.put("PV1-7-23-6", "ID");
    fieldDataTypeMap.put("PV1-7-23-9", "ST");
    fieldDataTypeMap.put("IN1-9-8-2", "ST");
    fieldDataTypeMap.put("PV1-7-23-8", "ST");
    fieldDataTypeMap.put("IN1-9-8-3", "ID");
    fieldDataTypeMap.put("IN2-64-2", "ID");
    fieldDataTypeMap.put("IN2-64-1", "ST");
    fieldDataTypeMap.put("IN2-49-12-2", "ID");
    fieldDataTypeMap.put("IN2-49-12-1", "DTM");
    fieldDataTypeMap.put("PD1-14-6-3", "ID");
    fieldDataTypeMap.put("PD1-14-6-2", "ST");
    fieldDataTypeMap.put("PD1-14-6-1", "IS");
    fieldDataTypeMap.put("NK1-32-1-3", "ST");
    fieldDataTypeMap.put("NK1-32-1-2", "ST");
    fieldDataTypeMap.put("NK1-32-1-1", "ST");
    fieldDataTypeMap.put("NK1-27-1", "ST");
    fieldDataTypeMap.put("RXA-3-2", "ID");
    fieldDataTypeMap.put("NK1-27-2", "ST");
    fieldDataTypeMap.put("RXA-3-1", "DTM");
    fieldDataTypeMap.put("NK1-27-5", "ST");
    fieldDataTypeMap.put("NK1-27-6", "ID");
    fieldDataTypeMap.put("NK1-27-3", "ID");
    fieldDataTypeMap.put("NK1-27-4", "ST");
    fieldDataTypeMap.put("IN1-4-1", "ST");
    fieldDataTypeMap.put("IN1-4-2", "IS");
    fieldDataTypeMap.put("IN1-4-3", "NM");
    fieldDataTypeMap.put("IN1-4-4", "NM");
    fieldDataTypeMap.put("IN1-4-5", "ID");
    fieldDataTypeMap.put("IN1-4-6", "HD");
    fieldDataTypeMap.put("IN1-4-7", "ID");
    fieldDataTypeMap.put("IN1-4-8", "HD");
    fieldDataTypeMap.put("IN1-4-9", "ID");
    fieldDataTypeMap.put("TQ1-13-2-3", "ID");
    fieldDataTypeMap.put("TQ1-13-2-4", "ST");
    fieldDataTypeMap.put("TQ1-13-2-1", "ST");
    fieldDataTypeMap.put("TQ1-13-2-2", "ST");
    fieldDataTypeMap.put("IN2-52-1-3", "ST");
    fieldDataTypeMap.put("IN2-52-1-2", "ST");
    fieldDataTypeMap.put("IN2-52-1-1", "ST");
    fieldDataTypeMap.put("IN2-52-1-5", "ST");
    fieldDataTypeMap.put("IN2-52-1-4", "ST");
    fieldDataTypeMap.put("TQ1-13-2-5", "ST");
    fieldDataTypeMap.put("TQ1-13-2-6", "ID");
    fieldDataTypeMap.put("IN2-64-12", "ST");
    fieldDataTypeMap.put("IN2-42-1", "ST");
    fieldDataTypeMap.put("IN2-42-2", "ST");
    fieldDataTypeMap.put("IN2-34-2", "ST");
    fieldDataTypeMap.put("IN2-42-3", "ID");
    fieldDataTypeMap.put("IN2-34-3", "ID");
    fieldDataTypeMap.put("IN2-42-4", "ST");
    fieldDataTypeMap.put("IN2-1-6-1", "IS");
    fieldDataTypeMap.put("IN2-42-5", "ST");
    fieldDataTypeMap.put("IN2-1-6-2", "ST");
    fieldDataTypeMap.put("IN2-34-1", "ST");
    fieldDataTypeMap.put("IN2-42-6", "ID");
    fieldDataTypeMap.put("IN2-34-6", "ID");
    fieldDataTypeMap.put("IN2-34-4", "ST");
    fieldDataTypeMap.put("IN2-34-5", "ST");
    fieldDataTypeMap.put("IN2-64-11", "ST");
    fieldDataTypeMap.put("IN2-64-10", "ST");
    fieldDataTypeMap.put("GT1-45-9-4", "ST");
    fieldDataTypeMap.put("GT1-45-9-3", "ID");
    fieldDataTypeMap.put("GT1-45-9-6", "ID");
    fieldDataTypeMap.put("GT1-45-9-5", "ST");
    fieldDataTypeMap.put("IN2-1-6-3", "ID");
    fieldDataTypeMap.put("GT1-45-9-2", "ST");
    fieldDataTypeMap.put("GT1-45-9-1", "ST");
    fieldDataTypeMap.put("NK1-26-1-1", "ST");
    fieldDataTypeMap.put("NK1-26-1-3", "ST");
    fieldDataTypeMap.put("NK1-26-1-2", "ST");
    fieldDataTypeMap.put("NK1-26-1-5", "ST");
    fieldDataTypeMap.put("NK1-26-1-4", "ST");
    fieldDataTypeMap.put("PID-14-8", "NM");
    fieldDataTypeMap.put("PID-14-9", "ST");
    fieldDataTypeMap.put("IN1-30-22-6", "ID");
    fieldDataTypeMap.put("IN1-30-22-7", "ST");
    fieldDataTypeMap.put("IN1-30-22-8", "ST");
    fieldDataTypeMap.put("IN1-30-22-9", "ST");
    fieldDataTypeMap.put("IN1-30-22-2", "ST");
    fieldDataTypeMap.put("IN1-30-22-3", "ID");
    fieldDataTypeMap.put("IN1-30-22-4", "ST");
    fieldDataTypeMap.put("IN1-30-22-5", "ST");
    fieldDataTypeMap.put("IN1-30-22-1", "ST");
    fieldDataTypeMap.put("TQ1-13-1", "NM");
    fieldDataTypeMap.put("PID-14-3", "ID");
    fieldDataTypeMap.put("IN2-40-11", "ID");
    fieldDataTypeMap.put("PID-14-2", "ID");
    fieldDataTypeMap.put("IN2-40-10", "DR");
    fieldDataTypeMap.put("PID-14-1", "ST");
    fieldDataTypeMap.put("IN2-40-13", "TS");
    fieldDataTypeMap.put("IN2-40-12", "TS");
    fieldDataTypeMap.put("PID-14-7", "NM");
    fieldDataTypeMap.put("PID-14-6", "NM");
    fieldDataTypeMap.put("IN2-40-14", "ST");
    fieldDataTypeMap.put("PID-14-5", "NM");
    fieldDataTypeMap.put("PID-14-4", "ST");
    fieldDataTypeMap.put("TQ1-13-2", "CE");
    fieldDataTypeMap.put("GT1-51-10", "ST");
    fieldDataTypeMap.put("PV1-10", "IS");
    fieldDataTypeMap.put("IN2-3-22", "CWE");
    fieldDataTypeMap.put("IN2-3-23", "CWE");
    fieldDataTypeMap.put("PV1-12", "IS");
    fieldDataTypeMap.put("IN2-3-20", "TS");
    fieldDataTypeMap.put("PV1-11", "PL");
    fieldDataTypeMap.put("IN2-3-21", "ST");
    fieldDataTypeMap.put("PV1-14", "IS");
    fieldDataTypeMap.put("PV1-13", "IS");
    fieldDataTypeMap.put("PV1-16", "IS");
    fieldDataTypeMap.put("PV1-15", "IS");
    fieldDataTypeMap.put("PV1-18", "IS");
    fieldDataTypeMap.put("PV1-17", "XCN");
    fieldDataTypeMap.put("PV1-19", "CX");
    fieldDataTypeMap.put("SFT-1-10", "ST");
    fieldDataTypeMap.put("IN2-3-19", "TS");
    fieldDataTypeMap.put("RXA-10-10", "ID");
    fieldDataTypeMap.put("PV1-20-1", "IS");
    fieldDataTypeMap.put("IN2-3-18", "ID");
    fieldDataTypeMap.put("PV1-20-2", "TS");
    fieldDataTypeMap.put("IN2-3-17", "DR");
    fieldDataTypeMap.put("RXA-10-12", "ID");
    fieldDataTypeMap.put("RXA-10-11", "ST");
    fieldDataTypeMap.put("RXA-10-14", "HD");
    fieldDataTypeMap.put("RXA-10-13", "ID");
    fieldDataTypeMap.put("PV1-23", "IS");
    fieldDataTypeMap.put("PV1-8-21", "ST");
    fieldDataTypeMap.put("PD1-4-14", "HD");
    fieldDataTypeMap.put("IN2-58-10", "ST");
    fieldDataTypeMap.put("PV1-22", "IS");
    fieldDataTypeMap.put("PV1-8-22", "CWE");
    fieldDataTypeMap.put("PD1-4-15", "ID");
    fieldDataTypeMap.put("IN2-3-10", "ID");
    fieldDataTypeMap.put("IN2-58-11", "ST");
    fieldDataTypeMap.put("PV1-21", "IS");
    fieldDataTypeMap.put("PD1-4-16", "CE");
    fieldDataTypeMap.put("IN2-3-11", "ST");
    fieldDataTypeMap.put("IN2-58-12", "ST");
    fieldDataTypeMap.put("PV1-20", "FC");
    fieldDataTypeMap.put("PV1-8-20", "TS");
    fieldDataTypeMap.put("PD1-4-17", "DR");
    fieldDataTypeMap.put("IN2-3-12", "ID");
    fieldDataTypeMap.put("PV1-27", "NM");
    fieldDataTypeMap.put("PD1-4-10", "ID");
    fieldDataTypeMap.put("IN2-3-13", "ID");
    fieldDataTypeMap.put("PV1-26", "NM");
    fieldDataTypeMap.put("PD1-4-11", "ST");
    fieldDataTypeMap.put("IN2-3-14", "HD");
    fieldDataTypeMap.put("PV1-25", "DT");
    fieldDataTypeMap.put("PD1-4-12", "ID");
    fieldDataTypeMap.put("IN2-3-15", "ID");
    fieldDataTypeMap.put("PV1-24", "IS");
    fieldDataTypeMap.put("PD1-4-13", "ID");
    fieldDataTypeMap.put("IN2-3-16", "CE");
    fieldDataTypeMap.put("PV1-29", "IS");
    fieldDataTypeMap.put("PV1-28", "IS");
    fieldDataTypeMap.put("PV1-8-23", "CWE");
    fieldDataTypeMap.put("PD1-4-19", "TS");
    fieldDataTypeMap.put("PV1-30", "DT");
    fieldDataTypeMap.put("PD1-4-18", "ID");
    fieldDataTypeMap.put("PV1-8-13", "ID");
    fieldDataTypeMap.put("PV1-9-16-6", "ID");
    fieldDataTypeMap.put("PV1-8-12", "ID");
    fieldDataTypeMap.put("PV1-8-15", "ID");
    fieldDataTypeMap.put("IN1-16-9-2", "ST");
    fieldDataTypeMap.put("PV1-8-14", "HD");
    fieldDataTypeMap.put("IN1-16-9-1", "ST");
    fieldDataTypeMap.put("PV1-39", "IS");
    fieldDataTypeMap.put("PV1-9-16-3", "ID");
    fieldDataTypeMap.put("PV1-8-17", "DR");
    fieldDataTypeMap.put("PD1-4-20", "TS");
    fieldDataTypeMap.put("PV1-9-16-2", "ST");
    fieldDataTypeMap.put("PV1-8-16", "CE");
    fieldDataTypeMap.put("PV1-9-16-5", "ST");
    fieldDataTypeMap.put("PV1-8-19", "TS");
    fieldDataTypeMap.put("PV1-9-16-4", "ST");
    fieldDataTypeMap.put("PV1-8-18", "ID");
    fieldDataTypeMap.put("PV1-35", "DT");
    fieldDataTypeMap.put("PV1-36", "IS");
    fieldDataTypeMap.put("PD1-4-23", "CWE");
    fieldDataTypeMap.put("PV1-37", "DLD");
    fieldDataTypeMap.put("PD1-4-22", "CWE");
    fieldDataTypeMap.put("PV1-38", "CE");
    fieldDataTypeMap.put("PD1-4-21", "ST");
    fieldDataTypeMap.put("PV1-31", "IS");
    fieldDataTypeMap.put("IN1-16-9-4", "ST");
    fieldDataTypeMap.put("PV1-32", "NM");
    fieldDataTypeMap.put("IN1-16-9-3", "ID");
    fieldDataTypeMap.put("PV1-33", "NM");
    fieldDataTypeMap.put("PV1-8-11", "ST");
    fieldDataTypeMap.put("IN1-16-9-6", "ID");
    fieldDataTypeMap.put("PV1-34", "IS");
    fieldDataTypeMap.put("PV1-8-10", "ID");
    fieldDataTypeMap.put("IN1-16-9-5", "ST");
    fieldDataTypeMap.put("PV1-41", "IS");
    fieldDataTypeMap.put("PV1-40", "IS");
    fieldDataTypeMap.put("GT1-3-1-1", "ST");
    fieldDataTypeMap.put("GT1-3-1-2", "ST");
    fieldDataTypeMap.put("GT1-3-1-5", "ST");
    fieldDataTypeMap.put("GT1-3-1-3", "ST");
    fieldDataTypeMap.put("GT1-3-1-4", "ST");
    fieldDataTypeMap.put("TQ2-5-1", "ST");
    fieldDataTypeMap.put("TQ2-5-3", "ST");
    fieldDataTypeMap.put("TQ2-5-2", "IS");
    fieldDataTypeMap.put("TQ2-5-4", "ID");
    fieldDataTypeMap.put("IN3-16-9", "ST");
    fieldDataTypeMap.put("PV1-48", "NM");
    fieldDataTypeMap.put("PV1-49", "NM");
    fieldDataTypeMap.put("PV1-46", "NM");
    fieldDataTypeMap.put("PV1-47", "NM");
    fieldDataTypeMap.put("PV1-44", "TS");
    fieldDataTypeMap.put("PV1-45", "TS");
    fieldDataTypeMap.put("PV1-42", "PL");
    fieldDataTypeMap.put("PV1-43", "PL");
    fieldDataTypeMap.put("RXR-3-3", "ID");
    fieldDataTypeMap.put("PV1-52", "XCN");
    fieldDataTypeMap.put("PID-26-1", "ST");
    fieldDataTypeMap.put("RXR-3-4", "ST");
    fieldDataTypeMap.put("PV1-51", "IS");
    fieldDataTypeMap.put("PID-26-2", "ST");
    fieldDataTypeMap.put("RXR-3-5", "ST");
    fieldDataTypeMap.put("PV1-50", "CX");
    fieldDataTypeMap.put("RXR-3-6", "ID");
    fieldDataTypeMap.put("PID-26-5", "ST");
    fieldDataTypeMap.put("PID-26-6", "ID");
    fieldDataTypeMap.put("PID-26-3", "ID");
    fieldDataTypeMap.put("PID-26-4", "ST");
    fieldDataTypeMap.put("IN3-16-5", "NM");
    fieldDataTypeMap.put("IN3-16-6", "NM");
    fieldDataTypeMap.put("IN3-16-7", "NM");
    fieldDataTypeMap.put("IN3-16-8", "NM");
    fieldDataTypeMap.put("IN3-16-1", "ST");
    fieldDataTypeMap.put("IN3-16-2", "ID");
    fieldDataTypeMap.put("RXR-3-1", "ST");
    fieldDataTypeMap.put("IN3-16-3", "ID");
    fieldDataTypeMap.put("RXR-3-2", "ST");
    fieldDataTypeMap.put("IN3-16-4", "ST");
    fieldDataTypeMap.put("OBX-19", "TS");
    fieldDataTypeMap.put("PV1-9-22-7", "ST");
    fieldDataTypeMap.put("PV1-9-22-8", "ST");
    fieldDataTypeMap.put("PV1-9-22-9", "ST");
    fieldDataTypeMap.put("IN1-4-8-1", "IS");
    fieldDataTypeMap.put("IN1-4-8-2", "ST");
    fieldDataTypeMap.put("IN1-4-8-3", "ID");
    fieldDataTypeMap.put("OBX-10", "ID");
    fieldDataTypeMap.put("OBX-12", "TS");
    fieldDataTypeMap.put("PD1-10-9-8", "ST");
    fieldDataTypeMap.put("OBX-11", "ID");
    fieldDataTypeMap.put("PD1-10-9-9", "ST");
    fieldDataTypeMap.put("OBX-14", "TS_IZ");
    fieldDataTypeMap.put("PD1-10-9-6", "ID");
    fieldDataTypeMap.put("OBX-13", "ST");
    fieldDataTypeMap.put("PD1-10-9-7", "ST");
    fieldDataTypeMap.put("OBX-16", "XCN");
    fieldDataTypeMap.put("PD1-10-9-4", "ST");
    fieldDataTypeMap.put("OBX-15", "CE");
    fieldDataTypeMap.put("PD1-10-9-5", "ST");
    fieldDataTypeMap.put("OBX-18", "EI");
    fieldDataTypeMap.put("PD1-10-9-2", "ST");
    fieldDataTypeMap.put("OBX-17", "CE_IZ");
    fieldDataTypeMap.put("PD1-10-9-3", "ID");
    fieldDataTypeMap.put("PV1-9-2-4", "ST");
    fieldDataTypeMap.put("PV1-9-2-3", "ST");
    fieldDataTypeMap.put("PV1-9-2-2", "ST");
    fieldDataTypeMap.put("PV1-9-2-1", "ST");
    fieldDataTypeMap.put("GT1-17-13-1", "DTM");
    fieldDataTypeMap.put("GT1-17-13-2", "ID");
    fieldDataTypeMap.put("PV1-9-2-5", "ST");
    fieldDataTypeMap.put("GT1-3-9-3", "ID");
    fieldDataTypeMap.put("GT1-3-9-4", "ST");
    fieldDataTypeMap.put("GT1-3-9-5", "ST");
    fieldDataTypeMap.put("GT1-3-9-6", "ID");
    fieldDataTypeMap.put("OBX-21", "(TBD)");
    fieldDataTypeMap.put("OBX-20", "(TBD)");
    fieldDataTypeMap.put("GT1-3-9-1", "ST");
    fieldDataTypeMap.put("GT1-3-9-2", "ST");
    fieldDataTypeMap.put("OBX-25", "XCN");
    fieldDataTypeMap.put("PV1-9-22-2", "ST");
    fieldDataTypeMap.put("OBX-24", "XAD");
    fieldDataTypeMap.put("PV1-9-22-1", "ST");
    fieldDataTypeMap.put("OBX-23", "XON");
    fieldDataTypeMap.put("OBX-22", "(TBD)");
    fieldDataTypeMap.put("PV1-9-22-6", "ID");
    fieldDataTypeMap.put("PV1-9-22-5", "ST");
    fieldDataTypeMap.put("PV1-9-16-1", "ST");
    fieldDataTypeMap.put("PV1-9-22-4", "ST");
    fieldDataTypeMap.put("PV1-9-22-3", "ID");
    fieldDataTypeMap.put("IN1-30-16-6", "ID");
    fieldDataTypeMap.put("GT1-17-1-1", "ST");
    fieldDataTypeMap.put("IN1-30-16-5", "ST");
    fieldDataTypeMap.put("IN1-30-16-2", "ST");
    fieldDataTypeMap.put("IN1-30-16-1", "ST");
    fieldDataTypeMap.put("IN1-30-16-4", "ST");
    fieldDataTypeMap.put("IN1-30-16-3", "ID");
    fieldDataTypeMap.put("GT1-17-1-2", "ST");
    fieldDataTypeMap.put("GT1-17-1-3", "ST");
    fieldDataTypeMap.put("GT1-2-6-3", "ID");
    fieldDataTypeMap.put("GT1-2-6-1", "IS");
    fieldDataTypeMap.put("GT1-2-6-2", "ST");
    fieldDataTypeMap.put("PID-11-13-2", "ID");
    fieldDataTypeMap.put("IN1-6-1-3", "ST");
    fieldDataTypeMap.put("IN1-6-1-2", "ST");
    fieldDataTypeMap.put("IN1-6-1-1", "ST");
    fieldDataTypeMap.put("PID-11-13-1", "DTM");
    fieldDataTypeMap.put("IN3-2-4-1", "IS");
    fieldDataTypeMap.put("IN3-2-4-2", "ST");
    fieldDataTypeMap.put("PV1-50-9-6", "ID");
    fieldDataTypeMap.put("PV1-50-9-7", "ST");
    fieldDataTypeMap.put("PV1-50-9-4", "ST");
    fieldDataTypeMap.put("PV1-50-9-5", "ST");
    fieldDataTypeMap.put("PV1-50-9-8", "ST");
    fieldDataTypeMap.put("PV1-50-9-9", "ST");
    fieldDataTypeMap.put("IN3-2-4-3", "ID");
    fieldDataTypeMap.put("PV1-50-9-3", "ID");
    fieldDataTypeMap.put("IN1-6-1-4", "ST");
    fieldDataTypeMap.put("PV1-50-9-2", "ST");
    fieldDataTypeMap.put("IN1-6-1-5", "ST");
    fieldDataTypeMap.put("PV1-50-9-1", "ST");
    fieldDataTypeMap.put("IN1-11-6-1", "IS");
    fieldDataTypeMap.put("IN1-11-6-2", "ST");
    fieldDataTypeMap.put("IN1-11-6-3", "ID");
    fieldDataTypeMap.put("PV1-17-23", "CWE");
    fieldDataTypeMap.put("PV1-17-22", "CWE");
    fieldDataTypeMap.put("PV1-17-21", "ST");
    fieldDataTypeMap.put("PV1-17-20", "TS");
    fieldDataTypeMap.put("RXA-10-22", "CWE");
    fieldDataTypeMap.put("RXA-10-23", "CWE");
    fieldDataTypeMap.put("IN1-16-13-2", "ID");
    fieldDataTypeMap.put("RXA-10-20", "TS");
    fieldDataTypeMap.put("IN1-16-13-1", "DTM");
    fieldDataTypeMap.put("RXA-10-21", "ST");
    fieldDataTypeMap.put("IN3-14-19", "TS");
    fieldDataTypeMap.put("IN3-14-18", "ID");
    fieldDataTypeMap.put("IN3-14-17", "DR");
    fieldDataTypeMap.put("IN3-14-16", "CE");
    fieldDataTypeMap.put("IN3-14-10", "ID");
    fieldDataTypeMap.put("PV1-17-19", "TS");
    fieldDataTypeMap.put("IN3-14-11", "ST");
    fieldDataTypeMap.put("PV1-17-18", "ID");
    fieldDataTypeMap.put("IN3-14-14", "HD");
    fieldDataTypeMap.put("PV1-17-15", "ID");
    fieldDataTypeMap.put("IN3-14-15", "ID");
    fieldDataTypeMap.put("PV1-17-14", "HD");
    fieldDataTypeMap.put("IN3-14-12", "ID");
    fieldDataTypeMap.put("PV1-17-17", "DR");
    fieldDataTypeMap.put("IN3-14-13", "ID");
    fieldDataTypeMap.put("PV1-17-16", "CE");
    fieldDataTypeMap.put("PV1-17-11", "ST");
    fieldDataTypeMap.put("RXA-10-19", "TS");
    fieldDataTypeMap.put("PV1-17-10", "ID");
    fieldDataTypeMap.put("PV1-17-13", "ID");
    fieldDataTypeMap.put("IN1-29-1", "DTM");
    fieldDataTypeMap.put("PV1-17-12", "ID");
    fieldDataTypeMap.put("IN1-29-2", "ID");
    fieldDataTypeMap.put("RXA-10-16", "CE");
    fieldDataTypeMap.put("RXA-10-15", "ID");
    fieldDataTypeMap.put("RXA-10-18", "ID");
    fieldDataTypeMap.put("RXA-10-17", "DR");
    fieldDataTypeMap.put("IN3-14-23", "CWE");
    fieldDataTypeMap.put("IN2-49-14", "ST");
    fieldDataTypeMap.put("IN3-14-20", "TS");
    fieldDataTypeMap.put("IN2-49-13", "TS");
    fieldDataTypeMap.put("IN3-14-21", "ST");
    fieldDataTypeMap.put("IN2-49-12", "TS");
    fieldDataTypeMap.put("IN3-14-22", "CWE");
    fieldDataTypeMap.put("IN2-49-11", "ID");
    fieldDataTypeMap.put("IN2-49-10", "DR");
    fieldDataTypeMap.put("IN2-3-16-1", "ST");
    fieldDataTypeMap.put("IN2-3-16-4", "ST");
    fieldDataTypeMap.put("IN2-3-16-5", "ST");
    fieldDataTypeMap.put("IN2-3-16-2", "ST");
    fieldDataTypeMap.put("IN2-3-16-3", "ID");
    fieldDataTypeMap.put("IN2-3-16-6", "ID");
    fieldDataTypeMap.put("IN1-10-9", "CWE");
    fieldDataTypeMap.put("IN1-10-7", "DT");
    fieldDataTypeMap.put("IN1-10-8", "DT");
    fieldDataTypeMap.put("IN1-10-5", "ID");
    fieldDataTypeMap.put("IN1-10-6", "HD");
    fieldDataTypeMap.put("IN1-10-3", "ID");
    fieldDataTypeMap.put("IN1-10-4", "HD");
    fieldDataTypeMap.put("IN1-10-1", "ST");
    fieldDataTypeMap.put("IN1-10-2", "ST");
    fieldDataTypeMap.put("IN1-3-6-1", "IS");
    fieldDataTypeMap.put("IN1-7-5", "NM");
    fieldDataTypeMap.put("IN1-7-6", "NM");
    fieldDataTypeMap.put("IN1-7-3", "ID");
    fieldDataTypeMap.put("IN1-7-4", "ST");
    fieldDataTypeMap.put("IN1-7-1", "ST");
    fieldDataTypeMap.put("IN1-7-2", "ID");
    fieldDataTypeMap.put("IN1-3-6-3", "ID");
    fieldDataTypeMap.put("IN1-3-6-2", "ST");
    fieldDataTypeMap.put("PID-5-1-4", "ST");
    fieldDataTypeMap.put("PID-5-1-5", "ST");
    fieldDataTypeMap.put("PID-5-1-2", "ST");
    fieldDataTypeMap.put("PID-5-1-3", "ST");
    fieldDataTypeMap.put("PID-5-1-1", "ST");
    fieldDataTypeMap.put("ORC-22-5", "ST");
    fieldDataTypeMap.put("ORC-22-4", "ST");
    fieldDataTypeMap.put("GT1-2-10", "CWE");
    fieldDataTypeMap.put("ORC-22-7", "ID");
    fieldDataTypeMap.put("ORC-22-6", "ID");
    fieldDataTypeMap.put("ORC-22-1", "SAD");
    fieldDataTypeMap.put("ORC-22-3", "ST");
    fieldDataTypeMap.put("ORC-22-2", "ST");
    fieldDataTypeMap.put("ORC-22-9", "IS");
    fieldDataTypeMap.put("ORC-22-8", "ST");
    fieldDataTypeMap.put("OBX-3", "CE_IZ");
    fieldDataTypeMap.put("TQ1-3-7", "ID");
    fieldDataTypeMap.put("OBX-2", "ID");
    fieldDataTypeMap.put("TQ1-3-8", "ID");
    fieldDataTypeMap.put("OBX-1", "SI");
    fieldDataTypeMap.put("TQ1-3-9", "NM");
    fieldDataTypeMap.put("OBX-0", "ST");
    fieldDataTypeMap.put("OBX-7", "ST");
    fieldDataTypeMap.put("TQ1-3-3", "NM");
    fieldDataTypeMap.put("OBX-6", "CE_IZ");
    fieldDataTypeMap.put("TQ1-3-4", "NM");
    fieldDataTypeMap.put("OBX-5", "variable");
    populateFieldDataTypes1();
  }

  public void populateFieldDataTypes1() {
    fieldDataTypeMap.put("TQ1-3-5", "NM");
    fieldDataTypeMap.put("OBX-4", "ST");
    fieldDataTypeMap.put("TQ1-3-6", "IS");
    fieldDataTypeMap.put("OBX-25-16-3", "ID");
    fieldDataTypeMap.put("ORC-19-23-1", "ST");
    fieldDataTypeMap.put("OBX-25-16-2", "ST");
    fieldDataTypeMap.put("OBX-25-16-5", "ST");
    fieldDataTypeMap.put("ORC-19-23-3", "ID");
    fieldDataTypeMap.put("OBX-25-16-4", "ST");
    fieldDataTypeMap.put("ORC-19-23-2", "ST");
    fieldDataTypeMap.put("PV1-52-14-1", "IS");
    fieldDataTypeMap.put("OBX-25-16-1", "ST");
    fieldDataTypeMap.put("PV1-52-14-3", "ID");
    fieldDataTypeMap.put("PV1-52-14-2", "ST");
    fieldDataTypeMap.put("OBX-25-16-6", "ID");
    fieldDataTypeMap.put("PID-33-1", "DTM");
    fieldDataTypeMap.put("PID-33-2", "ID");
    fieldDataTypeMap.put("IN1-5-13-2", "ID");
    fieldDataTypeMap.put("OBX-8", "IS");
    fieldDataTypeMap.put("OBX-9", "NM");
    fieldDataTypeMap.put("ORC-22-10", "IS");
    fieldDataTypeMap.put("NK1-2-1-2", "ST");
    fieldDataTypeMap.put("NK1-2-1-3", "ST");
    fieldDataTypeMap.put("NK1-2-1-1", "ST");
    fieldDataTypeMap.put("IN1-5-13-1", "DTM");
    fieldDataTypeMap.put("NK1-2-1-4", "ST");
    fieldDataTypeMap.put("NK1-2-1-5", "ST");
    fieldDataTypeMap.put("IN2-40-9-2", "ST");
    fieldDataTypeMap.put("IN2-40-9-1", "ST");
    fieldDataTypeMap.put("IN2-40-9-4", "ST");
    fieldDataTypeMap.put("IN2-40-9-3", "ID");
    fieldDataTypeMap.put("PV2-13-2-5", "ST");
    fieldDataTypeMap.put("OBX-24-1-3", "ST");
    fieldDataTypeMap.put("OBX-6-3", "ID");
    fieldDataTypeMap.put("PV2-13-2-2", "ST");
    fieldDataTypeMap.put("OBX-6-4", "ST");
    fieldDataTypeMap.put("ORC-12-19-1", "DTM");
    fieldDataTypeMap.put("PV2-13-2-1", "ST");
    fieldDataTypeMap.put("OBX-6-5", "ST");
    fieldDataTypeMap.put("ORC-19-23-8", "ST");
    fieldDataTypeMap.put("PV2-13-2-4", "ST");
    fieldDataTypeMap.put("OBX-6-6", "ID");
    fieldDataTypeMap.put("ORC-19-23-9", "ST");
    fieldDataTypeMap.put("PV2-13-2-3", "ST");
    fieldDataTypeMap.put("ORC-19-23-6", "ID");
    fieldDataTypeMap.put("IN2-40-9-5", "ST");
    fieldDataTypeMap.put("ORC-19-23-7", "ST");
    fieldDataTypeMap.put("IN2-40-9-6", "ID");
    fieldDataTypeMap.put("OBX-24-1-1", "ST");
    fieldDataTypeMap.put("OBX-6-1", "ST");
    fieldDataTypeMap.put("ORC-19-23-4", "ST");
    fieldDataTypeMap.put("ORC-12-19-2", "ID");
    fieldDataTypeMap.put("OBX-24-1-2", "ST");
    fieldDataTypeMap.put("OBX-6-2", "ST");
    fieldDataTypeMap.put("ORC-19-23-5", "ST");
    fieldDataTypeMap.put("TQ1-3-2", "ID");
    fieldDataTypeMap.put("TQ1-3-1", "CWE");
    fieldDataTypeMap.put("IN2-7-12-1", "DTM");
    fieldDataTypeMap.put("IN2-7-12-2", "ID");
    fieldDataTypeMap.put("IN1-43", "IS");
    fieldDataTypeMap.put("IN1-44", "XAD");
    fieldDataTypeMap.put("IN1-45", "ST");
    fieldDataTypeMap.put("IN1-46", "IS");
    fieldDataTypeMap.put("IN1-47", "IS");
    fieldDataTypeMap.put("OBX-23-8-3", "ID");
    fieldDataTypeMap.put("IN1-48", "IS");
    fieldDataTypeMap.put("OBX-23-8-2", "ST");
    fieldDataTypeMap.put("IN1-49", "CX");
    fieldDataTypeMap.put("OBX-23-8-1", "IS");
    fieldDataTypeMap.put("IN2-50-8", "NM");
    fieldDataTypeMap.put("IN2-50-9", "ST");
    fieldDataTypeMap.put("IN2-50-6", "NM");
    fieldDataTypeMap.put("IN2-50-7", "NM");
    fieldDataTypeMap.put("IN2-50-4", "ST");
    fieldDataTypeMap.put("IN2-50-5", "NM");
    fieldDataTypeMap.put("IN2-50-2", "ID");
    fieldDataTypeMap.put("IN2-50-3", "ID");
    fieldDataTypeMap.put("PV2-8-1", "DTM");
    fieldDataTypeMap.put("NK1-30-9", "CE");
    fieldDataTypeMap.put("IN1-51", "DT");
    fieldDataTypeMap.put("PV2-8-2", "ID");
    fieldDataTypeMap.put("IN1-50", "IS");
    fieldDataTypeMap.put("NK1-30-7", "ID");
    fieldDataTypeMap.put("IN1-53", "IS");
    fieldDataTypeMap.put("NK1-30-8", "ID");
    fieldDataTypeMap.put("IN1-52", "ST");
    fieldDataTypeMap.put("NK1-30-4", "ST");
    fieldDataTypeMap.put("GT1-36-4", "ST");
    fieldDataTypeMap.put("NK1-30-3", "ST");
    fieldDataTypeMap.put("GT1-36-3", "ID");
    fieldDataTypeMap.put("NK1-30-6", "IS");
    fieldDataTypeMap.put("GT1-36-2", "ST");
    fieldDataTypeMap.put("NK1-30-5", "ST");
    fieldDataTypeMap.put("GT1-36-1", "ST");
    fieldDataTypeMap.put("PD1-19", "IS");
    fieldDataTypeMap.put("NK1-30-2", "ST");
    fieldDataTypeMap.put("GT1-36-6", "ID");
    fieldDataTypeMap.put("NK1-30-1", "FN");
    fieldDataTypeMap.put("GT1-36-5", "ST");
    fieldDataTypeMap.put("ORC-22-13", "TS");
    fieldDataTypeMap.put("PD1-15", "CE");
    fieldDataTypeMap.put("ORC-22-14", "TS");
    fieldDataTypeMap.put("PD1-16", "IS");
    fieldDataTypeMap.put("ORC-22-11", "ID");
    fieldDataTypeMap.put("IN2-50-1", "ST");
    fieldDataTypeMap.put("PD1-17", "DT");
    fieldDataTypeMap.put("ORC-22-12", "DR");
    fieldDataTypeMap.put("PD1-18", "DT");
    fieldDataTypeMap.put("PD1-11", "CE_IZ");
    fieldDataTypeMap.put("PD1-12", "ID");
    fieldDataTypeMap.put("PD1-13", "DT");
    fieldDataTypeMap.put("PD1-14", "XON");
    fieldDataTypeMap.put("PV2-42-4", "ST");
    fieldDataTypeMap.put("PV2-42-5", "ST");
    fieldDataTypeMap.put("PD1-10", "CX");
    fieldDataTypeMap.put("PV2-42-2", "ST");
    fieldDataTypeMap.put("PV2-42-3", "ID");
    fieldDataTypeMap.put("PV2-42-1", "ST");
    fieldDataTypeMap.put("ORC-19-16-1", "ST");
    fieldDataTypeMap.put("ORC-19-16-2", "ST");
    fieldDataTypeMap.put("ORC-19-16-3", "ID");
    fieldDataTypeMap.put("ORC-19-16-4", "ST");
    fieldDataTypeMap.put("ORC-19-16-5", "ST");
    fieldDataTypeMap.put("ORC-19-16-6", "ID");
    fieldDataTypeMap.put("PV2-42-6", "ID");
    fieldDataTypeMap.put("RXA-25-3", "ID");
    fieldDataTypeMap.put("GT1-19-9-4", "ST");
    fieldDataTypeMap.put("IN1-25", "ID");
    fieldDataTypeMap.put("RXA-25-2", "ST");
    fieldDataTypeMap.put("NK1-2-9-1", "ST");
    fieldDataTypeMap.put("GT1-19-9-5", "ST");
    fieldDataTypeMap.put("IN1-26", "DT");
    fieldDataTypeMap.put("RXA-25-1", "ST");
    fieldDataTypeMap.put("NK1-2-9-2", "ST");
    fieldDataTypeMap.put("GT1-19-9-6", "ID");
    fieldDataTypeMap.put("IN1-27", "IS");
    fieldDataTypeMap.put("NK1-2-9-3", "ID");
    fieldDataTypeMap.put("GT1-19-9-7", "ST");
    fieldDataTypeMap.put("IN1-28", "ST");
    fieldDataTypeMap.put("RXA-25-7", "ST");
    fieldDataTypeMap.put("NK1-2-9-4", "ST");
    fieldDataTypeMap.put("IN1-21", "IS");
    fieldDataTypeMap.put("RXA-25-6", "ID");
    fieldDataTypeMap.put("NK1-2-9-5", "ST");
    fieldDataTypeMap.put("GT1-19-9-1", "ST");
    fieldDataTypeMap.put("IN1-22", "ST");
    fieldDataTypeMap.put("RXA-25-5", "ST");
    fieldDataTypeMap.put("NK1-2-9-6", "ID");
    fieldDataTypeMap.put("GT1-19-9-2", "ST");
    fieldDataTypeMap.put("IN1-23", "ID");
    fieldDataTypeMap.put("RXA-25-4", "ST");
    fieldDataTypeMap.put("GT1-19-9-3", "ID");
    fieldDataTypeMap.put("IN1-24", "DT");
    fieldDataTypeMap.put("GT1-19-9-8", "ST");
    fieldDataTypeMap.put("IN1-29", "TS");
    fieldDataTypeMap.put("GT1-19-9-9", "ST");
    fieldDataTypeMap.put("IN1-7-7", "NM");
    fieldDataTypeMap.put("IN1-7-8", "NM");
    fieldDataTypeMap.put("IN1-7-9", "ST");
    fieldDataTypeMap.put("PD1-21", "IS");
    fieldDataTypeMap.put("PD1-20", "IS");
    fieldDataTypeMap.put("PV1-50-8", "DT");
    fieldDataTypeMap.put("PV1-50-9", "CWE");
    fieldDataTypeMap.put("PV1-50-6", "HD");
    fieldDataTypeMap.put("PV1-50-7", "DT");
    fieldDataTypeMap.put("PV1-50-4", "HD");
    fieldDataTypeMap.put("IN1-31", "IS");
    fieldDataTypeMap.put("PV1-50-5", "ID");
    fieldDataTypeMap.put("IN1-30", "XCN");
    fieldDataTypeMap.put("PV1-50-2", "ST");
    fieldDataTypeMap.put("PV1-50-3", "ID");
    fieldDataTypeMap.put("PV1-50-1", "ST");
    fieldDataTypeMap.put("IN1-38", "CP");
    fieldDataTypeMap.put("IN1-39", "NM");
    fieldDataTypeMap.put("IN1-36", "ST");
    fieldDataTypeMap.put("IN1-37", "CP");
    fieldDataTypeMap.put("IN1-34", "NM");
    fieldDataTypeMap.put("IN1-35", "IS");
    fieldDataTypeMap.put("IN1-32", "IS");
    fieldDataTypeMap.put("IN1-33", "NM");
    fieldDataTypeMap.put("RXA-10-9-2", "ST");
    fieldDataTypeMap.put("RXA-10-9-3", "ID");
    fieldDataTypeMap.put("RXA-10-9-1", "IS");
    fieldDataTypeMap.put("IN2-58-1", "ST");
    fieldDataTypeMap.put("IN2-58-2", "ID");
    fieldDataTypeMap.put("IN1-42", "CE");
    fieldDataTypeMap.put("IN2-58-3", "ID");
    fieldDataTypeMap.put("IN1-41", "CP");
    fieldDataTypeMap.put("IN3-25-14-2", "ST");
    fieldDataTypeMap.put("IN2-58-4", "ST");
    fieldDataTypeMap.put("IN1-40", "CP");
    fieldDataTypeMap.put("IN3-25-14-1", "IS");
    fieldDataTypeMap.put("IN2-58-5", "NM");
    fieldDataTypeMap.put("IN2-58-6", "NM");
    fieldDataTypeMap.put("IN3-25-14-3", "ID");
    fieldDataTypeMap.put("IN2-58-7", "NM");
    fieldDataTypeMap.put("IN2-58-8", "NM");
    fieldDataTypeMap.put("IN2-58-9", "ST");
    fieldDataTypeMap.put("IN2-69-8", "HD");
    fieldDataTypeMap.put("IN2-69-9", "ID");
    fieldDataTypeMap.put("IN2-69-6", "HD");
    fieldDataTypeMap.put("IN2-69-7", "ID");
    fieldDataTypeMap.put("IN2-69-4", "NM");
    fieldDataTypeMap.put("IN2-69-5", "ID");
    fieldDataTypeMap.put("IN2-69-2", "IS");
    fieldDataTypeMap.put("IN2-69-3", "NM");
    fieldDataTypeMap.put("GT1-3-11", "ID");
    fieldDataTypeMap.put("IN2-69-1", "ST");
    fieldDataTypeMap.put("GT1-3-10", "DR");
    fieldDataTypeMap.put("GT1-3-14", "ST");
    fieldDataTypeMap.put("GT1-3-13", "TS");
    fieldDataTypeMap.put("GT1-3-12", "TS");
    fieldDataTypeMap.put("IN2-61-1", "ST");
    fieldDataTypeMap.put("RXA-10-1", "ST");
    fieldDataTypeMap.put("NK1-2-1", "FN_IZ");
    fieldDataTypeMap.put("RXA-10-3", "ST");
    fieldDataTypeMap.put("NK1-2-2", "ST");
    fieldDataTypeMap.put("RXA-10-2", "FN_IZ");
    fieldDataTypeMap.put("NK1-2-3", "ST");
    fieldDataTypeMap.put("RXA-10-5", "ST");
    fieldDataTypeMap.put("GT1-47-2", "ST");
    fieldDataTypeMap.put("RXA-10-4", "ST");
    fieldDataTypeMap.put("PD1-10-9-1", "ST");
    fieldDataTypeMap.put("GT1-47-1", "ST");
    fieldDataTypeMap.put("RXA-19-2", "ST");
    fieldDataTypeMap.put("RXA-10-7", "IS");
    fieldDataTypeMap.put("GT1-47-4", "ST");
    fieldDataTypeMap.put("RXA-19-1", "ST");
    fieldDataTypeMap.put("RXA-10-6", "ST");
    fieldDataTypeMap.put("GT1-47-3", "ID");
    fieldDataTypeMap.put("RXA-10-9", "HD_IZ_0363");
    fieldDataTypeMap.put("GT1-47-6", "ID");
    fieldDataTypeMap.put("RXA-10-8", "IS");
    fieldDataTypeMap.put("GT1-47-5", "ST");
    fieldDataTypeMap.put("PV1-42-7", "IS");
    fieldDataTypeMap.put("PV1-17-2", "FN");
    fieldDataTypeMap.put("PV1-42-8", "IS");
    fieldDataTypeMap.put("PV1-17-1", "ST");
    fieldDataTypeMap.put("PV1-42-5", "IS");
    fieldDataTypeMap.put("PV1-17-4", "ST");
    fieldDataTypeMap.put("IN2-26-4-1", "IS");
    fieldDataTypeMap.put("PV1-42-6", "IS");
    fieldDataTypeMap.put("PV1-17-3", "ST");
    fieldDataTypeMap.put("RXA-19-5", "ST");
    fieldDataTypeMap.put("RXA-19-6", "ID");
    fieldDataTypeMap.put("RXA-25-9", "ST");
    fieldDataTypeMap.put("RXA-19-3", "ID");
    fieldDataTypeMap.put("PV1-42-9", "ST");
    fieldDataTypeMap.put("RXA-25-8", "ST");
    fieldDataTypeMap.put("RXA-19-4", "ST");
    fieldDataTypeMap.put("NK1-2-7", "ID");
    fieldDataTypeMap.put("NK1-2-6", "IS");
    fieldDataTypeMap.put("NK1-2-5", "ST");
    fieldDataTypeMap.put("NK1-2-4", "ST");
    fieldDataTypeMap.put("PV1-42-3", "IS");
    fieldDataTypeMap.put("PV1-42-4", "HD");
    fieldDataTypeMap.put("PV1-42-1", "IS");
    fieldDataTypeMap.put("NK1-2-9", "CE");
    fieldDataTypeMap.put("PV1-42-2", "IS");
    fieldDataTypeMap.put("NK1-2-8", "ID");
    fieldDataTypeMap.put("IN2-9-13", "TS");
    fieldDataTypeMap.put("IN2-9-14", "ST");
    fieldDataTypeMap.put("IN2-9-11", "ID");
    fieldDataTypeMap.put("IN2-9-12", "TS");
    fieldDataTypeMap.put("IN2-9-10", "DR");
    fieldDataTypeMap.put("PV1-17-9", "HD");
    fieldDataTypeMap.put("PV1-5-10-2", "ST");
    fieldDataTypeMap.put("PV1-5-10-3", "ID");
    fieldDataTypeMap.put("PV1-5-10-1", "ST");
    fieldDataTypeMap.put("PV1-17-5", "ST");
    fieldDataTypeMap.put("IN2-26-4-2", "ST");
    fieldDataTypeMap.put("PV1-17-6", "ST");
    fieldDataTypeMap.put("IN2-26-4-3", "ID");
    fieldDataTypeMap.put("PV1-17-7", "IS");
    fieldDataTypeMap.put("PV1-17-8", "IS");
    fieldDataTypeMap.put("PV1-5-10-5", "ST");
    fieldDataTypeMap.put("PID-3", "CX_IZ");
    fieldDataTypeMap.put("PV1-5-10-4", "ST");
    fieldDataTypeMap.put("PID-2", "CX");
    fieldDataTypeMap.put("PV1-5-10-7", "ST");
    fieldDataTypeMap.put("PID-5", "XPN_IZ");
    fieldDataTypeMap.put("PV1-5-10-6", "ID");
    fieldDataTypeMap.put("PID-4", "CX");
    fieldDataTypeMap.put("RXA-18-4", "ST");
    fieldDataTypeMap.put("PV1-5-10-9", "ST");
    fieldDataTypeMap.put("PID-7", "TS_IZ");
    fieldDataTypeMap.put("RXA-18-5", "ST");
    fieldDataTypeMap.put("PV1-5-10-8", "ST");
    fieldDataTypeMap.put("PID-6", "XPN_IZ");
    fieldDataTypeMap.put("RXA-18-6", "ID");
    fieldDataTypeMap.put("PID-9", "XPN");
    fieldDataTypeMap.put("PID-8", "IS");
    fieldDataTypeMap.put("ORC-8-1", "EI");
    fieldDataTypeMap.put("MSH-7-2", "ID");
    fieldDataTypeMap.put("MSH-7-1", "DTM");
    fieldDataTypeMap.put("ORC-8-2", "EI");
    fieldDataTypeMap.put("ORC-14-12", "ST");
    fieldDataTypeMap.put("ORC-14-10", "ST");
    fieldDataTypeMap.put("ORC-14-11", "ST");
    fieldDataTypeMap.put("PID-0", "ST");
    fieldDataTypeMap.put("PID-1", "SI");
    fieldDataTypeMap.put("ORC-16-5", "ST");
    fieldDataTypeMap.put("PV1-50-10-1", "ST");
    fieldDataTypeMap.put("GT1-27-1-1", "NM");
    fieldDataTypeMap.put("ORC-16-6", "ID");
    fieldDataTypeMap.put("PV2-39-1", "ST");
    fieldDataTypeMap.put("GT1-27-1-2", "ID");
    fieldDataTypeMap.put("ORC-16-3", "ID");
    fieldDataTypeMap.put("ORC-16-4", "ST");
    fieldDataTypeMap.put("PV1-50-10-5", "ST");
    fieldDataTypeMap.put("PV2-39-4", "ST");
    fieldDataTypeMap.put("PV1-50-10-4", "ST");
    fieldDataTypeMap.put("PV2-39-5", "ST");
    fieldDataTypeMap.put("PV1-50-10-3", "ID");
    fieldDataTypeMap.put("PV2-39-2", "ST");
    fieldDataTypeMap.put("PV1-50-10-2", "ST");
    fieldDataTypeMap.put("PV2-39-3", "ID");
    fieldDataTypeMap.put("IN2-61-2", "ST");
    fieldDataTypeMap.put("PV1-50-10-9", "ST");
    fieldDataTypeMap.put("IN2-61-3", "ID");
    fieldDataTypeMap.put("PV1-50-10-8", "ST");
    fieldDataTypeMap.put("IN2-61-4", "HD");
    fieldDataTypeMap.put("PV1-50-10-7", "ST");
    fieldDataTypeMap.put("IN2-61-5", "ID");
    fieldDataTypeMap.put("PV1-50-10-6", "ID");
    fieldDataTypeMap.put("ORC-16-1", "ST");
    fieldDataTypeMap.put("IN2-61-6", "HD");
    fieldDataTypeMap.put("ORC-16-2", "ST");
    fieldDataTypeMap.put("IN2-61-7", "DT");
    fieldDataTypeMap.put("IN2-61-8", "DT");
    fieldDataTypeMap.put("IN2-61-9", "CWE");
    fieldDataTypeMap.put("PV1-3-11", "HD");
    fieldDataTypeMap.put("RXA-19", "CE");
    fieldDataTypeMap.put("RXA-18", "CE_IZ");
    fieldDataTypeMap.put("RXA-17", "CE_IZ");
    fieldDataTypeMap.put("PV1-3-10", "EI");
    fieldDataTypeMap.put("RXA-18-3", "ID");
    fieldDataTypeMap.put("RXA-12", "ST");
    fieldDataTypeMap.put("RXA-18-2", "ST");
    fieldDataTypeMap.put("RXA-11", "LA2_IZ");
    fieldDataTypeMap.put("RXA-18-1", "ST");
    fieldDataTypeMap.put("RXA-10", "XCN_IZ");
    fieldDataTypeMap.put("PV2-39-6", "ID");
    fieldDataTypeMap.put("RXA-16", "TS_IZ");
    fieldDataTypeMap.put("RXA-15", "ST");
    fieldDataTypeMap.put("RXA-14", "CE");
    fieldDataTypeMap.put("RXA-13", "NM");
    fieldDataTypeMap.put("RXA-24", "CWE");
    fieldDataTypeMap.put("RXA-25", "CWE");
    fieldDataTypeMap.put("RXA-26", "ID");
    fieldDataTypeMap.put("RXA-20", "ID");
    fieldDataTypeMap.put("RXA-21", "ID");
    fieldDataTypeMap.put("RXA-22", "TS");
    fieldDataTypeMap.put("RXA-23", "NM");
    fieldDataTypeMap.put("GT1-7-9", "ST");
    fieldDataTypeMap.put("GT1-7-8", "NM");
    fieldDataTypeMap.put("GT1-7-7", "NM");
    fieldDataTypeMap.put("GT1-7-2", "ID");
    fieldDataTypeMap.put("PV1-38-1", "ST");
    fieldDataTypeMap.put("GT1-7-1", "ST");
    fieldDataTypeMap.put("PV1-38-4", "ST");
    fieldDataTypeMap.put("GT1-7-6", "NM");
    fieldDataTypeMap.put("PV1-38-5", "ST");
    fieldDataTypeMap.put("GT1-7-5", "NM");
    fieldDataTypeMap.put("PV1-38-2", "ST");
    fieldDataTypeMap.put("GT1-7-4", "ST");
    fieldDataTypeMap.put("PV1-38-3", "ID");
    fieldDataTypeMap.put("GT1-7-3", "ID");
    fieldDataTypeMap.put("PV1-38-6", "ID");
    fieldDataTypeMap.put("IN3-19-11", "ST");
    fieldDataTypeMap.put("IN1-19-12", "DR");
    fieldDataTypeMap.put("IN3-19-12", "ST");
    fieldDataTypeMap.put("IN1-19-11", "ID");
    fieldDataTypeMap.put("IN1-19-14", "TS");
    fieldDataTypeMap.put("IN3-19-10", "ST");
    fieldDataTypeMap.put("IN1-19-13", "TS");
    fieldDataTypeMap.put("IN1-19-10", "IS");
    fieldDataTypeMap.put("IN1-5-14", "TS");
    fieldDataTypeMap.put("IN1-5-10", "IS");
    fieldDataTypeMap.put("IN1-5-11", "ID");
    fieldDataTypeMap.put("IN1-5-12", "DR");
    fieldDataTypeMap.put("NK1-12-10", "CWE");
    fieldDataTypeMap.put("IN1-5-13", "TS");
    fieldDataTypeMap.put("MSH-12-3-6", "ID");
    fieldDataTypeMap.put("IN1-30-23-4", "ST");
    fieldDataTypeMap.put("MSH-12-3-5", "ST");
    fieldDataTypeMap.put("IN1-30-23-3", "ID");
    fieldDataTypeMap.put("MSH-12-3-4", "ST");
    fieldDataTypeMap.put("IN1-30-23-2", "ST");
    fieldDataTypeMap.put("MSH-12-3-3", "ID");
    fieldDataTypeMap.put("IN1-30-23-1", "ST");
    fieldDataTypeMap.put("PV2-13-19-2", "ID");
    fieldDataTypeMap.put("PV2-13-19-1", "DTM");
    fieldDataTypeMap.put("IN1-30-23-9", "ST");
    fieldDataTypeMap.put("NK1-30-13-2", "ID");
    fieldDataTypeMap.put("MSH-12-3-2", "ST");
    fieldDataTypeMap.put("IN1-30-23-8", "ST");
    fieldDataTypeMap.put("MSH-12-3-1", "ST");
    fieldDataTypeMap.put("IN1-30-23-7", "ST");
    fieldDataTypeMap.put("IN1-30-23-6", "ID");
    fieldDataTypeMap.put("NK1-30-13-1", "DTM");
    fieldDataTypeMap.put("IN1-30-23-5", "ST");
    fieldDataTypeMap.put("PV2-13-19", "TS");
    fieldDataTypeMap.put("ORC-21-6-1", "IS");
    fieldDataTypeMap.put("ORC-21-6-2", "ST");
    fieldDataTypeMap.put("PV2-13-17", "DR");
    fieldDataTypeMap.put("ORC-21-6-3", "ID");
    fieldDataTypeMap.put("PV2-13-18", "ID");
    fieldDataTypeMap.put("PID-13-9", "ST");
    fieldDataTypeMap.put("PID-13-8", "NM");
    fieldDataTypeMap.put("GT1-51-6-2", "ST");
    fieldDataTypeMap.put("PID-13-7", "NM");
    fieldDataTypeMap.put("GT1-51-6-1", "IS");
    fieldDataTypeMap.put("PID-13-6", "NM");
    fieldDataTypeMap.put("PID-13-5", "NM");
    fieldDataTypeMap.put("PID-13-4", "ST");
    fieldDataTypeMap.put("PID-13-3", "ID");
    fieldDataTypeMap.put("PID-13-2", "ID");
    fieldDataTypeMap.put("PID-13-1", "ST");
    fieldDataTypeMap.put("GT1-51-6-3", "ID");
    fieldDataTypeMap.put("IN3-3-16-4", "ST");
    fieldDataTypeMap.put("PV2-13-16", "CE");
    fieldDataTypeMap.put("IN3-3-16-3", "ID");
    fieldDataTypeMap.put("PV2-13-15", "ID");
    fieldDataTypeMap.put("IN3-3-16-6", "ID");
    fieldDataTypeMap.put("PV2-13-14", "HD");
    fieldDataTypeMap.put("IN3-3-16-5", "ST");
    fieldDataTypeMap.put("PV2-13-13", "ID");
    fieldDataTypeMap.put("PV2-13-12", "ID");
    fieldDataTypeMap.put("PV2-13-11", "ST");
    fieldDataTypeMap.put("IN3-3-16-2", "ST");
    fieldDataTypeMap.put("PV2-13-10", "ID");
    fieldDataTypeMap.put("IN3-3-16-1", "ST");
    fieldDataTypeMap.put("GT1-46-12", "ST");
    fieldDataTypeMap.put("GT1-46-11", "ST");
    fieldDataTypeMap.put("GT1-46-10", "ST");
    fieldDataTypeMap.put("IN2-25-9-1", "ST");
    fieldDataTypeMap.put("IN2-25-9-3", "ID");
    fieldDataTypeMap.put("IN2-25-9-2", "ST");
    fieldDataTypeMap.put("IN2-25-9-5", "ST");
    fieldDataTypeMap.put("IN2-25-9-4", "ST");
    fieldDataTypeMap.put("IN2-25-9-7", "ST");
    fieldDataTypeMap.put("IN2-25-9-6", "ID");
    fieldDataTypeMap.put("IN2-25-9-9", "ST");
    fieldDataTypeMap.put("IN2-25-9-8", "ST");
    fieldDataTypeMap.put("RXR-4-7", "ST");
    fieldDataTypeMap.put("RXR-4-6", "ID");
    fieldDataTypeMap.put("RXR-4-9", "ST");
    fieldDataTypeMap.put("RXR-4-8", "ST");
    fieldDataTypeMap.put("RXR-4-3", "ID");
    fieldDataTypeMap.put("RXR-4-2", "ST");
    fieldDataTypeMap.put("RXR-4-5", "ST");
    fieldDataTypeMap.put("RXR-4-4", "ST");
    fieldDataTypeMap.put("RXR-4-1", "ST");
    fieldDataTypeMap.put("PV2-13-21", "ST");
    fieldDataTypeMap.put("PV2-13-20", "TS");
    fieldDataTypeMap.put("PV2-13-23", "CWE");
    fieldDataTypeMap.put("PV2-13-22", "CWE");
    fieldDataTypeMap.put("GT1-4-13-2", "ID");
    fieldDataTypeMap.put("GT1-4-13-1", "DTM");
    fieldDataTypeMap.put("PD1-4-22-6", "ID");
    fieldDataTypeMap.put("PD1-4-22-7", "ST");
    fieldDataTypeMap.put("IN1-10-6-1", "IS");
    fieldDataTypeMap.put("PD1-4-22-4", "ST");
    fieldDataTypeMap.put("IN1-10-6-2", "ST");
    fieldDataTypeMap.put("PD1-4-22-5", "ST");
    fieldDataTypeMap.put("IN1-10-6-3", "ID");
    fieldDataTypeMap.put("NK1-30-12-2", "ID");
    fieldDataTypeMap.put("NK1-30-12-1", "DTM");
    fieldDataTypeMap.put("PD1-4-22-8", "ST");
    fieldDataTypeMap.put("PD1-4-22-9", "ST");
    fieldDataTypeMap.put("PD1-4-22-3", "ID");
    fieldDataTypeMap.put("PD1-4-22-2", "ST");
    fieldDataTypeMap.put("PD1-4-22-1", "ST");
    fieldDataTypeMap.put("PV1-17-19-1", "DTM");
    fieldDataTypeMap.put("PV1-17-19-2", "ID");
    fieldDataTypeMap.put("IN1-16-1-5", "ST");
    fieldDataTypeMap.put("IN1-16-1-4", "ST");
    fieldDataTypeMap.put("IN1-16-1-3", "ST");
    fieldDataTypeMap.put("GT1-17-14-1", "DTM");
    fieldDataTypeMap.put("IN1-10-10", "CWE");
    fieldDataTypeMap.put("GT1-17-14-2", "ID");
    fieldDataTypeMap.put("PD1-10-6-1", "IS");
    fieldDataTypeMap.put("PD1-10-6-2", "ST");
    fieldDataTypeMap.put("PD1-10-6-3", "ID");
    fieldDataTypeMap.put("ORC-11-2-3", "ST");
    fieldDataTypeMap.put("ORC-11-2-4", "ST");
    fieldDataTypeMap.put("ORC-11-2-5", "ST");
    fieldDataTypeMap.put("IN1-16-1-1", "ST");
    fieldDataTypeMap.put("IN1-16-1-2", "ST");
    fieldDataTypeMap.put("ORC-11-2-1", "ST");
    fieldDataTypeMap.put("ORC-11-2-2", "ST");
    fieldDataTypeMap.put("IN1-30-2-1", "ST");
    fieldDataTypeMap.put("PID-18-9-3", "ID");
    fieldDataTypeMap.put("NK1-3-3", "ID");
    fieldDataTypeMap.put("IN1-30-2-5", "ST");
    fieldDataTypeMap.put("PID-18-9-2", "ST");
    fieldDataTypeMap.put("NK1-3-4", "ST");
    fieldDataTypeMap.put("IN1-30-2-4", "ST");
    fieldDataTypeMap.put("PID-18-9-1", "ST");
    fieldDataTypeMap.put("NK1-3-5", "ST");
    fieldDataTypeMap.put("IN1-30-2-3", "ST");
    fieldDataTypeMap.put("NK1-3-6", "ID");
    fieldDataTypeMap.put("IN1-30-2-2", "ST");
    fieldDataTypeMap.put("IN2-69-6-1", "IS");
    fieldDataTypeMap.put("PID-18-9-7", "ST");
    fieldDataTypeMap.put("ORC-12-20-1", "DTM");
    fieldDataTypeMap.put("IN2-69-6-2", "ST");
    fieldDataTypeMap.put("PID-18-9-6", "ID");
    fieldDataTypeMap.put("ORC-12-20-2", "ID");
    fieldDataTypeMap.put("IN2-69-6-3", "ID");
    fieldDataTypeMap.put("PID-18-9-5", "ST");
    fieldDataTypeMap.put("PID-18-9-4", "ST");
    fieldDataTypeMap.put("PID-18-9-8", "ST");
    fieldDataTypeMap.put("PID-18-9-9", "ST");
    fieldDataTypeMap.put("NK1-3-2", "ST");
    fieldDataTypeMap.put("NK1-3-1", "ST");
    fieldDataTypeMap.put("TQ2-4-2", "IS");
    fieldDataTypeMap.put("TQ2-4-1", "ST");
    fieldDataTypeMap.put("TQ2-4-4", "ID");
    fieldDataTypeMap.put("TQ2-4-3", "ST");
    fieldDataTypeMap.put("ORC-9", "TS");
    fieldDataTypeMap.put("IN3-17-1", "ST");
    fieldDataTypeMap.put("IN3-17-2", "ST");
    fieldDataTypeMap.put("IN3-17-3", "ID");
    fieldDataTypeMap.put("ORC-6", "ID");
    fieldDataTypeMap.put("IN3-17-4", "ST");
    fieldDataTypeMap.put("ORC-5", "ID");
    fieldDataTypeMap.put("IN3-17-5", "ST");
    fieldDataTypeMap.put("ORC-8", "EIP");
    fieldDataTypeMap.put("IN3-17-6", "ID");
    fieldDataTypeMap.put("ORC-7", "TQ");
    fieldDataTypeMap.put("ORC-2", "EI_IZ");
    fieldDataTypeMap.put("ORC-1", "ID");
    fieldDataTypeMap.put("ORC-4", "EI");
    fieldDataTypeMap.put("ORC-3", "EI_IZ");
    fieldDataTypeMap.put("ORC-0", "ST");
    fieldDataTypeMap.put("RXA-17-1", "ST");
    fieldDataTypeMap.put("RXA-17-2", "ST");
    fieldDataTypeMap.put("RXA-17-3", "ID");
    fieldDataTypeMap.put("RXA-17-4", "ST");
    fieldDataTypeMap.put("OBX-23-10", "ST");
    fieldDataTypeMap.put("ORC-30-1", "ST");
    fieldDataTypeMap.put("ORC-30-2", "ST");
    fieldDataTypeMap.put("ORC-30-6", "ID");
    fieldDataTypeMap.put("ORC-30-5", "ST");
    fieldDataTypeMap.put("ORC-30-4", "ST");
    fieldDataTypeMap.put("ORC-30-3", "ID");
    fieldDataTypeMap.put("ORC-30-9", "ST");
    fieldDataTypeMap.put("PV1-8-14-3", "ID");
    fieldDataTypeMap.put("ORC-30-8", "ST");
    fieldDataTypeMap.put("ORC-30-7", "ST");
    fieldDataTypeMap.put("PV1-8-14-1", "IS");
    fieldDataTypeMap.put("PV1-8-14-2", "ST");
    fieldDataTypeMap.put("RXA-17-6", "ID");
    fieldDataTypeMap.put("RXA-17-5", "ST");
    fieldDataTypeMap.put("PV1-19-4-1", "IS");
    fieldDataTypeMap.put("PV1-19-4-3", "ID");
    fieldDataTypeMap.put("PV1-19-4-2", "ST");
    fieldDataTypeMap.put("PID-11-1-2", "ST");
    fieldDataTypeMap.put("PID-11-1-1", "ST");
    fieldDataTypeMap.put("PID-11-1-3", "ST");
    fieldDataTypeMap.put("IN1-20", "IS");
    fieldDataTypeMap.put("PID-11-14-1", "DTM");
    fieldDataTypeMap.put("PID-11-14-2", "ID");
    fieldDataTypeMap.put("IN1-15", "IS");
    fieldDataTypeMap.put("IN1-14", "AUI");
    fieldDataTypeMap.put("IN1-17", "CE");
    fieldDataTypeMap.put("IN1-16", "XPN");
    fieldDataTypeMap.put("ORC-13-10", "EI");
    fieldDataTypeMap.put("IN1-11", "XON");
    fieldDataTypeMap.put("IN1-10", "CX");
    fieldDataTypeMap.put("IN1-13", "DT");
    fieldDataTypeMap.put("ORC-13-11", "HD");
    fieldDataTypeMap.put("IN1-12", "DT");
    fieldDataTypeMap.put("RXA-10-2-1", "ST");
    fieldDataTypeMap.put("RXA-10-2-2", "ST");
    fieldDataTypeMap.put("RXA-10-2-3", "ST");
    fieldDataTypeMap.put("IN1-3-10-2", "ST");
    fieldDataTypeMap.put("IN1-19", "XAD");
    fieldDataTypeMap.put("RXA-10-2-4", "ST");
    fieldDataTypeMap.put("IN1-3-10-1", "ST");
    fieldDataTypeMap.put("IN1-18", "TS");
    fieldDataTypeMap.put("RXA-10-2-5", "ST");
    fieldDataTypeMap.put("IN1-3-10-3", "ID");
    fieldDataTypeMap.put("IN1-3-10-4", "ST");
    fieldDataTypeMap.put("IN1-3-10-5", "ST");
    fieldDataTypeMap.put("IN1-3-10-6", "ID");
    fieldDataTypeMap.put("IN2-52-13-1", "DTM");
    fieldDataTypeMap.put("IN1-3-10-7", "ST");
    fieldDataTypeMap.put("IN2-52-13-2", "ID");
    fieldDataTypeMap.put("IN1-3-10-8", "ST");
    fieldDataTypeMap.put("IN1-3-10-9", "ST");
    fieldDataTypeMap.put("IN2-22-12-1", "DTM");
    fieldDataTypeMap.put("IN2-22-12-2", "ID");
    fieldDataTypeMap.put("GT1-29-9-5", "ST");
    fieldDataTypeMap.put("GT1-29-9-6", "ID");
    fieldDataTypeMap.put("GT1-29-9-7", "ST");
    fieldDataTypeMap.put("GT1-29-9-8", "ST");
    fieldDataTypeMap.put("GT1-29-9-1", "ST");
    fieldDataTypeMap.put("GT1-29-9-2", "ST");
    fieldDataTypeMap.put("GT1-29-9-3", "ID");
    fieldDataTypeMap.put("GT1-29-9-4", "ST");
    fieldDataTypeMap.put("GT1-29-9-9", "ST");
    fieldDataTypeMap.put("OBX-19-1", "DTM");
    fieldDataTypeMap.put("OBX-19-2", "ID");
    fieldDataTypeMap.put("ORC-19-19", "TS");
    fieldDataTypeMap.put("GT1-4-1-1", "ST");
    fieldDataTypeMap.put("ORC-19-22", "CWE");
    fieldDataTypeMap.put("GT1-4-1-4", "ST");
    fieldDataTypeMap.put("ORC-19-23", "CWE");
    fieldDataTypeMap.put("GT1-4-1-5", "ST");
    fieldDataTypeMap.put("GT1-4-1-2", "ST");
    fieldDataTypeMap.put("GT1-4-1-3", "ST");
    fieldDataTypeMap.put("ORC-22-13-1", "DTM");
    fieldDataTypeMap.put("ORC-19-20", "TS");
    fieldDataTypeMap.put("ORC-22-13-2", "ID");
    fieldDataTypeMap.put("ORC-19-21", "ST");
    fieldDataTypeMap.put("PV1-3-4", "HD");
    fieldDataTypeMap.put("PV1-3-5", "IS");
    fieldDataTypeMap.put("PV1-3-6", "IS");
    fieldDataTypeMap.put("PV1-3-7", "IS");
    fieldDataTypeMap.put("PV1-3-8", "IS");
    fieldDataTypeMap.put("PV1-3-9", "ST");
    fieldDataTypeMap.put("PV1-3-1", "IS");
    fieldDataTypeMap.put("PV1-3-2", "IS");
    fieldDataTypeMap.put("PV1-3-3", "IS");
    fieldDataTypeMap.put("ORC-19-17", "DR");
    fieldDataTypeMap.put("ORC-19-18", "ID");
    fieldDataTypeMap.put("ORC-19-15", "ID");
    fieldDataTypeMap.put("ORC-19-16", "CE");
    fieldDataTypeMap.put("ORC-19-13", "ID");
    fieldDataTypeMap.put("ORC-19-14", "HD");
    fieldDataTypeMap.put("ORC-19-11", "ST");
    fieldDataTypeMap.put("ORC-19-12", "ID");
    fieldDataTypeMap.put("ORC-19-10", "ID");
    fieldDataTypeMap.put("IN2-72-2", "ST");
    fieldDataTypeMap.put("IN2-72-3", "ID");
    fieldDataTypeMap.put("IN2-72-4", "ST");
    fieldDataTypeMap.put("IN2-72-5", "ST");
    fieldDataTypeMap.put("IN2-72-6", "ID");
    fieldDataTypeMap.put("PID-6-9-6", "ID");
    fieldDataTypeMap.put("PID-6-9-5", "ST");
    fieldDataTypeMap.put("PID-6-9-4", "ST");
    fieldDataTypeMap.put("PID-6-9-3", "ID");
    fieldDataTypeMap.put("PID-6-9-2", "ST");
    fieldDataTypeMap.put("PID-6-9-1", "ST");
    fieldDataTypeMap.put("IN2-61-10", "CWE");
    fieldDataTypeMap.put("NK1-30-10", "DR");
    fieldDataTypeMap.put("GT1-50-1", "IS");
    fieldDataTypeMap.put("NK1-30-11", "ID");
    fieldDataTypeMap.put("GT1-50-2", "IS");
    fieldDataTypeMap.put("GT1-50-3", "TX");
    fieldDataTypeMap.put("PV1-1", "SI");
    fieldDataTypeMap.put("PV1-0", "ST");
    fieldDataTypeMap.put("NK1-30-14", "ST");
    fieldDataTypeMap.put("NK1-30-12", "TS");
    fieldDataTypeMap.put("NK1-30-13", "TS");
    fieldDataTypeMap.put("PV1-8", "XCN");
    fieldDataTypeMap.put("PV1-9", "XCN");
    fieldDataTypeMap.put("PV1-6", "PL");
    fieldDataTypeMap.put("PV1-7", "XCN");
    fieldDataTypeMap.put("PV1-4", "IS");
    fieldDataTypeMap.put("OBX-12-1", "DTM");
    fieldDataTypeMap.put("PV1-5", "CX");
    fieldDataTypeMap.put("OBX-12-2", "ID");
    fieldDataTypeMap.put("PV1-2", "IS");
    fieldDataTypeMap.put("PV1-3", "PL");
    fieldDataTypeMap.put("IN2-72-1", "ST");
    fieldDataTypeMap.put("RXA-10-14-3", "ID");
    fieldDataTypeMap.put("RXA-10-14-2", "ST");
    fieldDataTypeMap.put("RXA-10-14-1", "IS");
    fieldDataTypeMap.put("IN2-71-1", "ST");
    fieldDataTypeMap.put("IN2-71-2", "ST");
    fieldDataTypeMap.put("IN3-16-11", "ST");
    fieldDataTypeMap.put("IN3-16-10", "ST");
    fieldDataTypeMap.put("IN3-16-12", "ST");
    fieldDataTypeMap.put("ORC-24-14", "TS");
    fieldDataTypeMap.put("ORC-24-13", "TS");
    fieldDataTypeMap.put("IN3-14-9-2", "ST");
    fieldDataTypeMap.put("IN3-14-9-1", "IS");
    fieldDataTypeMap.put("IN3-14-9-3", "ID");
    fieldDataTypeMap.put("ORC-23-8", "NM");
    fieldDataTypeMap.put("ORC-23-7", "NM");
    fieldDataTypeMap.put("ORC-23-9", "ST");
    fieldDataTypeMap.put("PID-5-9-6", "ID");
    fieldDataTypeMap.put("IN2-71-6", "ID");
    fieldDataTypeMap.put("PID-5-9-1", "ST");
    fieldDataTypeMap.put("IN2-71-5", "ST");
    fieldDataTypeMap.put("ORC-23-2", "ID");
    fieldDataTypeMap.put("IN2-71-4", "ST");
    fieldDataTypeMap.put("ORC-23-1", "ST");
    fieldDataTypeMap.put("IN2-71-3", "ID");
    fieldDataTypeMap.put("ORC-23-4", "ST");
    fieldDataTypeMap.put("PID-5-9-5", "ST");
    fieldDataTypeMap.put("ORC-23-3", "ID");
    fieldDataTypeMap.put("PID-5-9-4", "ST");
    fieldDataTypeMap.put("ORC-23-6", "NM");
    fieldDataTypeMap.put("PID-5-9-3", "ID");
    fieldDataTypeMap.put("ORC-23-5", "NM");
    fieldDataTypeMap.put("PID-5-9-2", "ST");
    fieldDataTypeMap.put("NK1-26-9-6", "ID");
    fieldDataTypeMap.put("NK1-26-9-4", "ST");
    fieldDataTypeMap.put("NK1-26-9-5", "ST");
    fieldDataTypeMap.put("IN2-40-1-5", "ST");
    fieldDataTypeMap.put("IN2-40-1-4", "ST");
    fieldDataTypeMap.put("IN2-40-1-3", "ST");
    fieldDataTypeMap.put("IN2-40-1-2", "ST");
    fieldDataTypeMap.put("IN2-40-1-1", "ST");
    fieldDataTypeMap.put("ORC-24-11", "ID");
    fieldDataTypeMap.put("ORC-24-12", "DR");
    fieldDataTypeMap.put("ORC-24-10", "IS");
    fieldDataTypeMap.put("PID-3-4-3", "ID");
    fieldDataTypeMap.put("PID-3-4-1", "IS");
    fieldDataTypeMap.put("PID-3-4-2", "ST");
    fieldDataTypeMap.put("NK1-26-9-3", "ID");
    fieldDataTypeMap.put("NK1-26-9-2", "ST");
    fieldDataTypeMap.put("NK1-26-9-1", "ST");
    fieldDataTypeMap.put("IN1-11-8-3", "ID");
    fieldDataTypeMap.put("IN1-11-8-1", "IS");
    fieldDataTypeMap.put("IN1-11-8-2", "ST");
    fieldDataTypeMap.put("NK1-33-6-1", "IS");
    fieldDataTypeMap.put("NK1-33-6-2", "ST");
    fieldDataTypeMap.put("PV1-7-19-2", "ID");
    fieldDataTypeMap.put("TQ1-2-2", "CE");
    fieldDataTypeMap.put("PV1-7-19-1", "DTM");
    fieldDataTypeMap.put("TQ1-2-1", "NM");
    fieldDataTypeMap.put("ORC-10-9-2", "ST");
    fieldDataTypeMap.put("NK1-33-6-3", "ID");
    fieldDataTypeMap.put("ORC-10-9-1", "IS");
    fieldDataTypeMap.put("ORC-10-9-3", "ID");
    fieldDataTypeMap.put("OBX-25-20-2", "ID");
    fieldDataTypeMap.put("IN1-11-7", "ID");
    fieldDataTypeMap.put("OBX-25-20-1", "DTM");
    fieldDataTypeMap.put("IN1-11-6", "HD");
    fieldDataTypeMap.put("IN1-11-5", "ID");
    fieldDataTypeMap.put("IN1-11-4", "NM");
    fieldDataTypeMap.put("IN1-11-9", "ID");
    fieldDataTypeMap.put("IN1-11-8", "HD");
    fieldDataTypeMap.put("ORC-24-14-2", "ID");
    fieldDataTypeMap.put("IN2-53-12", "ST");
    fieldDataTypeMap.put("ORC-24-14-1", "DTM");
    fieldDataTypeMap.put("IN1-11-3", "NM");
    fieldDataTypeMap.put("IN1-11-2", "IS");
    fieldDataTypeMap.put("IN1-11-1", "ST");
    fieldDataTypeMap.put("NK1-33-10-6", "ID");
    fieldDataTypeMap.put("NK1-31-8", "NM");
    fieldDataTypeMap.put("NK1-25-2", "ST");
    fieldDataTypeMap.put("NK1-33-10-7", "ST");
    fieldDataTypeMap.put("NK1-31-9", "ST");
    fieldDataTypeMap.put("NK1-25-1", "ST");
    fieldDataTypeMap.put("NK1-33-10-8", "ST");
    fieldDataTypeMap.put("NK1-31-6", "NM");
    fieldDataTypeMap.put("NK1-25-4", "ST");
    fieldDataTypeMap.put("RXA-5-1", "ST");
    fieldDataTypeMap.put("NK1-33-10-9", "ST");
    fieldDataTypeMap.put("NK1-31-7", "NM");
    fieldDataTypeMap.put("NK1-25-3", "ID");
    fieldDataTypeMap.put("IN2-70-6-3", "ID");
    fieldDataTypeMap.put("NK1-33-10-2", "ST");
    fieldDataTypeMap.put("NK1-25-6", "ID");
    fieldDataTypeMap.put("NK1-33-10-3", "ID");
    fieldDataTypeMap.put("NK1-25-5", "ST");
    fieldDataTypeMap.put("IN2-53-11", "ST");
    fieldDataTypeMap.put("NK1-33-10-4", "ST");
    fieldDataTypeMap.put("IN2-53-10", "ST");
    fieldDataTypeMap.put("NK1-33-10-5", "ST");
    fieldDataTypeMap.put("RXA-5-6", "ID");
    fieldDataTypeMap.put("IN2-70-6-1", "IS");
    fieldDataTypeMap.put("IN2-70-6-2", "ST");
    fieldDataTypeMap.put("NK1-33-10-1", "ST");
    fieldDataTypeMap.put("RXA-5-2", "ST");
    fieldDataTypeMap.put("RXA-5-3", "ID");
    fieldDataTypeMap.put("RXA-5-4", "ST");
    fieldDataTypeMap.put("RXA-5-5", "ST");
    fieldDataTypeMap.put("IN1-6-3", "ST");
    fieldDataTypeMap.put("IN1-6-2", "ST");
    fieldDataTypeMap.put("IN1-6-1", "FN");
    fieldDataTypeMap.put("IN1-6-7", "ID");
    fieldDataTypeMap.put("IN1-6-6", "IS");
    fieldDataTypeMap.put("IN1-6-5", "ST");
    fieldDataTypeMap.put("IN1-6-4", "ST");
    fieldDataTypeMap.put("NK1-31-1", "ST");
    fieldDataTypeMap.put("NK1-31-3", "ID");
    fieldDataTypeMap.put("NK1-31-2", "ID");
    fieldDataTypeMap.put("NK1-31-5", "NM");
    fieldDataTypeMap.put("NK1-31-4", "ST");
    fieldDataTypeMap.put("IN2-47-2", "IS");
    fieldDataTypeMap.put("IN2-47-3", "TX");
    fieldDataTypeMap.put("IN2-47-1", "IS");
    fieldDataTypeMap.put("PID-7-2", "ID");
    fieldDataTypeMap.put("PID-7-1", "DTM");
    fieldDataTypeMap.put("NK1-6-11", "ST");
    fieldDataTypeMap.put("NK1-6-12", "ST");
    fieldDataTypeMap.put("IN1-6-12-1", "DTM");
    fieldDataTypeMap.put("IN1-6-12-2", "ID");
    fieldDataTypeMap.put("IN2-40-9", "CE");
    fieldDataTypeMap.put("IN2-40-4", "ST");
    fieldDataTypeMap.put("IN2-40-3", "ST");
    fieldDataTypeMap.put("IN2-40-2", "ST");
    fieldDataTypeMap.put("IN2-40-1", "FN");
    fieldDataTypeMap.put("IN1-6-8", "ID");
    fieldDataTypeMap.put("IN2-40-8", "ID");
    fieldDataTypeMap.put("IN1-6-9", "CE");
    fieldDataTypeMap.put("IN2-1-4-3", "ID");
    fieldDataTypeMap.put("IN2-40-7", "ID");
    fieldDataTypeMap.put("NK1-6-10", "ST");
    fieldDataTypeMap.put("IN2-1-4-2", "ST");
    fieldDataTypeMap.put("IN2-40-6", "IS");
    fieldDataTypeMap.put("IN2-1-4-1", "IS");
    fieldDataTypeMap.put("IN2-40-5", "ST");
    fieldDataTypeMap.put("IN2-3-4", "ST");
    fieldDataTypeMap.put("IN2-3-5", "ST");
    fieldDataTypeMap.put("IN2-3-2", "FN");
    fieldDataTypeMap.put("NK1-13-10", "ST");
    fieldDataTypeMap.put("IN2-3-3", "ST");
    fieldDataTypeMap.put("IN2-3-8", "IS");
    fieldDataTypeMap.put("IN2-3-9", "HD");
    fieldDataTypeMap.put("IN2-3-6", "ST");
    fieldDataTypeMap.put("IN2-3-7", "IS");
    fieldDataTypeMap.put("TQ2-8-2-3", "ID");
    fieldDataTypeMap.put("ORC-11-16-2", "ST");
    fieldDataTypeMap.put("GT1-21-10", "ST");
    fieldDataTypeMap.put("TQ2-8-2-2", "ST");
    fieldDataTypeMap.put("ORC-11-16-3", "ID");
    fieldDataTypeMap.put("TQ2-8-2-1", "ST");
    fieldDataTypeMap.put("ORC-11-16-1", "ST");
    fieldDataTypeMap.put("ORC-11-16-6", "ID");
    fieldDataTypeMap.put("TQ2-8-2-6", "ID");
    fieldDataTypeMap.put("IN2-3-1", "ST");
    fieldDataTypeMap.put("TQ2-8-2-5", "ST");
    fieldDataTypeMap.put("ORC-11-16-4", "ST");
    fieldDataTypeMap.put("TQ2-8-2-4", "ST");
    fieldDataTypeMap.put("ORC-11-16-5", "ST");
    fieldDataTypeMap.put("PID-27-1", "ST");
    fieldDataTypeMap.put("PID-27-3", "ID");
    fieldDataTypeMap.put("PID-27-2", "ST");
    fieldDataTypeMap.put("PID-27-5", "ST");
    fieldDataTypeMap.put("PID-27-4", "ST");
    fieldDataTypeMap.put("PID-27-6", "ID");
    fieldDataTypeMap.put("PV1-6-4-3", "ID");
    fieldDataTypeMap.put("PV1-6-4-2", "ST");
    fieldDataTypeMap.put("PV1-43-2", "IS");
    fieldDataTypeMap.put("PV1-43-3", "IS");
    fieldDataTypeMap.put("PV1-6-4-1", "IS");
    fieldDataTypeMap.put("PV1-43-1", "IS");
    fieldDataTypeMap.put("OBX-16-16-3", "ID");
    fieldDataTypeMap.put("OBX-16-16-2", "ST");
    fieldDataTypeMap.put("OBX-16-16-1", "ST");
    fieldDataTypeMap.put("PV1-43-8", "IS");
    fieldDataTypeMap.put("GT1-8-2", "ID");
    fieldDataTypeMap.put("RXA-24-9", "ST");
    fieldDataTypeMap.put("PV1-43-9", "ST");
    fieldDataTypeMap.put("PV1-43-6", "IS");
    fieldDataTypeMap.put("PV1-37-2", "TS");
    fieldDataTypeMap.put("OBX-16-16-6", "ID");
    fieldDataTypeMap.put("PV1-43-7", "IS");
    fieldDataTypeMap.put("PV1-37-1", "IS");
    fieldDataTypeMap.put("GT1-8-1", "DTM");
    fieldDataTypeMap.put("OBX-16-16-5", "ST");
    fieldDataTypeMap.put("PV1-43-4", "HD");
    fieldDataTypeMap.put("OBX-16-16-4", "ST");
    fieldDataTypeMap.put("PV1-43-5", "IS");
    fieldDataTypeMap.put("ORC-11-23", "CWE");
    fieldDataTypeMap.put("ORC-11-22", "CWE");
    fieldDataTypeMap.put("NK1-12-6-2", "ST");
    fieldDataTypeMap.put("NK1-12-6-3", "ID");
    fieldDataTypeMap.put("ORC-11-20", "TS");
    fieldDataTypeMap.put("ORC-11-21", "ST");
    fieldDataTypeMap.put("NK1-12-6-1", "IS");
    fieldDataTypeMap.put("RXA-24-5", "ST");
    fieldDataTypeMap.put("IN3-3-20-2", "ID");
    fieldDataTypeMap.put("RXA-24-6", "ID");
    fieldDataTypeMap.put("RXA-24-7", "ST");
    fieldDataTypeMap.put("ORC-12-10", "ID");
    fieldDataTypeMap.put("RXA-24-8", "ST");
    fieldDataTypeMap.put("ORC-12-11", "ST");
    fieldDataTypeMap.put("RXA-24-1", "ST");
    fieldDataTypeMap.put("RXA-24-2", "ST");
    fieldDataTypeMap.put("ORC-11-19", "TS");
    fieldDataTypeMap.put("RXA-24-3", "ID");
    fieldDataTypeMap.put("RXA-24-4", "ST");
    fieldDataTypeMap.put("IN3-3-20-1", "DTM");
    fieldDataTypeMap.put("ORC-11-16", "CE");
    fieldDataTypeMap.put("ORC-11-15", "ID");
    fieldDataTypeMap.put("ORC-11-18", "ID");
    fieldDataTypeMap.put("ORC-11-17", "DR");
    fieldDataTypeMap.put("ORC-11-12", "ID");
    fieldDataTypeMap.put("ORC-11-11", "ST");
    fieldDataTypeMap.put("ORC-11-14", "HD");
    fieldDataTypeMap.put("ORC-11-13", "ID");
    fieldDataTypeMap.put("IN2-62-5", "ST");
    fieldDataTypeMap.put("ORC-11-10", "ID");
    fieldDataTypeMap.put("IN2-62-6", "ID");
    fieldDataTypeMap.put("IN2-62-1", "ST");
    fieldDataTypeMap.put("IN2-62-2", "ST");
    fieldDataTypeMap.put("IN2-62-3", "ID");
    fieldDataTypeMap.put("IN2-62-4", "ST");
    fieldDataTypeMap.put("PID-14-11", "ST");
    fieldDataTypeMap.put("PID-14-12", "ST");
    fieldDataTypeMap.put("PID-14-10", "ST");
    fieldDataTypeMap.put("OBX-25-14-1", "IS");
    fieldDataTypeMap.put("OBX-25-14-2", "ST");
    fieldDataTypeMap.put("OBX-25-14-3", "ID");
    fieldDataTypeMap.put("PID-34-1", "IS");
    fieldDataTypeMap.put("IN2-36-5", "ST");
    fieldDataTypeMap.put("IN2-36-4", "ST");
    fieldDataTypeMap.put("IN2-36-3", "ID");
    fieldDataTypeMap.put("IN2-36-2", "ST");
    fieldDataTypeMap.put("PV1-8-2-3", "ST");
    fieldDataTypeMap.put("PV1-8-2-2", "ST");
    fieldDataTypeMap.put("PV1-8-2-5", "ST");
    fieldDataTypeMap.put("PV1-8-2-4", "ST");
    fieldDataTypeMap.put("IN2-36-6", "ID");
    fieldDataTypeMap.put("IN2-36-1", "ST");
    fieldDataTypeMap.put("PID-34-3", "ID");
    fieldDataTypeMap.put("IN1-5-14-1", "DTM");
    fieldDataTypeMap.put("PID-34-2", "ST");
    fieldDataTypeMap.put("IN1-5-14-2", "ID");
    fieldDataTypeMap.put("PV1-11-11", "HD");
    fieldDataTypeMap.put("PV1-11-10", "EI");
    fieldDataTypeMap.put("ORC-8-2-1", "ST");
    fieldDataTypeMap.put("ORC-8-2-2", "IS");
    fieldDataTypeMap.put("ORC-8-2-3", "ST");
    fieldDataTypeMap.put("ORC-8-2-4", "ID");
    fieldDataTypeMap.put("ORC-15-2", "ID");
    fieldDataTypeMap.put("ORC-15-1", "DTM");
    fieldDataTypeMap.put("MSH-12-2-3", "ID");
    fieldDataTypeMap.put("MSH-12-2-2", "ST");
    fieldDataTypeMap.put("MSH-12-2-1", "ST");
    fieldDataTypeMap.put("IN3-14-20-2", "ID");
    fieldDataTypeMap.put("PV1-8-2-1", "ST");
    fieldDataTypeMap.put("IN3-14-20-1", "DTM");
    fieldDataTypeMap.put("MSH-12-2-6", "ID");
    fieldDataTypeMap.put("MSH-12-2-5", "ST");
    fieldDataTypeMap.put("MSH-12-2-4", "ST");
    fieldDataTypeMap.put("NK1-33-9-9", "ST");
    fieldDataTypeMap.put("NK1-33-9-8", "ST");
    fieldDataTypeMap.put("RXA-8-6", "ID");
    fieldDataTypeMap.put("RXA-8-5", "ST");
    fieldDataTypeMap.put("RXA-8-4", "ST");
    fieldDataTypeMap.put("IN2-61-4-3", "ID");
    fieldDataTypeMap.put("RXA-8-3", "ID");
    fieldDataTypeMap.put("RXA-8-2", "ST");
    fieldDataTypeMap.put("RXA-8-1", "ST");
    fieldDataTypeMap.put("ORC-17-1", "ST");
    fieldDataTypeMap.put("ORC-17-3", "ID");
    fieldDataTypeMap.put("ORC-17-2", "ST");
    fieldDataTypeMap.put("NK1-33-9-1", "ST");
    fieldDataTypeMap.put("ORC-17-5", "ST");
    fieldDataTypeMap.put("NK1-33-9-2", "ST");
    fieldDataTypeMap.put("ORC-17-4", "ST");
    fieldDataTypeMap.put("NK1-33-9-3", "ID");
    fieldDataTypeMap.put("IN2-61-4-1", "IS");
    fieldDataTypeMap.put("NK1-33-9-4", "ST");
    fieldDataTypeMap.put("ORC-17-6", "ID");
    fieldDataTypeMap.put("IN2-61-4-2", "ST");
    fieldDataTypeMap.put("NK1-33-9-5", "ST");
    fieldDataTypeMap.put("NK1-33-9-6", "ID");
    fieldDataTypeMap.put("NK1-33-9-7", "ST");
    fieldDataTypeMap.put("SFT-6-2", "ID");
    fieldDataTypeMap.put("SFT-6-1", "DTM");
    fieldDataTypeMap.put("ORC-19-20-2", "ID");
    fieldDataTypeMap.put("ORC-19-20-1", "DTM");
    fieldDataTypeMap.put("PV1-5-10", "CWE");
    fieldDataTypeMap.put("IN1-9-1", "ST");
    fieldDataTypeMap.put("IN1-9-2", "IS");
    fieldDataTypeMap.put("IN1-9-3", "NM");
    fieldDataTypeMap.put("IN1-9-4", "NM");
    fieldDataTypeMap.put("ORC-28-5", "ST");
    fieldDataTypeMap.put("IN3-25-1", "ST");
    fieldDataTypeMap.put("ORC-28-4", "ST");
    fieldDataTypeMap.put("IN3-25-2", "FN");
    fieldDataTypeMap.put("ORC-28-3", "ID");
    fieldDataTypeMap.put("ORC-28-2", "ST");
    fieldDataTypeMap.put("ORC-28-9", "ST");
    fieldDataTypeMap.put("ORC-28-8", "ST");
    fieldDataTypeMap.put("ORC-28-7", "ST");
    fieldDataTypeMap.put("ORC-28-6", "ID");
    fieldDataTypeMap.put("IN3-25-9", "HD");
    fieldDataTypeMap.put("IN3-25-7", "IS");
    fieldDataTypeMap.put("IN3-25-8", "IS");
    fieldDataTypeMap.put("ORC-28-1", "ST");
    fieldDataTypeMap.put("IN3-25-5", "ST");
    fieldDataTypeMap.put("IN3-25-6", "ST");
    fieldDataTypeMap.put("IN3-25-3", "ST");
    fieldDataTypeMap.put("IN3-25-4", "ST");
    fieldDataTypeMap.put("PV1-19-9", "CWE");
    fieldDataTypeMap.put("PV1-19-7", "DT");
    fieldDataTypeMap.put("ORC-20-1", "ST");
    fieldDataTypeMap.put("PV1-19-8", "DT");
    fieldDataTypeMap.put("PV2-9", "TS");
    fieldDataTypeMap.put("PV1-19-5", "ID");
    fieldDataTypeMap.put("GT1-51-8", "HD");
    fieldDataTypeMap.put("PV1-19-6", "HD");
    fieldDataTypeMap.put("GT1-51-9", "ID");
    fieldDataTypeMap.put("PV1-19-3", "ID");
    fieldDataTypeMap.put("PV1-19-4", "HD");
    fieldDataTypeMap.put("PV2-4", "CE");
    fieldDataTypeMap.put("PV2-3", "CE");
    fieldDataTypeMap.put("PV2-2", "CE");
    fieldDataTypeMap.put("PV2-1", "PL");
    fieldDataTypeMap.put("IN3-2-6-2", "ST");
    fieldDataTypeMap.put("PV2-8", "TS");
    fieldDataTypeMap.put("IN3-2-6-1", "IS");
    fieldDataTypeMap.put("PV2-7", "IS");
    fieldDataTypeMap.put("PV2-6", "ST");
    fieldDataTypeMap.put("IN3-2-6-3", "ID");
    fieldDataTypeMap.put("PV2-5", "ST");
    fieldDataTypeMap.put("NK1-12-10-7", "ST");
    fieldDataTypeMap.put("PV2-41-5", "ST");
    fieldDataTypeMap.put("NK1-12-10-8", "ST");
    fieldDataTypeMap.put("PV2-41-6", "ID");
    fieldDataTypeMap.put("NK1-12-10-9", "ST");
    fieldDataTypeMap.put("PV2-41-3", "ID");
    fieldDataTypeMap.put("PV2-41-4", "ST");
    fieldDataTypeMap.put("NK1-12-10-3", "ID");
    fieldDataTypeMap.put("PV2-41-1", "ST");
    fieldDataTypeMap.put("PV2-0", "ST");
    fieldDataTypeMap.put("NK1-12-10-4", "ST");
    fieldDataTypeMap.put("PV2-41-2", "ST");
    fieldDataTypeMap.put("NK1-12-10-5", "ST");
    fieldDataTypeMap.put("NK1-12-10-6", "ID");
    fieldDataTypeMap.put("TQ1-2-2-5", "ST");
    fieldDataTypeMap.put("PV1-19-2", "ST");
    fieldDataTypeMap.put("GT1-51-5", "ID");
    fieldDataTypeMap.put("TQ1-2-2-6", "ID");
    fieldDataTypeMap.put("ORC-20-6", "ID");
    fieldDataTypeMap.put("PV1-19-1", "ST");
    fieldDataTypeMap.put("GT1-51-4", "NM");
    fieldDataTypeMap.put("TQ1-2-2-3", "ID");
    fieldDataTypeMap.put("NK1-12-10-1", "ST");
    fieldDataTypeMap.put("GT1-51-7", "ID");
    fieldDataTypeMap.put("TQ1-2-2-4", "ST");
    fieldDataTypeMap.put("NK1-12-10-2", "ST");
    fieldDataTypeMap.put("GT1-51-6", "HD");
    fieldDataTypeMap.put("TQ1-2-2-1", "ST");
    fieldDataTypeMap.put("ORC-20-3", "ID");
    fieldDataTypeMap.put("GT1-51-1", "ST");
    fieldDataTypeMap.put("TQ1-2-2-2", "ST");
    fieldDataTypeMap.put("ORC-20-2", "ST");
    fieldDataTypeMap.put("ORC-20-5", "ST");
    fieldDataTypeMap.put("GT1-51-3", "NM");
    fieldDataTypeMap.put("ORC-20-4", "ST");
    fieldDataTypeMap.put("GT1-51-2", "IS");
    fieldDataTypeMap.put("PD1-4-16-4", "ST");
    fieldDataTypeMap.put("PD1-4-16-3", "ID");
    fieldDataTypeMap.put("PD1-4-16-6", "ID");
    fieldDataTypeMap.put("PD1-4-16-5", "ST");
    fieldDataTypeMap.put("PD1-4-16-2", "ST");
    fieldDataTypeMap.put("PD1-4-16-1", "ST");
    fieldDataTypeMap.put("ORC-13-11-3", "ID");
    fieldDataTypeMap.put("ORC-13-11-2", "ST");
    fieldDataTypeMap.put("ORC-13-11-1", "IS");
    fieldDataTypeMap.put("PV1-52-23", "CWE");
    fieldDataTypeMap.put("PV1-52-22", "CWE");
    fieldDataTypeMap.put("PV1-52-21", "ST");
    fieldDataTypeMap.put("PV1-52-20", "TS");
    fieldDataTypeMap.put("PID-3-6-3", "ID");
    fieldDataTypeMap.put("PV2-1-10-2", "IS");
    fieldDataTypeMap.put("PV2-1-10-1", "ST");
    fieldDataTypeMap.put("PV2-1-10-4", "ID");
    fieldDataTypeMap.put("PV2-1-10-3", "ST");
    fieldDataTypeMap.put("RXR-1-3", "ID");
    fieldDataTypeMap.put("RXR-1-4", "ST");
    fieldDataTypeMap.put("RXR-1-1", "ST");
    fieldDataTypeMap.put("RXR-1-2", "ST");
    fieldDataTypeMap.put("RXR-1-5", "ST");
    fieldDataTypeMap.put("RXR-1-6", "ID");
    fieldDataTypeMap.put("GT1-18-2", "ID");
    fieldDataTypeMap.put("GT1-18-1", "ST");
    fieldDataTypeMap.put("GT1-18-4", "ST");
    fieldDataTypeMap.put("GT1-18-3", "ID");
    fieldDataTypeMap.put("GT1-18-9", "ST");
    fieldDataTypeMap.put("MSH-12-2", "CE");
    fieldDataTypeMap.put("GT1-18-6", "NM");
    fieldDataTypeMap.put("TQ1-9", "CWE");
    fieldDataTypeMap.put("MSH-12-1", "ID");
    fieldDataTypeMap.put("GT1-18-5", "NM");
    fieldDataTypeMap.put("GT1-18-8", "NM");
    fieldDataTypeMap.put("MSH-12-3", "CE");
    fieldDataTypeMap.put("GT1-18-7", "NM");
    fieldDataTypeMap.put("PV2-48-1", "DTM");
    fieldDataTypeMap.put("PV2-48-2", "ID");
    fieldDataTypeMap.put("PID-3-6-1", "IS");
    fieldDataTypeMap.put("PID-3-6-2", "ST");
    fieldDataTypeMap.put("TQ1-6-2-4", "ST");
    fieldDataTypeMap.put("IN2-25-10-3", "ID");
    fieldDataTypeMap.put("TQ1-6-2-3", "ID");
    fieldDataTypeMap.put("IN2-25-10-2", "ST");
    fieldDataTypeMap.put("TQ1-6-2-6", "ID");
    fieldDataTypeMap.put("IN2-25-10-1", "ST");
    fieldDataTypeMap.put("TQ1-6-2-5", "ST");
    fieldDataTypeMap.put("TQ1-6-2-2", "ST");
    fieldDataTypeMap.put("TQ1-6-2-1", "ST");
    fieldDataTypeMap.put("IN2-22-13-2", "ID");
    fieldDataTypeMap.put("IN2-22-13-1", "DTM");
    fieldDataTypeMap.put("IN2-25-10-6", "ID");
    fieldDataTypeMap.put("IN2-25-10-7", "ST");
    fieldDataTypeMap.put("IN2-25-10-4", "ST");
    fieldDataTypeMap.put("IN2-25-10-5", "ST");
    fieldDataTypeMap.put("IN2-25-10-8", "ST");
    fieldDataTypeMap.put("IN2-25-10-9", "ST");
    fieldDataTypeMap.put("IN1-49-1", "ST");
    fieldDataTypeMap.put("IN1-49-2", "ST");
    fieldDataTypeMap.put("IN1-49-5", "ID");
    fieldDataTypeMap.put("IN1-49-6", "HD");
    fieldDataTypeMap.put("IN1-49-3", "ID");
    fieldDataTypeMap.put("IN1-49-4", "HD");
    fieldDataTypeMap.put("PD1-14-2", "IS");
    fieldDataTypeMap.put("PD1-14-3", "NM");
    fieldDataTypeMap.put("PD1-14-4", "NM");
    fieldDataTypeMap.put("PD1-14-5", "ID");
    fieldDataTypeMap.put("PD1-14-6", "HD");
    fieldDataTypeMap.put("SFT-6", "TS");
    fieldDataTypeMap.put("PD1-14-7", "ID");
    fieldDataTypeMap.put("SFT-5", "TX");
    fieldDataTypeMap.put("PD1-14-8", "HD");
    fieldDataTypeMap.put("SFT-4", "ST");
    fieldDataTypeMap.put("PD1-14-9", "ID");
    fieldDataTypeMap.put("SFT-3", "ST");
    fieldDataTypeMap.put("SFT-2", "ST");
    fieldDataTypeMap.put("IN1-49-9", "CWE");
    fieldDataTypeMap.put("SFT-1", "XON");
    fieldDataTypeMap.put("IN1-49-8", "DT");
    fieldDataTypeMap.put("SFT-0", "ST");
    fieldDataTypeMap.put("IN1-49-7", "DT");
    fieldDataTypeMap.put("PD1-14-1", "ST");
    fieldDataTypeMap.put("PID-38", "CE");
    fieldDataTypeMap.put("PID-37", "ST");
    fieldDataTypeMap.put("PID-36", "CE");
    fieldDataTypeMap.put("PID-35", "CE");
    fieldDataTypeMap.put("PID-34", "HD");
    fieldDataTypeMap.put("PID-33", "TS");
    fieldDataTypeMap.put("PID-32", "IS");
    fieldDataTypeMap.put("PID-31", "ID");
    fieldDataTypeMap.put("PID-39", "CWE");
    fieldDataTypeMap.put("PD1-9", "ID");
    fieldDataTypeMap.put("PD1-8", "IS");
    fieldDataTypeMap.put("PD1-1", "IS");
    fieldDataTypeMap.put("PD1-0", "ST");
    fieldDataTypeMap.put("PD1-3", "XON");
    fieldDataTypeMap.put("PD1-2", "IS");
    fieldDataTypeMap.put("PD1-5", "IS");
    fieldDataTypeMap.put("PD1-4", "XCN");
    fieldDataTypeMap.put("PD1-7", "IS");
    fieldDataTypeMap.put("PD1-6", "IS");
    fieldDataTypeMap.put("PV1-44-1", "DTM");
    fieldDataTypeMap.put("PV1-44-2", "ID");
    fieldDataTypeMap.put("PV1-11-4-2", "ST");
    fieldDataTypeMap.put("PV1-11-4-3", "ID");
    fieldDataTypeMap.put("PV1-11-4-1", "IS");
    fieldDataTypeMap.put("IN3-14-14-3", "ID");
    fieldDataTypeMap.put("IN3-14-14-2", "ST");
    fieldDataTypeMap.put("IN3-14-14-1", "IS");
    fieldDataTypeMap.put("PD1-3-4", "NM");
    fieldDataTypeMap.put("IN1-30-5", "ST");
    fieldDataTypeMap.put("IN1-30-14-2", "ST");
    fieldDataTypeMap.put("PD1-3-5", "ID");
    fieldDataTypeMap.put("GT1-26-6", "ID");
    fieldDataTypeMap.put("IN1-30-6", "ST");
    fieldDataTypeMap.put("IN1-30-14-1", "IS");
    fieldDataTypeMap.put("PD1-3-2", "IS");
    fieldDataTypeMap.put("GT1-26-5", "ST");
    fieldDataTypeMap.put("IN1-30-3", "ST");
    fieldDataTypeMap.put("ORC-19-14-1", "IS");
    fieldDataTypeMap.put("PD1-3-3", "NM");
    fieldDataTypeMap.put("GT1-26-4", "ST");
    fieldDataTypeMap.put("IN1-30-4", "ST");
    fieldDataTypeMap.put("PD1-3-8", "HD");
    fieldDataTypeMap.put("GT1-26-3", "ID");
    fieldDataTypeMap.put("IN1-30-1", "ST");
    fieldDataTypeMap.put("PD1-3-9", "ID");
    fieldDataTypeMap.put("GT1-26-2", "ST");
    fieldDataTypeMap.put("IN1-30-2", "FN");
    fieldDataTypeMap.put("PD1-3-6", "HD");
    fieldDataTypeMap.put("GT1-26-1", "ST");
    fieldDataTypeMap.put("PD1-3-7", "ID");
    fieldDataTypeMap.put("IN1-30-9", "HD");
    fieldDataTypeMap.put("PD1-3-1", "ST");
    fieldDataTypeMap.put("IN1-30-7", "IS");
    fieldDataTypeMap.put("IN1-30-8", "IS");
    fieldDataTypeMap.put("IN1-30-14-3", "ID");
    fieldDataTypeMap.put("NK1-12-8", "DT");
    fieldDataTypeMap.put("NK1-12-7", "DT");
    fieldDataTypeMap.put("NK1-12-9", "CWE");
    fieldDataTypeMap.put("PV1-43-10-1", "ST");
    fieldDataTypeMap.put("NK1-12-4", "HD");
    fieldDataTypeMap.put("NK1-12-3", "ID");
    fieldDataTypeMap.put("NK1-12-6", "HD");
    fieldDataTypeMap.put("NK1-12-5", "ID");
    fieldDataTypeMap.put("PV1-43-10-4", "ID");
    fieldDataTypeMap.put("PV1-43-10-2", "IS");
    fieldDataTypeMap.put("PV1-43-10-3", "ST");
    fieldDataTypeMap.put("IN2-3-20-2", "ID");
    fieldDataTypeMap.put("IN2-3-20-1", "DTM");
    fieldDataTypeMap.put("ORC-10-5", "ST");
    fieldDataTypeMap.put("PV1-19-10-5", "ST");
    fieldDataTypeMap.put("ORC-10-6", "ST");
    fieldDataTypeMap.put("PV1-19-10-6", "ID");
    fieldDataTypeMap.put("ORC-10-7", "IS");
    fieldDataTypeMap.put("PV1-19-10-3", "ID");
    fieldDataTypeMap.put("ORC-10-8", "IS");
    fieldDataTypeMap.put("PV1-19-10-4", "ST");
    fieldDataTypeMap.put("ORC-10-1", "ST");
    fieldDataTypeMap.put("PV1-19-10-9", "ST");
    fieldDataTypeMap.put("ORC-10-2", "FN_IZ");
    fieldDataTypeMap.put("ORC-10-3", "ST");
    fieldDataTypeMap.put("PV1-19-10-7", "ST");
    fieldDataTypeMap.put("ORC-10-4", "ST");
    fieldDataTypeMap.put("PV1-19-10-8", "ST");
    fieldDataTypeMap.put("IN2-9-13-2", "ID");
    fieldDataTypeMap.put("IN2-9-13-1", "DTM");
    fieldDataTypeMap.put("ORC-10-9", "HD_IZ_0363");
    fieldDataTypeMap.put("PV1-19-10-1", "ST");
    fieldDataTypeMap.put("PV1-19-10-2", "ST");
    fieldDataTypeMap.put("NK1-12-1", "ST");
    fieldDataTypeMap.put("NK1-12-2", "ST");
    fieldDataTypeMap.put("TQ2-3-3", "ST");
    fieldDataTypeMap.put("TQ2-3-2", "IS");
    fieldDataTypeMap.put("TQ2-3-4", "ID");
    fieldDataTypeMap.put("NK1-22-1", "ST");
    fieldDataTypeMap.put("NK1-22-2", "ST");
    fieldDataTypeMap.put("NK1-22-3", "ID");
    fieldDataTypeMap.put("NK1-19-6", "ID");
    fieldDataTypeMap.put("NK1-19-5", "ST");
    fieldDataTypeMap.put("NK1-19-4", "ST");
    fieldDataTypeMap.put("TQ2-3-1", "ST");
    fieldDataTypeMap.put("NK1-19-3", "ID");
    fieldDataTypeMap.put("NK1-19-2", "ST");
    fieldDataTypeMap.put("NK1-19-1", "ST");
    fieldDataTypeMap.put("GT1-45-14", "ST");
    fieldDataTypeMap.put("GT1-45-13", "TS");
    fieldDataTypeMap.put("GT1-45-12", "TS");
    fieldDataTypeMap.put("GT1-45-11", "ID");
    fieldDataTypeMap.put("GT1-45-10", "DR");
    fieldDataTypeMap.put("PV1-52-9-1", "IS");
    fieldDataTypeMap.put("ORC-19-14-2", "ST");
    fieldDataTypeMap.put("ORC-19-14-3", "ID");
    fieldDataTypeMap.put("GT1-18-12", "ST");
    fieldDataTypeMap.put("PV1-52-9-3", "ID");
    fieldDataTypeMap.put("GT1-18-11", "ST");
    fieldDataTypeMap.put("PV1-52-9-2", "ST");
    fieldDataTypeMap.put("GT1-18-10", "ST");
    fieldDataTypeMap.put("ORC-31-9", "ST");
    fieldDataTypeMap.put("ORC-31-8", "ST");
    fieldDataTypeMap.put("ORC-31-7", "ST");
    fieldDataTypeMap.put("ORC-31-6", "ID");
    fieldDataTypeMap.put("ORC-31-5", "ST");
    fieldDataTypeMap.put("IN2-52-8", "ID");
    fieldDataTypeMap.put("ORC-31-4", "ST");
    fieldDataTypeMap.put("IN2-52-9", "CE");
    fieldDataTypeMap.put("ORC-31-3", "ID");
    fieldDataTypeMap.put("ORC-31-2", "ST");
    fieldDataTypeMap.put("IN2-52-4", "ST");
    fieldDataTypeMap.put("IN2-52-5", "ST");
    fieldDataTypeMap.put("IN2-52-6", "IS");
    fieldDataTypeMap.put("IN2-52-7", "ID");
    fieldDataTypeMap.put("GT1-24-1", "DTM");
    fieldDataTypeMap.put("IN2-52-1", "FN");
    fieldDataTypeMap.put("IN2-52-2", "ST");
    fieldDataTypeMap.put("IN2-52-3", "ST");
    fieldDataTypeMap.put("GT1-24-2", "ID");
    fieldDataTypeMap.put("GT1-16-13-2", "ID");
    fieldDataTypeMap.put("IN1-4-6-1", "IS");
    fieldDataTypeMap.put("ORC-31-1", "ST");
    fieldDataTypeMap.put("IN1-4-6-2", "ST");
    fieldDataTypeMap.put("IN1-4-6-3", "ID");
    fieldDataTypeMap.put("GT1-16-13-1", "DTM");
    fieldDataTypeMap.put("GT1-21-8-3", "ID");
    fieldDataTypeMap.put("GT1-21-8-2", "ST");
    fieldDataTypeMap.put("GT1-21-8-1", "IS");
    fieldDataTypeMap.put("GT1-16-1-5", "ST");
    fieldDataTypeMap.put("GT1-16-1-3", "ST");
    fieldDataTypeMap.put("GT1-16-1-4", "ST");
    fieldDataTypeMap.put("GT1-16-1-1", "ST");
    fieldDataTypeMap.put("GT1-16-1-2", "ST");
    fieldDataTypeMap.put("IN2-9-2", "ST");
    fieldDataTypeMap.put("IN2-9-3", "ST");
    fieldDataTypeMap.put("IN2-9-1", "FN");
    fieldDataTypeMap.put("PV2-33-1", "DTM");
    fieldDataTypeMap.put("PV2-23-10", "ST");
    fieldDataTypeMap.put("PV2-33-2", "ID");
    fieldDataTypeMap.put("PV1-43-4-3", "ID");
    fieldDataTypeMap.put("PV1-43-4-1", "IS");
    fieldDataTypeMap.put("PV1-43-4-2", "ST");
    fieldDataTypeMap.put("IN3-25-20-2", "ID");
    fieldDataTypeMap.put("IN3-19-7", "NM");
    fieldDataTypeMap.put("IN3-19-6", "NM");
    fieldDataTypeMap.put("IN3-19-9", "ST");
    fieldDataTypeMap.put("IN3-25-20-1", "DTM");
    fieldDataTypeMap.put("IN3-19-8", "NM");
    fieldDataTypeMap.put("PV2-13-20-1", "DTM");
    fieldDataTypeMap.put("PV2-13-20-2", "ID");
    fieldDataTypeMap.put("IN3-19-2", "ID");
    fieldDataTypeMap.put("IN3-19-3", "ID");
    fieldDataTypeMap.put("IN3-19-4", "ST");
    fieldDataTypeMap.put("GT1-4-9-6", "ID");
    fieldDataTypeMap.put("IN3-19-5", "NM");
    fieldDataTypeMap.put("IN3-19-1", "ST");
    fieldDataTypeMap.put("GT1-4-9-1", "ST");
    fieldDataTypeMap.put("GT1-4-9-3", "ID");
    fieldDataTypeMap.put("GT1-4-9-2", "ST");
    fieldDataTypeMap.put("GT1-4-9-5", "ST");
    fieldDataTypeMap.put("GT1-4-9-4", "ST");
    fieldDataTypeMap.put("MSH-5-3", "ID");
    fieldDataTypeMap.put("PID-35-3", "ID");
    fieldDataTypeMap.put("PID-35-4", "ST");
    fieldDataTypeMap.put("PID-35-1", "ST");
    fieldDataTypeMap.put("PID-35-2", "ST");
    fieldDataTypeMap.put("PID-35-5", "ST");
    fieldDataTypeMap.put("MSH-5-1", "IS");
    fieldDataTypeMap.put("PID-35-6", "ID");
    fieldDataTypeMap.put("MSH-5-2", "ST");
    fieldDataTypeMap.put("IN3-2-1", "ST");
    fieldDataTypeMap.put("IN3-2-8", "DT");
    fieldDataTypeMap.put("IN3-2-9", "CWE");
    fieldDataTypeMap.put("IN3-2-6", "HD");
    fieldDataTypeMap.put("IN3-2-7", "DT");
    fieldDataTypeMap.put("IN3-2-4", "HD");
    fieldDataTypeMap.put("IN3-2-5", "ID");
    fieldDataTypeMap.put("IN3-2-2", "ST");
    fieldDataTypeMap.put("IN3-2-3", "ID");
    fieldDataTypeMap.put("IN2-3-14-1", "IS");
    fieldDataTypeMap.put("IN2-3-14-2", "ST");
    fieldDataTypeMap.put("IN2-3-14-3", "ID");
    fieldDataTypeMap.put("PID-11-14", "TS");
    fieldDataTypeMap.put("PID-11-13", "TS");
    fieldDataTypeMap.put("PID-11-12", "DR");
    fieldDataTypeMap.put("PID-11-11", "ID");
    fieldDataTypeMap.put("PID-11-10", "IS");
    fieldDataTypeMap.put("GT1-5-1-2", "ST");
    fieldDataTypeMap.put("ORC-10-20-2", "ID");
    fieldDataTypeMap.put("GT1-5-1-1", "ST");
    fieldDataTypeMap.put("GT1-5-1-3", "ST");
    fieldDataTypeMap.put("ORC-10-20-1", "DTM");
    fieldDataTypeMap.put("OBX-16-21", "ST");
    fieldDataTypeMap.put("IN3-25-23", "CWE");
    fieldDataTypeMap.put("PID-30", "ID");
    fieldDataTypeMap.put("OBX-16-20", "TS");
    fieldDataTypeMap.put("IN3-25-20", "TS");
    fieldDataTypeMap.put("IN3-25-21", "ST");
    fieldDataTypeMap.put("IN3-25-22", "CWE");
    fieldDataTypeMap.put("PD1-4-2", "FN");
    fieldDataTypeMap.put("PD1-4-1", "ST");
    fieldDataTypeMap.put("PD1-4-4", "ST");
    fieldDataTypeMap.put("IN2-26-9", "CWE");
    fieldDataTypeMap.put("PD1-4-3", "ST");
    fieldDataTypeMap.put("PD1-4-6", "ST");
    fieldDataTypeMap.put("PD1-4-5", "ST");
    fieldDataTypeMap.put("PD1-4-8", "IS");
    fieldDataTypeMap.put("PD1-4-7", "IS");
    fieldDataTypeMap.put("PD1-4-9", "HD");
    fieldDataTypeMap.put("IN2-26-4", "HD");
    fieldDataTypeMap.put("IN2-26-3", "ID");
    fieldDataTypeMap.put("IN2-26-2", "ST");
    fieldDataTypeMap.put("IN2-26-1", "ST");
    fieldDataTypeMap.put("IN3-25-16-4", "ST");
    fieldDataTypeMap.put("PV2-2-5", "ST");
    fieldDataTypeMap.put("IN2-26-8", "DT");
    fieldDataTypeMap.put("IN3-25-16-3", "ID");
    fieldDataTypeMap.put("PV2-2-4", "ST");
    fieldDataTypeMap.put("IN2-26-7", "DT");
    fieldDataTypeMap.put("OBX-16-19", "TS");
    fieldDataTypeMap.put("IN3-25-16-2", "ST");
    fieldDataTypeMap.put("PID-28", "CE");
    fieldDataTypeMap.put("IN2-26-6", "HD");
    fieldDataTypeMap.put("IN3-25-16-1", "ST");
    fieldDataTypeMap.put("PV2-2-6", "ID");
    fieldDataTypeMap.put("PID-29", "TS_IZ");
    fieldDataTypeMap.put("IN2-26-5", "ID");
    fieldDataTypeMap.put("OBX-16-17", "DR");
    fieldDataTypeMap.put("PV2-2-1", "ST");
    fieldDataTypeMap.put("PID-26", "CE");
    fieldDataTypeMap.put("IN2-9-8", "ID");
    fieldDataTypeMap.put("OBX-16-18", "ID");
    fieldDataTypeMap.put("PID-27", "CE");
    populateFieldDataTypes2();
  }

  public void populateFieldDataTypes2() {
    fieldDataTypeMap.put("IN2-9-9", "CE");
    fieldDataTypeMap.put("OBX-16-15", "ID");
    fieldDataTypeMap.put("IN3-25-16-6", "ID");
    fieldDataTypeMap.put("PV2-2-3", "ID");
    fieldDataTypeMap.put("PID-24", "ID");
    fieldDataTypeMap.put("OBX-16-16", "CE");
    fieldDataTypeMap.put("IN3-25-16-5", "ST");
    fieldDataTypeMap.put("PV2-2-2", "ST");
    fieldDataTypeMap.put("PID-25", "NM");
    fieldDataTypeMap.put("OBX-16-13", "ID");
    fieldDataTypeMap.put("PID-22", "CE_IZ");
    fieldDataTypeMap.put("IN2-9-4", "ST");
    fieldDataTypeMap.put("OBX-16-14", "HD");
    fieldDataTypeMap.put("PID-23", "ST");
    fieldDataTypeMap.put("IN2-9-5", "ST");
    fieldDataTypeMap.put("OBX-16-11", "ST");
    fieldDataTypeMap.put("PID-20", "DLN");
    fieldDataTypeMap.put("IN2-9-6", "IS");
    fieldDataTypeMap.put("OBX-16-12", "ID");
    fieldDataTypeMap.put("PID-21", "CX");
    fieldDataTypeMap.put("IN2-9-7", "ID");
    fieldDataTypeMap.put("IN3-25-14", "HD");
    fieldDataTypeMap.put("IN3-25-15", "ID");
    fieldDataTypeMap.put("OBX-16-10", "ID");
    fieldDataTypeMap.put("IN3-25-12", "ID");
    fieldDataTypeMap.put("IN3-25-13", "ID");
    fieldDataTypeMap.put("IN3-25-10", "ID");
    fieldDataTypeMap.put("IN3-25-11", "ST");
    fieldDataTypeMap.put("PID-6-9", "CE");
    fieldDataTypeMap.put("OBX-23-5", "ID");
    fieldDataTypeMap.put("OBX-23-4", "NM");
    fieldDataTypeMap.put("OBX-23-7", "ID");
    fieldDataTypeMap.put("OBX-23-6", "HD");
    fieldDataTypeMap.put("OBX-23-9", "ID");
    fieldDataTypeMap.put("OBX-23-8", "HD");
    fieldDataTypeMap.put("PID-17", "CE");
    fieldDataTypeMap.put("OBX-23-1", "ST");
    fieldDataTypeMap.put("PID-18", "CX");
    fieldDataTypeMap.put("OBX-23-2", "IS");
    fieldDataTypeMap.put("PID-19", "ST");
    fieldDataTypeMap.put("OBX-23-3", "NM");
    fieldDataTypeMap.put("PID-13", "XTN_IZ");
    fieldDataTypeMap.put("PID-14", "XTN");
    fieldDataTypeMap.put("PID-15", "CE");
    fieldDataTypeMap.put("PID-16", "CE");
    fieldDataTypeMap.put("IN3-25-19", "TS");
    fieldDataTypeMap.put("IN3-25-18", "ID");
    fieldDataTypeMap.put("PID-10", "CE_IZ");
    fieldDataTypeMap.put("IN3-25-17", "DR");
    fieldDataTypeMap.put("PID-11", "XAD_IZ");
    fieldDataTypeMap.put("IN3-25-16", "CE");
    fieldDataTypeMap.put("PID-12", "IS");
    fieldDataTypeMap.put("PID-6-4", "ST");
    fieldDataTypeMap.put("IN2-0", "ST");
    fieldDataTypeMap.put("PID-6-3", "ST");
    fieldDataTypeMap.put("IN2-1", "CX");
    fieldDataTypeMap.put("PID-6-2", "ST");
    fieldDataTypeMap.put("IN2-2", "ST");
    fieldDataTypeMap.put("PID-6-1", "FN_IZ");
    fieldDataTypeMap.put("IN2-3", "XCN");
    fieldDataTypeMap.put("PID-6-8", "ID");
    fieldDataTypeMap.put("IN2-4", "IS");
    fieldDataTypeMap.put("OBX-14-2", "ID");
    fieldDataTypeMap.put("PID-6-7", "ID");
    fieldDataTypeMap.put("IN2-5", "IS");
    fieldDataTypeMap.put("PID-6-6", "IS");
    fieldDataTypeMap.put("IN2-6", "ST");
    fieldDataTypeMap.put("PID-6-5", "ST");
    fieldDataTypeMap.put("IN2-7", "XPN");
    fieldDataTypeMap.put("PV1-17-22-6", "ID");
    fieldDataTypeMap.put("PV1-17-16-2", "ST");
    fieldDataTypeMap.put("IN2-8", "ST");
    fieldDataTypeMap.put("PV1-17-22-7", "ST");
    fieldDataTypeMap.put("PV1-17-16-1", "ST");
    fieldDataTypeMap.put("IN2-9", "XPN");
    fieldDataTypeMap.put("PV1-17-22-4", "ST");
    fieldDataTypeMap.put("PV1-17-22-5", "ST");
    fieldDataTypeMap.put("PV1-17-22-2", "ST");
    fieldDataTypeMap.put("NK1-4-14-2", "ID");
    fieldDataTypeMap.put("ORC-12-23", "CWE");
    fieldDataTypeMap.put("PV1-17-22-3", "ID");
    fieldDataTypeMap.put("PV1-17-22-1", "ST");
    fieldDataTypeMap.put("NK1-4-14-1", "DTM");
    fieldDataTypeMap.put("PV1-17-16-5", "ST");
    fieldDataTypeMap.put("PV1-17-16-6", "ID");
    fieldDataTypeMap.put("PV1-17-22-9", "ST");
    fieldDataTypeMap.put("PV1-17-16-3", "ID");
    fieldDataTypeMap.put("PV1-17-22-8", "ST");
    fieldDataTypeMap.put("PV1-17-16-4", "ST");
    fieldDataTypeMap.put("OBX-14-1", "DTM");
    fieldDataTypeMap.put("IN1-3-4-1", "IS");
    fieldDataTypeMap.put("IN1-3-4-2", "ST");
    fieldDataTypeMap.put("IN1-3-4-3", "ID");
    fieldDataTypeMap.put("ORC-12-19", "TS");
    fieldDataTypeMap.put("PV1-8-16-4", "ST");
    fieldDataTypeMap.put("ORC-12-18", "ID");
    fieldDataTypeMap.put("PV1-8-16-3", "ID");
    fieldDataTypeMap.put("ORC-12-17", "DR");
    fieldDataTypeMap.put("PV1-8-16-2", "ST");
    fieldDataTypeMap.put("ORC-12-16", "CE");
    fieldDataTypeMap.put("PV1-8-16-1", "ST");
    fieldDataTypeMap.put("ORC-12-15", "ID");
    fieldDataTypeMap.put("GT1-45-1", "FN");
    fieldDataTypeMap.put("ORC-12-14", "HD");
    fieldDataTypeMap.put("GT1-45-2", "ST");
    fieldDataTypeMap.put("ORC-12-13", "ID");
    fieldDataTypeMap.put("PV1-8-16-6", "ID");
    fieldDataTypeMap.put("ORC-12-12", "ID");
    fieldDataTypeMap.put("PV1-8-16-5", "ST");
    fieldDataTypeMap.put("ORC-12-21", "ST");
    fieldDataTypeMap.put("GT1-45-6", "IS");
    fieldDataTypeMap.put("ORC-12-22", "CWE");
    fieldDataTypeMap.put("GT1-45-5", "ST");
    fieldDataTypeMap.put("GT1-45-4", "ST");
    fieldDataTypeMap.put("ORC-12-20", "TS");
    fieldDataTypeMap.put("GT1-45-3", "ST");
    fieldDataTypeMap.put("GT1-45-9", "CE");
    fieldDataTypeMap.put("GT1-45-8", "ID");
    fieldDataTypeMap.put("GT1-45-7", "ID");
    fieldDataTypeMap.put("GT1-42-13-2", "ID");
    fieldDataTypeMap.put("GT1-42-13-1", "DTM");
    fieldDataTypeMap.put("RXA-10-22-5", "ST");
    fieldDataTypeMap.put("RXA-10-22-6", "ID");
    fieldDataTypeMap.put("RXA-10-22-7", "ST");
    fieldDataTypeMap.put("RXA-10-22-8", "ST");
    fieldDataTypeMap.put("RXA-10-22-1", "ST");
    fieldDataTypeMap.put("RXA-10-22-2", "ST");
    fieldDataTypeMap.put("RXA-10-22-3", "ID");
    fieldDataTypeMap.put("RXA-10-22-4", "ST");
    fieldDataTypeMap.put("RXA-10-22-9", "ST");
    fieldDataTypeMap.put("MSH-20", "ID");
    fieldDataTypeMap.put("NK1-5-7", "NM");
    fieldDataTypeMap.put("NK1-5-8", "NM");
    fieldDataTypeMap.put("TQ1-0", "ST");
    fieldDataTypeMap.put("NK1-5-5", "NM");
    fieldDataTypeMap.put("MSH-21", "EI_IZ");
    fieldDataTypeMap.put("NK1-5-6", "NM");
    fieldDataTypeMap.put("NK1-5-3", "ID");
    fieldDataTypeMap.put("NK1-5-4", "ST");
    fieldDataTypeMap.put("NK1-5-1", "ST");
    fieldDataTypeMap.put("NK1-5-2", "ID");
    fieldDataTypeMap.put("TQ1-6", "CQ");
    fieldDataTypeMap.put("TQ1-5", "CQ");
    fieldDataTypeMap.put("TQ1-8", "TS");
    fieldDataTypeMap.put("TQ1-7", "TS");
    fieldDataTypeMap.put("TQ1-2", "CQ");
    fieldDataTypeMap.put("TQ1-1", "SI");
    fieldDataTypeMap.put("TQ1-4", "TM");
    fieldDataTypeMap.put("NK1-5-9", "ST");
    fieldDataTypeMap.put("TQ1-3", "RPT");
    fieldDataTypeMap.put("IN1-6-13-1", "DTM");
    fieldDataTypeMap.put("IN1-6-13-2", "ID");
    fieldDataTypeMap.put("MSH-14", "ST");
    fieldDataTypeMap.put("MSH-15", "ID");
    fieldDataTypeMap.put("MSH-12", "VID_IZ");
    fieldDataTypeMap.put("MSH-13", "NM");
    fieldDataTypeMap.put("MSH-10", "ST");
    fieldDataTypeMap.put("MSH-11", "PT_IZ");
    fieldDataTypeMap.put("IN1-19-14-2", "ID");
    fieldDataTypeMap.put("MSH-19", "CWE");
    fieldDataTypeMap.put("MSH-18", "ID");
    fieldDataTypeMap.put("IN1-19-14-1", "DTM");
    fieldDataTypeMap.put("MSH-17", "ID");
    fieldDataTypeMap.put("MSH-16", "ID");
    fieldDataTypeMap.put("NK1-32-2", "ST");
    fieldDataTypeMap.put("NK1-32-1", "SAD");
    fieldDataTypeMap.put("NK1-32-4", "ST");
    fieldDataTypeMap.put("NK1-32-3", "ST");
    fieldDataTypeMap.put("GT1-29-4-1", "IS");
    fieldDataTypeMap.put("NK1-32-9", "IS");
    fieldDataTypeMap.put("PV1-52-11", "ST");
    fieldDataTypeMap.put("NK1-32-7", "ID");
    fieldDataTypeMap.put("PV1-52-12", "ID");
    fieldDataTypeMap.put("NK1-32-8", "ST");
    fieldDataTypeMap.put("NK1-32-5", "ST");
    fieldDataTypeMap.put("GT1-29-4-2", "ST");
    fieldDataTypeMap.put("PV1-52-10", "ID");
    fieldDataTypeMap.put("NK1-32-6", "ID");
    fieldDataTypeMap.put("GT1-29-4-3", "ID");
    fieldDataTypeMap.put("PV1-9-9-1", "IS");
    fieldDataTypeMap.put("PV1-52-16", "CE");
    fieldDataTypeMap.put("PV1-52-15", "ID");
    fieldDataTypeMap.put("PV1-52-14", "HD");
    fieldDataTypeMap.put("PV1-9-9-3", "ID");
    fieldDataTypeMap.put("PV1-52-13", "ID");
    fieldDataTypeMap.put("PV1-9-9-2", "ST");
    fieldDataTypeMap.put("PV1-52-19", "TS");
    fieldDataTypeMap.put("PV1-52-18", "ID");
    fieldDataTypeMap.put("PV1-52-17", "DR");
    fieldDataTypeMap.put("TQ1-9-3", "ID");
    fieldDataTypeMap.put("TQ1-9-4", "ST");
    fieldDataTypeMap.put("TQ1-9-1", "ST");
    fieldDataTypeMap.put("TQ1-9-2", "ST");
    fieldDataTypeMap.put("TQ1-9-9", "ST");
    fieldDataTypeMap.put("TQ1-9-7", "ST");
    fieldDataTypeMap.put("TQ1-9-8", "ST");
    fieldDataTypeMap.put("TQ1-9-5", "ST");
    fieldDataTypeMap.put("TQ1-9-6", "ID");
    fieldDataTypeMap.put("IN2-39-4", "ST");
    fieldDataTypeMap.put("IN2-39-3", "ID");
    fieldDataTypeMap.put("GT1-5-14-1", "DTM");
    fieldDataTypeMap.put("IN2-39-6", "ID");
    fieldDataTypeMap.put("GT1-5-14-2", "ID");
    fieldDataTypeMap.put("IN2-39-5", "ST");
    fieldDataTypeMap.put("ORC-10-2-5", "ST");
    fieldDataTypeMap.put("IN2-39-2", "ST");
    fieldDataTypeMap.put("ORC-10-2-4", "ST");
    fieldDataTypeMap.put("IN2-39-1", "ST");
    fieldDataTypeMap.put("ORC-10-2-3", "ST");
    fieldDataTypeMap.put("IN1-9-5", "ID");
    fieldDataTypeMap.put("ORC-10-2-2", "ST");
    fieldDataTypeMap.put("IN1-9-6", "HD");
    fieldDataTypeMap.put("ORC-10-2-1", "ST");
    fieldDataTypeMap.put("IN1-9-7", "ID");
    fieldDataTypeMap.put("IN1-9-8", "HD");
    fieldDataTypeMap.put("IN1-9-9", "ID");
    fieldDataTypeMap.put("ORC-8-1-4", "ID");
    fieldDataTypeMap.put("RXA-11-4-1", "IS");
    fieldDataTypeMap.put("RXA-11-4-2", "ST");
    fieldDataTypeMap.put("ORC-8-1-2", "IS");
    fieldDataTypeMap.put("RXA-11-4-3", "ID");
    fieldDataTypeMap.put("ORC-8-1-3", "ST");
    fieldDataTypeMap.put("ORC-8-1-1", "ST");
    fieldDataTypeMap.put("PV1-7-20-1", "DTM");
    fieldDataTypeMap.put("PV1-7-20-2", "ID");
    fieldDataTypeMap.put("ORC-29-9", "ST");
    fieldDataTypeMap.put("IN1-49-10", "CWE");
    fieldDataTypeMap.put("TQ1-3-10", "IS");
    fieldDataTypeMap.put("TQ1-3-11", "GTS");
    fieldDataTypeMap.put("OBX-16-20-1", "DTM");
    fieldDataTypeMap.put("OBX-16-20-2", "ID");
    fieldDataTypeMap.put("RXA-22-1", "DTM");
    fieldDataTypeMap.put("RXA-22-2", "ID");
    fieldDataTypeMap.put("ORC-29-8", "ST");
    fieldDataTypeMap.put("ORC-29-7", "ST");
    fieldDataTypeMap.put("ORC-29-6", "ID");
    fieldDataTypeMap.put("ORC-29-5", "ST");
    fieldDataTypeMap.put("ORC-29-4", "ST");
    fieldDataTypeMap.put("ORC-29-3", "ID");
    fieldDataTypeMap.put("ORC-29-2", "ST");
    fieldDataTypeMap.put("ORC-29-1", "ST");
    fieldDataTypeMap.put("PV1-5-9-6", "ID");
    fieldDataTypeMap.put("PV1-5-9-7", "ST");
    fieldDataTypeMap.put("PV1-5-9-8", "ST");
    fieldDataTypeMap.put("PV1-5-9-9", "ST");
    fieldDataTypeMap.put("IN2-63-12", "ST");
    fieldDataTypeMap.put("IN2-63-11", "ST");
    fieldDataTypeMap.put("PV1-5-9-1", "ST");
    fieldDataTypeMap.put("PV1-5-9-2", "ST");
    fieldDataTypeMap.put("PV1-5-9-3", "ID");
    fieldDataTypeMap.put("PV1-5-9-4", "ST");
    fieldDataTypeMap.put("PV1-5-9-5", "ST");
    fieldDataTypeMap.put("OBX-16-14-3", "ID");
    fieldDataTypeMap.put("ORC-21-2", "IS");
    fieldDataTypeMap.put("OBX-16-14-2", "ST");
    fieldDataTypeMap.put("ORC-21-1", "ST");
    fieldDataTypeMap.put("ORC-21-4", "NM");
    fieldDataTypeMap.put("ORC-21-3", "NM");
    fieldDataTypeMap.put("ORC-21-6", "HD");
    fieldDataTypeMap.put("ORC-21-5", "ID");
    fieldDataTypeMap.put("ORC-21-8", "HD");
    fieldDataTypeMap.put("GT1-17-13", "TS");
    fieldDataTypeMap.put("ORC-21-7", "ID");
    fieldDataTypeMap.put("GT1-17-14", "TS");
    fieldDataTypeMap.put("PV2-40-2", "ST");
    fieldDataTypeMap.put("ORC-21-9", "ID");
    fieldDataTypeMap.put("IN2-63-10", "ST");
    fieldDataTypeMap.put("PV2-40-3", "ID");
    fieldDataTypeMap.put("PV2-40-1", "ST");
    fieldDataTypeMap.put("PV2-40-6", "ID");
    fieldDataTypeMap.put("OBX-16-14-1", "IS");
    fieldDataTypeMap.put("PV2-40-4", "ST");
    fieldDataTypeMap.put("PV2-40-5", "ST");
    fieldDataTypeMap.put("NK1-32-13-1", "DTM");
    fieldDataTypeMap.put("PD1-3-10", "ST");
    fieldDataTypeMap.put("NK1-32-13-2", "ID");
    fieldDataTypeMap.put("IN2-53-9", "ST");
    fieldDataTypeMap.put("IN2-53-8", "NM");
    fieldDataTypeMap.put("IN2-53-7", "NM");
    fieldDataTypeMap.put("IN2-53-2", "ID");
    fieldDataTypeMap.put("IN2-53-1", "ST");
    fieldDataTypeMap.put("PD1-4-20-1", "DTM");
    fieldDataTypeMap.put("IN2-53-6", "NM");
    fieldDataTypeMap.put("IN2-53-5", "NM");
    fieldDataTypeMap.put("PD1-4-20-2", "ID");
    fieldDataTypeMap.put("IN2-53-4", "ST");
    fieldDataTypeMap.put("IN2-53-3", "ID");
    fieldDataTypeMap.put("IN3-14-22-1", "ST");
    fieldDataTypeMap.put("IN1-42-1", "ST");
    fieldDataTypeMap.put("IN2-52-11", "ID");
    fieldDataTypeMap.put("IN1-42-2", "ST");
    fieldDataTypeMap.put("IN2-52-12", "TS");
    fieldDataTypeMap.put("IN1-42-3", "ID");
    fieldDataTypeMap.put("IN2-52-13", "TS");
    fieldDataTypeMap.put("IN1-42-4", "ST");
    fieldDataTypeMap.put("IN2-52-14", "ST");
    fieldDataTypeMap.put("IN1-42-5", "ST");
    fieldDataTypeMap.put("IN1-42-6", "ID");
    fieldDataTypeMap.put("ORC-24-1-2", "ST");
    fieldDataTypeMap.put("ORC-24-1-3", "ST");
    fieldDataTypeMap.put("IN3-14-22-7", "ST");
    fieldDataTypeMap.put("IN3-14-22-6", "ID");
    fieldDataTypeMap.put("IN3-14-22-9", "ST");
    fieldDataTypeMap.put("IN2-52-10", "DR");
    fieldDataTypeMap.put("ORC-24-1-1", "ST");
    fieldDataTypeMap.put("IN3-14-22-8", "ST");
    fieldDataTypeMap.put("IN3-14-22-3", "ID");
    fieldDataTypeMap.put("IN3-14-22-2", "ST");
    fieldDataTypeMap.put("IN3-14-22-5", "ST");
    fieldDataTypeMap.put("IN3-14-22-4", "ST");
    fieldDataTypeMap.put("GT1-19-5", "ID");
    fieldDataTypeMap.put("GT1-19-4", "HD");
    fieldDataTypeMap.put("GT1-19-7", "DT");
    fieldDataTypeMap.put("GT1-19-6", "HD");
    fieldDataTypeMap.put("GT1-19-9", "CWE");
    fieldDataTypeMap.put("GT1-19-8", "DT");
    fieldDataTypeMap.put("ORC-9-1", "DTM");
    fieldDataTypeMap.put("ORC-9-2", "ID");
    fieldDataTypeMap.put("GT1-19-1", "ST");
    fieldDataTypeMap.put("GT1-19-3", "ID");
    fieldDataTypeMap.put("GT1-19-2", "ST");
    fieldDataTypeMap.put("IN3-2", "CX");
    fieldDataTypeMap.put("IN3-1", "SI");
    fieldDataTypeMap.put("IN3-0", "ST");
    fieldDataTypeMap.put("IN3-6", "TS");
    fieldDataTypeMap.put("IN3-5", "MOP");
    fieldDataTypeMap.put("IN3-4", "ID");
    fieldDataTypeMap.put("IN3-3", "XCN");
    fieldDataTypeMap.put("IN3-9", "DT");
    fieldDataTypeMap.put("IN3-8", "XCN");
    fieldDataTypeMap.put("IN3-7", "TS");
    fieldDataTypeMap.put("IN3-14-16-5", "ST");
    fieldDataTypeMap.put("IN3-14-16-6", "ID");
    fieldDataTypeMap.put("IN3-14-16-1", "ST");
    fieldDataTypeMap.put("IN3-14-16-2", "ST");
    fieldDataTypeMap.put("IN3-14-16-3", "ID");
    fieldDataTypeMap.put("IN3-14-16-4", "ST");
    fieldDataTypeMap.put("RXA-11-9", "ST");
    fieldDataTypeMap.put("IN1-10-10-8", "ST");
    fieldDataTypeMap.put("IN1-10-10-7", "ST");
    fieldDataTypeMap.put("RXA-11-7", "IS");
    fieldDataTypeMap.put("IN1-10-10-6", "ID");
    fieldDataTypeMap.put("RXA-11-8", "IS");
    fieldDataTypeMap.put("IN1-10-10-5", "ST");
    fieldDataTypeMap.put("RXA-11-5", "IS");
    fieldDataTypeMap.put("IN1-10-10-4", "ST");
    fieldDataTypeMap.put("RXA-11-6", "IS");
    fieldDataTypeMap.put("IN1-10-10-3", "ID");
    fieldDataTypeMap.put("RXA-11-3", "IS");
    fieldDataTypeMap.put("IN1-10-10-2", "ST");
    fieldDataTypeMap.put("RXA-11-4", "HD_IZ_0362");
    fieldDataTypeMap.put("IN1-10-10-1", "ST");
    fieldDataTypeMap.put("RXA-11-1", "IS");
    fieldDataTypeMap.put("RXA-11-2", "IS");
    fieldDataTypeMap.put("IN2-70-10", "ST");
    fieldDataTypeMap.put("IN1-10-10-9", "ST");
    fieldDataTypeMap.put("RXR-2-1", "ST");
    fieldDataTypeMap.put("PV1-8-23-6", "ID");
    fieldDataTypeMap.put("PV1-8-23-5", "ST");
    fieldDataTypeMap.put("OBX-16-23", "CWE");
    fieldDataTypeMap.put("RXR-2-3", "ID");
    fieldDataTypeMap.put("PV1-8-23-8", "ST");
    fieldDataTypeMap.put("OBX-16-22", "CWE");
    fieldDataTypeMap.put("RXR-2-2", "ST");
    fieldDataTypeMap.put("PV1-8-23-7", "ST");
    fieldDataTypeMap.put("PV1-8-23-9", "ST");
    fieldDataTypeMap.put("RXR-2-9", "ST");
    fieldDataTypeMap.put("RXR-2-8", "ST");
    fieldDataTypeMap.put("RXR-2-5", "ST");
    fieldDataTypeMap.put("RXR-2-4", "ST");
    fieldDataTypeMap.put("RXR-2-7", "ST");
    fieldDataTypeMap.put("RXR-2-6", "ID");
    fieldDataTypeMap.put("PV1-6-11", "HD");
    fieldDataTypeMap.put("PV1-6-10", "EI");
    fieldDataTypeMap.put("PV1-45-2", "ID");
    fieldDataTypeMap.put("GT1-51-8-3", "ID");
    fieldDataTypeMap.put("GT1-51-8-2", "ST");
    fieldDataTypeMap.put("PV1-45-1", "DTM");
    fieldDataTypeMap.put("GT1-51-8-1", "IS");
    fieldDataTypeMap.put("IN1-19-1-1", "ST");
    fieldDataTypeMap.put("IN1-19-1-2", "ST");
    fieldDataTypeMap.put("IN1-19-1-3", "ST");
    fieldDataTypeMap.put("PV1-50-6-3", "ID");
    fieldDataTypeMap.put("PV1-50-6-2", "ST");
    fieldDataTypeMap.put("PV1-50-6-1", "IS");
    fieldDataTypeMap.put("NK1-11-2", "IS");
    fieldDataTypeMap.put("RXA-10-16-6", "ID");
    fieldDataTypeMap.put("NK1-11-3", "TX");
    fieldDataTypeMap.put("RXA-10-16-5", "ST");
    fieldDataTypeMap.put("RXA-10-16-4", "ST");
    fieldDataTypeMap.put("NK1-11-1", "IS");
    fieldDataTypeMap.put("RXA-10-16-3", "ID");
    fieldDataTypeMap.put("PV1-8-23-3", "ID");
    fieldDataTypeMap.put("RXA-10-16-2", "ST");
    fieldDataTypeMap.put("PV1-8-23-4", "ST");
    fieldDataTypeMap.put("RXA-10-16-1", "ST");
    fieldDataTypeMap.put("PV1-8-23-1", "ST");
    fieldDataTypeMap.put("PV1-8-23-2", "ST");
    fieldDataTypeMap.put("IN2-3-22-8", "ST");
    fieldDataTypeMap.put("IN2-3-22-7", "ST");
    fieldDataTypeMap.put("RXA-11-11", "ST");
    fieldDataTypeMap.put("IN3-8-14-3", "ID");
    fieldDataTypeMap.put("RXA-11-10", "ST");
    fieldDataTypeMap.put("IN3-8-14-2", "ST");
    fieldDataTypeMap.put("IN2-3-22-9", "ST");
    fieldDataTypeMap.put("RXA-11-13", "ST");
    fieldDataTypeMap.put("IN3-8-14-1", "IS");
    fieldDataTypeMap.put("IN2-3-22-4", "ST");
    fieldDataTypeMap.put("RXA-11-12", "ST");
    fieldDataTypeMap.put("IN2-3-22-3", "ID");
    fieldDataTypeMap.put("RXA-11-15", "ID");
    fieldDataTypeMap.put("IN2-3-22-6", "ID");
    fieldDataTypeMap.put("RXA-11-14", "ID");
    fieldDataTypeMap.put("IN2-3-22-5", "ST");
    fieldDataTypeMap.put("ORC-18-5", "ST");
    fieldDataTypeMap.put("ORC-18-6", "ID");
    fieldDataTypeMap.put("ORC-18-3", "ID");
    fieldDataTypeMap.put("ORC-18-4", "ST");
    fieldDataTypeMap.put("ORC-18-1", "ST");
    fieldDataTypeMap.put("ORC-18-2", "ST");
    fieldDataTypeMap.put("IN3-3-23-2", "ST");
    fieldDataTypeMap.put("IN3-3-23-1", "ST");
    fieldDataTypeMap.put("GT1-17-11", "ID");
    fieldDataTypeMap.put("GT1-17-12", "DR");
    fieldDataTypeMap.put("GT1-17-10", "IS");
    fieldDataTypeMap.put("IN2-3-22-1", "ST");
    fieldDataTypeMap.put("IN2-3-22-2", "ST");
    fieldDataTypeMap.put("RXA-11-16", "ST");
    fieldDataTypeMap.put("PV1-43-11-3", "ID");
    fieldDataTypeMap.put("PV1-43-11-2", "ST");
    fieldDataTypeMap.put("PV1-43-11-1", "IS");
    fieldDataTypeMap.put("GT1-23-2", "ST");
    fieldDataTypeMap.put("GT1-23-1", "ST");
    fieldDataTypeMap.put("IN3-14-2-1", "ST");
    fieldDataTypeMap.put("IN3-14-2-3", "ST");
    fieldDataTypeMap.put("IN3-14-2-2", "ST");
    fieldDataTypeMap.put("IN3-14-2-5", "ST");
    fieldDataTypeMap.put("IN3-14-2-4", "ST");
    fieldDataTypeMap.put("NK1-2-12-2", "ID");
    fieldDataTypeMap.put("GT1-30-5", "ST");
    fieldDataTypeMap.put("GT1-30-6", "ID");
    fieldDataTypeMap.put("GT1-30-3", "ID");
    fieldDataTypeMap.put("NK1-2-12-1", "DTM");
    fieldDataTypeMap.put("GT1-30-4", "ST");
    fieldDataTypeMap.put("GT1-30-1", "ST");
    fieldDataTypeMap.put("GT1-30-2", "ST");
    fieldDataTypeMap.put("GT1-23-5", "ST");
    fieldDataTypeMap.put("GT1-23-6", "ID");
    fieldDataTypeMap.put("GT1-23-3", "ID");
    fieldDataTypeMap.put("GT1-23-4", "ST");
    fieldDataTypeMap.put("IN3-3-4", "ST");
    fieldDataTypeMap.put("IN3-3-3", "ST");
    fieldDataTypeMap.put("IN3-3-2", "FN");
    fieldDataTypeMap.put("IN3-3-1", "ST");
    fieldDataTypeMap.put("IN3-3-8", "IS");
    fieldDataTypeMap.put("IN3-3-7", "IS");
    fieldDataTypeMap.put("IN3-3-6", "ST");
    fieldDataTypeMap.put("IN3-3-5", "ST");
    fieldDataTypeMap.put("IN3-3-22-7", "ST");
    fieldDataTypeMap.put("NK1-22-4", "ST");
    fieldDataTypeMap.put("IN3-3-22-6", "ID");
    fieldDataTypeMap.put("NK1-22-5", "ST");
    fieldDataTypeMap.put("IN3-3-22-5", "ST");
    fieldDataTypeMap.put("NK1-22-6", "ID");
    fieldDataTypeMap.put("IN3-3-22-4", "ST");
    fieldDataTypeMap.put("IN3-3-22-9", "ST");
    fieldDataTypeMap.put("IN3-3-22-8", "ST");
    fieldDataTypeMap.put("PV1-7-9-1", "IS");
    fieldDataTypeMap.put("PV1-7-9-3", "ID");
    fieldDataTypeMap.put("PV1-7-9-2", "ST");
    fieldDataTypeMap.put("IN3-18-1", "ST");
    fieldDataTypeMap.put("IN3-18-2", "ST");
    fieldDataTypeMap.put("IN3-18-3", "ID");
    fieldDataTypeMap.put("IN3-18-4", "ST");
    fieldDataTypeMap.put("IN3-18-5", "ST");
    fieldDataTypeMap.put("IN3-18-6", "ID");
    fieldDataTypeMap.put("ORC-10-16-4", "ST");
    fieldDataTypeMap.put("ORC-10-16-3", "ID");
    fieldDataTypeMap.put("ORC-10-16-6", "ID");
    fieldDataTypeMap.put("ORC-10-16-5", "ST");
    fieldDataTypeMap.put("ORC-10-16-2", "ST");
    fieldDataTypeMap.put("ORC-10-16-1", "ST");
    fieldDataTypeMap.put("IN3-3-22-1", "ST");
    fieldDataTypeMap.put("IN3-3-22-2", "ST");
    fieldDataTypeMap.put("IN3-3-22-3", "ID");
    fieldDataTypeMap.put("ORC-11-19-2", "ID");
    fieldDataTypeMap.put("ORC-11-19-1", "DTM");
    fieldDataTypeMap.put("IN1-6-9-3", "ID");
    fieldDataTypeMap.put("IN1-6-9-2", "ST");
    fieldDataTypeMap.put("IN1-6-9-1", "ST");
    fieldDataTypeMap.put("IN1-6-9-6", "ID");
    fieldDataTypeMap.put("IN1-6-9-5", "ST");
    fieldDataTypeMap.put("IN1-6-9-4", "ST");
    fieldDataTypeMap.put("PID-5-6", "IS");
    fieldDataTypeMap.put("PID-5-7", "ID");
    fieldDataTypeMap.put("PID-5-8", "ID");
    fieldDataTypeMap.put("PID-5-9", "CE");
    fieldDataTypeMap.put("PID-5-2", "ST");
    fieldDataTypeMap.put("IN2-52-12-1", "DTM");
    fieldDataTypeMap.put("PID-5-3", "ST");
    fieldDataTypeMap.put("IN2-52-12-2", "ID");
    fieldDataTypeMap.put("PID-5-4", "ST");
    fieldDataTypeMap.put("PID-5-5", "ST");
    fieldDataTypeMap.put("NK1-4-13-2", "ID");
    fieldDataTypeMap.put("NK1-4-13-1", "DTM");
    fieldDataTypeMap.put("PID-5-1", "FN_IZ");
    fieldDataTypeMap.put("GT1-46-6", "NM");
    fieldDataTypeMap.put("GT1-46-7", "NM");
    fieldDataTypeMap.put("GT1-46-8", "NM");
    fieldDataTypeMap.put("GT1-46-9", "ST");
    fieldDataTypeMap.put("GT1-46-2", "ID");
    fieldDataTypeMap.put("GT1-46-3", "ID");
    fieldDataTypeMap.put("GT1-46-4", "ST");
    fieldDataTypeMap.put("GT1-46-5", "NM");
    fieldDataTypeMap.put("PV1-9-2", "FN");
    fieldDataTypeMap.put("PV1-9-3", "ST");
    fieldDataTypeMap.put("PV1-9-4", "ST");
    fieldDataTypeMap.put("GT1-46-1", "ST");
    fieldDataTypeMap.put("PV1-9-5", "ST");
    fieldDataTypeMap.put("IN3-8-20-1", "DTM");
    fieldDataTypeMap.put("IN3-8-20-2", "ID");
    fieldDataTypeMap.put("PV1-9-1", "ST");
    fieldDataTypeMap.put("PV1-9-9", "HD");
    fieldDataTypeMap.put("PV1-9-8", "IS");
    fieldDataTypeMap.put("PV1-9-7", "IS");
    fieldDataTypeMap.put("PV1-9-6", "ST");
    fieldDataTypeMap.put("IN2-1-1", "ST");
    fieldDataTypeMap.put("IN2-1-2", "ST");
    fieldDataTypeMap.put("IN2-1-3", "ID");
    fieldDataTypeMap.put("IN2-1-4", "HD");
    fieldDataTypeMap.put("IN2-1-5", "ID");
    fieldDataTypeMap.put("IN2-1-6", "HD");
    fieldDataTypeMap.put("IN2-1-7", "DT");
    fieldDataTypeMap.put("IN2-1-8", "DT");
    fieldDataTypeMap.put("IN2-1-9", "CWE");
    fieldDataTypeMap.put("IN2-25-1", "ST");
    fieldDataTypeMap.put("IN2-25-9", "CWE");
    fieldDataTypeMap.put("IN2-25-8", "DT");
    fieldDataTypeMap.put("IN2-25-7", "DT");
    fieldDataTypeMap.put("IN2-25-6", "HD");
    fieldDataTypeMap.put("IN2-25-5", "ID");
    fieldDataTypeMap.put("IN2-25-4", "HD");
    fieldDataTypeMap.put("IN2-25-3", "ID");
    fieldDataTypeMap.put("IN2-25-2", "ST");
    fieldDataTypeMap.put("MSH-6-2", "ST");
    fieldDataTypeMap.put("MSH-6-3", "ID");
    fieldDataTypeMap.put("PID-36-6", "ID");
    fieldDataTypeMap.put("PID-36-5", "ST");
    fieldDataTypeMap.put("MSH-6-1", "IS");
    fieldDataTypeMap.put("PID-36-4", "ST");
    fieldDataTypeMap.put("PID-36-3", "ID");
    fieldDataTypeMap.put("PID-36-2", "ST");
    fieldDataTypeMap.put("PID-36-1", "ST");
    fieldDataTypeMap.put("IN3-3-9", "HD");
    fieldDataTypeMap.put("IN3-3-2-5", "ST");
    fieldDataTypeMap.put("PV1-50-10", "CWE");
    fieldDataTypeMap.put("IN3-3-2-4", "ST");
    fieldDataTypeMap.put("IN1-19-13-2", "ID");
    fieldDataTypeMap.put("IN1-19-13-1", "DTM");
    fieldDataTypeMap.put("IN1-6-13", "TS");
    fieldDataTypeMap.put("IN1-6-14", "ST");
    fieldDataTypeMap.put("IN1-6-11", "ID");
    fieldDataTypeMap.put("IN1-6-12", "TS");
    fieldDataTypeMap.put("IN1-6-10", "DR");
    fieldDataTypeMap.put("PV2-9-1", "DTM");
    fieldDataTypeMap.put("PV2-9-2", "ID");
    fieldDataTypeMap.put("IN2-1-9-6", "ID");
    fieldDataTypeMap.put("IN2-1-9-7", "ST");
    fieldDataTypeMap.put("IN2-1-9-4", "ST");
    fieldDataTypeMap.put("IN2-1-9-5", "ST");
    fieldDataTypeMap.put("IN2-1-9-2", "ST");
    fieldDataTypeMap.put("IN2-1-9-3", "ID");
    fieldDataTypeMap.put("IN2-1-9-1", "ST");
    fieldDataTypeMap.put("PV2-1-11-2", "ST");
    fieldDataTypeMap.put("IN3-3-2-1", "ST");
    fieldDataTypeMap.put("PV2-1-11-3", "ID");
    fieldDataTypeMap.put("IN3-3-2-2", "ST");
    fieldDataTypeMap.put("IN3-3-2-3", "ST");
    fieldDataTypeMap.put("PV2-1-11-1", "IS");
    fieldDataTypeMap.put("IN2-1-9-8", "ST");
    fieldDataTypeMap.put("IN2-1-9-9", "ST");
    fieldDataTypeMap.put("PV2-1-7", "IS");
    fieldDataTypeMap.put("PD1-15-4", "ST");
    fieldDataTypeMap.put("PV2-1-8", "IS");
    fieldDataTypeMap.put("PD1-15-3", "ID");
    fieldDataTypeMap.put("PV2-1-5", "IS");
    fieldDataTypeMap.put("PD1-15-2", "ST");
    fieldDataTypeMap.put("PV2-1-6", "IS");
    fieldDataTypeMap.put("PD1-15-1", "ST");
    fieldDataTypeMap.put("PV2-1-9", "ST");
    fieldDataTypeMap.put("PD1-15-6", "ID");
    fieldDataTypeMap.put("PD1-15-5", "ST");
    fieldDataTypeMap.put("PV2-1-3", "IS");
    fieldDataTypeMap.put("PV2-1-4", "HD");
    fieldDataTypeMap.put("PV2-1-1", "IS");
    fieldDataTypeMap.put("PV2-1-2", "IS");
    fieldDataTypeMap.put("RXA-10-23-8", "ST");
    fieldDataTypeMap.put("NK1-4-14", "TS");
    fieldDataTypeMap.put("RXA-10-23-9", "ST");
    fieldDataTypeMap.put("NK1-4-13", "TS");
    fieldDataTypeMap.put("NK1-4-10", "IS");
    fieldDataTypeMap.put("NK1-4-12", "DR");
    fieldDataTypeMap.put("NK1-4-11", "ID");
    fieldDataTypeMap.put("PV2-23-8-2", "ST");
    fieldDataTypeMap.put("RXA-10-23-1", "ST");
    fieldDataTypeMap.put("PV2-23-8-3", "ID");
    fieldDataTypeMap.put("RXA-10-23-2", "ST");
    fieldDataTypeMap.put("RXA-10-23-3", "ID");
    fieldDataTypeMap.put("PV2-23-8-1", "IS");
    fieldDataTypeMap.put("RXA-10-23-4", "ST");
    fieldDataTypeMap.put("RXA-10-23-5", "ST");
    fieldDataTypeMap.put("RXA-10-23-6", "ID");
    fieldDataTypeMap.put("RXA-10-23-7", "ST");
    fieldDataTypeMap.put("IN1-11-10", "ST");
    fieldDataTypeMap.put("PID-11-2", "ST");
    fieldDataTypeMap.put("PID-11-1", "SAD_IZ");
    fieldDataTypeMap.put("NK1-12-4-2", "ST");
    fieldDataTypeMap.put("NK1-12-4-3", "ID");
    fieldDataTypeMap.put("NK1-12-4-1", "IS");
    fieldDataTypeMap.put("PID-11-8", "ST");
    fieldDataTypeMap.put("PID-11-7", "ID");
    fieldDataTypeMap.put("PID-11-9", "IS");
    fieldDataTypeMap.put("PID-11-4", "ST");
    fieldDataTypeMap.put("PID-11-3", "ST");
    fieldDataTypeMap.put("PID-11-6", "ID");
    fieldDataTypeMap.put("PID-11-5", "ST");
    fieldDataTypeMap.put("GT1-4-14", "ST");
    fieldDataTypeMap.put("GT1-4-13", "TS");
    fieldDataTypeMap.put("GT1-4-10", "DR");
    fieldDataTypeMap.put("GT1-4-12", "TS");
    fieldDataTypeMap.put("GT1-4-11", "ID");
    fieldDataTypeMap.put("NK1-33-1", "ST");
    fieldDataTypeMap.put("NK1-33-3", "ID");
    fieldDataTypeMap.put("GT1-2-9-8", "ST");
    fieldDataTypeMap.put("NK1-33-2", "ST");
    fieldDataTypeMap.put("GT1-2-9-9", "ST");
    fieldDataTypeMap.put("PD1-4-14-3", "ID");
    fieldDataTypeMap.put("IN2-26-10", "CWE");
    fieldDataTypeMap.put("PD1-4-14-1", "IS");
    fieldDataTypeMap.put("PD1-4-14-2", "ST");
    fieldDataTypeMap.put("IN3-2-10", "CWE");
    fieldDataTypeMap.put("RXA-7-4", "ST");
    fieldDataTypeMap.put("IN1-10-9-8", "ST");
    fieldDataTypeMap.put("RXA-7-5", "ST");
    fieldDataTypeMap.put("IN1-10-9-7", "ST");
    fieldDataTypeMap.put("RXA-7-6", "ID");
    fieldDataTypeMap.put("IN1-10-9-6", "ID");
    fieldDataTypeMap.put("IN1-10-9-5", "ST");
    fieldDataTypeMap.put("IN1-10-9-4", "ST");
    fieldDataTypeMap.put("RXA-7-1", "ST");
    fieldDataTypeMap.put("IN1-10-9-3", "ID");
    fieldDataTypeMap.put("RXA-7-2", "ST");
    fieldDataTypeMap.put("IN1-10-9-2", "ST");
    fieldDataTypeMap.put("RXA-7-3", "ID");
    fieldDataTypeMap.put("IN1-10-9-1", "ST");
    fieldDataTypeMap.put("NK1-33-6", "HD");
    fieldDataTypeMap.put("GT1-2-9-5", "ST");
    fieldDataTypeMap.put("NK1-33-7", "DT");
    fieldDataTypeMap.put("GT1-2-9-4", "ST");
    fieldDataTypeMap.put("NK1-33-4", "HD");
    fieldDataTypeMap.put("GT1-2-9-7", "ST");
    fieldDataTypeMap.put("NK1-33-5", "ID");
    fieldDataTypeMap.put("GT1-2-9-6", "ID");
    fieldDataTypeMap.put("GT1-2-9-1", "ST");
    fieldDataTypeMap.put("NK1-33-8", "DT");
    fieldDataTypeMap.put("GT1-2-9-3", "ID");
    fieldDataTypeMap.put("NK1-33-9", "CWE");
    fieldDataTypeMap.put("GT1-2-9-2", "ST");
    fieldDataTypeMap.put("IN1-10-9-9", "ST");
    fieldDataTypeMap.put("GT1-19-10-4", "ST");
    fieldDataTypeMap.put("IN2-7-1-3", "ST");
    fieldDataTypeMap.put("GT1-19-10-5", "ST");
    fieldDataTypeMap.put("IN2-7-1-2", "ST");
    fieldDataTypeMap.put("GT1-19-10-2", "ST");
    fieldDataTypeMap.put("IN2-7-1-5", "ST");
    fieldDataTypeMap.put("GT1-19-10-3", "ID");
    fieldDataTypeMap.put("IN2-7-1-4", "ST");
    fieldDataTypeMap.put("GT1-19-10-8", "ST");
    fieldDataTypeMap.put("GT1-19-10-9", "ST");
    fieldDataTypeMap.put("GT1-19-10-6", "ID");
    fieldDataTypeMap.put("GT1-19-10-7", "ST");
    fieldDataTypeMap.put("NK1-4-1", "SAD_IZ");
    fieldDataTypeMap.put("NK1-4-5", "ST");
    fieldDataTypeMap.put("NK1-4-4", "ST");
    fieldDataTypeMap.put("GT1-5-13-1", "DTM");
    fieldDataTypeMap.put("NK1-4-3", "ST");
    fieldDataTypeMap.put("OBX-16-22-9", "ST");
    fieldDataTypeMap.put("NK1-4-2", "ST");
    fieldDataTypeMap.put("OBX-16-22-8", "ST");
    fieldDataTypeMap.put("NK1-4-9", "IS");
    fieldDataTypeMap.put("IN1-49-9-1", "ST");
    fieldDataTypeMap.put("OBX-16-22-7", "ST");
    fieldDataTypeMap.put("NK1-4-8", "ST");
    fieldDataTypeMap.put("IN1-49-9-2", "ST");
    fieldDataTypeMap.put("OBX-16-22-6", "ID");
    fieldDataTypeMap.put("NK1-4-7", "ID");
    fieldDataTypeMap.put("OBX-16-22-5", "ST");
    fieldDataTypeMap.put("NK1-4-6", "ID");
    fieldDataTypeMap.put("OBX-16-22-4", "ST");
    fieldDataTypeMap.put("IN1-49-9-5", "ST");
    fieldDataTypeMap.put("OBX-16-22-3", "ID");
    fieldDataTypeMap.put("IN1-49-9-6", "ID");
    fieldDataTypeMap.put("IN2-9-9-6", "ID");
    fieldDataTypeMap.put("OBX-16-22-2", "ST");
    fieldDataTypeMap.put("IN1-49-9-3", "ID");
    fieldDataTypeMap.put("IN2-9-9-5", "ST");
    fieldDataTypeMap.put("OBX-16-22-1", "ST");
    fieldDataTypeMap.put("IN1-49-9-4", "ST");
    fieldDataTypeMap.put("IN2-9-9-4", "ST");
    fieldDataTypeMap.put("IN1-49-9-9", "ST");
    fieldDataTypeMap.put("IN2-9-9-3", "ID");
    fieldDataTypeMap.put("IN2-9-9-2", "ST");
    fieldDataTypeMap.put("GT1-5-13-2", "ID");
    fieldDataTypeMap.put("IN1-49-9-7", "ST");
    fieldDataTypeMap.put("IN2-9-9-1", "ST");
    fieldDataTypeMap.put("IN1-49-9-8", "ST");
    fieldDataTypeMap.put("PV1-9-19-2", "ID");
    fieldDataTypeMap.put("PV1-9-19-1", "DTM");
    fieldDataTypeMap.put("IN2-7-1-1", "ST");
    fieldDataTypeMap.put("GT1-19-10-1", "ST");
    fieldDataTypeMap.put("IN2-1-10", "CWE");
    fieldDataTypeMap.put("IN2-26-10-4", "ST");
    fieldDataTypeMap.put("IN2-26-10-3", "ID");
    fieldDataTypeMap.put("RXA-10-20-1", "DTM");
    fieldDataTypeMap.put("IN2-26-10-2", "ST");
    fieldDataTypeMap.put("RXA-10-20-2", "ID");
    fieldDataTypeMap.put("IN2-26-10-1", "ST");
    fieldDataTypeMap.put("IN2-61-6-3", "ID");
    fieldDataTypeMap.put("IN2-61-6-2", "ST");
    fieldDataTypeMap.put("NK1-13-8-3", "ID");
    fieldDataTypeMap.put("IN2-61-6-1", "IS");
    fieldDataTypeMap.put("NK1-13-8-1", "IS");
    fieldDataTypeMap.put("NK1-13-8-2", "ST");
    fieldDataTypeMap.put("IN2-26-10-9", "ST");
    fieldDataTypeMap.put("IN2-26-10-7", "ST");
    fieldDataTypeMap.put("IN2-26-10-8", "ST");
    fieldDataTypeMap.put("IN2-26-10-5", "ST");
    fieldDataTypeMap.put("IN2-26-10-6", "ID");
    fieldDataTypeMap.put("ORC-26-2", "ST");
    fieldDataTypeMap.put("ORC-26-3", "ID");
    fieldDataTypeMap.put("ORC-26-1", "ST");
    fieldDataTypeMap.put("ORC-26-6", "ID");
    fieldDataTypeMap.put("ORC-26-7", "ST");
    fieldDataTypeMap.put("ORC-26-4", "ST");
    fieldDataTypeMap.put("ORC-26-5", "ST");
    fieldDataTypeMap.put("PV1-37-2-1", "DTM");
    fieldDataTypeMap.put("ORC-26-8", "ST");
    fieldDataTypeMap.put("ORC-26-9", "ST");
    fieldDataTypeMap.put("PV1-37-2-2", "ID");
    fieldDataTypeMap.put("IN3-8-2-5", "ST");
    fieldDataTypeMap.put("IN3-8-2-4", "ST");
    fieldDataTypeMap.put("IN3-8-2-3", "ST");
    fieldDataTypeMap.put("IN3-8-2-2", "ST");
    fieldDataTypeMap.put("IN3-8-2-1", "ST");
    fieldDataTypeMap.put("IN3-3-9-3", "ID");
    fieldDataTypeMap.put("IN3-3-9-1", "IS");
    fieldDataTypeMap.put("IN3-3-9-2", "ST");
    fieldDataTypeMap.put("IN1-3-9", "CWE");
    fieldDataTypeMap.put("IN1-3-8", "DT");
    fieldDataTypeMap.put("IN1-3-7", "DT");
    fieldDataTypeMap.put("IN1-3-6", "HD");
    fieldDataTypeMap.put("IN1-3-5", "ID");
    fieldDataTypeMap.put("IN1-3-4", "HD");
    fieldDataTypeMap.put("IN1-3-3", "ID");
    fieldDataTypeMap.put("IN1-3-2", "ST");
    fieldDataTypeMap.put("IN1-3-1", "ST");
    fieldDataTypeMap.put("IN2-70-8-3", "ID");
    fieldDataTypeMap.put("IN2-70-8-1", "IS");
    fieldDataTypeMap.put("IN2-70-8-2", "ST");
    fieldDataTypeMap.put("GT1-54-2-2", "ID");
    fieldDataTypeMap.put("GT1-54-2-1", "DTM");
    fieldDataTypeMap.put("PV1-43-10", "EI");
    fieldDataTypeMap.put("PV1-43-11", "HD");
    fieldDataTypeMap.put("PV1-3-11-1", "IS");
    fieldDataTypeMap.put("NK1-9", "DT");
    fieldDataTypeMap.put("PV1-3-11-2", "ST");
    fieldDataTypeMap.put("PV1-3-11-3", "ID");
    fieldDataTypeMap.put("GT1-16-7", "ID");
    fieldDataTypeMap.put("GT1-16-8", "ID");
    fieldDataTypeMap.put("GT1-16-9", "CE");
    fieldDataTypeMap.put("GT1-16-3", "ST");
    fieldDataTypeMap.put("GT1-16-4", "ST");
    fieldDataTypeMap.put("GT1-16-5", "ST");
    fieldDataTypeMap.put("GT1-16-6", "IS");
    fieldDataTypeMap.put("TQ1-6-1", "NM");
    fieldDataTypeMap.put("GT1-16-1", "FN");
    fieldDataTypeMap.put("TQ1-6-2", "CE");
    fieldDataTypeMap.put("GT1-16-2", "ST");
    fieldDataTypeMap.put("MSH-21-2", "IS");
    fieldDataTypeMap.put("IN3-14-19-2", "ID");
    fieldDataTypeMap.put("MSH-21-1", "ST");
    fieldDataTypeMap.put("NK1-35-6", "ID");
    fieldDataTypeMap.put("IN3-14-19-1", "DTM");
    fieldDataTypeMap.put("PV1-8-19-1", "DTM");
    fieldDataTypeMap.put("NK1-35-3", "ID");
    fieldDataTypeMap.put("PV1-8-19-2", "ID");
    fieldDataTypeMap.put("NK1-35-2", "ST");
    fieldDataTypeMap.put("NK1-35-5", "ST");
    fieldDataTypeMap.put("NK1-35-4", "ST");
    fieldDataTypeMap.put("NK1-4", "XAD_IZ");
    fieldDataTypeMap.put("IN1-44-10", "IS");
    fieldDataTypeMap.put("NK1-3", "CE_IZ");
    fieldDataTypeMap.put("NK1-2", "XPN_IZ");
    fieldDataTypeMap.put("NK1-1", "SI");
    fieldDataTypeMap.put("NK1-8", "DT");
    fieldDataTypeMap.put("IN1-44-14", "TS");
    fieldDataTypeMap.put("NK1-7", "CE");
    fieldDataTypeMap.put("IN1-44-13", "TS");
    fieldDataTypeMap.put("NK1-6", "XTN");
    fieldDataTypeMap.put("IN1-44-12", "DR");
    fieldDataTypeMap.put("NK1-5", "XTN_IZ");
    fieldDataTypeMap.put("IN1-44-11", "ID");
    fieldDataTypeMap.put("PV1-9-21", "ST");
    fieldDataTypeMap.put("PV1-9-20", "TS");
    fieldDataTypeMap.put("PV1-9-23", "CWE");
    fieldDataTypeMap.put("MSH-21-3", "ST");
    fieldDataTypeMap.put("PV1-9-22", "CWE");
    fieldDataTypeMap.put("MSH-21-4", "ID");
    fieldDataTypeMap.put("NK1-0", "ST");
    fieldDataTypeMap.put("PV1-9-19", "TS");
    fieldDataTypeMap.put("NK1-35-1", "ST");
    fieldDataTypeMap.put("PV1-9-18", "ID");
    fieldDataTypeMap.put("PV1-9-17", "DR");
    fieldDataTypeMap.put("PV1-9-16", "CE");
    fieldDataTypeMap.put("PV1-9-15", "ID");
    fieldDataTypeMap.put("PV1-9-14", "HD");
    fieldDataTypeMap.put("PV1-9-13", "ID");
    fieldDataTypeMap.put("PV1-9-12", "ID");
    fieldDataTypeMap.put("PV1-9-11", "ST");
    fieldDataTypeMap.put("PV1-9-10", "ID");
    fieldDataTypeMap.put("PV1-9-23-6", "ID");
    fieldDataTypeMap.put("PV1-9-23-7", "ST");
    fieldDataTypeMap.put("PV1-9-23-8", "ST");
    fieldDataTypeMap.put("PV1-9-23-9", "ST");
    fieldDataTypeMap.put("ORC-19-2", "FN");
    fieldDataTypeMap.put("ORC-19-3", "ST");
    fieldDataTypeMap.put("IN2-65-6", "ID");
    fieldDataTypeMap.put("ORC-19-1", "ST");
    fieldDataTypeMap.put("ORC-19-6", "ST");
    fieldDataTypeMap.put("PV1-8-22-6", "ID");
    fieldDataTypeMap.put("ORC-19-7", "IS");
    fieldDataTypeMap.put("PV1-8-22-7", "ST");
    fieldDataTypeMap.put("PID-18-10", "CWE");
    fieldDataTypeMap.put("ORC-19-4", "ST");
    fieldDataTypeMap.put("PV1-8-22-8", "ST");
    fieldDataTypeMap.put("ORC-19-5", "ST");
    fieldDataTypeMap.put("PV1-8-22-9", "ST");
    fieldDataTypeMap.put("GT1-6-11", "ST");
    fieldDataTypeMap.put("GT1-27-5-6", "ID");
    fieldDataTypeMap.put("IN2-3-23-3", "ID");
    fieldDataTypeMap.put("GT1-6-12", "ST");
    fieldDataTypeMap.put("GT1-27-5-5", "ST");
    fieldDataTypeMap.put("IN2-3-23-2", "ST");
    fieldDataTypeMap.put("IN2-65-1", "ST");
    fieldDataTypeMap.put("GT1-27-5-4", "ST");
    fieldDataTypeMap.put("IN2-3-23-5", "ST");
    fieldDataTypeMap.put("GT1-27-5-3", "ID");
    fieldDataTypeMap.put("IN2-3-23-4", "ST");
    fieldDataTypeMap.put("IN2-65-3", "ID");
    fieldDataTypeMap.put("GT1-27-5-2", "ST");
    fieldDataTypeMap.put("IN2-3-23-7", "ST");
    fieldDataTypeMap.put("IN2-65-2", "ST");
    fieldDataTypeMap.put("GT1-27-5-1", "ST");
    fieldDataTypeMap.put("IN2-3-23-6", "ID");
    fieldDataTypeMap.put("IN2-65-5", "ST");
    fieldDataTypeMap.put("IN2-3-23-9", "ST");
    fieldDataTypeMap.put("IN2-65-4", "ST");
    fieldDataTypeMap.put("IN2-3-23-8", "ST");
    fieldDataTypeMap.put("GT1-6-10", "ST");
    fieldDataTypeMap.put("IN2-3-23-1", "ST");
    fieldDataTypeMap.put("PV1-9-23-5", "ST");
    fieldDataTypeMap.put("PV1-9-23-4", "ST");
    fieldDataTypeMap.put("PV1-9-23-3", "ID");
    fieldDataTypeMap.put("PV1-9-23-2", "ST");
    fieldDataTypeMap.put("PV1-9-23-1", "ST");
    fieldDataTypeMap.put("IN3-25-19-1", "DTM");
    fieldDataTypeMap.put("IN3-25-19-2", "ID");
    fieldDataTypeMap.put("OBX-25-9-3", "ID");
    fieldDataTypeMap.put("OBX-25-9-2", "ST");
    fieldDataTypeMap.put("OBX-25-9-1", "IS");
    fieldDataTypeMap.put("GT1-11-6", "ID");
    fieldDataTypeMap.put("GT1-11-5", "ST");
    fieldDataTypeMap.put("GT1-11-4", "ST");
    fieldDataTypeMap.put("IN2-49-9-1", "ST");
    fieldDataTypeMap.put("IN2-49-9-3", "ID");
    fieldDataTypeMap.put("IN2-49-9-2", "ST");
    fieldDataTypeMap.put("IN2-49-9-5", "ST");
    fieldDataTypeMap.put("IN2-49-9-4", "ST");
    fieldDataTypeMap.put("IN2-49-9-6", "ID");
    fieldDataTypeMap.put("PV1-5-6-3", "ID");
    fieldDataTypeMap.put("PV1-5-6-2", "ST");
    fieldDataTypeMap.put("PV1-5-6-1", "IS");
    fieldDataTypeMap.put("NK1-14-5", "ST");
    fieldDataTypeMap.put("NK1-14-6", "ID");
    fieldDataTypeMap.put("NK1-14-1", "ST");
    fieldDataTypeMap.put("GT1-11-2", "ST");
    fieldDataTypeMap.put("NK1-14-2", "ST");
    fieldDataTypeMap.put("GT1-11-3", "ID");
    fieldDataTypeMap.put("NK1-14-3", "ID");
    fieldDataTypeMap.put("NK1-14-4", "ST");
    fieldDataTypeMap.put("GT1-11-1", "ST");
    fieldDataTypeMap.put("NK1-32-14-1", "DTM");
    fieldDataTypeMap.put("NK1-32-14-2", "ID");
    fieldDataTypeMap.put("RXA-14-1", "ST");
    fieldDataTypeMap.put("RXA-14-2", "ST");
    fieldDataTypeMap.put("RXA-14-3", "ID");
    fieldDataTypeMap.put("RXA-14-4", "ST");
    fieldDataTypeMap.put("ORC-19-9", "HD");
    fieldDataTypeMap.put("RXA-14-5", "ST");
    fieldDataTypeMap.put("ORC-19-8", "IS");
    fieldDataTypeMap.put("RXA-14-6", "ID");
    fieldDataTypeMap.put("NK1-32-12", "DR");
    fieldDataTypeMap.put("NK1-32-13", "TS");
    fieldDataTypeMap.put("NK1-32-10", "IS");
    fieldDataTypeMap.put("NK1-32-11", "ID");
    fieldDataTypeMap.put("ORC-12-8", "IS");
    fieldDataTypeMap.put("ORC-12-7", "IS");
    fieldDataTypeMap.put("ORC-12-9", "HD_IZ_0363");
    fieldDataTypeMap.put("ORC-12-4", "ST");
    fieldDataTypeMap.put("ORC-12-3", "ST");
    fieldDataTypeMap.put("ORC-12-6", "ST");
    fieldDataTypeMap.put("ORC-12-5", "ST");
    fieldDataTypeMap.put("ORC-12-2", "FN_IZ");
    fieldDataTypeMap.put("NK1-32-14", "TS");
    fieldDataTypeMap.put("ORC-12-1", "ST");
    fieldDataTypeMap.put("GT1-50", "JCC");
    fieldDataTypeMap.put("GT1-51", "XON");
    fieldDataTypeMap.put("GT1-52", "IS");
    fieldDataTypeMap.put("GT1-53", "IS");
    fieldDataTypeMap.put("ORC-19-2-4", "ST");
    fieldDataTypeMap.put("ORC-19-2-3", "ST");
    fieldDataTypeMap.put("ORC-19-2-5", "ST");
    fieldDataTypeMap.put("PV1-42-4-1", "IS");
    fieldDataTypeMap.put("PV1-42-4-2", "ST");
    fieldDataTypeMap.put("NK1-5-12", "ST");
    fieldDataTypeMap.put("GT1-54", "FC");
    fieldDataTypeMap.put("PV1-42-4-3", "ID");
    fieldDataTypeMap.put("GT1-55", "CE");
    fieldDataTypeMap.put("NK1-5-10", "ST");
    fieldDataTypeMap.put("GT1-56", "ST");
    fieldDataTypeMap.put("NK1-5-11", "ST");
    fieldDataTypeMap.put("GT1-57", "IS");
    fieldDataTypeMap.put("ORC-3-3", "ST");
    fieldDataTypeMap.put("ORC-3-4", "ID");
    fieldDataTypeMap.put("ORC-3-1", "ST");
    fieldDataTypeMap.put("ORC-3-2", "IS");
    fieldDataTypeMap.put("IN1-9-6-1", "IS");
    fieldDataTypeMap.put("IN1-9-6-2", "ST");
    fieldDataTypeMap.put("IN1-9-6-3", "ID");
    fieldDataTypeMap.put("GT1-41", "CE");
    fieldDataTypeMap.put("GT1-42", "XPN");
    fieldDataTypeMap.put("GT1-40", "IS");
    fieldDataTypeMap.put("GT1-49", "ST");
    fieldDataTypeMap.put("GT1-47", "CE");
    fieldDataTypeMap.put("GT1-48", "IS");
    fieldDataTypeMap.put("GT1-45", "XPN");
    fieldDataTypeMap.put("GT1-46", "XTN");
    fieldDataTypeMap.put("GT1-43", "CE");
    fieldDataTypeMap.put("GT1-44", "CE");
    fieldDataTypeMap.put("ORC-19-2-1", "ST");
    fieldDataTypeMap.put("ORC-12-14-1", "IS");
    fieldDataTypeMap.put("ORC-19-2-2", "ST");
    fieldDataTypeMap.put("ORC-12-14-2", "ST");
    fieldDataTypeMap.put("ORC-12-14-3", "ID");
    fieldDataTypeMap.put("IN3-3-19-1", "DTM");
    fieldDataTypeMap.put("IN3-3-19-2", "ID");
    fieldDataTypeMap.put("PV1-52-23-4", "ST");
    fieldDataTypeMap.put("PV1-52-23-5", "ST");
    fieldDataTypeMap.put("PV1-52-23-2", "ST");
    fieldDataTypeMap.put("PV1-52-23-3", "ID");
    fieldDataTypeMap.put("PV1-52-23-1", "ST");
    fieldDataTypeMap.put("PV1-52-23-8", "ST");
    fieldDataTypeMap.put("PV1-52-23-9", "ST");
    fieldDataTypeMap.put("PV1-52-23-6", "ID");
    fieldDataTypeMap.put("PV1-52-23-7", "ST");
    fieldDataTypeMap.put("GT1-16-13", "TS");
    fieldDataTypeMap.put("GT1-16-12", "TS");
    fieldDataTypeMap.put("GT1-16-14", "ST");
    fieldDataTypeMap.put("PV1-8-7", "IS");
    fieldDataTypeMap.put("GT1-16-10", "DR");
    fieldDataTypeMap.put("PV1-8-22-1", "ST");
    fieldDataTypeMap.put("PV1-8-8", "IS");
    fieldDataTypeMap.put("GT1-16-11", "ID");
    fieldDataTypeMap.put("PV1-8-9", "HD");
    fieldDataTypeMap.put("PV1-8-22-4", "ST");
    fieldDataTypeMap.put("PV1-8-22-5", "ST");
    fieldDataTypeMap.put("PV1-8-22-2", "ST");
    fieldDataTypeMap.put("PV1-8-22-3", "ID");
    fieldDataTypeMap.put("IN2-7-9", "CE");
    fieldDataTypeMap.put("IN2-7-8", "ID");
    fieldDataTypeMap.put("IN2-7-7", "ID");
    fieldDataTypeMap.put("IN2-7-6", "IS");
    fieldDataTypeMap.put("PV1-17-14-1", "IS");
    fieldDataTypeMap.put("PV1-17-14-2", "ST");
    fieldDataTypeMap.put("GT1-21-6-1", "IS");
    fieldDataTypeMap.put("PV1-17-14-3", "ID");
    fieldDataTypeMap.put("GT1-21-6-2", "ST");
    fieldDataTypeMap.put("GT1-21-6-3", "ID");
    fieldDataTypeMap.put("ORC-21", "XON");
    fieldDataTypeMap.put("IN1-49-4-2", "ST");
    fieldDataTypeMap.put("IN2-9-1-5", "ST");
    fieldDataTypeMap.put("ORC-22", "XAD");
    fieldDataTypeMap.put("PID-18-1", "ST");
    fieldDataTypeMap.put("IN1-49-4-3", "ID");
    fieldDataTypeMap.put("IN2-9-1-4", "ST");
    fieldDataTypeMap.put("ORC-23", "XTN");
    fieldDataTypeMap.put("PID-18-2", "ST");
    fieldDataTypeMap.put("ORC-24", "XAD");
    fieldDataTypeMap.put("PID-18-3", "ID");
    fieldDataTypeMap.put("IN1-49-4-1", "IS");
    fieldDataTypeMap.put("IN2-9-1-1", "ST");
    fieldDataTypeMap.put("IN2-9-1-3", "ST");
    fieldDataTypeMap.put("ORC-20", "CE");
    fieldDataTypeMap.put("IN2-9-1-2", "ST");
    fieldDataTypeMap.put("PID-18-9", "CWE");
    fieldDataTypeMap.put("IN1-18-2", "ID");
    fieldDataTypeMap.put("ORC-29", "CWE");
    fieldDataTypeMap.put("PID-18-8", "DT");
    fieldDataTypeMap.put("IN1-18-1", "DTM");
    fieldDataTypeMap.put("ORC-26", "CWE");
    fieldDataTypeMap.put("PID-18-5", "ID");
    fieldDataTypeMap.put("ORC-25", "CWE");
    fieldDataTypeMap.put("PID-18-4", "HD");
    fieldDataTypeMap.put("ORC-28", "CWE");
    fieldDataTypeMap.put("PID-18-7", "DT");
    fieldDataTypeMap.put("ORC-27", "TS");
    fieldDataTypeMap.put("PID-18-6", "HD");
    fieldDataTypeMap.put("SFT-1-8-3", "ID");
    fieldDataTypeMap.put("SFT-1-8-1", "IS");
    fieldDataTypeMap.put("SFT-1-8-2", "ST");
    fieldDataTypeMap.put("NK1-28-5", "ST");
    fieldDataTypeMap.put("NK1-28-4", "ST");
    fieldDataTypeMap.put("PV1-8-1", "ST");
    fieldDataTypeMap.put("NK1-28-3", "ID");
    fieldDataTypeMap.put("PV1-8-2", "FN");
    fieldDataTypeMap.put("NK1-28-2", "ST");
    fieldDataTypeMap.put("PV1-8-3", "ST");
    fieldDataTypeMap.put("NK1-28-1", "ST");
    fieldDataTypeMap.put("PV1-8-4", "ST");
    fieldDataTypeMap.put("PV1-8-5", "ST");
    fieldDataTypeMap.put("PV1-8-6", "ST");
    fieldDataTypeMap.put("ORC-12", "XCN_IZ");
    fieldDataTypeMap.put("ORC-13", "PL");
    fieldDataTypeMap.put("ORC-10", "XCN_IZ");
    fieldDataTypeMap.put("ORC-11", "XCN");
    fieldDataTypeMap.put("OBX-24-14-1", "DTM");
    fieldDataTypeMap.put("OBX-24-14-2", "ID");
    fieldDataTypeMap.put("NK1-28-6", "ID");
    fieldDataTypeMap.put("IN2-7-1", "FN");
    fieldDataTypeMap.put("ORC-19", "XCN");
    fieldDataTypeMap.put("ORC-18", "CE");
    fieldDataTypeMap.put("ORC-17", "CE");
    fieldDataTypeMap.put("PV1-52-22-8", "ST");
    fieldDataTypeMap.put("IN2-7-5", "ST");
    fieldDataTypeMap.put("ORC-16", "CE");
    fieldDataTypeMap.put("PV1-52-22-7", "ST");
    fieldDataTypeMap.put("IN2-7-4", "ST");
    fieldDataTypeMap.put("ORC-15", "TS");
    fieldDataTypeMap.put("IN2-7-3", "ST");
    fieldDataTypeMap.put("ORC-14", "XTN");
    fieldDataTypeMap.put("PV1-52-22-9", "ST");
    fieldDataTypeMap.put("IN2-7-2", "ST");
    fieldDataTypeMap.put("PV1-52-22-4", "ST");
    fieldDataTypeMap.put("PV1-52-22-3", "ID");
    fieldDataTypeMap.put("PV1-52-22-6", "ID");
    fieldDataTypeMap.put("PV1-52-22-5", "ST");
    fieldDataTypeMap.put("PV1-52-22-2", "ST");
    fieldDataTypeMap.put("PV1-52-22-1", "ST");
    fieldDataTypeMap.put("RXR-0", "ST");
    fieldDataTypeMap.put("IN3-25-22-4", "ST");
    fieldDataTypeMap.put("IN3-25-22-5", "ST");
    fieldDataTypeMap.put("IN3-25-22-2", "ST");
    fieldDataTypeMap.put("IN3-25-22-3", "ID");
    fieldDataTypeMap.put("IN3-25-22-8", "ST");
    fieldDataTypeMap.put("IN3-25-22-9", "ST");
    fieldDataTypeMap.put("IN3-25-22-6", "ID");
    fieldDataTypeMap.put("IN3-25-22-7", "ST");
    fieldDataTypeMap.put("NK1-26-10", "DR");
    fieldDataTypeMap.put("PV1-7-16-6", "ID");
    fieldDataTypeMap.put("PV1-7-16-4", "ST");
    fieldDataTypeMap.put("PV1-7-16-5", "ST");
    fieldDataTypeMap.put("PV1-7-16-2", "ST");
    fieldDataTypeMap.put("PV1-7-16-3", "ID");
    fieldDataTypeMap.put("PV1-7-16-1", "ST");
    fieldDataTypeMap.put("NTE-4-1", "ST");
    fieldDataTypeMap.put("NK1-26-12", "TS");
    fieldDataTypeMap.put("NTE-4-2", "ST");
    fieldDataTypeMap.put("NK1-26-11", "ID");
    fieldDataTypeMap.put("RXR-5", "CE");
    fieldDataTypeMap.put("NK1-26-14", "ST");
    fieldDataTypeMap.put("RXR-6", "CWE");
    fieldDataTypeMap.put("NK1-26-13", "TS");
    fieldDataTypeMap.put("NTE-4-5", "ST");
    fieldDataTypeMap.put("RXR-3", "CE");
    fieldDataTypeMap.put("IN3-25-22-1", "ST");
    fieldDataTypeMap.put("NTE-4-6", "ID");
    fieldDataTypeMap.put("RXR-4", "CWE");
    fieldDataTypeMap.put("NTE-4-3", "ID");
    fieldDataTypeMap.put("RXR-1", "CE_IZ");
    fieldDataTypeMap.put("NTE-4-4", "ST");
    fieldDataTypeMap.put("RXR-2", "CWE_IZ");
    fieldDataTypeMap.put("PID-10-2", "ST");
    fieldDataTypeMap.put("PID-10-3", "ID");
    fieldDataTypeMap.put("IN2-43-6", "ID");
    fieldDataTypeMap.put("PID-10-1", "ST");
    fieldDataTypeMap.put("PID-10-6", "ID");
    fieldDataTypeMap.put("NK1-7-4", "ST");
    fieldDataTypeMap.put("IN2-43-3", "ID");
    fieldDataTypeMap.put("NK1-7-3", "ID");
    fieldDataTypeMap.put("IN2-43-2", "ST");
    fieldDataTypeMap.put("PID-10-4", "ST");
    fieldDataTypeMap.put("NK1-7-6", "ID");
    fieldDataTypeMap.put("IN2-43-5", "ST");
    fieldDataTypeMap.put("PID-10-5", "ST");
    fieldDataTypeMap.put("NK1-7-5", "ST");
    fieldDataTypeMap.put("IN2-43-4", "ST");
    fieldDataTypeMap.put("NK1-7-2", "ST");
    fieldDataTypeMap.put("IN2-43-1", "ST");
    fieldDataTypeMap.put("NK1-7-1", "ST");
    fieldDataTypeMap.put("IN1-30-19-2", "ID");
    fieldDataTypeMap.put("IN1-30-19-1", "DTM");
    fieldDataTypeMap.put("PID-3-10", "CWE");
    fieldDataTypeMap.put("IN3-3-23-9", "ST");
    fieldDataTypeMap.put("IN3-3-23-8", "ST");
    fieldDataTypeMap.put("IN3-3-23-7", "ST");
    fieldDataTypeMap.put("IN3-3-23-6", "ID");
    fieldDataTypeMap.put("IN3-3-23-5", "ST");
    fieldDataTypeMap.put("IN3-3-23-4", "ST");
    fieldDataTypeMap.put("IN3-3-23-3", "ID");
    fieldDataTypeMap.put("PID-5-12-1", "DTM");
    fieldDataTypeMap.put("IN3-12-4", "ST");
    fieldDataTypeMap.put("IN3-12-3", "ID");
    fieldDataTypeMap.put("IN3-12-2", "ST");
    fieldDataTypeMap.put("IN3-12-1", "ST");
    fieldDataTypeMap.put("IN3-12-6", "ID");
    fieldDataTypeMap.put("IN3-12-5", "ST");
    fieldDataTypeMap.put("GT1-29-6-1", "IS");
    fieldDataTypeMap.put("GT1-29-6-3", "ID");
    fieldDataTypeMap.put("GT1-29-6-2", "ST");
    fieldDataTypeMap.put("IN2-49-13-2", "ID");
    fieldDataTypeMap.put("IN2-49-13-1", "DTM");
    fieldDataTypeMap.put("PV1-7-22-9", "ST");
    fieldDataTypeMap.put("PID-22-6", "ID");
    fieldDataTypeMap.put("PID-22-5", "ST");
    fieldDataTypeMap.put("PID-22-4", "ST");
    fieldDataTypeMap.put("PID-22-3", "ID");
    fieldDataTypeMap.put("PV2-4-1", "ST");
    fieldDataTypeMap.put("ORC-12-2-2", "ST");
    fieldDataTypeMap.put("PV1-7-22-5", "ST");
    fieldDataTypeMap.put("ORC-12-2-3", "ST");
    fieldDataTypeMap.put("PV1-7-22-6", "ID");
    fieldDataTypeMap.put("ORC-12-2-4", "ST");
    fieldDataTypeMap.put("PV1-7-22-7", "ST");
    fieldDataTypeMap.put("ORC-12-2-5", "ST");
    fieldDataTypeMap.put("PV1-7-22-8", "ST");
    fieldDataTypeMap.put("PV2-4-6", "ID");
    fieldDataTypeMap.put("NK1-2-13-2", "ID");
    fieldDataTypeMap.put("ORC-12-2-1", "ST");
    fieldDataTypeMap.put("NK1-2-13-1", "DTM");
    fieldDataTypeMap.put("PID-22-2", "ST");
    fieldDataTypeMap.put("PV2-4-2", "ST");
    fieldDataTypeMap.put("PID-22-1", "ST");
    fieldDataTypeMap.put("PV2-4-3", "ID");
    fieldDataTypeMap.put("PV2-4-4", "ST");
    fieldDataTypeMap.put("PV2-4-5", "ST");
    fieldDataTypeMap.put("ORC-31", "CWE");
    fieldDataTypeMap.put("PID-3-10-7", "ST");
    fieldDataTypeMap.put("ORC-30", "CNE");
    fieldDataTypeMap.put("PID-3-10-6", "ID");
    fieldDataTypeMap.put("PID-3-10-9", "ST");
    fieldDataTypeMap.put("PID-3-10-8", "ST");
    fieldDataTypeMap.put("PID-3-10-3", "ID");
    fieldDataTypeMap.put("PID-3-10-2", "ST");
    fieldDataTypeMap.put("PID-3-10-5", "ST");
    fieldDataTypeMap.put("PID-3-10-4", "ST");
    fieldDataTypeMap.put("PID-5-12-2", "ID");
    fieldDataTypeMap.put("OBX-25-1", "ST");
    fieldDataTypeMap.put("OBX-25-2", "FN");
    fieldDataTypeMap.put("OBX-25-3", "ST");
    fieldDataTypeMap.put("OBX-25-4", "ST");
    fieldDataTypeMap.put("OBX-25-5", "ST");
    fieldDataTypeMap.put("OBX-25-6", "ST");
    fieldDataTypeMap.put("OBX-25-7", "IS");
    fieldDataTypeMap.put("OBX-25-8", "IS");
    fieldDataTypeMap.put("OBX-25-9", "HD");
    fieldDataTypeMap.put("PV1-7-22-4", "ST");
    fieldDataTypeMap.put("PID-6-12-1", "DTM");
    fieldDataTypeMap.put("PV1-7-22-3", "ID");
    fieldDataTypeMap.put("PID-6-12-2", "ID");
    fieldDataTypeMap.put("PV1-7-22-2", "ST");
    fieldDataTypeMap.put("PV1-7-22-1", "ST");
    fieldDataTypeMap.put("PD1-3-6-3", "ID");
    fieldDataTypeMap.put("PD1-3-6-1", "IS");
    fieldDataTypeMap.put("PD1-3-6-2", "ST");
    fieldDataTypeMap.put("OBX-16-8", "IS");
    fieldDataTypeMap.put("OBX-16-9", "HD");
    fieldDataTypeMap.put("PV1-17-20-2", "ID");
    fieldDataTypeMap.put("OBX-16-4", "ST");
    fieldDataTypeMap.put("PV1-17-20-1", "DTM");
    fieldDataTypeMap.put("OBX-16-5", "ST");
    fieldDataTypeMap.put("OBX-16-6", "ST");
    fieldDataTypeMap.put("OBX-16-7", "IS");
    fieldDataTypeMap.put("GT1-3-13-1", "DTM");
    fieldDataTypeMap.put("OBX-16-1", "ST");
    fieldDataTypeMap.put("OBX-16-2", "FN");
    fieldDataTypeMap.put("OBX-16-3", "ST");
    fieldDataTypeMap.put("GT1-3-13-2", "ID");
    fieldDataTypeMap.put("GT1-43-5", "ST");
    fieldDataTypeMap.put("GT1-43-6", "ID");
    fieldDataTypeMap.put("GT1-3-2", "ST");
    fieldDataTypeMap.put("GT1-3-1", "FN_IZ");
    fieldDataTypeMap.put("GT1-3-5", "ST");
    fieldDataTypeMap.put("GT1-3-6", "IS");
    fieldDataTypeMap.put("GT1-3-3", "ST");
    fieldDataTypeMap.put("GT1-3-4", "ST");
    fieldDataTypeMap.put("GT1-3-9", "CE");
    fieldDataTypeMap.put("GT1-43-4", "ST");
    fieldDataTypeMap.put("GT1-43-3", "ID");
    fieldDataTypeMap.put("GT1-3-7", "ID");
    fieldDataTypeMap.put("GT1-43-2", "ST");
    fieldDataTypeMap.put("GT1-3-8", "ID");
    fieldDataTypeMap.put("GT1-43-1", "ST");
    fieldDataTypeMap.put("ORC-10-13", "ID");
    fieldDataTypeMap.put("PV2-13-22-7", "ST");
    fieldDataTypeMap.put("ORC-10-12", "ID");
    fieldDataTypeMap.put("PV2-13-22-8", "ST");
    fieldDataTypeMap.put("ORC-10-11", "ST");
    fieldDataTypeMap.put("PV2-13-22-9", "ST");
    fieldDataTypeMap.put("ORC-10-10", "ID");
    fieldDataTypeMap.put("ORC-10-17", "DR");
    fieldDataTypeMap.put("PV2-13-22-3", "ID");
    fieldDataTypeMap.put("ORC-10-16", "CE");
    fieldDataTypeMap.put("PV2-13-22-4", "ST");
    fieldDataTypeMap.put("ORC-10-15", "ID");
    fieldDataTypeMap.put("PV2-13-22-5", "ST");
    fieldDataTypeMap.put("ORC-10-14", "HD");
    fieldDataTypeMap.put("PV2-13-22-6", "ID");
    fieldDataTypeMap.put("ORC-10-19", "TS");
    fieldDataTypeMap.put("ORC-10-18", "ID");
    fieldDataTypeMap.put("PV2-13-22-2", "ST");
    fieldDataTypeMap.put("PV2-13-22-1", "ST");
    fieldDataTypeMap.put("ORC-10-20", "TS");
    fieldDataTypeMap.put("ORC-11-22-4", "ST");
    fieldDataTypeMap.put("ORC-10-22", "CWE");
    fieldDataTypeMap.put("ORC-11-22-3", "ID");
    fieldDataTypeMap.put("ORC-10-21", "ST");
    fieldDataTypeMap.put("ORC-11-22-2", "ST");
    fieldDataTypeMap.put("ORC-11-22-1", "ST");
    fieldDataTypeMap.put("ORC-10-23", "CWE");
    fieldDataTypeMap.put("ORC-10-19-2", "ID");
    fieldDataTypeMap.put("GT1-19-10", "CWE");
    fieldDataTypeMap.put("ORC-10-19-1", "DTM");
    fieldDataTypeMap.put("ORC-11-22-9", "ST");
    fieldDataTypeMap.put("ORC-11-22-8", "ST");
    fieldDataTypeMap.put("ORC-11-22-7", "ST");
    fieldDataTypeMap.put("ORC-11-22-6", "ID");
    fieldDataTypeMap.put("ORC-11-22-5", "ST");
    fieldDataTypeMap.put("GT1-29-10-9", "ST");
    fieldDataTypeMap.put("GT1-29-10-7", "ST");
    fieldDataTypeMap.put("IN1-5-1-1", "ST");
    fieldDataTypeMap.put("GT1-29-10-8", "ST");
    fieldDataTypeMap.put("IN1-5-1-2", "ST");
    fieldDataTypeMap.put("GT1-29-10-5", "ST");
    fieldDataTypeMap.put("IN1-5-1-3", "ST");
    fieldDataTypeMap.put("GT1-29-10-6", "ID");
    fieldDataTypeMap.put("GT1-29-10-3", "ID");
    fieldDataTypeMap.put("GT1-29-10-4", "ST");
    fieldDataTypeMap.put("GT1-29-10-1", "ST");
    fieldDataTypeMap.put("GT1-29-10-2", "ST");
    fieldDataTypeMap.put("PD1-14-10", "ST");
    fieldDataTypeMap.put("IN3-8-8", "IS");
    fieldDataTypeMap.put("IN3-8-9", "HD");
    fieldDataTypeMap.put("IN3-8-4", "ST");
    fieldDataTypeMap.put("IN3-8-5", "ST");
    fieldDataTypeMap.put("IN3-8-6", "ST");
    fieldDataTypeMap.put("IN3-8-7", "IS");
    fieldDataTypeMap.put("ORC-10-22-2", "ST");
    fieldDataTypeMap.put("ORC-10-22-3", "ID");
    fieldDataTypeMap.put("ORC-10-22-1", "ST");
    fieldDataTypeMap.put("IN1-37-5-6", "ID");
    fieldDataTypeMap.put("ORC-10-22-8", "ST");
    fieldDataTypeMap.put("IN1-37-5-5", "ST");
    fieldDataTypeMap.put("ORC-10-22-9", "ST");
    fieldDataTypeMap.put("IN1-37-5-4", "ST");
    fieldDataTypeMap.put("ORC-10-22-6", "ID");
    fieldDataTypeMap.put("IN1-37-5-3", "ID");
    fieldDataTypeMap.put("ORC-10-22-7", "ST");
    fieldDataTypeMap.put("IN1-37-5-2", "ST");
    fieldDataTypeMap.put("ORC-10-22-4", "ST");
    fieldDataTypeMap.put("IN1-37-5-1", "ST");
    fieldDataTypeMap.put("ORC-10-22-5", "ST");
    fieldDataTypeMap.put("IN3-14-23-9", "ST");
    fieldDataTypeMap.put("IN3-14-23-7", "ST");
    fieldDataTypeMap.put("IN3-14-23-8", "ST");
    fieldDataTypeMap.put("IN3-14-23-5", "ST");
    fieldDataTypeMap.put("GT1-54-2", "TS");
    fieldDataTypeMap.put("IN3-14-23-6", "ID");
    fieldDataTypeMap.put("GT1-54-1", "IS");
    fieldDataTypeMap.put("IN3-14-23-3", "ID");
    fieldDataTypeMap.put("IN3-14-23-4", "ST");
    fieldDataTypeMap.put("IN3-14-23-1", "ST");
    fieldDataTypeMap.put("IN3-14-23-2", "ST");
    fieldDataTypeMap.put("NK1-30-9-3", "ID");
    fieldDataTypeMap.put("PD1-3-8-2", "ST");
    fieldDataTypeMap.put("NK1-30-9-4", "ST");
    fieldDataTypeMap.put("PD1-3-8-1", "IS");
    fieldDataTypeMap.put("NK1-30-9-5", "ST");
    fieldDataTypeMap.put("NK1-30-9-6", "ID");
    fieldDataTypeMap.put("PD1-3-8-3", "ID");
    fieldDataTypeMap.put("NK1-30-9-1", "ST");
    fieldDataTypeMap.put("NK1-30-9-2", "ST");
    fieldDataTypeMap.put("MSH-5", "HD_IZ_0361");
    fieldDataTypeMap.put("MSH-6", "HD_IZ_0362");
    fieldDataTypeMap.put("MSH-3", "HD_IZ_0361");
    fieldDataTypeMap.put("MSH-4", "HD_IZ_0362");
    fieldDataTypeMap.put("MSH-9", "MSG_IZ");
    fieldDataTypeMap.put("MSH-7", "TS_IZ");
    fieldDataTypeMap.put("MSH-8", "ST");
    fieldDataTypeMap.put("MSH-1", "ST");
    fieldDataTypeMap.put("MSH-2", "ST");
    fieldDataTypeMap.put("MSH-0", "ST");
    fieldDataTypeMap.put("IN2-3-9-1", "IS");
    fieldDataTypeMap.put("OBX-16-2-3", "ST");
    fieldDataTypeMap.put("IN3-8-3", "ST");
    fieldDataTypeMap.put("IN2-3-9-2", "ST");
    fieldDataTypeMap.put("OBX-16-2-4", "ST");
    fieldDataTypeMap.put("IN3-8-2", "FN");
    fieldDataTypeMap.put("IN2-3-9-3", "ID");
    fieldDataTypeMap.put("OBX-16-2-5", "ST");
    fieldDataTypeMap.put("IN3-8-1", "ST");
    fieldDataTypeMap.put("PID-18-10-1", "ST");
    fieldDataTypeMap.put("PID-18-10-2", "ST");
    fieldDataTypeMap.put("PID-18-10-3", "ID");
    fieldDataTypeMap.put("OBX-16-2-1", "ST");
    fieldDataTypeMap.put("PID-18-10-4", "ST");
    fieldDataTypeMap.put("OBX-16-2-2", "ST");
    fieldDataTypeMap.put("PID-18-10-5", "ST");
    fieldDataTypeMap.put("PID-18-10-6", "ID");
    fieldDataTypeMap.put("PID-18-10-7", "ST");
    fieldDataTypeMap.put("PID-18-10-8", "ST");
    fieldDataTypeMap.put("PID-18-10-9", "ST");
    fieldDataTypeMap.put("OBX-16-23-6", "ID");
    fieldDataTypeMap.put("OBX-16-23-7", "ST");
    fieldDataTypeMap.put("OBX-16-23-4", "ST");
    fieldDataTypeMap.put("OBX-16-23-5", "ST");
    fieldDataTypeMap.put("OBX-16-23-8", "ST");
    fieldDataTypeMap.put("OBX-16-23-9", "ST");
    fieldDataTypeMap.put("OBX-16-23-2", "ST");
    fieldDataTypeMap.put("OBX-16-23-3", "ID");
    fieldDataTypeMap.put("OBX-16-23-1", "ST");
    fieldDataTypeMap.put("PV2-13-9", "HD");
    fieldDataTypeMap.put("PV2-13-8", "IS");
    fieldDataTypeMap.put("PV2-13-7", "IS");
    fieldDataTypeMap.put("PV2-13-6", "ST");
    fieldDataTypeMap.put("PV2-13-5", "ST");
    fieldDataTypeMap.put("PV2-13-4", "ST");
    fieldDataTypeMap.put("PV2-13-3", "ST");
    fieldDataTypeMap.put("PV2-13-2", "FN");
    fieldDataTypeMap.put("PV2-13-1", "ST");
    fieldDataTypeMap.put("IN2-52-9-1", "ST");
    fieldDataTypeMap.put("IN2-52-9-2", "ST");
    fieldDataTypeMap.put("IN2-52-9-3", "ID");
    fieldDataTypeMap.put("IN2-52-9-5", "ST");
    fieldDataTypeMap.put("PV1-7-17", "DR");
    fieldDataTypeMap.put("IN2-52-9-4", "ST");
    fieldDataTypeMap.put("PV1-7-18", "ID");
    fieldDataTypeMap.put("PV1-7-15", "ID");
    fieldDataTypeMap.put("IN2-52-9-6", "ID");
    fieldDataTypeMap.put("PV1-7-16", "CE");
    populateFieldDataTypes3();
  }

  public void populateFieldDataTypes3() {
    fieldDataTypeMap.put("PV1-7-13", "ID");
    fieldDataTypeMap.put("PV1-7-14", "HD");
    fieldDataTypeMap.put("PV1-7-11", "ST");
    fieldDataTypeMap.put("PV1-7-12", "ID");
    fieldDataTypeMap.put("PV1-7-10", "ID");
    fieldDataTypeMap.put("ORC-27-1", "DTM");
    fieldDataTypeMap.put("ORC-27-2", "ID");
    fieldDataTypeMap.put("PV1-7-19", "TS");
    fieldDataTypeMap.put("MSH-11-1", "ID");
    fieldDataTypeMap.put("MSH-11-2", "ID");
    fieldDataTypeMap.put("PV1-7-22", "CWE");
    fieldDataTypeMap.put("PV1-7-23", "CWE");
    fieldDataTypeMap.put("PV1-7-20", "TS");
    fieldDataTypeMap.put("PV1-7-21", "ST");
    fieldDataTypeMap.put("GT1-0", "ST");
    fieldDataTypeMap.put("GT1-7", "XTN");
    fieldDataTypeMap.put("GT1-8", "TS");
    fieldDataTypeMap.put("GT1-5", "XAD");
    fieldDataTypeMap.put("GT1-6", "XTN");
    fieldDataTypeMap.put("GT1-3", "XPN_IZ");
    fieldDataTypeMap.put("GT1-4", "XPN");
    fieldDataTypeMap.put("GT1-1", "SI");
    fieldDataTypeMap.put("GT1-2", "CX");
    fieldDataTypeMap.put("MSH-19-1", "ST");
    fieldDataTypeMap.put("GT1-38-4", "ST");
    fieldDataTypeMap.put("GT1-38-3", "ID");
    fieldDataTypeMap.put("GT1-38-6", "ID");
    fieldDataTypeMap.put("GT1-38-5", "ST");
    fieldDataTypeMap.put("GT1-38-2", "ST");
    fieldDataTypeMap.put("GT1-9", "IS");
    fieldDataTypeMap.put("GT1-38-1", "ST");
    fieldDataTypeMap.put("MSH-19-9", "ST");
    fieldDataTypeMap.put("MSH-19-8", "ST");
    fieldDataTypeMap.put("MSH-19-7", "ST");
    fieldDataTypeMap.put("MSH-19-6", "ID");
    fieldDataTypeMap.put("MSH-19-5", "ST");
    fieldDataTypeMap.put("MSH-19-4", "ST");
    fieldDataTypeMap.put("MSH-19-3", "ID");
    fieldDataTypeMap.put("MSH-19-2", "ST");
    fieldDataTypeMap.put("RXA-9-1", "ST");
    fieldDataTypeMap.put("RXA-9-5", "ST");
    fieldDataTypeMap.put("RXA-9-4", "ST");
    fieldDataTypeMap.put("RXA-9-3", "ID");
    fieldDataTypeMap.put("RXA-9-2", "ST");
    fieldDataTypeMap.put("PV1-19-10", "CWE");
    fieldDataTypeMap.put("PID-3-9-1", "ST");
    fieldDataTypeMap.put("GT1-42-9-1", "ST");
    fieldDataTypeMap.put("RXA-9-6", "ID");
    fieldDataTypeMap.put("PID-3-9-2", "ST");
    fieldDataTypeMap.put("PID-3-9-3", "ID");
    fieldDataTypeMap.put("TQ1-5-2-1", "ST");
    fieldDataTypeMap.put("PID-3-9-4", "ST");
    fieldDataTypeMap.put("PID-3-9-5", "ST");
    fieldDataTypeMap.put("TQ1-5-2-3", "ID");
    fieldDataTypeMap.put("PID-3-9-6", "ID");
    fieldDataTypeMap.put("TQ1-5-2-2", "ST");
    fieldDataTypeMap.put("PID-3-9-7", "ST");
    fieldDataTypeMap.put("TQ1-5-2-5", "ST");
    fieldDataTypeMap.put("PID-3-9-8", "ST");
    fieldDataTypeMap.put("TQ1-5-2-4", "ST");
    fieldDataTypeMap.put("PID-3-9-9", "ST");
    fieldDataTypeMap.put("GT1-42-9-6", "ID");
    fieldDataTypeMap.put("TQ1-5-2-6", "ID");
    fieldDataTypeMap.put("GT1-42-9-4", "ST");
    fieldDataTypeMap.put("GT1-42-9-5", "ST");
    fieldDataTypeMap.put("GT1-42-9-2", "ST");
    fieldDataTypeMap.put("GT1-42-9-3", "ID");
    fieldDataTypeMap.put("PV2-47-2", "ID");
    fieldDataTypeMap.put("PV2-47-1", "DTM");
    fieldDataTypeMap.put("TQ1-7-2", "ID");
    fieldDataTypeMap.put("TQ1-7-1", "DTM");
    fieldDataTypeMap.put("GT1-17-1", "SAD");
    fieldDataTypeMap.put("GT1-17-2", "ST");
    fieldDataTypeMap.put("GT1-17-3", "ST");
    fieldDataTypeMap.put("GT1-17-4", "ST");
    fieldDataTypeMap.put("GT1-17-5", "ST");
    fieldDataTypeMap.put("PV1-3-4-2", "ST");
    fieldDataTypeMap.put("GT1-17-6", "ID");
    fieldDataTypeMap.put("PV1-3-4-1", "IS");
    fieldDataTypeMap.put("GT1-17-7", "ID");
    fieldDataTypeMap.put("GT1-17-8", "ST");
    fieldDataTypeMap.put("PV1-3-4-3", "ID");
    fieldDataTypeMap.put("GT1-17-9", "IS");
    fieldDataTypeMap.put("IN3-2-10-2", "ST");
    fieldDataTypeMap.put("IN3-2-10-3", "ID");
    fieldDataTypeMap.put("IN3-2-10-1", "ST");
    fieldDataTypeMap.put("IN3-2-10-9", "ST");
    fieldDataTypeMap.put("PID-18-6-2", "ST");
    fieldDataTypeMap.put("IN3-2-10-8", "ST");
    fieldDataTypeMap.put("PID-18-6-1", "IS");
    fieldDataTypeMap.put("IN3-2-10-5", "ST");
    fieldDataTypeMap.put("IN3-2-10-4", "ST");
    fieldDataTypeMap.put("IN3-2-10-7", "ST");
    fieldDataTypeMap.put("IN3-2-10-6", "ID");
    fieldDataTypeMap.put("PID-18-6-3", "ID");
    fieldDataTypeMap.put("IN1-2-6", "ID");
    fieldDataTypeMap.put("IN1-2-4", "ST");
    fieldDataTypeMap.put("IN1-2-5", "ST");
    fieldDataTypeMap.put("IN3-8-9-1", "IS");
    fieldDataTypeMap.put("IN3-8-9-2", "ST");
    fieldDataTypeMap.put("IN3-8-9-3", "ID");
    fieldDataTypeMap.put("IN1-2-2", "ST");
    fieldDataTypeMap.put("IN1-2-3", "ID");
    fieldDataTypeMap.put("IN1-2-1", "ST");
    fieldDataTypeMap.put("PV1-11-4", "HD");
    fieldDataTypeMap.put("PV1-11-3", "IS");
    fieldDataTypeMap.put("PV1-11-6", "IS");
    fieldDataTypeMap.put("PV1-11-5", "IS");
    fieldDataTypeMap.put("PV1-11-8", "IS");
    fieldDataTypeMap.put("PV1-11-7", "IS");
    fieldDataTypeMap.put("PV1-11-9", "ST");
    fieldDataTypeMap.put("ORC-13-10-1", "ST");
    fieldDataTypeMap.put("GT1-21-1", "ST");
    fieldDataTypeMap.put("GT1-21-2", "IS");
    fieldDataTypeMap.put("ORC-13-10-3", "ST");
    fieldDataTypeMap.put("GT1-21-3", "NM");
    fieldDataTypeMap.put("ORC-13-10-2", "IS");
    fieldDataTypeMap.put("GT1-21-4", "NM");
    fieldDataTypeMap.put("NK1-30-1-1", "ST");
    fieldDataTypeMap.put("ORC-13-10-4", "ID");
    fieldDataTypeMap.put("NK1-30-1-2", "ST");
    fieldDataTypeMap.put("PV1-11-2", "IS");
    fieldDataTypeMap.put("GT1-42-1-1", "ST");
    fieldDataTypeMap.put("PV1-11-1", "IS");
    fieldDataTypeMap.put("GT1-42-1-2", "ST");
    fieldDataTypeMap.put("PD1-14-8-3", "ID");
    fieldDataTypeMap.put("GT1-21-9", "ID");
    fieldDataTypeMap.put("GT1-42-1-3", "ST");
    fieldDataTypeMap.put("GT1-42-1-4", "ST");
    fieldDataTypeMap.put("GT1-42-1-5", "ST");
    fieldDataTypeMap.put("GT1-21-6", "HD");
    fieldDataTypeMap.put("GT1-21-5", "ID");
    fieldDataTypeMap.put("PD1-14-8-2", "ST");
    fieldDataTypeMap.put("GT1-21-8", "HD");
    fieldDataTypeMap.put("PD1-14-8-1", "IS");
    fieldDataTypeMap.put("GT1-21-7", "ID");
    fieldDataTypeMap.put("IN3-25-9-3", "ID");
    fieldDataTypeMap.put("IN3-25-9-1", "IS");
    fieldDataTypeMap.put("IN3-25-9-2", "ST");
    fieldDataTypeMap.put("IN1-9-10", "ST");
    fieldDataTypeMap.put("MSH-3-3", "ID");
    fieldDataTypeMap.put("MSH-3-2", "ST");
    fieldDataTypeMap.put("MSH-3-1", "IS");
    fieldDataTypeMap.put("PV1-19-9-3", "ID");
    fieldDataTypeMap.put("PV1-19-9-4", "ST");
    fieldDataTypeMap.put("PV1-19-9-5", "ST");
    fieldDataTypeMap.put("PV1-19-9-6", "ID");
    fieldDataTypeMap.put("PV1-19-9-1", "ST");
    fieldDataTypeMap.put("PV1-19-9-2", "ST");
    fieldDataTypeMap.put("PV1-19-9-9", "ST");
    fieldDataTypeMap.put("PV1-19-9-8", "ST");
    fieldDataTypeMap.put("PV1-19-9-7", "ST");
    fieldDataTypeMap.put("IN3-2-9-8", "ST");
    fieldDataTypeMap.put("IN3-2-9-9", "ST");
    fieldDataTypeMap.put("IN3-2-9-6", "ID");
    fieldDataTypeMap.put("IN3-2-9-7", "ST");
    fieldDataTypeMap.put("PV1-50-4-1", "IS");
    fieldDataTypeMap.put("PV1-50-4-2", "ST");
    fieldDataTypeMap.put("PV1-50-4-3", "ID");
    fieldDataTypeMap.put("IN1-37-5", "CE");
    fieldDataTypeMap.put("IN3-2-9-1", "ST");
    fieldDataTypeMap.put("IN1-37-4", "NM");
    fieldDataTypeMap.put("IN1-37-6", "ID");
    fieldDataTypeMap.put("IN3-2-9-4", "ST");
    fieldDataTypeMap.put("IN1-37-1", "MO");
    fieldDataTypeMap.put("IN3-2-9-5", "ST");
    fieldDataTypeMap.put("IN3-2-9-2", "ST");
    fieldDataTypeMap.put("PV1-11-10-3", "ST");
    fieldDataTypeMap.put("IN1-37-3", "NM");
    fieldDataTypeMap.put("IN3-2-9-3", "ID");
    fieldDataTypeMap.put("PV1-11-10-4", "ID");
    fieldDataTypeMap.put("IN1-37-2", "ID");
    fieldDataTypeMap.put("PV1-11-10-2", "IS");
    fieldDataTypeMap.put("NK1-13-2", "IS");
    fieldDataTypeMap.put("PV1-11-10-1", "ST");
    fieldDataTypeMap.put("NK1-13-3", "NM");
    fieldDataTypeMap.put("NK1-13-4", "NM");
    fieldDataTypeMap.put("NK1-13-5", "ID");
    fieldDataTypeMap.put("NK1-13-6", "HD");
    fieldDataTypeMap.put("NK1-13-7", "ID");
    fieldDataTypeMap.put("NK1-13-8", "HD");
    fieldDataTypeMap.put("NK1-13-9", "ID");
    fieldDataTypeMap.put("GT1-16-12-1", "DTM");
    fieldDataTypeMap.put("GT1-16-12-2", "ID");
    fieldDataTypeMap.put("IN3-8-16-4", "ST");
    fieldDataTypeMap.put("IN3-8-16-5", "ST");
    fieldDataTypeMap.put("IN3-8-16-6", "ID");
    fieldDataTypeMap.put("NK1-13-1", "ST");
    fieldDataTypeMap.put("PD1-10-10-8", "ST");
    fieldDataTypeMap.put("PD1-10-10-9", "ST");
    fieldDataTypeMap.put("PD1-10-10-2", "ST");
    fieldDataTypeMap.put("PD1-10-10-3", "ID");
    fieldDataTypeMap.put("PD1-10-10-1", "ST");
    fieldDataTypeMap.put("PD1-10-10-6", "ID");
    fieldDataTypeMap.put("IN2-9-12-2", "ID");
    fieldDataTypeMap.put("PD1-10-10-7", "ST");
    fieldDataTypeMap.put("PD1-10-10-4", "ST");
    fieldDataTypeMap.put("PD1-10-10-5", "ST");
    fieldDataTypeMap.put("IN2-9-12-1", "DTM");
    fieldDataTypeMap.put("PV1-7-3", "ST");
    fieldDataTypeMap.put("IN1-16-11", "ID");
    fieldDataTypeMap.put("PV1-7-2", "FN");
    fieldDataTypeMap.put("IN1-16-10", "DR");
    fieldDataTypeMap.put("PV1-7-1", "ST");
    fieldDataTypeMap.put("PV1-7-7", "IS");
    fieldDataTypeMap.put("PV1-7-6", "ST");
    fieldDataTypeMap.put("PV1-7-5", "ST");
    fieldDataTypeMap.put("PV1-7-4", "ST");
    fieldDataTypeMap.put("ORC-2-1", "ST");
    fieldDataTypeMap.put("ORC-2-2", "IS");
    fieldDataTypeMap.put("ORC-2-3", "ST");
    fieldDataTypeMap.put("ORC-2-4", "ID");
    fieldDataTypeMap.put("IN1-16-14", "ST");
    fieldDataTypeMap.put("IN1-16-13", "TS");
    fieldDataTypeMap.put("IN1-16-12", "TS");
    fieldDataTypeMap.put("PV1-52-2-5", "ST");
    fieldDataTypeMap.put("PV1-52-2-2", "ST");
    fieldDataTypeMap.put("PV1-52-2-1", "ST");
    fieldDataTypeMap.put("PV1-52-2-4", "ST");
    fieldDataTypeMap.put("PV1-52-2-3", "ST");
    fieldDataTypeMap.put("PV1-7-14-3", "ID");
    fieldDataTypeMap.put("PV1-7-14-2", "ST");
    fieldDataTypeMap.put("PID-38-6", "ID");
    fieldDataTypeMap.put("PID-38-1", "ST");
    fieldDataTypeMap.put("PV1-42-10", "EI");
    fieldDataTypeMap.put("PID-38-2", "ST");
    fieldDataTypeMap.put("PV1-42-11", "HD");
    fieldDataTypeMap.put("PID-38-3", "ID");
    fieldDataTypeMap.put("PID-38-4", "ST");
    fieldDataTypeMap.put("PID-38-5", "ST");
    fieldDataTypeMap.put("IN1-16-1", "FN");
    fieldDataTypeMap.put("IN1-16-2", "ST");
    fieldDataTypeMap.put("IN1-16-5", "ST");
    fieldDataTypeMap.put("IN1-16-6", "IS");
    fieldDataTypeMap.put("IN1-16-3", "ST");
    fieldDataTypeMap.put("IN1-16-4", "ST");
    fieldDataTypeMap.put("PV1-20-2-1", "DTM");
    fieldDataTypeMap.put("PV1-7-8", "IS");
    fieldDataTypeMap.put("PV1-7-9", "HD");
    fieldDataTypeMap.put("PV1-20-2-2", "ID");
    fieldDataTypeMap.put("ORC-11-8", "IS");
    fieldDataTypeMap.put("IN3-25-23-2", "ST");
    fieldDataTypeMap.put("ORC-11-9", "HD");
    fieldDataTypeMap.put("IN3-25-23-1", "ST");
    fieldDataTypeMap.put("IN3-25-23-4", "ST");
    fieldDataTypeMap.put("IN3-25-23-3", "ID");
    fieldDataTypeMap.put("IN3-25-23-6", "ID");
    fieldDataTypeMap.put("IN3-25-23-5", "ST");
    fieldDataTypeMap.put("IN3-25-23-8", "ST");
    fieldDataTypeMap.put("IN3-25-23-7", "ST");
    fieldDataTypeMap.put("ORC-11-1", "ST");
    fieldDataTypeMap.put("IN3-25-23-9", "ST");
    fieldDataTypeMap.put("IN1-16-9", "CE");
    fieldDataTypeMap.put("ORC-11-2", "FN");
    fieldDataTypeMap.put("IN1-16-8", "ID");
    fieldDataTypeMap.put("ORC-11-3", "ST");
    fieldDataTypeMap.put("IN1-16-7", "ID");
    fieldDataTypeMap.put("ORC-11-4", "ST");
    fieldDataTypeMap.put("ORC-11-5", "ST");
    fieldDataTypeMap.put("ORC-11-6", "ST");
    fieldDataTypeMap.put("ORC-11-7", "IS");
    fieldDataTypeMap.put("RXA-8", "CE");
    fieldDataTypeMap.put("ORC-23-10", "ST");
    fieldDataTypeMap.put("IN1-17-6", "ID");
    fieldDataTypeMap.put("RXA-9", "CE_IZ");
    fieldDataTypeMap.put("ORC-23-11", "ST");
    fieldDataTypeMap.put("RXA-6", "NM");
    fieldDataTypeMap.put("RXA-7", "CE_IZ");
    fieldDataTypeMap.put("RXA-4", "TS_IZ");
    fieldDataTypeMap.put("PID-17-1", "ST");
    fieldDataTypeMap.put("RXA-5", "CE_IZ");
    fieldDataTypeMap.put("PID-17-2", "ST");
    fieldDataTypeMap.put("RXA-2", "NM");
    fieldDataTypeMap.put("PID-17-3", "ID");
    fieldDataTypeMap.put("RXA-3", "TS_IZ");
    fieldDataTypeMap.put("PID-17-4", "ST");
    fieldDataTypeMap.put("NK1-20-6", "ID");
    fieldDataTypeMap.put("GT1-27-3", "NM");
    fieldDataTypeMap.put("GT1-27-4", "NM");
    fieldDataTypeMap.put("GT1-27-5", "CE");
    fieldDataTypeMap.put("GT1-27-6", "ID");
    fieldDataTypeMap.put("GT1-27-1", "MO");
    fieldDataTypeMap.put("GT1-27-2", "ID");
    fieldDataTypeMap.put("PID-17-6", "ID");
    fieldDataTypeMap.put("PID-17-5", "ST");
    fieldDataTypeMap.put("IN1-17-1", "ST");
    fieldDataTypeMap.put("RXA-10-19-1", "DTM");
    fieldDataTypeMap.put("IN1-17-3", "ID");
    fieldDataTypeMap.put("RXA-10-19-2", "ID");
    fieldDataTypeMap.put("IN1-17-2", "ST");
    fieldDataTypeMap.put("IN1-17-5", "ST");
    fieldDataTypeMap.put("IN1-17-4", "ST");
    fieldDataTypeMap.put("GT1-16-9-3", "ID");
    fieldDataTypeMap.put("GT1-19-4-3", "ID");
    fieldDataTypeMap.put("GT1-16-9-4", "ST");
    fieldDataTypeMap.put("GT1-16-9-5", "ST");
    fieldDataTypeMap.put("GT1-19-4-1", "IS");
    fieldDataTypeMap.put("GT1-16-9-6", "ID");
    fieldDataTypeMap.put("GT1-19-4-2", "ST");
    fieldDataTypeMap.put("IN2-1-10-1", "ST");
    fieldDataTypeMap.put("RXA-1", "NM");
    fieldDataTypeMap.put("RXA-0", "ST");
    fieldDataTypeMap.put("ORC-23-12", "ST");
    fieldDataTypeMap.put("IN2-1-10-2", "ST");
    fieldDataTypeMap.put("IN2-1-10-3", "ID");
    fieldDataTypeMap.put("IN2-1-10-4", "ST");
    fieldDataTypeMap.put("IN2-1-10-5", "ST");
    fieldDataTypeMap.put("IN2-1-10-6", "ID");
    fieldDataTypeMap.put("IN2-1-10-7", "ST");
    fieldDataTypeMap.put("PV2-3-2", "ST");
    fieldDataTypeMap.put("IN2-1-10-8", "ST");
    fieldDataTypeMap.put("PV2-3-1", "ST");
    fieldDataTypeMap.put("IN2-1-10-9", "ST");
    fieldDataTypeMap.put("PV2-3-4", "ST");
    fieldDataTypeMap.put("PV2-3-3", "ID");
    fieldDataTypeMap.put("TQ1-14", "NM");
    fieldDataTypeMap.put("PV2-3-6", "ID");
    fieldDataTypeMap.put("PV2-3-5", "ST");
    fieldDataTypeMap.put("TQ1-12", "ID");
    fieldDataTypeMap.put("TQ1-13", "CQ");
    fieldDataTypeMap.put("TQ1-10", "TX");
    fieldDataTypeMap.put("TQ1-11", "TX");
    fieldDataTypeMap.put("ORC-19-9-1", "IS");
    fieldDataTypeMap.put("ORC-19-9-2", "ST");
    fieldDataTypeMap.put("ORC-19-9-3", "ID");
    fieldDataTypeMap.put("IN2-25-4-2", "ST");
    fieldDataTypeMap.put("IN2-25-4-1", "IS");
    fieldDataTypeMap.put("IN2-50-11", "ST");
    fieldDataTypeMap.put("IN2-50-12", "ST");
    fieldDataTypeMap.put("IN2-25-4-3", "ID");
    fieldDataTypeMap.put("IN2-50-10", "ST");
    fieldDataTypeMap.put("PV1-52-19-1", "DTM");
    fieldDataTypeMap.put("PV1-52-19-2", "ID");
    fieldDataTypeMap.put("PID-3-1", "ST");
    fieldDataTypeMap.put("PID-3-3", "ID");
    fieldDataTypeMap.put("PID-3-2", "ST");
    fieldDataTypeMap.put("PID-3-9", "CWE");
    fieldDataTypeMap.put("PID-3-8", "DT");
    fieldDataTypeMap.put("PID-3-5", "ID");
    fieldDataTypeMap.put("PID-3-4", "HD_IZ_0363");
    fieldDataTypeMap.put("PID-3-7", "DT");
    fieldDataTypeMap.put("PID-3-6", "HD");
    fieldDataTypeMap.put("IN3-8-22-9", "ST");
    fieldDataTypeMap.put("IN2-61-10-1", "ST");
    fieldDataTypeMap.put("IN2-61-10-2", "ST");
    fieldDataTypeMap.put("IN2-61-10-3", "ID");
    fieldDataTypeMap.put("NK1-29-3", "ID");
    fieldDataTypeMap.put("NK1-29-4", "ST");
    fieldDataTypeMap.put("NK1-29-1", "ST");
    fieldDataTypeMap.put("NK1-29-2", "ST");
    fieldDataTypeMap.put("IN3-8-22-2", "ST");
    fieldDataTypeMap.put("IN2-61-10-8", "ST");
    fieldDataTypeMap.put("IN3-13-2", "ID");
    fieldDataTypeMap.put("IN3-8-22-1", "ST");
    fieldDataTypeMap.put("IN2-61-10-9", "ST");
    fieldDataTypeMap.put("IN3-13-1", "DTM");
    fieldDataTypeMap.put("IN3-8-22-4", "ST");
    fieldDataTypeMap.put("NK1-29-5", "ST");
    fieldDataTypeMap.put("IN3-8-22-3", "ID");
    fieldDataTypeMap.put("NK1-29-6", "ID");
    fieldDataTypeMap.put("IN3-23", "IS");
    fieldDataTypeMap.put("IN3-8-22-6", "ID");
    fieldDataTypeMap.put("IN2-61-10-4", "ST");
    fieldDataTypeMap.put("IN3-24", "IS");
    fieldDataTypeMap.put("IN3-8-22-5", "ST");
    fieldDataTypeMap.put("IN3-8-16-1", "ST");
    fieldDataTypeMap.put("IN2-61-10-5", "ST");
    fieldDataTypeMap.put("IN3-25", "XCN");
    fieldDataTypeMap.put("IN3-8-22-8", "ST");
    fieldDataTypeMap.put("IN3-8-16-2", "ST");
    fieldDataTypeMap.put("IN2-61-10-6", "ID");
    fieldDataTypeMap.put("IN3-8-22-7", "ST");
    fieldDataTypeMap.put("IN3-8-16-3", "ID");
    fieldDataTypeMap.put("IN2-61-10-7", "ST");
    fieldDataTypeMap.put("IN3-14", "XCN");
    fieldDataTypeMap.put("IN3-15", "ST");
    fieldDataTypeMap.put("PID-6-13-2", "ID");
    fieldDataTypeMap.put("IN3-12", "CE");
    fieldDataTypeMap.put("IN3-13", "TS");
    fieldDataTypeMap.put("IN3-18", "CE");
    fieldDataTypeMap.put("IN3-19", "XTN");
    fieldDataTypeMap.put("IN3-16", "XTN");
    fieldDataTypeMap.put("IN3-17", "CE");
    fieldDataTypeMap.put("PV2-49", "IS");
    fieldDataTypeMap.put("PV2-47", "TS");
    fieldDataTypeMap.put("PV2-48", "TS");
    fieldDataTypeMap.put("IN3-22", "DT");
    fieldDataTypeMap.put("PV2-45", "CE");
    fieldDataTypeMap.put("IN3-21", "ST");
    fieldDataTypeMap.put("PV2-46", "DT");
    fieldDataTypeMap.put("IN3-20", "ICD");
    fieldDataTypeMap.put("PV2-43", "IS");
    fieldDataTypeMap.put("PV2-44", "IS");
    fieldDataTypeMap.put("OBX-24-2", "ST");
    fieldDataTypeMap.put("OBX-24-1", "SAD");
    fieldDataTypeMap.put("PID-5-13-2", "ID");
    fieldDataTypeMap.put("PID-5-13-1", "DTM");
    fieldDataTypeMap.put("MSH-4-1", "IS");
    fieldDataTypeMap.put("MSH-4-2", "ST");
    fieldDataTypeMap.put("MSH-4-3", "ID");
    fieldDataTypeMap.put("PID-6-13-1", "DTM");
    fieldDataTypeMap.put("IN3-11", "DTN");
    fieldDataTypeMap.put("IN3-10", "DT");
    fieldDataTypeMap.put("OBX-24-7", "ID");
    fieldDataTypeMap.put("NK1-20-5", "ST");
    fieldDataTypeMap.put("OBX-24-8", "ST");
    fieldDataTypeMap.put("NK1-20-4", "ST");
    fieldDataTypeMap.put("OBX-24-9", "IS");
    fieldDataTypeMap.put("NK1-20-3", "ID");
    fieldDataTypeMap.put("NK1-20-2", "ST");
    fieldDataTypeMap.put("OBX-24-3", "ST");
    fieldDataTypeMap.put("NK1-20-1", "ST");
    fieldDataTypeMap.put("OBX-24-4", "ST");
    fieldDataTypeMap.put("OBX-24-5", "ST");
    fieldDataTypeMap.put("OBX-24-6", "ID");
    fieldDataTypeMap.put("PV2-29", "DT");
    fieldDataTypeMap.put("IN2-26-9-4", "ST");
    fieldDataTypeMap.put("IN2-26-9-3", "ID");
    fieldDataTypeMap.put("IN2-26-9-2", "ST");
    fieldDataTypeMap.put("IN2-26-9-1", "ST");
    fieldDataTypeMap.put("PV2-22", "ID");
    fieldDataTypeMap.put("IN2-26-9-8", "ST");
    fieldDataTypeMap.put("PV2-21", "IS");
    fieldDataTypeMap.put("IN2-26-9-7", "ST");
    fieldDataTypeMap.put("PV2-24", "IS");
    fieldDataTypeMap.put("IN2-26-9-6", "ID");
    fieldDataTypeMap.put("PV2-23", "XON");
    fieldDataTypeMap.put("IN2-26-9-5", "ST");
    fieldDataTypeMap.put("PV2-26", "DT");
    fieldDataTypeMap.put("PV2-25", "IS");
    fieldDataTypeMap.put("PV2-28", "DT");
    fieldDataTypeMap.put("PV2-27", "IS");
    fieldDataTypeMap.put("IN2-26-9-9", "ST");
    fieldDataTypeMap.put("IN2-33-3", "ID");
    fieldDataTypeMap.put("IN2-33-4", "ST");
    fieldDataTypeMap.put("IN2-33-1", "ST");
    fieldDataTypeMap.put("IN2-33-2", "ST");
    fieldDataTypeMap.put("PV2-30", "CE");
    fieldDataTypeMap.put("PV2-31", "IS");
    fieldDataTypeMap.put("IN2-33-5", "ST");
    fieldDataTypeMap.put("IN2-33-6", "ID");
    fieldDataTypeMap.put("GT1-2-3", "ID");
    fieldDataTypeMap.put("GT1-2-2", "ST");
    fieldDataTypeMap.put("GT1-2-1", "ST");
    fieldDataTypeMap.put("PV2-35", "ID");
    fieldDataTypeMap.put("GT1-42-12-2", "ID");
    fieldDataTypeMap.put("PV2-34", "ID");
    fieldDataTypeMap.put("PV2-33", "TS");
    fieldDataTypeMap.put("PV2-32", "ID");
    fieldDataTypeMap.put("PV2-39", "CE");
    fieldDataTypeMap.put("PV2-38", "CE");
    fieldDataTypeMap.put("PV2-37", "ID");
    fieldDataTypeMap.put("PV2-36", "ID");
    fieldDataTypeMap.put("GT1-42-12-1", "DTM");
    fieldDataTypeMap.put("GT1-45-12-2", "ID");
    fieldDataTypeMap.put("GT1-45-12-1", "DTM");
    fieldDataTypeMap.put("PV2-41", "CE");
    fieldDataTypeMap.put("PV2-42", "CE");
    fieldDataTypeMap.put("PV2-40", "CE");
    fieldDataTypeMap.put("GT1-2-8", "DT");
    fieldDataTypeMap.put("GT1-2-9", "CWE");
    fieldDataTypeMap.put("GT1-2-6", "HD");
    fieldDataTypeMap.put("GT1-2-7", "DT");
    fieldDataTypeMap.put("GT1-2-4", "HD");
    fieldDataTypeMap.put("GT1-2-5", "ID");
    fieldDataTypeMap.put("PV2-23-6-3", "ID");
    fieldDataTypeMap.put("PV2-13-16-6", "ID");
    fieldDataTypeMap.put("PV2-23-6-2", "ST");
    fieldDataTypeMap.put("PV2-13-16-1", "ST");
    fieldDataTypeMap.put("PV2-13-23-2", "ST");
    fieldDataTypeMap.put("TQ1-8-1", "DTM");
    fieldDataTypeMap.put("PV2-13-23-3", "ID");
    fieldDataTypeMap.put("PV2-13-23-4", "ST");
    fieldDataTypeMap.put("PV2-13-23-5", "ST");
    fieldDataTypeMap.put("PV2-13-16-5", "ST");
    fieldDataTypeMap.put("PV2-13-23-6", "ID");
    fieldDataTypeMap.put("PV2-13-16-4", "ST");
    fieldDataTypeMap.put("PV2-13-23-7", "ST");
    fieldDataTypeMap.put("TQ1-8-2", "ID");
    fieldDataTypeMap.put("PV2-13-16-3", "ID");
    fieldDataTypeMap.put("PV2-13-23-8", "ST");
    fieldDataTypeMap.put("PV2-13-16-2", "ST");
    fieldDataTypeMap.put("PV2-13-23-9", "ST");
    fieldDataTypeMap.put("PV2-13-23-1", "ST");
    fieldDataTypeMap.put("PV2-23-6-1", "IS");
    fieldDataTypeMap.put("ORC-11-23-7", "ST");
    fieldDataTypeMap.put("ORC-11-23-6", "ID");
    fieldDataTypeMap.put("ORC-11-23-5", "ST");
    fieldDataTypeMap.put("ORC-11-23-4", "ST");
    fieldDataTypeMap.put("ORC-11-23-9", "ST");
    fieldDataTypeMap.put("PV2-19", "ID");
    fieldDataTypeMap.put("ORC-11-23-8", "ST");
    fieldDataTypeMap.put("PV2-18", "IS");
    fieldDataTypeMap.put("PV2-17", "DT");
    fieldDataTypeMap.put("PV2-16", "IS");
    fieldDataTypeMap.put("PV2-15", "ID");
    fieldDataTypeMap.put("PV2-14", "DT");
    fieldDataTypeMap.put("ORC-11-23-3", "ID");
    fieldDataTypeMap.put("PV2-13", "XCN");
    fieldDataTypeMap.put("ORC-11-23-2", "ST");
    fieldDataTypeMap.put("PV2-12", "ST");
    fieldDataTypeMap.put("ORC-11-23-1", "ST");
    fieldDataTypeMap.put("PV2-11", "NM");
    fieldDataTypeMap.put("PV2-10", "NM");
    fieldDataTypeMap.put("PV2-20", "NM");
    fieldDataTypeMap.put("IN1-0", "ST");
    fieldDataTypeMap.put("IN2-3-2-5", "ST");
    fieldDataTypeMap.put("TQ2-8", "CQ");
    fieldDataTypeMap.put("TQ2-9", "NM");
    fieldDataTypeMap.put("IN1-9", "XON");
    fieldDataTypeMap.put("OBX-15-2", "ST");
    fieldDataTypeMap.put("IN1-5", "XAD");
    fieldDataTypeMap.put("OBX-15-1", "ST");
    fieldDataTypeMap.put("IN1-6", "XPN");
    fieldDataTypeMap.put("OBX-15-4", "ST");
    fieldDataTypeMap.put("IN1-7", "XTN");
    fieldDataTypeMap.put("OBX-15-3", "ID");
    fieldDataTypeMap.put("IN1-8", "ST");
    fieldDataTypeMap.put("OBX-15-6", "ID");
    fieldDataTypeMap.put("IN1-1", "SI");
    fieldDataTypeMap.put("OBX-15-5", "ST");
    fieldDataTypeMap.put("IN1-2", "CE");
    fieldDataTypeMap.put("IN1-3", "CX");
    fieldDataTypeMap.put("IN1-4", "XON");
    fieldDataTypeMap.put("ORC-10-23-5", "ST");
    fieldDataTypeMap.put("ORC-10-23-6", "ID");
    fieldDataTypeMap.put("ORC-10-23-3", "ID");
    fieldDataTypeMap.put("IN1-44-9", "IS");
    fieldDataTypeMap.put("ORC-10-23-4", "ST");
    fieldDataTypeMap.put("IN1-44-8", "ST");
    fieldDataTypeMap.put("ORC-10-23-9", "ST");
    fieldDataTypeMap.put("IN1-44-7", "ID");
    fieldDataTypeMap.put("IN1-44-6", "ID");
    fieldDataTypeMap.put("ORC-10-23-7", "ST");
    fieldDataTypeMap.put("IN1-44-5", "ST");
    fieldDataTypeMap.put("ORC-10-23-8", "ST");
    fieldDataTypeMap.put("IN1-44-4", "ST");
    fieldDataTypeMap.put("GT1-55-6", "ID");
    fieldDataTypeMap.put("IN1-44-3", "ST");
    fieldDataTypeMap.put("IN1-44-2", "ST");
    fieldDataTypeMap.put("GT1-55-4", "ST");
    fieldDataTypeMap.put("IN1-44-1", "SAD");
    fieldDataTypeMap.put("GT1-55-5", "ST");
    fieldDataTypeMap.put("ORC-10-23-1", "ST");
    fieldDataTypeMap.put("ORC-10-23-2", "ST");
    fieldDataTypeMap.put("GT1-44-6", "ID");
    fieldDataTypeMap.put("GT1-44-5", "ST");
    fieldDataTypeMap.put("GT1-44-4", "ST");
    fieldDataTypeMap.put("GT1-44-2", "ST");
    fieldDataTypeMap.put("GT1-44-3", "ID");
    fieldDataTypeMap.put("GT1-44-1", "ST");
    fieldDataTypeMap.put("GT1-55-3", "ID");
    fieldDataTypeMap.put("IN2-3-2-2", "ST");
    fieldDataTypeMap.put("GT1-55-2", "ST");
    fieldDataTypeMap.put("IN2-3-2-1", "ST");
    fieldDataTypeMap.put("GT1-55-1", "ST");
    fieldDataTypeMap.put("IN2-3-2-4", "ST");
    fieldDataTypeMap.put("IN2-3-2-3", "ST");
    fieldDataTypeMap.put("PD1-4-9-3", "ID");
    fieldDataTypeMap.put("PD1-4-9-1", "IS");
    fieldDataTypeMap.put("PD1-4-9-2", "ST");
    fieldDataTypeMap.put("GT1-16-9-1", "ST");
    fieldDataTypeMap.put("GT1-16-9-2", "ST");
    fieldDataTypeMap.put("TQ2-1", "SI");
    fieldDataTypeMap.put("IN2-7-9-5", "ST");
    fieldDataTypeMap.put("TQ2-0", "ST");
    fieldDataTypeMap.put("IN2-7-9-4", "ST");
    fieldDataTypeMap.put("TQ2-3", "EI");
    fieldDataTypeMap.put("NK1-6-8", "NM");
    fieldDataTypeMap.put("IN2-7-9-3", "ID");
    fieldDataTypeMap.put("TQ2-2", "ID");
    fieldDataTypeMap.put("NK1-6-9", "ST");
    fieldDataTypeMap.put("IN2-7-9-2", "ST");
    fieldDataTypeMap.put("TQ2-5", "EI");
    fieldDataTypeMap.put("TQ2-4", "EI");
    fieldDataTypeMap.put("TQ2-7", "ID");
    fieldDataTypeMap.put("TQ2-6", "ID");
    fieldDataTypeMap.put("IN2-7-9-6", "ID");
    fieldDataTypeMap.put("NK1-6-2", "ID");
    fieldDataTypeMap.put("NK1-13-6-2", "ST");
    fieldDataTypeMap.put("NK1-6-3", "ID");
    fieldDataTypeMap.put("NK1-13-6-1", "IS");
    fieldDataTypeMap.put("NK1-6-1", "ST");
    fieldDataTypeMap.put("NK1-13-6-3", "ID");
    fieldDataTypeMap.put("NK1-6-6", "NM");
    fieldDataTypeMap.put("IN2-7-9-1", "ST");
    fieldDataTypeMap.put("NK1-6-7", "NM");
    fieldDataTypeMap.put("NK1-6-4", "ST");
    fieldDataTypeMap.put("NK1-6-5", "NM");
  }

  public void populateFieldDescriptions() {
    fieldDescMap.put("IN1-4-10", "Insurance Company Name - Organization Identifier");
    fieldDescMap.put("IN1-30-20-1", "Verification By - Expiration Date - Time");
    fieldDescMap.put("IN1-30-20-2", "Verification By - Expiration Date - Degree of Precision");
    fieldDescMap.put("PD1-4-2-5",
        "Patient Primary Care Provider Name & ID No. - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("PD1-4-2-4",
        "Patient Primary Care Provider Name & ID No. - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("PV1-6-7", "Prior Patient Location - Building");
    fieldDescMap.put("PV1-6-8", "Prior Patient Location - Floor");
    fieldDescMap.put("PV1-6-5", "Prior Patient Location - Location Status");
    fieldDescMap.put("PV1-6-6", "Prior Patient Location - Person Location Type");
    fieldDescMap.put("PV1-6-3", "Prior Patient Location - Bed");
    fieldDescMap.put("PV1-6-4", "Prior Patient Location - Facility");
    fieldDescMap.put("PV1-6-1", "Prior Patient Location - Point of Care");
    fieldDescMap.put("PV1-6-2", "Prior Patient Location - Room");
    fieldDescMap.put("IN2-25-6-1", "Payor ID - Assigning Facility - Namespace ID");
    fieldDescMap.put("IN2-25-6-2", "Payor ID - Assigning Facility - Universal ID");
    fieldDescMap.put("IN2-25-6-3", "Payor ID - Assigning Facility - Universal ID Type");
    fieldDescMap.put("PD1-4-2-2",
        "Patient Primary Care Provider Name & ID No. - Family Name - Own Surname Prefix");
    fieldDescMap.put("PD1-4-2-3",
        "Patient Primary Care Provider Name & ID No. - Family Name - Own Surname");
    fieldDescMap
        .put("PD1-4-2-1", "Patient Primary Care Provider Name & ID No. - Family Name - Surname");
    fieldDescMap.put("IN2-49-1-3", "Employer Contact Person Name - Family Name - Own Surname");
    fieldDescMap
        .put("IN2-49-1-2", "Employer Contact Person Name - Family Name - Own Surname Prefix");
    fieldDescMap.put("NK1-26-13-2", "Mother's Maiden Name - Expiration Date - Degree of Precision");
    fieldDescMap.put("IN2-49-1-1", "Employer Contact Person Name - Family Name - Surname");
    fieldDescMap.put("NK1-26-13-1", "Mother's Maiden Name - Expiration Date - Time");
    fieldDescMap.put("PV1-5-4-1", "Preadmit Number - Assigning Authority - Namespace ID");
    fieldDescMap.put("PV1-5-4-2", "Preadmit Number - Assigning Authority - Universal ID");
    fieldDescMap.put("GT1-4-12-2", "Guarantor Spouse Name - Effective Date - Degree of Precision");
    fieldDescMap.put("RXA-16-1", "Substance Expiration Date - Time");
    fieldDescMap.put("RXA-16-2", "Substance Expiration Date - Degree of Precision");
    fieldDescMap.put("IN2-49-1-4",
        "Employer Contact Person Name - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("IN2-49-1-5",
        "Employer Contact Person Name - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("GT1-4-12-1", "Guarantor Spouse Name - Effective Date - Time");
    fieldDescMap.put("IN1-49-10-2", "Insured's ID Number - Assigning Agency or Department - Text");
    fieldDescMap
        .put("IN1-49-10-1", "Insured's ID Number - Assigning Agency or Department - Identifier");
    fieldDescMap
        .put("PV1-11-11-1", "Temporary Location - Assigning Authority for Location - Namespace ID");
    fieldDescMap.put("IN1-49-10-6",
        "Insured's ID Number - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("IN1-49-10-5",
        "Insured's ID Number - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("IN1-30-9-2", "Verification By - Assigning Authority - Universal ID");
    fieldDescMap.put("IN1-49-10-4",
        "Insured's ID Number - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("IN1-30-9-1", "Verification By - Assigning Authority - Namespace ID");
    fieldDescMap.put("IN1-49-10-3",
        "Insured's ID Number - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("NTE-1", "Set ID - NTE");
    fieldDescMap.put("NTE-0", "Notes and Comments for PID");
    fieldDescMap.put("NTE-3", "Comment");
    fieldDescMap.put("NTE-2", "Source of Comment");
    fieldDescMap.put("NTE-4", "Comment Type");
    fieldDescMap.put("PV1-17-9-2", "Admitting Doctor - Assigning Authority - Universal ID");
    fieldDescMap.put("PV1-17-9-1", "Admitting Doctor - Assigning Authority - Namespace ID");
    fieldDescMap.put("PV1-17-9-3", "Admitting Doctor - Assigning Authority - Universal ID Type");
    fieldDescMap.put("PV1-6-10-3",
        "Prior Patient Location - Comprehensive Location Identifier - Universal ID");
    fieldDescMap.put("PV1-6-10-4",
        "Prior Patient Location - Comprehensive Location Identifier - Universal ID Type");
    fieldDescMap.put("PV1-6-10-1",
        "Prior Patient Location - Comprehensive Location Identifier - Entity Identifier");
    fieldDescMap.put("PV1-6-10-2",
        "Prior Patient Location - Comprehensive Location Identifier - Namespace ID");
    fieldDescMap.put("PV1-5-4-3", "Preadmit Number - Assigning Authority - Universal ID Type");
    fieldDescMap.put("IN1-30-9-3", "Verification By - Assigning Authority - Universal ID Type");
    fieldDescMap
        .put("IN1-49-10-9", "Insured's ID Number - Assigning Agency or Department - Original Text");
    fieldDescMap
        .put("PV1-11-11-2", "Temporary Location - Assigning Authority for Location - Universal ID");
    fieldDescMap.put("IN1-49-10-7",
        "Insured's ID Number - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("PV1-11-11-3",
        "Temporary Location - Assigning Authority for Location - Universal ID Type");
    fieldDescMap.put("IN1-49-10-8",
        "Insured's ID Number - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("IN2-69-10", "Insured Organization Name and ID - Organization Identifier");
    fieldDescMap.put("ORC-10-14-3", "Entered By - Assigning Facility - Universal ID Type");
    fieldDescMap.put("ORC-10-14-2", "Entered By - Assigning Facility - Universal ID");
    fieldDescMap.put("ORC-10-14-1", "Entered By - Assigning Facility - Namespace ID");
    fieldDescMap.put("IN3-6-1", "Certification Date/Time - Time");
    fieldDescMap.put("IN3-6-2", "Certification Date/Time - Degree of Precision");
    fieldDescMap.put("IN3-14-8", "Physician Reviewer - Source Table");
    fieldDescMap.put("IN3-14-7", "Physician Reviewer - Degree (e.g., MD)");
    fieldDescMap.put("IN3-14-9", "Physician Reviewer - Assigning Authority");
    fieldDescMap
        .put("IN3-14-4", "Physician Reviewer - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("IN3-14-3", "Physician Reviewer - Given Name");
    fieldDescMap.put("IN3-14-6", "Physician Reviewer - Prefix (e.g., DR)");
    fieldDescMap.put("IN3-14-5", "Physician Reviewer - Suffix (e.g., JR or III)");
    fieldDescMap.put("RXR-5-2", "Routing Instruction - Text");
    fieldDescMap.put("RXR-5-1", "Routing Instruction - Identifier");
    fieldDescMap.put("RXR-5-4", "Routing Instruction - Alternate Identifier");
    fieldDescMap.put("IN3-14-2", "Physician Reviewer - Family Name");
    fieldDescMap.put("RXR-5-3", "Routing Instruction - Name of Coding System");
    fieldDescMap.put("IN3-14-1", "Physician Reviewer - ID Number");
    fieldDescMap.put("RXR-5-6", "Routing Instruction - Name of Alternate Coding System");
    fieldDescMap.put("RXR-5-5", "Routing Instruction - Alternate Text");
    fieldDescMap.put("IN3-3-12", "Certified By - Check Digit Scheme");
    fieldDescMap.put("IN3-3-13", "Certified By - Identifier Type Code");
    fieldDescMap.put("IN1-7-12", "Insurance Co Phone Number - Unformatted Telephone number");
    fieldDescMap.put("IN3-3-10", "Certified By - Name Type Code");
    fieldDescMap.put("IN3-3-11", "Certified By - Identifier Check Digit");
    fieldDescMap.put("IN3-3-16", "Certified By - Name Context");
    fieldDescMap.put("IN3-3-17", "Certified By - Name Validity Range");
    fieldDescMap.put("IN3-3-14", "Certified By - Assigning Facility");
    fieldDescMap.put("IN3-3-15", "Certified By - Name Representation Code");
    fieldDescMap.put("IN1-7-11", "Insurance Co Phone Number - Speed Dial Code");
    fieldDescMap.put("IN1-7-10", "Insurance Co Phone Number - Extension Prefix");
    fieldDescMap.put("GT1-4-2", "Guarantor Spouse Name - Given Name");
    fieldDescMap.put("IN2-22-9", "Special Coverage Approval Name - Name Context");
    fieldDescMap.put("GT1-4-3",
        "Guarantor Spouse Name - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("GT1-4-4", "Guarantor Spouse Name - Suffix (e.g., JR or III)");
    fieldDescMap.put("GT1-4-5", "Guarantor Spouse Name - Prefix (e.g., DR)");
    fieldDescMap.put("GT1-4-6", "Guarantor Spouse Name - Degree (e.g., MD)");
    fieldDescMap.put("IN2-22-5", "Special Coverage Approval Name - Prefix (e.g., DR)");
    fieldDescMap.put("GT1-4-7", "Guarantor Spouse Name - Name Type Code");
    fieldDescMap.put("IN2-22-6", "Special Coverage Approval Name - Degree (e.g., MD)");
    fieldDescMap.put("GT1-4-8", "Guarantor Spouse Name - Name Representation Code");
    fieldDescMap.put("IN2-22-7", "Special Coverage Approval Name - Name Type Code");
    fieldDescMap.put("GT1-4-9", "Guarantor Spouse Name - Name Context");
    fieldDescMap.put("IN2-22-8", "Special Coverage Approval Name - Name Representation Code");
    fieldDescMap.put("PD1-4-23-2",
        "Patient Primary Care Provider Name & ID No. - Assigning Agency or Department - Text");
    fieldDescMap.put("IN2-22-1", "Special Coverage Approval Name - Family Name");
    fieldDescMap.put("PD1-4-23-1",
        "Patient Primary Care Provider Name & ID No. - Assigning Agency or Department - Identifier");
    fieldDescMap.put("IN2-22-2", "Special Coverage Approval Name - Given Name");
    fieldDescMap.put("IN2-22-3",
        "Special Coverage Approval Name - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("IN2-22-4", "Special Coverage Approval Name - Suffix (e.g., JR or III)");
    fieldDescMap.put("IN3-3-19", "Certified By - Effective Date");
    fieldDescMap.put("IN3-3-18", "Certified By - Name Assembly Order");
    fieldDescMap.put("GT1-45-13-1", "Contact Person's Name - Expiration Date - Time");
    fieldDescMap
        .put("GT1-45-13-2", "Contact Person's Name - Expiration Date - Degree of Precision");
    fieldDescMap.put("PD1-4-23-9",
        "Patient Primary Care Provider Name & ID No. - Assigning Agency or Department - Original Text");
    fieldDescMap.put("PD1-4-23-7",
        "Patient Primary Care Provider Name & ID No. - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("PD1-4-23-8",
        "Patient Primary Care Provider Name & ID No. - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("IN3-3-21", "Certified By - Professional Suffix");
    fieldDescMap.put("PD1-4-23-5",
        "Patient Primary Care Provider Name & ID No. - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("IN3-3-22", "Certified By - Assigning Jurisdiction");
    fieldDescMap.put("PD1-4-23-6",
        "Patient Primary Care Provider Name & ID No. - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("IN3-3-23", "Certified By - Assigning Agency or Department");
    fieldDescMap.put("PD1-4-23-3",
        "Patient Primary Care Provider Name & ID No. - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("PD1-4-23-4",
        "Patient Primary Care Provider Name & ID No. - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("PV1-6-9", "Prior Patient Location - Location Description");
    fieldDescMap.put("IN3-3-20", "Certified By - Expiration Date");
    fieldDescMap.put("GT1-4-1", "Guarantor Spouse Name - Family Name");
    fieldDescMap.put("PV1-9-20-1", "Consulting Doctor - Expiration Date - Time");
    fieldDescMap.put("PV1-9-20-2", "Consulting Doctor - Expiration Date - Degree of Precision");
    fieldDescMap.put("ORC-22-1-1",
        "Ordering Facility Address - Street Address - Street or Mailing Address");
    fieldDescMap.put("ORC-22-1-3", "Ordering Facility Address - Street Address - Dwelling Number");
    fieldDescMap.put("ORC-22-1-2", "Ordering Facility Address - Street Address - Street Name");
    fieldDescMap.put("IN1-30-11", "Verification By - Identifier Check Digit");
    fieldDescMap.put("IN1-30-10", "Verification By - Name Type Code");
    fieldDescMap.put("GT1-14", "Guarantor Date - End");
    fieldDescMap.put("GT1-15", "Guarantor Priority");
    fieldDescMap.put("GT1-16", "Guarantor Employer Name");
    fieldDescMap.put("GT1-17", "Guarantor Employer Address");
    fieldDescMap.put("GT1-10", "Guarantor Type");
    fieldDescMap.put("GT1-11", "Guarantor Relationship");
    fieldDescMap.put("GT1-12", "Guarantor SSN");
    fieldDescMap.put("GT1-13", "Guarantor Date - Begin");
    fieldDescMap.put("OBX-18-1", "Equipment Instance Identifier - Entity Identifier");
    fieldDescMap.put("OBX-18-4", "Equipment Instance Identifier - Universal ID Type");
    fieldDescMap.put("GT1-19", "Guarantor Employee ID Number");
    fieldDescMap.put("GT1-18", "Guarantor Employer Phone Number");
    fieldDescMap.put("OBX-18-2", "Equipment Instance Identifier - Namespace ID");
    fieldDescMap.put("OBX-18-3", "Equipment Instance Identifier - Universal ID");
    fieldDescMap.put("IN1-30-18", "Verification By - Name Assembly Order");
    fieldDescMap.put("IN1-30-19", "Verification By - Effective Date");
    fieldDescMap.put("IN1-30-16", "Verification By - Name Context");
    fieldDescMap.put("IN1-30-17", "Verification By - Name Validity Range");
    fieldDescMap.put("IN1-30-14", "Verification By - Assigning Facility");
    fieldDescMap.put("IN1-30-15", "Verification By - Name Representation Code");
    fieldDescMap.put("IN1-30-12", "Verification By - Check Digit Scheme");
    fieldDescMap.put("IN1-30-13", "Verification By - Identifier Type Code");
    fieldDescMap.put("GT1-2-4-3", "Guarantor Number - Assigning Authority - Universal ID Type");
    fieldDescMap.put("GT1-2-4-2", "Guarantor Number - Assigning Authority - Universal ID");
    fieldDescMap.put("GT1-2-4-1", "Guarantor Number - Assigning Authority - Namespace ID");
    fieldDescMap.put("GT1-30", "Guarantor Marital Status Code");
    fieldDescMap.put("GT1-31", "Guarantor Hire Effective Date");
    fieldDescMap.put("GT1-32", "Employment Stop Date");
    fieldDescMap.put("GT1-33", "Living Dependency");
    fieldDescMap.put("GT1-34", "Ambulatory Status");
    fieldDescMap.put("GT1-35", "Citizenship");
    fieldDescMap.put("GT1-36", "Primary Language");
    fieldDescMap.put("GT1-37", "Living Arrangement");
    fieldDescMap.put("GT1-38", "Publicity Code");
    fieldDescMap.put("GT1-39", "Protection Indicator");
    fieldDescMap.put("PV1-17-23-7",
        "Admitting Doctor - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("IN1-30-20", "Verification By - Expiration Date");
    fieldDescMap.put("PV1-17-23-8",
        "Admitting Doctor - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("GT1-20", "Guarantor Employment Status");
    fieldDescMap
        .put("PV1-17-23-9", "Admitting Doctor - Assigning Agency or Department - Original Text");
    fieldDescMap.put("IN1-30-22", "Verification By - Assigning Jurisdiction");
    fieldDescMap.put("IN1-30-21", "Verification By - Professional Suffix");
    fieldDescMap.put("GT1-23", "Guarantor Credit Rating Code");
    fieldDescMap.put("GT1-24", "Guarantor Death Date And Time");
    fieldDescMap.put("GT1-21", "Guarantor Organization Name");
    fieldDescMap.put("GT1-22", "Guarantor Billing Hold Flag");
    fieldDescMap.put("GT1-27", "Guarantor Household Annual Income");
    fieldDescMap.put("GT1-28", "Guarantor Household Size");
    fieldDescMap.put("GT1-25", "Guarantor Death Flag");
    fieldDescMap.put("GT1-26", "Guarantor Charge Adjustment Code");
    fieldDescMap.put("GT1-29", "Guarantor Employer ID Number");
    fieldDescMap.put("NK1-16-1", "Date/Time of Birth - Time");
    fieldDescMap.put("NK1-16-2", "Date/Time of Birth - Degree of Precision");
    fieldDescMap.put("PV1-17-23-4",
        "Admitting Doctor - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("IN1-30-23", "Verification By - Assigning Agency or Department");
    fieldDescMap.put("PV1-17-23-3",
        "Admitting Doctor - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("PV1-17-23-6",
        "Admitting Doctor - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap
        .put("PV1-17-23-5", "Admitting Doctor - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("PV1-17-23-2", "Admitting Doctor - Assigning Agency or Department - Text");
    fieldDescMap
        .put("PV1-17-23-1", "Admitting Doctor - Assigning Agency or Department - Identifier");
    fieldDescMap
        .put("ORC-22-14-2", "Ordering Facility Address - Expiration Date - Degree of Precision");
    fieldDescMap.put("OBX-3-1", "Observation Identifier - Identifier");
    fieldDescMap.put("ORC-22-14-1", "Ordering Facility Address - Expiration Date - Time");
    fieldDescMap.put("ORC-12-16-1", "Ordering Provider - Name Context - Identifier");
    fieldDescMap.put("ORC-12-16-2", "Ordering Provider - Name Context - Text");
    fieldDescMap.put("OBX-3-6", "Observation Identifier - Name of Alternate Coding System");
    fieldDescMap.put("ORC-12-16-3", "Ordering Provider - Name Context - Name of Coding System");
    fieldDescMap.put("ORC-12-16-4", "Ordering Provider - Name Context - Alternate Identifier");
    fieldDescMap.put("OBX-3-4", "Observation Identifier - Alternate Identifier");
    fieldDescMap.put("ORC-12-16-5", "Ordering Provider - Name Context - Alternate Text");
    fieldDescMap.put("OBX-3-5", "Observation Identifier - Alternate Text");
    fieldDescMap
        .put("ORC-12-16-6", "Ordering Provider - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("OBX-3-2", "Observation Identifier - Text");
    fieldDescMap.put("OBX-3-3", "Observation Identifier - Name of Coding System");
    fieldDescMap
        .put("GT1-19-6-3", "Guarantor Employee ID Number - Assigning Facility - Universal ID Type");
    fieldDescMap.put("PV1-7-14-1", "Attending Doctor - Assigning Facility - Namespace ID");
    fieldDescMap
        .put("GT1-19-6-1", "Guarantor Employee ID Number - Assigning Facility - Namespace ID");
    fieldDescMap
        .put("GT1-19-6-2", "Guarantor Employee ID Number - Assigning Facility - Universal ID");
    fieldDescMap.put("PV1-9-14-1", "Consulting Doctor - Assigning Facility - Namespace ID");
    fieldDescMap.put("PV1-9-14-3", "Consulting Doctor - Assigning Facility - Universal ID Type");
    fieldDescMap.put("PV1-9-14-2", "Consulting Doctor - Assigning Facility - Universal ID");
    fieldDescMap.put("NK1-26-9", "Mother's Maiden Name - Name Context");
    fieldDescMap.put("NK1-26-8", "Mother's Maiden Name - Name Representation Code");
    fieldDescMap.put("NK1-26-5", "Mother's Maiden Name - Prefix (e.g., DR)");
    fieldDescMap.put("NK1-26-4", "Mother's Maiden Name - Suffix (e.g., JR or III)");
    fieldDescMap.put("NK1-26-7", "Mother's Maiden Name - Name Type Code");
    fieldDescMap.put("NK1-26-6", "Mother's Maiden Name - Degree (e.g., MD)");
    fieldDescMap.put("NK1-26-1", "Mother's Maiden Name - Family Name");
    fieldDescMap.put("RXA-4-1", "Date/Time End of Administration - Time");
    fieldDescMap.put("NK1-26-3",
        "Mother's Maiden Name - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("RXA-4-2", "Date/Time End of Administration - Degree of Precision");
    fieldDescMap.put("NK1-26-2", "Mother's Maiden Name - Given Name");
    fieldDescMap.put("ORC-24-13-1", "Ordering Provider Address - Effective Date - Time");
    fieldDescMap
        .put("ORC-24-13-2", "Ordering Provider Address - Effective Date - Degree of Precision");
    fieldDescMap.put("PID-39-4", "Tribal Citizenship - Alternate Identifier");
    fieldDescMap.put("IN1-44-1-2", "Insured's Employer's Address - Street Address - Street Name");
    fieldDescMap.put("PID-39-3", "Tribal Citizenship - Name of Coding System");
    fieldDescMap
        .put("IN1-44-1-3", "Insured's Employer's Address - Street Address - Dwelling Number");
    fieldDescMap.put("PID-39-2", "Tribal Citizenship - Text");
    fieldDescMap.put("PID-39-1", "Tribal Citizenship - Identifier");
    fieldDescMap.put("IN1-44-1-1",
        "Insured's Employer's Address - Street Address - Street or Mailing Address");
    fieldDescMap.put("ORC-24-6", "Ordering Provider Address - Country");
    fieldDescMap.put("ORC-24-7", "Ordering Provider Address - Address Type");
    fieldDescMap.put("ORC-24-8", "Ordering Provider Address - Other Geographic Designation");
    fieldDescMap.put("ORC-24-9", "Ordering Provider Address - County/Parish Code");
    fieldDescMap.put("ORC-24-2", "Ordering Provider Address - Other Designation");
    fieldDescMap.put("ORC-24-3", "Ordering Provider Address - City");
    fieldDescMap.put("ORC-24-4", "Ordering Provider Address - State or Province");
    fieldDescMap.put("ORC-24-5", "Ordering Provider Address - Zip or Postal Code");
    fieldDescMap.put("ORC-24-1", "Ordering Provider Address - Street Address");
    fieldDescMap.put("IN1-5-8", "Insurance Company Address - Other Geographic Designation");
    fieldDescMap.put("IN1-5-7", "Insurance Company Address - Address Type");
    fieldDescMap.put("PID-39-9", "Tribal Citizenship - Original Text");
    fieldDescMap.put("IN1-5-6", "Insurance Company Address - Country");
    fieldDescMap.put("IN1-5-5", "Insurance Company Address - Zip or Postal Code");
    fieldDescMap.put("PID-39-7", "Tribal Citizenship - Coding System Version ID");
    fieldDescMap.put("IN1-5-4", "Insurance Company Address - State or Province");
    fieldDescMap.put("IN2-10", "Military ID Number");
    fieldDescMap.put("PID-39-8", "Tribal Citizenship - Alternate Coding System Version ID");
    fieldDescMap.put("IN1-5-3", "Insurance Company Address - City");
    fieldDescMap.put("PID-39-5", "Tribal Citizenship - Alternate Text");
    fieldDescMap.put("IN1-5-2", "Insurance Company Address - Other Designation");
    fieldDescMap.put("PID-39-6", "Tribal Citizenship - Name of Alternate Coding System");
    fieldDescMap.put("IN1-5-1", "Insurance Company Address - Street Address");
    fieldDescMap.put("PV2-23-5", "Clinic Organization Name - Check Digit Scheme");
    fieldDescMap.put("IN2-15", "Military Rank/Grade");
    fieldDescMap.put("PV2-23-6", "Clinic Organization Name - Assigning Authority");
    fieldDescMap.put("IN2-16", "Military Status");
    fieldDescMap.put("IN2-41-6", "Nationality - Name of Alternate Coding System");
    fieldDescMap.put("PV2-23-3", "Clinic Organization Name - ID Number");
    fieldDescMap.put("IN2-17", "Military Retire Date");
    fieldDescMap.put("IN2-41-5", "Nationality - Alternate Text");
    fieldDescMap.put("PV2-23-4", "Clinic Organization Name - Check Digit");
    fieldDescMap.put("IN2-18", "Military Non-Avail Cert On File");
    fieldDescMap.put("IN2-41-4", "Nationality - Alternate Identifier");
    fieldDescMap.put("PV2-23-9", "Clinic Organization Name - Name Representation Code");
    fieldDescMap.put("IN2-11", "Dependent Of Military Recipient");
    fieldDescMap.put("IN2-41-3", "Nationality - Name of Coding System");
    fieldDescMap.put("IN2-12", "Military Organization");
    fieldDescMap.put("IN2-41-2", "Nationality - Text");
    fieldDescMap.put("PV2-23-7", "Clinic Organization Name - Identifier Type Code");
    fieldDescMap.put("IN2-13", "Military Station");
    fieldDescMap.put("IN2-41-1", "Nationality - Identifier");
    fieldDescMap.put("PV2-23-8", "Clinic Organization Name - Assigning Facility");
    fieldDescMap.put("IN2-14", "Military Service");
    fieldDescMap.put("PID-13-12", "Phone Number - Home - Unformatted Telephone number");
    fieldDescMap.put("PID-13-11", "Phone Number - Home - Speed Dial Code");
    fieldDescMap.put("PID-13-10", "Phone Number - Home - Extension Prefix");
    fieldDescMap.put("PV2-23-1", "Clinic Organization Name - Organization Name");
    fieldDescMap.put("IN2-19", "Baby Coverage");
    fieldDescMap.put("PV2-23-2", "Clinic Organization Name - Organization Name Type Code");
    fieldDescMap.put("OBX-24-10", "Performing Organization Address - Census Tract");
    fieldDescMap.put("OBX-24-11", "Performing Organization Address - Address Representation Code");
    fieldDescMap.put("OBX-24-12", "Performing Organization Address - Address Validity Range");
    fieldDescMap.put("TQ1-3-1-8",
        "Repeat Pattern - Repeat Pattern Code - Alternate Coding System Version ID");
    fieldDescMap.put("OBX-24-13", "Performing Organization Address - Effective Date");
    fieldDescMap
        .put("TQ1-3-1-7", "Repeat Pattern - Repeat Pattern Code - Coding System Version ID");
    fieldDescMap.put("OBX-24-14", "Performing Organization Address - Expiration Date");
    fieldDescMap.put("TQ1-3-1-9", "Repeat Pattern - Repeat Pattern Code - Original Text");
    fieldDescMap.put("TQ1-3-1-4", "Repeat Pattern - Repeat Pattern Code - Alternate Identifier");
    fieldDescMap.put("MSH-9-1", "Message Type - Message Code");
    fieldDescMap.put("TQ1-3-1-3", "Repeat Pattern - Repeat Pattern Code - Name of Coding System");
    fieldDescMap.put("MSH-9-2", "Message Type - Trigger Event");
    fieldDescMap
        .put("TQ1-3-1-6", "Repeat Pattern - Repeat Pattern Code - Name of Alternate Coding System");
    fieldDescMap.put("IN2-21", "Blood Deductible");
    fieldDescMap.put("TQ1-3-1-5", "Repeat Pattern - Repeat Pattern Code - Alternate Text");
    fieldDescMap.put("IN2-20", "Combine Baby Bill");
    fieldDescMap.put("TQ1-3-1-2", "Repeat Pattern - Repeat Pattern Code - Text");
    fieldDescMap.put("MSH-9-3", "Message Type - Message Structure");
    fieldDescMap.put("TQ1-3-1-1", "Repeat Pattern - Repeat Pattern Code - Identifier");
    fieldDescMap.put("IN2-28", "Room Coverage Type/Amount");
    fieldDescMap.put("IN2-29", "Policy Type/Amount");
    fieldDescMap.put("IN2-26", "Payor Subscriber ID");
    fieldDescMap.put("IN2-27", "Eligibility Source");
    fieldDescMap.put("IN2-24", "Non-Covered Insurance Code");
    fieldDescMap.put("IN2-25", "Payor ID");
    fieldDescMap.put("IN2-22", "Special Coverage Approval Name");
    fieldDescMap.put("IN2-23", "Special Coverage Approval Title");
    fieldDescMap.put("PID-5-13", "Patient Name - Expiration Date");
    fieldDescMap.put("PID-5-14", "Patient Name - Professional Suffix");
    fieldDescMap.put("PID-5-11", "Patient Name - Name Assembly Order");
    fieldDescMap.put("PID-5-12", "Patient Name - Effective Date");
    fieldDescMap.put("PID-5-10", "Patient Name - Name Validity Range");
    fieldDescMap.put("IN2-32", "Ambulatory Status");
    fieldDescMap.put("IN2-31", "Living Dependency");
    fieldDescMap.put("IN2-30", "Daily Deductible");
    fieldDescMap.put("PD1-10-7", "Duplicate Patient - Effective Date");
    fieldDescMap.put("PD1-10-6", "Duplicate Patient - Assigning Facility");
    fieldDescMap.put("PD1-10-9", "Duplicate Patient - Assigning Jurisdiction");
    fieldDescMap.put("PD1-10-8", "Duplicate Patient - Expiration Date");
    fieldDescMap
        .put("IN2-11-6", "Dependent Of Military Recipient - Name of Alternate Coding System");
    fieldDescMap.put("IN2-40-13-1", "Mother's Maiden Name - Expiration Date - Time");
    fieldDescMap.put("IN2-11-5", "Dependent Of Military Recipient - Alternate Text");
    fieldDescMap.put("IN2-11-2", "Dependent Of Military Recipient - Text");
    fieldDescMap.put("IN2-34", "Primary Language");
    fieldDescMap.put("IN2-11-1", "Dependent Of Military Recipient - Identifier");
    fieldDescMap.put("IN2-33", "Citizenship");
    fieldDescMap.put("PD1-10-1", "Duplicate Patient - ID Number");
    fieldDescMap.put("IN2-11-4", "Dependent Of Military Recipient - Alternate Identifier");
    fieldDescMap.put("IN2-36", "Publicity Code");
    fieldDescMap.put("TQ2-10", "Special Service Request Relationship");
    fieldDescMap.put("IN2-11-3", "Dependent Of Military Recipient - Name of Coding System");
    fieldDescMap.put("IN2-35", "Living Arrangement");
    fieldDescMap.put("IN2-40-13-2", "Mother's Maiden Name - Expiration Date - Degree of Precision");
    fieldDescMap.put("PD1-10-3", "Duplicate Patient - Check Digit Scheme");
    fieldDescMap.put("IN2-38", "Student Indicator");
    fieldDescMap.put("PD1-10-2", "Duplicate Patient - Check Digit");
    fieldDescMap.put("IN2-37", "Protection Indicator");
    fieldDescMap.put("PD1-10-5", "Duplicate Patient - Identifier Type Code");
    fieldDescMap.put("PD1-10-4", "Duplicate Patient - Assigning Authority");
    fieldDescMap.put("IN2-39", "Religion");
    fieldDescMap
        .put("OBX-23-6-1", "Performing Organization Name - Assigning Authority - Namespace ID");
    fieldDescMap
        .put("OBX-23-6-2", "Performing Organization Name - Assigning Authority - Universal ID");
    fieldDescMap.put("IN2-40", "Mother's Maiden Name");
    fieldDescMap.put("IN2-41", "Nationality");
    fieldDescMap.put("IN2-42", "Ethnic Group");
    fieldDescMap.put("OBX-25-23-1",
        "Performing Organization Medical Director - Assigning Agency or Department - Identifier");
    fieldDescMap.put("IN2-43", "Marital Status");
    fieldDescMap.put("OBX-25-23-2",
        "Performing Organization Medical Director - Assigning Agency or Department - Text");
    fieldDescMap.put("OBX-25-23-3",
        "Performing Organization Medical Director - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("IN2-70-1", "Insured Employer Organization Name and ID - Organization Name");
    fieldDescMap.put("PV1-8-20-1", "Referring Doctor - Expiration Date - Time");
    fieldDescMap.put("OBX-25-23-4",
        "Performing Organization Medical Director - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap
        .put("IN2-70-2", "Insured Employer Organization Name and ID - Organization Name Type Code");
    fieldDescMap.put("PV1-8-20-2", "Referring Doctor - Expiration Date - Degree of Precision");
    fieldDescMap.put("OBX-25-23-5",
        "Performing Organization Medical Director - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("IN2-70-3", "Insured Employer Organization Name and ID - ID Number");
    fieldDescMap.put("OBX-25-23-6",
        "Performing Organization Medical Director - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("OBX-25-23-7",
        "Performing Organization Medical Director - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("OBX-25-23-8",
        "Performing Organization Medical Director - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("OBX-23-6-3",
        "Performing Organization Name - Assigning Authority - Universal ID Type");
    fieldDescMap.put("OBX-25-23-9",
        "Performing Organization Medical Director - Assigning Agency or Department - Original Text");
    fieldDescMap
        .put("IN2-70-9", "Insured Employer Organization Name and ID - Name Representation Code");
    fieldDescMap.put("IN2-70-8", "Insured Employer Organization Name and ID - Assigning Facility");
    fieldDescMap
        .put("IN2-70-7", "Insured Employer Organization Name and ID - Identifier Type Code");
    fieldDescMap.put("IN2-70-6", "Insured Employer Organization Name and ID - Assigning Authority");
    fieldDescMap.put("IN2-70-5", "Insured Employer Organization Name and ID - Check Digit Scheme");
    fieldDescMap.put("IN2-70-4", "Insured Employer Organization Name and ID - Check Digit");
    fieldDescMap.put("IN2-47", "Job Code/Class");
    fieldDescMap.put("IN2-46", "Job Title");
    fieldDescMap.put("IN2-45", "Employment Stop Date");
    fieldDescMap.put("IN2-44", "Insured's Employment Start Date");
    fieldDescMap.put("IN2-49", "Employer Contact Person Name");
    fieldDescMap.put("GT1-7-12", "Guarantor Ph Num - Business - Unformatted Telephone number");
    fieldDescMap.put("IN2-48", "Job Status");
    fieldDescMap.put("IN2-50", "Employer Contact Person Phone Number");
    fieldDescMap.put("IN2-53", "Insured's Contact Person Phone Number");
    fieldDescMap.put("IN2-54", "Insured's Contact Person Reason");
    fieldDescMap.put("IN2-51", "Employer Contact Reason");
    fieldDescMap.put("IN2-52", "Insured's Contact Person's Name");
    fieldDescMap.put("IN2-59", "Policy Scope");
    fieldDescMap.put("IN2-56", "Relationship to the Patient Stop Date");
    fieldDescMap.put("IN2-55", "Relationship to the Patient Start Date");
    fieldDescMap.put("IN2-58", "Insurance Co Contact Phone Number");
    fieldDescMap.put("IN2-57", "Insurance Co. Contact Reason");
    fieldDescMap.put("IN2-62", "Guarantor's Relationship to Insured");
    fieldDescMap.put("IN2-63", "Insured's Phone Number - Home");
    fieldDescMap.put("PV1-7-2-5", "Attending Doctor - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("IN2-64", "Insured's Employer Phone Number");
    fieldDescMap
        .put("PV1-7-2-4", "Attending Doctor - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("NK1-2-10", "Name - Name Validity Range");
    fieldDescMap.put("IN2-65", "Military Handicapped Program");
    fieldDescMap.put("PV1-7-2-3", "Attending Doctor - Family Name - Own Surname");
    fieldDescMap.put("NK1-2-12", "Name - Effective Date");
    fieldDescMap.put("NK1-2-11", "Name - Name Assembly Order");
    fieldDescMap.put("IN2-60", "Policy Source");
    fieldDescMap.put("NK1-2-14", "Name - Professional Suffix");
    fieldDescMap.put("GT1-7-10", "Guarantor Ph Num - Business - Extension Prefix");
    fieldDescMap.put("IN2-61", "Patient Member Number");
    fieldDescMap.put("NK1-2-13", "Name - Expiration Date");
    fieldDescMap.put("GT1-7-11", "Guarantor Ph Num - Business - Speed Dial Code");
    fieldDescMap
        .put("OBX-25-2-3", "Performing Organization Medical Director - Family Name - Own Surname");
    fieldDescMap.put("OBX-25-2-4",
        "Performing Organization Medical Director - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap
        .put("OBX-25-2-1", "Performing Organization Medical Director - Family Name - Surname");
    fieldDescMap.put("OBX-25-2-2",
        "Performing Organization Medical Director - Family Name - Own Surname Prefix");
    fieldDescMap
        .put("IN1-44-13-2", "Insured's Employer's Address - Effective Date - Degree of Precision");
    fieldDescMap.put("IN1-44-13-1", "Insured's Employer's Address - Effective Date - Time");
    fieldDescMap.put("IN2-69", "Insured Organization Name and ID");
    fieldDescMap.put("IN2-68", "Stoploss Limit Flag");
    fieldDescMap.put("OBX-25-2-5",
        "Performing Organization Medical Director - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("IN2-67", "Copay Limit Flag");
    fieldDescMap.put("PV1-7-2-1", "Attending Doctor - Family Name - Surname");
    fieldDescMap.put("IN2-66", "Suspend Flag");
    fieldDescMap.put("PV1-7-2-2", "Attending Doctor - Family Name - Own Surname Prefix");
    fieldDescMap.put("IN2-71", "Race");
    fieldDescMap.put("IN2-72", "CMS Patient's Relationship to Insured");
    fieldDescMap.put("IN2-70", "Insured Employer Organization Name and ID");
    fieldDescMap
        .put("PV1-52-20-2", "Other Healthcare Provider - Expiration Date - Degree of Precision");
    fieldDescMap.put("PV1-52-20-1", "Other Healthcare Provider - Expiration Date - Time");
    fieldDescMap
        .put("IN3-8-23-4", "Operator - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("IN3-8-23-5", "Operator - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("IN3-8-23-6",
        "Operator - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap
        .put("IN3-8-23-7", "Operator - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("IN3-8-23-1", "Operator - Assigning Agency or Department - Identifier");
    fieldDescMap.put("IN3-8-23-2", "Operator - Assigning Agency or Department - Text");
    fieldDescMap
        .put("IN3-8-23-3", "Operator - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("NK1-4-1-3", "Address - Street Address - Dwelling Number");
    fieldDescMap.put("NK1-14", "Marital Status");
    fieldDescMap.put("NK1-4-1-2", "Address - Street Address - Street Name");
    fieldDescMap.put("NK1-15", "Administrative Sex");
    fieldDescMap.put("NK1-16", "Date/Time of Birth");
    fieldDescMap.put("NK1-17", "Living Dependency");
    fieldDescMap.put("NK1-10", "Next of Kin / Associated Parties Job Title");
    fieldDescMap.put("IN2-26-6-1", "Payor Subscriber ID - Assigning Facility - Namespace ID");
    fieldDescMap.put("NK1-11", "Next of Kin / Associated Parties Job Code/Class");
    fieldDescMap.put("NK1-4-1-1", "Address - Street Address - Street or Mailing Address");
    fieldDescMap.put("NK1-12", "Next of Kin / Associated Parties Employee Number");
    fieldDescMap.put("IN2-26-6-3", "Payor Subscriber ID - Assigning Facility - Universal ID Type");
    fieldDescMap.put("NK1-13", "Organization Name - NK1");
    fieldDescMap.put("IN2-26-6-2", "Payor Subscriber ID - Assigning Facility - Universal ID");
    fieldDescMap.put("PID-16-6", "Marital Status - Name of Alternate Coding System");
    fieldDescMap.put("IN3-8-23-9", "Operator - Assigning Agency or Department - Original Text");
    fieldDescMap.put("IN3-8-23-8",
        "Operator - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("ORC-12-23-3",
        "Ordering Provider - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("ORC-11-9-1", "Verified By - Assigning Authority - Namespace ID");
    fieldDescMap.put("PID-16-2", "Marital Status - Text");
    fieldDescMap.put("ORC-12-23-4",
        "Ordering Provider - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("PID-16-3", "Marital Status - Name of Coding System");
    fieldDescMap.put("IN1-49-6-1", "Insured's ID Number - Assigning Facility - Namespace ID");
    fieldDescMap
        .put("ORC-12-23-1", "Ordering Provider - Assigning Agency or Department - Identifier");
    fieldDescMap.put("ORC-11-9-3", "Verified By - Assigning Authority - Universal ID Type");
    fieldDescMap.put("PID-16-4", "Marital Status - Alternate Identifier");
    fieldDescMap.put("ORC-12-23-2", "Ordering Provider - Assigning Agency or Department - Text");
    fieldDescMap.put("ORC-11-9-2", "Verified By - Assigning Authority - Universal ID");
    fieldDescMap.put("PID-16-5", "Marital Status - Alternate Text");
    fieldDescMap.put("IN1-49-6-2", "Insured's ID Number - Assigning Facility - Universal ID");
    fieldDescMap.put("PID-16-1", "Marital Status - Identifier");
    fieldDescMap.put("IN1-49-6-3", "Insured's ID Number - Assigning Facility - Universal ID Type");
    fieldDescMap
        .put("PV1-42-11-2", "Pending Location - Assigning Authority for Location - Universal ID");
    fieldDescMap.put("PV1-42-11-3",
        "Pending Location - Assigning Authority for Location - Universal ID Type");
    fieldDescMap
        .put("ORC-12-23-9", "Ordering Provider - Assigning Agency or Department - Original Text");
    fieldDescMap
        .put("PV1-42-11-1", "Pending Location - Assigning Authority for Location - Namespace ID");
    fieldDescMap.put("ORC-12-23-7",
        "Ordering Provider - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("ORC-12-23-8",
        "Ordering Provider - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap
        .put("ORC-12-23-5", "Ordering Provider - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("ORC-12-23-6",
        "Ordering Provider - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("PV1-52-16-1", "Other Healthcare Provider - Name Context - Identifier");
    fieldDescMap.put("TQ2-8-2", "Sequence Condition Time Interval - Units");
    fieldDescMap.put("TQ2-8-1", "Sequence Condition Time Interval - Quantity");
    fieldDescMap
        .put("PV1-52-16-4", "Other Healthcare Provider - Name Context - Alternate Identifier");
    fieldDescMap.put("PV1-52-16-5", "Other Healthcare Provider - Name Context - Alternate Text");
    fieldDescMap.put("PV1-52-16-2", "Other Healthcare Provider - Name Context - Text");
    fieldDescMap
        .put("PV1-52-16-3", "Other Healthcare Provider - Name Context - Name of Coding System");
    fieldDescMap.put("TQ1-5-2", "Relative Time and Units - Units");
    fieldDescMap.put("PV1-52-16-6",
        "Other Healthcare Provider - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("TQ1-5-1", "Relative Time and Units - Quantity");
    fieldDescMap.put("IN2-63-1", "Insured's Phone Number - Home - Telephone Number");
    fieldDescMap
        .put("IN2-63-3", "Insured's Phone Number - Home - Telecommunication Equipment Type");
    fieldDescMap.put("IN2-63-2", "Insured's Phone Number - Home - Telecommunication Use Code");
    fieldDescMap.put("ORC-14-4", "Call Back Phone Number - Email Address");
    fieldDescMap.put("IN2-63-5", "Insured's Phone Number - Home - Country Code");
    fieldDescMap.put("ORC-14-3", "Call Back Phone Number - Telecommunication Equipment Type");
    fieldDescMap.put("IN2-63-4", "Insured's Phone Number - Home - Email Address");
    fieldDescMap.put("ORC-14-2", "Call Back Phone Number - Telecommunication Use Code");
    fieldDescMap.put("IN2-63-7", "Insured's Phone Number - Home - Local Number");
    fieldDescMap.put("ORC-14-1", "Call Back Phone Number - Telephone Number");
    fieldDescMap.put("IN2-63-6", "Insured's Phone Number - Home - Area/City Code");
    fieldDescMap.put("ORC-14-8", "Call Back Phone Number - Extension");
    fieldDescMap.put("IN3-25-2-1", "Second Opinion Physician - Family Name - Surname");
    fieldDescMap.put("IN2-63-9", "Insured's Phone Number - Home - Any Text");
    fieldDescMap.put("ORC-14-7", "Call Back Phone Number - Local Number");
    fieldDescMap.put("IN2-63-8", "Insured's Phone Number - Home - Extension");
    fieldDescMap.put("ORC-14-6", "Call Back Phone Number - Area/City Code");
    fieldDescMap.put("ORC-14-5", "Call Back Phone Number - Country Code");
    fieldDescMap
        .put("IN3-25-2-5", "Second Opinion Physician - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("IN3-25-2-4",
        "Second Opinion Physician - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("IN3-25-2-3", "Second Opinion Physician - Family Name - Own Surname");
    fieldDescMap.put("ORC-14-9", "Call Back Phone Number - Any Text");
    fieldDescMap.put("IN3-25-2-2", "Second Opinion Physician - Family Name - Own Surname Prefix");
    fieldDescMap.put("PID-28-5", "Nationality - Alternate Text");
    fieldDescMap.put("PID-28-6", "Nationality - Name of Alternate Coding System");
    fieldDescMap.put("PID-28-2", "Nationality - Text");
    fieldDescMap.put("PID-28-1", "Nationality - Identifier");
    fieldDescMap.put("PID-28-4", "Nationality - Alternate Identifier");
    fieldDescMap.put("PID-28-3", "Nationality - Name of Coding System");
    fieldDescMap.put("NK1-20", "Primary Language");
    fieldDescMap.put("NK1-24", "Student Indicator");
    fieldDescMap.put("GT1-45-1-2", "Contact Person's Name - Family Name - Own Surname Prefix");
    fieldDescMap.put("NK1-23", "Protection Indicator");
    fieldDescMap.put("GT1-45-1-1", "Contact Person's Name - Family Name - Surname");
    fieldDescMap.put("NK1-22", "Publicity Code");
    fieldDescMap.put("NK1-21", "Living Arrangement");
    fieldDescMap.put("NK1-28", "Ethnic Group");
    fieldDescMap.put("NK1-27", "Nationality");
    fieldDescMap
        .put("GT1-45-1-5", "Contact Person's Name - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("NK1-26", "Mother's Maiden Name");
    fieldDescMap.put("GT1-45-1-4",
        "Contact Person's Name - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("NK1-25", "Religion");
    fieldDescMap.put("GT1-45-1-3", "Contact Person's Name - Family Name - Own Surname");
    fieldDescMap.put("PV1-52-3", "Other Healthcare Provider - Given Name");
    fieldDescMap.put("PV1-52-2", "Other Healthcare Provider - Family Name");
    fieldDescMap.put("PV1-52-5", "Other Healthcare Provider - Suffix (e.g., JR or III)");
    fieldDescMap.put("NK1-18", "Ambulatory Status");
    fieldDescMap.put("PV1-52-4",
        "Other Healthcare Provider - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("NK1-19", "Citizenship");
    fieldDescMap.put("PV1-52-1", "Other Healthcare Provider - ID Number");
    fieldDescMap.put("GT1-5-11", "Guarantor Address - Address Representation Code");
    fieldDescMap.put("GT1-5-10", "Guarantor Address - Census Tract");
    fieldDescMap.put("GT1-5-13", "Guarantor Address - Effective Date");
    fieldDescMap.put("GT1-5-12", "Guarantor Address - Address Validity Range");
    fieldDescMap.put("IN1-5-9", "Insurance Company Address - County/Parish Code");
    fieldDescMap.put("PV1-52-7", "Other Healthcare Provider - Degree (e.g., MD)");
    fieldDescMap.put("PV1-52-6", "Other Healthcare Provider - Prefix (e.g., DR)");
    fieldDescMap.put("GT1-5-14", "Guarantor Address - Expiration Date");
    fieldDescMap.put("PV1-52-9", "Other Healthcare Provider - Assigning Authority");
    fieldDescMap.put("PV1-52-8", "Other Healthcare Provider - Source Table");
    fieldDescMap.put("IN3-8-19-2", "Operator - Effective Date - Degree of Precision");
    fieldDescMap.put("IN3-8-19-1", "Operator - Effective Date - Time");
    fieldDescMap.put("NK1-31", "Contact Person's Telephone Number");
    fieldDescMap.put("NK1-30", "Contact Person's Name");
    fieldDescMap.put("NK1-33", "Next of Kin/Associated Party's Identifiers");
    fieldDescMap.put("NK1-32", "Contact Person's Address");
    fieldDescMap.put("NK1-35", "Race");
    fieldDescMap.put("NK1-34", "Job Status");
    fieldDescMap.put("NK1-37", "Contact Person Social Security Number");
    fieldDescMap.put("NK1-36", "Handicap");
    fieldDescMap.put("NK1-39", "VIP Indicator");
    fieldDescMap.put("NK1-38", "Next of Kin Birth Place");
    fieldDescMap.put("NK1-29", "Contact Reason");
    fieldDescMap.put("NK1-31-10", "Contact Person's Telephone Number - Extension Prefix");
    fieldDescMap.put("NK1-31-11", "Contact Person's Telephone Number - Speed Dial Code");
    fieldDescMap
        .put("NK1-31-12", "Contact Person's Telephone Number - Unformatted Telephone number");
    fieldDescMap
        .put("IN2-69-8-2", "Insured Organization Name and ID - Assigning Facility - Universal ID");
    fieldDescMap
        .put("IN2-69-8-1", "Insured Organization Name and ID - Assigning Facility - Namespace ID");
    fieldDescMap.put("IN2-69-8-3",
        "Insured Organization Name and ID - Assigning Facility - Universal ID Type");
    fieldDescMap.put("NK1-30-1-4",
        "Contact Person's Name - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("NK1-30-1-3", "Contact Person's Name - Family Name - Own Surname");
    fieldDescMap
        .put("NK1-30-1-5", "Contact Person's Name - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("IN3-7-1", "Certification Modify Date/Time - Time");
    fieldDescMap.put("IN3-7-2", "Certification Modify Date/Time - Degree of Precision");
    fieldDescMap
        .put("GT1-2-10-1", "Guarantor Number - Assigning Agency or Department - Identifier");
    fieldDescMap.put("GT1-2-10-3",
        "Guarantor Number - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("GT1-2-10-2", "Guarantor Number - Assigning Agency or Department - Text");
    fieldDescMap
        .put("GT1-2-10-5", "Guarantor Number - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("GT1-2-10-4",
        "Guarantor Number - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("GT1-2-10-7",
        "Guarantor Number - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("GT1-2-10-6",
        "Guarantor Number - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap
        .put("GT1-2-10-9", "Guarantor Number - Assigning Agency or Department - Original Text");
    fieldDescMap.put("GT1-2-10-8",
        "Guarantor Number - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("PV2-13-14-1", "Referral Source Code - Assigning Facility - Namespace ID");
    fieldDescMap
        .put("PV2-13-14-3", "Referral Source Code - Assigning Facility - Universal ID Type");
    fieldDescMap.put("PV2-13-14-2", "Referral Source Code - Assigning Facility - Universal ID");
    fieldDescMap.put("OBX-16-9-1", "Responsible Observer - Assigning Authority - Namespace ID");
    fieldDescMap
        .put("OBX-16-9-3", "Responsible Observer - Assigning Authority - Universal ID Type");
    fieldDescMap.put("OBX-16-9-2", "Responsible Observer - Assigning Authority - Universal ID");
    fieldDescMap.put("OBX-16-19-1", "Responsible Observer - Effective Date - Time");
    fieldDescMap.put("OBX-16-19-2", "Responsible Observer - Effective Date - Degree of Precision");
    fieldDescMap.put("OBX-24-13-2",
        "Performing Organization Address - Effective Date - Degree of Precision");
    fieldDescMap.put("OBX-24-13-1", "Performing Organization Address - Effective Date - Time");
    fieldDescMap.put("IN1-37-1-2", "Policy Deductible - Price - Denomination");
    fieldDescMap.put("IN1-37-1-1", "Policy Deductible - Price - Quantity");
    fieldDescMap.put("PID-6-1-3", "Mother's Maiden Name - Family Name - Own Surname");
    fieldDescMap.put("PID-6-1-4",
        "Mother's Maiden Name - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("PID-6-1-1", "Mother's Maiden Name - Family Name - Surname");
    fieldDescMap.put("PID-6-1-2", "Mother's Maiden Name - Family Name - Own Surname Prefix");
    fieldDescMap.put("PD1-4-19-2",
        "Patient Primary Care Provider Name & ID No. - Effective Date - Degree of Precision");
    fieldDescMap
        .put("PD1-4-19-1", "Patient Primary Care Provider Name & ID No. - Effective Date - Time");
    fieldDescMap
        .put("SFT-1-6-3", "Software Vendor Organization - Assigning Authority - Universal ID Type");
    fieldDescMap
        .put("SFT-1-6-1", "Software Vendor Organization - Assigning Authority - Namespace ID");
    fieldDescMap
        .put("SFT-1-6-2", "Software Vendor Organization - Assigning Authority - Universal ID");
    fieldDescMap
        .put("PID-6-1-5", "Mother's Maiden Name - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("PV1-6-11-2",
        "Prior Patient Location - Assigning Authority for Location - Universal ID");
    fieldDescMap.put("PV1-6-11-3",
        "Prior Patient Location - Assigning Authority for Location - Universal ID Type");
    fieldDescMap.put("PV1-6-11-1",
        "Prior Patient Location - Assigning Authority for Location - Namespace ID");
    fieldDescMap.put("PID-6-14", "Mother's Maiden Name - Professional Suffix");
    fieldDescMap.put("PID-6-13", "Mother's Maiden Name - Expiration Date");
    fieldDescMap.put("PID-6-12", "Mother's Maiden Name - Effective Date");
    fieldDescMap.put("PID-6-11", "Mother's Maiden Name - Name Assembly Order");
    fieldDescMap.put("PID-6-10", "Mother's Maiden Name - Name Validity Range");
    fieldDescMap
        .put("ORC-12-22-3", "Ordering Provider - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap
        .put("IN2-61-9-5", "Patient Member Number - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("ORC-12-22-2", "Ordering Provider - Assigning Jurisdiction - Text");
    fieldDescMap
        .put("IN2-61-9-4", "Patient Member Number - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("ORC-12-22-5", "Ordering Provider - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("IN2-61-9-3",
        "Patient Member Number - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap
        .put("ORC-12-22-4", "Ordering Provider - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("IN2-61-9-2", "Patient Member Number - Assigning Jurisdiction - Text");
    fieldDescMap.put("IN2-61-9-1", "Patient Member Number - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("ORC-12-22-1", "Ordering Provider - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("ORC-12-22-7",
        "Ordering Provider - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("ORC-12-22-6",
        "Ordering Provider - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("ORC-12-22-9", "Ordering Provider - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("ORC-12-22-8",
        "Ordering Provider - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("PV1-17-2-2", "Admitting Doctor - Family Name - Own Surname Prefix");
    fieldDescMap.put("PV1-17-2-3", "Admitting Doctor - Family Name - Own Surname");
    fieldDescMap.put("ORC-11-20-2", "Verified By - Expiration Date - Degree of Precision");
    fieldDescMap.put("ORC-11-20-1", "Verified By - Expiration Date - Time");
    fieldDescMap.put("PV1-17-2-1", "Admitting Doctor - Family Name - Surname");
    fieldDescMap.put("IN2-61-9-8",
        "Patient Member Number - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap
        .put("IN2-61-9-9", "Patient Member Number - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("IN2-61-9-6",
        "Patient Member Number - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap
        .put("PV1-17-2-4", "Admitting Doctor - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("IN2-61-9-7",
        "Patient Member Number - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("PV1-17-2-5", "Admitting Doctor - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("NK1-12-9-1",
        "Next of Kin / Associated Parties Employee Number - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("IN1-16-12-1", "Name Of Insured - Effective Date - Time");
    fieldDescMap.put("NK1-12-9-2",
        "Next of Kin / Associated Parties Employee Number - Assigning Jurisdiction - Text");
    fieldDescMap.put("IN1-16-12-2", "Name Of Insured - Effective Date - Degree of Precision");
    fieldDescMap.put("ORC-4-1", "Placer Group Number - Entity Identifier");
    fieldDescMap.put("ORC-4-2", "Placer Group Number - Namespace ID");
    fieldDescMap.put("PV1-5-1", "Preadmit Number - ID Number");
    fieldDescMap.put("NK1-12-9-5",
        "Next of Kin / Associated Parties Employee Number - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("ORC-4-3", "Placer Group Number - Universal ID");
    fieldDescMap.put("NK1-12-9-6",
        "Next of Kin / Associated Parties Employee Number - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("ORC-4-4", "Placer Group Number - Universal ID Type");
    fieldDescMap.put("NK1-12-9-3",
        "Next of Kin / Associated Parties Employee Number - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("NK1-12-9-4",
        "Next of Kin / Associated Parties Employee Number - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("PV1-5-5", "Preadmit Number - Identifier Type Code");
    fieldDescMap.put("PV1-5-4", "Preadmit Number - Assigning Authority");
    fieldDescMap.put("PV1-5-3", "Preadmit Number - Check Digit Scheme");
    fieldDescMap.put("PV1-5-2", "Preadmit Number - Check Digit");
    fieldDescMap.put("PV1-5-9", "Preadmit Number - Assigning Jurisdiction");
    fieldDescMap.put("PV1-5-8", "Preadmit Number - Expiration Date");
    fieldDescMap.put("PV1-5-7", "Preadmit Number - Effective Date");
    fieldDescMap.put("PV1-5-6", "Preadmit Number - Assigning Facility");
    fieldDescMap.put("NK1-12-9-9",
        "Next of Kin / Associated Parties Employee Number - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("NK1-12-9-8",
        "Next of Kin / Associated Parties Employee Number - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("NK1-12-9-7",
        "Next of Kin / Associated Parties Employee Number - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("NK1-26-12-1", "Mother's Maiden Name - Effective Date - Time");
    fieldDescMap.put("NK1-26-12-2", "Mother's Maiden Name - Effective Date - Degree of Precision");
    fieldDescMap.put("ORC-13-1", "Enterer's Location - Point of Care");
    fieldDescMap.put("ORC-13-2", "Enterer's Location - Room");
    fieldDescMap.put("GT1-5-9", "Guarantor Address - County/Parish Code");
    fieldDescMap.put("ORC-13-3", "Enterer's Location - Bed");
    fieldDescMap.put("ORC-13-4", "Enterer's Location - Facility");
    fieldDescMap.put("ORC-13-5", "Enterer's Location - Location Status");
    fieldDescMap.put("ORC-13-6", "Enterer's Location - Person Location Type");
    fieldDescMap.put("GT1-5-5", "Guarantor Address - Zip or Postal Code");
    fieldDescMap.put("GT1-42-2", "Mother's Maiden Name - Given Name");
    fieldDescMap.put("ORC-13-7", "Enterer's Location - Building");
    fieldDescMap.put("GT1-5-6", "Guarantor Address - Country");
    fieldDescMap.put("GT1-42-3",
        "Mother's Maiden Name - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("ORC-13-8", "Enterer's Location - Floor");
    fieldDescMap.put("GT1-5-7", "Guarantor Address - Address Type");
    fieldDescMap.put("GT1-42-4", "Mother's Maiden Name - Suffix (e.g., JR or III)");
    fieldDescMap.put("ORC-13-9", "Enterer's Location - Location Description");
    fieldDescMap.put("GT1-5-8", "Guarantor Address - Other Geographic Designation");
    fieldDescMap.put("GT1-42-5", "Mother's Maiden Name - Prefix (e.g., DR)");
    fieldDescMap.put("GT1-5-1", "Guarantor Address - Street Address");
    fieldDescMap.put("GT1-5-2", "Guarantor Address - Other Designation");
    fieldDescMap.put("GT1-5-3", "Guarantor Address - City");
    fieldDescMap.put("GT1-5-4", "Guarantor Address - State or Province");
    fieldDescMap.put("GT1-42-1", "Mother's Maiden Name - Family Name");
    fieldDescMap.put("GT1-42-7", "Mother's Maiden Name - Name Type Code");
    fieldDescMap.put("GT1-42-6", "Mother's Maiden Name - Degree (e.g., MD)");
    fieldDescMap.put("GT1-42-9", "Mother's Maiden Name - Name Context");
    fieldDescMap.put("GT1-42-8", "Mother's Maiden Name - Name Representation Code");
    fieldDescMap.put("GT1-3-12-1", "Guarantor Name - Effective Date - Time");
    fieldDescMap.put("GT1-3-12-2", "Guarantor Name - Effective Date - Degree of Precision");
    fieldDescMap.put("IN2-25-10", "Payor ID - Assigning Agency or Department");
    fieldDescMap
        .put("IN1-3-9-3", "Insurance Company ID - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap
        .put("IN1-3-9-4", "Insurance Company ID - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("IN1-3-9-5", "Insurance Company ID - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("IN1-3-9-6",
        "Insurance Company ID - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("IN1-3-9-1", "Insurance Company ID - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("IN1-3-9-2", "Insurance Company ID - Assigning Jurisdiction - Text");
    fieldDescMap
        .put("ORC-21-8-3", "Ordering Facility Name - Assigning Facility - Universal ID Type");
    fieldDescMap.put("ORC-21-8-2", "Ordering Facility Name - Assigning Facility - Universal ID");
    fieldDescMap.put("ORC-21-8-1", "Ordering Facility Name - Assigning Facility - Namespace ID");
    fieldDescMap.put("IN1-3-9-7",
        "Insurance Company ID - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("IN1-3-9-8",
        "Insurance Company ID - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("IN1-3-9-9", "Insurance Company ID - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("IN3-3-14-3", "Certified By - Assigning Facility - Universal ID Type");
    fieldDescMap.put("PV1-19-6-2", "Visit Number - Assigning Facility - Universal ID");
    fieldDescMap.put("PV1-19-6-3", "Visit Number - Assigning Facility - Universal ID Type");
    fieldDescMap.put("IN3-3-14-1", "Certified By - Assigning Facility - Namespace ID");
    fieldDescMap.put("IN3-3-14-2", "Certified By - Assigning Facility - Universal ID");
    fieldDescMap.put("PV1-19-6-1", "Visit Number - Assigning Facility - Namespace ID");
    fieldDescMap.put("PV2-1-10", "Prior Pending Location - Comprehensive Location Identifier");
    fieldDescMap.put("PV2-1-11", "Prior Pending Location - Assigning Authority for Location");
    fieldDescMap.put("IN2-40-12-1", "Mother's Maiden Name - Effective Date - Time");
    fieldDescMap.put("IN2-40-12-2", "Mother's Maiden Name - Effective Date - Degree of Precision");
    fieldDescMap
        .put("IN1-10-4-3", "Insured's Group Emp ID - Assigning Authority - Universal ID Type");
    fieldDescMap.put("IN1-10-4-2", "Insured's Group Emp ID - Assigning Authority - Universal ID");
    fieldDescMap.put("IN1-10-4-1", "Insured's Group Emp ID - Assigning Authority - Namespace ID");
    fieldDescMap.put("PD1-10-4-2", "Duplicate Patient - Assigning Authority - Universal ID");
    populateFieldDescriptions1();
  }

  public void populateFieldDescriptions1() {
    fieldDescMap.put("PD1-10-4-1", "Duplicate Patient - Assigning Authority - Namespace ID");
    fieldDescMap.put("PD1-10-4-3", "Duplicate Patient - Assigning Authority - Universal ID Type");
    fieldDescMap.put("PV1-3-10-1",
        "Assigned Patient Location - Comprehensive Location Identifier - Entity Identifier");
    fieldDescMap.put("IN1-3-10", "Insurance Company ID - Assigning Agency or Department");
    fieldDescMap.put("PV1-3-10-2",
        "Assigned Patient Location - Comprehensive Location Identifier - Namespace ID");
    fieldDescMap.put("PV1-3-10-3",
        "Assigned Patient Location - Comprehensive Location Identifier - Universal ID");
    fieldDescMap.put("PV1-3-10-4",
        "Assigned Patient Location - Comprehensive Location Identifier - Universal ID Type");
    fieldDescMap.put("IN2-22-1-3", "Special Coverage Approval Name - Family Name - Own Surname");
    fieldDescMap.put("IN2-22-1-4",
        "Special Coverage Approval Name - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("IN2-22-1-1", "Special Coverage Approval Name - Family Name - Surname");
    fieldDescMap
        .put("IN2-22-1-2", "Special Coverage Approval Name - Family Name - Own Surname Prefix");
    fieldDescMap.put("IN2-22-1-5",
        "Special Coverage Approval Name - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("ORC-12-9-1", "Ordering Provider - Assigning Authority - Namespace ID");
    fieldDescMap.put("ORC-12-9-2", "Ordering Provider - Assigning Authority - Universal ID");
    fieldDescMap.put("IN2-22-9-6",
        "Special Coverage Approval Name - Name Context - Name of Alternate Coding System");
    fieldDescMap
        .put("IN2-22-9-5", "Special Coverage Approval Name - Name Context - Alternate Text");
    fieldDescMap.put("IN2-22-9-2", "Special Coverage Approval Name - Name Context - Text");
    fieldDescMap.put("IN2-22-9-1", "Special Coverage Approval Name - Name Context - Identifier");
    fieldDescMap
        .put("IN2-22-9-4", "Special Coverage Approval Name - Name Context - Alternate Identifier");
    fieldDescMap
        .put("IN2-22-9-3", "Special Coverage Approval Name - Name Context - Name of Coding System");
    fieldDescMap.put("SFT-1-5", "Software Vendor Organization - Check Digit Scheme");
    fieldDescMap.put("SFT-1-4", "Software Vendor Organization - Check Digit");
    fieldDescMap.put("SFT-1-7", "Software Vendor Organization - Identifier Type Code");
    fieldDescMap.put("SFT-1-6", "Software Vendor Organization - Assigning Authority");
    fieldDescMap.put("SFT-1-1", "Software Vendor Organization - Organization Name");
    fieldDescMap.put("SFT-1-3", "Software Vendor Organization - ID Number");
    fieldDescMap.put("SFT-1-2", "Software Vendor Organization - Organization Name Type Code");
    fieldDescMap.put("ORC-12-9-3", "Ordering Provider - Assigning Authority - Universal ID Type");
    fieldDescMap
        .put("PID-18-4-3", "Patient Account Number - Assigning Authority - Universal ID Type");
    fieldDescMap.put("PID-18-4-2", "Patient Account Number - Assigning Authority - Universal ID");
    fieldDescMap.put("NK1-33-10",
        "Next of Kin/Associated Party's Identifiers - Assigning Agency or Department");
    fieldDescMap.put("PID-18-4-1", "Patient Account Number - Assigning Authority - Namespace ID");
    fieldDescMap.put("SFT-1-8", "Software Vendor Organization - Assigning Facility");
    fieldDescMap.put("SFT-1-9", "Software Vendor Organization - Name Representation Code");
    fieldDescMap.put("PV2-30-2", "Patient Charge Adjustment Code - Text");
    fieldDescMap.put("PV2-30-1", "Patient Charge Adjustment Code - Identifier");
    fieldDescMap
        .put("PV2-30-6", "Patient Charge Adjustment Code - Name of Alternate Coding System");
    fieldDescMap.put("PV2-30-5", "Patient Charge Adjustment Code - Alternate Text");
    fieldDescMap.put("PV2-30-4", "Patient Charge Adjustment Code - Alternate Identifier");
    fieldDescMap.put("PV2-30-3", "Patient Charge Adjustment Code - Name of Coding System");
    fieldDescMap.put("OBX-25-23",
        "Performing Organization Medical Director - Assigning Agency or Department");
    fieldDescMap
        .put("OBX-25-22", "Performing Organization Medical Director - Assigning Jurisdiction");
    fieldDescMap.put("OBX-25-21", "Performing Organization Medical Director - Professional Suffix");
    fieldDescMap.put("OBX-25-20", "Performing Organization Medical Director - Expiration Date");
    fieldDescMap.put("GT1-35-1", "Citizenship - Identifier");
    fieldDescMap.put("ORC-25-1", "Order Status Modifier - Identifier");
    fieldDescMap.put("ORC-25-2", "Order Status Modifier - Text");
    fieldDescMap.put("IN2-22-14", "Special Coverage Approval Name - Professional Suffix");
    fieldDescMap.put("ORC-25-3", "Order Status Modifier - Name of Coding System");
    fieldDescMap.put("ORC-25-4", "Order Status Modifier - Alternate Identifier");
    fieldDescMap.put("ORC-25-5", "Order Status Modifier - Alternate Text");
    fieldDescMap.put("ORC-25-6", "Order Status Modifier - Name of Alternate Coding System");
    fieldDescMap.put("ORC-25-7", "Order Status Modifier - Coding System Version ID");
    fieldDescMap.put("ORC-25-8", "Order Status Modifier - Alternate Coding System Version ID");
    fieldDescMap.put("ORC-25-9", "Order Status Modifier - Original Text");
    fieldDescMap.put("OBX-25-18", "Performing Organization Medical Director - Name Assembly Order");
    fieldDescMap.put("OBX-25-17", "Performing Organization Medical Director - Name Validity Range");
    fieldDescMap.put("OBX-25-19", "Performing Organization Medical Director - Effective Date");
    fieldDescMap.put("OBX-25-10", "Performing Organization Medical Director - Name Type Code");
    fieldDescMap.put("IN2-22-10", "Special Coverage Approval Name - Name Validity Range");
    fieldDescMap.put("IN2-22-11", "Special Coverage Approval Name - Name Assembly Order");
    fieldDescMap.put("OBX-25-12", "Performing Organization Medical Director - Check Digit Scheme");
    fieldDescMap.put("IN2-22-12", "Special Coverage Approval Name - Effective Date");
    fieldDescMap
        .put("OBX-25-11", "Performing Organization Medical Director - Identifier Check Digit");
    fieldDescMap.put("GT1-35-6", "Citizenship - Name of Alternate Coding System");
    fieldDescMap.put("IN2-22-13", "Special Coverage Approval Name - Expiration Date");
    fieldDescMap.put("OBX-25-14", "Performing Organization Medical Director - Assigning Facility");
    fieldDescMap.put("GT1-35-5", "Citizenship - Alternate Text");
    fieldDescMap
        .put("OBX-25-13", "Performing Organization Medical Director - Identifier Type Code");
    fieldDescMap.put("GT1-35-4", "Citizenship - Alternate Identifier");
    fieldDescMap.put("OBX-25-16", "Performing Organization Medical Director - Name Context");
    fieldDescMap.put("GT1-35-3", "Citizenship - Name of Coding System");
    fieldDescMap
        .put("OBX-25-15", "Performing Organization Medical Director - Name Representation Code");
    fieldDescMap.put("GT1-35-2", "Citizenship - Text");
    fieldDescMap.put("IN2-3-19-1", "Insured's Employer's Name and ID - Effective Date - Time");
    fieldDescMap.put("IN2-3-19-2",
        "Insured's Employer's Name and ID - Effective Date - Degree of Precision");
    fieldDescMap.put("IN3-8-10", "Operator - Name Type Code");
    fieldDescMap.put("IN3-8-13", "Operator - Identifier Type Code");
    fieldDescMap.put("GT1-42-11", "Mother's Maiden Name - Name Assembly Order");
    fieldDescMap.put("IN3-8-14", "Operator - Assigning Facility");
    fieldDescMap.put("GT1-42-12", "Mother's Maiden Name - Effective Date");
    fieldDescMap.put("IN3-8-11", "Operator - Identifier Check Digit");
    fieldDescMap.put("IN3-8-12", "Operator - Check Digit Scheme");
    fieldDescMap.put("GT1-42-10", "Mother's Maiden Name - Name Validity Range");
    fieldDescMap.put("IN3-8-17", "Operator - Name Validity Range");
    fieldDescMap.put("IN3-8-18", "Operator - Name Assembly Order");
    fieldDescMap.put("PV2-13-9-1", "Referral Source Code - Assigning Authority - Namespace ID");
    fieldDescMap.put("IN3-8-15", "Operator - Name Representation Code");
    fieldDescMap.put("GT1-42-13", "Mother's Maiden Name - Expiration Date");
    fieldDescMap.put("IN3-8-16", "Operator - Name Context");
    fieldDescMap.put("GT1-42-14", "Mother's Maiden Name - Professional Suffix");
    fieldDescMap
        .put("OBX-25-19-1", "Performing Organization Medical Director - Effective Date - Time");
    fieldDescMap.put("IN3-8-19", "Operator - Effective Date");
    fieldDescMap.put("PV2-13-9-2", "Referral Source Code - Assigning Authority - Universal ID");
    fieldDescMap.put("OBX-25-19-2",
        "Performing Organization Medical Director - Effective Date - Degree of Precision");
    fieldDescMap
        .put("PV2-13-9-3", "Referral Source Code - Assigning Authority - Universal ID Type");
    fieldDescMap.put("PV2-38-4", "Mode of Arrival Code - Alternate Identifier");
    fieldDescMap.put("PV2-38-3", "Mode of Arrival Code - Name of Coding System");
    fieldDescMap.put("PV2-38-6", "Mode of Arrival Code - Name of Alternate Coding System");
    fieldDescMap.put("PV2-38-5", "Mode of Arrival Code - Alternate Text");
    fieldDescMap.put("PV2-38-2", "Mode of Arrival Code - Text");
    fieldDescMap.put("PV2-38-1", "Mode of Arrival Code - Identifier");
    fieldDescMap.put("NK1-33-4-2",
        "Next of Kin/Associated Party's Identifiers - Assigning Authority - Universal ID");
    fieldDescMap.put("NK1-33-4-1",
        "Next of Kin/Associated Party's Identifiers - Assigning Authority - Namespace ID");
    fieldDescMap.put("NK1-33-4-3",
        "Next of Kin/Associated Party's Identifiers - Assigning Authority - Universal ID Type");
    fieldDescMap.put("IN3-8-20", "Operator - Expiration Date");
    fieldDescMap.put("IN3-8-21", "Operator - Professional Suffix");
    fieldDescMap.put("IN3-8-22", "Operator - Assigning Jurisdiction");
    fieldDescMap.put("IN3-8-23", "Operator - Assigning Agency or Department");
    fieldDescMap.put("OBX-25-22-7",
        "Performing Organization Medical Director - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("OBX-25-22-8",
        "Performing Organization Medical Director - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("OBX-25-22-9",
        "Performing Organization Medical Director - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("OBX-25-22-3",
        "Performing Organization Medical Director - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("OBX-25-22-4",
        "Performing Organization Medical Director - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("ORC-21-10", "Ordering Facility Name - Organization Identifier");
    fieldDescMap.put("OBX-25-22-5",
        "Performing Organization Medical Director - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("OBX-25-22-6",
        "Performing Organization Medical Director - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap
        .put("PID-3-10-1", "Patient Identifier List - Assigning Agency or Department - Identifier");
    fieldDescMap.put("OBX-25-22-1",
        "Performing Organization Medical Director - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("OBX-25-22-2",
        "Performing Organization Medical Director - Assigning Jurisdiction - Text");
    fieldDescMap.put("OBX-17-2", "Observation Method - Text");
    fieldDescMap.put("OBX-17-1", "Observation Method - Identifier");
    fieldDescMap.put("PD1-10-10", "Duplicate Patient - Assigning Agency or Department");
    fieldDescMap.put("OBX-17-4", "Observation Method - Alternate Identifier");
    fieldDescMap.put("PV2-45-2", "Advance Directive Code - Text");
    fieldDescMap.put("OBX-17-3", "Observation Method - Name of Coding System");
    fieldDescMap.put("PV2-45-1", "Advance Directive Code - Identifier");
    fieldDescMap.put("OBX-17-6", "Observation Method - Name of Alternate Coding System");
    fieldDescMap.put("OBX-17-5", "Observation Method - Alternate Text");
    fieldDescMap.put("PV2-45-6", "Advance Directive Code - Name of Alternate Coding System");
    fieldDescMap.put("IN2-49-5", "Employer Contact Person Name - Prefix (e.g., DR)");
    fieldDescMap.put("PV2-45-5", "Advance Directive Code - Alternate Text");
    fieldDescMap.put("IN2-49-4", "Employer Contact Person Name - Suffix (e.g., JR or III)");
    fieldDescMap.put("PV2-45-4", "Advance Directive Code - Alternate Identifier");
    fieldDescMap.put("IN2-49-7", "Employer Contact Person Name - Name Type Code");
    fieldDescMap.put("PV2-45-3", "Advance Directive Code - Name of Coding System");
    fieldDescMap.put("IN2-49-6", "Employer Contact Person Name - Degree (e.g., MD)");
    fieldDescMap
        .put("PV1-42-10-2", "Pending Location - Comprehensive Location Identifier - Namespace ID");
    fieldDescMap.put("IN2-49-1", "Employer Contact Person Name - Family Name");
    fieldDescMap.put("PV1-42-10-1",
        "Pending Location - Comprehensive Location Identifier - Entity Identifier");
    fieldDescMap.put("PV1-42-10-4",
        "Pending Location - Comprehensive Location Identifier - Universal ID Type");
    fieldDescMap.put("IN2-49-3",
        "Employer Contact Person Name - Second and Further Given Names or Initials Thereof");
    fieldDescMap
        .put("PV1-42-10-3", "Pending Location - Comprehensive Location Identifier - Universal ID");
    fieldDescMap.put("IN2-49-2", "Employer Contact Person Name - Given Name");
    fieldDescMap.put("IN2-49-8", "Employer Contact Person Name - Name Representation Code");
    fieldDescMap.put("IN2-49-9", "Employer Contact Person Name - Name Context");
    fieldDescMap.put("ORC-19-22-2", "Action By - Assigning Jurisdiction - Text");
    fieldDescMap.put("ORC-19-22-1", "Action By - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("ORC-19-22-4", "Action By - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("ORC-19-22-3", "Action By - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("IN2-7-13-2", "Medicaid Case Name - Expiration Date - Degree of Precision");
    fieldDescMap.put("IN2-7-13-1", "Medicaid Case Name - Expiration Date - Time");
    fieldDescMap.put("PV1-8-9-3", "Referring Doctor - Assigning Authority - Universal ID Type");
    fieldDescMap
        .put("ORC-19-22-7", "Action By - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("IN1-44-14-1", "Insured's Employer's Address - Expiration Date - Time");
    fieldDescMap.put("ORC-19-22-8",
        "Action By - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("ORC-19-22-5", "Action By - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("PV1-8-9-1", "Referring Doctor - Assigning Authority - Namespace ID");
    fieldDescMap
        .put("ORC-19-22-6", "Action By - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("PV1-8-9-2", "Referring Doctor - Assigning Authority - Universal ID");
    fieldDescMap.put("ORC-19-22-9", "Action By - Assigning Jurisdiction - Original Text");
    fieldDescMap
        .put("IN1-44-14-2", "Insured's Employer's Address - Expiration Date - Degree of Precision");
    fieldDescMap.put("ORC-11-14-3", "Verified By - Assigning Facility - Universal ID Type");
    fieldDescMap.put("ORC-11-14-2", "Verified By - Assigning Facility - Universal ID");
    fieldDescMap.put("ORC-11-14-1", "Verified By - Assigning Facility - Namespace ID");
    fieldDescMap.put("PD1-11-5", "Publicity Code - Alternate Text");
    fieldDescMap.put("PD1-11-6", "Publicity Code - Name of Alternate Coding System");
    fieldDescMap.put("RXR-6-2", "Administration Site Modifier - Text");
    fieldDescMap.put("ORC-13-4-1", "Enterer's Location - Facility - Namespace ID");
    fieldDescMap.put("PD1-11-3", "Publicity Code - Name of Coding System");
    fieldDescMap.put("RXR-6-3", "Administration Site Modifier - Name of Coding System");
    fieldDescMap.put("ORC-13-4-2", "Enterer's Location - Facility - Universal ID");
    fieldDescMap.put("PD1-11-4", "Publicity Code - Alternate Identifier");
    fieldDescMap.put("PD1-11-1", "Publicity Code - Identifier");
    fieldDescMap.put("RXR-6-1", "Administration Site Modifier - Identifier");
    fieldDescMap.put("PD1-11-2", "Publicity Code - Text");
    fieldDescMap.put("RXR-6-6", "Administration Site Modifier - Name of Alternate Coding System");
    fieldDescMap.put("RXR-6-7", "Administration Site Modifier - Coding System Version ID");
    fieldDescMap.put("PID-29-1", "Patient Death Date and Time - Time");
    fieldDescMap.put("RXR-6-4", "Administration Site Modifier - Alternate Identifier");
    fieldDescMap.put("ORC-13-4-3", "Enterer's Location - Facility - Universal ID Type");
    fieldDescMap.put("PID-29-2", "Patient Death Date and Time - Degree of Precision");
    fieldDescMap.put("RXR-6-5", "Administration Site Modifier - Alternate Text");
    fieldDescMap.put("RXR-6-9", "Administration Site Modifier - Original Text");
    fieldDescMap.put("GT1-29-9", "Guarantor Employer ID Number - Assigning Jurisdiction");
    fieldDescMap
        .put("RXR-6-8", "Administration Site Modifier - Alternate Coding System Version ID");
    fieldDescMap.put("GT1-29-5", "Guarantor Employer ID Number - Identifier Type Code");
    fieldDescMap.put("IN1-19-1", "Insured's Address - Street Address");
    fieldDescMap.put("GT1-29-6", "Guarantor Employer ID Number - Assigning Facility");
    fieldDescMap.put("GT1-29-7", "Guarantor Employer ID Number - Effective Date");
    fieldDescMap.put("IN1-19-3", "Insured's Address - City");
    fieldDescMap.put("GT1-29-8", "Guarantor Employer ID Number - Expiration Date");
    fieldDescMap.put("IN1-19-2", "Insured's Address - Other Designation");
    fieldDescMap.put("GT1-29-1", "Guarantor Employer ID Number - ID Number");
    fieldDescMap.put("GT1-29-2", "Guarantor Employer ID Number - Check Digit");
    fieldDescMap.put("GT1-29-3", "Guarantor Employer ID Number - Check Digit Scheme");
    fieldDescMap.put("GT1-29-4", "Guarantor Employer ID Number - Assigning Authority");
    fieldDescMap.put("GT1-6-7", "Guarantor Ph Num - Home - Local Number");
    fieldDescMap.put("GT1-41-6", "Religion - Name of Alternate Coding System");
    fieldDescMap.put("GT1-6-6", "Guarantor Ph Num - Home - Area/City Code");
    fieldDescMap.put("GT1-41-5", "Religion - Alternate Text");
    fieldDescMap.put("ORC-19-19-1", "Action By - Effective Date - Time");
    fieldDescMap.put("GT1-6-5", "Guarantor Ph Num - Home - Country Code");
    fieldDescMap.put("GT1-41-4", "Religion - Alternate Identifier");
    fieldDescMap.put("ORC-19-19-2", "Action By - Effective Date - Degree of Precision");
    fieldDescMap.put("GT1-6-4", "Guarantor Ph Num - Home - Email Address");
    fieldDescMap.put("GT1-41-3", "Religion - Name of Coding System");
    fieldDescMap.put("GT1-6-3", "Guarantor Ph Num - Home - Telecommunication Equipment Type");
    fieldDescMap.put("GT1-41-2", "Religion - Text");
    fieldDescMap.put("GT1-6-2", "Guarantor Ph Num - Home - Telecommunication Use Code");
    fieldDescMap.put("GT1-41-1", "Religion - Identifier");
    fieldDescMap.put("GT1-6-1", "Guarantor Ph Num - Home - Telephone Number");
    fieldDescMap.put("IN1-19-4", "Insured's Address - State or Province");
    fieldDescMap.put("IN1-19-5", "Insured's Address - Zip or Postal Code");
    fieldDescMap.put("PID-15-1", "Primary Language - Identifier");
    fieldDescMap.put("IN1-19-6", "Insured's Address - Country");
    fieldDescMap.put("PID-15-2", "Primary Language - Text");
    fieldDescMap.put("IN1-19-7", "Insured's Address - Address Type");
    fieldDescMap.put("PID-15-3", "Primary Language - Name of Coding System");
    fieldDescMap.put("IN1-19-8", "Insured's Address - Other Geographic Designation");
    fieldDescMap.put("PID-15-4", "Primary Language - Alternate Identifier");
    fieldDescMap.put("IN1-19-9", "Insured's Address - County/Parish Code");
    fieldDescMap.put("PID-15-5", "Primary Language - Alternate Text");
    fieldDescMap.put("GT1-6-9", "Guarantor Ph Num - Home - Any Text");
    fieldDescMap.put("PID-15-6", "Primary Language - Name of Alternate Coding System");
    fieldDescMap.put("GT1-6-8", "Guarantor Ph Num - Home - Extension");
    fieldDescMap.put("PV1-7-23-2", "Attending Doctor - Assigning Agency or Department - Text");
    fieldDescMap.put("PV1-7-23-3",
        "Attending Doctor - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("IN2-7-14", "Medicaid Case Name - Professional Suffix");
    fieldDescMap
        .put("PV1-7-23-1", "Attending Doctor - Assigning Agency or Department - Identifier");
    fieldDescMap.put("IN2-7-13", "Medicaid Case Name - Expiration Date");
    fieldDescMap.put("IN2-7-12", "Medicaid Case Name - Effective Date");
    fieldDescMap.put("IN2-7-11", "Medicaid Case Name - Name Assembly Order");
    fieldDescMap.put("IN2-7-10", "Medicaid Case Name - Name Validity Range");
    fieldDescMap.put("PV2-1-4-1", "Prior Pending Location - Facility - Namespace ID");
    fieldDescMap.put("GT1-29-10", "Guarantor Employer ID Number - Assigning Agency or Department");
    fieldDescMap.put("PV2-1-4-3", "Prior Pending Location - Facility - Universal ID Type");
    fieldDescMap.put("PV2-1-4-2", "Prior Pending Location - Facility - Universal ID");
    fieldDescMap.put("IN1-9-8-1", "Group Name - Assigning Facility - Namespace ID");
    fieldDescMap.put("IN2-64-8", "Insured's Employer Phone Number - Extension");
    fieldDescMap.put("IN2-64-7", "Insured's Employer Phone Number - Local Number");
    fieldDescMap.put("IN2-64-9", "Insured's Employer Phone Number - Any Text");
    fieldDescMap.put("IN2-64-4", "Insured's Employer Phone Number - Email Address");
    fieldDescMap
        .put("PV1-7-23-5", "Attending Doctor - Assigning Agency or Department - Alternate Text");
    fieldDescMap
        .put("IN2-64-3", "Insured's Employer Phone Number - Telecommunication Equipment Type");
    fieldDescMap.put("PV1-7-23-4",
        "Attending Doctor - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("IN2-64-6", "Insured's Employer Phone Number - Area/City Code");
    fieldDescMap.put("PV1-7-23-7",
        "Attending Doctor - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("IN2-64-5", "Insured's Employer Phone Number - Country Code");
    fieldDescMap.put("PV1-7-23-6",
        "Attending Doctor - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap
        .put("PV1-7-23-9", "Attending Doctor - Assigning Agency or Department - Original Text");
    fieldDescMap.put("IN1-9-8-2", "Group Name - Assigning Facility - Universal ID");
    fieldDescMap.put("PV1-7-23-8",
        "Attending Doctor - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("IN1-9-8-3", "Group Name - Assigning Facility - Universal ID Type");
    fieldDescMap.put("IN2-64-2", "Insured's Employer Phone Number - Telecommunication Use Code");
    fieldDescMap.put("IN2-64-1", "Insured's Employer Phone Number - Telephone Number");
    fieldDescMap
        .put("IN2-49-12-2", "Employer Contact Person Name - Effective Date - Degree of Precision");
    fieldDescMap.put("IN2-49-12-1", "Employer Contact Person Name - Effective Date - Time");
    fieldDescMap.put("PD1-14-6-3", "Place of Worship - Assigning Authority - Universal ID Type");
    fieldDescMap.put("PD1-14-6-2", "Place of Worship - Assigning Authority - Universal ID");
    fieldDescMap.put("PD1-14-6-1", "Place of Worship - Assigning Authority - Namespace ID");
    fieldDescMap.put("NK1-32-1-3", "Contact Person's Address - Street Address - Dwelling Number");
    fieldDescMap.put("NK1-32-1-2", "Contact Person's Address - Street Address - Street Name");
    fieldDescMap
        .put("NK1-32-1-1", "Contact Person's Address - Street Address - Street or Mailing Address");
    fieldDescMap.put("NK1-27-1", "Nationality - Identifier");
    fieldDescMap.put("RXA-3-2", "Date/Time Start of Administration - Degree of Precision");
    fieldDescMap.put("NK1-27-2", "Nationality - Text");
    fieldDescMap.put("RXA-3-1", "Date/Time Start of Administration - Time");
    fieldDescMap.put("NK1-27-5", "Nationality - Alternate Text");
    fieldDescMap.put("NK1-27-6", "Nationality - Name of Alternate Coding System");
    fieldDescMap.put("NK1-27-3", "Nationality - Name of Coding System");
    fieldDescMap.put("NK1-27-4", "Nationality - Alternate Identifier");
    fieldDescMap.put("IN1-4-1", "Insurance Company Name - Organization Name");
    fieldDescMap.put("IN1-4-2", "Insurance Company Name - Organization Name Type Code");
    fieldDescMap.put("IN1-4-3", "Insurance Company Name - ID Number");
    fieldDescMap.put("IN1-4-4", "Insurance Company Name - Check Digit");
    fieldDescMap.put("IN1-4-5", "Insurance Company Name - Check Digit Scheme");
    fieldDescMap.put("IN1-4-6", "Insurance Company Name - Assigning Authority");
    fieldDescMap.put("IN1-4-7", "Insurance Company Name - Identifier Type Code");
    fieldDescMap.put("IN1-4-8", "Insurance Company Name - Assigning Facility");
    fieldDescMap.put("IN1-4-9", "Insurance Company Name - Name Representation Code");
    fieldDescMap.put("TQ1-13-2-3", "Occurrence duration - Units - Name of Coding System");
    fieldDescMap.put("TQ1-13-2-4", "Occurrence duration - Units - Alternate Identifier");
    fieldDescMap.put("TQ1-13-2-1", "Occurrence duration - Units - Identifier");
    fieldDescMap.put("TQ1-13-2-2", "Occurrence duration - Units - Text");
    fieldDescMap.put("IN2-52-1-3", "Insured's Contact Person's Name - Family Name - Own Surname");
    fieldDescMap
        .put("IN2-52-1-2", "Insured's Contact Person's Name - Family Name - Own Surname Prefix");
    fieldDescMap.put("IN2-52-1-1", "Insured's Contact Person's Name - Family Name - Surname");
    fieldDescMap.put("IN2-52-1-5",
        "Insured's Contact Person's Name - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("IN2-52-1-4",
        "Insured's Contact Person's Name - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("TQ1-13-2-5", "Occurrence duration - Units - Alternate Text");
    fieldDescMap.put("TQ1-13-2-6", "Occurrence duration - Units - Name of Alternate Coding System");
    fieldDescMap.put("IN2-64-12", "Insured's Employer Phone Number - Unformatted Telephone number");
    fieldDescMap.put("IN2-42-1", "Ethnic Group - Identifier");
    fieldDescMap.put("IN2-42-2", "Ethnic Group - Text");
    fieldDescMap.put("IN2-34-2", "Primary Language - Text");
    fieldDescMap.put("IN2-42-3", "Ethnic Group - Name of Coding System");
    fieldDescMap.put("IN2-34-3", "Primary Language - Name of Coding System");
    fieldDescMap.put("IN2-42-4", "Ethnic Group - Alternate Identifier");
    fieldDescMap.put("IN2-1-6-1", "Insured's Employee ID - Assigning Facility - Namespace ID");
    fieldDescMap.put("IN2-42-5", "Ethnic Group - Alternate Text");
    fieldDescMap.put("IN2-1-6-2", "Insured's Employee ID - Assigning Facility - Universal ID");
    fieldDescMap.put("IN2-34-1", "Primary Language - Identifier");
    fieldDescMap.put("IN2-42-6", "Ethnic Group - Name of Alternate Coding System");
    fieldDescMap.put("IN2-34-6", "Primary Language - Name of Alternate Coding System");
    fieldDescMap.put("IN2-34-4", "Primary Language - Alternate Identifier");
    fieldDescMap.put("IN2-34-5", "Primary Language - Alternate Text");
    fieldDescMap.put("IN2-64-11", "Insured's Employer Phone Number - Speed Dial Code");
    fieldDescMap.put("IN2-64-10", "Insured's Employer Phone Number - Extension Prefix");
    fieldDescMap.put("GT1-45-9-4", "Contact Person's Name - Name Context - Alternate Identifier");
    fieldDescMap.put("GT1-45-9-3", "Contact Person's Name - Name Context - Name of Coding System");
    fieldDescMap.put("GT1-45-9-6",
        "Contact Person's Name - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("GT1-45-9-5", "Contact Person's Name - Name Context - Alternate Text");
    fieldDescMap.put("IN2-1-6-3", "Insured's Employee ID - Assigning Facility - Universal ID Type");
    fieldDescMap.put("GT1-45-9-2", "Contact Person's Name - Name Context - Text");
    fieldDescMap.put("GT1-45-9-1", "Contact Person's Name - Name Context - Identifier");
    fieldDescMap.put("NK1-26-1-1", "Mother's Maiden Name - Family Name - Surname");
    fieldDescMap.put("NK1-26-1-3", "Mother's Maiden Name - Family Name - Own Surname");
    fieldDescMap.put("NK1-26-1-2", "Mother's Maiden Name - Family Name - Own Surname Prefix");
    fieldDescMap
        .put("NK1-26-1-5", "Mother's Maiden Name - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("NK1-26-1-4",
        "Mother's Maiden Name - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("PID-14-8", "Phone Number - Business - Extension");
    fieldDescMap.put("PID-14-9", "Phone Number - Business - Any Text");
    fieldDescMap.put("IN1-30-22-6",
        "Verification By - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap
        .put("IN1-30-22-7", "Verification By - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("IN1-30-22-8",
        "Verification By - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("IN1-30-22-9", "Verification By - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("IN1-30-22-2", "Verification By - Assigning Jurisdiction - Text");
    fieldDescMap
        .put("IN1-30-22-3", "Verification By - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap
        .put("IN1-30-22-4", "Verification By - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("IN1-30-22-5", "Verification By - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("IN1-30-22-1", "Verification By - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("TQ1-13-1", "Occurrence duration - Quantity");
    fieldDescMap.put("PID-14-3", "Phone Number - Business - Telecommunication Equipment Type");
    fieldDescMap.put("IN2-40-11", "Mother's Maiden Name - Name Assembly Order");
    fieldDescMap.put("PID-14-2", "Phone Number - Business - Telecommunication Use Code");
    fieldDescMap.put("IN2-40-10", "Mother's Maiden Name - Name Validity Range");
    fieldDescMap.put("PID-14-1", "Phone Number - Business - Telephone Number");
    fieldDescMap.put("IN2-40-13", "Mother's Maiden Name - Expiration Date");
    fieldDescMap.put("IN2-40-12", "Mother's Maiden Name - Effective Date");
    fieldDescMap.put("PID-14-7", "Phone Number - Business - Local Number");
    fieldDescMap.put("PID-14-6", "Phone Number - Business - Area/City Code");
    fieldDescMap.put("IN2-40-14", "Mother's Maiden Name - Professional Suffix");
    fieldDescMap.put("PID-14-5", "Phone Number - Business - Country Code");
    fieldDescMap.put("PID-14-4", "Phone Number - Business - Email Address");
    fieldDescMap.put("TQ1-13-2", "Occurrence duration - Units");
    fieldDescMap
        .put("GT1-51-10", "Guarantor Employer's Organization Name - Organization Identifier");
    fieldDescMap.put("PV1-10", "Hospital Service");
    fieldDescMap.put("IN2-3-22", "Insured's Employer's Name and ID - Assigning Jurisdiction");
    fieldDescMap
        .put("IN2-3-23", "Insured's Employer's Name and ID - Assigning Agency or Department");
    fieldDescMap.put("PV1-12", "Preadmit Test Indicator");
    fieldDescMap.put("IN2-3-20", "Insured's Employer's Name and ID - Expiration Date");
    fieldDescMap.put("PV1-11", "Temporary Location");
    fieldDescMap.put("IN2-3-21", "Insured's Employer's Name and ID - Professional Suffix");
    fieldDescMap.put("PV1-14", "Admit Source");
    fieldDescMap.put("PV1-13", "Re-admission Indicator");
    fieldDescMap.put("PV1-16", "VIP Indicator");
    fieldDescMap.put("PV1-15", "Ambulatory Status");
    fieldDescMap.put("PV1-18", "Patient Type");
    fieldDescMap.put("PV1-17", "Admitting Doctor");
    fieldDescMap.put("PV1-19", "Visit Number");
    fieldDescMap.put("SFT-1-10", "Software Vendor Organization - Organization Identifier");
    fieldDescMap.put("IN2-3-19", "Insured's Employer's Name and ID - Effective Date");
    fieldDescMap.put("RXA-10-10", "Administering Provider - Name Type Code");
    fieldDescMap.put("PV1-20-1", "Financial Class - Financial Class Code");
    fieldDescMap.put("IN2-3-18", "Insured's Employer's Name and ID - Name Assembly Order");
    fieldDescMap.put("PV1-20-2", "Financial Class - Effective Date");
    fieldDescMap.put("IN2-3-17", "Insured's Employer's Name and ID - Name Validity Range");
    fieldDescMap.put("RXA-10-12", "Administering Provider - Check Digit Scheme");
    fieldDescMap.put("RXA-10-11", "Administering Provider - Identifier Check Digit");
    fieldDescMap.put("RXA-10-14", "Administering Provider - Assigning Facility");
    fieldDescMap.put("RXA-10-13", "Administering Provider - Identifier Type Code");
    fieldDescMap.put("PV1-23", "Credit Rating");
    fieldDescMap.put("PV1-8-21", "Referring Doctor - Professional Suffix");
    fieldDescMap
        .put("PD1-4-14", "Patient Primary Care Provider Name & ID No. - Assigning Facility");
    fieldDescMap.put("IN2-58-10", "Insurance Co Contact Phone Number - Extension Prefix");
    fieldDescMap.put("PV1-22", "Courtesy Code");
    fieldDescMap.put("PV1-8-22", "Referring Doctor - Assigning Jurisdiction");
    fieldDescMap
        .put("PD1-4-15", "Patient Primary Care Provider Name & ID No. - Name Representation Code");
    fieldDescMap.put("IN2-3-10", "Insured's Employer's Name and ID - Name Type Code");
    fieldDescMap.put("IN2-58-11", "Insurance Co Contact Phone Number - Speed Dial Code");
    fieldDescMap.put("PV1-21", "Charge Price Indicator");
    fieldDescMap.put("PD1-4-16", "Patient Primary Care Provider Name & ID No. - Name Context");
    fieldDescMap.put("IN2-3-11", "Insured's Employer's Name and ID - Identifier Check Digit");
    fieldDescMap
        .put("IN2-58-12", "Insurance Co Contact Phone Number - Unformatted Telephone number");
    fieldDescMap.put("PV1-20", "Financial Class");
    fieldDescMap.put("PV1-8-20", "Referring Doctor - Expiration Date");
    fieldDescMap
        .put("PD1-4-17", "Patient Primary Care Provider Name & ID No. - Name Validity Range");
    fieldDescMap.put("IN2-3-12", "Insured's Employer's Name and ID - Check Digit Scheme");
    fieldDescMap.put("PV1-27", "Contract Period");
    fieldDescMap.put("PD1-4-10", "Patient Primary Care Provider Name & ID No. - Name Type Code");
    fieldDescMap.put("IN2-3-13", "Insured's Employer's Name and ID - Identifier Type Code");
    fieldDescMap.put("PV1-26", "Contract Amount");
    fieldDescMap
        .put("PD1-4-11", "Patient Primary Care Provider Name & ID No. - Identifier Check Digit");
    fieldDescMap.put("IN2-3-14", "Insured's Employer's Name and ID - Assigning Facility");
    fieldDescMap.put("PV1-25", "Contract Effective Date");
    fieldDescMap
        .put("PD1-4-12", "Patient Primary Care Provider Name & ID No. - Check Digit Scheme");
    fieldDescMap.put("IN2-3-15", "Insured's Employer's Name and ID - Name Representation Code");
    fieldDescMap.put("PV1-24", "Contract Code");
    fieldDescMap
        .put("PD1-4-13", "Patient Primary Care Provider Name & ID No. - Identifier Type Code");
    fieldDescMap.put("IN2-3-16", "Insured's Employer's Name and ID - Name Context");
    fieldDescMap.put("PV1-29", "Transfer to Bad Debt Code");
    fieldDescMap.put("PV1-28", "Interest Code");
    fieldDescMap.put("PV1-8-23", "Referring Doctor - Assigning Agency or Department");
    fieldDescMap.put("PD1-4-19", "Patient Primary Care Provider Name & ID No. - Effective Date");
    fieldDescMap.put("PV1-30", "Transfer to Bad Debt Date");
    fieldDescMap
        .put("PD1-4-18", "Patient Primary Care Provider Name & ID No. - Name Assembly Order");
    fieldDescMap.put("PV1-8-13", "Referring Doctor - Identifier Type Code");
    fieldDescMap
        .put("PV1-9-16-6", "Consulting Doctor - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("PV1-8-12", "Referring Doctor - Check Digit Scheme");
    fieldDescMap.put("PV1-8-15", "Referring Doctor - Name Representation Code");
    fieldDescMap.put("IN1-16-9-2", "Name Of Insured - Name Context - Text");
    fieldDescMap.put("PV1-8-14", "Referring Doctor - Assigning Facility");
    fieldDescMap.put("IN1-16-9-1", "Name Of Insured - Name Context - Identifier");
    fieldDescMap.put("PV1-39", "Servicing Facility");
    fieldDescMap.put("PV1-9-16-3", "Consulting Doctor - Name Context - Name of Coding System");
    fieldDescMap.put("PV1-8-17", "Referring Doctor - Name Validity Range");
    fieldDescMap.put("PD1-4-20", "Patient Primary Care Provider Name & ID No. - Expiration Date");
    fieldDescMap.put("PV1-9-16-2", "Consulting Doctor - Name Context - Text");
    fieldDescMap.put("PV1-8-16", "Referring Doctor - Name Context");
    fieldDescMap.put("PV1-9-16-5", "Consulting Doctor - Name Context - Alternate Text");
    fieldDescMap.put("PV1-8-19", "Referring Doctor - Effective Date");
    fieldDescMap.put("PV1-9-16-4", "Consulting Doctor - Name Context - Alternate Identifier");
    fieldDescMap.put("PV1-8-18", "Referring Doctor - Name Assembly Order");
    fieldDescMap.put("PV1-35", "Delete Account Date");
    fieldDescMap.put("PV1-36", "Discharge Disposition");
    fieldDescMap.put("PD1-4-23",
        "Patient Primary Care Provider Name & ID No. - Assigning Agency or Department");
    fieldDescMap.put("PV1-37", "Discharged to Location");
    fieldDescMap
        .put("PD1-4-22", "Patient Primary Care Provider Name & ID No. - Assigning Jurisdiction");
    fieldDescMap.put("PV1-38", "Diet Type");
    fieldDescMap
        .put("PD1-4-21", "Patient Primary Care Provider Name & ID No. - Professional Suffix");
    fieldDescMap.put("PV1-31", "Bad Debt Agency Code");
    fieldDescMap.put("IN1-16-9-4", "Name Of Insured - Name Context - Alternate Identifier");
    fieldDescMap.put("PV1-32", "Bad Debt Transfer Amount");
    fieldDescMap.put("IN1-16-9-3", "Name Of Insured - Name Context - Name of Coding System");
    fieldDescMap.put("PV1-33", "Bad Debt Recovery Amount");
    fieldDescMap.put("PV1-8-11", "Referring Doctor - Identifier Check Digit");
    fieldDescMap
        .put("IN1-16-9-6", "Name Of Insured - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("PV1-34", "Delete Account Indicator");
    fieldDescMap.put("PV1-8-10", "Referring Doctor - Name Type Code");
    fieldDescMap.put("IN1-16-9-5", "Name Of Insured - Name Context - Alternate Text");
    fieldDescMap.put("PV1-41", "Account Status");
    fieldDescMap.put("PV1-40", "Bed Status");
    fieldDescMap.put("GT1-3-1-1", "Guarantor Name - Family Name - Surname");
    fieldDescMap.put("GT1-3-1-2", "Guarantor Name - Family Name - Own Surname Prefix");
    fieldDescMap.put("GT1-3-1-5", "Guarantor Name - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("GT1-3-1-3", "Guarantor Name - Family Name - Own Surname");
    fieldDescMap
        .put("GT1-3-1-4", "Guarantor Name - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("TQ2-5-1", "Related Placer Group Number - Entity Identifier");
    fieldDescMap.put("TQ2-5-3", "Related Placer Group Number - Universal ID");
    fieldDescMap.put("TQ2-5-2", "Related Placer Group Number - Namespace ID");
    fieldDescMap.put("TQ2-5-4", "Related Placer Group Number - Universal ID Type");
    fieldDescMap.put("IN3-16-9", "Certification Contact Phone Number - Any Text");
    fieldDescMap.put("PV1-48", "Total Adjustments");
    fieldDescMap.put("PV1-49", "Total Payments");
    fieldDescMap.put("PV1-46", "Current Patient Balance");
    fieldDescMap.put("PV1-47", "Total Charges");
    fieldDescMap.put("PV1-44", "Admit Date/Time");
    fieldDescMap.put("PV1-45", "Discharge Date/Time");
    fieldDescMap.put("PV1-42", "Pending Location");
    fieldDescMap.put("PV1-43", "Prior Temporary Location");
    fieldDescMap.put("RXR-3-3", "Administration Device - Name of Coding System");
    fieldDescMap.put("PV1-52", "Other Healthcare Provider");
    fieldDescMap.put("PID-26-1", "Citizenship - Identifier");
    fieldDescMap.put("RXR-3-4", "Administration Device - Alternate Identifier");
    fieldDescMap.put("PV1-51", "Visit Indicator");
    fieldDescMap.put("PID-26-2", "Citizenship - Text");
    fieldDescMap.put("RXR-3-5", "Administration Device - Alternate Text");
    fieldDescMap.put("PV1-50", "Alternate Visit ID");
    fieldDescMap.put("RXR-3-6", "Administration Device - Name of Alternate Coding System");
    fieldDescMap.put("PID-26-5", "Citizenship - Alternate Text");
    fieldDescMap.put("PID-26-6", "Citizenship - Name of Alternate Coding System");
    fieldDescMap.put("PID-26-3", "Citizenship - Name of Coding System");
    fieldDescMap.put("PID-26-4", "Citizenship - Alternate Identifier");
    fieldDescMap.put("IN3-16-5", "Certification Contact Phone Number - Country Code");
    fieldDescMap.put("IN3-16-6", "Certification Contact Phone Number - Area/City Code");
    fieldDescMap.put("IN3-16-7", "Certification Contact Phone Number - Local Number");
    fieldDescMap.put("IN3-16-8", "Certification Contact Phone Number - Extension");
    fieldDescMap.put("IN3-16-1", "Certification Contact Phone Number - Telephone Number");
    fieldDescMap.put("IN3-16-2", "Certification Contact Phone Number - Telecommunication Use Code");
    fieldDescMap.put("RXR-3-1", "Administration Device - Identifier");
    fieldDescMap
        .put("IN3-16-3", "Certification Contact Phone Number - Telecommunication Equipment Type");
    fieldDescMap.put("RXR-3-2", "Administration Device - Text");
    fieldDescMap.put("IN3-16-4", "Certification Contact Phone Number - Email Address");
    fieldDescMap.put("OBX-19", "Date/Time of the Analysis");
    fieldDescMap
        .put("PV1-9-22-7", "Consulting Doctor - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("PV1-9-22-8",
        "Consulting Doctor - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("PV1-9-22-9", "Consulting Doctor - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("IN1-4-8-1", "Insurance Company Name - Assigning Facility - Namespace ID");
    fieldDescMap.put("IN1-4-8-2", "Insurance Company Name - Assigning Facility - Universal ID");
    fieldDescMap
        .put("IN1-4-8-3", "Insurance Company Name - Assigning Facility - Universal ID Type");
    fieldDescMap.put("OBX-10", "Nature of Abnormal Test");
    fieldDescMap.put("OBX-12", "Effective Date of Reference Range Values");
    fieldDescMap.put("PD1-10-9-8",
        "Duplicate Patient - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("OBX-11", "Observation Result Status");
    fieldDescMap.put("PD1-10-9-9", "Duplicate Patient - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("OBX-14", "Date/Time of the Observation");
    fieldDescMap.put("PD1-10-9-6",
        "Duplicate Patient - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("OBX-13", "User Defined Access Checks");
    fieldDescMap
        .put("PD1-10-9-7", "Duplicate Patient - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("OBX-16", "Responsible Observer");
    fieldDescMap
        .put("PD1-10-9-4", "Duplicate Patient - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("OBX-15", "Producer's Reference");
    fieldDescMap.put("PD1-10-9-5", "Duplicate Patient - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("OBX-18", "Equipment Instance Identifier");
    fieldDescMap.put("PD1-10-9-2", "Duplicate Patient - Assigning Jurisdiction - Text");
    fieldDescMap.put("OBX-17", "Observation Method");
    fieldDescMap
        .put("PD1-10-9-3", "Duplicate Patient - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap
        .put("PV1-9-2-4", "Consulting Doctor - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("PV1-9-2-3", "Consulting Doctor - Family Name - Own Surname");
    fieldDescMap.put("PV1-9-2-2", "Consulting Doctor - Family Name - Own Surname Prefix");
    fieldDescMap.put("PV1-9-2-1", "Consulting Doctor - Family Name - Surname");
    fieldDescMap.put("GT1-17-13-1", "Guarantor Employer Address - Effective Date - Time");
    fieldDescMap
        .put("GT1-17-13-2", "Guarantor Employer Address - Effective Date - Degree of Precision");
    fieldDescMap.put("PV1-9-2-5", "Consulting Doctor - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("GT1-3-9-3", "Guarantor Name - Name Context - Name of Coding System");
    fieldDescMap.put("GT1-3-9-4", "Guarantor Name - Name Context - Alternate Identifier");
    fieldDescMap.put("GT1-3-9-5", "Guarantor Name - Name Context - Alternate Text");
    fieldDescMap
        .put("GT1-3-9-6", "Guarantor Name - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("OBX-21", "Reserved for harmonization with V2.6");
    fieldDescMap.put("OBX-20", "Reserved for harmonization with V2.6");
    fieldDescMap.put("GT1-3-9-1", "Guarantor Name - Name Context - Identifier");
    fieldDescMap.put("GT1-3-9-2", "Guarantor Name - Name Context - Text");
    fieldDescMap.put("OBX-25", "Performing Organization Medical Director");
    fieldDescMap.put("PV1-9-22-2", "Consulting Doctor - Assigning Jurisdiction - Text");
    fieldDescMap.put("OBX-24", "Performing Organization Address");
    fieldDescMap.put("PV1-9-22-1", "Consulting Doctor - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("OBX-23", "Performing Organization Name");
    fieldDescMap.put("OBX-22", "Reserved for harmonization with V2.6");
    fieldDescMap.put("PV1-9-22-6",
        "Consulting Doctor - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("PV1-9-22-5", "Consulting Doctor - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("PV1-9-16-1", "Consulting Doctor - Name Context - Identifier");
    fieldDescMap
        .put("PV1-9-22-4", "Consulting Doctor - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap
        .put("PV1-9-22-3", "Consulting Doctor - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap
        .put("IN1-30-16-6", "Verification By - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("GT1-17-1-1",
        "Guarantor Employer Address - Street Address - Street or Mailing Address");
    fieldDescMap.put("IN1-30-16-5", "Verification By - Name Context - Alternate Text");
    fieldDescMap.put("IN1-30-16-2", "Verification By - Name Context - Text");
    fieldDescMap.put("IN1-30-16-1", "Verification By - Name Context - Identifier");
    fieldDescMap.put("IN1-30-16-4", "Verification By - Name Context - Alternate Identifier");
    fieldDescMap.put("IN1-30-16-3", "Verification By - Name Context - Name of Coding System");
    fieldDescMap.put("GT1-17-1-2", "Guarantor Employer Address - Street Address - Street Name");
    fieldDescMap.put("GT1-17-1-3", "Guarantor Employer Address - Street Address - Dwelling Number");
    fieldDescMap.put("GT1-2-6-3", "Guarantor Number - Assigning Facility - Universal ID Type");
    fieldDescMap.put("GT1-2-6-1", "Guarantor Number - Assigning Facility - Namespace ID");
    fieldDescMap.put("GT1-2-6-2", "Guarantor Number - Assigning Facility - Universal ID");
    fieldDescMap.put("PID-11-13-2", "Patient Address - Effective Date - Degree of Precision");
    fieldDescMap.put("IN1-6-1-3", "Insurance Co Contact Person - Family Name - Own Surname");
    fieldDescMap.put("IN1-6-1-2", "Insurance Co Contact Person - Family Name - Own Surname Prefix");
    fieldDescMap.put("IN1-6-1-1", "Insurance Co Contact Person - Family Name - Surname");
    fieldDescMap.put("PID-11-13-1", "Patient Address - Effective Date - Time");
    fieldDescMap.put("IN3-2-4-1", "Certification Number - Assigning Authority - Namespace ID");
    fieldDescMap.put("IN3-2-4-2", "Certification Number - Assigning Authority - Universal ID");
    fieldDescMap.put("PV1-50-9-6",
        "Alternate Visit ID - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("PV1-50-9-7",
        "Alternate Visit ID - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap
        .put("PV1-50-9-4", "Alternate Visit ID - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("PV1-50-9-5", "Alternate Visit ID - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("PV1-50-9-8",
        "Alternate Visit ID - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("PV1-50-9-9", "Alternate Visit ID - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("IN3-2-4-3", "Certification Number - Assigning Authority - Universal ID Type");
    fieldDescMap
        .put("PV1-50-9-3", "Alternate Visit ID - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("IN1-6-1-4",
        "Insurance Co Contact Person - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("PV1-50-9-2", "Alternate Visit ID - Assigning Jurisdiction - Text");
    fieldDescMap.put("IN1-6-1-5",
        "Insurance Co Contact Person - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("PV1-50-9-1", "Alternate Visit ID - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("IN1-11-6-1", "Insured's Group Emp Name - Assigning Authority - Namespace ID");
    fieldDescMap.put("IN1-11-6-2", "Insured's Group Emp Name - Assigning Authority - Universal ID");
    fieldDescMap
        .put("IN1-11-6-3", "Insured's Group Emp Name - Assigning Authority - Universal ID Type");
    fieldDescMap.put("PV1-17-23", "Admitting Doctor - Assigning Agency or Department");
    fieldDescMap.put("PV1-17-22", "Admitting Doctor - Assigning Jurisdiction");
    fieldDescMap.put("PV1-17-21", "Admitting Doctor - Professional Suffix");
    fieldDescMap.put("PV1-17-20", "Admitting Doctor - Expiration Date");
    fieldDescMap.put("RXA-10-22", "Administering Provider - Assigning Jurisdiction");
    fieldDescMap.put("RXA-10-23", "Administering Provider - Assigning Agency or Department");
    fieldDescMap.put("IN1-16-13-2", "Name Of Insured - Expiration Date - Degree of Precision");
    fieldDescMap.put("RXA-10-20", "Administering Provider - Expiration Date");
    fieldDescMap.put("IN1-16-13-1", "Name Of Insured - Expiration Date - Time");
    fieldDescMap.put("RXA-10-21", "Administering Provider - Professional Suffix");
    fieldDescMap.put("IN3-14-19", "Physician Reviewer - Effective Date");
    fieldDescMap.put("IN3-14-18", "Physician Reviewer - Name Assembly Order");
    fieldDescMap.put("IN3-14-17", "Physician Reviewer - Name Validity Range");
    fieldDescMap.put("IN3-14-16", "Physician Reviewer - Name Context");
    fieldDescMap.put("IN3-14-10", "Physician Reviewer - Name Type Code");
    fieldDescMap.put("PV1-17-19", "Admitting Doctor - Effective Date");
    fieldDescMap.put("IN3-14-11", "Physician Reviewer - Identifier Check Digit");
    fieldDescMap.put("PV1-17-18", "Admitting Doctor - Name Assembly Order");
    fieldDescMap.put("IN3-14-14", "Physician Reviewer - Assigning Facility");
    fieldDescMap.put("PV1-17-15", "Admitting Doctor - Name Representation Code");
    fieldDescMap.put("IN3-14-15", "Physician Reviewer - Name Representation Code");
    fieldDescMap.put("PV1-17-14", "Admitting Doctor - Assigning Facility");
    fieldDescMap.put("IN3-14-12", "Physician Reviewer - Check Digit Scheme");
    fieldDescMap.put("PV1-17-17", "Admitting Doctor - Name Validity Range");
    fieldDescMap.put("IN3-14-13", "Physician Reviewer - Identifier Type Code");
    fieldDescMap.put("PV1-17-16", "Admitting Doctor - Name Context");
    fieldDescMap.put("PV1-17-11", "Admitting Doctor - Identifier Check Digit");
    fieldDescMap.put("RXA-10-19", "Administering Provider - Effective Date");
    fieldDescMap.put("PV1-17-10", "Admitting Doctor - Name Type Code");
    fieldDescMap.put("PV1-17-13", "Admitting Doctor - Identifier Type Code");
    fieldDescMap.put("IN1-29-1", "Verification Date/Time - Time");
    fieldDescMap.put("PV1-17-12", "Admitting Doctor - Check Digit Scheme");
    fieldDescMap.put("IN1-29-2", "Verification Date/Time - Degree of Precision");
    fieldDescMap.put("RXA-10-16", "Administering Provider - Name Context");
    fieldDescMap.put("RXA-10-15", "Administering Provider - Name Representation Code");
    fieldDescMap.put("RXA-10-18", "Administering Provider - Name Assembly Order");
    fieldDescMap.put("RXA-10-17", "Administering Provider - Name Validity Range");
    fieldDescMap.put("IN3-14-23", "Physician Reviewer - Assigning Agency or Department");
    fieldDescMap.put("IN2-49-14", "Employer Contact Person Name - Professional Suffix");
    fieldDescMap.put("IN3-14-20", "Physician Reviewer - Expiration Date");
    fieldDescMap.put("IN2-49-13", "Employer Contact Person Name - Expiration Date");
    fieldDescMap.put("IN3-14-21", "Physician Reviewer - Professional Suffix");
    fieldDescMap.put("IN2-49-12", "Employer Contact Person Name - Effective Date");
    fieldDescMap.put("IN3-14-22", "Physician Reviewer - Assigning Jurisdiction");
    fieldDescMap.put("IN2-49-11", "Employer Contact Person Name - Name Assembly Order");
    fieldDescMap.put("IN2-49-10", "Employer Contact Person Name - Name Validity Range");
    fieldDescMap.put("IN2-3-16-1", "Insured's Employer's Name and ID - Name Context - Identifier");
    fieldDescMap.put("IN2-3-16-4",
        "Insured's Employer's Name and ID - Name Context - Alternate Identifier");
    fieldDescMap
        .put("IN2-3-16-5", "Insured's Employer's Name and ID - Name Context - Alternate Text");
    fieldDescMap.put("IN2-3-16-2", "Insured's Employer's Name and ID - Name Context - Text");
    fieldDescMap.put("IN2-3-16-3",
        "Insured's Employer's Name and ID - Name Context - Name of Coding System");
    fieldDescMap.put("IN2-3-16-6",
        "Insured's Employer's Name and ID - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("IN1-10-9", "Insured's Group Emp ID - Assigning Jurisdiction");
    fieldDescMap.put("IN1-10-7", "Insured's Group Emp ID - Effective Date");
    fieldDescMap.put("IN1-10-8", "Insured's Group Emp ID - Expiration Date");
    fieldDescMap.put("IN1-10-5", "Insured's Group Emp ID - Identifier Type Code");
    fieldDescMap.put("IN1-10-6", "Insured's Group Emp ID - Assigning Facility");
    fieldDescMap.put("IN1-10-3", "Insured's Group Emp ID - Check Digit Scheme");
    fieldDescMap.put("IN1-10-4", "Insured's Group Emp ID - Assigning Authority");
    fieldDescMap.put("IN1-10-1", "Insured's Group Emp ID - ID Number");
    fieldDescMap.put("IN1-10-2", "Insured's Group Emp ID - Check Digit");
    fieldDescMap.put("IN1-3-6-1", "Insurance Company ID - Assigning Facility - Namespace ID");
    fieldDescMap.put("IN1-7-5", "Insurance Co Phone Number - Country Code");
    fieldDescMap.put("IN1-7-6", "Insurance Co Phone Number - Area/City Code");
    fieldDescMap.put("IN1-7-3", "Insurance Co Phone Number - Telecommunication Equipment Type");
    fieldDescMap.put("IN1-7-4", "Insurance Co Phone Number - Email Address");
    fieldDescMap.put("IN1-7-1", "Insurance Co Phone Number - Telephone Number");
    fieldDescMap.put("IN1-7-2", "Insurance Co Phone Number - Telecommunication Use Code");
    fieldDescMap.put("IN1-3-6-3", "Insurance Company ID - Assigning Facility - Universal ID Type");
    fieldDescMap.put("IN1-3-6-2", "Insurance Company ID - Assigning Facility - Universal ID");
    fieldDescMap
        .put("PID-5-1-4", "Patient Name - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("PID-5-1-5", "Patient Name - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("PID-5-1-2", "Patient Name - Family Name - Own Surname Prefix");
    fieldDescMap.put("PID-5-1-3", "Patient Name - Family Name - Own Surname");
    fieldDescMap.put("PID-5-1-1", "Patient Name - Family Name - Surname");
    fieldDescMap.put("ORC-22-5", "Ordering Facility Address - Zip or Postal Code");
    fieldDescMap.put("ORC-22-4", "Ordering Facility Address - State or Province");
    fieldDescMap.put("GT1-2-10", "Guarantor Number - Assigning Agency or Department");
    fieldDescMap.put("ORC-22-7", "Ordering Facility Address - Address Type");
    fieldDescMap.put("ORC-22-6", "Ordering Facility Address - Country");
    fieldDescMap.put("ORC-22-1", "Ordering Facility Address - Street Address");
    fieldDescMap.put("ORC-22-3", "Ordering Facility Address - City");
    fieldDescMap.put("ORC-22-2", "Ordering Facility Address - Other Designation");
    fieldDescMap.put("ORC-22-9", "Ordering Facility Address - County/Parish Code");
    fieldDescMap.put("ORC-22-8", "Ordering Facility Address - Other Geographic Designation");
    fieldDescMap.put("OBX-3", "Observation Identifier");
    fieldDescMap.put("TQ1-3-7", "Repeat Pattern - Institution Specified Time");
    fieldDescMap.put("OBX-2", "Value Type");
    fieldDescMap.put("TQ1-3-8", "Repeat Pattern - Event");
    fieldDescMap.put("OBX-1", "Set ID - OBX");
    fieldDescMap.put("TQ1-3-9", "Repeat Pattern - Event Offset Quantity");
    fieldDescMap.put("OBX-0", "Observation/Result");
    fieldDescMap.put("OBX-7", "References Range");
    fieldDescMap.put("TQ1-3-3", "Repeat Pattern - Phase Range Begin Value");
    fieldDescMap.put("OBX-6", "Units");
    fieldDescMap.put("TQ1-3-4", "Repeat Pattern - Phase Range End Value");
    fieldDescMap.put("OBX-5", "Observation Value");
    fieldDescMap.put("TQ1-3-5", "Repeat Pattern - Period Quantity");
    fieldDescMap.put("OBX-4", "Observation Sub-ID");
    fieldDescMap.put("TQ1-3-6", "Repeat Pattern - Period Units");
    fieldDescMap.put("OBX-25-16-3",
        "Performing Organization Medical Director - Name Context - Name of Coding System");
    fieldDescMap.put("ORC-19-23-1", "Action By - Assigning Agency or Department - Identifier");
    fieldDescMap
        .put("OBX-25-16-2", "Performing Organization Medical Director - Name Context - Text");
    fieldDescMap.put("OBX-25-16-5",
        "Performing Organization Medical Director - Name Context - Alternate Text");
    fieldDescMap
        .put("ORC-19-23-3", "Action By - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("OBX-25-16-4",
        "Performing Organization Medical Director - Name Context - Alternate Identifier");
    fieldDescMap.put("ORC-19-23-2", "Action By - Assigning Agency or Department - Text");
    fieldDescMap
        .put("PV1-52-14-1", "Other Healthcare Provider - Assigning Facility - Namespace ID");
    fieldDescMap
        .put("OBX-25-16-1", "Performing Organization Medical Director - Name Context - Identifier");
    fieldDescMap
        .put("PV1-52-14-3", "Other Healthcare Provider - Assigning Facility - Universal ID Type");
    fieldDescMap
        .put("PV1-52-14-2", "Other Healthcare Provider - Assigning Facility - Universal ID");
    fieldDescMap.put("OBX-25-16-6",
        "Performing Organization Medical Director - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("PID-33-1", "Last Update Date/Time - Time");
    fieldDescMap.put("PID-33-2", "Last Update Date/Time - Degree of Precision");
    fieldDescMap
        .put("IN1-5-13-2", "Insurance Company Address - Effective Date - Degree of Precision");
    fieldDescMap.put("OBX-8", "Abnormal Flags");
    fieldDescMap.put("OBX-9", "Probability");
    fieldDescMap.put("ORC-22-10", "Ordering Facility Address - Census Tract");
    fieldDescMap.put("NK1-2-1-2", "Name - Family Name - Own Surname Prefix");
    fieldDescMap.put("NK1-2-1-3", "Name - Family Name - Own Surname");
    fieldDescMap.put("NK1-2-1-1", "Name - Family Name - Surname");
    fieldDescMap.put("IN1-5-13-1", "Insurance Company Address - Effective Date - Time");
    fieldDescMap.put("NK1-2-1-4", "Name - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("NK1-2-1-5", "Name - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("IN2-40-9-2", "Mother's Maiden Name - Name Context - Text");
    fieldDescMap.put("IN2-40-9-1", "Mother's Maiden Name - Name Context - Identifier");
    fieldDescMap.put("IN2-40-9-4", "Mother's Maiden Name - Name Context - Alternate Identifier");
    fieldDescMap.put("IN2-40-9-3", "Mother's Maiden Name - Name Context - Name of Coding System");
    fieldDescMap
        .put("PV2-13-2-5", "Referral Source Code - Family Name - Surname From Partner/Spouse");
    fieldDescMap
        .put("OBX-24-1-3", "Performing Organization Address - Street Address - Dwelling Number");
    fieldDescMap.put("OBX-6-3", "Units - Name of Coding System");
    fieldDescMap.put("PV2-13-2-2", "Referral Source Code - Family Name - Own Surname Prefix");
    fieldDescMap.put("OBX-6-4", "Units - Alternate Identifier");
    fieldDescMap.put("ORC-12-19-1", "Ordering Provider - Effective Date - Time");
    fieldDescMap.put("PV2-13-2-1", "Referral Source Code - Family Name - Surname");
    fieldDescMap.put("OBX-6-5", "Units - Alternate Text");
    fieldDescMap.put("ORC-19-23-8",
        "Action By - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("PV2-13-2-4",
        "Referral Source Code - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("OBX-6-6", "Units - Name of Alternate Coding System");
    fieldDescMap.put("ORC-19-23-9", "Action By - Assigning Agency or Department - Original Text");
    fieldDescMap.put("PV2-13-2-3", "Referral Source Code - Family Name - Own Surname");
    fieldDescMap.put("ORC-19-23-6",
        "Action By - Assigning Agency or Department - Name of Alternate Coding System");
    populateFieldDescriptions2();
  }

  public void populateFieldDescriptions2() {
    fieldDescMap.put("IN2-40-9-5", "Mother's Maiden Name - Name Context - Alternate Text");
    fieldDescMap.put("ORC-19-23-7",
        "Action By - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap
        .put("IN2-40-9-6", "Mother's Maiden Name - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("OBX-24-1-1",
        "Performing Organization Address - Street Address - Street or Mailing Address");
    fieldDescMap.put("OBX-6-1", "Units - Identifier");
    fieldDescMap
        .put("ORC-19-23-4", "Action By - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("ORC-12-19-2", "Ordering Provider - Effective Date - Degree of Precision");
    fieldDescMap
        .put("OBX-24-1-2", "Performing Organization Address - Street Address - Street Name");
    fieldDescMap.put("OBX-6-2", "Units - Text");
    fieldDescMap.put("ORC-19-23-5", "Action By - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("TQ1-3-2", "Repeat Pattern - Calendar Alignment");
    fieldDescMap.put("TQ1-3-1", "Repeat Pattern - Repeat Pattern Code");
    fieldDescMap.put("IN2-7-12-1", "Medicaid Case Name - Effective Date - Time");
    fieldDescMap.put("IN2-7-12-2", "Medicaid Case Name - Effective Date - Degree of Precision");
    fieldDescMap.put("IN1-43", "Insured's Administrative Sex");
    fieldDescMap.put("IN1-44", "Insured's Employer's Address");
    fieldDescMap.put("IN1-45", "Verification Status");
    fieldDescMap.put("IN1-46", "Prior Insurance Plan ID");
    fieldDescMap.put("IN1-47", "Coverage Type");
    fieldDescMap
        .put("OBX-23-8-3", "Performing Organization Name - Assigning Facility - Universal ID Type");
    fieldDescMap.put("IN1-48", "Handicap");
    fieldDescMap
        .put("OBX-23-8-2", "Performing Organization Name - Assigning Facility - Universal ID");
    fieldDescMap.put("IN1-49", "Insured's ID Number");
    fieldDescMap
        .put("OBX-23-8-1", "Performing Organization Name - Assigning Facility - Namespace ID");
    fieldDescMap.put("IN2-50-8", "Employer Contact Person Phone Number - Extension");
    fieldDescMap.put("IN2-50-9", "Employer Contact Person Phone Number - Any Text");
    fieldDescMap.put("IN2-50-6", "Employer Contact Person Phone Number - Area/City Code");
    fieldDescMap.put("IN2-50-7", "Employer Contact Person Phone Number - Local Number");
    fieldDescMap.put("IN2-50-4", "Employer Contact Person Phone Number - Email Address");
    fieldDescMap.put("IN2-50-5", "Employer Contact Person Phone Number - Country Code");
    fieldDescMap
        .put("IN2-50-2", "Employer Contact Person Phone Number - Telecommunication Use Code");
    fieldDescMap
        .put("IN2-50-3", "Employer Contact Person Phone Number - Telecommunication Equipment Type");
    fieldDescMap.put("PV2-8-1", "Expected Admit Date/Time - Time");
    fieldDescMap.put("NK1-30-9", "Contact Person's Name - Name Context");
    fieldDescMap.put("IN1-51", "Signature Code Date");
    fieldDescMap.put("PV2-8-2", "Expected Admit Date/Time - Degree of Precision");
    fieldDescMap.put("IN1-50", "Signature Code");
    fieldDescMap.put("NK1-30-7", "Contact Person's Name - Name Type Code");
    fieldDescMap.put("IN1-53", "VIP Indicator");
    fieldDescMap.put("NK1-30-8", "Contact Person's Name - Name Representation Code");
    fieldDescMap.put("IN1-52", "Insured's Birth Place");
    fieldDescMap.put("NK1-30-4", "Contact Person's Name - Suffix (e.g., JR or III)");
    fieldDescMap.put("GT1-36-4", "Primary Language - Alternate Identifier");
    fieldDescMap.put("NK1-30-3",
        "Contact Person's Name - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("GT1-36-3", "Primary Language - Name of Coding System");
    fieldDescMap.put("NK1-30-6", "Contact Person's Name - Degree (e.g., MD)");
    fieldDescMap.put("GT1-36-2", "Primary Language - Text");
    fieldDescMap.put("NK1-30-5", "Contact Person's Name - Prefix (e.g., DR)");
    fieldDescMap.put("GT1-36-1", "Primary Language - Identifier");
    fieldDescMap.put("PD1-19", "Military Branch");
    fieldDescMap.put("NK1-30-2", "Contact Person's Name - Given Name");
    fieldDescMap.put("GT1-36-6", "Primary Language - Name of Alternate Coding System");
    fieldDescMap.put("NK1-30-1", "Contact Person's Name - Family Name");
    fieldDescMap.put("GT1-36-5", "Primary Language - Alternate Text");
    fieldDescMap.put("ORC-22-13", "Ordering Facility Address - Effective Date");
    fieldDescMap.put("PD1-15", "Advance Directive Code");
    fieldDescMap.put("ORC-22-14", "Ordering Facility Address - Expiration Date");
    fieldDescMap.put("PD1-16", "Immunization Registry Status");
    fieldDescMap.put("ORC-22-11", "Ordering Facility Address - Address Representation Code");
    fieldDescMap.put("IN2-50-1", "Employer Contact Person Phone Number - Telephone Number");
    fieldDescMap.put("PD1-17", "Immunization Registry Status Effective Date");
    fieldDescMap.put("ORC-22-12", "Ordering Facility Address - Address Validity Range");
    fieldDescMap.put("PD1-18", "Publicity Code Effective Date");
    fieldDescMap.put("PD1-11", "Publicity Code");
    fieldDescMap.put("PD1-12", "Protection Indicator");
    fieldDescMap.put("PD1-13", "Protection Indicator Effective Date");
    fieldDescMap.put("PD1-14", "Place of Worship");
    fieldDescMap.put("PV2-42-4", "Patient Condition Code - Alternate Identifier");
    fieldDescMap.put("PV2-42-5", "Patient Condition Code - Alternate Text");
    fieldDescMap.put("PD1-10", "Duplicate Patient");
    fieldDescMap.put("PV2-42-2", "Patient Condition Code - Text");
    fieldDescMap.put("PV2-42-3", "Patient Condition Code - Name of Coding System");
    fieldDescMap.put("PV2-42-1", "Patient Condition Code - Identifier");
    fieldDescMap.put("ORC-19-16-1", "Action By - Name Context - Identifier");
    fieldDescMap.put("ORC-19-16-2", "Action By - Name Context - Text");
    fieldDescMap.put("ORC-19-16-3", "Action By - Name Context - Name of Coding System");
    fieldDescMap.put("ORC-19-16-4", "Action By - Name Context - Alternate Identifier");
    fieldDescMap.put("ORC-19-16-5", "Action By - Name Context - Alternate Text");
    fieldDescMap.put("ORC-19-16-6", "Action By - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("PV2-42-6", "Patient Condition Code - Name of Alternate Coding System");
    fieldDescMap.put("RXA-25-3", "Administered Barcode Identifier - Name of Coding System");
    fieldDescMap.put("GT1-19-9-4",
        "Guarantor Employee ID Number - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("IN1-25", "Report Of Eligibility Flag");
    fieldDescMap.put("RXA-25-2", "Administered Barcode Identifier - Text");
    fieldDescMap.put("NK1-2-9-1", "Name - Name Context - Identifier");
    fieldDescMap.put("GT1-19-9-5",
        "Guarantor Employee ID Number - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("IN1-26", "Report Of Eligibility Date");
    fieldDescMap.put("RXA-25-1", "Administered Barcode Identifier - Identifier");
    fieldDescMap.put("NK1-2-9-2", "Name - Name Context - Text");
    fieldDescMap.put("GT1-19-9-6",
        "Guarantor Employee ID Number - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("IN1-27", "Release Information Code");
    fieldDescMap.put("NK1-2-9-3", "Name - Name Context - Name of Coding System");
    fieldDescMap.put("GT1-19-9-7",
        "Guarantor Employee ID Number - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("IN1-28", "Pre-Admit Cert (PAC)");
    fieldDescMap.put("RXA-25-7", "Administered Barcode Identifier - Coding System Version ID");
    fieldDescMap.put("NK1-2-9-4", "Name - Name Context - Alternate Identifier");
    fieldDescMap.put("IN1-21", "Coordination Of Benefits");
    fieldDescMap
        .put("RXA-25-6", "Administered Barcode Identifier - Name of Alternate Coding System");
    fieldDescMap.put("NK1-2-9-5", "Name - Name Context - Alternate Text");
    fieldDescMap
        .put("GT1-19-9-1", "Guarantor Employee ID Number - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("IN1-22", "Coord Of Ben. Priority");
    fieldDescMap.put("RXA-25-5", "Administered Barcode Identifier - Alternate Text");
    fieldDescMap.put("NK1-2-9-6", "Name - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("GT1-19-9-2", "Guarantor Employee ID Number - Assigning Jurisdiction - Text");
    fieldDescMap.put("IN1-23", "Notice Of Admission Flag");
    fieldDescMap.put("RXA-25-4", "Administered Barcode Identifier - Alternate Identifier");
    fieldDescMap.put("GT1-19-9-3",
        "Guarantor Employee ID Number - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("IN1-24", "Notice Of Admission Date");
    fieldDescMap.put("GT1-19-9-8",
        "Guarantor Employee ID Number - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("IN1-29", "Verification Date/Time");
    fieldDescMap
        .put("GT1-19-9-9", "Guarantor Employee ID Number - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("IN1-7-7", "Insurance Co Phone Number - Local Number");
    fieldDescMap.put("IN1-7-8", "Insurance Co Phone Number - Extension");
    fieldDescMap.put("IN1-7-9", "Insurance Co Phone Number - Any Text");
    fieldDescMap.put("PD1-21", "Military Status");
    fieldDescMap.put("PD1-20", "Military Rank/Grade");
    fieldDescMap.put("PV1-50-8", "Alternate Visit ID - Expiration Date");
    fieldDescMap.put("PV1-50-9", "Alternate Visit ID - Assigning Jurisdiction");
    fieldDescMap.put("PV1-50-6", "Alternate Visit ID - Assigning Facility");
    fieldDescMap.put("PV1-50-7", "Alternate Visit ID - Effective Date");
    fieldDescMap.put("PV1-50-4", "Alternate Visit ID - Assigning Authority");
    fieldDescMap.put("IN1-31", "Type Of Agreement Code");
    fieldDescMap.put("PV1-50-5", "Alternate Visit ID - Identifier Type Code");
    fieldDescMap.put("IN1-30", "Verification By");
    fieldDescMap.put("PV1-50-2", "Alternate Visit ID - Check Digit");
    fieldDescMap.put("PV1-50-3", "Alternate Visit ID - Check Digit Scheme");
    fieldDescMap.put("PV1-50-1", "Alternate Visit ID - ID Number");
    fieldDescMap.put("IN1-38", "Policy Limit - Amount");
    fieldDescMap.put("IN1-39", "Policy Limit - Days");
    fieldDescMap.put("IN1-36", "Policy Number");
    fieldDescMap.put("IN1-37", "Policy Deductible");
    fieldDescMap.put("IN1-34", "Delay Before L.R. Day");
    fieldDescMap.put("IN1-35", "Company Plan Code");
    fieldDescMap.put("IN1-32", "Billing Status");
    fieldDescMap.put("IN1-33", "Lifetime Reserve Days");
    fieldDescMap.put("RXA-10-9-2", "Administering Provider - Assigning Authority - Universal ID");
    fieldDescMap
        .put("RXA-10-9-3", "Administering Provider - Assigning Authority - Universal ID Type");
    fieldDescMap.put("RXA-10-9-1", "Administering Provider - Assigning Authority - Namespace ID");
    fieldDescMap.put("IN2-58-1", "Insurance Co Contact Phone Number - Telephone Number");
    fieldDescMap.put("IN2-58-2", "Insurance Co Contact Phone Number - Telecommunication Use Code");
    fieldDescMap.put("IN1-42", "Insured's Employment Status");
    fieldDescMap
        .put("IN2-58-3", "Insurance Co Contact Phone Number - Telecommunication Equipment Type");
    fieldDescMap.put("IN1-41", "Room Rate - Private");
    fieldDescMap.put("IN3-25-14-2", "Second Opinion Physician - Assigning Facility - Universal ID");
    fieldDescMap.put("IN2-58-4", "Insurance Co Contact Phone Number - Email Address");
    fieldDescMap.put("IN1-40", "Room Rate - Semi-Private");
    fieldDescMap.put("IN3-25-14-1", "Second Opinion Physician - Assigning Facility - Namespace ID");
    fieldDescMap.put("IN2-58-5", "Insurance Co Contact Phone Number - Country Code");
    fieldDescMap.put("IN2-58-6", "Insurance Co Contact Phone Number - Area/City Code");
    fieldDescMap
        .put("IN3-25-14-3", "Second Opinion Physician - Assigning Facility - Universal ID Type");
    fieldDescMap.put("IN2-58-7", "Insurance Co Contact Phone Number - Local Number");
    fieldDescMap.put("IN2-58-8", "Insurance Co Contact Phone Number - Extension");
    fieldDescMap.put("IN2-58-9", "Insurance Co Contact Phone Number - Any Text");
    fieldDescMap.put("IN2-69-8", "Insured Organization Name and ID - Assigning Facility");
    fieldDescMap.put("IN2-69-9", "Insured Organization Name and ID - Name Representation Code");
    fieldDescMap.put("IN2-69-6", "Insured Organization Name and ID - Assigning Authority");
    fieldDescMap.put("IN2-69-7", "Insured Organization Name and ID - Identifier Type Code");
    fieldDescMap.put("IN2-69-4", "Insured Organization Name and ID - Check Digit");
    fieldDescMap.put("IN2-69-5", "Insured Organization Name and ID - Check Digit Scheme");
    fieldDescMap.put("IN2-69-2", "Insured Organization Name and ID - Organization Name Type Code");
    fieldDescMap.put("IN2-69-3", "Insured Organization Name and ID - ID Number");
    fieldDescMap.put("GT1-3-11", "Guarantor Name - Name Assembly Order");
    fieldDescMap.put("IN2-69-1", "Insured Organization Name and ID - Organization Name");
    fieldDescMap.put("GT1-3-10", "Guarantor Name - Name Validity Range");
    fieldDescMap.put("GT1-3-14", "Guarantor Name - Professional Suffix");
    fieldDescMap.put("GT1-3-13", "Guarantor Name - Expiration Date");
    fieldDescMap.put("GT1-3-12", "Guarantor Name - Effective Date");
    fieldDescMap.put("IN2-61-1", "Patient Member Number - ID Number");
    fieldDescMap.put("RXA-10-1", "Administering Provider - ID Number");
    fieldDescMap.put("NK1-2-1", "Name - Family Name");
    fieldDescMap.put("RXA-10-3", "Administering Provider - Given Name");
    fieldDescMap.put("NK1-2-2", "Name - Given Name");
    fieldDescMap.put("RXA-10-2", "Administering Provider - Family Name");
    fieldDescMap.put("NK1-2-3", "Name - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("RXA-10-5", "Administering Provider - Suffix (e.g., JR or III)");
    fieldDescMap.put("GT1-47-2", "Contact Reason - Text");
    fieldDescMap.put("RXA-10-4",
        "Administering Provider - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("PD1-10-9-1", "Duplicate Patient - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("GT1-47-1", "Contact Reason - Identifier");
    fieldDescMap.put("RXA-19-2", "Indication - Text");
    fieldDescMap.put("RXA-10-7", "Administering Provider - Degree (e.g., MD)");
    fieldDescMap.put("GT1-47-4", "Contact Reason - Alternate Identifier");
    fieldDescMap.put("RXA-19-1", "Indication - Identifier");
    fieldDescMap.put("RXA-10-6", "Administering Provider - Prefix (e.g., DR)");
    fieldDescMap.put("GT1-47-3", "Contact Reason - Name of Coding System");
    fieldDescMap.put("RXA-10-9", "Administering Provider - Assigning Authority");
    fieldDescMap.put("GT1-47-6", "Contact Reason - Name of Alternate Coding System");
    fieldDescMap.put("RXA-10-8", "Administering Provider - Source Table");
    fieldDescMap.put("GT1-47-5", "Contact Reason - Alternate Text");
    fieldDescMap.put("PV1-42-7", "Pending Location - Building");
    fieldDescMap.put("PV1-17-2", "Admitting Doctor - Family Name");
    fieldDescMap.put("PV1-42-8", "Pending Location - Floor");
    fieldDescMap.put("PV1-17-1", "Admitting Doctor - ID Number");
    fieldDescMap.put("PV1-42-5", "Pending Location - Location Status");
    fieldDescMap
        .put("PV1-17-4", "Admitting Doctor - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("IN2-26-4-1", "Payor Subscriber ID - Assigning Authority - Namespace ID");
    fieldDescMap.put("PV1-42-6", "Pending Location - Person Location Type");
    fieldDescMap.put("PV1-17-3", "Admitting Doctor - Given Name");
    fieldDescMap.put("RXA-19-5", "Indication - Alternate Text");
    fieldDescMap.put("RXA-19-6", "Indication - Name of Alternate Coding System");
    fieldDescMap.put("RXA-25-9", "Administered Barcode Identifier - Original Text");
    fieldDescMap.put("RXA-19-3", "Indication - Name of Coding System");
    fieldDescMap.put("PV1-42-9", "Pending Location - Location Description");
    fieldDescMap
        .put("RXA-25-8", "Administered Barcode Identifier - Alternate Coding System Version ID");
    fieldDescMap.put("RXA-19-4", "Indication - Alternate Identifier");
    fieldDescMap.put("NK1-2-7", "Name - Name Type Code");
    fieldDescMap.put("NK1-2-6", "Name - Degree (e.g., MD)");
    fieldDescMap.put("NK1-2-5", "Name - Prefix (e.g., DR)");
    fieldDescMap.put("NK1-2-4", "Name - Suffix (e.g., JR or III)");
    fieldDescMap.put("PV1-42-3", "Pending Location - Bed");
    fieldDescMap.put("PV1-42-4", "Pending Location - Facility");
    fieldDescMap.put("PV1-42-1", "Pending Location - Point of Care");
    fieldDescMap.put("NK1-2-9", "Name - Name Context");
    fieldDescMap.put("PV1-42-2", "Pending Location - Room");
    fieldDescMap.put("NK1-2-8", "Name - Name Representation Code");
    fieldDescMap.put("IN2-9-13", "Military Sponsor Name - Expiration Date");
    fieldDescMap.put("IN2-9-14", "Military Sponsor Name - Professional Suffix");
    fieldDescMap.put("IN2-9-11", "Military Sponsor Name - Name Assembly Order");
    fieldDescMap.put("IN2-9-12", "Military Sponsor Name - Effective Date");
    fieldDescMap.put("IN2-9-10", "Military Sponsor Name - Name Validity Range");
    fieldDescMap.put("PV1-17-9", "Admitting Doctor - Assigning Authority");
    fieldDescMap.put("PV1-5-10-2", "Preadmit Number - Assigning Agency or Department - Text");
    fieldDescMap.put("PV1-5-10-3",
        "Preadmit Number - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("PV1-5-10-1", "Preadmit Number - Assigning Agency or Department - Identifier");
    fieldDescMap.put("PV1-17-5", "Admitting Doctor - Suffix (e.g., JR or III)");
    fieldDescMap.put("IN2-26-4-2", "Payor Subscriber ID - Assigning Authority - Universal ID");
    fieldDescMap.put("PV1-17-6", "Admitting Doctor - Prefix (e.g., DR)");
    fieldDescMap.put("IN2-26-4-3", "Payor Subscriber ID - Assigning Authority - Universal ID Type");
    fieldDescMap.put("PV1-17-7", "Admitting Doctor - Degree (e.g., MD)");
    fieldDescMap.put("PV1-17-8", "Admitting Doctor - Source Table");
    fieldDescMap
        .put("PV1-5-10-5", "Preadmit Number - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("PID-3", "Patient Identifier List");
    fieldDescMap.put("PV1-5-10-4",
        "Preadmit Number - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("PID-2", "Patient ID");
    fieldDescMap.put("PV1-5-10-7",
        "Preadmit Number - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("PID-5", "Patient Name");
    fieldDescMap.put("PV1-5-10-6",
        "Preadmit Number - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("PID-4", "Alternate Patient ID - PID");
    fieldDescMap.put("RXA-18-4", "Substance/Treatment Refusal Reason - Alternate Identifier");
    fieldDescMap
        .put("PV1-5-10-9", "Preadmit Number - Assigning Agency or Department - Original Text");
    fieldDescMap.put("PID-7", "Date/Time of Birth");
    fieldDescMap.put("RXA-18-5", "Substance/Treatment Refusal Reason - Alternate Text");
    fieldDescMap.put("PV1-5-10-8",
        "Preadmit Number - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("PID-6", "Mother's Maiden Name");
    fieldDescMap
        .put("RXA-18-6", "Substance/Treatment Refusal Reason - Name of Alternate Coding System");
    fieldDescMap.put("PID-9", "Patient Alias");
    fieldDescMap.put("PID-8", "Administrative Sex");
    fieldDescMap.put("ORC-8-1", "Parent - Placer Assigned Identifier");
    fieldDescMap.put("MSH-7-2", "Date/Time Of Message - Degree of Precision");
    fieldDescMap.put("MSH-7-1", "Date/Time Of Message - Time");
    fieldDescMap.put("ORC-8-2", "Parent - Filler Assigned Identifier");
    fieldDescMap.put("ORC-14-12", "Call Back Phone Number - Unformatted Telephone number");
    fieldDescMap.put("ORC-14-10", "Call Back Phone Number - Extension Prefix");
    fieldDescMap.put("ORC-14-11", "Call Back Phone Number - Speed Dial Code");
    fieldDescMap.put("PID-0", "Patient Identification");
    fieldDescMap.put("PID-1", "Set ID - PID");
    fieldDescMap.put("ORC-16-5", "Order Control Code Reason - Alternate Text");
    fieldDescMap
        .put("PV1-50-10-1", "Alternate Visit ID - Assigning Agency or Department - Identifier");
    fieldDescMap.put("GT1-27-1-1", "Guarantor Household Annual Income - Price - Quantity");
    fieldDescMap.put("ORC-16-6", "Order Control Code Reason - Name of Alternate Coding System");
    fieldDescMap.put("PV2-39-1", "Recreational Drug Use Code - Identifier");
    fieldDescMap.put("GT1-27-1-2", "Guarantor Household Annual Income - Price - Denomination");
    fieldDescMap.put("ORC-16-3", "Order Control Code Reason - Name of Coding System");
    fieldDescMap.put("ORC-16-4", "Order Control Code Reason - Alternate Identifier");
    fieldDescMap
        .put("PV1-50-10-5", "Alternate Visit ID - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("PV2-39-4", "Recreational Drug Use Code - Alternate Identifier");
    fieldDescMap.put("PV1-50-10-4",
        "Alternate Visit ID - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("PV2-39-5", "Recreational Drug Use Code - Alternate Text");
    fieldDescMap.put("PV1-50-10-3",
        "Alternate Visit ID - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("PV2-39-2", "Recreational Drug Use Code - Text");
    fieldDescMap.put("PV1-50-10-2", "Alternate Visit ID - Assigning Agency or Department - Text");
    fieldDescMap.put("PV2-39-3", "Recreational Drug Use Code - Name of Coding System");
    fieldDescMap.put("IN2-61-2", "Patient Member Number - Check Digit");
    fieldDescMap
        .put("PV1-50-10-9", "Alternate Visit ID - Assigning Agency or Department - Original Text");
    fieldDescMap.put("IN2-61-3", "Patient Member Number - Check Digit Scheme");
    fieldDescMap.put("PV1-50-10-8",
        "Alternate Visit ID - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("IN2-61-4", "Patient Member Number - Assigning Authority");
    fieldDescMap.put("PV1-50-10-7",
        "Alternate Visit ID - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("IN2-61-5", "Patient Member Number - Identifier Type Code");
    fieldDescMap.put("PV1-50-10-6",
        "Alternate Visit ID - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("ORC-16-1", "Order Control Code Reason - Identifier");
    fieldDescMap.put("IN2-61-6", "Patient Member Number - Assigning Facility");
    fieldDescMap.put("ORC-16-2", "Order Control Code Reason - Text");
    fieldDescMap.put("IN2-61-7", "Patient Member Number - Effective Date");
    fieldDescMap.put("IN2-61-8", "Patient Member Number - Expiration Date");
    fieldDescMap.put("IN2-61-9", "Patient Member Number - Assigning Jurisdiction");
    fieldDescMap.put("PV1-3-11", "Assigned Patient Location - Assigning Authority for Location");
    fieldDescMap.put("RXA-19", "Indication");
    fieldDescMap.put("RXA-18", "Substance/Treatment Refusal Reason");
    fieldDescMap.put("RXA-17", "Substance Manufacturer Name");
    fieldDescMap.put("PV1-3-10", "Assigned Patient Location - Comprehensive Location Identifier");
    fieldDescMap.put("RXA-18-3", "Substance/Treatment Refusal Reason - Name of Coding System");
    fieldDescMap.put("RXA-12", "Administered Per (Time Unit)");
    fieldDescMap.put("RXA-18-2", "Substance/Treatment Refusal Reason - Text");
    fieldDescMap.put("RXA-11", "Administered-at Location");
    fieldDescMap.put("RXA-18-1", "Substance/Treatment Refusal Reason - Identifier");
    fieldDescMap.put("RXA-10", "Administering Provider");
    fieldDescMap.put("PV2-39-6", "Recreational Drug Use Code - Name of Alternate Coding System");
    fieldDescMap.put("RXA-16", "Substance Expiration Date");
    fieldDescMap.put("RXA-15", "Substance Lot Number");
    fieldDescMap.put("RXA-14", "Administered Strength Units");
    fieldDescMap.put("RXA-13", "Administered Strength");
    fieldDescMap.put("RXA-24", "Administered Drug Strength Volume Units");
    fieldDescMap.put("RXA-25", "Administered Barcode Identifier");
    fieldDescMap.put("RXA-26", "Pharmacy Order Type");
    fieldDescMap.put("RXA-20", "Completion Status");
    fieldDescMap.put("RXA-21", "Action Code - RXA");
    fieldDescMap.put("RXA-22", "System Entry Date/Time");
    fieldDescMap.put("RXA-23", "Administered Drug Strength Volume");
    fieldDescMap.put("GT1-7-9", "Guarantor Ph Num - Business - Any Text");
    fieldDescMap.put("GT1-7-8", "Guarantor Ph Num - Business - Extension");
    fieldDescMap.put("GT1-7-7", "Guarantor Ph Num - Business - Local Number");
    fieldDescMap.put("GT1-7-2", "Guarantor Ph Num - Business - Telecommunication Use Code");
    fieldDescMap.put("PV1-38-1", "Diet Type - Identifier");
    fieldDescMap.put("GT1-7-1", "Guarantor Ph Num - Business - Telephone Number");
    fieldDescMap.put("PV1-38-4", "Diet Type - Alternate Identifier");
    fieldDescMap.put("GT1-7-6", "Guarantor Ph Num - Business - Area/City Code");
    fieldDescMap.put("PV1-38-5", "Diet Type - Alternate Text");
    fieldDescMap.put("GT1-7-5", "Guarantor Ph Num - Business - Country Code");
    fieldDescMap.put("PV1-38-2", "Diet Type - Text");
    fieldDescMap.put("GT1-7-4", "Guarantor Ph Num - Business - Email Address");
    fieldDescMap.put("PV1-38-3", "Diet Type - Name of Coding System");
    fieldDescMap.put("GT1-7-3", "Guarantor Ph Num - Business - Telecommunication Equipment Type");
    fieldDescMap.put("PV1-38-6", "Diet Type - Name of Alternate Coding System");
    fieldDescMap.put("IN3-19-11", "Certification Agency Phone Number - Speed Dial Code");
    fieldDescMap.put("IN1-19-12", "Insured's Address - Address Validity Range");
    fieldDescMap
        .put("IN3-19-12", "Certification Agency Phone Number - Unformatted Telephone number");
    fieldDescMap.put("IN1-19-11", "Insured's Address - Address Representation Code");
    fieldDescMap.put("IN1-19-14", "Insured's Address - Expiration Date");
    fieldDescMap.put("IN3-19-10", "Certification Agency Phone Number - Extension Prefix");
    fieldDescMap.put("IN1-19-13", "Insured's Address - Effective Date");
    fieldDescMap.put("IN1-19-10", "Insured's Address - Census Tract");
    fieldDescMap.put("IN1-5-14", "Insurance Company Address - Expiration Date");
    fieldDescMap.put("IN1-5-10", "Insurance Company Address - Census Tract");
    fieldDescMap.put("IN1-5-11", "Insurance Company Address - Address Representation Code");
    fieldDescMap.put("IN1-5-12", "Insurance Company Address - Address Validity Range");
    fieldDescMap.put("NK1-12-10",
        "Next of Kin / Associated Parties Employee Number - Assigning Agency or Department");
    fieldDescMap.put("IN1-5-13", "Insurance Company Address - Effective Date");
    fieldDescMap.put("MSH-12-3-6",
        "Version ID - International Version ID - Name of Alternate Coding System");
    fieldDescMap.put("IN1-30-23-4",
        "Verification By - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("MSH-12-3-5", "Version ID - International Version ID - Alternate Text");
    fieldDescMap.put("IN1-30-23-3",
        "Verification By - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("MSH-12-3-4", "Version ID - International Version ID - Alternate Identifier");
    fieldDescMap.put("IN1-30-23-2", "Verification By - Assigning Agency or Department - Text");
    fieldDescMap.put("MSH-12-3-3", "Version ID - International Version ID - Name of Coding System");
    fieldDescMap
        .put("IN1-30-23-1", "Verification By - Assigning Agency or Department - Identifier");
    fieldDescMap.put("PV2-13-19-2", "Referral Source Code - Effective Date - Degree of Precision");
    fieldDescMap.put("PV2-13-19-1", "Referral Source Code - Effective Date - Time");
    fieldDescMap
        .put("IN1-30-23-9", "Verification By - Assigning Agency or Department - Original Text");
    fieldDescMap
        .put("NK1-30-13-2", "Contact Person's Name - Expiration Date - Degree of Precision");
    fieldDescMap.put("MSH-12-3-2", "Version ID - International Version ID - Text");
    fieldDescMap.put("IN1-30-23-8",
        "Verification By - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("MSH-12-3-1", "Version ID - International Version ID - Identifier");
    fieldDescMap.put("IN1-30-23-7",
        "Verification By - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("IN1-30-23-6",
        "Verification By - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("NK1-30-13-1", "Contact Person's Name - Expiration Date - Time");
    fieldDescMap
        .put("IN1-30-23-5", "Verification By - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("PV2-13-19", "Referral Source Code - Effective Date");
    fieldDescMap.put("ORC-21-6-1", "Ordering Facility Name - Assigning Authority - Namespace ID");
    fieldDescMap.put("ORC-21-6-2", "Ordering Facility Name - Assigning Authority - Universal ID");
    fieldDescMap.put("PV2-13-17", "Referral Source Code - Name Validity Range");
    fieldDescMap
        .put("ORC-21-6-3", "Ordering Facility Name - Assigning Authority - Universal ID Type");
    fieldDescMap.put("PV2-13-18", "Referral Source Code - Name Assembly Order");
    fieldDescMap.put("PID-13-9", "Phone Number - Home - Any Text");
    fieldDescMap.put("PID-13-8", "Phone Number - Home - Extension");
    fieldDescMap.put("GT1-51-6-2",
        "Guarantor Employer's Organization Name - Assigning Authority - Universal ID");
    fieldDescMap.put("PID-13-7", "Phone Number - Home - Local Number");
    fieldDescMap.put("GT1-51-6-1",
        "Guarantor Employer's Organization Name - Assigning Authority - Namespace ID");
    fieldDescMap.put("PID-13-6", "Phone Number - Home - Area/City Code");
    fieldDescMap.put("PID-13-5", "Phone Number - Home - Country Code");
    fieldDescMap.put("PID-13-4", "Phone Number - Home - Email Address");
    fieldDescMap.put("PID-13-3", "Phone Number - Home - Telecommunication Equipment Type");
    fieldDescMap.put("PID-13-2", "Phone Number - Home - Telecommunication Use Code");
    fieldDescMap.put("PID-13-1", "Phone Number - Home - Telephone Number");
    fieldDescMap.put("GT1-51-6-3",
        "Guarantor Employer's Organization Name - Assigning Authority - Universal ID Type");
    fieldDescMap.put("IN3-3-16-4", "Certified By - Name Context - Alternate Identifier");
    fieldDescMap.put("PV2-13-16", "Referral Source Code - Name Context");
    fieldDescMap.put("IN3-3-16-3", "Certified By - Name Context - Name of Coding System");
    fieldDescMap.put("PV2-13-15", "Referral Source Code - Name Representation Code");
    fieldDescMap.put("IN3-3-16-6", "Certified By - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("PV2-13-14", "Referral Source Code - Assigning Facility");
    fieldDescMap.put("IN3-3-16-5", "Certified By - Name Context - Alternate Text");
    fieldDescMap.put("PV2-13-13", "Referral Source Code - Identifier Type Code");
    fieldDescMap.put("PV2-13-12", "Referral Source Code - Check Digit Scheme");
    fieldDescMap.put("PV2-13-11", "Referral Source Code - Identifier Check Digit");
    fieldDescMap.put("IN3-3-16-2", "Certified By - Name Context - Text");
    fieldDescMap.put("PV2-13-10", "Referral Source Code - Name Type Code");
    fieldDescMap.put("IN3-3-16-1", "Certified By - Name Context - Identifier");
    fieldDescMap
        .put("GT1-46-12", "Contact Person's Telephone Number - Unformatted Telephone number");
    fieldDescMap.put("GT1-46-11", "Contact Person's Telephone Number - Speed Dial Code");
    fieldDescMap.put("GT1-46-10", "Contact Person's Telephone Number - Extension Prefix");
    fieldDescMap.put("IN2-25-9-1", "Payor ID - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("IN2-25-9-3", "Payor ID - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("IN2-25-9-2", "Payor ID - Assigning Jurisdiction - Text");
    fieldDescMap.put("IN2-25-9-5", "Payor ID - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("IN2-25-9-4", "Payor ID - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("IN2-25-9-7", "Payor ID - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap
        .put("IN2-25-9-6", "Payor ID - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("IN2-25-9-9", "Payor ID - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("IN2-25-9-8",
        "Payor ID - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("RXR-4-7", "Administration Method - Coding System Version ID");
    fieldDescMap.put("RXR-4-6", "Administration Method - Name of Alternate Coding System");
    fieldDescMap.put("RXR-4-9", "Administration Method - Original Text");
    fieldDescMap.put("RXR-4-8", "Administration Method - Alternate Coding System Version ID");
    fieldDescMap.put("RXR-4-3", "Administration Method - Name of Coding System");
    fieldDescMap.put("RXR-4-2", "Administration Method - Text");
    fieldDescMap.put("RXR-4-5", "Administration Method - Alternate Text");
    fieldDescMap.put("RXR-4-4", "Administration Method - Alternate Identifier");
    fieldDescMap.put("RXR-4-1", "Administration Method - Identifier");
    fieldDescMap.put("PV2-13-21", "Referral Source Code - Professional Suffix");
    fieldDescMap.put("PV2-13-20", "Referral Source Code - Expiration Date");
    fieldDescMap.put("PV2-13-23", "Referral Source Code - Assigning Agency or Department");
    fieldDescMap.put("PV2-13-22", "Referral Source Code - Assigning Jurisdiction");
    fieldDescMap.put("GT1-4-13-2", "Guarantor Spouse Name - Expiration Date - Degree of Precision");
    fieldDescMap.put("GT1-4-13-1", "Guarantor Spouse Name - Expiration Date - Time");
    fieldDescMap.put("PD1-4-22-6",
        "Patient Primary Care Provider Name & ID No. - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("PD1-4-22-7",
        "Patient Primary Care Provider Name & ID No. - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("IN1-10-6-1", "Insured's Group Emp ID - Assigning Facility - Namespace ID");
    fieldDescMap.put("PD1-4-22-4",
        "Patient Primary Care Provider Name & ID No. - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("IN1-10-6-2", "Insured's Group Emp ID - Assigning Facility - Universal ID");
    fieldDescMap.put("PD1-4-22-5",
        "Patient Primary Care Provider Name & ID No. - Assigning Jurisdiction - Alternate Text");
    fieldDescMap
        .put("IN1-10-6-3", "Insured's Group Emp ID - Assigning Facility - Universal ID Type");
    fieldDescMap.put("NK1-30-12-2", "Contact Person's Name - Effective Date - Degree of Precision");
    fieldDescMap.put("NK1-30-12-1", "Contact Person's Name - Effective Date - Time");
    fieldDescMap.put("PD1-4-22-8",
        "Patient Primary Care Provider Name & ID No. - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("PD1-4-22-9",
        "Patient Primary Care Provider Name & ID No. - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("PD1-4-22-3",
        "Patient Primary Care Provider Name & ID No. - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("PD1-4-22-2",
        "Patient Primary Care Provider Name & ID No. - Assigning Jurisdiction - Text");
    fieldDescMap.put("PD1-4-22-1",
        "Patient Primary Care Provider Name & ID No. - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("PV1-17-19-1", "Admitting Doctor - Effective Date - Time");
    fieldDescMap.put("PV1-17-19-2", "Admitting Doctor - Effective Date - Degree of Precision");
    fieldDescMap.put("IN1-16-1-5", "Name Of Insured - Family Name - Surname From Partner/Spouse");
    fieldDescMap
        .put("IN1-16-1-4", "Name Of Insured - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("IN1-16-1-3", "Name Of Insured - Family Name - Own Surname");
    fieldDescMap.put("GT1-17-14-1", "Guarantor Employer Address - Expiration Date - Time");
    fieldDescMap.put("IN1-10-10", "Insured's Group Emp ID - Assigning Agency or Department");
    fieldDescMap
        .put("GT1-17-14-2", "Guarantor Employer Address - Expiration Date - Degree of Precision");
    fieldDescMap.put("PD1-10-6-1", "Duplicate Patient - Assigning Facility - Namespace ID");
    fieldDescMap.put("PD1-10-6-2", "Duplicate Patient - Assigning Facility - Universal ID");
    fieldDescMap.put("PD1-10-6-3", "Duplicate Patient - Assigning Facility - Universal ID Type");
    fieldDescMap.put("ORC-11-2-3", "Verified By - Family Name - Own Surname");
    fieldDescMap
        .put("ORC-11-2-4", "Verified By - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("ORC-11-2-5", "Verified By - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("IN1-16-1-1", "Name Of Insured - Family Name - Surname");
    fieldDescMap.put("IN1-16-1-2", "Name Of Insured - Family Name - Own Surname Prefix");
    fieldDescMap.put("ORC-11-2-1", "Verified By - Family Name - Surname");
    fieldDescMap.put("ORC-11-2-2", "Verified By - Family Name - Own Surname Prefix");
    fieldDescMap.put("IN1-30-2-1", "Verification By - Family Name - Surname");
    fieldDescMap.put("PID-18-9-3",
        "Patient Account Number - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("NK1-3-3", "Relationship - Name of Coding System");
    fieldDescMap.put("IN1-30-2-5", "Verification By - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("PID-18-9-2", "Patient Account Number - Assigning Jurisdiction - Text");
    fieldDescMap.put("NK1-3-4", "Relationship - Alternate Identifier");
    fieldDescMap
        .put("IN1-30-2-4", "Verification By - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("PID-18-9-1", "Patient Account Number - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("NK1-3-5", "Relationship - Alternate Text");
    fieldDescMap.put("IN1-30-2-3", "Verification By - Family Name - Own Surname");
    fieldDescMap.put("NK1-3-6", "Relationship - Name of Alternate Coding System");
    fieldDescMap.put("IN1-30-2-2", "Verification By - Family Name - Own Surname Prefix");
    fieldDescMap
        .put("IN2-69-6-1", "Insured Organization Name and ID - Assigning Authority - Namespace ID");
    fieldDescMap.put("PID-18-9-7",
        "Patient Account Number - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("ORC-12-20-1", "Ordering Provider - Expiration Date - Time");
    fieldDescMap
        .put("IN2-69-6-2", "Insured Organization Name and ID - Assigning Authority - Universal ID");
    fieldDescMap.put("PID-18-9-6",
        "Patient Account Number - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("ORC-12-20-2", "Ordering Provider - Expiration Date - Degree of Precision");
    fieldDescMap.put("IN2-69-6-3",
        "Insured Organization Name and ID - Assigning Authority - Universal ID Type");
    fieldDescMap
        .put("PID-18-9-5", "Patient Account Number - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("PID-18-9-4",
        "Patient Account Number - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("PID-18-9-8",
        "Patient Account Number - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap
        .put("PID-18-9-9", "Patient Account Number - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("NK1-3-2", "Relationship - Text");
    fieldDescMap.put("NK1-3-1", "Relationship - Identifier");
    fieldDescMap.put("TQ2-4-2", "Related Filler Number - Namespace ID");
    fieldDescMap.put("TQ2-4-1", "Related Filler Number - Entity Identifier");
    fieldDescMap.put("TQ2-4-4", "Related Filler Number - Universal ID Type");
    fieldDescMap.put("TQ2-4-3", "Related Filler Number - Universal ID");
    fieldDescMap.put("ORC-9", "Date/Time of Transaction");
    fieldDescMap.put("IN3-17-1", "Appeal Reason - Identifier");
    fieldDescMap.put("IN3-17-2", "Appeal Reason - Text");
    fieldDescMap.put("IN3-17-3", "Appeal Reason - Name of Coding System");
    fieldDescMap.put("ORC-6", "Response Flag");
    fieldDescMap.put("IN3-17-4", "Appeal Reason - Alternate Identifier");
    fieldDescMap.put("ORC-5", "Order Status");
    fieldDescMap.put("IN3-17-5", "Appeal Reason - Alternate Text");
    fieldDescMap.put("ORC-8", "Parent");
    fieldDescMap.put("IN3-17-6", "Appeal Reason - Name of Alternate Coding System");
    fieldDescMap.put("ORC-7", "Quantity/Timing");
    fieldDescMap.put("ORC-2", "Placer Order Number");
    fieldDescMap.put("ORC-1", "Order Control");
    fieldDescMap.put("ORC-4", "Placer Group Number");
    fieldDescMap.put("ORC-3", "Filler Order Number");
    fieldDescMap.put("ORC-0", "Common Order");
    fieldDescMap.put("RXA-17-1", "Substance Manufacturer Name - Identifier");
    fieldDescMap.put("RXA-17-2", "Substance Manufacturer Name - Text");
    fieldDescMap.put("RXA-17-3", "Substance Manufacturer Name - Name of Coding System");
    fieldDescMap.put("RXA-17-4", "Substance Manufacturer Name - Alternate Identifier");
    fieldDescMap.put("OBX-23-10", "Performing Organization Name - Organization Identifier");
    fieldDescMap.put("ORC-30-1", "Enterer Authorization Mode - Identifier");
    fieldDescMap.put("ORC-30-2", "Enterer Authorization Mode - Text");
    fieldDescMap.put("ORC-30-6", "Enterer Authorization Mode - Name of Alternate Coding System");
    fieldDescMap.put("ORC-30-5", "Enterer Authorization Mode - Alternate Text");
    fieldDescMap.put("ORC-30-4", "Enterer Authorization Mode - Alternate Identifier");
    fieldDescMap.put("ORC-30-3", "Enterer Authorization Mode - Name of Coding System");
    fieldDescMap.put("ORC-30-9", "Enterer Authorization Mode - Original Text");
    fieldDescMap.put("PV1-8-14-3", "Referring Doctor - Assigning Facility - Universal ID Type");
    fieldDescMap.put("ORC-30-8", "Enterer Authorization Mode - Alternate Coding System Version ID");
    fieldDescMap.put("ORC-30-7", "Enterer Authorization Mode - Coding System Version ID");
    fieldDescMap.put("PV1-8-14-1", "Referring Doctor - Assigning Facility - Namespace ID");
    fieldDescMap.put("PV1-8-14-2", "Referring Doctor - Assigning Facility - Universal ID");
    fieldDescMap.put("RXA-17-6", "Substance Manufacturer Name - Name of Alternate Coding System");
    fieldDescMap.put("RXA-17-5", "Substance Manufacturer Name - Alternate Text");
    fieldDescMap.put("PV1-19-4-1", "Visit Number - Assigning Authority - Namespace ID");
    fieldDescMap.put("PV1-19-4-3", "Visit Number - Assigning Authority - Universal ID Type");
    fieldDescMap.put("PV1-19-4-2", "Visit Number - Assigning Authority - Universal ID");
    fieldDescMap.put("PID-11-1-2", "Patient Address - Street Address - Street Name");
    fieldDescMap.put("PID-11-1-1", "Patient Address - Street Address - Street or Mailing Address");
    fieldDescMap.put("PID-11-1-3", "Patient Address - Street Address - Dwelling Number");
    fieldDescMap.put("IN1-20", "Assignment Of Benefits");
    fieldDescMap.put("PID-11-14-1", "Patient Address - Expiration Date - Time");
    fieldDescMap.put("PID-11-14-2", "Patient Address - Expiration Date - Degree of Precision");
    fieldDescMap.put("IN1-15", "Plan Type");
    fieldDescMap.put("IN1-14", "Authorization Information");
    fieldDescMap.put("IN1-17", "Insured's Relationship To Patient");
    fieldDescMap.put("IN1-16", "Name Of Insured");
    fieldDescMap.put("ORC-13-10", "Enterer's Location - Comprehensive Location Identifier");
    fieldDescMap.put("IN1-11", "Insured's Group Emp Name");
    fieldDescMap.put("IN1-10", "Insured's Group Emp ID");
    fieldDescMap.put("IN1-13", "Plan Expiration Date");
    fieldDescMap.put("ORC-13-11", "Enterer's Location - Assigning Authority for Location");
    fieldDescMap.put("IN1-12", "Plan Effective Date");
    fieldDescMap.put("RXA-10-2-1", "Administering Provider - Family Name - Surname");
    fieldDescMap.put("RXA-10-2-2", "Administering Provider - Family Name - Own Surname Prefix");
    fieldDescMap.put("RXA-10-2-3", "Administering Provider - Family Name - Own Surname");
    fieldDescMap.put("IN1-3-10-2", "Insurance Company ID - Assigning Agency or Department - Text");
    fieldDescMap.put("IN1-19", "Insured's Address");
    fieldDescMap.put("RXA-10-2-4",
        "Administering Provider - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap
        .put("IN1-3-10-1", "Insurance Company ID - Assigning Agency or Department - Identifier");
    fieldDescMap.put("IN1-18", "Insured's Date Of Birth");
    fieldDescMap
        .put("RXA-10-2-5", "Administering Provider - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("IN1-3-10-3",
        "Insurance Company ID - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("IN1-3-10-4",
        "Insurance Company ID - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("IN1-3-10-5",
        "Insurance Company ID - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("IN1-3-10-6",
        "Insurance Company ID - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("IN2-52-13-1", "Insured's Contact Person's Name - Expiration Date - Time");
    fieldDescMap.put("IN1-3-10-7",
        "Insurance Company ID - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("IN2-52-13-2",
        "Insured's Contact Person's Name - Expiration Date - Degree of Precision");
    fieldDescMap.put("IN1-3-10-8",
        "Insurance Company ID - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap
        .put("IN1-3-10-9", "Insurance Company ID - Assigning Agency or Department - Original Text");
    fieldDescMap.put("IN2-22-12-1", "Special Coverage Approval Name - Effective Date - Time");
    fieldDescMap.put("IN2-22-12-2",
        "Special Coverage Approval Name - Effective Date - Degree of Precision");
    fieldDescMap.put("GT1-29-9-5",
        "Guarantor Employer ID Number - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("GT1-29-9-6",
        "Guarantor Employer ID Number - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("GT1-29-9-7",
        "Guarantor Employer ID Number - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("GT1-29-9-8",
        "Guarantor Employer ID Number - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap
        .put("GT1-29-9-1", "Guarantor Employer ID Number - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("GT1-29-9-2", "Guarantor Employer ID Number - Assigning Jurisdiction - Text");
    fieldDescMap.put("GT1-29-9-3",
        "Guarantor Employer ID Number - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("GT1-29-9-4",
        "Guarantor Employer ID Number - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap
        .put("GT1-29-9-9", "Guarantor Employer ID Number - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("OBX-19-1", "Date/Time of the Analysis - Time");
    fieldDescMap.put("OBX-19-2", "Date/Time of the Analysis - Degree of Precision");
    fieldDescMap.put("ORC-19-19", "Action By - Effective Date");
    fieldDescMap.put("GT1-4-1-1", "Guarantor Spouse Name - Family Name - Surname");
    fieldDescMap.put("ORC-19-22", "Action By - Assigning Jurisdiction");
    fieldDescMap.put("GT1-4-1-4",
        "Guarantor Spouse Name - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("ORC-19-23", "Action By - Assigning Agency or Department");
    fieldDescMap
        .put("GT1-4-1-5", "Guarantor Spouse Name - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("GT1-4-1-2", "Guarantor Spouse Name - Family Name - Own Surname Prefix");
    fieldDescMap.put("GT1-4-1-3", "Guarantor Spouse Name - Family Name - Own Surname");
    fieldDescMap.put("ORC-22-13-1", "Ordering Facility Address - Effective Date - Time");
    fieldDescMap.put("ORC-19-20", "Action By - Expiration Date");
    fieldDescMap
        .put("ORC-22-13-2", "Ordering Facility Address - Effective Date - Degree of Precision");
    fieldDescMap.put("ORC-19-21", "Action By - Professional Suffix");
    fieldDescMap.put("PV1-3-4", "Assigned Patient Location - Facility");
    fieldDescMap.put("PV1-3-5", "Assigned Patient Location - Location Status");
    fieldDescMap.put("PV1-3-6", "Assigned Patient Location - Person Location Type");
    fieldDescMap.put("PV1-3-7", "Assigned Patient Location - Building");
    fieldDescMap.put("PV1-3-8", "Assigned Patient Location - Floor");
    fieldDescMap.put("PV1-3-9", "Assigned Patient Location - Location Description");
    fieldDescMap.put("PV1-3-1", "Assigned Patient Location - Point of Care");
    fieldDescMap.put("PV1-3-2", "Assigned Patient Location - Room");
    fieldDescMap.put("PV1-3-3", "Assigned Patient Location - Bed");
    fieldDescMap.put("ORC-19-17", "Action By - Name Validity Range");
    fieldDescMap.put("ORC-19-18", "Action By - Name Assembly Order");
    fieldDescMap.put("ORC-19-15", "Action By - Name Representation Code");
    fieldDescMap.put("ORC-19-16", "Action By - Name Context");
    fieldDescMap.put("ORC-19-13", "Action By - Identifier Type Code");
    fieldDescMap.put("ORC-19-14", "Action By - Assigning Facility");
    fieldDescMap.put("ORC-19-11", "Action By - Identifier Check Digit");
    fieldDescMap.put("ORC-19-12", "Action By - Check Digit Scheme");
    fieldDescMap.put("ORC-19-10", "Action By - Name Type Code");
    fieldDescMap.put("IN2-72-2", "CMS Patient's Relationship to Insured - Text");
    fieldDescMap.put("IN2-72-3", "CMS Patient's Relationship to Insured - Name of Coding System");
    fieldDescMap.put("IN2-72-4", "CMS Patient's Relationship to Insured - Alternate Identifier");
    fieldDescMap.put("IN2-72-5", "CMS Patient's Relationship to Insured - Alternate Text");
    fieldDescMap
        .put("IN2-72-6", "CMS Patient's Relationship to Insured - Name of Alternate Coding System");
    fieldDescMap
        .put("PID-6-9-6", "Mother's Maiden Name - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("PID-6-9-5", "Mother's Maiden Name - Name Context - Alternate Text");
    fieldDescMap.put("PID-6-9-4", "Mother's Maiden Name - Name Context - Alternate Identifier");
    fieldDescMap.put("PID-6-9-3", "Mother's Maiden Name - Name Context - Name of Coding System");
    fieldDescMap.put("PID-6-9-2", "Mother's Maiden Name - Name Context - Text");
    fieldDescMap.put("PID-6-9-1", "Mother's Maiden Name - Name Context - Identifier");
    fieldDescMap.put("IN2-61-10", "Patient Member Number - Assigning Agency or Department");
    fieldDescMap.put("NK1-30-10", "Contact Person's Name - Name Validity Range");
    fieldDescMap.put("GT1-50-1", "Job Code/Class - Job Code");
    fieldDescMap.put("NK1-30-11", "Contact Person's Name - Name Assembly Order");
    fieldDescMap.put("GT1-50-2", "Job Code/Class - Job Class");
    fieldDescMap.put("GT1-50-3", "Job Code/Class - Job Description Text");
    fieldDescMap.put("PV1-1", "Set ID - PV1");
    fieldDescMap.put("PV1-0", "Patient Visit");
    fieldDescMap.put("NK1-30-14", "Contact Person's Name - Professional Suffix");
    fieldDescMap.put("NK1-30-12", "Contact Person's Name - Effective Date");
    fieldDescMap.put("NK1-30-13", "Contact Person's Name - Expiration Date");
    fieldDescMap.put("PV1-8", "Referring Doctor");
    fieldDescMap.put("PV1-9", "Consulting Doctor");
    fieldDescMap.put("PV1-6", "Prior Patient Location");
    fieldDescMap.put("PV1-7", "Attending Doctor");
    fieldDescMap.put("PV1-4", "Admission Type");
    fieldDescMap.put("OBX-12-1", "Effective Date of Reference Range Values - Time");
    fieldDescMap.put("PV1-5", "Preadmit Number");
    fieldDescMap.put("OBX-12-2", "Effective Date of Reference Range Values - Degree of Precision");
    fieldDescMap.put("PV1-2", "Patient Class");
    fieldDescMap.put("PV1-3", "Assigned Patient Location");
    fieldDescMap.put("IN2-72-1", "CMS Patient's Relationship to Insured - Identifier");
    fieldDescMap
        .put("RXA-10-14-3", "Administering Provider - Assigning Facility - Universal ID Type");
    fieldDescMap.put("RXA-10-14-2", "Administering Provider - Assigning Facility - Universal ID");
    fieldDescMap.put("RXA-10-14-1", "Administering Provider - Assigning Facility - Namespace ID");
    fieldDescMap.put("IN2-71-1", "Race - Identifier");
    fieldDescMap.put("IN2-71-2", "Race - Text");
    fieldDescMap.put("IN3-16-11", "Certification Contact Phone Number - Speed Dial Code");
    fieldDescMap.put("IN3-16-10", "Certification Contact Phone Number - Extension Prefix");
    fieldDescMap
        .put("IN3-16-12", "Certification Contact Phone Number - Unformatted Telephone number");
    fieldDescMap.put("ORC-24-14", "Ordering Provider Address - Expiration Date");
    fieldDescMap.put("ORC-24-13", "Ordering Provider Address - Effective Date");
    fieldDescMap.put("IN3-14-9-2", "Physician Reviewer - Assigning Authority - Universal ID");
    fieldDescMap.put("IN3-14-9-1", "Physician Reviewer - Assigning Authority - Namespace ID");
    fieldDescMap.put("IN3-14-9-3", "Physician Reviewer - Assigning Authority - Universal ID Type");
    fieldDescMap.put("ORC-23-8", "Ordering Facility Phone Number - Extension");
    fieldDescMap.put("ORC-23-7", "Ordering Facility Phone Number - Local Number");
    fieldDescMap.put("ORC-23-9", "Ordering Facility Phone Number - Any Text");
    fieldDescMap.put("PID-5-9-6", "Patient Name - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("IN2-71-6", "Race - Name of Alternate Coding System");
    fieldDescMap.put("PID-5-9-1", "Patient Name - Name Context - Identifier");
    fieldDescMap.put("IN2-71-5", "Race - Alternate Text");
    fieldDescMap.put("ORC-23-2", "Ordering Facility Phone Number - Telecommunication Use Code");
    fieldDescMap.put("IN2-71-4", "Race - Alternate Identifier");
    fieldDescMap.put("ORC-23-1", "Ordering Facility Phone Number - Telephone Number");
    fieldDescMap.put("IN2-71-3", "Race - Name of Coding System");
    fieldDescMap.put("ORC-23-4", "Ordering Facility Phone Number - Email Address");
    fieldDescMap.put("PID-5-9-5", "Patient Name - Name Context - Alternate Text");
    fieldDescMap
        .put("ORC-23-3", "Ordering Facility Phone Number - Telecommunication Equipment Type");
    fieldDescMap.put("PID-5-9-4", "Patient Name - Name Context - Alternate Identifier");
    fieldDescMap.put("ORC-23-6", "Ordering Facility Phone Number - Area/City Code");
    fieldDescMap.put("PID-5-9-3", "Patient Name - Name Context - Name of Coding System");
    fieldDescMap.put("ORC-23-5", "Ordering Facility Phone Number - Country Code");
    fieldDescMap.put("PID-5-9-2", "Patient Name - Name Context - Text");
    fieldDescMap
        .put("NK1-26-9-6", "Mother's Maiden Name - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("NK1-26-9-4", "Mother's Maiden Name - Name Context - Alternate Identifier");
    fieldDescMap.put("NK1-26-9-5", "Mother's Maiden Name - Name Context - Alternate Text");
    fieldDescMap
        .put("IN2-40-1-5", "Mother's Maiden Name - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("IN2-40-1-4",
        "Mother's Maiden Name - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("IN2-40-1-3", "Mother's Maiden Name - Family Name - Own Surname");
    fieldDescMap.put("IN2-40-1-2", "Mother's Maiden Name - Family Name - Own Surname Prefix");
    fieldDescMap.put("IN2-40-1-1", "Mother's Maiden Name - Family Name - Surname");
    fieldDescMap.put("ORC-24-11", "Ordering Provider Address - Address Representation Code");
    fieldDescMap.put("ORC-24-12", "Ordering Provider Address - Address Validity Range");
    fieldDescMap.put("ORC-24-10", "Ordering Provider Address - Census Tract");
    fieldDescMap
        .put("PID-3-4-3", "Patient Identifier List - Assigning Authority - Universal ID Type");
    fieldDescMap.put("PID-3-4-1", "Patient Identifier List - Assigning Authority - Namespace ID");
    fieldDescMap.put("PID-3-4-2", "Patient Identifier List - Assigning Authority - Universal ID");
    fieldDescMap.put("NK1-26-9-3", "Mother's Maiden Name - Name Context - Name of Coding System");
    fieldDescMap.put("NK1-26-9-2", "Mother's Maiden Name - Name Context - Text");
    fieldDescMap.put("NK1-26-9-1", "Mother's Maiden Name - Name Context - Identifier");
    fieldDescMap
        .put("IN1-11-8-3", "Insured's Group Emp Name - Assigning Facility - Universal ID Type");
    fieldDescMap.put("IN1-11-8-1", "Insured's Group Emp Name - Assigning Facility - Namespace ID");
    fieldDescMap.put("IN1-11-8-2", "Insured's Group Emp Name - Assigning Facility - Universal ID");
    fieldDescMap.put("NK1-33-6-1",
        "Next of Kin/Associated Party's Identifiers - Assigning Facility - Namespace ID");
    fieldDescMap.put("NK1-33-6-2",
        "Next of Kin/Associated Party's Identifiers - Assigning Facility - Universal ID");
    fieldDescMap.put("PV1-7-19-2", "Attending Doctor - Effective Date - Degree of Precision");
    fieldDescMap.put("TQ1-2-2", "Quantity - Units");
    fieldDescMap.put("PV1-7-19-1", "Attending Doctor - Effective Date - Time");
    fieldDescMap.put("TQ1-2-1", "Quantity - Quantity");
    fieldDescMap.put("ORC-10-9-2", "Entered By - Assigning Authority - Universal ID");
    fieldDescMap.put("NK1-33-6-3",
        "Next of Kin/Associated Party's Identifiers - Assigning Facility - Universal ID Type");
    fieldDescMap.put("ORC-10-9-1", "Entered By - Assigning Authority - Namespace ID");
    fieldDescMap.put("ORC-10-9-3", "Entered By - Assigning Authority - Universal ID Type");
    fieldDescMap.put("OBX-25-20-2",
        "Performing Organization Medical Director - Expiration Date - Degree of Precision");
    fieldDescMap.put("IN1-11-7", "Insured's Group Emp Name - Identifier Type Code");
    fieldDescMap
        .put("OBX-25-20-1", "Performing Organization Medical Director - Expiration Date - Time");
    fieldDescMap.put("IN1-11-6", "Insured's Group Emp Name - Assigning Authority");
    fieldDescMap.put("IN1-11-5", "Insured's Group Emp Name - Check Digit Scheme");
    fieldDescMap.put("IN1-11-4", "Insured's Group Emp Name - Check Digit");
    fieldDescMap.put("IN1-11-9", "Insured's Group Emp Name - Name Representation Code");
    fieldDescMap.put("IN1-11-8", "Insured's Group Emp Name - Assigning Facility");
    fieldDescMap
        .put("ORC-24-14-2", "Ordering Provider Address - Expiration Date - Degree of Precision");
    fieldDescMap
        .put("IN2-53-12", "Insured's Contact Person Phone Number - Unformatted Telephone number");
    fieldDescMap.put("ORC-24-14-1", "Ordering Provider Address - Expiration Date - Time");
    fieldDescMap.put("IN1-11-3", "Insured's Group Emp Name - ID Number");
    fieldDescMap.put("IN1-11-2", "Insured's Group Emp Name - Organization Name Type Code");
    fieldDescMap.put("IN1-11-1", "Insured's Group Emp Name - Organization Name");
    fieldDescMap.put("NK1-33-10-6",
        "Next of Kin/Associated Party's Identifiers - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("NK1-31-8", "Contact Person's Telephone Number - Extension");
    fieldDescMap.put("NK1-25-2", "Religion - Text");
    fieldDescMap.put("NK1-33-10-7",
        "Next of Kin/Associated Party's Identifiers - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("NK1-31-9", "Contact Person's Telephone Number - Any Text");
    fieldDescMap.put("NK1-25-1", "Religion - Identifier");
    fieldDescMap.put("NK1-33-10-8",
        "Next of Kin/Associated Party's Identifiers - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("NK1-31-6", "Contact Person's Telephone Number - Area/City Code");
    fieldDescMap.put("NK1-25-4", "Religion - Alternate Identifier");
    fieldDescMap.put("RXA-5-1", "Administered Code - Identifier");
    fieldDescMap.put("NK1-33-10-9",
        "Next of Kin/Associated Party's Identifiers - Assigning Agency or Department - Original Text");
    fieldDescMap.put("NK1-31-7", "Contact Person's Telephone Number - Local Number");
    fieldDescMap.put("NK1-25-3", "Religion - Name of Coding System");
    fieldDescMap.put("IN2-70-6-3",
        "Insured Employer Organization Name and ID - Assigning Authority - Universal ID Type");
    fieldDescMap.put("NK1-33-10-2",
        "Next of Kin/Associated Party's Identifiers - Assigning Agency or Department - Text");
    fieldDescMap.put("NK1-25-6", "Religion - Name of Alternate Coding System");
    fieldDescMap.put("NK1-33-10-3",
        "Next of Kin/Associated Party's Identifiers - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("NK1-25-5", "Religion - Alternate Text");
    fieldDescMap.put("IN2-53-11", "Insured's Contact Person Phone Number - Speed Dial Code");
    fieldDescMap.put("NK1-33-10-4",
        "Next of Kin/Associated Party's Identifiers - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("IN2-53-10", "Insured's Contact Person Phone Number - Extension Prefix");
    populateFieldDescriptions3();
  }

  public void populateFieldDescriptions3() {
    fieldDescMap.put("NK1-33-10-5",
        "Next of Kin/Associated Party's Identifiers - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("RXA-5-6", "Administered Code - Name of Alternate Coding System");
    fieldDescMap.put("IN2-70-6-1",
        "Insured Employer Organization Name and ID - Assigning Authority - Namespace ID");
    fieldDescMap.put("IN2-70-6-2",
        "Insured Employer Organization Name and ID - Assigning Authority - Universal ID");
    fieldDescMap.put("NK1-33-10-1",
        "Next of Kin/Associated Party's Identifiers - Assigning Agency or Department - Identifier");
    fieldDescMap.put("RXA-5-2", "Administered Code - Text");
    fieldDescMap.put("RXA-5-3", "Administered Code - Name of Coding System");
    fieldDescMap.put("RXA-5-4", "Administered Code - Alternate Identifier");
    fieldDescMap.put("RXA-5-5", "Administered Code - Alternate Text");
    fieldDescMap.put("IN1-6-3",
        "Insurance Co Contact Person - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("IN1-6-2", "Insurance Co Contact Person - Given Name");
    fieldDescMap.put("IN1-6-1", "Insurance Co Contact Person - Family Name");
    fieldDescMap.put("IN1-6-7", "Insurance Co Contact Person - Name Type Code");
    fieldDescMap.put("IN1-6-6", "Insurance Co Contact Person - Degree (e.g., MD)");
    fieldDescMap.put("IN1-6-5", "Insurance Co Contact Person - Prefix (e.g., DR)");
    fieldDescMap.put("IN1-6-4", "Insurance Co Contact Person - Suffix (e.g., JR or III)");
    fieldDescMap.put("NK1-31-1", "Contact Person's Telephone Number - Telephone Number");
    fieldDescMap
        .put("NK1-31-3", "Contact Person's Telephone Number - Telecommunication Equipment Type");
    fieldDescMap.put("NK1-31-2", "Contact Person's Telephone Number - Telecommunication Use Code");
    fieldDescMap.put("NK1-31-5", "Contact Person's Telephone Number - Country Code");
    fieldDescMap.put("NK1-31-4", "Contact Person's Telephone Number - Email Address");
    fieldDescMap.put("IN2-47-2", "Job Code/Class - Job Class");
    fieldDescMap.put("IN2-47-3", "Job Code/Class - Job Description Text");
    fieldDescMap.put("IN2-47-1", "Job Code/Class - Job Code");
    fieldDescMap.put("PID-7-2", "Date/Time of Birth - Degree of Precision");
    fieldDescMap.put("PID-7-1", "Date/Time of Birth - Time");
    fieldDescMap.put("NK1-6-11", "Business Phone Number - Speed Dial Code");
    fieldDescMap.put("NK1-6-12", "Business Phone Number - Unformatted Telephone number");
    fieldDescMap.put("IN1-6-12-1", "Insurance Co Contact Person - Effective Date - Time");
    fieldDescMap
        .put("IN1-6-12-2", "Insurance Co Contact Person - Effective Date - Degree of Precision");
    fieldDescMap.put("IN2-40-9", "Mother's Maiden Name - Name Context");
    fieldDescMap.put("IN2-40-4", "Mother's Maiden Name - Suffix (e.g., JR or III)");
    fieldDescMap.put("IN2-40-3",
        "Mother's Maiden Name - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("IN2-40-2", "Mother's Maiden Name - Given Name");
    fieldDescMap.put("IN2-40-1", "Mother's Maiden Name - Family Name");
    fieldDescMap.put("IN1-6-8", "Insurance Co Contact Person - Name Representation Code");
    fieldDescMap.put("IN2-40-8", "Mother's Maiden Name - Name Representation Code");
    fieldDescMap.put("IN1-6-9", "Insurance Co Contact Person - Name Context");
    fieldDescMap
        .put("IN2-1-4-3", "Insured's Employee ID - Assigning Authority - Universal ID Type");
    fieldDescMap.put("IN2-40-7", "Mother's Maiden Name - Name Type Code");
    fieldDescMap.put("NK1-6-10", "Business Phone Number - Extension Prefix");
    fieldDescMap.put("IN2-1-4-2", "Insured's Employee ID - Assigning Authority - Universal ID");
    fieldDescMap.put("IN2-40-6", "Mother's Maiden Name - Degree (e.g., MD)");
    fieldDescMap.put("IN2-1-4-1", "Insured's Employee ID - Assigning Authority - Namespace ID");
    fieldDescMap.put("IN2-40-5", "Mother's Maiden Name - Prefix (e.g., DR)");
    fieldDescMap.put("IN2-3-4",
        "Insured's Employer's Name and ID - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("IN2-3-5", "Insured's Employer's Name and ID - Suffix (e.g., JR or III)");
    fieldDescMap.put("IN2-3-2", "Insured's Employer's Name and ID - Family Name");
    fieldDescMap.put("NK1-13-10", "Organization Name - NK1 - Organization Identifier");
    fieldDescMap.put("IN2-3-3", "Insured's Employer's Name and ID - Given Name");
    fieldDescMap.put("IN2-3-8", "Insured's Employer's Name and ID - Source Table");
    fieldDescMap.put("IN2-3-9", "Insured's Employer's Name and ID - Assigning Authority");
    fieldDescMap.put("IN2-3-6", "Insured's Employer's Name and ID - Prefix (e.g., DR)");
    fieldDescMap.put("IN2-3-7", "Insured's Employer's Name and ID - Degree (e.g., MD)");
    fieldDescMap
        .put("TQ2-8-2-3", "Sequence Condition Time Interval - Units - Name of Coding System");
    fieldDescMap.put("ORC-11-16-2", "Verified By - Name Context - Text");
    fieldDescMap.put("GT1-21-10", "Guarantor Organization Name - Organization Identifier");
    fieldDescMap.put("TQ2-8-2-2", "Sequence Condition Time Interval - Units - Text");
    fieldDescMap.put("ORC-11-16-3", "Verified By - Name Context - Name of Coding System");
    fieldDescMap.put("TQ2-8-2-1", "Sequence Condition Time Interval - Units - Identifier");
    fieldDescMap.put("ORC-11-16-1", "Verified By - Name Context - Identifier");
    fieldDescMap.put("ORC-11-16-6", "Verified By - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("TQ2-8-2-6",
        "Sequence Condition Time Interval - Units - Name of Alternate Coding System");
    fieldDescMap.put("IN2-3-1", "Insured's Employer's Name and ID - ID Number");
    fieldDescMap.put("TQ2-8-2-5", "Sequence Condition Time Interval - Units - Alternate Text");
    fieldDescMap.put("ORC-11-16-4", "Verified By - Name Context - Alternate Identifier");
    fieldDescMap
        .put("TQ2-8-2-4", "Sequence Condition Time Interval - Units - Alternate Identifier");
    fieldDescMap.put("ORC-11-16-5", "Verified By - Name Context - Alternate Text");
    fieldDescMap.put("PID-27-1", "Veterans Military Status - Identifier");
    fieldDescMap.put("PID-27-3", "Veterans Military Status - Name of Coding System");
    fieldDescMap.put("PID-27-2", "Veterans Military Status - Text");
    fieldDescMap.put("PID-27-5", "Veterans Military Status - Alternate Text");
    fieldDescMap.put("PID-27-4", "Veterans Military Status - Alternate Identifier");
    fieldDescMap.put("PID-27-6", "Veterans Military Status - Name of Alternate Coding System");
    fieldDescMap.put("PV1-6-4-3", "Prior Patient Location - Facility - Universal ID Type");
    fieldDescMap.put("PV1-6-4-2", "Prior Patient Location - Facility - Universal ID");
    fieldDescMap.put("PV1-43-2", "Prior Temporary Location - Room");
    fieldDescMap.put("PV1-43-3", "Prior Temporary Location - Bed");
    fieldDescMap.put("PV1-6-4-1", "Prior Patient Location - Facility - Namespace ID");
    fieldDescMap.put("PV1-43-1", "Prior Temporary Location - Point of Care");
    fieldDescMap.put("OBX-16-16-3", "Responsible Observer - Name Context - Name of Coding System");
    fieldDescMap.put("OBX-16-16-2", "Responsible Observer - Name Context - Text");
    fieldDescMap.put("OBX-16-16-1", "Responsible Observer - Name Context - Identifier");
    fieldDescMap.put("PV1-43-8", "Prior Temporary Location - Floor");
    fieldDescMap.put("GT1-8-2", "Guarantor Date/Time Of Birth - Degree of Precision");
    fieldDescMap.put("RXA-24-9", "Administered Drug Strength Volume Units - Original Text");
    fieldDescMap.put("PV1-43-9", "Prior Temporary Location - Location Description");
    fieldDescMap.put("PV1-43-6", "Prior Temporary Location - Person Location Type");
    fieldDescMap.put("PV1-37-2", "Discharged to Location - Effective Date");
    fieldDescMap.put("OBX-16-16-6",
        "Responsible Observer - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("PV1-43-7", "Prior Temporary Location - Building");
    fieldDescMap.put("PV1-37-1", "Discharged to Location - Discharge Location");
    fieldDescMap.put("GT1-8-1", "Guarantor Date/Time Of Birth - Time");
    fieldDescMap.put("OBX-16-16-5", "Responsible Observer - Name Context - Alternate Text");
    fieldDescMap.put("PV1-43-4", "Prior Temporary Location - Facility");
    fieldDescMap.put("OBX-16-16-4", "Responsible Observer - Name Context - Alternate Identifier");
    fieldDescMap.put("PV1-43-5", "Prior Temporary Location - Location Status");
    fieldDescMap.put("ORC-11-23", "Verified By - Assigning Agency or Department");
    fieldDescMap.put("ORC-11-22", "Verified By - Assigning Jurisdiction");
    fieldDescMap.put("NK1-12-6-2",
        "Next of Kin / Associated Parties Employee Number - Assigning Facility - Universal ID");
    fieldDescMap.put("NK1-12-6-3",
        "Next of Kin / Associated Parties Employee Number - Assigning Facility - Universal ID Type");
    fieldDescMap.put("ORC-11-20", "Verified By - Expiration Date");
    fieldDescMap.put("ORC-11-21", "Verified By - Professional Suffix");
    fieldDescMap.put("NK1-12-6-1",
        "Next of Kin / Associated Parties Employee Number - Assigning Facility - Namespace ID");
    fieldDescMap.put("RXA-24-5", "Administered Drug Strength Volume Units - Alternate Text");
    fieldDescMap.put("IN3-3-20-2", "Certified By - Expiration Date - Degree of Precision");
    fieldDescMap.put("RXA-24-6",
        "Administered Drug Strength Volume Units - Name of Alternate Coding System");
    fieldDescMap
        .put("RXA-24-7", "Administered Drug Strength Volume Units - Coding System Version ID");
    fieldDescMap.put("ORC-12-10", "Ordering Provider - Name Type Code");
    fieldDescMap.put("RXA-24-8",
        "Administered Drug Strength Volume Units - Alternate Coding System Version ID");
    fieldDescMap.put("ORC-12-11", "Ordering Provider - Identifier Check Digit");
    fieldDescMap.put("RXA-24-1", "Administered Drug Strength Volume Units - Identifier");
    fieldDescMap.put("RXA-24-2", "Administered Drug Strength Volume Units - Text");
    fieldDescMap.put("ORC-11-19", "Verified By - Effective Date");
    fieldDescMap.put("RXA-24-3", "Administered Drug Strength Volume Units - Name of Coding System");
    fieldDescMap.put("RXA-24-4", "Administered Drug Strength Volume Units - Alternate Identifier");
    fieldDescMap.put("IN3-3-20-1", "Certified By - Expiration Date - Time");
    fieldDescMap.put("ORC-11-16", "Verified By - Name Context");
    fieldDescMap.put("ORC-11-15", "Verified By - Name Representation Code");
    fieldDescMap.put("ORC-11-18", "Verified By - Name Assembly Order");
    fieldDescMap.put("ORC-11-17", "Verified By - Name Validity Range");
    fieldDescMap.put("ORC-11-12", "Verified By - Check Digit Scheme");
    fieldDescMap.put("ORC-11-11", "Verified By - Identifier Check Digit");
    fieldDescMap.put("ORC-11-14", "Verified By - Assigning Facility");
    fieldDescMap.put("ORC-11-13", "Verified By - Identifier Type Code");
    fieldDescMap.put("IN2-62-5", "Guarantor's Relationship to Insured - Alternate Text");
    fieldDescMap.put("ORC-11-10", "Verified By - Name Type Code");
    fieldDescMap
        .put("IN2-62-6", "Guarantor's Relationship to Insured - Name of Alternate Coding System");
    fieldDescMap.put("IN2-62-1", "Guarantor's Relationship to Insured - Identifier");
    fieldDescMap.put("IN2-62-2", "Guarantor's Relationship to Insured - Text");
    fieldDescMap.put("IN2-62-3", "Guarantor's Relationship to Insured - Name of Coding System");
    fieldDescMap.put("IN2-62-4", "Guarantor's Relationship to Insured - Alternate Identifier");
    fieldDescMap.put("PID-14-11", "Phone Number - Business - Speed Dial Code");
    fieldDescMap.put("PID-14-12", "Phone Number - Business - Unformatted Telephone number");
    fieldDescMap.put("PID-14-10", "Phone Number - Business - Extension Prefix");
    fieldDescMap.put("OBX-25-14-1",
        "Performing Organization Medical Director - Assigning Facility - Namespace ID");
    fieldDescMap.put("OBX-25-14-2",
        "Performing Organization Medical Director - Assigning Facility - Universal ID");
    fieldDescMap.put("OBX-25-14-3",
        "Performing Organization Medical Director - Assigning Facility - Universal ID Type");
    fieldDescMap.put("PID-34-1", "Last Update Facility - Namespace ID");
    fieldDescMap.put("IN2-36-5", "Publicity Code - Alternate Text");
    fieldDescMap.put("IN2-36-4", "Publicity Code - Alternate Identifier");
    fieldDescMap.put("IN2-36-3", "Publicity Code - Name of Coding System");
    fieldDescMap.put("IN2-36-2", "Publicity Code - Text");
    fieldDescMap.put("PV1-8-2-3", "Referring Doctor - Family Name - Own Surname");
    fieldDescMap.put("PV1-8-2-2", "Referring Doctor - Family Name - Own Surname Prefix");
    fieldDescMap.put("PV1-8-2-5", "Referring Doctor - Family Name - Surname From Partner/Spouse");
    fieldDescMap
        .put("PV1-8-2-4", "Referring Doctor - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("IN2-36-6", "Publicity Code - Name of Alternate Coding System");
    fieldDescMap.put("IN2-36-1", "Publicity Code - Identifier");
    fieldDescMap.put("PID-34-3", "Last Update Facility - Universal ID Type");
    fieldDescMap.put("IN1-5-14-1", "Insurance Company Address - Expiration Date - Time");
    fieldDescMap.put("PID-34-2", "Last Update Facility - Universal ID");
    fieldDescMap
        .put("IN1-5-14-2", "Insurance Company Address - Expiration Date - Degree of Precision");
    fieldDescMap.put("PV1-11-11", "Temporary Location - Assigning Authority for Location");
    fieldDescMap.put("PV1-11-10", "Temporary Location - Comprehensive Location Identifier");
    fieldDescMap.put("ORC-8-2-1", "Parent - Filler Assigned Identifier - Entity Identifier");
    fieldDescMap.put("ORC-8-2-2", "Parent - Filler Assigned Identifier - Namespace ID");
    fieldDescMap.put("ORC-8-2-3", "Parent - Filler Assigned Identifier - Universal ID");
    fieldDescMap.put("ORC-8-2-4", "Parent - Filler Assigned Identifier - Universal ID Type");
    fieldDescMap.put("ORC-15-2", "Order Effective Date/Time - Degree of Precision");
    fieldDescMap.put("ORC-15-1", "Order Effective Date/Time - Time");
    fieldDescMap
        .put("MSH-12-2-3", "Version ID - Internationalization Code - Name of Coding System");
    fieldDescMap.put("MSH-12-2-2", "Version ID - Internationalization Code - Text");
    fieldDescMap.put("MSH-12-2-1", "Version ID - Internationalization Code - Identifier");
    fieldDescMap.put("IN3-14-20-2", "Physician Reviewer - Expiration Date - Degree of Precision");
    fieldDescMap.put("PV1-8-2-1", "Referring Doctor - Family Name - Surname");
    fieldDescMap.put("IN3-14-20-1", "Physician Reviewer - Expiration Date - Time");
    fieldDescMap.put("MSH-12-2-6",
        "Version ID - Internationalization Code - Name of Alternate Coding System");
    fieldDescMap.put("MSH-12-2-5", "Version ID - Internationalization Code - Alternate Text");
    fieldDescMap.put("MSH-12-2-4", "Version ID - Internationalization Code - Alternate Identifier");
    fieldDescMap.put("NK1-33-9-9",
        "Next of Kin/Associated Party's Identifiers - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("NK1-33-9-8",
        "Next of Kin/Associated Party's Identifiers - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("RXA-8-6", "Administered Dosage Form - Name of Alternate Coding System");
    fieldDescMap.put("RXA-8-5", "Administered Dosage Form - Alternate Text");
    fieldDescMap.put("RXA-8-4", "Administered Dosage Form - Alternate Identifier");
    fieldDescMap
        .put("IN2-61-4-3", "Patient Member Number - Assigning Authority - Universal ID Type");
    fieldDescMap.put("RXA-8-3", "Administered Dosage Form - Name of Coding System");
    fieldDescMap.put("RXA-8-2", "Administered Dosage Form - Text");
    fieldDescMap.put("RXA-8-1", "Administered Dosage Form - Identifier");
    fieldDescMap.put("ORC-17-1", "Entering Organization - Identifier");
    fieldDescMap.put("ORC-17-3", "Entering Organization - Name of Coding System");
    fieldDescMap.put("ORC-17-2", "Entering Organization - Text");
    fieldDescMap.put("NK1-33-9-1",
        "Next of Kin/Associated Party's Identifiers - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("ORC-17-5", "Entering Organization - Alternate Text");
    fieldDescMap.put("NK1-33-9-2",
        "Next of Kin/Associated Party's Identifiers - Assigning Jurisdiction - Text");
    fieldDescMap.put("ORC-17-4", "Entering Organization - Alternate Identifier");
    fieldDescMap.put("NK1-33-9-3",
        "Next of Kin/Associated Party's Identifiers - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("IN2-61-4-1", "Patient Member Number - Assigning Authority - Namespace ID");
    fieldDescMap.put("NK1-33-9-4",
        "Next of Kin/Associated Party's Identifiers - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("ORC-17-6", "Entering Organization - Name of Alternate Coding System");
    fieldDescMap.put("IN2-61-4-2", "Patient Member Number - Assigning Authority - Universal ID");
    fieldDescMap.put("NK1-33-9-5",
        "Next of Kin/Associated Party's Identifiers - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("NK1-33-9-6",
        "Next of Kin/Associated Party's Identifiers - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("NK1-33-9-7",
        "Next of Kin/Associated Party's Identifiers - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("SFT-6-2", "Software Install Date - Degree of Precision");
    fieldDescMap.put("SFT-6-1", "Software Install Date - Time");
    fieldDescMap.put("ORC-19-20-2", "Action By - Expiration Date - Degree of Precision");
    fieldDescMap.put("ORC-19-20-1", "Action By - Expiration Date - Time");
    fieldDescMap.put("PV1-5-10", "Preadmit Number - Assigning Agency or Department");
    fieldDescMap.put("IN1-9-1", "Group Name - Organization Name");
    fieldDescMap.put("IN1-9-2", "Group Name - Organization Name Type Code");
    fieldDescMap.put("IN1-9-3", "Group Name - ID Number");
    fieldDescMap.put("IN1-9-4", "Group Name - Check Digit");
    fieldDescMap.put("ORC-28-5", "Confidentiality Code - Alternate Text");
    fieldDescMap.put("IN3-25-1", "Second Opinion Physician - ID Number");
    fieldDescMap.put("ORC-28-4", "Confidentiality Code - Alternate Identifier");
    fieldDescMap.put("IN3-25-2", "Second Opinion Physician - Family Name");
    fieldDescMap.put("ORC-28-3", "Confidentiality Code - Name of Coding System");
    fieldDescMap.put("ORC-28-2", "Confidentiality Code - Text");
    fieldDescMap.put("ORC-28-9", "Confidentiality Code - Original Text");
    fieldDescMap.put("ORC-28-8", "Confidentiality Code - Alternate Coding System Version ID");
    fieldDescMap.put("ORC-28-7", "Confidentiality Code - Coding System Version ID");
    fieldDescMap.put("ORC-28-6", "Confidentiality Code - Name of Alternate Coding System");
    fieldDescMap.put("IN3-25-9", "Second Opinion Physician - Assigning Authority");
    fieldDescMap.put("IN3-25-7", "Second Opinion Physician - Degree (e.g., MD)");
    fieldDescMap.put("IN3-25-8", "Second Opinion Physician - Source Table");
    fieldDescMap.put("ORC-28-1", "Confidentiality Code - Identifier");
    fieldDescMap.put("IN3-25-5", "Second Opinion Physician - Suffix (e.g., JR or III)");
    fieldDescMap.put("IN3-25-6", "Second Opinion Physician - Prefix (e.g., DR)");
    fieldDescMap.put("IN3-25-3", "Second Opinion Physician - Given Name");
    fieldDescMap.put("IN3-25-4",
        "Second Opinion Physician - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("PV1-19-9", "Visit Number - Assigning Jurisdiction");
    fieldDescMap.put("PV1-19-7", "Visit Number - Effective Date");
    fieldDescMap.put("ORC-20-1", "Advanced Beneficiary Notice Code - Identifier");
    fieldDescMap.put("PV1-19-8", "Visit Number - Expiration Date");
    fieldDescMap.put("PV2-9", "Expected Discharge Date/Time");
    fieldDescMap.put("PV1-19-5", "Visit Number - Identifier Type Code");
    fieldDescMap.put("GT1-51-8", "Guarantor Employer's Organization Name - Assigning Facility");
    fieldDescMap.put("PV1-19-6", "Visit Number - Assigning Facility");
    fieldDescMap
        .put("GT1-51-9", "Guarantor Employer's Organization Name - Name Representation Code");
    fieldDescMap.put("PV1-19-3", "Visit Number - Check Digit Scheme");
    fieldDescMap.put("PV1-19-4", "Visit Number - Assigning Authority");
    fieldDescMap.put("PV2-4", "Transfer Reason");
    fieldDescMap.put("PV2-3", "Admit Reason");
    fieldDescMap.put("PV2-2", "Accommodation Code");
    fieldDescMap.put("PV2-1", "Prior Pending Location");
    fieldDescMap.put("IN3-2-6-2", "Certification Number - Assigning Facility - Universal ID");
    fieldDescMap.put("PV2-8", "Expected Admit Date/Time");
    fieldDescMap.put("IN3-2-6-1", "Certification Number - Assigning Facility - Namespace ID");
    fieldDescMap.put("PV2-7", "Visit User Code");
    fieldDescMap.put("PV2-6", "Patient Valuables Location");
    fieldDescMap.put("IN3-2-6-3", "Certification Number - Assigning Facility - Universal ID Type");
    fieldDescMap.put("PV2-5", "Patient Valuables");
    fieldDescMap.put("NK1-12-10-7",
        "Next of Kin / Associated Parties Employee Number - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("PV2-41-5", "Precaution Code - Alternate Text");
    fieldDescMap.put("NK1-12-10-8",
        "Next of Kin / Associated Parties Employee Number - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("PV2-41-6", "Precaution Code - Name of Alternate Coding System");
    fieldDescMap.put("NK1-12-10-9",
        "Next of Kin / Associated Parties Employee Number - Assigning Agency or Department - Original Text");
    fieldDescMap.put("PV2-41-3", "Precaution Code - Name of Coding System");
    fieldDescMap.put("PV2-41-4", "Precaution Code - Alternate Identifier");
    fieldDescMap.put("NK1-12-10-3",
        "Next of Kin / Associated Parties Employee Number - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("PV2-41-1", "Precaution Code - Identifier");
    fieldDescMap.put("PV2-0", "Patient Visit - Additional Information");
    fieldDescMap.put("NK1-12-10-4",
        "Next of Kin / Associated Parties Employee Number - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("PV2-41-2", "Precaution Code - Text");
    fieldDescMap.put("NK1-12-10-5",
        "Next of Kin / Associated Parties Employee Number - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("NK1-12-10-6",
        "Next of Kin / Associated Parties Employee Number - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("TQ1-2-2-5", "Quantity - Units - Alternate Text");
    fieldDescMap.put("PV1-19-2", "Visit Number - Check Digit");
    fieldDescMap.put("GT1-51-5", "Guarantor Employer's Organization Name - Check Digit Scheme");
    fieldDescMap.put("TQ1-2-2-6", "Quantity - Units - Name of Alternate Coding System");
    fieldDescMap
        .put("ORC-20-6", "Advanced Beneficiary Notice Code - Name of Alternate Coding System");
    fieldDescMap.put("PV1-19-1", "Visit Number - ID Number");
    fieldDescMap.put("GT1-51-4", "Guarantor Employer's Organization Name - Check Digit");
    fieldDescMap.put("TQ1-2-2-3", "Quantity - Units - Name of Coding System");
    fieldDescMap.put("NK1-12-10-1",
        "Next of Kin / Associated Parties Employee Number - Assigning Agency or Department - Identifier");
    fieldDescMap.put("GT1-51-7", "Guarantor Employer's Organization Name - Identifier Type Code");
    fieldDescMap.put("TQ1-2-2-4", "Quantity - Units - Alternate Identifier");
    fieldDescMap.put("NK1-12-10-2",
        "Next of Kin / Associated Parties Employee Number - Assigning Agency or Department - Text");
    fieldDescMap.put("GT1-51-6", "Guarantor Employer's Organization Name - Assigning Authority");
    fieldDescMap.put("TQ1-2-2-1", "Quantity - Units - Identifier");
    fieldDescMap.put("ORC-20-3", "Advanced Beneficiary Notice Code - Name of Coding System");
    fieldDescMap.put("GT1-51-1", "Guarantor Employer's Organization Name - Organization Name");
    fieldDescMap.put("TQ1-2-2-2", "Quantity - Units - Text");
    fieldDescMap.put("ORC-20-2", "Advanced Beneficiary Notice Code - Text");
    fieldDescMap.put("ORC-20-5", "Advanced Beneficiary Notice Code - Alternate Text");
    fieldDescMap.put("GT1-51-3", "Guarantor Employer's Organization Name - ID Number");
    fieldDescMap.put("ORC-20-4", "Advanced Beneficiary Notice Code - Alternate Identifier");
    fieldDescMap
        .put("GT1-51-2", "Guarantor Employer's Organization Name - Organization Name Type Code");
    fieldDescMap.put("PD1-4-16-4",
        "Patient Primary Care Provider Name & ID No. - Name Context - Alternate Identifier");
    fieldDescMap.put("PD1-4-16-3",
        "Patient Primary Care Provider Name & ID No. - Name Context - Name of Coding System");
    fieldDescMap.put("PD1-4-16-6",
        "Patient Primary Care Provider Name & ID No. - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("PD1-4-16-5",
        "Patient Primary Care Provider Name & ID No. - Name Context - Alternate Text");
    fieldDescMap
        .put("PD1-4-16-2", "Patient Primary Care Provider Name & ID No. - Name Context - Text");
    fieldDescMap.put("PD1-4-16-1",
        "Patient Primary Care Provider Name & ID No. - Name Context - Identifier");
    fieldDescMap.put("ORC-13-11-3",
        "Enterer's Location - Assigning Authority for Location - Universal ID Type");
    fieldDescMap
        .put("ORC-13-11-2", "Enterer's Location - Assigning Authority for Location - Universal ID");
    fieldDescMap
        .put("ORC-13-11-1", "Enterer's Location - Assigning Authority for Location - Namespace ID");
    fieldDescMap.put("PV1-52-23", "Other Healthcare Provider - Assigning Agency or Department");
    fieldDescMap.put("PV1-52-22", "Other Healthcare Provider - Assigning Jurisdiction");
    fieldDescMap.put("PV1-52-21", "Other Healthcare Provider - Professional Suffix");
    fieldDescMap.put("PV1-52-20", "Other Healthcare Provider - Expiration Date");
    fieldDescMap
        .put("PID-3-6-3", "Patient Identifier List - Assigning Facility - Universal ID Type");
    fieldDescMap.put("PV2-1-10-2",
        "Prior Pending Location - Comprehensive Location Identifier - Namespace ID");
    fieldDescMap.put("PV2-1-10-1",
        "Prior Pending Location - Comprehensive Location Identifier - Entity Identifier");
    fieldDescMap.put("PV2-1-10-4",
        "Prior Pending Location - Comprehensive Location Identifier - Universal ID Type");
    fieldDescMap.put("PV2-1-10-3",
        "Prior Pending Location - Comprehensive Location Identifier - Universal ID");
    fieldDescMap.put("RXR-1-3", "Route - Name of Coding System");
    fieldDescMap.put("RXR-1-4", "Route - Alternate Identifier");
    fieldDescMap.put("RXR-1-1", "Route - Identifier");
    fieldDescMap.put("RXR-1-2", "Route - Text");
    fieldDescMap.put("RXR-1-5", "Route - Alternate Text");
    fieldDescMap.put("RXR-1-6", "Route - Name of Alternate Coding System");
    fieldDescMap.put("GT1-18-2", "Guarantor Employer Phone Number - Telecommunication Use Code");
    fieldDescMap.put("GT1-18-1", "Guarantor Employer Phone Number - Telephone Number");
    fieldDescMap.put("GT1-18-4", "Guarantor Employer Phone Number - Email Address");
    fieldDescMap
        .put("GT1-18-3", "Guarantor Employer Phone Number - Telecommunication Equipment Type");
    fieldDescMap.put("GT1-18-9", "Guarantor Employer Phone Number - Any Text");
    fieldDescMap.put("MSH-12-2", "Version ID - Internationalization Code");
    fieldDescMap.put("GT1-18-6", "Guarantor Employer Phone Number - Area/City Code");
    fieldDescMap.put("TQ1-9", "Priority");
    fieldDescMap.put("MSH-12-1", "Version ID - Version ID");
    fieldDescMap.put("GT1-18-5", "Guarantor Employer Phone Number - Country Code");
    fieldDescMap.put("GT1-18-8", "Guarantor Employer Phone Number - Extension");
    fieldDescMap.put("MSH-12-3", "Version ID - International Version ID");
    fieldDescMap.put("GT1-18-7", "Guarantor Employer Phone Number - Local Number");
    fieldDescMap.put("PV2-48-1", "Expected Pre-admission Testing Date/Time - Time");
    fieldDescMap.put("PV2-48-2", "Expected Pre-admission Testing Date/Time - Degree of Precision");
    fieldDescMap.put("PID-3-6-1", "Patient Identifier List - Assigning Facility - Namespace ID");
    fieldDescMap.put("PID-3-6-2", "Patient Identifier List - Assigning Facility - Universal ID");
    fieldDescMap.put("TQ1-6-2-4", "Service Duration - Units - Alternate Identifier");
    fieldDescMap
        .put("IN2-25-10-3", "Payor ID - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("TQ1-6-2-3", "Service Duration - Units - Name of Coding System");
    fieldDescMap.put("IN2-25-10-2", "Payor ID - Assigning Agency or Department - Text");
    fieldDescMap.put("TQ1-6-2-6", "Service Duration - Units - Name of Alternate Coding System");
    fieldDescMap.put("IN2-25-10-1", "Payor ID - Assigning Agency or Department - Identifier");
    fieldDescMap.put("TQ1-6-2-5", "Service Duration - Units - Alternate Text");
    fieldDescMap.put("TQ1-6-2-2", "Service Duration - Units - Text");
    fieldDescMap.put("TQ1-6-2-1", "Service Duration - Units - Identifier");
    fieldDescMap.put("IN2-22-13-2",
        "Special Coverage Approval Name - Expiration Date - Degree of Precision");
    fieldDescMap.put("IN2-22-13-1", "Special Coverage Approval Name - Expiration Date - Time");
    fieldDescMap.put("IN2-25-10-6",
        "Payor ID - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap
        .put("IN2-25-10-7", "Payor ID - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap
        .put("IN2-25-10-4", "Payor ID - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("IN2-25-10-5", "Payor ID - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("IN2-25-10-8",
        "Payor ID - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("IN2-25-10-9", "Payor ID - Assigning Agency or Department - Original Text");
    fieldDescMap.put("IN1-49-1", "Insured's ID Number - ID Number");
    fieldDescMap.put("IN1-49-2", "Insured's ID Number - Check Digit");
    fieldDescMap.put("IN1-49-5", "Insured's ID Number - Identifier Type Code");
    fieldDescMap.put("IN1-49-6", "Insured's ID Number - Assigning Facility");
    fieldDescMap.put("IN1-49-3", "Insured's ID Number - Check Digit Scheme");
    fieldDescMap.put("IN1-49-4", "Insured's ID Number - Assigning Authority");
    fieldDescMap.put("PD1-14-2", "Place of Worship - Organization Name Type Code");
    fieldDescMap.put("PD1-14-3", "Place of Worship - ID Number");
    fieldDescMap.put("PD1-14-4", "Place of Worship - Check Digit");
    fieldDescMap.put("PD1-14-5", "Place of Worship - Check Digit Scheme");
    fieldDescMap.put("PD1-14-6", "Place of Worship - Assigning Authority");
    fieldDescMap.put("SFT-6", "Software Install Date");
    fieldDescMap.put("PD1-14-7", "Place of Worship - Identifier Type Code");
    fieldDescMap.put("SFT-5", "Software Product Information");
    fieldDescMap.put("PD1-14-8", "Place of Worship - Assigning Facility");
    fieldDescMap.put("SFT-4", "Software Binary ID");
    fieldDescMap.put("PD1-14-9", "Place of Worship - Name Representation Code");
    fieldDescMap.put("SFT-3", "Software Product Name");
    fieldDescMap.put("SFT-2", "Software Certified Version or Release Number");
    fieldDescMap.put("IN1-49-9", "Insured's ID Number - Assigning Jurisdiction");
    fieldDescMap.put("SFT-1", "Software Vendor Organization");
    fieldDescMap.put("IN1-49-8", "Insured's ID Number - Expiration Date");
    fieldDescMap.put("SFT-0", "Software Segment");
    fieldDescMap.put("IN1-49-7", "Insured's ID Number - Effective Date");
    fieldDescMap.put("PD1-14-1", "Place of Worship - Organization Name");
    fieldDescMap.put("PID-38", "Production Class Code");
    fieldDescMap.put("PID-37", "Strain");
    fieldDescMap.put("PID-36", "Breed Code");
    fieldDescMap.put("PID-35", "Species Code");
    fieldDescMap.put("PID-34", "Last Update Facility");
    fieldDescMap.put("PID-33", "Last Update Date/Time");
    fieldDescMap.put("PID-32", "Identity Reliability Code");
    fieldDescMap.put("PID-31", "Identity Unknown Indicator");
    fieldDescMap.put("PID-39", "Tribal Citizenship");
    fieldDescMap.put("PD1-9", "Separate Bill");
    fieldDescMap.put("PD1-8", "Organ Donor Code");
    fieldDescMap.put("PD1-1", "Living Dependency");
    fieldDescMap.put("PD1-0", "Additional Demographic");
    fieldDescMap.put("PD1-3", "Patient Primary Facility");
    fieldDescMap.put("PD1-2", "Living Arrangement");
    fieldDescMap.put("PD1-5", "Student Indicator");
    fieldDescMap.put("PD1-4", "Patient Primary Care Provider Name & ID No.");
    fieldDescMap.put("PD1-7", "Living Will Code");
    fieldDescMap.put("PD1-6", "Handicap");
    fieldDescMap.put("PV1-44-1", "Admit Date/Time - Time");
    fieldDescMap.put("PV1-44-2", "Admit Date/Time - Degree of Precision");
    fieldDescMap.put("PV1-11-4-2", "Temporary Location - Facility - Universal ID");
    fieldDescMap.put("PV1-11-4-3", "Temporary Location - Facility - Universal ID Type");
    fieldDescMap.put("PV1-11-4-1", "Temporary Location - Facility - Namespace ID");
    fieldDescMap.put("IN3-14-14-3", "Physician Reviewer - Assigning Facility - Universal ID Type");
    fieldDescMap.put("IN3-14-14-2", "Physician Reviewer - Assigning Facility - Universal ID");
    fieldDescMap.put("IN3-14-14-1", "Physician Reviewer - Assigning Facility - Namespace ID");
    fieldDescMap.put("PD1-3-4", "Patient Primary Facility - Check Digit");
    fieldDescMap.put("IN1-30-5", "Verification By - Suffix (e.g., JR or III)");
    fieldDescMap.put("IN1-30-14-2", "Verification By - Assigning Facility - Universal ID");
    fieldDescMap.put("PD1-3-5", "Patient Primary Facility - Check Digit Scheme");
    fieldDescMap
        .put("GT1-26-6", "Guarantor Charge Adjustment Code - Name of Alternate Coding System");
    fieldDescMap.put("IN1-30-6", "Verification By - Prefix (e.g., DR)");
    fieldDescMap.put("IN1-30-14-1", "Verification By - Assigning Facility - Namespace ID");
    fieldDescMap.put("PD1-3-2", "Patient Primary Facility - Organization Name Type Code");
    fieldDescMap.put("GT1-26-5", "Guarantor Charge Adjustment Code - Alternate Text");
    fieldDescMap.put("IN1-30-3", "Verification By - Given Name");
    fieldDescMap.put("ORC-19-14-1", "Action By - Assigning Facility - Namespace ID");
    fieldDescMap.put("PD1-3-3", "Patient Primary Facility - ID Number");
    fieldDescMap.put("GT1-26-4", "Guarantor Charge Adjustment Code - Alternate Identifier");
    fieldDescMap
        .put("IN1-30-4", "Verification By - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("PD1-3-8", "Patient Primary Facility - Assigning Facility");
    fieldDescMap.put("GT1-26-3", "Guarantor Charge Adjustment Code - Name of Coding System");
    fieldDescMap.put("IN1-30-1", "Verification By - ID Number");
    fieldDescMap.put("PD1-3-9", "Patient Primary Facility - Name Representation Code");
    fieldDescMap.put("GT1-26-2", "Guarantor Charge Adjustment Code - Text");
    fieldDescMap.put("IN1-30-2", "Verification By - Family Name");
    fieldDescMap.put("PD1-3-6", "Patient Primary Facility - Assigning Authority");
    fieldDescMap.put("GT1-26-1", "Guarantor Charge Adjustment Code - Identifier");
    fieldDescMap.put("PD1-3-7", "Patient Primary Facility - Identifier Type Code");
    fieldDescMap.put("IN1-30-9", "Verification By - Assigning Authority");
    fieldDescMap.put("PD1-3-1", "Patient Primary Facility - Organization Name");
    fieldDescMap.put("IN1-30-7", "Verification By - Degree (e.g., MD)");
    fieldDescMap.put("IN1-30-8", "Verification By - Source Table");
    fieldDescMap.put("IN1-30-14-3", "Verification By - Assigning Facility - Universal ID Type");
    fieldDescMap
        .put("NK1-12-8", "Next of Kin / Associated Parties Employee Number - Expiration Date");
    fieldDescMap
        .put("NK1-12-7", "Next of Kin / Associated Parties Employee Number - Effective Date");
    fieldDescMap.put("NK1-12-9",
        "Next of Kin / Associated Parties Employee Number - Assigning Jurisdiction");
    fieldDescMap.put("PV1-43-10-1",
        "Prior Temporary Location - Comprehensive Location Identifier - Entity Identifier");
    fieldDescMap
        .put("NK1-12-4", "Next of Kin / Associated Parties Employee Number - Assigning Authority");
    fieldDescMap
        .put("NK1-12-3", "Next of Kin / Associated Parties Employee Number - Check Digit Scheme");
    fieldDescMap
        .put("NK1-12-6", "Next of Kin / Associated Parties Employee Number - Assigning Facility");
    fieldDescMap
        .put("NK1-12-5", "Next of Kin / Associated Parties Employee Number - Identifier Type Code");
    fieldDescMap.put("PV1-43-10-4",
        "Prior Temporary Location - Comprehensive Location Identifier - Universal ID Type");
    fieldDescMap.put("PV1-43-10-2",
        "Prior Temporary Location - Comprehensive Location Identifier - Namespace ID");
    fieldDescMap.put("PV1-43-10-3",
        "Prior Temporary Location - Comprehensive Location Identifier - Universal ID");
    fieldDescMap.put("IN2-3-20-2",
        "Insured's Employer's Name and ID - Expiration Date - Degree of Precision");
    fieldDescMap.put("IN2-3-20-1", "Insured's Employer's Name and ID - Expiration Date - Time");
    fieldDescMap.put("ORC-10-5", "Entered By - Suffix (e.g., JR or III)");
    fieldDescMap
        .put("PV1-19-10-5", "Visit Number - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("ORC-10-6", "Entered By - Prefix (e.g., DR)");
    fieldDescMap.put("PV1-19-10-6",
        "Visit Number - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("ORC-10-7", "Entered By - Degree (e.g., MD)");
    fieldDescMap.put("PV1-19-10-3",
        "Visit Number - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("ORC-10-8", "Entered By - Source Table");
    fieldDescMap
        .put("PV1-19-10-4", "Visit Number - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("ORC-10-1", "Entered By - ID Number");
    fieldDescMap
        .put("PV1-19-10-9", "Visit Number - Assigning Agency or Department - Original Text");
    fieldDescMap.put("ORC-10-2", "Entered By - Family Name");
    fieldDescMap.put("ORC-10-3", "Entered By - Given Name");
    fieldDescMap.put("PV1-19-10-7",
        "Visit Number - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("ORC-10-4", "Entered By - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("PV1-19-10-8",
        "Visit Number - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("IN2-9-13-2", "Military Sponsor Name - Expiration Date - Degree of Precision");
    fieldDescMap.put("IN2-9-13-1", "Military Sponsor Name - Expiration Date - Time");
    fieldDescMap.put("ORC-10-9", "Entered By - Assigning Authority");
    fieldDescMap.put("PV1-19-10-1", "Visit Number - Assigning Agency or Department - Identifier");
    fieldDescMap.put("PV1-19-10-2", "Visit Number - Assigning Agency or Department - Text");
    fieldDescMap.put("NK1-12-1", "Next of Kin / Associated Parties Employee Number - ID Number");
    fieldDescMap.put("NK1-12-2", "Next of Kin / Associated Parties Employee Number - Check Digit");
    fieldDescMap.put("TQ2-3-3", "Related Placer Number - Universal ID");
    fieldDescMap.put("TQ2-3-2", "Related Placer Number - Namespace ID");
    fieldDescMap.put("TQ2-3-4", "Related Placer Number - Universal ID Type");
    fieldDescMap.put("NK1-22-1", "Publicity Code - Identifier");
    fieldDescMap.put("NK1-22-2", "Publicity Code - Text");
    fieldDescMap.put("NK1-22-3", "Publicity Code - Name of Coding System");
    fieldDescMap.put("NK1-19-6", "Citizenship - Name of Alternate Coding System");
    fieldDescMap.put("NK1-19-5", "Citizenship - Alternate Text");
    fieldDescMap.put("NK1-19-4", "Citizenship - Alternate Identifier");
    fieldDescMap.put("TQ2-3-1", "Related Placer Number - Entity Identifier");
    fieldDescMap.put("NK1-19-3", "Citizenship - Name of Coding System");
    fieldDescMap.put("NK1-19-2", "Citizenship - Text");
    fieldDescMap.put("NK1-19-1", "Citizenship - Identifier");
    fieldDescMap.put("GT1-45-14", "Contact Person's Name - Professional Suffix");
    fieldDescMap.put("GT1-45-13", "Contact Person's Name - Expiration Date");
    fieldDescMap.put("GT1-45-12", "Contact Person's Name - Effective Date");
    fieldDescMap.put("GT1-45-11", "Contact Person's Name - Name Assembly Order");
    fieldDescMap.put("GT1-45-10", "Contact Person's Name - Name Validity Range");
    fieldDescMap
        .put("PV1-52-9-1", "Other Healthcare Provider - Assigning Authority - Namespace ID");
    fieldDescMap.put("ORC-19-14-2", "Action By - Assigning Facility - Universal ID");
    fieldDescMap.put("ORC-19-14-3", "Action By - Assigning Facility - Universal ID Type");
    fieldDescMap.put("GT1-18-12", "Guarantor Employer Phone Number - Unformatted Telephone number");
    fieldDescMap
        .put("PV1-52-9-3", "Other Healthcare Provider - Assigning Authority - Universal ID Type");
    fieldDescMap.put("GT1-18-11", "Guarantor Employer Phone Number - Speed Dial Code");
    fieldDescMap
        .put("PV1-52-9-2", "Other Healthcare Provider - Assigning Authority - Universal ID");
    fieldDescMap.put("GT1-18-10", "Guarantor Employer Phone Number - Extension Prefix");
    fieldDescMap.put("ORC-31-9", "Parent Universal Service Identifier - Original Text");
    fieldDescMap.put("ORC-31-8",
        "Parent Universal Service Identifier - Alternate Coding System Version ID");
    fieldDescMap.put("ORC-31-7", "Parent Universal Service Identifier - Coding System Version ID");
    fieldDescMap
        .put("ORC-31-6", "Parent Universal Service Identifier - Name of Alternate Coding System");
    fieldDescMap.put("ORC-31-5", "Parent Universal Service Identifier - Alternate Text");
    fieldDescMap.put("IN2-52-8", "Insured's Contact Person's Name - Name Representation Code");
    fieldDescMap.put("ORC-31-4", "Parent Universal Service Identifier - Alternate Identifier");
    fieldDescMap.put("IN2-52-9", "Insured's Contact Person's Name - Name Context");
    fieldDescMap.put("ORC-31-3", "Parent Universal Service Identifier - Name of Coding System");
    fieldDescMap.put("ORC-31-2", "Parent Universal Service Identifier - Text");
    fieldDescMap.put("IN2-52-4", "Insured's Contact Person's Name - Suffix (e.g., JR or III)");
    fieldDescMap.put("IN2-52-5", "Insured's Contact Person's Name - Prefix (e.g., DR)");
    fieldDescMap.put("IN2-52-6", "Insured's Contact Person's Name - Degree (e.g., MD)");
    fieldDescMap.put("IN2-52-7", "Insured's Contact Person's Name - Name Type Code");
    fieldDescMap.put("GT1-24-1", "Guarantor Death Date And Time - Time");
    fieldDescMap.put("IN2-52-1", "Insured's Contact Person's Name - Family Name");
    fieldDescMap.put("IN2-52-2", "Insured's Contact Person's Name - Given Name");
    fieldDescMap.put("IN2-52-3",
        "Insured's Contact Person's Name - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("GT1-24-2", "Guarantor Death Date And Time - Degree of Precision");
    fieldDescMap
        .put("GT1-16-13-2", "Guarantor Employer Name - Expiration Date - Degree of Precision");
    fieldDescMap.put("IN1-4-6-1", "Insurance Company Name - Assigning Authority - Namespace ID");
    fieldDescMap.put("ORC-31-1", "Parent Universal Service Identifier - Identifier");
    fieldDescMap.put("IN1-4-6-2", "Insurance Company Name - Assigning Authority - Universal ID");
    fieldDescMap
        .put("IN1-4-6-3", "Insurance Company Name - Assigning Authority - Universal ID Type");
    fieldDescMap.put("GT1-16-13-1", "Guarantor Employer Name - Expiration Date - Time");
    fieldDescMap
        .put("GT1-21-8-3", "Guarantor Organization Name - Assigning Facility - Universal ID Type");
    fieldDescMap
        .put("GT1-21-8-2", "Guarantor Organization Name - Assigning Facility - Universal ID");
    fieldDescMap
        .put("GT1-21-8-1", "Guarantor Organization Name - Assigning Facility - Namespace ID");
    fieldDescMap
        .put("GT1-16-1-5", "Guarantor Employer Name - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("GT1-16-1-3", "Guarantor Employer Name - Family Name - Own Surname");
    fieldDescMap.put("GT1-16-1-4",
        "Guarantor Employer Name - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("GT1-16-1-1", "Guarantor Employer Name - Family Name - Surname");
    fieldDescMap.put("GT1-16-1-2", "Guarantor Employer Name - Family Name - Own Surname Prefix");
    fieldDescMap.put("IN2-9-2", "Military Sponsor Name - Given Name");
    fieldDescMap.put("IN2-9-3",
        "Military Sponsor Name - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("IN2-9-1", "Military Sponsor Name - Family Name");
    fieldDescMap.put("PV2-33-1", "Expected Surgery Date and Time - Time");
    fieldDescMap.put("PV2-23-10", "Clinic Organization Name - Organization Identifier");
    fieldDescMap.put("PV2-33-2", "Expected Surgery Date and Time - Degree of Precision");
    fieldDescMap.put("PV1-43-4-3", "Prior Temporary Location - Facility - Universal ID Type");
    fieldDescMap.put("PV1-43-4-1", "Prior Temporary Location - Facility - Namespace ID");
    fieldDescMap.put("PV1-43-4-2", "Prior Temporary Location - Facility - Universal ID");
    fieldDescMap
        .put("IN3-25-20-2", "Second Opinion Physician - Expiration Date - Degree of Precision");
    fieldDescMap.put("IN3-19-7", "Certification Agency Phone Number - Local Number");
    fieldDescMap.put("IN3-19-6", "Certification Agency Phone Number - Area/City Code");
    fieldDescMap.put("IN3-19-9", "Certification Agency Phone Number - Any Text");
    fieldDescMap.put("IN3-25-20-1", "Second Opinion Physician - Expiration Date - Time");
    fieldDescMap.put("IN3-19-8", "Certification Agency Phone Number - Extension");
    fieldDescMap.put("PV2-13-20-1", "Referral Source Code - Expiration Date - Time");
    fieldDescMap.put("PV2-13-20-2", "Referral Source Code - Expiration Date - Degree of Precision");
    fieldDescMap.put("IN3-19-2", "Certification Agency Phone Number - Telecommunication Use Code");
    fieldDescMap
        .put("IN3-19-3", "Certification Agency Phone Number - Telecommunication Equipment Type");
    fieldDescMap.put("IN3-19-4", "Certification Agency Phone Number - Email Address");
    fieldDescMap
        .put("GT1-4-9-6", "Guarantor Spouse Name - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("IN3-19-5", "Certification Agency Phone Number - Country Code");
    fieldDescMap.put("IN3-19-1", "Certification Agency Phone Number - Telephone Number");
    fieldDescMap.put("GT1-4-9-1", "Guarantor Spouse Name - Name Context - Identifier");
    fieldDescMap.put("GT1-4-9-3", "Guarantor Spouse Name - Name Context - Name of Coding System");
    fieldDescMap.put("GT1-4-9-2", "Guarantor Spouse Name - Name Context - Text");
    fieldDescMap.put("GT1-4-9-5", "Guarantor Spouse Name - Name Context - Alternate Text");
    fieldDescMap.put("GT1-4-9-4", "Guarantor Spouse Name - Name Context - Alternate Identifier");
    fieldDescMap.put("MSH-5-3", "Receiving Application - Universal ID Type");
    fieldDescMap.put("PID-35-3", "Species Code - Name of Coding System");
    fieldDescMap.put("PID-35-4", "Species Code - Alternate Identifier");
    fieldDescMap.put("PID-35-1", "Species Code - Identifier");
    fieldDescMap.put("PID-35-2", "Species Code - Text");
    fieldDescMap.put("PID-35-5", "Species Code - Alternate Text");
    fieldDescMap.put("MSH-5-1", "Receiving Application - Namespace ID");
    fieldDescMap.put("PID-35-6", "Species Code - Name of Alternate Coding System");
    fieldDescMap.put("MSH-5-2", "Receiving Application - Universal ID");
    fieldDescMap.put("IN3-2-1", "Certification Number - ID Number");
    fieldDescMap.put("IN3-2-8", "Certification Number - Expiration Date");
    fieldDescMap.put("IN3-2-9", "Certification Number - Assigning Jurisdiction");
    fieldDescMap.put("IN3-2-6", "Certification Number - Assigning Facility");
    fieldDescMap.put("IN3-2-7", "Certification Number - Effective Date");
    fieldDescMap.put("IN3-2-4", "Certification Number - Assigning Authority");
    fieldDescMap.put("IN3-2-5", "Certification Number - Identifier Type Code");
    fieldDescMap.put("IN3-2-2", "Certification Number - Check Digit");
    fieldDescMap.put("IN3-2-3", "Certification Number - Check Digit Scheme");
    fieldDescMap
        .put("IN2-3-14-1", "Insured's Employer's Name and ID - Assigning Facility - Namespace ID");
    fieldDescMap
        .put("IN2-3-14-2", "Insured's Employer's Name and ID - Assigning Facility - Universal ID");
    fieldDescMap.put("IN2-3-14-3",
        "Insured's Employer's Name and ID - Assigning Facility - Universal ID Type");
    fieldDescMap.put("PID-11-14", "Patient Address - Expiration Date");
    fieldDescMap.put("PID-11-13", "Patient Address - Effective Date");
    fieldDescMap.put("PID-11-12", "Patient Address - Address Validity Range");
    fieldDescMap.put("PID-11-11", "Patient Address - Address Representation Code");
    fieldDescMap.put("PID-11-10", "Patient Address - Census Tract");
    fieldDescMap.put("GT1-5-1-2", "Guarantor Address - Street Address - Street Name");
    fieldDescMap.put("ORC-10-20-2", "Entered By - Expiration Date - Degree of Precision");
    fieldDescMap.put("GT1-5-1-1", "Guarantor Address - Street Address - Street or Mailing Address");
    fieldDescMap.put("GT1-5-1-3", "Guarantor Address - Street Address - Dwelling Number");
    fieldDescMap.put("ORC-10-20-1", "Entered By - Expiration Date - Time");
    fieldDescMap.put("OBX-16-21", "Responsible Observer - Professional Suffix");
    fieldDescMap.put("IN3-25-23", "Second Opinion Physician - Assigning Agency or Department");
    fieldDescMap.put("PID-30", "Patient Death Indicator");
    fieldDescMap.put("OBX-16-20", "Responsible Observer - Expiration Date");
    fieldDescMap.put("IN3-25-20", "Second Opinion Physician - Expiration Date");
    fieldDescMap.put("IN3-25-21", "Second Opinion Physician - Professional Suffix");
    fieldDescMap.put("IN3-25-22", "Second Opinion Physician - Assigning Jurisdiction");
    fieldDescMap.put("PD1-4-2", "Patient Primary Care Provider Name & ID No. - Family Name");
    fieldDescMap.put("PD1-4-1", "Patient Primary Care Provider Name & ID No. - ID Number");
    fieldDescMap.put("PD1-4-4",
        "Patient Primary Care Provider Name & ID No. - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("IN2-26-9", "Payor Subscriber ID - Assigning Jurisdiction");
    fieldDescMap.put("PD1-4-3", "Patient Primary Care Provider Name & ID No. - Given Name");
    fieldDescMap.put("PD1-4-6", "Patient Primary Care Provider Name & ID No. - Prefix (e.g., DR)");
    fieldDescMap
        .put("PD1-4-5", "Patient Primary Care Provider Name & ID No. - Suffix (e.g., JR or III)");
    fieldDescMap.put("PD1-4-8", "Patient Primary Care Provider Name & ID No. - Source Table");
    fieldDescMap.put("PD1-4-7", "Patient Primary Care Provider Name & ID No. - Degree (e.g., MD)");
    fieldDescMap
        .put("PD1-4-9", "Patient Primary Care Provider Name & ID No. - Assigning Authority");
    fieldDescMap.put("IN2-26-4", "Payor Subscriber ID - Assigning Authority");
    fieldDescMap.put("IN2-26-3", "Payor Subscriber ID - Check Digit Scheme");
    fieldDescMap.put("IN2-26-2", "Payor Subscriber ID - Check Digit");
    fieldDescMap.put("IN2-26-1", "Payor Subscriber ID - ID Number");
    fieldDescMap
        .put("IN3-25-16-4", "Second Opinion Physician - Name Context - Alternate Identifier");
    fieldDescMap.put("PV2-2-5", "Accommodation Code - Alternate Text");
    fieldDescMap.put("IN2-26-8", "Payor Subscriber ID - Expiration Date");
    fieldDescMap
        .put("IN3-25-16-3", "Second Opinion Physician - Name Context - Name of Coding System");
    fieldDescMap.put("PV2-2-4", "Accommodation Code - Alternate Identifier");
    fieldDescMap.put("IN2-26-7", "Payor Subscriber ID - Effective Date");
    fieldDescMap.put("OBX-16-19", "Responsible Observer - Effective Date");
    fieldDescMap.put("IN3-25-16-2", "Second Opinion Physician - Name Context - Text");
    fieldDescMap.put("PID-28", "Nationality");
    fieldDescMap.put("IN2-26-6", "Payor Subscriber ID - Assigning Facility");
    fieldDescMap.put("IN3-25-16-1", "Second Opinion Physician - Name Context - Identifier");
    fieldDescMap.put("PV2-2-6", "Accommodation Code - Name of Alternate Coding System");
    fieldDescMap.put("PID-29", "Patient Death Date and Time");
    fieldDescMap.put("IN2-26-5", "Payor Subscriber ID - Identifier Type Code");
    fieldDescMap.put("OBX-16-17", "Responsible Observer - Name Validity Range");
    fieldDescMap.put("PV2-2-1", "Accommodation Code - Identifier");
    fieldDescMap.put("PID-26", "Citizenship");
    fieldDescMap.put("IN2-9-8", "Military Sponsor Name - Name Representation Code");
    fieldDescMap.put("OBX-16-18", "Responsible Observer - Name Assembly Order");
    fieldDescMap.put("PID-27", "Veterans Military Status");
    fieldDescMap.put("IN2-9-9", "Military Sponsor Name - Name Context");
    fieldDescMap.put("OBX-16-15", "Responsible Observer - Name Representation Code");
    fieldDescMap.put("IN3-25-16-6",
        "Second Opinion Physician - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("PV2-2-3", "Accommodation Code - Name of Coding System");
    fieldDescMap.put("PID-24", "Multiple Birth Indicator");
    fieldDescMap.put("OBX-16-16", "Responsible Observer - Name Context");
    fieldDescMap.put("IN3-25-16-5", "Second Opinion Physician - Name Context - Alternate Text");
    fieldDescMap.put("PV2-2-2", "Accommodation Code - Text");
    fieldDescMap.put("PID-25", "Birth Order");
    fieldDescMap.put("OBX-16-13", "Responsible Observer - Identifier Type Code");
    fieldDescMap.put("PID-22", "Ethnic Group");
    fieldDescMap.put("IN2-9-4", "Military Sponsor Name - Suffix (e.g., JR or III)");
    fieldDescMap.put("OBX-16-14", "Responsible Observer - Assigning Facility");
    fieldDescMap.put("PID-23", "Birth Place");
    fieldDescMap.put("IN2-9-5", "Military Sponsor Name - Prefix (e.g., DR)");
    fieldDescMap.put("OBX-16-11", "Responsible Observer - Identifier Check Digit");
    fieldDescMap.put("PID-20", "Driver's License Number - Patient");
    fieldDescMap.put("IN2-9-6", "Military Sponsor Name - Degree (e.g., MD)");
    fieldDescMap.put("OBX-16-12", "Responsible Observer - Check Digit Scheme");
    fieldDescMap.put("PID-21", "Mother's Identifier");
    fieldDescMap.put("IN2-9-7", "Military Sponsor Name - Name Type Code");
    fieldDescMap.put("IN3-25-14", "Second Opinion Physician - Assigning Facility");
    fieldDescMap.put("IN3-25-15", "Second Opinion Physician - Name Representation Code");
    fieldDescMap.put("OBX-16-10", "Responsible Observer - Name Type Code");
    fieldDescMap.put("IN3-25-12", "Second Opinion Physician - Check Digit Scheme");
    fieldDescMap.put("IN3-25-13", "Second Opinion Physician - Identifier Type Code");
    fieldDescMap.put("IN3-25-10", "Second Opinion Physician - Name Type Code");
    fieldDescMap.put("IN3-25-11", "Second Opinion Physician - Identifier Check Digit");
    fieldDescMap.put("PID-6-9", "Mother's Maiden Name - Name Context");
    fieldDescMap.put("OBX-23-5", "Performing Organization Name - Check Digit Scheme");
    fieldDescMap.put("OBX-23-4", "Performing Organization Name - Check Digit");
    fieldDescMap.put("OBX-23-7", "Performing Organization Name - Identifier Type Code");
    fieldDescMap.put("OBX-23-6", "Performing Organization Name - Assigning Authority");
    fieldDescMap.put("OBX-23-9", "Performing Organization Name - Name Representation Code");
    fieldDescMap.put("OBX-23-8", "Performing Organization Name - Assigning Facility");
    fieldDescMap.put("PID-17", "Religion");
    fieldDescMap.put("OBX-23-1", "Performing Organization Name - Organization Name");
    fieldDescMap.put("PID-18", "Patient Account Number");
    fieldDescMap.put("OBX-23-2", "Performing Organization Name - Organization Name Type Code");
    fieldDescMap.put("PID-19", "SSN Number - Patient");
    fieldDescMap.put("OBX-23-3", "Performing Organization Name - ID Number");
    fieldDescMap.put("PID-13", "Phone Number - Home");
    fieldDescMap.put("PID-14", "Phone Number - Business");
    fieldDescMap.put("PID-15", "Primary Language");
    fieldDescMap.put("PID-16", "Marital Status");
    fieldDescMap.put("IN3-25-19", "Second Opinion Physician - Effective Date");
    fieldDescMap.put("IN3-25-18", "Second Opinion Physician - Name Assembly Order");
    fieldDescMap.put("PID-10", "Race");
    fieldDescMap.put("IN3-25-17", "Second Opinion Physician - Name Validity Range");
    fieldDescMap.put("PID-11", "Patient Address");
    fieldDescMap.put("IN3-25-16", "Second Opinion Physician - Name Context");
    fieldDescMap.put("PID-12", "County Code");
    fieldDescMap.put("PID-6-4", "Mother's Maiden Name - Suffix (e.g., JR or III)");
    fieldDescMap.put("IN2-0", "Insurance Additional Information");
    fieldDescMap.put("PID-6-3",
        "Mother's Maiden Name - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("IN2-1", "Insured's Employee ID");
    fieldDescMap.put("PID-6-2", "Mother's Maiden Name - Given Name");
    fieldDescMap.put("IN2-2", "Insured's Social Security Number");
    fieldDescMap.put("PID-6-1", "Mother's Maiden Name - Family Name");
    fieldDescMap.put("IN2-3", "Insured's Employer's Name and ID");
    fieldDescMap.put("PID-6-8", "Mother's Maiden Name - Name Representation Code");
    fieldDescMap.put("IN2-4", "Employer Information Data");
    fieldDescMap.put("OBX-14-2", "Date/Time of the Observation - Degree of Precision");
    fieldDescMap.put("PID-6-7", "Mother's Maiden Name - Name Type Code");
    fieldDescMap.put("IN2-5", "Mail Claim Party");
    fieldDescMap.put("PID-6-6", "Mother's Maiden Name - Degree (e.g., MD)");
    fieldDescMap.put("IN2-6", "Medicare Health Ins Card Number");
    fieldDescMap.put("PID-6-5", "Mother's Maiden Name - Prefix (e.g., DR)");
    fieldDescMap.put("IN2-7", "Medicaid Case Name");
    fieldDescMap.put("PV1-17-22-6",
        "Admitting Doctor - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("PV1-17-16-2", "Admitting Doctor - Name Context - Text");
    fieldDescMap.put("IN2-8", "Medicaid Case Number");
    fieldDescMap
        .put("PV1-17-22-7", "Admitting Doctor - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("PV1-17-16-1", "Admitting Doctor - Name Context - Identifier");
    fieldDescMap.put("IN2-9", "Military Sponsor Name");
    fieldDescMap
        .put("PV1-17-22-4", "Admitting Doctor - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("PV1-17-22-5", "Admitting Doctor - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("PV1-17-22-2", "Admitting Doctor - Assigning Jurisdiction - Text");
    fieldDescMap.put("NK1-4-14-2", "Address - Expiration Date - Degree of Precision");
    fieldDescMap.put("ORC-12-23", "Ordering Provider - Assigning Agency or Department");
    fieldDescMap
        .put("PV1-17-22-3", "Admitting Doctor - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("PV1-17-22-1", "Admitting Doctor - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("NK1-4-14-1", "Address - Expiration Date - Time");
    fieldDescMap.put("PV1-17-16-5", "Admitting Doctor - Name Context - Alternate Text");
    fieldDescMap
        .put("PV1-17-16-6", "Admitting Doctor - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("PV1-17-22-9", "Admitting Doctor - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("PV1-17-16-3", "Admitting Doctor - Name Context - Name of Coding System");
    fieldDescMap.put("PV1-17-22-8",
        "Admitting Doctor - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("PV1-17-16-4", "Admitting Doctor - Name Context - Alternate Identifier");
    fieldDescMap.put("OBX-14-1", "Date/Time of the Observation - Time");
    fieldDescMap.put("IN1-3-4-1", "Insurance Company ID - Assigning Authority - Namespace ID");
    fieldDescMap.put("IN1-3-4-2", "Insurance Company ID - Assigning Authority - Universal ID");
    fieldDescMap.put("IN1-3-4-3", "Insurance Company ID - Assigning Authority - Universal ID Type");
    fieldDescMap.put("ORC-12-19", "Ordering Provider - Effective Date");
    fieldDescMap.put("PV1-8-16-4", "Referring Doctor - Name Context - Alternate Identifier");
    fieldDescMap.put("ORC-12-18", "Ordering Provider - Name Assembly Order");
    fieldDescMap.put("PV1-8-16-3", "Referring Doctor - Name Context - Name of Coding System");
    fieldDescMap.put("ORC-12-17", "Ordering Provider - Name Validity Range");
    fieldDescMap.put("PV1-8-16-2", "Referring Doctor - Name Context - Text");
    fieldDescMap.put("ORC-12-16", "Ordering Provider - Name Context");
    fieldDescMap.put("PV1-8-16-1", "Referring Doctor - Name Context - Identifier");
    fieldDescMap.put("ORC-12-15", "Ordering Provider - Name Representation Code");
    populateFieldDescriptions4();
  }

  public void populateFieldDescriptions4() {
    fieldDescMap.put("GT1-45-1", "Contact Person's Name - Family Name");
    fieldDescMap.put("ORC-12-14", "Ordering Provider - Assigning Facility");
    fieldDescMap.put("GT1-45-2", "Contact Person's Name - Given Name");
    fieldDescMap.put("ORC-12-13", "Ordering Provider - Identifier Type Code");
    fieldDescMap
        .put("PV1-8-16-6", "Referring Doctor - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("ORC-12-12", "Ordering Provider - Check Digit Scheme");
    fieldDescMap.put("PV1-8-16-5", "Referring Doctor - Name Context - Alternate Text");
    fieldDescMap.put("ORC-12-21", "Ordering Provider - Professional Suffix");
    fieldDescMap.put("GT1-45-6", "Contact Person's Name - Degree (e.g., MD)");
    fieldDescMap.put("ORC-12-22", "Ordering Provider - Assigning Jurisdiction");
    fieldDescMap.put("GT1-45-5", "Contact Person's Name - Prefix (e.g., DR)");
    fieldDescMap.put("GT1-45-4", "Contact Person's Name - Suffix (e.g., JR or III)");
    fieldDescMap.put("ORC-12-20", "Ordering Provider - Expiration Date");
    fieldDescMap.put("GT1-45-3",
        "Contact Person's Name - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("GT1-45-9", "Contact Person's Name - Name Context");
    fieldDescMap.put("GT1-45-8", "Contact Person's Name - Name Representation Code");
    fieldDescMap.put("GT1-45-7", "Contact Person's Name - Name Type Code");
    fieldDescMap.put("GT1-42-13-2", "Mother's Maiden Name - Expiration Date - Degree of Precision");
    fieldDescMap.put("GT1-42-13-1", "Mother's Maiden Name - Expiration Date - Time");
    fieldDescMap
        .put("RXA-10-22-5", "Administering Provider - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("RXA-10-22-6",
        "Administering Provider - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("RXA-10-22-7",
        "Administering Provider - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("RXA-10-22-8",
        "Administering Provider - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("RXA-10-22-1", "Administering Provider - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("RXA-10-22-2", "Administering Provider - Assigning Jurisdiction - Text");
    fieldDescMap.put("RXA-10-22-3",
        "Administering Provider - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("RXA-10-22-4",
        "Administering Provider - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap
        .put("RXA-10-22-9", "Administering Provider - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("MSH-20", "Alternate Character Set Handling Scheme");
    fieldDescMap.put("NK1-5-7", "Phone Number - Local Number");
    fieldDescMap.put("NK1-5-8", "Phone Number - Extension");
    fieldDescMap.put("TQ1-0", "Timing/Quantity");
    fieldDescMap.put("NK1-5-5", "Phone Number - Country Code");
    fieldDescMap.put("MSH-21", "Message Profile Identifier");
    fieldDescMap.put("NK1-5-6", "Phone Number - Area/City Code");
    fieldDescMap.put("NK1-5-3", "Phone Number - Telecommunication Equipment Type");
    fieldDescMap.put("NK1-5-4", "Phone Number - Email Address");
    fieldDescMap.put("NK1-5-1", "Phone Number - Telephone Number");
    fieldDescMap.put("NK1-5-2", "Phone Number - Telecommunication Use Code");
    fieldDescMap.put("TQ1-6", "Service Duration");
    fieldDescMap.put("TQ1-5", "Relative Time and Units");
    fieldDescMap.put("TQ1-8", "End date/time");
    fieldDescMap.put("TQ1-7", "Start date/time");
    fieldDescMap.put("TQ1-2", "Quantity");
    fieldDescMap.put("TQ1-1", "Set ID - TQ1");
    fieldDescMap.put("TQ1-4", "Explicit Time");
    fieldDescMap.put("NK1-5-9", "Phone Number - Any Text");
    fieldDescMap.put("TQ1-3", "Repeat Pattern");
    fieldDescMap.put("IN1-6-13-1", "Insurance Co Contact Person - Expiration Date - Time");
    fieldDescMap
        .put("IN1-6-13-2", "Insurance Co Contact Person - Expiration Date - Degree of Precision");
    fieldDescMap.put("MSH-14", "Continuation Pointer");
    fieldDescMap.put("MSH-15", "Accept Acknowledgment Type");
    fieldDescMap.put("MSH-12", "Version ID");
    fieldDescMap.put("MSH-13", "Sequence Number");
    fieldDescMap.put("MSH-10", "Message Control ID");
    fieldDescMap.put("MSH-11", "Processing ID");
    fieldDescMap.put("IN1-19-14-2", "Insured's Address - Expiration Date - Degree of Precision");
    fieldDescMap.put("MSH-19", "Principal Language Of Message");
    fieldDescMap.put("MSH-18", "Character Set");
    fieldDescMap.put("IN1-19-14-1", "Insured's Address - Expiration Date - Time");
    fieldDescMap.put("MSH-17", "Country Code");
    fieldDescMap.put("MSH-16", "Application Acknowledgment Type");
    fieldDescMap.put("NK1-32-2", "Contact Person's Address - Other Designation");
    fieldDescMap.put("NK1-32-1", "Contact Person's Address - Street Address");
    fieldDescMap.put("NK1-32-4", "Contact Person's Address - State or Province");
    fieldDescMap.put("NK1-32-3", "Contact Person's Address - City");
    fieldDescMap
        .put("GT1-29-4-1", "Guarantor Employer ID Number - Assigning Authority - Namespace ID");
    fieldDescMap.put("NK1-32-9", "Contact Person's Address - County/Parish Code");
    fieldDescMap.put("PV1-52-11", "Other Healthcare Provider - Identifier Check Digit");
    fieldDescMap.put("NK1-32-7", "Contact Person's Address - Address Type");
    fieldDescMap.put("PV1-52-12", "Other Healthcare Provider - Check Digit Scheme");
    fieldDescMap.put("NK1-32-8", "Contact Person's Address - Other Geographic Designation");
    fieldDescMap.put("NK1-32-5", "Contact Person's Address - Zip or Postal Code");
    fieldDescMap
        .put("GT1-29-4-2", "Guarantor Employer ID Number - Assigning Authority - Universal ID");
    fieldDescMap.put("PV1-52-10", "Other Healthcare Provider - Name Type Code");
    fieldDescMap.put("NK1-32-6", "Contact Person's Address - Country");
    fieldDescMap.put("GT1-29-4-3",
        "Guarantor Employer ID Number - Assigning Authority - Universal ID Type");
    fieldDescMap.put("PV1-9-9-1", "Consulting Doctor - Assigning Authority - Namespace ID");
    fieldDescMap.put("PV1-52-16", "Other Healthcare Provider - Name Context");
    fieldDescMap.put("PV1-52-15", "Other Healthcare Provider - Name Representation Code");
    fieldDescMap.put("PV1-52-14", "Other Healthcare Provider - Assigning Facility");
    fieldDescMap.put("PV1-9-9-3", "Consulting Doctor - Assigning Authority - Universal ID Type");
    fieldDescMap.put("PV1-52-13", "Other Healthcare Provider - Identifier Type Code");
    fieldDescMap.put("PV1-9-9-2", "Consulting Doctor - Assigning Authority - Universal ID");
    fieldDescMap.put("PV1-52-19", "Other Healthcare Provider - Effective Date");
    fieldDescMap.put("PV1-52-18", "Other Healthcare Provider - Name Assembly Order");
    fieldDescMap.put("PV1-52-17", "Other Healthcare Provider - Name Validity Range");
    fieldDescMap.put("TQ1-9-3", "Priority - Name of Coding System");
    fieldDescMap.put("TQ1-9-4", "Priority - Alternate Identifier");
    fieldDescMap.put("TQ1-9-1", "Priority - Identifier");
    fieldDescMap.put("TQ1-9-2", "Priority - Text");
    fieldDescMap.put("TQ1-9-9", "Priority - Original Text");
    fieldDescMap.put("TQ1-9-7", "Priority - Coding System Version ID");
    fieldDescMap.put("TQ1-9-8", "Priority - Alternate Coding System Version ID");
    fieldDescMap.put("TQ1-9-5", "Priority - Alternate Text");
    fieldDescMap.put("TQ1-9-6", "Priority - Name of Alternate Coding System");
    fieldDescMap.put("IN2-39-4", "Religion - Alternate Identifier");
    fieldDescMap.put("IN2-39-3", "Religion - Name of Coding System");
    fieldDescMap.put("GT1-5-14-1", "Guarantor Address - Expiration Date - Time");
    fieldDescMap.put("IN2-39-6", "Religion - Name of Alternate Coding System");
    fieldDescMap.put("GT1-5-14-2", "Guarantor Address - Expiration Date - Degree of Precision");
    fieldDescMap.put("IN2-39-5", "Religion - Alternate Text");
    fieldDescMap.put("ORC-10-2-5", "Entered By - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("IN2-39-2", "Religion - Text");
    fieldDescMap.put("ORC-10-2-4", "Entered By - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("IN2-39-1", "Religion - Identifier");
    fieldDescMap.put("ORC-10-2-3", "Entered By - Family Name - Own Surname");
    fieldDescMap.put("IN1-9-5", "Group Name - Check Digit Scheme");
    fieldDescMap.put("ORC-10-2-2", "Entered By - Family Name - Own Surname Prefix");
    fieldDescMap.put("IN1-9-6", "Group Name - Assigning Authority");
    fieldDescMap.put("ORC-10-2-1", "Entered By - Family Name - Surname");
    fieldDescMap.put("IN1-9-7", "Group Name - Identifier Type Code");
    fieldDescMap.put("IN1-9-8", "Group Name - Assigning Facility");
    fieldDescMap.put("IN1-9-9", "Group Name - Name Representation Code");
    fieldDescMap.put("ORC-8-1-4", "Parent - Placer Assigned Identifier - Universal ID Type");
    fieldDescMap.put("RXA-11-4-1", "Administered-at Location - Facility - Namespace ID");
    fieldDescMap.put("RXA-11-4-2", "Administered-at Location - Facility - Universal ID");
    fieldDescMap.put("ORC-8-1-2", "Parent - Placer Assigned Identifier - Namespace ID");
    fieldDescMap.put("RXA-11-4-3", "Administered-at Location - Facility - Universal ID Type");
    fieldDescMap.put("ORC-8-1-3", "Parent - Placer Assigned Identifier - Universal ID");
    fieldDescMap.put("ORC-8-1-1", "Parent - Placer Assigned Identifier - Entity Identifier");
    fieldDescMap.put("PV1-7-20-1", "Attending Doctor - Expiration Date - Time");
    fieldDescMap.put("PV1-7-20-2", "Attending Doctor - Expiration Date - Degree of Precision");
    fieldDescMap.put("ORC-29-9", "Order Type - Original Text");
    fieldDescMap.put("IN1-49-10", "Insured's ID Number - Assigning Agency or Department");
    fieldDescMap.put("TQ1-3-10", "Repeat Pattern - Event Offset Units");
    fieldDescMap.put("TQ1-3-11", "Repeat Pattern - General Timing Specification");
    fieldDescMap.put("OBX-16-20-1", "Responsible Observer - Expiration Date - Time");
    fieldDescMap.put("OBX-16-20-2", "Responsible Observer - Expiration Date - Degree of Precision");
    fieldDescMap.put("RXA-22-1", "System Entry Date/Time - Time");
    fieldDescMap.put("RXA-22-2", "System Entry Date/Time - Degree of Precision");
    fieldDescMap.put("ORC-29-8", "Order Type - Alternate Coding System Version ID");
    fieldDescMap.put("ORC-29-7", "Order Type - Coding System Version ID");
    fieldDescMap.put("ORC-29-6", "Order Type - Name of Alternate Coding System");
    fieldDescMap.put("ORC-29-5", "Order Type - Alternate Text");
    fieldDescMap.put("ORC-29-4", "Order Type - Alternate Identifier");
    fieldDescMap.put("ORC-29-3", "Order Type - Name of Coding System");
    fieldDescMap.put("ORC-29-2", "Order Type - Text");
    fieldDescMap.put("ORC-29-1", "Order Type - Identifier");
    fieldDescMap.put("PV1-5-9-6",
        "Preadmit Number - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap
        .put("PV1-5-9-7", "Preadmit Number - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("PV1-5-9-8",
        "Preadmit Number - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("PV1-5-9-9", "Preadmit Number - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("IN2-63-12", "Insured's Phone Number - Home - Unformatted Telephone number");
    fieldDescMap.put("IN2-63-11", "Insured's Phone Number - Home - Speed Dial Code");
    fieldDescMap.put("PV1-5-9-1", "Preadmit Number - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("PV1-5-9-2", "Preadmit Number - Assigning Jurisdiction - Text");
    fieldDescMap
        .put("PV1-5-9-3", "Preadmit Number - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap
        .put("PV1-5-9-4", "Preadmit Number - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("PV1-5-9-5", "Preadmit Number - Assigning Jurisdiction - Alternate Text");
    fieldDescMap
        .put("OBX-16-14-3", "Responsible Observer - Assigning Facility - Universal ID Type");
    fieldDescMap.put("ORC-21-2", "Ordering Facility Name - Organization Name Type Code");
    fieldDescMap.put("OBX-16-14-2", "Responsible Observer - Assigning Facility - Universal ID");
    fieldDescMap.put("ORC-21-1", "Ordering Facility Name - Organization Name");
    fieldDescMap.put("ORC-21-4", "Ordering Facility Name - Check Digit");
    fieldDescMap.put("ORC-21-3", "Ordering Facility Name - ID Number");
    fieldDescMap.put("ORC-21-6", "Ordering Facility Name - Assigning Authority");
    fieldDescMap.put("ORC-21-5", "Ordering Facility Name - Check Digit Scheme");
    fieldDescMap.put("ORC-21-8", "Ordering Facility Name - Assigning Facility");
    fieldDescMap.put("GT1-17-13", "Guarantor Employer Address - Effective Date");
    fieldDescMap.put("ORC-21-7", "Ordering Facility Name - Identifier Type Code");
    fieldDescMap.put("GT1-17-14", "Guarantor Employer Address - Expiration Date");
    fieldDescMap.put("PV2-40-2", "Admission Level of Care Code - Text");
    fieldDescMap.put("ORC-21-9", "Ordering Facility Name - Name Representation Code");
    fieldDescMap.put("IN2-63-10", "Insured's Phone Number - Home - Extension Prefix");
    fieldDescMap.put("PV2-40-3", "Admission Level of Care Code - Name of Coding System");
    fieldDescMap.put("PV2-40-1", "Admission Level of Care Code - Identifier");
    fieldDescMap.put("PV2-40-6", "Admission Level of Care Code - Name of Alternate Coding System");
    fieldDescMap.put("OBX-16-14-1", "Responsible Observer - Assigning Facility - Namespace ID");
    fieldDescMap.put("PV2-40-4", "Admission Level of Care Code - Alternate Identifier");
    fieldDescMap.put("PV2-40-5", "Admission Level of Care Code - Alternate Text");
    fieldDescMap.put("NK1-32-13-1", "Contact Person's Address - Effective Date - Time");
    fieldDescMap.put("PD1-3-10", "Patient Primary Facility - Organization Identifier");
    fieldDescMap
        .put("NK1-32-13-2", "Contact Person's Address - Effective Date - Degree of Precision");
    fieldDescMap.put("IN2-53-9", "Insured's Contact Person Phone Number - Any Text");
    fieldDescMap.put("IN2-53-8", "Insured's Contact Person Phone Number - Extension");
    fieldDescMap.put("IN2-53-7", "Insured's Contact Person Phone Number - Local Number");
    fieldDescMap
        .put("IN2-53-2", "Insured's Contact Person Phone Number - Telecommunication Use Code");
    fieldDescMap.put("IN2-53-1", "Insured's Contact Person Phone Number - Telephone Number");
    fieldDescMap
        .put("PD1-4-20-1", "Patient Primary Care Provider Name & ID No. - Expiration Date - Time");
    fieldDescMap.put("IN2-53-6", "Insured's Contact Person Phone Number - Area/City Code");
    fieldDescMap.put("IN2-53-5", "Insured's Contact Person Phone Number - Country Code");
    fieldDescMap.put("PD1-4-20-2",
        "Patient Primary Care Provider Name & ID No. - Expiration Date - Degree of Precision");
    fieldDescMap.put("IN2-53-4", "Insured's Contact Person Phone Number - Email Address");
    fieldDescMap.put("IN2-53-3",
        "Insured's Contact Person Phone Number - Telecommunication Equipment Type");
    fieldDescMap.put("IN3-14-22-1", "Physician Reviewer - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("IN1-42-1", "Insured's Employment Status - Identifier");
    fieldDescMap.put("IN2-52-11", "Insured's Contact Person's Name - Name Assembly Order");
    fieldDescMap.put("IN1-42-2", "Insured's Employment Status - Text");
    fieldDescMap.put("IN2-52-12", "Insured's Contact Person's Name - Effective Date");
    fieldDescMap.put("IN1-42-3", "Insured's Employment Status - Name of Coding System");
    fieldDescMap.put("IN2-52-13", "Insured's Contact Person's Name - Expiration Date");
    fieldDescMap.put("IN1-42-4", "Insured's Employment Status - Alternate Identifier");
    fieldDescMap.put("IN2-52-14", "Insured's Contact Person's Name - Professional Suffix");
    fieldDescMap.put("IN1-42-5", "Insured's Employment Status - Alternate Text");
    fieldDescMap.put("IN1-42-6", "Insured's Employment Status - Name of Alternate Coding System");
    fieldDescMap.put("ORC-24-1-2", "Ordering Provider Address - Street Address - Street Name");
    fieldDescMap.put("ORC-24-1-3", "Ordering Provider Address - Street Address - Dwelling Number");
    fieldDescMap.put("IN3-14-22-7",
        "Physician Reviewer - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("IN3-14-22-6",
        "Physician Reviewer - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("IN3-14-22-9", "Physician Reviewer - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("IN2-52-10", "Insured's Contact Person's Name - Name Validity Range");
    fieldDescMap.put("ORC-24-1-1",
        "Ordering Provider Address - Street Address - Street or Mailing Address");
    fieldDescMap.put("IN3-14-22-8",
        "Physician Reviewer - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap
        .put("IN3-14-22-3", "Physician Reviewer - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("IN3-14-22-2", "Physician Reviewer - Assigning Jurisdiction - Text");
    fieldDescMap.put("IN3-14-22-5", "Physician Reviewer - Assigning Jurisdiction - Alternate Text");
    fieldDescMap
        .put("IN3-14-22-4", "Physician Reviewer - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("GT1-19-5", "Guarantor Employee ID Number - Identifier Type Code");
    fieldDescMap.put("GT1-19-4", "Guarantor Employee ID Number - Assigning Authority");
    fieldDescMap.put("GT1-19-7", "Guarantor Employee ID Number - Effective Date");
    fieldDescMap.put("GT1-19-6", "Guarantor Employee ID Number - Assigning Facility");
    fieldDescMap.put("GT1-19-9", "Guarantor Employee ID Number - Assigning Jurisdiction");
    fieldDescMap.put("GT1-19-8", "Guarantor Employee ID Number - Expiration Date");
    fieldDescMap.put("ORC-9-1", "Date/Time of Transaction - Time");
    fieldDescMap.put("ORC-9-2", "Date/Time of Transaction - Degree of Precision");
    fieldDescMap.put("GT1-19-1", "Guarantor Employee ID Number - ID Number");
    fieldDescMap.put("GT1-19-3", "Guarantor Employee ID Number - Check Digit Scheme");
    fieldDescMap.put("GT1-19-2", "Guarantor Employee ID Number - Check Digit");
    fieldDescMap.put("IN3-2", "Certification Number");
    fieldDescMap.put("IN3-1", "Set ID - IN3");
    fieldDescMap.put("IN3-0", "Insurance Additional Information, Certification");
    fieldDescMap.put("IN3-6", "Certification Date/Time");
    fieldDescMap.put("IN3-5", "Penalty");
    fieldDescMap.put("IN3-4", "Certification Required");
    fieldDescMap.put("IN3-3", "Certified By");
    fieldDescMap.put("IN3-9", "Certification Begin Date");
    fieldDescMap.put("IN3-8", "Operator");
    fieldDescMap.put("IN3-7", "Certification Modify Date/Time");
    fieldDescMap.put("IN3-14-16-5", "Physician Reviewer - Name Context - Alternate Text");
    fieldDescMap
        .put("IN3-14-16-6", "Physician Reviewer - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("IN3-14-16-1", "Physician Reviewer - Name Context - Identifier");
    fieldDescMap.put("IN3-14-16-2", "Physician Reviewer - Name Context - Text");
    fieldDescMap.put("IN3-14-16-3", "Physician Reviewer - Name Context - Name of Coding System");
    fieldDescMap.put("IN3-14-16-4", "Physician Reviewer - Name Context - Alternate Identifier");
    fieldDescMap.put("RXA-11-9", "Administered-at Location - Street Address");
    fieldDescMap.put("IN1-10-10-8",
        "Insured's Group Emp ID - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("IN1-10-10-7",
        "Insured's Group Emp ID - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("RXA-11-7", "Administered-at Location - Building");
    fieldDescMap.put("IN1-10-10-6",
        "Insured's Group Emp ID - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("RXA-11-8", "Administered-at Location - Floor");
    fieldDescMap.put("IN1-10-10-5",
        "Insured's Group Emp ID - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("RXA-11-5", "Administered-at Location - Location Status");
    fieldDescMap.put("IN1-10-10-4",
        "Insured's Group Emp ID - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("RXA-11-6", "Administered-at Location - Patient Location Type");
    fieldDescMap.put("IN1-10-10-3",
        "Insured's Group Emp ID - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("RXA-11-3", "Administered-at Location - Bed");
    fieldDescMap
        .put("IN1-10-10-2", "Insured's Group Emp ID - Assigning Agency or Department - Text");
    fieldDescMap.put("RXA-11-4", "Administered-at Location - Facility");
    fieldDescMap
        .put("IN1-10-10-1", "Insured's Group Emp ID - Assigning Agency or Department - Identifier");
    fieldDescMap.put("RXA-11-1", "Administered-at Location - Point of Care");
    fieldDescMap.put("RXA-11-2", "Administered-at Location - Room");
    fieldDescMap
        .put("IN2-70-10", "Insured Employer Organization Name and ID - Organization Identifier");
    fieldDescMap.put("IN1-10-10-9",
        "Insured's Group Emp ID - Assigning Agency or Department - Original Text");
    fieldDescMap.put("RXR-2-1", "Administration Site - Identifier");
    fieldDescMap.put("PV1-8-23-6",
        "Referring Doctor - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap
        .put("PV1-8-23-5", "Referring Doctor - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("OBX-16-23", "Responsible Observer - Assigning Agency or Department");
    fieldDescMap.put("RXR-2-3", "Administration Site - Name of Coding System");
    fieldDescMap.put("PV1-8-23-8",
        "Referring Doctor - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("OBX-16-22", "Responsible Observer - Assigning Jurisdiction");
    fieldDescMap.put("RXR-2-2", "Administration Site - Text");
    fieldDescMap.put("PV1-8-23-7",
        "Referring Doctor - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap
        .put("PV1-8-23-9", "Referring Doctor - Assigning Agency or Department - Original Text");
    fieldDescMap.put("RXR-2-9", "Administration Site - Original Text");
    fieldDescMap.put("RXR-2-8", "Administration Site - Alternate Coding System Version ID");
    fieldDescMap.put("RXR-2-5", "Administration Site - Alternate Text");
    fieldDescMap.put("RXR-2-4", "Administration Site - Alternate Identifier");
    fieldDescMap.put("RXR-2-7", "Administration Site - Coding System Version ID");
    fieldDescMap.put("RXR-2-6", "Administration Site - Name of Alternate Coding System");
    fieldDescMap.put("PV1-6-11", "Prior Patient Location - Assigning Authority for Location");
    fieldDescMap.put("PV1-6-10", "Prior Patient Location - Comprehensive Location Identifier");
    fieldDescMap.put("PV1-45-2", "Discharge Date/Time - Degree of Precision");
    fieldDescMap.put("GT1-51-8-3",
        "Guarantor Employer's Organization Name - Assigning Facility - Universal ID Type");
    fieldDescMap.put("GT1-51-8-2",
        "Guarantor Employer's Organization Name - Assigning Facility - Universal ID");
    fieldDescMap.put("PV1-45-1", "Discharge Date/Time - Time");
    fieldDescMap.put("GT1-51-8-1",
        "Guarantor Employer's Organization Name - Assigning Facility - Namespace ID");
    fieldDescMap
        .put("IN1-19-1-1", "Insured's Address - Street Address - Street or Mailing Address");
    fieldDescMap.put("IN1-19-1-2", "Insured's Address - Street Address - Street Name");
    fieldDescMap.put("IN1-19-1-3", "Insured's Address - Street Address - Dwelling Number");
    fieldDescMap.put("PV1-50-6-3", "Alternate Visit ID - Assigning Facility - Universal ID Type");
    fieldDescMap.put("PV1-50-6-2", "Alternate Visit ID - Assigning Facility - Universal ID");
    fieldDescMap.put("PV1-50-6-1", "Alternate Visit ID - Assigning Facility - Namespace ID");
    fieldDescMap.put("NK1-11-2", "Next of Kin / Associated Parties Job Code/Class - Job Class");
    fieldDescMap.put("RXA-10-16-6",
        "Administering Provider - Name Context - Name of Alternate Coding System");
    fieldDescMap
        .put("NK1-11-3", "Next of Kin / Associated Parties Job Code/Class - Job Description Text");
    fieldDescMap.put("RXA-10-16-5", "Administering Provider - Name Context - Alternate Text");
    fieldDescMap.put("RXA-10-16-4", "Administering Provider - Name Context - Alternate Identifier");
    fieldDescMap.put("NK1-11-1", "Next of Kin / Associated Parties Job Code/Class - Job Code");
    fieldDescMap
        .put("RXA-10-16-3", "Administering Provider - Name Context - Name of Coding System");
    fieldDescMap.put("PV1-8-23-3",
        "Referring Doctor - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("RXA-10-16-2", "Administering Provider - Name Context - Text");
    fieldDescMap.put("PV1-8-23-4",
        "Referring Doctor - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("RXA-10-16-1", "Administering Provider - Name Context - Identifier");
    fieldDescMap
        .put("PV1-8-23-1", "Referring Doctor - Assigning Agency or Department - Identifier");
    fieldDescMap.put("PV1-8-23-2", "Referring Doctor - Assigning Agency or Department - Text");
    fieldDescMap.put("IN2-3-22-8",
        "Insured's Employer's Name and ID - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("IN2-3-22-7",
        "Insured's Employer's Name and ID - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("RXA-11-11", "Administered-at Location - City");
    fieldDescMap.put("IN3-8-14-3", "Operator - Assigning Facility - Universal ID Type");
    fieldDescMap.put("RXA-11-10", "Administered-at Location - Other Designation");
    fieldDescMap.put("IN3-8-14-2", "Operator - Assigning Facility - Universal ID");
    fieldDescMap.put("IN2-3-22-9",
        "Insured's Employer's Name and ID - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("RXA-11-13", "Administered-at Location - Zip or Postal Code");
    fieldDescMap.put("IN3-8-14-1", "Operator - Assigning Facility - Namespace ID");
    fieldDescMap.put("IN2-3-22-4",
        "Insured's Employer's Name and ID - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("RXA-11-12", "Administered-at Location - State or Province");
    fieldDescMap.put("IN2-3-22-3",
        "Insured's Employer's Name and ID - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("RXA-11-15", "Administered-at Location - Address Type");
    fieldDescMap.put("IN2-3-22-6",
        "Insured's Employer's Name and ID - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("RXA-11-14", "Administered-at Location - Country");
    fieldDescMap.put("IN2-3-22-5",
        "Insured's Employer's Name and ID - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("ORC-18-5", "Entering Device - Alternate Text");
    fieldDescMap.put("ORC-18-6", "Entering Device - Name of Alternate Coding System");
    fieldDescMap.put("ORC-18-3", "Entering Device - Name of Coding System");
    fieldDescMap.put("ORC-18-4", "Entering Device - Alternate Identifier");
    fieldDescMap.put("ORC-18-1", "Entering Device - Identifier");
    fieldDescMap.put("ORC-18-2", "Entering Device - Text");
    fieldDescMap.put("IN3-3-23-2", "Certified By - Assigning Agency or Department - Text");
    fieldDescMap.put("IN3-3-23-1", "Certified By - Assigning Agency or Department - Identifier");
    fieldDescMap.put("GT1-17-11", "Guarantor Employer Address - Address Representation Code");
    fieldDescMap.put("GT1-17-12", "Guarantor Employer Address - Address Validity Range");
    fieldDescMap.put("GT1-17-10", "Guarantor Employer Address - Census Tract");
    fieldDescMap.put("IN2-3-22-1",
        "Insured's Employer's Name and ID - Assigning Jurisdiction - Identifier");
    fieldDescMap
        .put("IN2-3-22-2", "Insured's Employer's Name and ID - Assigning Jurisdiction - Text");
    fieldDescMap.put("RXA-11-16", "Administered-at Location - Other Geographic Designation");
    fieldDescMap.put("PV1-43-11-3",
        "Prior Temporary Location - Assigning Authority for Location - Universal ID Type");
    fieldDescMap.put("PV1-43-11-2",
        "Prior Temporary Location - Assigning Authority for Location - Universal ID");
    fieldDescMap.put("PV1-43-11-1",
        "Prior Temporary Location - Assigning Authority for Location - Namespace ID");
    fieldDescMap.put("GT1-23-2", "Guarantor Credit Rating Code - Text");
    fieldDescMap.put("GT1-23-1", "Guarantor Credit Rating Code - Identifier");
    fieldDescMap.put("IN3-14-2-1", "Physician Reviewer - Family Name - Surname");
    fieldDescMap.put("IN3-14-2-3", "Physician Reviewer - Family Name - Own Surname");
    fieldDescMap.put("IN3-14-2-2", "Physician Reviewer - Family Name - Own Surname Prefix");
    fieldDescMap
        .put("IN3-14-2-5", "Physician Reviewer - Family Name - Surname From Partner/Spouse");
    fieldDescMap
        .put("IN3-14-2-4", "Physician Reviewer - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("NK1-2-12-2", "Name - Effective Date - Degree of Precision");
    fieldDescMap.put("GT1-30-5", "Guarantor Marital Status Code - Alternate Text");
    fieldDescMap.put("GT1-30-6", "Guarantor Marital Status Code - Name of Alternate Coding System");
    fieldDescMap.put("GT1-30-3", "Guarantor Marital Status Code - Name of Coding System");
    fieldDescMap.put("NK1-2-12-1", "Name - Effective Date - Time");
    fieldDescMap.put("GT1-30-4", "Guarantor Marital Status Code - Alternate Identifier");
    fieldDescMap.put("GT1-30-1", "Guarantor Marital Status Code - Identifier");
    fieldDescMap.put("GT1-30-2", "Guarantor Marital Status Code - Text");
    fieldDescMap.put("GT1-23-5", "Guarantor Credit Rating Code - Alternate Text");
    fieldDescMap.put("GT1-23-6", "Guarantor Credit Rating Code - Name of Alternate Coding System");
    fieldDescMap.put("GT1-23-3", "Guarantor Credit Rating Code - Name of Coding System");
    fieldDescMap.put("GT1-23-4", "Guarantor Credit Rating Code - Alternate Identifier");
    fieldDescMap
        .put("IN3-3-4", "Certified By - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("IN3-3-3", "Certified By - Given Name");
    fieldDescMap.put("IN3-3-2", "Certified By - Family Name");
    fieldDescMap.put("IN3-3-1", "Certified By - ID Number");
    fieldDescMap.put("IN3-3-8", "Certified By - Source Table");
    fieldDescMap.put("IN3-3-7", "Certified By - Degree (e.g., MD)");
    fieldDescMap.put("IN3-3-6", "Certified By - Prefix (e.g., DR)");
    fieldDescMap.put("IN3-3-5", "Certified By - Suffix (e.g., JR or III)");
    fieldDescMap
        .put("IN3-3-22-7", "Certified By - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("NK1-22-4", "Publicity Code - Alternate Identifier");
    fieldDescMap.put("IN3-3-22-6",
        "Certified By - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("NK1-22-5", "Publicity Code - Alternate Text");
    fieldDescMap.put("IN3-3-22-5", "Certified By - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("NK1-22-6", "Publicity Code - Name of Alternate Coding System");
    fieldDescMap.put("IN3-3-22-4", "Certified By - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("IN3-3-22-9", "Certified By - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("IN3-3-22-8",
        "Certified By - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("PV1-7-9-1", "Attending Doctor - Assigning Authority - Namespace ID");
    fieldDescMap.put("PV1-7-9-3", "Attending Doctor - Assigning Authority - Universal ID Type");
    fieldDescMap.put("PV1-7-9-2", "Attending Doctor - Assigning Authority - Universal ID");
    fieldDescMap.put("IN3-18-1", "Certification Agency - Identifier");
    fieldDescMap.put("IN3-18-2", "Certification Agency - Text");
    fieldDescMap.put("IN3-18-3", "Certification Agency - Name of Coding System");
    fieldDescMap.put("IN3-18-4", "Certification Agency - Alternate Identifier");
    fieldDescMap.put("IN3-18-5", "Certification Agency - Alternate Text");
    fieldDescMap.put("IN3-18-6", "Certification Agency - Name of Alternate Coding System");
    fieldDescMap.put("ORC-10-16-4", "Entered By - Name Context - Alternate Identifier");
    fieldDescMap.put("ORC-10-16-3", "Entered By - Name Context - Name of Coding System");
    fieldDescMap.put("ORC-10-16-6", "Entered By - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("ORC-10-16-5", "Entered By - Name Context - Alternate Text");
    fieldDescMap.put("ORC-10-16-2", "Entered By - Name Context - Text");
    fieldDescMap.put("ORC-10-16-1", "Entered By - Name Context - Identifier");
    fieldDescMap.put("IN3-3-22-1", "Certified By - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("IN3-3-22-2", "Certified By - Assigning Jurisdiction - Text");
    fieldDescMap.put("IN3-3-22-3", "Certified By - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("ORC-11-19-2", "Verified By - Effective Date - Degree of Precision");
    fieldDescMap.put("ORC-11-19-1", "Verified By - Effective Date - Time");
    fieldDescMap
        .put("IN1-6-9-3", "Insurance Co Contact Person - Name Context - Name of Coding System");
    fieldDescMap.put("IN1-6-9-2", "Insurance Co Contact Person - Name Context - Text");
    fieldDescMap.put("IN1-6-9-1", "Insurance Co Contact Person - Name Context - Identifier");
    fieldDescMap.put("IN1-6-9-6",
        "Insurance Co Contact Person - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("IN1-6-9-5", "Insurance Co Contact Person - Name Context - Alternate Text");
    fieldDescMap
        .put("IN1-6-9-4", "Insurance Co Contact Person - Name Context - Alternate Identifier");
    fieldDescMap.put("PID-5-6", "Patient Name - Degree (e.g., MD)");
    fieldDescMap.put("PID-5-7", "Patient Name - Name Type Code");
    fieldDescMap.put("PID-5-8", "Patient Name - Name Representation Code");
    fieldDescMap.put("PID-5-9", "Patient Name - Name Context");
    fieldDescMap.put("PID-5-2", "Patient Name - Given Name");
    fieldDescMap.put("IN2-52-12-1", "Insured's Contact Person's Name - Effective Date - Time");
    fieldDescMap
        .put("PID-5-3", "Patient Name - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("IN2-52-12-2",
        "Insured's Contact Person's Name - Effective Date - Degree of Precision");
    fieldDescMap.put("PID-5-4", "Patient Name - Suffix (e.g., JR or III)");
    fieldDescMap.put("PID-5-5", "Patient Name - Prefix (e.g., DR)");
    fieldDescMap.put("NK1-4-13-2", "Address - Effective Date - Degree of Precision");
    fieldDescMap.put("NK1-4-13-1", "Address - Effective Date - Time");
    fieldDescMap.put("PID-5-1", "Patient Name - Family Name");
    fieldDescMap.put("GT1-46-6", "Contact Person's Telephone Number - Area/City Code");
    fieldDescMap.put("GT1-46-7", "Contact Person's Telephone Number - Local Number");
    fieldDescMap.put("GT1-46-8", "Contact Person's Telephone Number - Extension");
    fieldDescMap.put("GT1-46-9", "Contact Person's Telephone Number - Any Text");
    fieldDescMap.put("GT1-46-2", "Contact Person's Telephone Number - Telecommunication Use Code");
    fieldDescMap
        .put("GT1-46-3", "Contact Person's Telephone Number - Telecommunication Equipment Type");
    fieldDescMap.put("GT1-46-4", "Contact Person's Telephone Number - Email Address");
    fieldDescMap.put("GT1-46-5", "Contact Person's Telephone Number - Country Code");
    fieldDescMap.put("PV1-9-2", "Consulting Doctor - Family Name");
    fieldDescMap.put("PV1-9-3", "Consulting Doctor - Given Name");
    fieldDescMap
        .put("PV1-9-4", "Consulting Doctor - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("GT1-46-1", "Contact Person's Telephone Number - Telephone Number");
    fieldDescMap.put("PV1-9-5", "Consulting Doctor - Suffix (e.g., JR or III)");
    fieldDescMap.put("IN3-8-20-1", "Operator - Expiration Date - Time");
    fieldDescMap.put("IN3-8-20-2", "Operator - Expiration Date - Degree of Precision");
    fieldDescMap.put("PV1-9-1", "Consulting Doctor - ID Number");
    fieldDescMap.put("PV1-9-9", "Consulting Doctor - Assigning Authority");
    fieldDescMap.put("PV1-9-8", "Consulting Doctor - Source Table");
    fieldDescMap.put("PV1-9-7", "Consulting Doctor - Degree (e.g., MD)");
    fieldDescMap.put("PV1-9-6", "Consulting Doctor - Prefix (e.g., DR)");
    fieldDescMap.put("IN2-1-1", "Insured's Employee ID - ID Number");
    fieldDescMap.put("IN2-1-2", "Insured's Employee ID - Check Digit");
    fieldDescMap.put("IN2-1-3", "Insured's Employee ID - Check Digit Scheme");
    fieldDescMap.put("IN2-1-4", "Insured's Employee ID - Assigning Authority");
    fieldDescMap.put("IN2-1-5", "Insured's Employee ID - Identifier Type Code");
    fieldDescMap.put("IN2-1-6", "Insured's Employee ID - Assigning Facility");
    fieldDescMap.put("IN2-1-7", "Insured's Employee ID - Effective Date");
    fieldDescMap.put("IN2-1-8", "Insured's Employee ID - Expiration Date");
    fieldDescMap.put("IN2-1-9", "Insured's Employee ID - Assigning Jurisdiction");
    fieldDescMap.put("IN2-25-1", "Payor ID - ID Number");
    fieldDescMap.put("IN2-25-9", "Payor ID - Assigning Jurisdiction");
    fieldDescMap.put("IN2-25-8", "Payor ID - Expiration Date");
    fieldDescMap.put("IN2-25-7", "Payor ID - Effective Date");
    fieldDescMap.put("IN2-25-6", "Payor ID - Assigning Facility");
    fieldDescMap.put("IN2-25-5", "Payor ID - Identifier Type Code");
    fieldDescMap.put("IN2-25-4", "Payor ID - Assigning Authority");
    fieldDescMap.put("IN2-25-3", "Payor ID - Check Digit Scheme");
    fieldDescMap.put("IN2-25-2", "Payor ID - Check Digit");
    fieldDescMap.put("MSH-6-2", "Receiving Facility - Universal ID");
    fieldDescMap.put("MSH-6-3", "Receiving Facility - Universal ID Type");
    fieldDescMap.put("PID-36-6", "Breed Code - Name of Alternate Coding System");
    fieldDescMap.put("PID-36-5", "Breed Code - Alternate Text");
    fieldDescMap.put("MSH-6-1", "Receiving Facility - Namespace ID");
    fieldDescMap.put("PID-36-4", "Breed Code - Alternate Identifier");
    fieldDescMap.put("PID-36-3", "Breed Code - Name of Coding System");
    fieldDescMap.put("PID-36-2", "Breed Code - Text");
    fieldDescMap.put("PID-36-1", "Breed Code - Identifier");
    fieldDescMap.put("IN3-3-9", "Certified By - Assigning Authority");
    fieldDescMap.put("IN3-3-2-5", "Certified By - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("PV1-50-10", "Alternate Visit ID - Assigning Agency or Department");
    fieldDescMap
        .put("IN3-3-2-4", "Certified By - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("IN1-19-13-2", "Insured's Address - Effective Date - Degree of Precision");
    fieldDescMap.put("IN1-19-13-1", "Insured's Address - Effective Date - Time");
    fieldDescMap.put("IN1-6-13", "Insurance Co Contact Person - Expiration Date");
    fieldDescMap.put("IN1-6-14", "Insurance Co Contact Person - Professional Suffix");
    fieldDescMap.put("IN1-6-11", "Insurance Co Contact Person - Name Assembly Order");
    fieldDescMap.put("IN1-6-12", "Insurance Co Contact Person - Effective Date");
    fieldDescMap.put("IN1-6-10", "Insurance Co Contact Person - Name Validity Range");
    fieldDescMap.put("PV2-9-1", "Expected Discharge Date/Time - Time");
    fieldDescMap.put("PV2-9-2", "Expected Discharge Date/Time - Degree of Precision");
    fieldDescMap.put("IN2-1-9-6",
        "Insured's Employee ID - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("IN2-1-9-7",
        "Insured's Employee ID - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap
        .put("IN2-1-9-4", "Insured's Employee ID - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap
        .put("IN2-1-9-5", "Insured's Employee ID - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("IN2-1-9-2", "Insured's Employee ID - Assigning Jurisdiction - Text");
    fieldDescMap
        .put("IN2-1-9-3", "Insured's Employee ID - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("IN2-1-9-1", "Insured's Employee ID - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("PV2-1-11-2",
        "Prior Pending Location - Assigning Authority for Location - Universal ID");
    fieldDescMap.put("IN3-3-2-1", "Certified By - Family Name - Surname");
    fieldDescMap.put("PV2-1-11-3",
        "Prior Pending Location - Assigning Authority for Location - Universal ID Type");
    fieldDescMap.put("IN3-3-2-2", "Certified By - Family Name - Own Surname Prefix");
    fieldDescMap.put("IN3-3-2-3", "Certified By - Family Name - Own Surname");
    fieldDescMap.put("PV2-1-11-1",
        "Prior Pending Location - Assigning Authority for Location - Namespace ID");
    fieldDescMap.put("IN2-1-9-8",
        "Insured's Employee ID - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("IN2-1-9-9", "Insured's Employee ID - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("PV2-1-7", "Prior Pending Location - Building");
    fieldDescMap.put("PD1-15-4", "Advance Directive Code - Alternate Identifier");
    fieldDescMap.put("PV2-1-8", "Prior Pending Location - Floor");
    fieldDescMap.put("PD1-15-3", "Advance Directive Code - Name of Coding System");
    fieldDescMap.put("PV2-1-5", "Prior Pending Location - Location Status");
    fieldDescMap.put("PD1-15-2", "Advance Directive Code - Text");
    fieldDescMap.put("PV2-1-6", "Prior Pending Location - Person Location Type");
    fieldDescMap.put("PD1-15-1", "Advance Directive Code - Identifier");
    fieldDescMap.put("PV2-1-9", "Prior Pending Location - Location Description");
    fieldDescMap.put("PD1-15-6", "Advance Directive Code - Name of Alternate Coding System");
    fieldDescMap.put("PD1-15-5", "Advance Directive Code - Alternate Text");
    fieldDescMap.put("PV2-1-3", "Prior Pending Location - Bed");
    fieldDescMap.put("PV2-1-4", "Prior Pending Location - Facility");
    fieldDescMap.put("PV2-1-1", "Prior Pending Location - Point of Care");
    fieldDescMap.put("PV2-1-2", "Prior Pending Location - Room");
    fieldDescMap.put("RXA-10-23-8",
        "Administering Provider - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("NK1-4-14", "Address - Expiration Date");
    fieldDescMap.put("RXA-10-23-9",
        "Administering Provider - Assigning Agency or Department - Original Text");
    fieldDescMap.put("NK1-4-13", "Address - Effective Date");
    fieldDescMap.put("NK1-4-10", "Address - Census Tract");
    fieldDescMap.put("NK1-4-12", "Address - Address Validity Range");
    fieldDescMap.put("NK1-4-11", "Address - Address Representation Code");
    fieldDescMap.put("PV2-23-8-2", "Clinic Organization Name - Assigning Facility - Universal ID");
    fieldDescMap
        .put("RXA-10-23-1", "Administering Provider - Assigning Agency or Department - Identifier");
    fieldDescMap
        .put("PV2-23-8-3", "Clinic Organization Name - Assigning Facility - Universal ID Type");
    fieldDescMap
        .put("RXA-10-23-2", "Administering Provider - Assigning Agency or Department - Text");
    fieldDescMap.put("RXA-10-23-3",
        "Administering Provider - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("PV2-23-8-1", "Clinic Organization Name - Assigning Facility - Namespace ID");
    fieldDescMap.put("RXA-10-23-4",
        "Administering Provider - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("RXA-10-23-5",
        "Administering Provider - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("RXA-10-23-6",
        "Administering Provider - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("RXA-10-23-7",
        "Administering Provider - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("IN1-11-10", "Insured's Group Emp Name - Organization Identifier");
    fieldDescMap.put("PID-11-2", "Patient Address - Other Designation");
    fieldDescMap.put("PID-11-1", "Patient Address - Street Address");
    fieldDescMap.put("NK1-12-4-2",
        "Next of Kin / Associated Parties Employee Number - Assigning Authority - Universal ID");
    fieldDescMap.put("NK1-12-4-3",
        "Next of Kin / Associated Parties Employee Number - Assigning Authority - Universal ID Type");
    fieldDescMap.put("NK1-12-4-1",
        "Next of Kin / Associated Parties Employee Number - Assigning Authority - Namespace ID");
    fieldDescMap.put("PID-11-8", "Patient Address - Other Geographic Designation");
    fieldDescMap.put("PID-11-7", "Patient Address - Address Type");
    fieldDescMap.put("PID-11-9", "Patient Address - County/Parish Code");
    fieldDescMap.put("PID-11-4", "Patient Address - State or Province");
    fieldDescMap.put("PID-11-3", "Patient Address - City");
    fieldDescMap.put("PID-11-6", "Patient Address - Country");
    fieldDescMap.put("PID-11-5", "Patient Address - Zip or Postal Code");
    fieldDescMap.put("GT1-4-14", "Guarantor Spouse Name - Professional Suffix");
    fieldDescMap.put("GT1-4-13", "Guarantor Spouse Name - Expiration Date");
    fieldDescMap.put("GT1-4-10", "Guarantor Spouse Name - Name Validity Range");
    fieldDescMap.put("GT1-4-12", "Guarantor Spouse Name - Effective Date");
    fieldDescMap.put("GT1-4-11", "Guarantor Spouse Name - Name Assembly Order");
    fieldDescMap.put("NK1-33-1", "Next of Kin/Associated Party's Identifiers - ID Number");
    fieldDescMap.put("NK1-33-3", "Next of Kin/Associated Party's Identifiers - Check Digit Scheme");
    fieldDescMap.put("GT1-2-9-8",
        "Guarantor Number - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("NK1-33-2", "Next of Kin/Associated Party's Identifiers - Check Digit");
    fieldDescMap.put("GT1-2-9-9", "Guarantor Number - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("PD1-4-14-3",
        "Patient Primary Care Provider Name & ID No. - Assigning Facility - Universal ID Type");
    fieldDescMap.put("IN2-26-10", "Payor Subscriber ID - Assigning Agency or Department");
    fieldDescMap.put("PD1-4-14-1",
        "Patient Primary Care Provider Name & ID No. - Assigning Facility - Namespace ID");
    fieldDescMap.put("PD1-4-14-2",
        "Patient Primary Care Provider Name & ID No. - Assigning Facility - Universal ID");
    fieldDescMap.put("IN3-2-10", "Certification Number - Assigning Agency or Department");
    fieldDescMap.put("RXA-7-4", "Administered Units - Alternate Identifier");
    fieldDescMap.put("IN1-10-9-8",
        "Insured's Group Emp ID - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("RXA-7-5", "Administered Units - Alternate Text");
    fieldDescMap.put("IN1-10-9-7",
        "Insured's Group Emp ID - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("RXA-7-6", "Administered Units - Name of Alternate Coding System");
    fieldDescMap.put("IN1-10-9-6",
        "Insured's Group Emp ID - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap
        .put("IN1-10-9-5", "Insured's Group Emp ID - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("IN1-10-9-4",
        "Insured's Group Emp ID - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("RXA-7-1", "Administered Units - Identifier");
    fieldDescMap.put("IN1-10-9-3",
        "Insured's Group Emp ID - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("RXA-7-2", "Administered Units - Text");
    fieldDescMap.put("IN1-10-9-2", "Insured's Group Emp ID - Assigning Jurisdiction - Text");
    fieldDescMap.put("RXA-7-3", "Administered Units - Name of Coding System");
    fieldDescMap.put("IN1-10-9-1", "Insured's Group Emp ID - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("NK1-33-6", "Next of Kin/Associated Party's Identifiers - Assigning Facility");
    fieldDescMap.put("GT1-2-9-5", "Guarantor Number - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("NK1-33-7", "Next of Kin/Associated Party's Identifiers - Effective Date");
    fieldDescMap
        .put("GT1-2-9-4", "Guarantor Number - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap
        .put("NK1-33-4", "Next of Kin/Associated Party's Identifiers - Assigning Authority");
    fieldDescMap
        .put("GT1-2-9-7", "Guarantor Number - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap
        .put("NK1-33-5", "Next of Kin/Associated Party's Identifiers - Identifier Type Code");
    fieldDescMap.put("GT1-2-9-6",
        "Guarantor Number - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("GT1-2-9-1", "Guarantor Number - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("NK1-33-8", "Next of Kin/Associated Party's Identifiers - Expiration Date");
    fieldDescMap
        .put("GT1-2-9-3", "Guarantor Number - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap
        .put("NK1-33-9", "Next of Kin/Associated Party's Identifiers - Assigning Jurisdiction");
    fieldDescMap.put("GT1-2-9-2", "Guarantor Number - Assigning Jurisdiction - Text");
    fieldDescMap
        .put("IN1-10-9-9", "Insured's Group Emp ID - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("GT1-19-10-4",
        "Guarantor Employee ID Number - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("IN2-7-1-3", "Medicaid Case Name - Family Name - Own Surname");
    fieldDescMap.put("GT1-19-10-5",
        "Guarantor Employee ID Number - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("IN2-7-1-2", "Medicaid Case Name - Family Name - Own Surname Prefix");
    fieldDescMap
        .put("GT1-19-10-2", "Guarantor Employee ID Number - Assigning Agency or Department - Text");
    fieldDescMap.put("IN2-7-1-5", "Medicaid Case Name - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("GT1-19-10-3",
        "Guarantor Employee ID Number - Assigning Agency or Department - Name of Coding System");
    fieldDescMap
        .put("IN2-7-1-4", "Medicaid Case Name - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("GT1-19-10-8",
        "Guarantor Employee ID Number - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("GT1-19-10-9",
        "Guarantor Employee ID Number - Assigning Agency or Department - Original Text");
    fieldDescMap.put("GT1-19-10-6",
        "Guarantor Employee ID Number - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("GT1-19-10-7",
        "Guarantor Employee ID Number - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("NK1-4-1", "Address - Street Address");
    fieldDescMap.put("NK1-4-5", "Address - Zip or Postal Code");
    fieldDescMap.put("NK1-4-4", "Address - State or Province");
    fieldDescMap.put("GT1-5-13-1", "Guarantor Address - Effective Date - Time");
    fieldDescMap.put("NK1-4-3", "Address - City");
    fieldDescMap
        .put("OBX-16-22-9", "Responsible Observer - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("NK1-4-2", "Address - Other Designation");
    fieldDescMap.put("OBX-16-22-8",
        "Responsible Observer - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("NK1-4-9", "Address - County/Parish Code");
    fieldDescMap.put("IN1-49-9-1", "Insured's ID Number - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("OBX-16-22-7",
        "Responsible Observer - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("NK1-4-8", "Address - Other Geographic Designation");
    fieldDescMap.put("IN1-49-9-2", "Insured's ID Number - Assigning Jurisdiction - Text");
    fieldDescMap.put("OBX-16-22-6",
        "Responsible Observer - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("NK1-4-7", "Address - Address Type");
    fieldDescMap
        .put("OBX-16-22-5", "Responsible Observer - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("NK1-4-6", "Address - Country");
    fieldDescMap
        .put("OBX-16-22-4", "Responsible Observer - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("IN1-49-9-5", "Insured's ID Number - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("OBX-16-22-3",
        "Responsible Observer - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("IN1-49-9-6",
        "Insured's ID Number - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap
        .put("IN2-9-9-6", "Military Sponsor Name - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("OBX-16-22-2", "Responsible Observer - Assigning Jurisdiction - Text");
    fieldDescMap
        .put("IN1-49-9-3", "Insured's ID Number - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("IN2-9-9-5", "Military Sponsor Name - Name Context - Alternate Text");
    fieldDescMap.put("OBX-16-22-1", "Responsible Observer - Assigning Jurisdiction - Identifier");
    fieldDescMap
        .put("IN1-49-9-4", "Insured's ID Number - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("IN2-9-9-4", "Military Sponsor Name - Name Context - Alternate Identifier");
    fieldDescMap.put("IN1-49-9-9", "Insured's ID Number - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("IN2-9-9-3", "Military Sponsor Name - Name Context - Name of Coding System");
    fieldDescMap.put("IN2-9-9-2", "Military Sponsor Name - Name Context - Text");
    fieldDescMap.put("GT1-5-13-2", "Guarantor Address - Effective Date - Degree of Precision");
    fieldDescMap.put("IN1-49-9-7",
        "Insured's ID Number - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("IN2-9-9-1", "Military Sponsor Name - Name Context - Identifier");
    fieldDescMap.put("IN1-49-9-8",
        "Insured's ID Number - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("PV1-9-19-2", "Consulting Doctor - Effective Date - Degree of Precision");
    fieldDescMap.put("PV1-9-19-1", "Consulting Doctor - Effective Date - Time");
    fieldDescMap.put("IN2-7-1-1", "Medicaid Case Name - Family Name - Surname");
    fieldDescMap.put("GT1-19-10-1",
        "Guarantor Employee ID Number - Assigning Agency or Department - Identifier");
    fieldDescMap.put("IN2-1-10", "Insured's Employee ID - Assigning Agency or Department");
    fieldDescMap.put("IN2-26-10-4",
        "Payor Subscriber ID - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("IN2-26-10-3",
        "Payor Subscriber ID - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("RXA-10-20-1", "Administering Provider - Expiration Date - Time");
    fieldDescMap.put("IN2-26-10-2", "Payor Subscriber ID - Assigning Agency or Department - Text");
    fieldDescMap
        .put("RXA-10-20-2", "Administering Provider - Expiration Date - Degree of Precision");
    fieldDescMap
        .put("IN2-26-10-1", "Payor Subscriber ID - Assigning Agency or Department - Identifier");
    fieldDescMap
        .put("IN2-61-6-3", "Patient Member Number - Assigning Facility - Universal ID Type");
    fieldDescMap.put("IN2-61-6-2", "Patient Member Number - Assigning Facility - Universal ID");
    fieldDescMap
        .put("NK1-13-8-3", "Organization Name - NK1 - Assigning Facility - Universal ID Type");
    fieldDescMap.put("IN2-61-6-1", "Patient Member Number - Assigning Facility - Namespace ID");
    fieldDescMap.put("NK1-13-8-1", "Organization Name - NK1 - Assigning Facility - Namespace ID");
    fieldDescMap.put("NK1-13-8-2", "Organization Name - NK1 - Assigning Facility - Universal ID");
    fieldDescMap
        .put("IN2-26-10-9", "Payor Subscriber ID - Assigning Agency or Department - Original Text");
    fieldDescMap.put("IN2-26-10-7",
        "Payor Subscriber ID - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("IN2-26-10-8",
        "Payor Subscriber ID - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("IN2-26-10-5",
        "Payor Subscriber ID - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("IN2-26-10-6",
        "Payor Subscriber ID - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("ORC-26-2", "Advanced Beneficiary Notice Override Reason - Text");
    fieldDescMap
        .put("ORC-26-3", "Advanced Beneficiary Notice Override Reason - Name of Coding System");
    fieldDescMap.put("ORC-26-1", "Advanced Beneficiary Notice Override Reason - Identifier");
    fieldDescMap.put("ORC-26-6",
        "Advanced Beneficiary Notice Override Reason - Name of Alternate Coding System");
    fieldDescMap
        .put("ORC-26-7", "Advanced Beneficiary Notice Override Reason - Coding System Version ID");
    fieldDescMap
        .put("ORC-26-4", "Advanced Beneficiary Notice Override Reason - Alternate Identifier");
    fieldDescMap.put("ORC-26-5", "Advanced Beneficiary Notice Override Reason - Alternate Text");
    fieldDescMap.put("PV1-37-2-1", "Discharged to Location - Effective Date - Time");
    fieldDescMap.put("ORC-26-8",
        "Advanced Beneficiary Notice Override Reason - Alternate Coding System Version ID");
    fieldDescMap.put("ORC-26-9", "Advanced Beneficiary Notice Override Reason - Original Text");
    fieldDescMap.put("PV1-37-2-2", "Discharged to Location - Effective Date - Degree of Precision");
    fieldDescMap.put("IN3-8-2-5", "Operator - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("IN3-8-2-4", "Operator - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("IN3-8-2-3", "Operator - Family Name - Own Surname");
    fieldDescMap.put("IN3-8-2-2", "Operator - Family Name - Own Surname Prefix");
    fieldDescMap.put("IN3-8-2-1", "Operator - Family Name - Surname");
    fieldDescMap.put("IN3-3-9-3", "Certified By - Assigning Authority - Universal ID Type");
    fieldDescMap.put("IN3-3-9-1", "Certified By - Assigning Authority - Namespace ID");
    fieldDescMap.put("IN3-3-9-2", "Certified By - Assigning Authority - Universal ID");
    fieldDescMap.put("IN1-3-9", "Insurance Company ID - Assigning Jurisdiction");
    fieldDescMap.put("IN1-3-8", "Insurance Company ID - Expiration Date");
    fieldDescMap.put("IN1-3-7", "Insurance Company ID - Effective Date");
    fieldDescMap.put("IN1-3-6", "Insurance Company ID - Assigning Facility");
    fieldDescMap.put("IN1-3-5", "Insurance Company ID - Identifier Type Code");
    fieldDescMap.put("IN1-3-4", "Insurance Company ID - Assigning Authority");
    fieldDescMap.put("IN1-3-3", "Insurance Company ID - Check Digit Scheme");
    fieldDescMap.put("IN1-3-2", "Insurance Company ID - Check Digit");
    fieldDescMap.put("IN1-3-1", "Insurance Company ID - ID Number");
    fieldDescMap.put("IN2-70-8-3",
        "Insured Employer Organization Name and ID - Assigning Facility - Universal ID Type");
    fieldDescMap.put("IN2-70-8-1",
        "Insured Employer Organization Name and ID - Assigning Facility - Namespace ID");
    fieldDescMap.put("IN2-70-8-2",
        "Insured Employer Organization Name and ID - Assigning Facility - Universal ID");
    fieldDescMap
        .put("GT1-54-2-2", "Guarantor Financial Class - Effective Date - Degree of Precision");
    fieldDescMap.put("GT1-54-2-1", "Guarantor Financial Class - Effective Date - Time");
    fieldDescMap.put("PV1-43-10", "Prior Temporary Location - Comprehensive Location Identifier");
    fieldDescMap.put("PV1-43-11", "Prior Temporary Location - Assigning Authority for Location");
    fieldDescMap.put("PV1-3-11-1",
        "Assigned Patient Location - Assigning Authority for Location - Namespace ID");
    fieldDescMap.put("NK1-9", "End Date");
    fieldDescMap.put("PV1-3-11-2",
        "Assigned Patient Location - Assigning Authority for Location - Universal ID");
    fieldDescMap.put("PV1-3-11-3",
        "Assigned Patient Location - Assigning Authority for Location - Universal ID Type");
    fieldDescMap.put("GT1-16-7", "Guarantor Employer Name - Name Type Code");
    fieldDescMap.put("GT1-16-8", "Guarantor Employer Name - Name Representation Code");
    fieldDescMap.put("GT1-16-9", "Guarantor Employer Name - Name Context");
    fieldDescMap.put("GT1-16-3",
        "Guarantor Employer Name - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("GT1-16-4", "Guarantor Employer Name - Suffix (e.g., JR or III)");
    fieldDescMap.put("GT1-16-5", "Guarantor Employer Name - Prefix (e.g., DR)");
    fieldDescMap.put("GT1-16-6", "Guarantor Employer Name - Degree (e.g., MD)");
    fieldDescMap.put("TQ1-6-1", "Service Duration - Quantity");
    fieldDescMap.put("GT1-16-1", "Guarantor Employer Name - Family Name");
    fieldDescMap.put("TQ1-6-2", "Service Duration - Units");
    fieldDescMap.put("GT1-16-2", "Guarantor Employer Name - Given Name");
    fieldDescMap.put("MSH-21-2", "Message Profile Identifier - Namespace ID");
    fieldDescMap.put("IN3-14-19-2", "Physician Reviewer - Effective Date - Degree of Precision");
    fieldDescMap.put("MSH-21-1", "Message Profile Identifier - Entity Identifier");
    populateFieldDescriptions5();
  }

  public void populateFieldDescriptions5() {
    fieldDescMap.put("NK1-35-6", "Race - Name of Alternate Coding System");
    fieldDescMap.put("IN3-14-19-1", "Physician Reviewer - Effective Date - Time");
    fieldDescMap.put("PV1-8-19-1", "Referring Doctor - Effective Date - Time");
    fieldDescMap.put("NK1-35-3", "Race - Name of Coding System");
    fieldDescMap.put("PV1-8-19-2", "Referring Doctor - Effective Date - Degree of Precision");
    fieldDescMap.put("NK1-35-2", "Race - Text");
    fieldDescMap.put("NK1-35-5", "Race - Alternate Text");
    fieldDescMap.put("NK1-35-4", "Race - Alternate Identifier");
    fieldDescMap.put("NK1-4", "Address");
    fieldDescMap.put("IN1-44-10", "Insured's Employer's Address - Census Tract");
    fieldDescMap.put("NK1-3", "Relationship");
    fieldDescMap.put("NK1-2", "Name");
    fieldDescMap.put("NK1-1", "Set ID - NK1");
    fieldDescMap.put("NK1-8", "Start Date");
    fieldDescMap.put("IN1-44-14", "Insured's Employer's Address - Expiration Date");
    fieldDescMap.put("NK1-7", "Contact Role");
    fieldDescMap.put("IN1-44-13", "Insured's Employer's Address - Effective Date");
    fieldDescMap.put("NK1-6", "Business Phone Number");
    fieldDescMap.put("IN1-44-12", "Insured's Employer's Address - Address Validity Range");
    fieldDescMap.put("NK1-5", "Phone Number");
    fieldDescMap.put("IN1-44-11", "Insured's Employer's Address - Address Representation Code");
    fieldDescMap.put("PV1-9-21", "Consulting Doctor - Professional Suffix");
    fieldDescMap.put("PV1-9-20", "Consulting Doctor - Expiration Date");
    fieldDescMap.put("PV1-9-23", "Consulting Doctor - Assigning Agency or Department");
    fieldDescMap.put("MSH-21-3", "Message Profile Identifier - Universal ID");
    fieldDescMap.put("PV1-9-22", "Consulting Doctor - Assigning Jurisdiction");
    fieldDescMap.put("MSH-21-4", "Message Profile Identifier - Universal ID Type");
    fieldDescMap.put("NK1-0", "Next of Kin / Associated Parties");
    fieldDescMap.put("PV1-9-19", "Consulting Doctor - Effective Date");
    fieldDescMap.put("NK1-35-1", "Race - Identifier");
    fieldDescMap.put("PV1-9-18", "Consulting Doctor - Name Assembly Order");
    fieldDescMap.put("PV1-9-17", "Consulting Doctor - Name Validity Range");
    fieldDescMap.put("PV1-9-16", "Consulting Doctor - Name Context");
    fieldDescMap.put("PV1-9-15", "Consulting Doctor - Name Representation Code");
    fieldDescMap.put("PV1-9-14", "Consulting Doctor - Assigning Facility");
    fieldDescMap.put("PV1-9-13", "Consulting Doctor - Identifier Type Code");
    fieldDescMap.put("PV1-9-12", "Consulting Doctor - Check Digit Scheme");
    fieldDescMap.put("PV1-9-11", "Consulting Doctor - Identifier Check Digit");
    fieldDescMap.put("PV1-9-10", "Consulting Doctor - Name Type Code");
    fieldDescMap.put("PV1-9-23-6",
        "Consulting Doctor - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("PV1-9-23-7",
        "Consulting Doctor - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("PV1-9-23-8",
        "Consulting Doctor - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap
        .put("PV1-9-23-9", "Consulting Doctor - Assigning Agency or Department - Original Text");
    fieldDescMap.put("ORC-19-2", "Action By - Family Name");
    fieldDescMap.put("ORC-19-3", "Action By - Given Name");
    fieldDescMap.put("IN2-65-6", "Military Handicapped Program - Name of Alternate Coding System");
    fieldDescMap.put("ORC-19-1", "Action By - ID Number");
    fieldDescMap.put("ORC-19-6", "Action By - Prefix (e.g., DR)");
    fieldDescMap.put("PV1-8-22-6",
        "Referring Doctor - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("ORC-19-7", "Action By - Degree (e.g., MD)");
    fieldDescMap
        .put("PV1-8-22-7", "Referring Doctor - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("PID-18-10", "Patient Account Number - Assigning Agency or Department");
    fieldDescMap.put("ORC-19-4", "Action By - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("PV1-8-22-8",
        "Referring Doctor - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("ORC-19-5", "Action By - Suffix (e.g., JR or III)");
    fieldDescMap.put("PV1-8-22-9", "Referring Doctor - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("GT1-6-11", "Guarantor Ph Num - Home - Speed Dial Code");
    fieldDescMap.put("GT1-27-5-6",
        "Guarantor Household Annual Income - Range Units - Name of Alternate Coding System");
    fieldDescMap.put("IN2-3-23-3",
        "Insured's Employer's Name and ID - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("GT1-6-12", "Guarantor Ph Num - Home - Unformatted Telephone number");
    fieldDescMap
        .put("GT1-27-5-5", "Guarantor Household Annual Income - Range Units - Alternate Text");
    fieldDescMap.put("IN2-3-23-2",
        "Insured's Employer's Name and ID - Assigning Agency or Department - Text");
    fieldDescMap.put("IN2-65-1", "Military Handicapped Program - Identifier");
    fieldDescMap.put("GT1-27-5-4",
        "Guarantor Household Annual Income - Range Units - Alternate Identifier");
    fieldDescMap.put("IN2-3-23-5",
        "Insured's Employer's Name and ID - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("GT1-27-5-3",
        "Guarantor Household Annual Income - Range Units - Name of Coding System");
    fieldDescMap.put("IN2-3-23-4",
        "Insured's Employer's Name and ID - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("IN2-65-3", "Military Handicapped Program - Name of Coding System");
    fieldDescMap.put("GT1-27-5-2", "Guarantor Household Annual Income - Range Units - Text");
    fieldDescMap.put("IN2-3-23-7",
        "Insured's Employer's Name and ID - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("IN2-65-2", "Military Handicapped Program - Text");
    fieldDescMap.put("GT1-27-5-1", "Guarantor Household Annual Income - Range Units - Identifier");
    fieldDescMap.put("IN2-3-23-6",
        "Insured's Employer's Name and ID - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("IN2-65-5", "Military Handicapped Program - Alternate Text");
    fieldDescMap.put("IN2-3-23-9",
        "Insured's Employer's Name and ID - Assigning Agency or Department - Original Text");
    fieldDescMap.put("IN2-65-4", "Military Handicapped Program - Alternate Identifier");
    fieldDescMap.put("IN2-3-23-8",
        "Insured's Employer's Name and ID - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("GT1-6-10", "Guarantor Ph Num - Home - Extension Prefix");
    fieldDescMap.put("IN2-3-23-1",
        "Insured's Employer's Name and ID - Assigning Agency or Department - Identifier");
    fieldDescMap
        .put("PV1-9-23-5", "Consulting Doctor - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("PV1-9-23-4",
        "Consulting Doctor - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("PV1-9-23-3",
        "Consulting Doctor - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("PV1-9-23-2", "Consulting Doctor - Assigning Agency or Department - Text");
    fieldDescMap
        .put("PV1-9-23-1", "Consulting Doctor - Assigning Agency or Department - Identifier");
    fieldDescMap.put("IN3-25-19-1", "Second Opinion Physician - Effective Date - Time");
    fieldDescMap
        .put("IN3-25-19-2", "Second Opinion Physician - Effective Date - Degree of Precision");
    fieldDescMap.put("OBX-25-9-3",
        "Performing Organization Medical Director - Assigning Authority - Universal ID Type");
    fieldDescMap.put("OBX-25-9-2",
        "Performing Organization Medical Director - Assigning Authority - Universal ID");
    fieldDescMap.put("OBX-25-9-1",
        "Performing Organization Medical Director - Assigning Authority - Namespace ID");
    fieldDescMap.put("GT1-11-6", "Guarantor Relationship - Name of Alternate Coding System");
    fieldDescMap.put("GT1-11-5", "Guarantor Relationship - Alternate Text");
    fieldDescMap.put("GT1-11-4", "Guarantor Relationship - Alternate Identifier");
    fieldDescMap.put("IN2-49-9-1", "Employer Contact Person Name - Name Context - Identifier");
    fieldDescMap
        .put("IN2-49-9-3", "Employer Contact Person Name - Name Context - Name of Coding System");
    fieldDescMap.put("IN2-49-9-2", "Employer Contact Person Name - Name Context - Text");
    fieldDescMap.put("IN2-49-9-5", "Employer Contact Person Name - Name Context - Alternate Text");
    fieldDescMap
        .put("IN2-49-9-4", "Employer Contact Person Name - Name Context - Alternate Identifier");
    fieldDescMap.put("IN2-49-9-6",
        "Employer Contact Person Name - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("PV1-5-6-3", "Preadmit Number - Assigning Facility - Universal ID Type");
    fieldDescMap.put("PV1-5-6-2", "Preadmit Number - Assigning Facility - Universal ID");
    fieldDescMap.put("PV1-5-6-1", "Preadmit Number - Assigning Facility - Namespace ID");
    fieldDescMap.put("NK1-14-5", "Marital Status - Alternate Text");
    fieldDescMap.put("NK1-14-6", "Marital Status - Name of Alternate Coding System");
    fieldDescMap.put("NK1-14-1", "Marital Status - Identifier");
    fieldDescMap.put("GT1-11-2", "Guarantor Relationship - Text");
    fieldDescMap.put("NK1-14-2", "Marital Status - Text");
    fieldDescMap.put("GT1-11-3", "Guarantor Relationship - Name of Coding System");
    fieldDescMap.put("NK1-14-3", "Marital Status - Name of Coding System");
    fieldDescMap.put("NK1-14-4", "Marital Status - Alternate Identifier");
    fieldDescMap.put("GT1-11-1", "Guarantor Relationship - Identifier");
    fieldDescMap.put("NK1-32-14-1", "Contact Person's Address - Expiration Date - Time");
    fieldDescMap
        .put("NK1-32-14-2", "Contact Person's Address - Expiration Date - Degree of Precision");
    fieldDescMap.put("RXA-14-1", "Administered Strength Units - Identifier");
    fieldDescMap.put("RXA-14-2", "Administered Strength Units - Text");
    fieldDescMap.put("RXA-14-3", "Administered Strength Units - Name of Coding System");
    fieldDescMap.put("RXA-14-4", "Administered Strength Units - Alternate Identifier");
    fieldDescMap.put("ORC-19-9", "Action By - Assigning Authority");
    fieldDescMap.put("RXA-14-5", "Administered Strength Units - Alternate Text");
    fieldDescMap.put("ORC-19-8", "Action By - Source Table");
    fieldDescMap.put("RXA-14-6", "Administered Strength Units - Name of Alternate Coding System");
    fieldDescMap.put("NK1-32-12", "Contact Person's Address - Address Validity Range");
    fieldDescMap.put("NK1-32-13", "Contact Person's Address - Effective Date");
    fieldDescMap.put("NK1-32-10", "Contact Person's Address - Census Tract");
    fieldDescMap.put("NK1-32-11", "Contact Person's Address - Address Representation Code");
    fieldDescMap.put("ORC-12-8", "Ordering Provider - Source Table");
    fieldDescMap.put("ORC-12-7", "Ordering Provider - Degree (e.g., MD)");
    fieldDescMap.put("ORC-12-9", "Ordering Provider - Assigning Authority");
    fieldDescMap
        .put("ORC-12-4", "Ordering Provider - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("ORC-12-3", "Ordering Provider - Given Name");
    fieldDescMap.put("ORC-12-6", "Ordering Provider - Prefix (e.g., DR)");
    fieldDescMap.put("ORC-12-5", "Ordering Provider - Suffix (e.g., JR or III)");
    fieldDescMap.put("ORC-12-2", "Ordering Provider - Family Name");
    fieldDescMap.put("NK1-32-14", "Contact Person's Address - Expiration Date");
    fieldDescMap.put("ORC-12-1", "Ordering Provider - ID Number");
    fieldDescMap.put("GT1-50", "Job Code/Class");
    fieldDescMap.put("GT1-51", "Guarantor Employer's Organization Name");
    fieldDescMap.put("GT1-52", "Handicap");
    fieldDescMap.put("GT1-53", "Job Status");
    fieldDescMap.put("ORC-19-2-4", "Action By - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("ORC-19-2-3", "Action By - Family Name - Own Surname");
    fieldDescMap.put("ORC-19-2-5", "Action By - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("PV1-42-4-1", "Pending Location - Facility - Namespace ID");
    fieldDescMap.put("PV1-42-4-2", "Pending Location - Facility - Universal ID");
    fieldDescMap.put("NK1-5-12", "Phone Number - Unformatted Telephone number");
    fieldDescMap.put("GT1-54", "Guarantor Financial Class");
    fieldDescMap.put("PV1-42-4-3", "Pending Location - Facility - Universal ID Type");
    fieldDescMap.put("GT1-55", "Guarantor Race");
    fieldDescMap.put("NK1-5-10", "Phone Number - Extension Prefix");
    fieldDescMap.put("GT1-56", "Guarantor Birth Place");
    fieldDescMap.put("NK1-5-11", "Phone Number - Speed Dial Code");
    fieldDescMap.put("GT1-57", "VIP Indicator");
    fieldDescMap.put("ORC-3-3", "Filler Order Number - Universal ID");
    fieldDescMap.put("ORC-3-4", "Filler Order Number - Universal ID Type");
    fieldDescMap.put("ORC-3-1", "Filler Order Number - Entity Identifier");
    fieldDescMap.put("ORC-3-2", "Filler Order Number - Namespace ID");
    fieldDescMap.put("IN1-9-6-1", "Group Name - Assigning Authority - Namespace ID");
    fieldDescMap.put("IN1-9-6-2", "Group Name - Assigning Authority - Universal ID");
    fieldDescMap.put("IN1-9-6-3", "Group Name - Assigning Authority - Universal ID Type");
    fieldDescMap.put("GT1-41", "Religion");
    fieldDescMap.put("GT1-42", "Mother's Maiden Name");
    fieldDescMap.put("GT1-40", "Student Indicator");
    fieldDescMap.put("GT1-49", "Job Title");
    fieldDescMap.put("GT1-47", "Contact Reason");
    fieldDescMap.put("GT1-48", "Contact Relationship");
    fieldDescMap.put("GT1-45", "Contact Person's Name");
    fieldDescMap.put("GT1-46", "Contact Person's Telephone Number");
    fieldDescMap.put("GT1-43", "Nationality");
    fieldDescMap.put("GT1-44", "Ethnic Group");
    fieldDescMap.put("ORC-19-2-1", "Action By - Family Name - Surname");
    fieldDescMap.put("ORC-12-14-1", "Ordering Provider - Assigning Facility - Namespace ID");
    fieldDescMap.put("ORC-19-2-2", "Action By - Family Name - Own Surname Prefix");
    fieldDescMap.put("ORC-12-14-2", "Ordering Provider - Assigning Facility - Universal ID");
    fieldDescMap.put("ORC-12-14-3", "Ordering Provider - Assigning Facility - Universal ID Type");
    fieldDescMap.put("IN3-3-19-1", "Certified By - Effective Date - Time");
    fieldDescMap.put("IN3-3-19-2", "Certified By - Effective Date - Degree of Precision");
    fieldDescMap.put("PV1-52-23-4",
        "Other Healthcare Provider - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("PV1-52-23-5",
        "Other Healthcare Provider - Assigning Agency or Department - Alternate Text");
    fieldDescMap
        .put("PV1-52-23-2", "Other Healthcare Provider - Assigning Agency or Department - Text");
    fieldDescMap.put("PV1-52-23-3",
        "Other Healthcare Provider - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("PV1-52-23-1",
        "Other Healthcare Provider - Assigning Agency or Department - Identifier");
    fieldDescMap.put("PV1-52-23-8",
        "Other Healthcare Provider - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("PV1-52-23-9",
        "Other Healthcare Provider - Assigning Agency or Department - Original Text");
    fieldDescMap.put("PV1-52-23-6",
        "Other Healthcare Provider - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("PV1-52-23-7",
        "Other Healthcare Provider - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("GT1-16-13", "Guarantor Employer Name - Expiration Date");
    fieldDescMap.put("GT1-16-12", "Guarantor Employer Name - Effective Date");
    fieldDescMap.put("GT1-16-14", "Guarantor Employer Name - Professional Suffix");
    fieldDescMap.put("PV1-8-7", "Referring Doctor - Degree (e.g., MD)");
    fieldDescMap.put("GT1-16-10", "Guarantor Employer Name - Name Validity Range");
    fieldDescMap.put("PV1-8-22-1", "Referring Doctor - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("PV1-8-8", "Referring Doctor - Source Table");
    fieldDescMap.put("GT1-16-11", "Guarantor Employer Name - Name Assembly Order");
    fieldDescMap.put("PV1-8-9", "Referring Doctor - Assigning Authority");
    fieldDescMap
        .put("PV1-8-22-4", "Referring Doctor - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("PV1-8-22-5", "Referring Doctor - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("PV1-8-22-2", "Referring Doctor - Assigning Jurisdiction - Text");
    fieldDescMap
        .put("PV1-8-22-3", "Referring Doctor - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("IN2-7-9", "Medicaid Case Name - Name Context");
    fieldDescMap.put("IN2-7-8", "Medicaid Case Name - Name Representation Code");
    fieldDescMap.put("IN2-7-7", "Medicaid Case Name - Name Type Code");
    fieldDescMap.put("IN2-7-6", "Medicaid Case Name - Degree (e.g., MD)");
    fieldDescMap.put("PV1-17-14-1", "Admitting Doctor - Assigning Facility - Namespace ID");
    fieldDescMap.put("PV1-17-14-2", "Admitting Doctor - Assigning Facility - Universal ID");
    fieldDescMap
        .put("GT1-21-6-1", "Guarantor Organization Name - Assigning Authority - Namespace ID");
    fieldDescMap.put("PV1-17-14-3", "Admitting Doctor - Assigning Facility - Universal ID Type");
    fieldDescMap
        .put("GT1-21-6-2", "Guarantor Organization Name - Assigning Authority - Universal ID");
    fieldDescMap
        .put("GT1-21-6-3", "Guarantor Organization Name - Assigning Authority - Universal ID Type");
    fieldDescMap.put("ORC-21", "Ordering Facility Name");
    fieldDescMap.put("IN1-49-4-2", "Insured's ID Number - Assigning Authority - Universal ID");
    fieldDescMap
        .put("IN2-9-1-5", "Military Sponsor Name - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("ORC-22", "Ordering Facility Address");
    fieldDescMap.put("PID-18-1", "Patient Account Number - ID Number");
    fieldDescMap.put("IN1-49-4-3", "Insured's ID Number - Assigning Authority - Universal ID Type");
    fieldDescMap.put("IN2-9-1-4",
        "Military Sponsor Name - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("ORC-23", "Ordering Facility Phone Number");
    fieldDescMap.put("PID-18-2", "Patient Account Number - Check Digit");
    fieldDescMap.put("ORC-24", "Ordering Provider Address");
    fieldDescMap.put("PID-18-3", "Patient Account Number - Check Digit Scheme");
    fieldDescMap.put("IN1-49-4-1", "Insured's ID Number - Assigning Authority - Namespace ID");
    fieldDescMap.put("IN2-9-1-1", "Military Sponsor Name - Family Name - Surname");
    fieldDescMap.put("IN2-9-1-3", "Military Sponsor Name - Family Name - Own Surname");
    fieldDescMap.put("ORC-20", "Advanced Beneficiary Notice Code");
    fieldDescMap.put("IN2-9-1-2", "Military Sponsor Name - Family Name - Own Surname Prefix");
    fieldDescMap.put("PID-18-9", "Patient Account Number - Assigning Jurisdiction");
    fieldDescMap.put("IN1-18-2", "Insured's Date Of Birth - Degree of Precision");
    fieldDescMap.put("ORC-29", "Order Type");
    fieldDescMap.put("PID-18-8", "Patient Account Number - Expiration Date");
    fieldDescMap.put("IN1-18-1", "Insured's Date Of Birth - Time");
    fieldDescMap.put("ORC-26", "Advanced Beneficiary Notice Override Reason");
    fieldDescMap.put("PID-18-5", "Patient Account Number - Identifier Type Code");
    fieldDescMap.put("ORC-25", "Order Status Modifier");
    fieldDescMap.put("PID-18-4", "Patient Account Number - Assigning Authority");
    fieldDescMap.put("ORC-28", "Confidentiality Code");
    fieldDescMap.put("PID-18-7", "Patient Account Number - Effective Date");
    fieldDescMap.put("ORC-27", "Filler's Expected Availability Date/Time");
    fieldDescMap.put("PID-18-6", "Patient Account Number - Assigning Facility");
    fieldDescMap
        .put("SFT-1-8-3", "Software Vendor Organization - Assigning Facility - Universal ID Type");
    fieldDescMap
        .put("SFT-1-8-1", "Software Vendor Organization - Assigning Facility - Namespace ID");
    fieldDescMap
        .put("SFT-1-8-2", "Software Vendor Organization - Assigning Facility - Universal ID");
    fieldDescMap.put("NK1-28-5", "Ethnic Group - Alternate Text");
    fieldDescMap.put("NK1-28-4", "Ethnic Group - Alternate Identifier");
    fieldDescMap.put("PV1-8-1", "Referring Doctor - ID Number");
    fieldDescMap.put("NK1-28-3", "Ethnic Group - Name of Coding System");
    fieldDescMap.put("PV1-8-2", "Referring Doctor - Family Name");
    fieldDescMap.put("NK1-28-2", "Ethnic Group - Text");
    fieldDescMap.put("PV1-8-3", "Referring Doctor - Given Name");
    fieldDescMap.put("NK1-28-1", "Ethnic Group - Identifier");
    fieldDescMap
        .put("PV1-8-4", "Referring Doctor - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("PV1-8-5", "Referring Doctor - Suffix (e.g., JR or III)");
    fieldDescMap.put("PV1-8-6", "Referring Doctor - Prefix (e.g., DR)");
    fieldDescMap.put("ORC-12", "Ordering Provider");
    fieldDescMap.put("ORC-13", "Enterer's Location");
    fieldDescMap.put("ORC-10", "Entered By");
    fieldDescMap.put("ORC-11", "Verified By");
    fieldDescMap.put("OBX-24-14-1", "Performing Organization Address - Expiration Date - Time");
    fieldDescMap.put("OBX-24-14-2",
        "Performing Organization Address - Expiration Date - Degree of Precision");
    fieldDescMap.put("NK1-28-6", "Ethnic Group - Name of Alternate Coding System");
    fieldDescMap.put("IN2-7-1", "Medicaid Case Name - Family Name");
    fieldDescMap.put("ORC-19", "Action By");
    fieldDescMap.put("ORC-18", "Entering Device");
    fieldDescMap.put("ORC-17", "Entering Organization");
    fieldDescMap.put("PV1-52-22-8",
        "Other Healthcare Provider - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("IN2-7-5", "Medicaid Case Name - Prefix (e.g., DR)");
    fieldDescMap.put("ORC-16", "Order Control Code Reason");
    fieldDescMap.put("PV1-52-22-7",
        "Other Healthcare Provider - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("IN2-7-4", "Medicaid Case Name - Suffix (e.g., JR or III)");
    fieldDescMap.put("ORC-15", "Order Effective Date/Time");
    fieldDescMap
        .put("IN2-7-3", "Medicaid Case Name - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("ORC-14", "Call Back Phone Number");
    fieldDescMap
        .put("PV1-52-22-9", "Other Healthcare Provider - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("IN2-7-2", "Medicaid Case Name - Given Name");
    fieldDescMap.put("PV1-52-22-4",
        "Other Healthcare Provider - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("PV1-52-22-3",
        "Other Healthcare Provider - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("PV1-52-22-6",
        "Other Healthcare Provider - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap
        .put("PV1-52-22-5", "Other Healthcare Provider - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("PV1-52-22-2", "Other Healthcare Provider - Assigning Jurisdiction - Text");
    fieldDescMap
        .put("PV1-52-22-1", "Other Healthcare Provider - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("RXR-0", "Pharmacy/Treatment Route");
    fieldDescMap.put("IN3-25-22-4",
        "Second Opinion Physician - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap
        .put("IN3-25-22-5", "Second Opinion Physician - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("IN3-25-22-2", "Second Opinion Physician - Assigning Jurisdiction - Text");
    fieldDescMap.put("IN3-25-22-3",
        "Second Opinion Physician - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("IN3-25-22-8",
        "Second Opinion Physician - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap
        .put("IN3-25-22-9", "Second Opinion Physician - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("IN3-25-22-6",
        "Second Opinion Physician - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("IN3-25-22-7",
        "Second Opinion Physician - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("NK1-26-10", "Mother's Maiden Name - Name Validity Range");
    fieldDescMap
        .put("PV1-7-16-6", "Attending Doctor - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("PV1-7-16-4", "Attending Doctor - Name Context - Alternate Identifier");
    fieldDescMap.put("PV1-7-16-5", "Attending Doctor - Name Context - Alternate Text");
    fieldDescMap.put("PV1-7-16-2", "Attending Doctor - Name Context - Text");
    fieldDescMap.put("PV1-7-16-3", "Attending Doctor - Name Context - Name of Coding System");
    fieldDescMap.put("PV1-7-16-1", "Attending Doctor - Name Context - Identifier");
    fieldDescMap.put("NTE-4-1", "Comment Type - Identifier");
    fieldDescMap.put("NK1-26-12", "Mother's Maiden Name - Effective Date");
    fieldDescMap.put("NTE-4-2", "Comment Type - Text");
    fieldDescMap.put("NK1-26-11", "Mother's Maiden Name - Name Assembly Order");
    fieldDescMap.put("RXR-5", "Routing Instruction");
    fieldDescMap.put("NK1-26-14", "Mother's Maiden Name - Professional Suffix");
    fieldDescMap.put("RXR-6", "Administration Site Modifier");
    fieldDescMap.put("NK1-26-13", "Mother's Maiden Name - Expiration Date");
    fieldDescMap.put("NTE-4-5", "Comment Type - Alternate Text");
    fieldDescMap.put("RXR-3", "Administration Device");
    fieldDescMap
        .put("IN3-25-22-1", "Second Opinion Physician - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("NTE-4-6", "Comment Type - Name of Alternate Coding System");
    fieldDescMap.put("RXR-4", "Administration Method");
    fieldDescMap.put("NTE-4-3", "Comment Type - Name of Coding System");
    fieldDescMap.put("RXR-1", "Route");
    fieldDescMap.put("NTE-4-4", "Comment Type - Alternate Identifier");
    fieldDescMap.put("RXR-2", "Administration Site");
    fieldDescMap.put("PID-10-2", "Race - Text");
    fieldDescMap.put("PID-10-3", "Race - Name of Coding System");
    fieldDescMap.put("IN2-43-6", "Marital Status - Name of Alternate Coding System");
    fieldDescMap.put("PID-10-1", "Race - Identifier");
    fieldDescMap.put("PID-10-6", "Race - Name of Alternate Coding System");
    fieldDescMap.put("NK1-7-4", "Contact Role - Alternate Identifier");
    fieldDescMap.put("IN2-43-3", "Marital Status - Name of Coding System");
    fieldDescMap.put("NK1-7-3", "Contact Role - Name of Coding System");
    fieldDescMap.put("IN2-43-2", "Marital Status - Text");
    fieldDescMap.put("PID-10-4", "Race - Alternate Identifier");
    fieldDescMap.put("NK1-7-6", "Contact Role - Name of Alternate Coding System");
    fieldDescMap.put("IN2-43-5", "Marital Status - Alternate Text");
    fieldDescMap.put("PID-10-5", "Race - Alternate Text");
    fieldDescMap.put("NK1-7-5", "Contact Role - Alternate Text");
    fieldDescMap.put("IN2-43-4", "Marital Status - Alternate Identifier");
    fieldDescMap.put("NK1-7-2", "Contact Role - Text");
    fieldDescMap.put("IN2-43-1", "Marital Status - Identifier");
    fieldDescMap.put("NK1-7-1", "Contact Role - Identifier");
    fieldDescMap.put("IN1-30-19-2", "Verification By - Effective Date - Degree of Precision");
    fieldDescMap.put("IN1-30-19-1", "Verification By - Effective Date - Time");
    fieldDescMap.put("PID-3-10", "Patient Identifier List - Assigning Agency or Department");
    fieldDescMap.put("IN3-3-23-9", "Certified By - Assigning Agency or Department - Original Text");
    fieldDescMap.put("IN3-3-23-8",
        "Certified By - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("IN3-3-23-7",
        "Certified By - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("IN3-3-23-6",
        "Certified By - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap
        .put("IN3-3-23-5", "Certified By - Assigning Agency or Department - Alternate Text");
    fieldDescMap
        .put("IN3-3-23-4", "Certified By - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap
        .put("IN3-3-23-3", "Certified By - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("PID-5-12-1", "Patient Name - Effective Date - Time");
    fieldDescMap.put("IN3-12-4", "Non-Concur Code/Description - Alternate Identifier");
    fieldDescMap.put("IN3-12-3", "Non-Concur Code/Description - Name of Coding System");
    fieldDescMap.put("IN3-12-2", "Non-Concur Code/Description - Text");
    fieldDescMap.put("IN3-12-1", "Non-Concur Code/Description - Identifier");
    fieldDescMap.put("IN3-12-6", "Non-Concur Code/Description - Name of Alternate Coding System");
    fieldDescMap.put("IN3-12-5", "Non-Concur Code/Description - Alternate Text");
    fieldDescMap
        .put("GT1-29-6-1", "Guarantor Employer ID Number - Assigning Facility - Namespace ID");
    fieldDescMap
        .put("GT1-29-6-3", "Guarantor Employer ID Number - Assigning Facility - Universal ID Type");
    fieldDescMap
        .put("GT1-29-6-2", "Guarantor Employer ID Number - Assigning Facility - Universal ID");
    fieldDescMap
        .put("IN2-49-13-2", "Employer Contact Person Name - Expiration Date - Degree of Precision");
    fieldDescMap.put("IN2-49-13-1", "Employer Contact Person Name - Expiration Date - Time");
    fieldDescMap.put("PV1-7-22-9", "Attending Doctor - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("PID-22-6", "Ethnic Group - Name of Alternate Coding System");
    fieldDescMap.put("PID-22-5", "Ethnic Group - Alternate Text");
    fieldDescMap.put("PID-22-4", "Ethnic Group - Alternate Identifier");
    fieldDescMap.put("PID-22-3", "Ethnic Group - Name of Coding System");
    fieldDescMap.put("PV2-4-1", "Transfer Reason - Identifier");
    fieldDescMap.put("ORC-12-2-2", "Ordering Provider - Family Name - Own Surname Prefix");
    fieldDescMap.put("PV1-7-22-5", "Attending Doctor - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("ORC-12-2-3", "Ordering Provider - Family Name - Own Surname");
    fieldDescMap.put("PV1-7-22-6",
        "Attending Doctor - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap
        .put("ORC-12-2-4", "Ordering Provider - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap
        .put("PV1-7-22-7", "Attending Doctor - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("ORC-12-2-5", "Ordering Provider - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("PV1-7-22-8",
        "Attending Doctor - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("PV2-4-6", "Transfer Reason - Name of Alternate Coding System");
    fieldDescMap.put("NK1-2-13-2", "Name - Expiration Date - Degree of Precision");
    fieldDescMap.put("ORC-12-2-1", "Ordering Provider - Family Name - Surname");
    fieldDescMap.put("NK1-2-13-1", "Name - Expiration Date - Time");
    fieldDescMap.put("PID-22-2", "Ethnic Group - Text");
    fieldDescMap.put("PV2-4-2", "Transfer Reason - Text");
    fieldDescMap.put("PID-22-1", "Ethnic Group - Identifier");
    fieldDescMap.put("PV2-4-3", "Transfer Reason - Name of Coding System");
    fieldDescMap.put("PV2-4-4", "Transfer Reason - Alternate Identifier");
    fieldDescMap.put("PV2-4-5", "Transfer Reason - Alternate Text");
    fieldDescMap.put("ORC-31", "Parent Universal Service Identifier");
    fieldDescMap.put("PID-3-10-7",
        "Patient Identifier List - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("ORC-30", "Enterer Authorization Mode");
    fieldDescMap.put("PID-3-10-6",
        "Patient Identifier List - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("PID-3-10-9",
        "Patient Identifier List - Assigning Agency or Department - Original Text");
    fieldDescMap.put("PID-3-10-8",
        "Patient Identifier List - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("PID-3-10-3",
        "Patient Identifier List - Assigning Agency or Department - Name of Coding System");
    fieldDescMap
        .put("PID-3-10-2", "Patient Identifier List - Assigning Agency or Department - Text");
    fieldDescMap.put("PID-3-10-5",
        "Patient Identifier List - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("PID-3-10-4",
        "Patient Identifier List - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("PID-5-12-2", "Patient Name - Effective Date - Degree of Precision");
    fieldDescMap.put("OBX-25-1", "Performing Organization Medical Director - ID Number");
    fieldDescMap.put("OBX-25-2", "Performing Organization Medical Director - Family Name");
    fieldDescMap.put("OBX-25-3", "Performing Organization Medical Director - Given Name");
    fieldDescMap.put("OBX-25-4",
        "Performing Organization Medical Director - Second and Further Given Names or Initials Thereof");
    fieldDescMap
        .put("OBX-25-5", "Performing Organization Medical Director - Suffix (e.g., JR or III)");
    fieldDescMap.put("OBX-25-6", "Performing Organization Medical Director - Prefix (e.g., DR)");
    fieldDescMap.put("OBX-25-7", "Performing Organization Medical Director - Degree (e.g., MD)");
    fieldDescMap.put("OBX-25-8", "Performing Organization Medical Director - Source Table");
    fieldDescMap.put("OBX-25-9", "Performing Organization Medical Director - Assigning Authority");
    fieldDescMap
        .put("PV1-7-22-4", "Attending Doctor - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("PID-6-12-1", "Mother's Maiden Name - Effective Date - Time");
    fieldDescMap
        .put("PV1-7-22-3", "Attending Doctor - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("PID-6-12-2", "Mother's Maiden Name - Effective Date - Degree of Precision");
    fieldDescMap.put("PV1-7-22-2", "Attending Doctor - Assigning Jurisdiction - Text");
    fieldDescMap.put("PV1-7-22-1", "Attending Doctor - Assigning Jurisdiction - Identifier");
    fieldDescMap
        .put("PD1-3-6-3", "Patient Primary Facility - Assigning Authority - Universal ID Type");
    fieldDescMap.put("PD1-3-6-1", "Patient Primary Facility - Assigning Authority - Namespace ID");
    fieldDescMap.put("PD1-3-6-2", "Patient Primary Facility - Assigning Authority - Universal ID");
    fieldDescMap.put("OBX-16-8", "Responsible Observer - Source Table");
    fieldDescMap.put("OBX-16-9", "Responsible Observer - Assigning Authority");
    fieldDescMap.put("PV1-17-20-2", "Admitting Doctor - Expiration Date - Degree of Precision");
    fieldDescMap.put("OBX-16-4",
        "Responsible Observer - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("PV1-17-20-1", "Admitting Doctor - Expiration Date - Time");
    fieldDescMap.put("OBX-16-5", "Responsible Observer - Suffix (e.g., JR or III)");
    fieldDescMap.put("OBX-16-6", "Responsible Observer - Prefix (e.g., DR)");
    fieldDescMap.put("OBX-16-7", "Responsible Observer - Degree (e.g., MD)");
    fieldDescMap.put("GT1-3-13-1", "Guarantor Name - Expiration Date - Time");
    fieldDescMap.put("OBX-16-1", "Responsible Observer - ID Number");
    fieldDescMap.put("OBX-16-2", "Responsible Observer - Family Name");
    fieldDescMap.put("OBX-16-3", "Responsible Observer - Given Name");
    fieldDescMap.put("GT1-3-13-2", "Guarantor Name - Expiration Date - Degree of Precision");
    fieldDescMap.put("GT1-43-5", "Nationality - Alternate Text");
    fieldDescMap.put("GT1-43-6", "Nationality - Name of Alternate Coding System");
    fieldDescMap.put("GT1-3-2", "Guarantor Name - Given Name");
    fieldDescMap.put("GT1-3-1", "Guarantor Name - Family Name");
    fieldDescMap.put("GT1-3-5", "Guarantor Name - Prefix (e.g., DR)");
    fieldDescMap.put("GT1-3-6", "Guarantor Name - Degree (e.g., MD)");
    fieldDescMap
        .put("GT1-3-3", "Guarantor Name - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("GT1-3-4", "Guarantor Name - Suffix (e.g., JR or III)");
    fieldDescMap.put("GT1-3-9", "Guarantor Name - Name Context");
    fieldDescMap.put("GT1-43-4", "Nationality - Alternate Identifier");
    fieldDescMap.put("GT1-43-3", "Nationality - Name of Coding System");
    fieldDescMap.put("GT1-3-7", "Guarantor Name - Name Type Code");
    fieldDescMap.put("GT1-43-2", "Nationality - Text");
    fieldDescMap.put("GT1-3-8", "Guarantor Name - Name Representation Code");
    fieldDescMap.put("GT1-43-1", "Nationality - Identifier");
    fieldDescMap.put("ORC-10-13", "Entered By - Identifier Type Code");
    fieldDescMap.put("PV2-13-22-7",
        "Referral Source Code - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("ORC-10-12", "Entered By - Check Digit Scheme");
    fieldDescMap.put("PV2-13-22-8",
        "Referral Source Code - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("ORC-10-11", "Entered By - Identifier Check Digit");
    fieldDescMap
        .put("PV2-13-22-9", "Referral Source Code - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("ORC-10-10", "Entered By - Name Type Code");
    fieldDescMap.put("ORC-10-17", "Entered By - Name Validity Range");
    fieldDescMap.put("PV2-13-22-3",
        "Referral Source Code - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("ORC-10-16", "Entered By - Name Context");
    fieldDescMap
        .put("PV2-13-22-4", "Referral Source Code - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("ORC-10-15", "Entered By - Name Representation Code");
    fieldDescMap
        .put("PV2-13-22-5", "Referral Source Code - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("ORC-10-14", "Entered By - Assigning Facility");
    fieldDescMap.put("PV2-13-22-6",
        "Referral Source Code - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("ORC-10-19", "Entered By - Effective Date");
    fieldDescMap.put("ORC-10-18", "Entered By - Name Assembly Order");
    fieldDescMap.put("PV2-13-22-2", "Referral Source Code - Assigning Jurisdiction - Text");
    fieldDescMap.put("PV2-13-22-1", "Referral Source Code - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("ORC-10-20", "Entered By - Expiration Date");
    fieldDescMap.put("ORC-11-22-4", "Verified By - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("ORC-10-22", "Entered By - Assigning Jurisdiction");
    fieldDescMap.put("ORC-11-22-3", "Verified By - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("ORC-10-21", "Entered By - Professional Suffix");
    fieldDescMap.put("ORC-11-22-2", "Verified By - Assigning Jurisdiction - Text");
    fieldDescMap.put("ORC-11-22-1", "Verified By - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("ORC-10-23", "Entered By - Assigning Agency or Department");
    fieldDescMap.put("ORC-10-19-2", "Entered By - Effective Date - Degree of Precision");
    fieldDescMap.put("GT1-19-10", "Guarantor Employee ID Number - Assigning Agency or Department");
    fieldDescMap.put("ORC-10-19-1", "Entered By - Effective Date - Time");
    fieldDescMap.put("ORC-11-22-9", "Verified By - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("ORC-11-22-8",
        "Verified By - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap
        .put("ORC-11-22-7", "Verified By - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("ORC-11-22-6",
        "Verified By - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("ORC-11-22-5", "Verified By - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("GT1-29-10-9",
        "Guarantor Employer ID Number - Assigning Agency or Department - Original Text");
    fieldDescMap.put("GT1-29-10-7",
        "Guarantor Employer ID Number - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap
        .put("IN1-5-1-1", "Insurance Company Address - Street Address - Street or Mailing Address");
    fieldDescMap.put("GT1-29-10-8",
        "Guarantor Employer ID Number - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("IN1-5-1-2", "Insurance Company Address - Street Address - Street Name");
    fieldDescMap.put("GT1-29-10-5",
        "Guarantor Employer ID Number - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("IN1-5-1-3", "Insurance Company Address - Street Address - Dwelling Number");
    fieldDescMap.put("GT1-29-10-6",
        "Guarantor Employer ID Number - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("GT1-29-10-3",
        "Guarantor Employer ID Number - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("GT1-29-10-4",
        "Guarantor Employer ID Number - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("GT1-29-10-1",
        "Guarantor Employer ID Number - Assigning Agency or Department - Identifier");
    fieldDescMap
        .put("GT1-29-10-2", "Guarantor Employer ID Number - Assigning Agency or Department - Text");
    fieldDescMap.put("PD1-14-10", "Place of Worship - Organization Identifier");
    fieldDescMap.put("IN3-8-8", "Operator - Source Table");
    fieldDescMap.put("IN3-8-9", "Operator - Assigning Authority");
    fieldDescMap.put("IN3-8-4", "Operator - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("IN3-8-5", "Operator - Suffix (e.g., JR or III)");
    fieldDescMap.put("IN3-8-6", "Operator - Prefix (e.g., DR)");
    fieldDescMap.put("IN3-8-7", "Operator - Degree (e.g., MD)");
    fieldDescMap.put("ORC-10-22-2", "Entered By - Assigning Jurisdiction - Text");
    fieldDescMap.put("ORC-10-22-3", "Entered By - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("ORC-10-22-1", "Entered By - Assigning Jurisdiction - Identifier");
    fieldDescMap
        .put("IN1-37-5-6", "Policy Deductible - Range Units - Name of Alternate Coding System");
    fieldDescMap.put("ORC-10-22-8",
        "Entered By - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("IN1-37-5-5", "Policy Deductible - Range Units - Alternate Text");
    fieldDescMap.put("ORC-10-22-9", "Entered By - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("IN1-37-5-4", "Policy Deductible - Range Units - Alternate Identifier");
    fieldDescMap.put("ORC-10-22-6",
        "Entered By - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("IN1-37-5-3", "Policy Deductible - Range Units - Name of Coding System");
    fieldDescMap
        .put("ORC-10-22-7", "Entered By - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("IN1-37-5-2", "Policy Deductible - Range Units - Text");
    fieldDescMap.put("ORC-10-22-4", "Entered By - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("IN1-37-5-1", "Policy Deductible - Range Units - Identifier");
    fieldDescMap.put("ORC-10-22-5", "Entered By - Assigning Jurisdiction - Alternate Text");
    fieldDescMap
        .put("IN3-14-23-9", "Physician Reviewer - Assigning Agency or Department - Original Text");
    fieldDescMap.put("IN3-14-23-7",
        "Physician Reviewer - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("IN3-14-23-8",
        "Physician Reviewer - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap
        .put("IN3-14-23-5", "Physician Reviewer - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("GT1-54-2", "Guarantor Financial Class - Effective Date");
    fieldDescMap.put("IN3-14-23-6",
        "Physician Reviewer - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("GT1-54-1", "Guarantor Financial Class - Financial Class Code");
    fieldDescMap.put("IN3-14-23-3",
        "Physician Reviewer - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("IN3-14-23-4",
        "Physician Reviewer - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap
        .put("IN3-14-23-1", "Physician Reviewer - Assigning Agency or Department - Identifier");
    fieldDescMap.put("IN3-14-23-2", "Physician Reviewer - Assigning Agency or Department - Text");
    fieldDescMap.put("NK1-30-9-3", "Contact Person's Name - Name Context - Name of Coding System");
    fieldDescMap.put("PD1-3-8-2", "Patient Primary Facility - Assigning Facility - Universal ID");
    fieldDescMap.put("NK1-30-9-4", "Contact Person's Name - Name Context - Alternate Identifier");
    fieldDescMap.put("PD1-3-8-1", "Patient Primary Facility - Assigning Facility - Namespace ID");
    fieldDescMap.put("NK1-30-9-5", "Contact Person's Name - Name Context - Alternate Text");
    fieldDescMap.put("NK1-30-9-6",
        "Contact Person's Name - Name Context - Name of Alternate Coding System");
    fieldDescMap
        .put("PD1-3-8-3", "Patient Primary Facility - Assigning Facility - Universal ID Type");
    fieldDescMap.put("NK1-30-9-1", "Contact Person's Name - Name Context - Identifier");
    fieldDescMap.put("NK1-30-9-2", "Contact Person's Name - Name Context - Text");
    fieldDescMap.put("MSH-5", "Receiving Application");
    fieldDescMap.put("MSH-6", "Receiving Facility");
    fieldDescMap.put("MSH-3", "Sending Application");
    fieldDescMap.put("MSH-4", "Sending Facility");
    fieldDescMap.put("MSH-9", "Message Type");
    fieldDescMap.put("MSH-7", "Date/Time Of Message");
    fieldDescMap.put("MSH-8", "Security");
    fieldDescMap.put("MSH-1", "Field Separator");
    fieldDescMap.put("MSH-2", "Encoding Characters");
    fieldDescMap.put("MSH-0", "Message Header");
    fieldDescMap
        .put("IN2-3-9-1", "Insured's Employer's Name and ID - Assigning Authority - Namespace ID");
    fieldDescMap.put("OBX-16-2-3", "Responsible Observer - Family Name - Own Surname");
    fieldDescMap.put("IN3-8-3", "Operator - Given Name");
    fieldDescMap
        .put("IN2-3-9-2", "Insured's Employer's Name and ID - Assigning Authority - Universal ID");
    fieldDescMap.put("OBX-16-2-4",
        "Responsible Observer - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("IN3-8-2", "Operator - Family Name");
    fieldDescMap.put("IN2-3-9-3",
        "Insured's Employer's Name and ID - Assigning Authority - Universal ID Type");
    fieldDescMap
        .put("OBX-16-2-5", "Responsible Observer - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("IN3-8-1", "Operator - ID Number");
    fieldDescMap
        .put("PID-18-10-1", "Patient Account Number - Assigning Agency or Department - Identifier");
    fieldDescMap
        .put("PID-18-10-2", "Patient Account Number - Assigning Agency or Department - Text");
    fieldDescMap.put("PID-18-10-3",
        "Patient Account Number - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("OBX-16-2-1", "Responsible Observer - Family Name - Surname");
    fieldDescMap.put("PID-18-10-4",
        "Patient Account Number - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("OBX-16-2-2", "Responsible Observer - Family Name - Own Surname Prefix");
    fieldDescMap.put("PID-18-10-5",
        "Patient Account Number - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("PID-18-10-6",
        "Patient Account Number - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("PID-18-10-7",
        "Patient Account Number - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("PID-18-10-8",
        "Patient Account Number - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("PID-18-10-9",
        "Patient Account Number - Assigning Agency or Department - Original Text");
    fieldDescMap.put("OBX-16-23-6",
        "Responsible Observer - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("OBX-16-23-7",
        "Responsible Observer - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("OBX-16-23-4",
        "Responsible Observer - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("OBX-16-23-5",
        "Responsible Observer - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("OBX-16-23-8",
        "Responsible Observer - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("OBX-16-23-9",
        "Responsible Observer - Assigning Agency or Department - Original Text");
    fieldDescMap.put("OBX-16-23-2", "Responsible Observer - Assigning Agency or Department - Text");
    fieldDescMap.put("OBX-16-23-3",
        "Responsible Observer - Assigning Agency or Department - Name of Coding System");
    fieldDescMap
        .put("OBX-16-23-1", "Responsible Observer - Assigning Agency or Department - Identifier");
    fieldDescMap.put("PV2-13-9", "Referral Source Code - Assigning Authority");
    fieldDescMap.put("PV2-13-8", "Referral Source Code - Source Table");
    fieldDescMap.put("PV2-13-7", "Referral Source Code - Degree (e.g., MD)");
    fieldDescMap.put("PV2-13-6", "Referral Source Code - Prefix (e.g., DR)");
    fieldDescMap.put("PV2-13-5", "Referral Source Code - Suffix (e.g., JR or III)");
    fieldDescMap.put("PV2-13-4",
        "Referral Source Code - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("PV2-13-3", "Referral Source Code - Given Name");
    fieldDescMap.put("PV2-13-2", "Referral Source Code - Family Name");
    fieldDescMap.put("PV2-13-1", "Referral Source Code - ID Number");
    fieldDescMap.put("IN2-52-9-1", "Insured's Contact Person's Name - Name Context - Identifier");
    fieldDescMap.put("IN2-52-9-2", "Insured's Contact Person's Name - Name Context - Text");
    fieldDescMap.put("IN2-52-9-3",
        "Insured's Contact Person's Name - Name Context - Name of Coding System");
    fieldDescMap
        .put("IN2-52-9-5", "Insured's Contact Person's Name - Name Context - Alternate Text");
    fieldDescMap.put("PV1-7-17", "Attending Doctor - Name Validity Range");
    fieldDescMap
        .put("IN2-52-9-4", "Insured's Contact Person's Name - Name Context - Alternate Identifier");
    fieldDescMap.put("PV1-7-18", "Attending Doctor - Name Assembly Order");
    fieldDescMap.put("PV1-7-15", "Attending Doctor - Name Representation Code");
    fieldDescMap.put("IN2-52-9-6",
        "Insured's Contact Person's Name - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("PV1-7-16", "Attending Doctor - Name Context");
    fieldDescMap.put("PV1-7-13", "Attending Doctor - Identifier Type Code");
    fieldDescMap.put("PV1-7-14", "Attending Doctor - Assigning Facility");
    fieldDescMap.put("PV1-7-11", "Attending Doctor - Identifier Check Digit");
    fieldDescMap.put("PV1-7-12", "Attending Doctor - Check Digit Scheme");
    fieldDescMap.put("PV1-7-10", "Attending Doctor - Name Type Code");
    fieldDescMap.put("ORC-27-1", "Filler's Expected Availability Date/Time - Time");
    fieldDescMap.put("ORC-27-2", "Filler's Expected Availability Date/Time - Degree of Precision");
    fieldDescMap.put("PV1-7-19", "Attending Doctor - Effective Date");
    fieldDescMap.put("MSH-11-1", "Processing ID - Processing ID");
    fieldDescMap.put("MSH-11-2", "Processing ID - Processing Mode");
    fieldDescMap.put("PV1-7-22", "Attending Doctor - Assigning Jurisdiction");
    fieldDescMap.put("PV1-7-23", "Attending Doctor - Assigning Agency or Department");
    fieldDescMap.put("PV1-7-20", "Attending Doctor - Expiration Date");
    fieldDescMap.put("PV1-7-21", "Attending Doctor - Professional Suffix");
    fieldDescMap.put("GT1-0", "Guarantor");
    fieldDescMap.put("GT1-7", "Guarantor Ph Num - Business");
    fieldDescMap.put("GT1-8", "Guarantor Date/Time Of Birth");
    fieldDescMap.put("GT1-5", "Guarantor Address");
    fieldDescMap.put("GT1-6", "Guarantor Ph Num - Home");
    fieldDescMap.put("GT1-3", "Guarantor Name");
    fieldDescMap.put("GT1-4", "Guarantor Spouse Name");
    fieldDescMap.put("GT1-1", "Set ID - GT1");
    fieldDescMap.put("GT1-2", "Guarantor Number");
    fieldDescMap.put("MSH-19-1", "Principal Language Of Message - Identifier");
    fieldDescMap.put("GT1-38-4", "Publicity Code - Alternate Identifier");
    fieldDescMap.put("GT1-38-3", "Publicity Code - Name of Coding System");
    fieldDescMap.put("GT1-38-6", "Publicity Code - Name of Alternate Coding System");
    fieldDescMap.put("GT1-38-5", "Publicity Code - Alternate Text");
    fieldDescMap.put("GT1-38-2", "Publicity Code - Text");
    fieldDescMap.put("GT1-9", "Guarantor Administrative Sex");
    fieldDescMap.put("GT1-38-1", "Publicity Code - Identifier");
    fieldDescMap.put("MSH-19-9", "Principal Language Of Message - Original Text");
    fieldDescMap
        .put("MSH-19-8", "Principal Language Of Message - Alternate Coding System Version ID");
    fieldDescMap.put("MSH-19-7", "Principal Language Of Message - Coding System Version ID");
    fieldDescMap.put("MSH-19-6", "Principal Language Of Message - Name of Alternate Coding System");
    fieldDescMap.put("MSH-19-5", "Principal Language Of Message - Alternate Text");
    fieldDescMap.put("MSH-19-4", "Principal Language Of Message - Alternate Identifier");
    fieldDescMap.put("MSH-19-3", "Principal Language Of Message - Name of Coding System");
    fieldDescMap.put("MSH-19-2", "Principal Language Of Message - Text");
    fieldDescMap.put("RXA-9-1", "Administration Notes - Identifier");
    fieldDescMap.put("RXA-9-5", "Administration Notes - Alternate Text");
    fieldDescMap.put("RXA-9-4", "Administration Notes - Alternate Identifier");
    fieldDescMap.put("RXA-9-3", "Administration Notes - Name of Coding System");
    fieldDescMap.put("RXA-9-2", "Administration Notes - Text");
    fieldDescMap.put("PV1-19-10", "Visit Number - Assigning Agency or Department");
    fieldDescMap.put("PID-3-9-1", "Patient Identifier List - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("GT1-42-9-1", "Mother's Maiden Name - Name Context - Identifier");
    fieldDescMap.put("RXA-9-6", "Administration Notes - Name of Alternate Coding System");
    fieldDescMap.put("PID-3-9-2", "Patient Identifier List - Assigning Jurisdiction - Text");
    fieldDescMap.put("PID-3-9-3",
        "Patient Identifier List - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("TQ1-5-2-1", "Relative Time and Units - Units - Identifier");
    fieldDescMap.put("PID-3-9-4",
        "Patient Identifier List - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap
        .put("PID-3-9-5", "Patient Identifier List - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("TQ1-5-2-3", "Relative Time and Units - Units - Name of Coding System");
    fieldDescMap.put("PID-3-9-6",
        "Patient Identifier List - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("TQ1-5-2-2", "Relative Time and Units - Units - Text");
    fieldDescMap.put("PID-3-9-7",
        "Patient Identifier List - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("TQ1-5-2-5", "Relative Time and Units - Units - Alternate Text");
    fieldDescMap.put("PID-3-9-8",
        "Patient Identifier List - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("TQ1-5-2-4", "Relative Time and Units - Units - Alternate Identifier");
    fieldDescMap
        .put("PID-3-9-9", "Patient Identifier List - Assigning Jurisdiction - Original Text");
    fieldDescMap
        .put("GT1-42-9-6", "Mother's Maiden Name - Name Context - Name of Alternate Coding System");
    fieldDescMap
        .put("TQ1-5-2-6", "Relative Time and Units - Units - Name of Alternate Coding System");
    fieldDescMap.put("GT1-42-9-4", "Mother's Maiden Name - Name Context - Alternate Identifier");
    fieldDescMap.put("GT1-42-9-5", "Mother's Maiden Name - Name Context - Alternate Text");
    fieldDescMap.put("GT1-42-9-2", "Mother's Maiden Name - Name Context - Text");
    fieldDescMap.put("GT1-42-9-3", "Mother's Maiden Name - Name Context - Name of Coding System");
    fieldDescMap.put("PV2-47-2", "Expected LOA Return Date/Time - Degree of Precision");
    fieldDescMap.put("PV2-47-1", "Expected LOA Return Date/Time - Time");
    fieldDescMap.put("TQ1-7-2", "Start date/time - Degree of Precision");
    fieldDescMap.put("TQ1-7-1", "Start date/time - Time");
    fieldDescMap.put("GT1-17-1", "Guarantor Employer Address - Street Address");
    fieldDescMap.put("GT1-17-2", "Guarantor Employer Address - Other Designation");
    fieldDescMap.put("GT1-17-3", "Guarantor Employer Address - City");
    fieldDescMap.put("GT1-17-4", "Guarantor Employer Address - State or Province");
    fieldDescMap.put("GT1-17-5", "Guarantor Employer Address - Zip or Postal Code");
    fieldDescMap.put("PV1-3-4-2", "Assigned Patient Location - Facility - Universal ID");
    fieldDescMap.put("GT1-17-6", "Guarantor Employer Address - Country");
    fieldDescMap.put("PV1-3-4-1", "Assigned Patient Location - Facility - Namespace ID");
    fieldDescMap.put("GT1-17-7", "Guarantor Employer Address - Address Type");
    fieldDescMap.put("GT1-17-8", "Guarantor Employer Address - Other Geographic Designation");
    fieldDescMap.put("PV1-3-4-3", "Assigned Patient Location - Facility - Universal ID Type");
    fieldDescMap.put("GT1-17-9", "Guarantor Employer Address - County/Parish Code");
    fieldDescMap.put("IN3-2-10-2", "Certification Number - Assigning Agency or Department - Text");
    fieldDescMap.put("IN3-2-10-3",
        "Certification Number - Assigning Agency or Department - Name of Coding System");
    fieldDescMap
        .put("IN3-2-10-1", "Certification Number - Assigning Agency or Department - Identifier");
    fieldDescMap
        .put("IN3-2-10-9", "Certification Number - Assigning Agency or Department - Original Text");
    fieldDescMap.put("PID-18-6-2", "Patient Account Number - Assigning Facility - Universal ID");
    fieldDescMap.put("IN3-2-10-8",
        "Certification Number - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("PID-18-6-1", "Patient Account Number - Assigning Facility - Namespace ID");
    fieldDescMap.put("IN3-2-10-5",
        "Certification Number - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("IN3-2-10-4",
        "Certification Number - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("IN3-2-10-7",
        "Certification Number - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("IN3-2-10-6",
        "Certification Number - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap
        .put("PID-18-6-3", "Patient Account Number - Assigning Facility - Universal ID Type");
    fieldDescMap.put("IN1-2-6", "Insurance Plan ID - Name of Alternate Coding System");
    fieldDescMap.put("IN1-2-4", "Insurance Plan ID - Alternate Identifier");
    fieldDescMap.put("IN1-2-5", "Insurance Plan ID - Alternate Text");
    fieldDescMap.put("IN3-8-9-1", "Operator - Assigning Authority - Namespace ID");
    fieldDescMap.put("IN3-8-9-2", "Operator - Assigning Authority - Universal ID");
    fieldDescMap.put("IN3-8-9-3", "Operator - Assigning Authority - Universal ID Type");
    fieldDescMap.put("IN1-2-2", "Insurance Plan ID - Text");
    fieldDescMap.put("IN1-2-3", "Insurance Plan ID - Name of Coding System");
    fieldDescMap.put("IN1-2-1", "Insurance Plan ID - Identifier");
    fieldDescMap.put("PV1-11-4", "Temporary Location - Facility");
    fieldDescMap.put("PV1-11-3", "Temporary Location - Bed");
    fieldDescMap.put("PV1-11-6", "Temporary Location - Person Location Type");
    fieldDescMap.put("PV1-11-5", "Temporary Location - Location Status");
    fieldDescMap.put("PV1-11-8", "Temporary Location - Floor");
    fieldDescMap.put("PV1-11-7", "Temporary Location - Building");
    fieldDescMap.put("PV1-11-9", "Temporary Location - Location Description");
    fieldDescMap.put("ORC-13-10-1",
        "Enterer's Location - Comprehensive Location Identifier - Entity Identifier");
    fieldDescMap.put("GT1-21-1", "Guarantor Organization Name - Organization Name");
    fieldDescMap.put("GT1-21-2", "Guarantor Organization Name - Organization Name Type Code");
    fieldDescMap.put("ORC-13-10-3",
        "Enterer's Location - Comprehensive Location Identifier - Universal ID");
    fieldDescMap.put("GT1-21-3", "Guarantor Organization Name - ID Number");
    fieldDescMap.put("ORC-13-10-2",
        "Enterer's Location - Comprehensive Location Identifier - Namespace ID");
    fieldDescMap.put("GT1-21-4", "Guarantor Organization Name - Check Digit");
    fieldDescMap.put("NK1-30-1-1", "Contact Person's Name - Family Name - Surname");
    fieldDescMap.put("ORC-13-10-4",
        "Enterer's Location - Comprehensive Location Identifier - Universal ID Type");
    fieldDescMap.put("NK1-30-1-2", "Contact Person's Name - Family Name - Own Surname Prefix");
    fieldDescMap.put("PV1-11-2", "Temporary Location - Room");
    fieldDescMap.put("GT1-42-1-1", "Mother's Maiden Name - Family Name - Surname");
    fieldDescMap.put("PV1-11-1", "Temporary Location - Point of Care");
    populateFieldDescriptions6();
  }

  public void populateFieldDescriptions6() {
    fieldDescMap.put("GT1-42-1-2", "Mother's Maiden Name - Family Name - Own Surname Prefix");
    fieldDescMap.put("PD1-14-8-3", "Place of Worship - Assigning Facility - Universal ID Type");
    fieldDescMap.put("GT1-21-9", "Guarantor Organization Name - Name Representation Code");
    fieldDescMap.put("GT1-42-1-3", "Mother's Maiden Name - Family Name - Own Surname");
    fieldDescMap.put("GT1-42-1-4",
        "Mother's Maiden Name - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap
        .put("GT1-42-1-5", "Mother's Maiden Name - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("GT1-21-6", "Guarantor Organization Name - Assigning Authority");
    fieldDescMap.put("GT1-21-5", "Guarantor Organization Name - Check Digit Scheme");
    fieldDescMap.put("PD1-14-8-2", "Place of Worship - Assigning Facility - Universal ID");
    fieldDescMap.put("GT1-21-8", "Guarantor Organization Name - Assigning Facility");
    fieldDescMap.put("PD1-14-8-1", "Place of Worship - Assigning Facility - Namespace ID");
    fieldDescMap.put("GT1-21-7", "Guarantor Organization Name - Identifier Type Code");
    fieldDescMap
        .put("IN3-25-9-3", "Second Opinion Physician - Assigning Authority - Universal ID Type");
    fieldDescMap.put("IN3-25-9-1", "Second Opinion Physician - Assigning Authority - Namespace ID");
    fieldDescMap.put("IN3-25-9-2", "Second Opinion Physician - Assigning Authority - Universal ID");
    fieldDescMap.put("IN1-9-10", "Group Name - Organization Identifier");
    fieldDescMap.put("MSH-3-3", "Sending Application - Universal ID Type");
    fieldDescMap.put("MSH-3-2", "Sending Application - Universal ID");
    fieldDescMap.put("MSH-3-1", "Sending Application - Namespace ID");
    fieldDescMap.put("PV1-19-9-3", "Visit Number - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("PV1-19-9-4", "Visit Number - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("PV1-19-9-5", "Visit Number - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("PV1-19-9-6",
        "Visit Number - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("PV1-19-9-1", "Visit Number - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("PV1-19-9-2", "Visit Number - Assigning Jurisdiction - Text");
    fieldDescMap.put("PV1-19-9-9", "Visit Number - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("PV1-19-9-8",
        "Visit Number - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap
        .put("PV1-19-9-7", "Visit Number - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("IN3-2-9-8",
        "Certification Number - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("IN3-2-9-9", "Certification Number - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("IN3-2-9-6",
        "Certification Number - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("IN3-2-9-7",
        "Certification Number - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("PV1-50-4-1", "Alternate Visit ID - Assigning Authority - Namespace ID");
    fieldDescMap.put("PV1-50-4-2", "Alternate Visit ID - Assigning Authority - Universal ID");
    fieldDescMap.put("PV1-50-4-3", "Alternate Visit ID - Assigning Authority - Universal ID Type");
    fieldDescMap.put("IN1-37-5", "Policy Deductible - Range Units");
    fieldDescMap.put("IN3-2-9-1", "Certification Number - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("IN1-37-4", "Policy Deductible - To Value");
    fieldDescMap.put("IN1-37-6", "Policy Deductible - Range Type");
    fieldDescMap
        .put("IN3-2-9-4", "Certification Number - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("IN1-37-1", "Policy Deductible - Price");
    fieldDescMap.put("IN3-2-9-5", "Certification Number - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("IN3-2-9-2", "Certification Number - Assigning Jurisdiction - Text");
    fieldDescMap.put("PV1-11-10-3",
        "Temporary Location - Comprehensive Location Identifier - Universal ID");
    fieldDescMap.put("IN1-37-3", "Policy Deductible - From Value");
    fieldDescMap
        .put("IN3-2-9-3", "Certification Number - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("PV1-11-10-4",
        "Temporary Location - Comprehensive Location Identifier - Universal ID Type");
    fieldDescMap.put("IN1-37-2", "Policy Deductible - Price Type");
    fieldDescMap.put("PV1-11-10-2",
        "Temporary Location - Comprehensive Location Identifier - Namespace ID");
    fieldDescMap.put("NK1-13-2", "Organization Name - NK1 - Organization Name Type Code");
    fieldDescMap.put("PV1-11-10-1",
        "Temporary Location - Comprehensive Location Identifier - Entity Identifier");
    fieldDescMap.put("NK1-13-3", "Organization Name - NK1 - ID Number");
    fieldDescMap.put("NK1-13-4", "Organization Name - NK1 - Check Digit");
    fieldDescMap.put("NK1-13-5", "Organization Name - NK1 - Check Digit Scheme");
    fieldDescMap.put("NK1-13-6", "Organization Name - NK1 - Assigning Authority");
    fieldDescMap.put("NK1-13-7", "Organization Name - NK1 - Identifier Type Code");
    fieldDescMap.put("NK1-13-8", "Organization Name - NK1 - Assigning Facility");
    fieldDescMap.put("NK1-13-9", "Organization Name - NK1 - Name Representation Code");
    fieldDescMap.put("GT1-16-12-1", "Guarantor Employer Name - Effective Date - Time");
    fieldDescMap
        .put("GT1-16-12-2", "Guarantor Employer Name - Effective Date - Degree of Precision");
    fieldDescMap.put("IN3-8-16-4", "Operator - Name Context - Alternate Identifier");
    fieldDescMap.put("IN3-8-16-5", "Operator - Name Context - Alternate Text");
    fieldDescMap.put("IN3-8-16-6", "Operator - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("NK1-13-1", "Organization Name - NK1 - Organization Name");
    fieldDescMap.put("PD1-10-10-8",
        "Duplicate Patient - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap
        .put("PD1-10-10-9", "Duplicate Patient - Assigning Agency or Department - Original Text");
    fieldDescMap.put("PD1-10-10-2", "Duplicate Patient - Assigning Agency or Department - Text");
    fieldDescMap.put("PD1-10-10-3",
        "Duplicate Patient - Assigning Agency or Department - Name of Coding System");
    fieldDescMap
        .put("PD1-10-10-1", "Duplicate Patient - Assigning Agency or Department - Identifier");
    fieldDescMap.put("PD1-10-10-6",
        "Duplicate Patient - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("IN2-9-12-2", "Military Sponsor Name - Effective Date - Degree of Precision");
    fieldDescMap.put("PD1-10-10-7",
        "Duplicate Patient - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("PD1-10-10-4",
        "Duplicate Patient - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap
        .put("PD1-10-10-5", "Duplicate Patient - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("IN2-9-12-1", "Military Sponsor Name - Effective Date - Time");
    fieldDescMap.put("PV1-7-3", "Attending Doctor - Given Name");
    fieldDescMap.put("IN1-16-11", "Name Of Insured - Name Assembly Order");
    fieldDescMap.put("PV1-7-2", "Attending Doctor - Family Name");
    fieldDescMap.put("IN1-16-10", "Name Of Insured - Name Validity Range");
    fieldDescMap.put("PV1-7-1", "Attending Doctor - ID Number");
    fieldDescMap.put("PV1-7-7", "Attending Doctor - Degree (e.g., MD)");
    fieldDescMap.put("PV1-7-6", "Attending Doctor - Prefix (e.g., DR)");
    fieldDescMap.put("PV1-7-5", "Attending Doctor - Suffix (e.g., JR or III)");
    fieldDescMap
        .put("PV1-7-4", "Attending Doctor - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("ORC-2-1", "Placer Order Number - Entity Identifier");
    fieldDescMap.put("ORC-2-2", "Placer Order Number - Namespace ID");
    fieldDescMap.put("ORC-2-3", "Placer Order Number - Universal ID");
    fieldDescMap.put("ORC-2-4", "Placer Order Number - Universal ID Type");
    fieldDescMap.put("IN1-16-14", "Name Of Insured - Professional Suffix");
    fieldDescMap.put("IN1-16-13", "Name Of Insured - Expiration Date");
    fieldDescMap.put("IN1-16-12", "Name Of Insured - Effective Date");
    fieldDescMap
        .put("PV1-52-2-5", "Other Healthcare Provider - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("PV1-52-2-2", "Other Healthcare Provider - Family Name - Own Surname Prefix");
    fieldDescMap.put("PV1-52-2-1", "Other Healthcare Provider - Family Name - Surname");
    fieldDescMap.put("PV1-52-2-4",
        "Other Healthcare Provider - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("PV1-52-2-3", "Other Healthcare Provider - Family Name - Own Surname");
    fieldDescMap.put("PV1-7-14-3", "Attending Doctor - Assigning Facility - Universal ID Type");
    fieldDescMap.put("PV1-7-14-2", "Attending Doctor - Assigning Facility - Universal ID");
    fieldDescMap.put("PID-38-6", "Production Class Code - Name of Alternate Coding System");
    fieldDescMap.put("PID-38-1", "Production Class Code - Identifier");
    fieldDescMap.put("PV1-42-10", "Pending Location - Comprehensive Location Identifier");
    fieldDescMap.put("PID-38-2", "Production Class Code - Text");
    fieldDescMap.put("PV1-42-11", "Pending Location - Assigning Authority for Location");
    fieldDescMap.put("PID-38-3", "Production Class Code - Name of Coding System");
    fieldDescMap.put("PID-38-4", "Production Class Code - Alternate Identifier");
    fieldDescMap.put("PID-38-5", "Production Class Code - Alternate Text");
    fieldDescMap.put("IN1-16-1", "Name Of Insured - Family Name");
    fieldDescMap.put("IN1-16-2", "Name Of Insured - Given Name");
    fieldDescMap.put("IN1-16-5", "Name Of Insured - Prefix (e.g., DR)");
    fieldDescMap.put("IN1-16-6", "Name Of Insured - Degree (e.g., MD)");
    fieldDescMap
        .put("IN1-16-3", "Name Of Insured - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("IN1-16-4", "Name Of Insured - Suffix (e.g., JR or III)");
    fieldDescMap.put("PV1-20-2-1", "Financial Class - Effective Date - Time");
    fieldDescMap.put("PV1-7-8", "Attending Doctor - Source Table");
    fieldDescMap.put("PV1-7-9", "Attending Doctor - Assigning Authority");
    fieldDescMap.put("PV1-20-2-2", "Financial Class - Effective Date - Degree of Precision");
    fieldDescMap.put("ORC-11-8", "Verified By - Source Table");
    fieldDescMap
        .put("IN3-25-23-2", "Second Opinion Physician - Assigning Agency or Department - Text");
    fieldDescMap.put("ORC-11-9", "Verified By - Assigning Authority");
    fieldDescMap.put("IN3-25-23-1",
        "Second Opinion Physician - Assigning Agency or Department - Identifier");
    fieldDescMap.put("IN3-25-23-4",
        "Second Opinion Physician - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("IN3-25-23-3",
        "Second Opinion Physician - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("IN3-25-23-6",
        "Second Opinion Physician - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("IN3-25-23-5",
        "Second Opinion Physician - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("IN3-25-23-8",
        "Second Opinion Physician - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("IN3-25-23-7",
        "Second Opinion Physician - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("ORC-11-1", "Verified By - ID Number");
    fieldDescMap.put("IN3-25-23-9",
        "Second Opinion Physician - Assigning Agency or Department - Original Text");
    fieldDescMap.put("IN1-16-9", "Name Of Insured - Name Context");
    fieldDescMap.put("ORC-11-2", "Verified By - Family Name");
    fieldDescMap.put("IN1-16-8", "Name Of Insured - Name Representation Code");
    fieldDescMap.put("ORC-11-3", "Verified By - Given Name");
    fieldDescMap.put("IN1-16-7", "Name Of Insured - Name Type Code");
    fieldDescMap
        .put("ORC-11-4", "Verified By - Second and Further Given Names or Initials Thereof");
    fieldDescMap.put("ORC-11-5", "Verified By - Suffix (e.g., JR or III)");
    fieldDescMap.put("ORC-11-6", "Verified By - Prefix (e.g., DR)");
    fieldDescMap.put("ORC-11-7", "Verified By - Degree (e.g., MD)");
    fieldDescMap.put("RXA-8", "Administered Dosage Form");
    fieldDescMap.put("ORC-23-10", "Ordering Facility Phone Number - Extension Prefix");
    fieldDescMap
        .put("IN1-17-6", "Insured's Relationship To Patient - Name of Alternate Coding System");
    fieldDescMap.put("RXA-9", "Administration Notes");
    fieldDescMap.put("ORC-23-11", "Ordering Facility Phone Number - Speed Dial Code");
    fieldDescMap.put("RXA-6", "Administered Amount");
    fieldDescMap.put("RXA-7", "Administered Units");
    fieldDescMap.put("RXA-4", "Date/Time End of Administration");
    fieldDescMap.put("PID-17-1", "Religion - Identifier");
    fieldDescMap.put("RXA-5", "Administered Code");
    fieldDescMap.put("PID-17-2", "Religion - Text");
    fieldDescMap.put("RXA-2", "Administration Sub-ID Counter");
    fieldDescMap.put("PID-17-3", "Religion - Name of Coding System");
    fieldDescMap.put("RXA-3", "Date/Time Start of Administration");
    fieldDescMap.put("PID-17-4", "Religion - Alternate Identifier");
    fieldDescMap.put("NK1-20-6", "Primary Language - Name of Alternate Coding System");
    fieldDescMap.put("GT1-27-3", "Guarantor Household Annual Income - From Value");
    fieldDescMap.put("GT1-27-4", "Guarantor Household Annual Income - To Value");
    fieldDescMap.put("GT1-27-5", "Guarantor Household Annual Income - Range Units");
    fieldDescMap.put("GT1-27-6", "Guarantor Household Annual Income - Range Type");
    fieldDescMap.put("GT1-27-1", "Guarantor Household Annual Income - Price");
    fieldDescMap.put("GT1-27-2", "Guarantor Household Annual Income - Price Type");
    fieldDescMap.put("PID-17-6", "Religion - Name of Alternate Coding System");
    fieldDescMap.put("PID-17-5", "Religion - Alternate Text");
    fieldDescMap.put("IN1-17-1", "Insured's Relationship To Patient - Identifier");
    fieldDescMap.put("RXA-10-19-1", "Administering Provider - Effective Date - Time");
    fieldDescMap.put("IN1-17-3", "Insured's Relationship To Patient - Name of Coding System");
    fieldDescMap
        .put("RXA-10-19-2", "Administering Provider - Effective Date - Degree of Precision");
    fieldDescMap.put("IN1-17-2", "Insured's Relationship To Patient - Text");
    fieldDescMap.put("IN1-17-5", "Insured's Relationship To Patient - Alternate Text");
    fieldDescMap.put("IN1-17-4", "Insured's Relationship To Patient - Alternate Identifier");
    fieldDescMap
        .put("GT1-16-9-3", "Guarantor Employer Name - Name Context - Name of Coding System");
    fieldDescMap.put("GT1-19-4-3",
        "Guarantor Employee ID Number - Assigning Authority - Universal ID Type");
    fieldDescMap.put("GT1-16-9-4", "Guarantor Employer Name - Name Context - Alternate Identifier");
    fieldDescMap.put("GT1-16-9-5", "Guarantor Employer Name - Name Context - Alternate Text");
    fieldDescMap
        .put("GT1-19-4-1", "Guarantor Employee ID Number - Assigning Authority - Namespace ID");
    fieldDescMap.put("GT1-16-9-6",
        "Guarantor Employer Name - Name Context - Name of Alternate Coding System");
    fieldDescMap
        .put("GT1-19-4-2", "Guarantor Employee ID Number - Assigning Authority - Universal ID");
    fieldDescMap
        .put("IN2-1-10-1", "Insured's Employee ID - Assigning Agency or Department - Identifier");
    fieldDescMap.put("RXA-1", "Give Sub-ID Counter");
    fieldDescMap.put("RXA-0", "Pharmacy/Treatment Administration");
    fieldDescMap.put("ORC-23-12", "Ordering Facility Phone Number - Unformatted Telephone number");
    fieldDescMap.put("IN2-1-10-2", "Insured's Employee ID - Assigning Agency or Department - Text");
    fieldDescMap.put("IN2-1-10-3",
        "Insured's Employee ID - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("IN2-1-10-4",
        "Insured's Employee ID - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("IN2-1-10-5",
        "Insured's Employee ID - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("IN2-1-10-6",
        "Insured's Employee ID - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("IN2-1-10-7",
        "Insured's Employee ID - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("PV2-3-2", "Admit Reason - Text");
    fieldDescMap.put("IN2-1-10-8",
        "Insured's Employee ID - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("PV2-3-1", "Admit Reason - Identifier");
    fieldDescMap.put("IN2-1-10-9",
        "Insured's Employee ID - Assigning Agency or Department - Original Text");
    fieldDescMap.put("PV2-3-4", "Admit Reason - Alternate Identifier");
    fieldDescMap.put("PV2-3-3", "Admit Reason - Name of Coding System");
    fieldDescMap.put("TQ1-14", "Total occurrence's");
    fieldDescMap.put("PV2-3-6", "Admit Reason - Name of Alternate Coding System");
    fieldDescMap.put("PV2-3-5", "Admit Reason - Alternate Text");
    fieldDescMap.put("TQ1-12", "Conjunction");
    fieldDescMap.put("TQ1-13", "Occurrence duration");
    fieldDescMap.put("TQ1-10", "Condition text");
    fieldDescMap.put("TQ1-11", "Text instruction");
    fieldDescMap.put("ORC-19-9-1", "Action By - Assigning Authority - Namespace ID");
    fieldDescMap.put("ORC-19-9-2", "Action By - Assigning Authority - Universal ID");
    fieldDescMap.put("ORC-19-9-3", "Action By - Assigning Authority - Universal ID Type");
    fieldDescMap.put("IN2-25-4-2", "Payor ID - Assigning Authority - Universal ID");
    fieldDescMap.put("IN2-25-4-1", "Payor ID - Assigning Authority - Namespace ID");
    fieldDescMap.put("IN2-50-11", "Employer Contact Person Phone Number - Speed Dial Code");
    fieldDescMap
        .put("IN2-50-12", "Employer Contact Person Phone Number - Unformatted Telephone number");
    fieldDescMap.put("IN2-25-4-3", "Payor ID - Assigning Authority - Universal ID Type");
    fieldDescMap.put("IN2-50-10", "Employer Contact Person Phone Number - Extension Prefix");
    fieldDescMap.put("PV1-52-19-1", "Other Healthcare Provider - Effective Date - Time");
    fieldDescMap
        .put("PV1-52-19-2", "Other Healthcare Provider - Effective Date - Degree of Precision");
    fieldDescMap.put("PID-3-1", "Patient Identifier List - ID Number");
    fieldDescMap.put("PID-3-3", "Patient Identifier List - Check Digit Scheme");
    fieldDescMap.put("PID-3-2", "Patient Identifier List - Check Digit");
    fieldDescMap.put("PID-3-9", "Patient Identifier List - Assigning Jurisdiction");
    fieldDescMap.put("PID-3-8", "Patient Identifier List - Expiration Date");
    fieldDescMap.put("PID-3-5", "Patient Identifier List - Identifier Type Code");
    fieldDescMap.put("PID-3-4", "Patient Identifier List - Assigning Authority");
    fieldDescMap.put("PID-3-7", "Patient Identifier List - Effective Date");
    fieldDescMap.put("PID-3-6", "Patient Identifier List - Assigning Facility");
    fieldDescMap.put("IN3-8-22-9", "Operator - Assigning Jurisdiction - Original Text");
    fieldDescMap
        .put("IN2-61-10-1", "Patient Member Number - Assigning Agency or Department - Identifier");
    fieldDescMap
        .put("IN2-61-10-2", "Patient Member Number - Assigning Agency or Department - Text");
    fieldDescMap.put("IN2-61-10-3",
        "Patient Member Number - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("NK1-29-3", "Contact Reason - Name of Coding System");
    fieldDescMap.put("NK1-29-4", "Contact Reason - Alternate Identifier");
    fieldDescMap.put("NK1-29-1", "Contact Reason - Identifier");
    fieldDescMap.put("NK1-29-2", "Contact Reason - Text");
    fieldDescMap.put("IN3-8-22-2", "Operator - Assigning Jurisdiction - Text");
    fieldDescMap.put("IN2-61-10-8",
        "Patient Member Number - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("IN3-13-2", "Non-Concur Effective Date/Time - Degree of Precision");
    fieldDescMap.put("IN3-8-22-1", "Operator - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("IN2-61-10-9",
        "Patient Member Number - Assigning Agency or Department - Original Text");
    fieldDescMap.put("IN3-13-1", "Non-Concur Effective Date/Time - Time");
    fieldDescMap.put("IN3-8-22-4", "Operator - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap.put("NK1-29-5", "Contact Reason - Alternate Text");
    fieldDescMap.put("IN3-8-22-3", "Operator - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("NK1-29-6", "Contact Reason - Name of Alternate Coding System");
    fieldDescMap.put("IN3-23", "Second Opinion Status");
    fieldDescMap
        .put("IN3-8-22-6", "Operator - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("IN2-61-10-4",
        "Patient Member Number - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("IN3-24", "Second Opinion Documentation Received");
    fieldDescMap.put("IN3-8-22-5", "Operator - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("IN3-8-16-1", "Operator - Name Context - Identifier");
    fieldDescMap.put("IN2-61-10-5",
        "Patient Member Number - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("IN3-25", "Second Opinion Physician");
    fieldDescMap.put("IN3-8-22-8",
        "Operator - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("IN3-8-16-2", "Operator - Name Context - Text");
    fieldDescMap.put("IN2-61-10-6",
        "Patient Member Number - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("IN3-8-22-7", "Operator - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("IN3-8-16-3", "Operator - Name Context - Name of Coding System");
    fieldDescMap.put("IN2-61-10-7",
        "Patient Member Number - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("IN3-14", "Physician Reviewer");
    fieldDescMap.put("IN3-15", "Certification Contact");
    fieldDescMap.put("PID-6-13-2", "Mother's Maiden Name - Expiration Date - Degree of Precision");
    fieldDescMap.put("IN3-12", "Non-Concur Code/Description");
    fieldDescMap.put("IN3-13", "Non-Concur Effective Date/Time");
    fieldDescMap.put("IN3-18", "Certification Agency");
    fieldDescMap.put("IN3-19", "Certification Agency Phone Number");
    fieldDescMap.put("IN3-16", "Certification Contact Phone Number");
    fieldDescMap.put("IN3-17", "Appeal Reason");
    fieldDescMap.put("PV2-49", "Notify Clergy Code");
    fieldDescMap.put("PV2-47", "Expected LOA Return Date/Time");
    fieldDescMap.put("PV2-48", "Expected Pre-admission Testing Date/Time");
    fieldDescMap.put("IN3-22", "Second Opinion Date");
    fieldDescMap.put("PV2-45", "Advance Directive Code");
    fieldDescMap.put("IN3-21", "Case Manager");
    fieldDescMap.put("PV2-46", "Patient Status Effective Date");
    fieldDescMap.put("IN3-20", "Pre-Certification Requirement");
    fieldDescMap.put("PV2-43", "Living Will Code");
    fieldDescMap.put("PV2-44", "Organ Donor Code");
    fieldDescMap.put("OBX-24-2", "Performing Organization Address - Other Designation");
    fieldDescMap.put("OBX-24-1", "Performing Organization Address - Street Address");
    fieldDescMap.put("PID-5-13-2", "Patient Name - Expiration Date - Degree of Precision");
    fieldDescMap.put("PID-5-13-1", "Patient Name - Expiration Date - Time");
    fieldDescMap.put("MSH-4-1", "Sending Facility - Namespace ID");
    fieldDescMap.put("MSH-4-2", "Sending Facility - Universal ID");
    fieldDescMap.put("MSH-4-3", "Sending Facility - Universal ID Type");
    fieldDescMap.put("PID-6-13-1", "Mother's Maiden Name - Expiration Date - Time");
    fieldDescMap.put("IN3-11", "Days");
    fieldDescMap.put("IN3-10", "Certification End Date");
    fieldDescMap.put("OBX-24-7", "Performing Organization Address - Address Type");
    fieldDescMap.put("NK1-20-5", "Primary Language - Alternate Text");
    fieldDescMap.put("OBX-24-8", "Performing Organization Address - Other Geographic Designation");
    fieldDescMap.put("NK1-20-4", "Primary Language - Alternate Identifier");
    fieldDescMap.put("OBX-24-9", "Performing Organization Address - County/Parish Code");
    fieldDescMap.put("NK1-20-3", "Primary Language - Name of Coding System");
    fieldDescMap.put("NK1-20-2", "Primary Language - Text");
    fieldDescMap.put("OBX-24-3", "Performing Organization Address - City");
    fieldDescMap.put("NK1-20-1", "Primary Language - Identifier");
    fieldDescMap.put("OBX-24-4", "Performing Organization Address - State or Province");
    fieldDescMap.put("OBX-24-5", "Performing Organization Address - Zip or Postal Code");
    fieldDescMap.put("OBX-24-6", "Performing Organization Address - Country");
    fieldDescMap.put("PV2-29", "First Similar Illness Date");
    fieldDescMap
        .put("IN2-26-9-4", "Payor Subscriber ID - Assigning Jurisdiction - Alternate Identifier");
    fieldDescMap
        .put("IN2-26-9-3", "Payor Subscriber ID - Assigning Jurisdiction - Name of Coding System");
    fieldDescMap.put("IN2-26-9-2", "Payor Subscriber ID - Assigning Jurisdiction - Text");
    fieldDescMap.put("IN2-26-9-1", "Payor Subscriber ID - Assigning Jurisdiction - Identifier");
    fieldDescMap.put("PV2-22", "Visit Protection Indicator");
    fieldDescMap.put("IN2-26-9-8",
        "Payor Subscriber ID - Assigning Jurisdiction - Alternate Coding System Version ID");
    fieldDescMap.put("PV2-21", "Visit Publicity Code");
    fieldDescMap.put("IN2-26-9-7",
        "Payor Subscriber ID - Assigning Jurisdiction - Coding System Version ID");
    fieldDescMap.put("PV2-24", "Patient Status Code");
    fieldDescMap.put("IN2-26-9-6",
        "Payor Subscriber ID - Assigning Jurisdiction - Name of Alternate Coding System");
    fieldDescMap.put("PV2-23", "Clinic Organization Name");
    fieldDescMap.put("IN2-26-9-5", "Payor Subscriber ID - Assigning Jurisdiction - Alternate Text");
    fieldDescMap.put("PV2-26", "Previous Treatment Date");
    fieldDescMap.put("PV2-25", "Visit Priority Code");
    fieldDescMap.put("PV2-28", "Signature on File Date");
    fieldDescMap.put("PV2-27", "Expected Discharge Disposition");
    fieldDescMap.put("IN2-26-9-9", "Payor Subscriber ID - Assigning Jurisdiction - Original Text");
    fieldDescMap.put("IN2-33-3", "Citizenship - Name of Coding System");
    fieldDescMap.put("IN2-33-4", "Citizenship - Alternate Identifier");
    fieldDescMap.put("IN2-33-1", "Citizenship - Identifier");
    fieldDescMap.put("IN2-33-2", "Citizenship - Text");
    fieldDescMap.put("PV2-30", "Patient Charge Adjustment Code");
    fieldDescMap.put("PV2-31", "Recurring Service Code");
    fieldDescMap.put("IN2-33-5", "Citizenship - Alternate Text");
    fieldDescMap.put("IN2-33-6", "Citizenship - Name of Alternate Coding System");
    fieldDescMap.put("GT1-2-3", "Guarantor Number - Check Digit Scheme");
    fieldDescMap.put("GT1-2-2", "Guarantor Number - Check Digit");
    fieldDescMap.put("GT1-2-1", "Guarantor Number - ID Number");
    fieldDescMap.put("PV2-35", "Military Non-Availability Code");
    fieldDescMap.put("GT1-42-12-2", "Mother's Maiden Name - Effective Date - Degree of Precision");
    fieldDescMap.put("PV2-34", "Military Partnership Code");
    fieldDescMap.put("PV2-33", "Expected Surgery Date and Time");
    fieldDescMap.put("PV2-32", "Billing Media Code");
    fieldDescMap.put("PV2-39", "Recreational Drug Use Code");
    fieldDescMap.put("PV2-38", "Mode of Arrival Code");
    fieldDescMap.put("PV2-37", "Baby Detained Indicator");
    fieldDescMap.put("PV2-36", "Newborn Baby Indicator");
    fieldDescMap.put("GT1-42-12-1", "Mother's Maiden Name - Effective Date - Time");
    fieldDescMap.put("GT1-45-12-2", "Contact Person's Name - Effective Date - Degree of Precision");
    fieldDescMap.put("GT1-45-12-1", "Contact Person's Name - Effective Date - Time");
    fieldDescMap.put("PV2-41", "Precaution Code");
    fieldDescMap.put("PV2-42", "Patient Condition Code");
    fieldDescMap.put("PV2-40", "Admission Level of Care Code");
    fieldDescMap.put("GT1-2-8", "Guarantor Number - Expiration Date");
    fieldDescMap.put("GT1-2-9", "Guarantor Number - Assigning Jurisdiction");
    fieldDescMap.put("GT1-2-6", "Guarantor Number - Assigning Facility");
    fieldDescMap.put("GT1-2-7", "Guarantor Number - Effective Date");
    fieldDescMap.put("GT1-2-4", "Guarantor Number - Assigning Authority");
    fieldDescMap.put("GT1-2-5", "Guarantor Number - Identifier Type Code");
    fieldDescMap
        .put("PV2-23-6-3", "Clinic Organization Name - Assigning Authority - Universal ID Type");
    fieldDescMap.put("PV2-13-16-6",
        "Referral Source Code - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("PV2-23-6-2", "Clinic Organization Name - Assigning Authority - Universal ID");
    fieldDescMap.put("PV2-13-16-1", "Referral Source Code - Name Context - Identifier");
    fieldDescMap.put("PV2-13-23-2", "Referral Source Code - Assigning Agency or Department - Text");
    fieldDescMap.put("TQ1-8-1", "End date/time - Time");
    fieldDescMap.put("PV2-13-23-3",
        "Referral Source Code - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("PV2-13-23-4",
        "Referral Source Code - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("PV2-13-23-5",
        "Referral Source Code - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("PV2-13-16-5", "Referral Source Code - Name Context - Alternate Text");
    fieldDescMap.put("PV2-13-23-6",
        "Referral Source Code - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap.put("PV2-13-16-4", "Referral Source Code - Name Context - Alternate Identifier");
    fieldDescMap.put("PV2-13-23-7",
        "Referral Source Code - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("TQ1-8-2", "End date/time - Degree of Precision");
    fieldDescMap.put("PV2-13-16-3", "Referral Source Code - Name Context - Name of Coding System");
    fieldDescMap.put("PV2-13-23-8",
        "Referral Source Code - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("PV2-13-16-2", "Referral Source Code - Name Context - Text");
    fieldDescMap.put("PV2-13-23-9",
        "Referral Source Code - Assigning Agency or Department - Original Text");
    fieldDescMap
        .put("PV2-13-23-1", "Referral Source Code - Assigning Agency or Department - Identifier");
    fieldDescMap.put("PV2-23-6-1", "Clinic Organization Name - Assigning Authority - Namespace ID");
    fieldDescMap.put("ORC-11-23-7",
        "Verified By - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("ORC-11-23-6",
        "Verified By - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap
        .put("ORC-11-23-5", "Verified By - Assigning Agency or Department - Alternate Text");
    fieldDescMap
        .put("ORC-11-23-4", "Verified By - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("ORC-11-23-9", "Verified By - Assigning Agency or Department - Original Text");
    fieldDescMap.put("PV2-19", "Retention Indicator");
    fieldDescMap.put("ORC-11-23-8",
        "Verified By - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("PV2-18", "Special Program Code");
    fieldDescMap.put("PV2-17", "Purge Status Date");
    fieldDescMap.put("PV2-16", "Purge Status Code");
    fieldDescMap.put("PV2-15", "Employment Illness Related Indicator");
    fieldDescMap.put("PV2-14", "Previous Service Date");
    fieldDescMap
        .put("ORC-11-23-3", "Verified By - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("PV2-13", "Referral Source Code");
    fieldDescMap.put("ORC-11-23-2", "Verified By - Assigning Agency or Department - Text");
    fieldDescMap.put("PV2-12", "Visit Description");
    fieldDescMap.put("ORC-11-23-1", "Verified By - Assigning Agency or Department - Identifier");
    fieldDescMap.put("PV2-11", "Actual Length of Inpatient Stay");
    fieldDescMap.put("PV2-10", "Estimated Length of Inpatient Stay");
    fieldDescMap.put("PV2-20", "Expected Number of Insurance Plans");
    fieldDescMap.put("IN1-0", "Insurance");
    fieldDescMap.put("IN2-3-2-5",
        "Insured's Employer's Name and ID - Family Name - Surname From Partner/Spouse");
    fieldDescMap.put("TQ2-8", "Sequence Condition Time Interval");
    fieldDescMap.put("TQ2-9", "Cyclic Group Maximum Number of Repeats");
    fieldDescMap.put("IN1-9", "Group Name");
    fieldDescMap.put("OBX-15-2", "Producer's Reference - Text");
    fieldDescMap.put("IN1-5", "Insurance Company Address");
    fieldDescMap.put("OBX-15-1", "Producer's Reference - Identifier");
    fieldDescMap.put("IN1-6", "Insurance Co Contact Person");
    fieldDescMap.put("OBX-15-4", "Producer's Reference - Alternate Identifier");
    fieldDescMap.put("IN1-7", "Insurance Co Phone Number");
    fieldDescMap.put("OBX-15-3", "Producer's Reference - Name of Coding System");
    fieldDescMap.put("IN1-8", "Group Number");
    fieldDescMap.put("OBX-15-6", "Producer's Reference - Name of Alternate Coding System");
    fieldDescMap.put("IN1-1", "Set ID - IN1");
    fieldDescMap.put("OBX-15-5", "Producer's Reference - Alternate Text");
    fieldDescMap.put("IN1-2", "Insurance Plan ID");
    fieldDescMap.put("IN1-3", "Insurance Company ID");
    fieldDescMap.put("IN1-4", "Insurance Company Name");
    fieldDescMap.put("ORC-10-23-5", "Entered By - Assigning Agency or Department - Alternate Text");
    fieldDescMap.put("ORC-10-23-6",
        "Entered By - Assigning Agency or Department - Name of Alternate Coding System");
    fieldDescMap
        .put("ORC-10-23-3", "Entered By - Assigning Agency or Department - Name of Coding System");
    fieldDescMap.put("IN1-44-9", "Insured's Employer's Address - County/Parish Code");
    fieldDescMap
        .put("ORC-10-23-4", "Entered By - Assigning Agency or Department - Alternate Identifier");
    fieldDescMap.put("IN1-44-8", "Insured's Employer's Address - Other Geographic Designation");
    fieldDescMap.put("ORC-10-23-9", "Entered By - Assigning Agency or Department - Original Text");
    fieldDescMap.put("IN1-44-7", "Insured's Employer's Address - Address Type");
    fieldDescMap.put("IN1-44-6", "Insured's Employer's Address - Country");
    fieldDescMap.put("ORC-10-23-7",
        "Entered By - Assigning Agency or Department - Coding System Version ID");
    fieldDescMap.put("IN1-44-5", "Insured's Employer's Address - Zip or Postal Code");
    fieldDescMap.put("ORC-10-23-8",
        "Entered By - Assigning Agency or Department - Alternate Coding System Version ID");
    fieldDescMap.put("IN1-44-4", "Insured's Employer's Address - State or Province");
    fieldDescMap.put("GT1-55-6", "Guarantor Race - Name of Alternate Coding System");
    fieldDescMap.put("IN1-44-3", "Insured's Employer's Address - City");
    fieldDescMap.put("IN1-44-2", "Insured's Employer's Address - Other Designation");
    fieldDescMap.put("GT1-55-4", "Guarantor Race - Alternate Identifier");
    fieldDescMap.put("IN1-44-1", "Insured's Employer's Address - Street Address");
    fieldDescMap.put("GT1-55-5", "Guarantor Race - Alternate Text");
    fieldDescMap.put("ORC-10-23-1", "Entered By - Assigning Agency or Department - Identifier");
    fieldDescMap.put("ORC-10-23-2", "Entered By - Assigning Agency or Department - Text");
    fieldDescMap.put("GT1-44-6", "Ethnic Group - Name of Alternate Coding System");
    fieldDescMap.put("GT1-44-5", "Ethnic Group - Alternate Text");
    fieldDescMap.put("GT1-44-4", "Ethnic Group - Alternate Identifier");
    fieldDescMap.put("GT1-44-2", "Ethnic Group - Text");
    fieldDescMap.put("GT1-44-3", "Ethnic Group - Name of Coding System");
    fieldDescMap.put("GT1-44-1", "Ethnic Group - Identifier");
    fieldDescMap.put("GT1-55-3", "Guarantor Race - Name of Coding System");
    fieldDescMap
        .put("IN2-3-2-2", "Insured's Employer's Name and ID - Family Name - Own Surname Prefix");
    fieldDescMap.put("GT1-55-2", "Guarantor Race - Text");
    fieldDescMap.put("IN2-3-2-1", "Insured's Employer's Name and ID - Family Name - Surname");
    fieldDescMap.put("GT1-55-1", "Guarantor Race - Identifier");
    fieldDescMap.put("IN2-3-2-4",
        "Insured's Employer's Name and ID - Family Name - Surname Prefix From Partner/Spouse");
    fieldDescMap.put("IN2-3-2-3", "Insured's Employer's Name and ID - Family Name - Own Surname");
    fieldDescMap.put("PD1-4-9-3",
        "Patient Primary Care Provider Name & ID No. - Assigning Authority - Universal ID Type");
    fieldDescMap.put("PD1-4-9-1",
        "Patient Primary Care Provider Name & ID No. - Assigning Authority - Namespace ID");
    fieldDescMap.put("PD1-4-9-2",
        "Patient Primary Care Provider Name & ID No. - Assigning Authority - Universal ID");
    fieldDescMap.put("GT1-16-9-1", "Guarantor Employer Name - Name Context - Identifier");
    fieldDescMap.put("GT1-16-9-2", "Guarantor Employer Name - Name Context - Text");
    fieldDescMap.put("TQ2-1", "Set ID - TQ2");
    fieldDescMap.put("IN2-7-9-5", "Medicaid Case Name - Name Context - Alternate Text");
    fieldDescMap.put("TQ2-0", "Timing/Quantity Relationship");
    fieldDescMap.put("IN2-7-9-4", "Medicaid Case Name - Name Context - Alternate Identifier");
    fieldDescMap.put("TQ2-3", "Related Placer Number");
    fieldDescMap.put("NK1-6-8", "Business Phone Number - Extension");
    fieldDescMap.put("IN2-7-9-3", "Medicaid Case Name - Name Context - Name of Coding System");
    fieldDescMap.put("TQ2-2", "Sequence/Results Flag");
    fieldDescMap.put("NK1-6-9", "Business Phone Number - Any Text");
    fieldDescMap.put("IN2-7-9-2", "Medicaid Case Name - Name Context - Text");
    fieldDescMap.put("TQ2-5", "Related Placer Group Number");
    fieldDescMap.put("TQ2-4", "Related Filler Number");
    fieldDescMap.put("TQ2-7", "Cyclic Entry/Exit Indicator");
    fieldDescMap.put("TQ2-6", "Sequence Condition Code");
    fieldDescMap
        .put("IN2-7-9-6", "Medicaid Case Name - Name Context - Name of Alternate Coding System");
    fieldDescMap.put("NK1-6-2", "Business Phone Number - Telecommunication Use Code");
    fieldDescMap.put("NK1-13-6-2", "Organization Name - NK1 - Assigning Authority - Universal ID");
    fieldDescMap.put("NK1-6-3", "Business Phone Number - Telecommunication Equipment Type");
    fieldDescMap.put("NK1-13-6-1", "Organization Name - NK1 - Assigning Authority - Namespace ID");
    fieldDescMap.put("NK1-6-1", "Business Phone Number - Telephone Number");
    fieldDescMap
        .put("NK1-13-6-3", "Organization Name - NK1 - Assigning Authority - Universal ID Type");
    fieldDescMap.put("NK1-6-6", "Business Phone Number - Area/City Code");
    fieldDescMap.put("IN2-7-9-1", "Medicaid Case Name - Name Context - Identifier");
    fieldDescMap.put("NK1-6-7", "Business Phone Number - Local Number");
    fieldDescMap.put("NK1-6-4", "Business Phone Number - Email Address");
    fieldDescMap.put("NK1-6-5", "Business Phone Number - Country Code");
  }

  /**
   * @return the fieldDataTypeMap
   */
  public Map<String, String> getFieldDataTypeMap() {
    return fieldDataTypeMap;
  }

  /**
   * @return the fieldDescriptionMap
   */
  public Map<String, String> getFieldDescriptionMap() {
    return fieldDescMap;
  }

  /**
   * @return the dataTypeComplexityMap
   */
  public Map<String, FieldComplexity> getDataTypeComplexityMap() {
    return dataTypeComplexityMap;
  }
}
