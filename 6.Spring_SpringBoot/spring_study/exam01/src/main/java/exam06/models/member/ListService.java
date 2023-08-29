package exam06.models.member;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class ListService {

    private final MemberDao memberDao;

    public void print() {
        List<Member> members = memberDao.getList();
        members.stream().forEach(System.out::println);
    }


}
