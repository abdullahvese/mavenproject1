package SerializationAndDeserialization;

import java.util.List;

public class Courses {
  private List<WebAutomation> webautomation;
  private List<Api> api;

  private List<Mobile> nobile;

    public List<WebAutomation> getWebautomation() {
        return webautomation;
    }

    public void setWebautomation(List<WebAutomation> webautomation) {
        this.webautomation = webautomation;
    }

    public List<Api> getApi() {
        return api;
    }

    public void setApi(List<Api> api) {
        this.api = api;
    }

    public List<Mobile> getNobile() {
        return nobile;
    }

    public void setNobile(List<Mobile> nobile) {
        this.nobile = nobile;
    }
}
//GetC