import com.google.api.services.oauth2.Oauth2;
import com.google.api.services.oauth2.Oauth2Request;
import com.google.api.services.oauth2.Oauth2RequestInitializer;

/**
 *  clientId: 1066566735663-1g0b3jas8gioigvt4l0h72ulsq67oh2r.apps.googleusercontent.com
 *  clientSecret: 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
 *  redirectUri: "http://localhost:10100/oauth2/callback/google"
 *  # http://localhost:10100/oauth2/callback/google
 *  scope:
 *     - profile
 *     - email
 */
public class OAuth2Test {

  static final String SECRET_KEY = "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";
  static final String CLIENT_ID = "1066566735663-1g0b3jas8gioigvt4l0h72ulsq67oh2r.apps.googleusercontent.com";
  static final String USER_IP = "http://localhost";



  public static void main(String[] args) {
    Oauth2RequestInitializer initializer = new Oauth2RequestInitializer(SECRET_KEY, USER_IP);

  }

}
