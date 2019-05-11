package api;
import retrofit2.call;
import retrofit2.http.GET;
public interface UsuarioApi {

    @GET("users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user);
}
}
