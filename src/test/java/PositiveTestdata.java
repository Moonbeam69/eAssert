import java.time.LocalDateTime;

public class PositiveTestdata {
  public final static String str1                        = "hello world";
  public final String string1startswith                  = "hel";
  public final String string1endswith                    = "rld";
  public final Integer posint                            = 1;
  public final Integer negint                            = -1;
  public final Integer zero                              = 0;
  public final boolean trubool                           = true;
  public final boolean falbool                           = false;
  public final java.util.ArrayList<String> stringlist    = new java.util.ArrayList<>(java.util.Arrays.asList(str1, "string2", "string3"));
  public final java.util.ArrayList<Integer> integerlist  = new java.util.ArrayList<>(java.util.Arrays.asList(posint,3,7));
  public final java.util.ArrayList<Boolean> booleanlist  = new java.util.ArrayList<>(java.util.Arrays.asList(trubool, falbool, trubool));
  public final String[] stringArrayUniqueItems           = {str1, "string2", "string3"};
  public final String[] stringArrayNonUniqueItems        = {str1, str1, "string2", "string3"};
  public final Integer[] integerArrayUniqueItems         = {posint, 4, 7};
  public final Integer[] integerArrayNonUniqueItems      = {posint, posint, 7};
  public final Boolean[] booleanArray                    = {trubool, falbool, trubool};
  public final LocalDateTime past                        = LocalDateTime.of(2023, 6, 17, 14, 30, 0);
}
