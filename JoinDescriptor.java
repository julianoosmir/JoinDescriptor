import com.querydsl.core.JoinType;
import com.querydsl.core.types.EntityPath;

public class JoinDescriptor {
    public final EntityPath path;
    public final EntityPath alias;
    public final JoinType type;

    private JoinDescriptor(EntityPath path, JoinType type) {
        this.path = path;
        this.type = type;
        this.alias = null;
    }

    private JoinDescriptor(EntityPath path, JoinType type, EntityPath alias) {
        this.path = path;
        this.type = type;
        this.alias = alias;
    }

    public static JoinDescriptor innerJoin(EntityPath path) {
        return new JoinDescriptor(path, JoinType.INNERJOIN);
    }

    public static JoinDescriptor innerJoin(EntityPath path, EntityPath alias) {
        return new JoinDescriptor(path, JoinType.INNERJOIN, alias);
    }

    public static JoinDescriptor join(EntityPath path) {
        return new JoinDescriptor(path, JoinType.JOIN);
    }

    public static JoinDescriptor leftJoin(EntityPath path) {
        return new JoinDescriptor(path, JoinType.LEFTJOIN);
    }

    public static JoinDescriptor leftJoin(EntityPath path, EntityPath alias) {
        return new JoinDescriptor(path, JoinType.LEFTJOIN, alias);
    }

    public static JoinDescriptor rightJoin(EntityPath path) {
        return new JoinDescriptor(path, JoinType.RIGHTJOIN);
    }
}
