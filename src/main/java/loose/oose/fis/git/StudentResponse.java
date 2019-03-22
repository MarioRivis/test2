package loose.oose.fis.git;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentResponse {
    private long timestamp;
    private String email;
    private String name;
    private String teacherName;
    private String repoURL;

    private int gitScore;
    private int useCaseScore;
    private String useCaseLink;
}
