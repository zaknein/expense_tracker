
import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;


@Parameters(separators = "=")
public class Parametros{
    @Parameter(
        names = "--description",
        description = "To add description of the purchase",
        required = true
    )
    private String description;


    @Parameter(
        names = "--amount",
        description = "To enter the amount of money spend",
        required = true
    )
    private Double amount;

    

}