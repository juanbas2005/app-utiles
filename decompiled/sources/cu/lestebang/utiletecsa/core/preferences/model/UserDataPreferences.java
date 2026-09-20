package cu.lestebang.utiletecsa.core.preferences.model;

import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b \n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\bP\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bL\b\u0087\b\u0018\u0000 ì\u00012\u00020\u0001:\u0004í\u0001ì\u0001B©\u0005\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\b\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\b\b\u0002\u0010&\u001a\u00020\u0002\u0012\b\b\u0002\u0010'\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\b\b\u0002\u0010)\u001a\u00020\u0002\u0012\b\b\u0002\u0010*\u001a\u00020\u0002\u0012\b\b\u0002\u0010+\u001a\u00020\u0002\u0012\b\b\u0002\u0010,\u001a\u00020\u0002\u0012\b\b\u0002\u0010-\u001a\u00020\u0002\u0012\b\b\u0002\u0010.\u001a\u00020\u0002\u0012\b\b\u0002\u00100\u001a\u00020/\u0012\b\b\u0002\u00101\u001a\u00020\u0002\u0012\b\b\u0002\u00102\u001a\u00020\u0002\u0012\b\b\u0002\u00103\u001a\u00020/\u0012\b\b\u0002\u00104\u001a\u00020/\u0012\b\b\u0002\u00105\u001a\u00020\u000b\u0012\b\b\u0002\u00106\u001a\u00020\u000b\u0012\b\b\u0002\u00107\u001a\u00020\u000b\u0012\b\b\u0002\u00108\u001a\u00020\u0002\u0012\b\b\u0002\u00109\u001a\u00020\u0002\u0012\b\b\u0002\u0010:\u001a\u00020\b\u0012\b\b\u0002\u0010;\u001a\u00020\b\u0012\b\b\u0002\u0010<\u001a\u00020\b\u0012\b\b\u0002\u0010=\u001a\u00020\b\u0012\b\b\u0002\u0010>\u001a\u00020\b\u0012\b\b\u0002\u0010?\u001a\u00020\b\u0012\b\b\u0002\u0010@\u001a\u00020\b\u0012\b\b\u0002\u0010A\u001a\u00020\b\u0012\b\b\u0002\u0010B\u001a\u00020\u000b\u0012\b\b\u0002\u0010C\u001a\u00020\u0002\u0012\b\b\u0002\u0010D\u001a\u00020\u0002\u0012\b\b\u0002\u0010E\u001a\u00020\u0002\u0012\b\b\u0002\u0010F\u001a\u00020\u0002\u0012\b\b\u0002\u0010G\u001a\u00020\u0002¢\u0006\u0004\bH\u0010IB\u0089\u0005\b\u0010\u0012\u0006\u0010J\u001a\u00020\u000b\u0012\u0006\u0010K\u001a\u00020\u000b\u0012\u0006\u0010L\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\b\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010#\u001a\u00020\b\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u00100\u001a\u00020/\u0012\b\u00101\u001a\u0004\u0018\u00010\u0002\u0012\b\u00102\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u00103\u001a\u00020/\u0012\u0006\u00104\u001a\u00020/\u0012\u0006\u00105\u001a\u00020\u000b\u0012\u0006\u00106\u001a\u00020\u000b\u0012\u0006\u00107\u001a\u00020\u000b\u0012\b\u00108\u001a\u0004\u0018\u00010\u0002\u0012\b\u00109\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010:\u001a\u00020\b\u0012\u0006\u0010;\u001a\u00020\b\u0012\u0006\u0010<\u001a\u00020\b\u0012\u0006\u0010=\u001a\u00020\b\u0012\u0006\u0010>\u001a\u00020\b\u0012\u0006\u0010?\u001a\u00020\b\u0012\u0006\u0010@\u001a\u00020\b\u0012\u0006\u0010A\u001a\u00020\b\u0012\u0006\u0010B\u001a\u00020\u000b\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010D\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010F\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010G\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010N\u001a\u0004\u0018\u00010M¢\u0006\u0004\bH\u0010OJ\u0010\u0010P\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bR\u0010QJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bS\u0010QJ\u0010\u0010T\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bT\u0010UJ\u0010\u0010V\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bX\u0010WJ\u0010\u0010Y\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b[\u0010WJ\u0016\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0003¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b^\u0010QJ\u0010\u0010_\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b_\u0010WJ\u0010\u0010`\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b`\u0010WJ\u0010\u0010a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\ba\u0010WJ\u0010\u0010b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bb\u0010WJ\u0010\u0010c\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bc\u0010WJ\u0010\u0010d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bd\u0010WJ\u0010\u0010e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\be\u0010WJ\u0010\u0010f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bf\u0010WJ\u0010\u0010g\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bg\u0010WJ\u0010\u0010h\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bh\u0010WJ\u0010\u0010i\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bi\u0010WJ\u0010\u0010j\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bj\u0010WJ\u0016\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0003¢\u0006\u0004\bk\u0010]J\u0010\u0010l\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bl\u0010QJ\u0010\u0010m\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bm\u0010QJ\u0010\u0010n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bn\u0010QJ\u0016\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0003¢\u0006\u0004\bo\u0010]J\u0010\u0010p\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bp\u0010QJ\u0010\u0010q\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bq\u0010WJ\u0010\u0010r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\br\u0010QJ\u0016\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0003¢\u0006\u0004\bs\u0010]J\u0010\u0010t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bt\u0010QJ\u0010\u0010u\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bu\u0010QJ\u0016\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0003¢\u0006\u0004\bv\u0010]J\u0010\u0010w\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bw\u0010QJ\u0010\u0010x\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bx\u0010QJ\u0010\u0010y\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\by\u0010QJ\u0010\u0010z\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bz\u0010QJ\u0010\u0010{\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b{\u0010QJ\u0010\u0010|\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b|\u0010QJ\u0010\u0010}\u001a\u00020/HÆ\u0003¢\u0006\u0004\b}\u0010~J\u0010\u0010\u007f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u007f\u0010QJ\u0012\u0010\u0080\u0001\u001a\u00020\u0002HÆ\u0003¢\u0006\u0005\b\u0080\u0001\u0010QJ\u0012\u0010\u0081\u0001\u001a\u00020/HÆ\u0003¢\u0006\u0005\b\u0081\u0001\u0010~J\u0012\u0010\u0082\u0001\u001a\u00020/HÆ\u0003¢\u0006\u0005\b\u0082\u0001\u0010~J\u0012\u0010\u0083\u0001\u001a\u00020\u000bHÆ\u0003¢\u0006\u0005\b\u0083\u0001\u0010ZJ\u0012\u0010\u0084\u0001\u001a\u00020\u000bHÆ\u0003¢\u0006\u0005\b\u0084\u0001\u0010ZJ\u0012\u0010\u0085\u0001\u001a\u00020\u000bHÆ\u0003¢\u0006\u0005\b\u0085\u0001\u0010ZJ\u0012\u0010\u0086\u0001\u001a\u00020\u0002HÆ\u0003¢\u0006\u0005\b\u0086\u0001\u0010QJ\u0012\u0010\u0087\u0001\u001a\u00020\u0002HÆ\u0003¢\u0006\u0005\b\u0087\u0001\u0010QJ\u0012\u0010\u0088\u0001\u001a\u00020\bHÆ\u0003¢\u0006\u0005\b\u0088\u0001\u0010WJ\u0012\u0010\u0089\u0001\u001a\u00020\bHÆ\u0003¢\u0006\u0005\b\u0089\u0001\u0010WJ\u0012\u0010\u008a\u0001\u001a\u00020\bHÆ\u0003¢\u0006\u0005\b\u008a\u0001\u0010WJ\u0012\u0010\u008b\u0001\u001a\u00020\bHÆ\u0003¢\u0006\u0005\b\u008b\u0001\u0010WJ\u0012\u0010\u008c\u0001\u001a\u00020\bHÆ\u0003¢\u0006\u0005\b\u008c\u0001\u0010WJ\u0012\u0010\u008d\u0001\u001a\u00020\bHÆ\u0003¢\u0006\u0005\b\u008d\u0001\u0010WJ\u0012\u0010\u008e\u0001\u001a\u00020\bHÆ\u0003¢\u0006\u0005\b\u008e\u0001\u0010WJ\u0012\u0010\u008f\u0001\u001a\u00020\bHÆ\u0003¢\u0006\u0005\b\u008f\u0001\u0010WJ\u0012\u0010\u0090\u0001\u001a\u00020\u000bHÆ\u0003¢\u0006\u0005\b\u0090\u0001\u0010ZJ\u0012\u0010\u0091\u0001\u001a\u00020\u0002HÆ\u0003¢\u0006\u0005\b\u0091\u0001\u0010QJ\u0012\u0010\u0092\u0001\u001a\u00020\u0002HÆ\u0003¢\u0006\u0005\b\u0092\u0001\u0010QJ\u0012\u0010\u0093\u0001\u001a\u00020\u0002HÆ\u0003¢\u0006\u0005\b\u0093\u0001\u0010QJ\u0012\u0010\u0094\u0001\u001a\u00020\u0002HÆ\u0003¢\u0006\u0005\b\u0094\u0001\u0010QJ\u0012\u0010\u0095\u0001\u001a\u00020\u0002HÆ\u0003¢\u0006\u0005\b\u0095\u0001\u0010QJµ\u0005\u0010\u0096\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\u00022\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\b\u0002\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u00022\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\b\u0002\u0010)\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020\u00022\b\b\u0002\u0010,\u001a\u00020\u00022\b\b\u0002\u0010-\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020\u00022\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020\u00022\b\b\u0002\u00102\u001a\u00020\u00022\b\b\u0002\u00103\u001a\u00020/2\b\b\u0002\u00104\u001a\u00020/2\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u00020\u000b2\b\b\u0002\u00107\u001a\u00020\u000b2\b\b\u0002\u00108\u001a\u00020\u00022\b\b\u0002\u00109\u001a\u00020\u00022\b\b\u0002\u0010:\u001a\u00020\b2\b\b\u0002\u0010;\u001a\u00020\b2\b\b\u0002\u0010<\u001a\u00020\b2\b\b\u0002\u0010=\u001a\u00020\b2\b\b\u0002\u0010>\u001a\u00020\b2\b\b\u0002\u0010?\u001a\u00020\b2\b\b\u0002\u0010@\u001a\u00020\b2\b\b\u0002\u0010A\u001a\u00020\b2\b\b\u0002\u0010B\u001a\u00020\u000b2\b\b\u0002\u0010C\u001a\u00020\u00022\b\b\u0002\u0010D\u001a\u00020\u00022\b\b\u0002\u0010E\u001a\u00020\u00022\b\b\u0002\u0010F\u001a\u00020\u00022\b\b\u0002\u0010G\u001a\u00020\u0002HÆ\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0012\u0010\u0098\u0001\u001a\u00020\u0002HÖ\u0001¢\u0006\u0005\b\u0098\u0001\u0010QJ\u0012\u0010\u0099\u0001\u001a\u00020\u000bHÖ\u0001¢\u0006\u0005\b\u0099\u0001\u0010ZJ\u001e\u0010\u009b\u0001\u001a\u00020\b2\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J0\u0010¥\u0001\u001a\u00030¢\u00012\u0007\u0010\u009d\u0001\u001a\u00020\u00002\b\u0010\u009f\u0001\u001a\u00030\u009e\u00012\b\u0010¡\u0001\u001a\u00030 \u0001H\u0001¢\u0006\u0006\b£\u0001\u0010¤\u0001R\u0019\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0003\u0010¦\u0001\u001a\u0005\b§\u0001\u0010QR\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0004\u0010¦\u0001\u001a\u0005\b¨\u0001\u0010QR\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0005\u0010¦\u0001\u001a\u0005\b©\u0001\u0010QR\u0019\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b\u0007\u0010ª\u0001\u001a\u0005\b«\u0001\u0010UR\u0019\u0010\t\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\t\u0010¬\u0001\u001a\u0005\b\u00ad\u0001\u0010WR\u0019\u0010\n\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\n\u0010¬\u0001\u001a\u0005\b®\u0001\u0010WR\u0019\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\u000e\n\u0005\b\f\u0010¯\u0001\u001a\u0005\b°\u0001\u0010ZR\u0019\u0010\r\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\r\u0010¬\u0001\u001a\u0005\b±\u0001\u0010WR\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b\u000f\u0010²\u0001\u001a\u0005\b³\u0001\u0010]R\u0019\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0010\u0010¦\u0001\u001a\u0005\b´\u0001\u0010QR\u0019\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u0011\u0010¬\u0001\u001a\u0005\bµ\u0001\u0010WR\u0019\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u0012\u0010¬\u0001\u001a\u0005\b¶\u0001\u0010WR\u0019\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u0013\u0010¬\u0001\u001a\u0005\b·\u0001\u0010WR\u0019\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u0014\u0010¬\u0001\u001a\u0005\b¸\u0001\u0010WR\u0019\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u0015\u0010¬\u0001\u001a\u0005\b¹\u0001\u0010WR\u0019\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u0016\u0010¬\u0001\u001a\u0005\bº\u0001\u0010WR\u0019\u0010\u0017\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u0017\u0010¬\u0001\u001a\u0005\b»\u0001\u0010WR\u0019\u0010\u0018\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u0018\u0010¬\u0001\u001a\u0005\b¼\u0001\u0010WR\u0019\u0010\u0019\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u0019\u0010¬\u0001\u001a\u0005\b½\u0001\u0010WR\u0019\u0010\u001a\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u001a\u0010¬\u0001\u001a\u0005\b¾\u0001\u0010WR\u0019\u0010\u001b\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u001b\u0010¬\u0001\u001a\u0005\b¿\u0001\u0010WR\u0019\u0010\u001c\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u001c\u0010¬\u0001\u001a\u0005\bÀ\u0001\u0010WR\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b\u001d\u0010²\u0001\u001a\u0005\bÁ\u0001\u0010]R\u0019\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u001e\u0010¦\u0001\u001a\u0005\bÂ\u0001\u0010QR\u0019\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u001f\u0010¦\u0001\u001a\u0005\bÃ\u0001\u0010QR\u0019\u0010 \u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b \u0010¦\u0001\u001a\u0005\bÄ\u0001\u0010QR\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b!\u0010²\u0001\u001a\u0005\bÅ\u0001\u0010]R\u0019\u0010\"\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\"\u0010¦\u0001\u001a\u0005\bÆ\u0001\u0010QR\u0019\u0010#\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b#\u0010¬\u0001\u001a\u0005\bÇ\u0001\u0010WR\u0019\u0010$\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b$\u0010¦\u0001\u001a\u0005\bÈ\u0001\u0010QR\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b%\u0010²\u0001\u001a\u0005\bÉ\u0001\u0010]R\u0019\u0010&\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b&\u0010¦\u0001\u001a\u0005\bÊ\u0001\u0010QR\u0019\u0010'\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b'\u0010¦\u0001\u001a\u0005\bË\u0001\u0010QR\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b(\u0010²\u0001\u001a\u0005\bÌ\u0001\u0010]R\u0019\u0010)\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b)\u0010¦\u0001\u001a\u0005\bÍ\u0001\u0010QR\u0019\u0010*\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b*\u0010¦\u0001\u001a\u0005\bÎ\u0001\u0010QR\u0019\u0010+\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b+\u0010¦\u0001\u001a\u0005\bÏ\u0001\u0010QR\u0019\u0010,\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b,\u0010¦\u0001\u001a\u0005\bÐ\u0001\u0010QR\u0019\u0010-\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b-\u0010¦\u0001\u001a\u0005\bÑ\u0001\u0010QR\u0019\u0010.\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b.\u0010¦\u0001\u001a\u0005\bÒ\u0001\u0010QR\u0019\u00100\u001a\u00020/8\u0006¢\u0006\u000e\n\u0005\b0\u0010Ó\u0001\u001a\u0005\bÔ\u0001\u0010~R\u0019\u00101\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b1\u0010¦\u0001\u001a\u0005\bÕ\u0001\u0010QR\u0019\u00102\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b2\u0010¦\u0001\u001a\u0005\bÖ\u0001\u0010QR\u0019\u00103\u001a\u00020/8\u0006¢\u0006\u000e\n\u0005\b3\u0010Ó\u0001\u001a\u0005\b×\u0001\u0010~R\u0019\u00104\u001a\u00020/8\u0006¢\u0006\u000e\n\u0005\b4\u0010Ó\u0001\u001a\u0005\bØ\u0001\u0010~R\u0019\u00105\u001a\u00020\u000b8\u0006¢\u0006\u000e\n\u0005\b5\u0010¯\u0001\u001a\u0005\bÙ\u0001\u0010ZR\u0019\u00106\u001a\u00020\u000b8\u0006¢\u0006\u000e\n\u0005\b6\u0010¯\u0001\u001a\u0005\bÚ\u0001\u0010ZR\u0019\u00107\u001a\u00020\u000b8\u0006¢\u0006\u000e\n\u0005\b7\u0010¯\u0001\u001a\u0005\bÛ\u0001\u0010ZR\u0019\u00108\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b8\u0010¦\u0001\u001a\u0005\bÜ\u0001\u0010QR\u0019\u00109\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b9\u0010¦\u0001\u001a\u0005\bÝ\u0001\u0010QR\u0019\u0010:\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b:\u0010¬\u0001\u001a\u0005\bÞ\u0001\u0010WR\u0019\u0010;\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b;\u0010¬\u0001\u001a\u0005\bß\u0001\u0010WR\u0019\u0010<\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b<\u0010¬\u0001\u001a\u0005\bà\u0001\u0010WR\u0019\u0010=\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b=\u0010¬\u0001\u001a\u0005\bá\u0001\u0010WR\u0019\u0010>\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b>\u0010¬\u0001\u001a\u0005\bâ\u0001\u0010WR\u0019\u0010?\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b?\u0010¬\u0001\u001a\u0005\bã\u0001\u0010WR\u0019\u0010@\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b@\u0010¬\u0001\u001a\u0005\bä\u0001\u0010WR\u0019\u0010A\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\bA\u0010¬\u0001\u001a\u0005\bå\u0001\u0010WR\u0019\u0010B\u001a\u00020\u000b8\u0006¢\u0006\u000e\n\u0005\bB\u0010¯\u0001\u001a\u0005\bæ\u0001\u0010ZR\u0019\u0010C\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bC\u0010¦\u0001\u001a\u0005\bç\u0001\u0010QR\u0019\u0010D\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bD\u0010¦\u0001\u001a\u0005\bè\u0001\u0010QR\u0019\u0010E\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bE\u0010¦\u0001\u001a\u0005\bé\u0001\u0010QR\u0019\u0010F\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bF\u0010¦\u0001\u001a\u0005\bê\u0001\u0010QR\u0019\u0010G\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bG\u0010¦\u0001\u001a\u0005\bë\u0001\u0010Q¨\u0006î\u0001"}, d2 = {"Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;", "", "", "id", "userName", "profilePictureUriString", "Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences;", "darkThemeConfigPreferences", "", "useDynamicColor", "ussdRefreshModeEnabled", "", "defaultSimSlot", "showEtecsaBanner", "", "homeCollapsedSections", "balanceSecondaryInfo", "planExpiryNotifyEnabled", "appLockEnabled", "termsAccepted", "forumTermsAccepted", "permissionsRequestedOnce", "blockAnonymousCalls", "blockRevertidaCalls", "blockFijoCalls", "blockUnknownCalls", "blockAllCalls", "callAlertAllCalls", "callAlertRevertidaCalls", "planExpiryNotified", "appUpdateNotifiedVersion", "saldoUssdSim1", "saldoUssdSim2", "asterisco99History", "transferPin", "planesSinConfirmacion", "nautaLogoutUrl", "nautaCookies", "nautaSessionUser", "nautaSessionAvailableTime", "nautaSavedAccounts", "accountId", "accountName", "accountEmail", "accountAvatarUrl", "spotsNick", "spotsDeviceId", "", "spotsLastPublishMillis", "licenseStatus", "licenseTransferId", "licenseActivatedAt", "licenseLastCheckMillis", "licensePriceTransferCup", "licensePriceSaldoCup", "licenseDiscountPercent", "licenseDiscountSource", "licenseCouponCode", "voiceNotificationsUssdEnabled", "voiceNotificationsIncomingEnabled", "speedOverlayAutoEnabled", "ussdAutoEnabled", "ussdAutoAfterCallEnabled", "ussdAutoAfterSmsEnabled", "ussdAutoAfterDataOffEnabled", "ussdAutoPeriodicEnabled", "ussdAutoIntervalMinutes", "ussdAutoVoiceCode", "ussdAutoSmsCode", "ussdAutoDataCode", "ussdAutoPeriodicQuery", "invitationCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences;ZZIZLjava/util/List;Ljava/lang/String;ZZZZZZZZZZZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JJIIILjava/lang/String;Ljava/lang/String;ZZZZZZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "seen1", "seen2", "Lrl6;", "serializationConstructorMarker", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences;ZZIZLjava/util/List;Ljava/lang/String;ZZZZZZZZZZZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JJIIILjava/lang/String;Ljava/lang/String;ZZZZZZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrl6;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences;", "component5", "()Z", "component6", "component7", "()I", "component8", "component9", "()Ljava/util/List;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "()J", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "component62", "component63", "component64", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences;ZZIZLjava/util/List;Ljava/lang/String;ZZZZZZZZZZZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JJIIILjava/lang/String;Ljava/lang/String;ZZZZZZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$preferences", "(Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;Lhy0;Lll6;)V", "write$Self", "Ljava/lang/String;", "getId", "getUserName", "getProfilePictureUriString", "Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences;", "getDarkThemeConfigPreferences", "Z", "getUseDynamicColor", "getUssdRefreshModeEnabled", "I", "getDefaultSimSlot", "getShowEtecsaBanner", "Ljava/util/List;", "getHomeCollapsedSections", "getBalanceSecondaryInfo", "getPlanExpiryNotifyEnabled", "getAppLockEnabled", "getTermsAccepted", "getForumTermsAccepted", "getPermissionsRequestedOnce", "getBlockAnonymousCalls", "getBlockRevertidaCalls", "getBlockFijoCalls", "getBlockUnknownCalls", "getBlockAllCalls", "getCallAlertAllCalls", "getCallAlertRevertidaCalls", "getPlanExpiryNotified", "getAppUpdateNotifiedVersion", "getSaldoUssdSim1", "getSaldoUssdSim2", "getAsterisco99History", "getTransferPin", "getPlanesSinConfirmacion", "getNautaLogoutUrl", "getNautaCookies", "getNautaSessionUser", "getNautaSessionAvailableTime", "getNautaSavedAccounts", "getAccountId", "getAccountName", "getAccountEmail", "getAccountAvatarUrl", "getSpotsNick", "getSpotsDeviceId", "J", "getSpotsLastPublishMillis", "getLicenseStatus", "getLicenseTransferId", "getLicenseActivatedAt", "getLicenseLastCheckMillis", "getLicensePriceTransferCup", "getLicensePriceSaldoCup", "getLicenseDiscountPercent", "getLicenseDiscountSource", "getLicenseCouponCode", "getVoiceNotificationsUssdEnabled", "getVoiceNotificationsIncomingEnabled", "getSpeedOverlayAutoEnabled", "getUssdAutoEnabled", "getUssdAutoAfterCallEnabled", "getUssdAutoAfterSmsEnabled", "getUssdAutoAfterDataOffEnabled", "getUssdAutoPeriodicEnabled", "getUssdAutoIntervalMinutes", "getUssdAutoVoiceCode", "getUssdAutoSmsCode", "getUssdAutoDataCode", "getUssdAutoPeriodicQuery", "getInvitationCode", "Companion", "$serializer", "preferences"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
@Serializable
/* loaded from: classes.dex */
public final class UserDataPreferences {
    private static final nz3[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final String accountAvatarUrl;
    private final String accountEmail;
    private final String accountId;
    private final String accountName;
    private final boolean appLockEnabled;
    private final String appUpdateNotifiedVersion;
    private final List<String> asterisco99History;
    private final String balanceSecondaryInfo;
    private final boolean blockAllCalls;
    private final boolean blockAnonymousCalls;
    private final boolean blockFijoCalls;
    private final boolean blockRevertidaCalls;
    private final boolean blockUnknownCalls;
    private final boolean callAlertAllCalls;
    private final boolean callAlertRevertidaCalls;
    private final DarkThemeConfigPreferences darkThemeConfigPreferences;
    private final int defaultSimSlot;
    private final boolean forumTermsAccepted;
    private final List<String> homeCollapsedSections;
    private final String id;
    private final String invitationCode;
    private final long licenseActivatedAt;
    private final String licenseCouponCode;
    private final int licenseDiscountPercent;
    private final String licenseDiscountSource;
    private final long licenseLastCheckMillis;
    private final int licensePriceSaldoCup;
    private final int licensePriceTransferCup;
    private final String licenseStatus;
    private final String licenseTransferId;
    private final List<String> nautaCookies;
    private final String nautaLogoutUrl;
    private final List<String> nautaSavedAccounts;
    private final String nautaSessionAvailableTime;
    private final String nautaSessionUser;
    private final boolean permissionsRequestedOnce;
    private final List<String> planExpiryNotified;
    private final boolean planExpiryNotifyEnabled;
    private final boolean planesSinConfirmacion;
    private final String profilePictureUriString;
    private final String saldoUssdSim1;
    private final String saldoUssdSim2;
    private final boolean showEtecsaBanner;
    private final boolean speedOverlayAutoEnabled;
    private final String spotsDeviceId;
    private final long spotsLastPublishMillis;
    private final String spotsNick;
    private final boolean termsAccepted;
    private final String transferPin;
    private final boolean useDynamicColor;
    private final String userName;
    private final boolean ussdAutoAfterCallEnabled;
    private final boolean ussdAutoAfterDataOffEnabled;
    private final boolean ussdAutoAfterSmsEnabled;
    private final String ussdAutoDataCode;
    private final boolean ussdAutoEnabled;
    private final int ussdAutoIntervalMinutes;
    private final boolean ussdAutoPeriodicEnabled;
    private final String ussdAutoPeriodicQuery;
    private final String ussdAutoSmsCode;
    private final String ussdAutoVoiceCode;
    private final boolean ussdRefreshModeEnabled;
    private final boolean voiceNotificationsIncomingEnabled;
    private final boolean voiceNotificationsUssdEnabled;

    static {
        wi7 wi7Var = new wi7(7);
        i44 i44Var = i44.w;
        $childSerializers = new nz3[]{null, null, null, rg3.y(i44Var, wi7Var), null, null, null, null, rg3.y(i44Var, new wi7(8)), null, null, null, null, null, null, null, null, null, null, null, null, null, rg3.y(i44Var, new wi7(9)), null, null, null, rg3.y(i44Var, new wi7(10)), null, null, null, rg3.y(i44Var, new wi7(11)), null, null, rg3.y(i44Var, new wi7(12)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public UserDataPreferences(int i, int i2, int i3, String str, String str2, String str3, DarkThemeConfigPreferences darkThemeConfigPreferences, boolean z, boolean z2, int i4, boolean z3, List list, String str4, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, List list2, String str5, String str6, String str7, List list3, String str8, boolean z16, String str9, List list4, String str10, String str11, List list5, String str12, String str13, String str14, String str15, String str16, String str17, long j, String str18, String str19, long j2, long j3, int i5, int i6, int i7, String str20, String str21, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, int i8, String str22, String str23, String str24, String str25, String str26, rl6 rl6Var) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        this.id = (i & 1) == 0 ? "local_user" : str;
        if ((i & 2) == 0) {
            this.userName = null;
        } else {
            this.userName = str2;
        }
        if ((i & 4) == 0) {
            this.profilePictureUriString = null;
        } else {
            this.profilePictureUriString = str3;
        }
        this.darkThemeConfigPreferences = (i & 8) == 0 ? DarkThemeConfigPreferences.FOLLOW_SYSTEM : darkThemeConfigPreferences;
        if ((i & 16) == 0) {
            this.useDynamicColor = true;
        } else {
            this.useDynamicColor = z;
        }
        if ((i & 32) == 0) {
            this.ussdRefreshModeEnabled = false;
        } else {
            this.ussdRefreshModeEnabled = z2;
        }
        if ((i & 64) == 0) {
            this.defaultSimSlot = 0;
        } else {
            this.defaultSimSlot = i4;
        }
        if ((i & 128) == 0) {
            this.showEtecsaBanner = true;
        } else {
            this.showEtecsaBanner = z3;
        }
        int i19 = i & 256;
        a42 a42Var = a42.w;
        if (i19 == 0) {
            this.homeCollapsedSections = a42Var;
        } else {
            this.homeCollapsedSections = list;
        }
        this.balanceSecondaryInfo = (i & 512) == 0 ? "BONO" : str4;
        if ((i & 1024) == 0) {
            this.planExpiryNotifyEnabled = false;
        } else {
            this.planExpiryNotifyEnabled = z4;
        }
        if ((i & 2048) == 0) {
            this.appLockEnabled = false;
        } else {
            this.appLockEnabled = z5;
        }
        if ((i & 4096) == 0) {
            this.termsAccepted = false;
        } else {
            this.termsAccepted = z6;
        }
        if ((i & 8192) == 0) {
            this.forumTermsAccepted = false;
        } else {
            this.forumTermsAccepted = z7;
        }
        if ((i & 16384) == 0) {
            this.permissionsRequestedOnce = false;
        } else {
            this.permissionsRequestedOnce = z8;
        }
        if ((i & 32768) == 0) {
            this.blockAnonymousCalls = false;
        } else {
            this.blockAnonymousCalls = z9;
        }
        if ((i & 65536) == 0) {
            this.blockRevertidaCalls = false;
        } else {
            this.blockRevertidaCalls = z10;
        }
        if ((i & 131072) == 0) {
            this.blockFijoCalls = false;
        } else {
            this.blockFijoCalls = z11;
        }
        if ((i & 262144) == 0) {
            this.blockUnknownCalls = false;
        } else {
            this.blockUnknownCalls = z12;
        }
        if ((i & 524288) == 0) {
            this.blockAllCalls = false;
        } else {
            this.blockAllCalls = z13;
        }
        if ((i & 1048576) == 0) {
            this.callAlertAllCalls = false;
        } else {
            this.callAlertAllCalls = z14;
        }
        if ((i & 2097152) == 0) {
            this.callAlertRevertidaCalls = false;
        } else {
            this.callAlertRevertidaCalls = z15;
        }
        if ((i & 4194304) == 0) {
            this.planExpiryNotified = a42Var;
        } else {
            this.planExpiryNotified = list2;
        }
        if ((i & 8388608) == 0) {
            this.appUpdateNotifiedVersion = "";
        } else {
            this.appUpdateNotifiedVersion = str5;
        }
        if ((i & 16777216) == 0) {
            this.saldoUssdSim1 = "CONSULTAR_SALDO";
            i9 = 65536;
        } else {
            i9 = 65536;
            this.saldoUssdSim1 = str6;
        }
        this.saldoUssdSim2 = (i & 33554432) != 0 ? str7 : "CONSULTAR_SALDO";
        if ((i & 67108864) == 0) {
            this.asterisco99History = a42Var;
            i10 = 67108864;
        } else {
            i10 = 67108864;
            this.asterisco99History = list3;
        }
        if ((i & 134217728) == 0) {
            this.transferPin = "";
            i11 = 134217728;
        } else {
            i11 = 134217728;
            this.transferPin = str8;
        }
        if ((i & 268435456) == 0) {
            this.planesSinConfirmacion = false;
            i12 = 268435456;
        } else {
            i12 = 268435456;
            this.planesSinConfirmacion = z16;
        }
        if ((i & 536870912) == 0) {
            this.nautaLogoutUrl = "";
            i13 = 536870912;
        } else {
            i13 = 536870912;
            this.nautaLogoutUrl = str9;
        }
        if ((i & 1073741824) == 0) {
            this.nautaCookies = a42Var;
            i14 = 1073741824;
        } else {
            i14 = 1073741824;
            this.nautaCookies = list4;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.nautaSessionUser = "";
        } else {
            this.nautaSessionUser = str10;
        }
        if ((i2 & 1) == 0) {
            this.nautaSessionAvailableTime = "";
        } else {
            this.nautaSessionAvailableTime = str11;
        }
        if ((i2 & 2) == 0) {
            this.nautaSavedAccounts = a42Var;
        } else {
            this.nautaSavedAccounts = list5;
        }
        if ((i2 & 4) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str12;
        }
        if ((i2 & 8) == 0) {
            this.accountName = "";
        } else {
            this.accountName = str13;
        }
        if ((i2 & 16) == 0) {
            this.accountEmail = "";
        } else {
            this.accountEmail = str14;
        }
        if ((i2 & 32) == 0) {
            this.accountAvatarUrl = "";
        } else {
            this.accountAvatarUrl = str15;
        }
        if ((i2 & 64) == 0) {
            this.spotsNick = "";
        } else {
            this.spotsNick = str16;
        }
        if ((i2 & 128) == 0) {
            this.spotsDeviceId = "";
        } else {
            this.spotsDeviceId = str17;
        }
        if ((i2 & 256) == 0) {
            this.spotsLastPublishMillis = 0L;
            i15 = 33554432;
            i16 = 131072;
        } else {
            i15 = 33554432;
            i16 = 131072;
            this.spotsLastPublishMillis = j;
        }
        if ((i2 & 512) == 0) {
            this.licenseStatus = "NONE";
        } else {
            this.licenseStatus = str18;
        }
        if ((i2 & 1024) == 0) {
            this.licenseTransferId = "";
        } else {
            this.licenseTransferId = str19;
        }
        if ((i2 & 2048) == 0) {
            this.licenseActivatedAt = 0L;
            i17 = 262144;
            i18 = 524288;
        } else {
            i17 = 262144;
            i18 = 524288;
            this.licenseActivatedAt = j2;
        }
        this.licenseLastCheckMillis = (i2 & 4096) != 0 ? j3 : 0L;
        this.licensePriceTransferCup = (i2 & 8192) == 0 ? 200 : i5;
        this.licensePriceSaldoCup = (i2 & 16384) == 0 ? 100 : i6;
        if ((i2 & 32768) == 0) {
            this.licenseDiscountPercent = 0;
        } else {
            this.licenseDiscountPercent = i7;
        }
        if ((i2 & i9) == 0) {
            this.licenseDiscountSource = "NONE";
        } else {
            this.licenseDiscountSource = str20;
        }
        if ((i2 & i16) == 0) {
            this.licenseCouponCode = "";
        } else {
            this.licenseCouponCode = str21;
        }
        if ((i2 & i17) == 0) {
            this.voiceNotificationsUssdEnabled = false;
        } else {
            this.voiceNotificationsUssdEnabled = z17;
        }
        if ((i2 & i18) == 0) {
            this.voiceNotificationsIncomingEnabled = false;
        } else {
            this.voiceNotificationsIncomingEnabled = z18;
        }
        if ((i2 & 1048576) == 0) {
            this.speedOverlayAutoEnabled = false;
        } else {
            this.speedOverlayAutoEnabled = z19;
        }
        if ((i2 & 2097152) == 0) {
            this.ussdAutoEnabled = false;
        } else {
            this.ussdAutoEnabled = z20;
        }
        if ((i2 & 4194304) == 0) {
            this.ussdAutoAfterCallEnabled = false;
        } else {
            this.ussdAutoAfterCallEnabled = z21;
        }
        if ((i2 & 8388608) == 0) {
            this.ussdAutoAfterSmsEnabled = false;
        } else {
            this.ussdAutoAfterSmsEnabled = z22;
        }
        if ((i2 & 16777216) == 0) {
            this.ussdAutoAfterDataOffEnabled = false;
        } else {
            this.ussdAutoAfterDataOffEnabled = z23;
        }
        if ((i2 & i15) == 0) {
            this.ussdAutoPeriodicEnabled = false;
        } else {
            this.ussdAutoPeriodicEnabled = z24;
        }
        this.ussdAutoIntervalMinutes = (i2 & i10) == 0 ? 30 : i8;
        this.ussdAutoVoiceCode = (i2 & i11) == 0 ? "*222*869#" : str22;
        this.ussdAutoSmsCode = (i2 & i12) == 0 ? "*222*767#" : str23;
        this.ussdAutoDataCode = (i2 & i13) == 0 ? "*222*328#" : str24;
        this.ussdAutoPeriodicQuery = (i2 & i14) == 0 ? "SALDO" : str25;
        if ((i2 & Integer.MIN_VALUE) == 0) {
            this.invitationCode = "";
        } else {
            this.invitationCode = str26;
        }
    }

    public static final /* synthetic */ zr3 _childSerializers$_anonymous_() {
        return DarkThemeConfigPreferences.Companion.serializer();
    }

    public static final /* synthetic */ zr3 _childSerializers$_anonymous_$0() {
        return new cs(t47.a, 0);
    }

    public static final /* synthetic */ zr3 _childSerializers$_anonymous_$1() {
        return new cs(t47.a, 0);
    }

    public static final /* synthetic */ zr3 _childSerializers$_anonymous_$2() {
        return new cs(t47.a, 0);
    }

    public static final /* synthetic */ zr3 _childSerializers$_anonymous_$3() {
        return new cs(t47.a, 0);
    }

    public static final /* synthetic */ zr3 _childSerializers$_anonymous_$4() {
        return new cs(t47.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserDataPreferences copy$default(UserDataPreferences userDataPreferences, String str, String str2, String str3, DarkThemeConfigPreferences darkThemeConfigPreferences, boolean z, boolean z2, int i, boolean z3, List list, String str4, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, List list2, String str5, String str6, String str7, List list3, String str8, boolean z16, String str9, List list4, String str10, String str11, List list5, String str12, String str13, String str14, String str15, String str16, String str17, long j, String str18, String str19, long j2, long j3, int i2, int i3, int i4, String str20, String str21, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, int i5, String str22, String str23, String str24, String str25, String str26, int i6, int i7, Object obj) {
        boolean z25;
        String str27;
        long j4;
        String str28 = (i6 & 1) != 0 ? userDataPreferences.id : str;
        String str29 = (i6 & 2) != 0 ? userDataPreferences.userName : str2;
        String str30 = (i6 & 4) != 0 ? userDataPreferences.profilePictureUriString : str3;
        DarkThemeConfigPreferences darkThemeConfigPreferences2 = (i6 & 8) != 0 ? userDataPreferences.darkThemeConfigPreferences : darkThemeConfigPreferences;
        boolean z26 = (i6 & 16) != 0 ? userDataPreferences.useDynamicColor : z;
        boolean z27 = (i6 & 32) != 0 ? userDataPreferences.ussdRefreshModeEnabled : z2;
        int i8 = (i6 & 64) != 0 ? userDataPreferences.defaultSimSlot : i;
        boolean z28 = (i6 & 128) != 0 ? userDataPreferences.showEtecsaBanner : z3;
        List<String> list6 = (i6 & 256) != 0 ? userDataPreferences.homeCollapsedSections : list;
        String str31 = (i6 & 512) != 0 ? userDataPreferences.balanceSecondaryInfo : str4;
        boolean z29 = (i6 & 1024) != 0 ? userDataPreferences.planExpiryNotifyEnabled : z4;
        boolean z30 = (i6 & 2048) != 0 ? userDataPreferences.appLockEnabled : z5;
        boolean z31 = (i6 & 4096) != 0 ? userDataPreferences.termsAccepted : z6;
        String str32 = str28;
        boolean z32 = (i6 & 8192) != 0 ? userDataPreferences.forumTermsAccepted : z7;
        boolean z33 = (i6 & 16384) != 0 ? userDataPreferences.permissionsRequestedOnce : z8;
        boolean z34 = (i6 & 32768) != 0 ? userDataPreferences.blockAnonymousCalls : z9;
        boolean z35 = (i6 & 65536) != 0 ? userDataPreferences.blockRevertidaCalls : z10;
        boolean z36 = (i6 & 131072) != 0 ? userDataPreferences.blockFijoCalls : z11;
        boolean z37 = (i6 & 262144) != 0 ? userDataPreferences.blockUnknownCalls : z12;
        boolean z38 = (i6 & 524288) != 0 ? userDataPreferences.blockAllCalls : z13;
        boolean z39 = (i6 & 1048576) != 0 ? userDataPreferences.callAlertAllCalls : z14;
        boolean z40 = (i6 & 2097152) != 0 ? userDataPreferences.callAlertRevertidaCalls : z15;
        List<String> list7 = (i6 & 4194304) != 0 ? userDataPreferences.planExpiryNotified : list2;
        String str33 = (i6 & 8388608) != 0 ? userDataPreferences.appUpdateNotifiedVersion : str5;
        String str34 = (i6 & 16777216) != 0 ? userDataPreferences.saldoUssdSim1 : str6;
        String str35 = (i6 & 33554432) != 0 ? userDataPreferences.saldoUssdSim2 : str7;
        List<String> list8 = (i6 & 67108864) != 0 ? userDataPreferences.asterisco99History : list3;
        String str36 = (i6 & 134217728) != 0 ? userDataPreferences.transferPin : str8;
        boolean z41 = (i6 & 268435456) != 0 ? userDataPreferences.planesSinConfirmacion : z16;
        String str37 = (i6 & 536870912) != 0 ? userDataPreferences.nautaLogoutUrl : str9;
        List<String> list9 = (i6 & 1073741824) != 0 ? userDataPreferences.nautaCookies : list4;
        String str38 = (i6 & Integer.MIN_VALUE) != 0 ? userDataPreferences.nautaSessionUser : str10;
        String str39 = (i7 & 1) != 0 ? userDataPreferences.nautaSessionAvailableTime : str11;
        List<String> list10 = (i7 & 2) != 0 ? userDataPreferences.nautaSavedAccounts : list5;
        String str40 = (i7 & 4) != 0 ? userDataPreferences.accountId : str12;
        String str41 = (i7 & 8) != 0 ? userDataPreferences.accountName : str13;
        String str42 = (i7 & 16) != 0 ? userDataPreferences.accountEmail : str14;
        String str43 = (i7 & 32) != 0 ? userDataPreferences.accountAvatarUrl : str15;
        String str44 = (i7 & 64) != 0 ? userDataPreferences.spotsNick : str16;
        String str45 = (i7 & 128) != 0 ? userDataPreferences.spotsDeviceId : str17;
        if ((i7 & 256) != 0) {
            z25 = z33;
            str27 = str29;
            j4 = userDataPreferences.spotsLastPublishMillis;
        } else {
            z25 = z33;
            str27 = str29;
            j4 = j;
        }
        return userDataPreferences.copy(str32, str27, str30, darkThemeConfigPreferences2, z26, z27, i8, z28, list6, str31, z29, z30, z31, z32, z25, z34, z35, z36, z37, z38, z39, z40, list7, str33, str34, str35, list8, str36, z41, str37, list9, str38, str39, list10, str40, str41, str42, str43, str44, str45, j4, (i7 & 512) != 0 ? userDataPreferences.licenseStatus : str18, (i7 & 1024) != 0 ? userDataPreferences.licenseTransferId : str19, (i7 & 2048) != 0 ? userDataPreferences.licenseActivatedAt : j2, (i7 & 4096) != 0 ? userDataPreferences.licenseLastCheckMillis : j3, (i7 & 8192) != 0 ? userDataPreferences.licensePriceTransferCup : i2, (i7 & 16384) != 0 ? userDataPreferences.licensePriceSaldoCup : i3, (i7 & 32768) != 0 ? userDataPreferences.licenseDiscountPercent : i4, (i7 & 65536) != 0 ? userDataPreferences.licenseDiscountSource : str20, (i7 & 131072) != 0 ? userDataPreferences.licenseCouponCode : str21, (i7 & 262144) != 0 ? userDataPreferences.voiceNotificationsUssdEnabled : z17, (i7 & 524288) != 0 ? userDataPreferences.voiceNotificationsIncomingEnabled : z18, (i7 & 1048576) != 0 ? userDataPreferences.speedOverlayAutoEnabled : z19, (i7 & 2097152) != 0 ? userDataPreferences.ussdAutoEnabled : z20, (i7 & 4194304) != 0 ? userDataPreferences.ussdAutoAfterCallEnabled : z21, (i7 & 8388608) != 0 ? userDataPreferences.ussdAutoAfterSmsEnabled : z22, (i7 & 16777216) != 0 ? userDataPreferences.ussdAutoAfterDataOffEnabled : z23, (i7 & 33554432) != 0 ? userDataPreferences.ussdAutoPeriodicEnabled : z24, (i7 & 67108864) != 0 ? userDataPreferences.ussdAutoIntervalMinutes : i5, (i7 & 134217728) != 0 ? userDataPreferences.ussdAutoVoiceCode : str22, (i7 & 268435456) != 0 ? userDataPreferences.ussdAutoSmsCode : str23, (i7 & 536870912) != 0 ? userDataPreferences.ussdAutoDataCode : str24, (i7 & 1073741824) != 0 ? userDataPreferences.ussdAutoPeriodicQuery : str25, (i7 & Integer.MIN_VALUE) != 0 ? userDataPreferences.invitationCode : str26);
    }

    public static final /* synthetic */ void write$Self$preferences(UserDataPreferences userDataPreferences, hy0 hy0Var, ll6 ll6Var) {
        nz3[] nz3VarArr = $childSerializers;
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.id, "local_user")) {
            hy0Var.x(ll6Var, 0, userDataPreferences.id);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.userName != null) {
            hy0Var.A(ll6Var, 1, t47.a, userDataPreferences.userName);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.profilePictureUriString != null) {
            hy0Var.A(ll6Var, 2, t47.a, userDataPreferences.profilePictureUriString);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.darkThemeConfigPreferences != DarkThemeConfigPreferences.FOLLOW_SYSTEM) {
            hy0Var.o(ll6Var, 3, (zr3) nz3VarArr[3].getValue(), userDataPreferences.darkThemeConfigPreferences);
        }
        if (hy0Var.f(ll6Var) || !userDataPreferences.useDynamicColor) {
            hy0Var.n(ll6Var, 4, userDataPreferences.useDynamicColor);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.ussdRefreshModeEnabled) {
            hy0Var.n(ll6Var, 5, userDataPreferences.ussdRefreshModeEnabled);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.defaultSimSlot != 0) {
            hy0Var.w(6, userDataPreferences.defaultSimSlot, ll6Var);
        }
        if (hy0Var.f(ll6Var) || !userDataPreferences.showEtecsaBanner) {
            hy0Var.n(ll6Var, 7, userDataPreferences.showEtecsaBanner);
        }
        boolean f = hy0Var.f(ll6Var);
        a42 a42Var = a42.w;
        if (f || !sg3.e(userDataPreferences.homeCollapsedSections, a42Var)) {
            hy0Var.o(ll6Var, 8, (zr3) nz3VarArr[8].getValue(), userDataPreferences.homeCollapsedSections);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.balanceSecondaryInfo, "BONO")) {
            hy0Var.x(ll6Var, 9, userDataPreferences.balanceSecondaryInfo);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.planExpiryNotifyEnabled) {
            hy0Var.n(ll6Var, 10, userDataPreferences.planExpiryNotifyEnabled);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.appLockEnabled) {
            hy0Var.n(ll6Var, 11, userDataPreferences.appLockEnabled);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.termsAccepted) {
            hy0Var.n(ll6Var, 12, userDataPreferences.termsAccepted);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.forumTermsAccepted) {
            hy0Var.n(ll6Var, 13, userDataPreferences.forumTermsAccepted);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.permissionsRequestedOnce) {
            hy0Var.n(ll6Var, 14, userDataPreferences.permissionsRequestedOnce);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.blockAnonymousCalls) {
            hy0Var.n(ll6Var, 15, userDataPreferences.blockAnonymousCalls);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.blockRevertidaCalls) {
            hy0Var.n(ll6Var, 16, userDataPreferences.blockRevertidaCalls);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.blockFijoCalls) {
            hy0Var.n(ll6Var, 17, userDataPreferences.blockFijoCalls);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.blockUnknownCalls) {
            hy0Var.n(ll6Var, 18, userDataPreferences.blockUnknownCalls);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.blockAllCalls) {
            hy0Var.n(ll6Var, 19, userDataPreferences.blockAllCalls);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.callAlertAllCalls) {
            hy0Var.n(ll6Var, 20, userDataPreferences.callAlertAllCalls);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.callAlertRevertidaCalls) {
            hy0Var.n(ll6Var, 21, userDataPreferences.callAlertRevertidaCalls);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.planExpiryNotified, a42Var)) {
            hy0Var.o(ll6Var, 22, (zr3) nz3VarArr[22].getValue(), userDataPreferences.planExpiryNotified);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.appUpdateNotifiedVersion, "")) {
            hy0Var.x(ll6Var, 23, userDataPreferences.appUpdateNotifiedVersion);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.saldoUssdSim1, "CONSULTAR_SALDO")) {
            hy0Var.x(ll6Var, 24, userDataPreferences.saldoUssdSim1);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.saldoUssdSim2, "CONSULTAR_SALDO")) {
            hy0Var.x(ll6Var, 25, userDataPreferences.saldoUssdSim2);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.asterisco99History, a42Var)) {
            hy0Var.o(ll6Var, 26, (zr3) nz3VarArr[26].getValue(), userDataPreferences.asterisco99History);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.transferPin, "")) {
            hy0Var.x(ll6Var, 27, userDataPreferences.transferPin);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.planesSinConfirmacion) {
            hy0Var.n(ll6Var, 28, userDataPreferences.planesSinConfirmacion);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.nautaLogoutUrl, "")) {
            hy0Var.x(ll6Var, 29, userDataPreferences.nautaLogoutUrl);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.nautaCookies, a42Var)) {
            hy0Var.o(ll6Var, 30, (zr3) nz3VarArr[30].getValue(), userDataPreferences.nautaCookies);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.nautaSessionUser, "")) {
            hy0Var.x(ll6Var, 31, userDataPreferences.nautaSessionUser);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.nautaSessionAvailableTime, "")) {
            hy0Var.x(ll6Var, 32, userDataPreferences.nautaSessionAvailableTime);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.nautaSavedAccounts, a42Var)) {
            hy0Var.o(ll6Var, 33, (zr3) nz3VarArr[33].getValue(), userDataPreferences.nautaSavedAccounts);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.accountId, "")) {
            hy0Var.x(ll6Var, 34, userDataPreferences.accountId);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.accountName, "")) {
            hy0Var.x(ll6Var, 35, userDataPreferences.accountName);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.accountEmail, "")) {
            hy0Var.x(ll6Var, 36, userDataPreferences.accountEmail);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.accountAvatarUrl, "")) {
            hy0Var.x(ll6Var, 37, userDataPreferences.accountAvatarUrl);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.spotsNick, "")) {
            hy0Var.x(ll6Var, 38, userDataPreferences.spotsNick);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.spotsDeviceId, "")) {
            hy0Var.x(ll6Var, 39, userDataPreferences.spotsDeviceId);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.spotsLastPublishMillis != 0) {
            hy0Var.j(ll6Var, 40, userDataPreferences.spotsLastPublishMillis);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.licenseStatus, "NONE")) {
            hy0Var.x(ll6Var, 41, userDataPreferences.licenseStatus);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.licenseTransferId, "")) {
            hy0Var.x(ll6Var, 42, userDataPreferences.licenseTransferId);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.licenseActivatedAt != 0) {
            hy0Var.j(ll6Var, 43, userDataPreferences.licenseActivatedAt);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.licenseLastCheckMillis != 0) {
            hy0Var.j(ll6Var, 44, userDataPreferences.licenseLastCheckMillis);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.licensePriceTransferCup != 200) {
            hy0Var.w(45, userDataPreferences.licensePriceTransferCup, ll6Var);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.licensePriceSaldoCup != 100) {
            hy0Var.w(46, userDataPreferences.licensePriceSaldoCup, ll6Var);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.licenseDiscountPercent != 0) {
            hy0Var.w(47, userDataPreferences.licenseDiscountPercent, ll6Var);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.licenseDiscountSource, "NONE")) {
            hy0Var.x(ll6Var, 48, userDataPreferences.licenseDiscountSource);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.licenseCouponCode, "")) {
            hy0Var.x(ll6Var, 49, userDataPreferences.licenseCouponCode);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.voiceNotificationsUssdEnabled) {
            hy0Var.n(ll6Var, 50, userDataPreferences.voiceNotificationsUssdEnabled);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.voiceNotificationsIncomingEnabled) {
            hy0Var.n(ll6Var, 51, userDataPreferences.voiceNotificationsIncomingEnabled);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.speedOverlayAutoEnabled) {
            hy0Var.n(ll6Var, 52, userDataPreferences.speedOverlayAutoEnabled);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.ussdAutoEnabled) {
            hy0Var.n(ll6Var, 53, userDataPreferences.ussdAutoEnabled);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.ussdAutoAfterCallEnabled) {
            hy0Var.n(ll6Var, 54, userDataPreferences.ussdAutoAfterCallEnabled);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.ussdAutoAfterSmsEnabled) {
            hy0Var.n(ll6Var, 55, userDataPreferences.ussdAutoAfterSmsEnabled);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.ussdAutoAfterDataOffEnabled) {
            hy0Var.n(ll6Var, 56, userDataPreferences.ussdAutoAfterDataOffEnabled);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.ussdAutoPeriodicEnabled) {
            hy0Var.n(ll6Var, 57, userDataPreferences.ussdAutoPeriodicEnabled);
        }
        if (hy0Var.f(ll6Var) || userDataPreferences.ussdAutoIntervalMinutes != 30) {
            hy0Var.w(58, userDataPreferences.ussdAutoIntervalMinutes, ll6Var);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.ussdAutoVoiceCode, "*222*869#")) {
            hy0Var.x(ll6Var, 59, userDataPreferences.ussdAutoVoiceCode);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.ussdAutoSmsCode, "*222*767#")) {
            hy0Var.x(ll6Var, 60, userDataPreferences.ussdAutoSmsCode);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.ussdAutoDataCode, "*222*328#")) {
            hy0Var.x(ll6Var, 61, userDataPreferences.ussdAutoDataCode);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.ussdAutoPeriodicQuery, "SALDO")) {
            hy0Var.x(ll6Var, 62, userDataPreferences.ussdAutoPeriodicQuery);
        }
        if (hy0Var.f(ll6Var) || !sg3.e(userDataPreferences.invitationCode, "")) {
            hy0Var.x(ll6Var, 63, userDataPreferences.invitationCode);
        }
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.balanceSecondaryInfo;
    }

    public final boolean component11() {
        return this.planExpiryNotifyEnabled;
    }

    public final boolean component12() {
        return this.appLockEnabled;
    }

    public final boolean component13() {
        return this.termsAccepted;
    }

    public final boolean component14() {
        return this.forumTermsAccepted;
    }

    public final boolean component15() {
        return this.permissionsRequestedOnce;
    }

    public final boolean component16() {
        return this.blockAnonymousCalls;
    }

    public final boolean component17() {
        return this.blockRevertidaCalls;
    }

    public final boolean component18() {
        return this.blockFijoCalls;
    }

    public final boolean component19() {
        return this.blockUnknownCalls;
    }

    public final String component2() {
        return this.userName;
    }

    public final boolean component20() {
        return this.blockAllCalls;
    }

    public final boolean component21() {
        return this.callAlertAllCalls;
    }

    public final boolean component22() {
        return this.callAlertRevertidaCalls;
    }

    public final List<String> component23() {
        return this.planExpiryNotified;
    }

    public final String component24() {
        return this.appUpdateNotifiedVersion;
    }

    public final String component25() {
        return this.saldoUssdSim1;
    }

    public final String component26() {
        return this.saldoUssdSim2;
    }

    public final List<String> component27() {
        return this.asterisco99History;
    }

    public final String component28() {
        return this.transferPin;
    }

    public final boolean component29() {
        return this.planesSinConfirmacion;
    }

    public final String component3() {
        return this.profilePictureUriString;
    }

    public final String component30() {
        return this.nautaLogoutUrl;
    }

    public final List<String> component31() {
        return this.nautaCookies;
    }

    public final String component32() {
        return this.nautaSessionUser;
    }

    public final String component33() {
        return this.nautaSessionAvailableTime;
    }

    public final List<String> component34() {
        return this.nautaSavedAccounts;
    }

    public final String component35() {
        return this.accountId;
    }

    public final String component36() {
        return this.accountName;
    }

    public final String component37() {
        return this.accountEmail;
    }

    public final String component38() {
        return this.accountAvatarUrl;
    }

    public final String component39() {
        return this.spotsNick;
    }

    public final DarkThemeConfigPreferences component4() {
        return this.darkThemeConfigPreferences;
    }

    public final String component40() {
        return this.spotsDeviceId;
    }

    public final long component41() {
        return this.spotsLastPublishMillis;
    }

    public final String component42() {
        return this.licenseStatus;
    }

    public final String component43() {
        return this.licenseTransferId;
    }

    public final long component44() {
        return this.licenseActivatedAt;
    }

    public final long component45() {
        return this.licenseLastCheckMillis;
    }

    public final int component46() {
        return this.licensePriceTransferCup;
    }

    public final int component47() {
        return this.licensePriceSaldoCup;
    }

    public final int component48() {
        return this.licenseDiscountPercent;
    }

    public final String component49() {
        return this.licenseDiscountSource;
    }

    public final boolean component5() {
        return this.useDynamicColor;
    }

    public final String component50() {
        return this.licenseCouponCode;
    }

    public final boolean component51() {
        return this.voiceNotificationsUssdEnabled;
    }

    public final boolean component52() {
        return this.voiceNotificationsIncomingEnabled;
    }

    public final boolean component53() {
        return this.speedOverlayAutoEnabled;
    }

    public final boolean component54() {
        return this.ussdAutoEnabled;
    }

    public final boolean component55() {
        return this.ussdAutoAfterCallEnabled;
    }

    public final boolean component56() {
        return this.ussdAutoAfterSmsEnabled;
    }

    public final boolean component57() {
        return this.ussdAutoAfterDataOffEnabled;
    }

    public final boolean component58() {
        return this.ussdAutoPeriodicEnabled;
    }

    public final int component59() {
        return this.ussdAutoIntervalMinutes;
    }

    public final boolean component6() {
        return this.ussdRefreshModeEnabled;
    }

    public final String component60() {
        return this.ussdAutoVoiceCode;
    }

    public final String component61() {
        return this.ussdAutoSmsCode;
    }

    public final String component62() {
        return this.ussdAutoDataCode;
    }

    public final String component63() {
        return this.ussdAutoPeriodicQuery;
    }

    public final String component64() {
        return this.invitationCode;
    }

    public final int component7() {
        return this.defaultSimSlot;
    }

    public final boolean component8() {
        return this.showEtecsaBanner;
    }

    public final List<String> component9() {
        return this.homeCollapsedSections;
    }

    public final UserDataPreferences copy(String str, String str2, String str3, DarkThemeConfigPreferences darkThemeConfigPreferences, boolean z, boolean z2, int i, boolean z3, List<String> list, String str4, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, List<String> list2, String str5, String str6, String str7, List<String> list3, String str8, boolean z16, String str9, List<String> list4, String str10, String str11, List<String> list5, String str12, String str13, String str14, String str15, String str16, String str17, long j, String str18, String str19, long j2, long j3, int i2, int i3, int i4, String str20, String str21, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, int i5, String str22, String str23, String str24, String str25, String str26) {
        str.getClass();
        darkThemeConfigPreferences.getClass();
        list.getClass();
        str4.getClass();
        list2.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        list3.getClass();
        str8.getClass();
        str9.getClass();
        list4.getClass();
        str10.getClass();
        str11.getClass();
        list5.getClass();
        hl6.t(str12, str13, str14, str15, str16);
        hl6.t(str17, str18, str19, str20, str21);
        str22.getClass();
        str23.getClass();
        str24.getClass();
        str25.getClass();
        str26.getClass();
        return new UserDataPreferences(str, str2, str3, darkThemeConfigPreferences, z, z2, i, z3, list, str4, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, list2, str5, str6, str7, list3, str8, z16, str9, list4, str10, str11, list5, str12, str13, str14, str15, str16, str17, j, str18, str19, j2, j3, i2, i3, i4, str20, str21, z17, z18, z19, z20, z21, z22, z23, z24, i5, str22, str23, str24, str25, str26);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserDataPreferences)) {
            return false;
        }
        UserDataPreferences userDataPreferences = (UserDataPreferences) obj;
        if (sg3.e(this.id, userDataPreferences.id) && sg3.e(this.userName, userDataPreferences.userName) && sg3.e(this.profilePictureUriString, userDataPreferences.profilePictureUriString) && this.darkThemeConfigPreferences == userDataPreferences.darkThemeConfigPreferences && this.useDynamicColor == userDataPreferences.useDynamicColor && this.ussdRefreshModeEnabled == userDataPreferences.ussdRefreshModeEnabled && this.defaultSimSlot == userDataPreferences.defaultSimSlot && this.showEtecsaBanner == userDataPreferences.showEtecsaBanner && sg3.e(this.homeCollapsedSections, userDataPreferences.homeCollapsedSections) && sg3.e(this.balanceSecondaryInfo, userDataPreferences.balanceSecondaryInfo) && this.planExpiryNotifyEnabled == userDataPreferences.planExpiryNotifyEnabled && this.appLockEnabled == userDataPreferences.appLockEnabled && this.termsAccepted == userDataPreferences.termsAccepted && this.forumTermsAccepted == userDataPreferences.forumTermsAccepted && this.permissionsRequestedOnce == userDataPreferences.permissionsRequestedOnce && this.blockAnonymousCalls == userDataPreferences.blockAnonymousCalls && this.blockRevertidaCalls == userDataPreferences.blockRevertidaCalls && this.blockFijoCalls == userDataPreferences.blockFijoCalls && this.blockUnknownCalls == userDataPreferences.blockUnknownCalls && this.blockAllCalls == userDataPreferences.blockAllCalls && this.callAlertAllCalls == userDataPreferences.callAlertAllCalls && this.callAlertRevertidaCalls == userDataPreferences.callAlertRevertidaCalls && sg3.e(this.planExpiryNotified, userDataPreferences.planExpiryNotified) && sg3.e(this.appUpdateNotifiedVersion, userDataPreferences.appUpdateNotifiedVersion) && sg3.e(this.saldoUssdSim1, userDataPreferences.saldoUssdSim1) && sg3.e(this.saldoUssdSim2, userDataPreferences.saldoUssdSim2) && sg3.e(this.asterisco99History, userDataPreferences.asterisco99History) && sg3.e(this.transferPin, userDataPreferences.transferPin) && this.planesSinConfirmacion == userDataPreferences.planesSinConfirmacion && sg3.e(this.nautaLogoutUrl, userDataPreferences.nautaLogoutUrl) && sg3.e(this.nautaCookies, userDataPreferences.nautaCookies) && sg3.e(this.nautaSessionUser, userDataPreferences.nautaSessionUser) && sg3.e(this.nautaSessionAvailableTime, userDataPreferences.nautaSessionAvailableTime) && sg3.e(this.nautaSavedAccounts, userDataPreferences.nautaSavedAccounts) && sg3.e(this.accountId, userDataPreferences.accountId) && sg3.e(this.accountName, userDataPreferences.accountName) && sg3.e(this.accountEmail, userDataPreferences.accountEmail) && sg3.e(this.accountAvatarUrl, userDataPreferences.accountAvatarUrl) && sg3.e(this.spotsNick, userDataPreferences.spotsNick) && sg3.e(this.spotsDeviceId, userDataPreferences.spotsDeviceId) && this.spotsLastPublishMillis == userDataPreferences.spotsLastPublishMillis && sg3.e(this.licenseStatus, userDataPreferences.licenseStatus) && sg3.e(this.licenseTransferId, userDataPreferences.licenseTransferId) && this.licenseActivatedAt == userDataPreferences.licenseActivatedAt && this.licenseLastCheckMillis == userDataPreferences.licenseLastCheckMillis && this.licensePriceTransferCup == userDataPreferences.licensePriceTransferCup && this.licensePriceSaldoCup == userDataPreferences.licensePriceSaldoCup && this.licenseDiscountPercent == userDataPreferences.licenseDiscountPercent && sg3.e(this.licenseDiscountSource, userDataPreferences.licenseDiscountSource) && sg3.e(this.licenseCouponCode, userDataPreferences.licenseCouponCode) && this.voiceNotificationsUssdEnabled == userDataPreferences.voiceNotificationsUssdEnabled && this.voiceNotificationsIncomingEnabled == userDataPreferences.voiceNotificationsIncomingEnabled && this.speedOverlayAutoEnabled == userDataPreferences.speedOverlayAutoEnabled && this.ussdAutoEnabled == userDataPreferences.ussdAutoEnabled && this.ussdAutoAfterCallEnabled == userDataPreferences.ussdAutoAfterCallEnabled && this.ussdAutoAfterSmsEnabled == userDataPreferences.ussdAutoAfterSmsEnabled && this.ussdAutoAfterDataOffEnabled == userDataPreferences.ussdAutoAfterDataOffEnabled && this.ussdAutoPeriodicEnabled == userDataPreferences.ussdAutoPeriodicEnabled && this.ussdAutoIntervalMinutes == userDataPreferences.ussdAutoIntervalMinutes && sg3.e(this.ussdAutoVoiceCode, userDataPreferences.ussdAutoVoiceCode) && sg3.e(this.ussdAutoSmsCode, userDataPreferences.ussdAutoSmsCode) && sg3.e(this.ussdAutoDataCode, userDataPreferences.ussdAutoDataCode) && sg3.e(this.ussdAutoPeriodicQuery, userDataPreferences.ussdAutoPeriodicQuery) && sg3.e(this.invitationCode, userDataPreferences.invitationCode)) {
            return true;
        }
        return false;
    }

    public final String getAccountAvatarUrl() {
        return this.accountAvatarUrl;
    }

    public final String getAccountEmail() {
        return this.accountEmail;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getAccountName() {
        return this.accountName;
    }

    public final boolean getAppLockEnabled() {
        return this.appLockEnabled;
    }

    public final String getAppUpdateNotifiedVersion() {
        return this.appUpdateNotifiedVersion;
    }

    public final List<String> getAsterisco99History() {
        return this.asterisco99History;
    }

    public final String getBalanceSecondaryInfo() {
        return this.balanceSecondaryInfo;
    }

    public final boolean getBlockAllCalls() {
        return this.blockAllCalls;
    }

    public final boolean getBlockAnonymousCalls() {
        return this.blockAnonymousCalls;
    }

    public final boolean getBlockFijoCalls() {
        return this.blockFijoCalls;
    }

    public final boolean getBlockRevertidaCalls() {
        return this.blockRevertidaCalls;
    }

    public final boolean getBlockUnknownCalls() {
        return this.blockUnknownCalls;
    }

    public final boolean getCallAlertAllCalls() {
        return this.callAlertAllCalls;
    }

    public final boolean getCallAlertRevertidaCalls() {
        return this.callAlertRevertidaCalls;
    }

    public final DarkThemeConfigPreferences getDarkThemeConfigPreferences() {
        return this.darkThemeConfigPreferences;
    }

    public final int getDefaultSimSlot() {
        return this.defaultSimSlot;
    }

    public final boolean getForumTermsAccepted() {
        return this.forumTermsAccepted;
    }

    public final List<String> getHomeCollapsedSections() {
        return this.homeCollapsedSections;
    }

    public final String getId() {
        return this.id;
    }

    public final String getInvitationCode() {
        return this.invitationCode;
    }

    public final long getLicenseActivatedAt() {
        return this.licenseActivatedAt;
    }

    public final String getLicenseCouponCode() {
        return this.licenseCouponCode;
    }

    public final int getLicenseDiscountPercent() {
        return this.licenseDiscountPercent;
    }

    public final String getLicenseDiscountSource() {
        return this.licenseDiscountSource;
    }

    public final long getLicenseLastCheckMillis() {
        return this.licenseLastCheckMillis;
    }

    public final int getLicensePriceSaldoCup() {
        return this.licensePriceSaldoCup;
    }

    public final int getLicensePriceTransferCup() {
        return this.licensePriceTransferCup;
    }

    public final String getLicenseStatus() {
        return this.licenseStatus;
    }

    public final String getLicenseTransferId() {
        return this.licenseTransferId;
    }

    public final List<String> getNautaCookies() {
        return this.nautaCookies;
    }

    public final String getNautaLogoutUrl() {
        return this.nautaLogoutUrl;
    }

    public final List<String> getNautaSavedAccounts() {
        return this.nautaSavedAccounts;
    }

    public final String getNautaSessionAvailableTime() {
        return this.nautaSessionAvailableTime;
    }

    public final String getNautaSessionUser() {
        return this.nautaSessionUser;
    }

    public final boolean getPermissionsRequestedOnce() {
        return this.permissionsRequestedOnce;
    }

    public final List<String> getPlanExpiryNotified() {
        return this.planExpiryNotified;
    }

    public final boolean getPlanExpiryNotifyEnabled() {
        return this.planExpiryNotifyEnabled;
    }

    public final boolean getPlanesSinConfirmacion() {
        return this.planesSinConfirmacion;
    }

    public final String getProfilePictureUriString() {
        return this.profilePictureUriString;
    }

    public final String getSaldoUssdSim1() {
        return this.saldoUssdSim1;
    }

    public final String getSaldoUssdSim2() {
        return this.saldoUssdSim2;
    }

    public final boolean getShowEtecsaBanner() {
        return this.showEtecsaBanner;
    }

    public final boolean getSpeedOverlayAutoEnabled() {
        return this.speedOverlayAutoEnabled;
    }

    public final String getSpotsDeviceId() {
        return this.spotsDeviceId;
    }

    public final long getSpotsLastPublishMillis() {
        return this.spotsLastPublishMillis;
    }

    public final String getSpotsNick() {
        return this.spotsNick;
    }

    public final boolean getTermsAccepted() {
        return this.termsAccepted;
    }

    public final String getTransferPin() {
        return this.transferPin;
    }

    public final boolean getUseDynamicColor() {
        return this.useDynamicColor;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final boolean getUssdAutoAfterCallEnabled() {
        return this.ussdAutoAfterCallEnabled;
    }

    public final boolean getUssdAutoAfterDataOffEnabled() {
        return this.ussdAutoAfterDataOffEnabled;
    }

    public final boolean getUssdAutoAfterSmsEnabled() {
        return this.ussdAutoAfterSmsEnabled;
    }

    public final String getUssdAutoDataCode() {
        return this.ussdAutoDataCode;
    }

    public final boolean getUssdAutoEnabled() {
        return this.ussdAutoEnabled;
    }

    public final int getUssdAutoIntervalMinutes() {
        return this.ussdAutoIntervalMinutes;
    }

    public final boolean getUssdAutoPeriodicEnabled() {
        return this.ussdAutoPeriodicEnabled;
    }

    public final String getUssdAutoPeriodicQuery() {
        return this.ussdAutoPeriodicQuery;
    }

    public final String getUssdAutoSmsCode() {
        return this.ussdAutoSmsCode;
    }

    public final String getUssdAutoVoiceCode() {
        return this.ussdAutoVoiceCode;
    }

    public final boolean getUssdRefreshModeEnabled() {
        return this.ussdRefreshModeEnabled;
    }

    public final boolean getVoiceNotificationsIncomingEnabled() {
        return this.voiceNotificationsIncomingEnabled;
    }

    public final boolean getVoiceNotificationsUssdEnabled() {
        return this.voiceNotificationsUssdEnabled;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.id.hashCode() * 31;
        String str = this.userName;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str2 = this.profilePictureUriString;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.invitationCode.hashCode() + hl6.h(hl6.h(hl6.h(hl6.h(f21.e(this.ussdAutoIntervalMinutes, hl6.i(hl6.i(hl6.i(hl6.i(hl6.i(hl6.i(hl6.i(hl6.i(hl6.h(hl6.h(f21.e(this.licenseDiscountPercent, f21.e(this.licensePriceSaldoCup, f21.e(this.licensePriceTransferCup, pb4.b(pb4.b(hl6.h(hl6.h(pb4.b(hl6.h(hl6.h(hl6.h(hl6.h(hl6.h(hl6.h(hl6.j(this.nautaSavedAccounts, hl6.h(hl6.h(hl6.j(this.nautaCookies, hl6.h(hl6.i(hl6.h(hl6.j(this.asterisco99History, hl6.h(hl6.h(hl6.h(hl6.j(this.planExpiryNotified, hl6.i(hl6.i(hl6.i(hl6.i(hl6.i(hl6.i(hl6.i(hl6.i(hl6.i(hl6.i(hl6.i(hl6.i(hl6.h(hl6.j(this.homeCollapsedSections, hl6.i(f21.e(this.defaultSimSlot, hl6.i(hl6.i((this.darkThemeConfigPreferences.hashCode() + ((i2 + i) * 31)) * 31, 31, this.useDynamicColor), 31, this.ussdRefreshModeEnabled), 31), 31, this.showEtecsaBanner), 31), 31, this.balanceSecondaryInfo), 31, this.planExpiryNotifyEnabled), 31, this.appLockEnabled), 31, this.termsAccepted), 31, this.forumTermsAccepted), 31, this.permissionsRequestedOnce), 31, this.blockAnonymousCalls), 31, this.blockRevertidaCalls), 31, this.blockFijoCalls), 31, this.blockUnknownCalls), 31, this.blockAllCalls), 31, this.callAlertAllCalls), 31, this.callAlertRevertidaCalls), 31), 31, this.appUpdateNotifiedVersion), 31, this.saldoUssdSim1), 31, this.saldoUssdSim2), 31), 31, this.transferPin), 31, this.planesSinConfirmacion), 31, this.nautaLogoutUrl), 31), 31, this.nautaSessionUser), 31, this.nautaSessionAvailableTime), 31), 31, this.accountId), 31, this.accountName), 31, this.accountEmail), 31, this.accountAvatarUrl), 31, this.spotsNick), 31, this.spotsDeviceId), 31, this.spotsLastPublishMillis), 31, this.licenseStatus), 31, this.licenseTransferId), 31, this.licenseActivatedAt), 31, this.licenseLastCheckMillis), 31), 31), 31), 31, this.licenseDiscountSource), 31, this.licenseCouponCode), 31, this.voiceNotificationsUssdEnabled), 31, this.voiceNotificationsIncomingEnabled), 31, this.speedOverlayAutoEnabled), 31, this.ussdAutoEnabled), 31, this.ussdAutoAfterCallEnabled), 31, this.ussdAutoAfterSmsEnabled), 31, this.ussdAutoAfterDataOffEnabled), 31, this.ussdAutoPeriodicEnabled), 31), 31, this.ussdAutoVoiceCode), 31, this.ussdAutoSmsCode), 31, this.ussdAutoDataCode), 31, this.ussdAutoPeriodicQuery);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.userName;
        String str3 = this.profilePictureUriString;
        DarkThemeConfigPreferences darkThemeConfigPreferences = this.darkThemeConfigPreferences;
        boolean z = this.useDynamicColor;
        boolean z2 = this.ussdRefreshModeEnabled;
        int i = this.defaultSimSlot;
        boolean z3 = this.showEtecsaBanner;
        List<String> list = this.homeCollapsedSections;
        String str4 = this.balanceSecondaryInfo;
        boolean z4 = this.planExpiryNotifyEnabled;
        boolean z5 = this.appLockEnabled;
        boolean z6 = this.termsAccepted;
        boolean z7 = this.forumTermsAccepted;
        boolean z8 = this.permissionsRequestedOnce;
        boolean z9 = this.blockAnonymousCalls;
        boolean z10 = this.blockRevertidaCalls;
        boolean z11 = this.blockFijoCalls;
        boolean z12 = this.blockUnknownCalls;
        boolean z13 = this.blockAllCalls;
        boolean z14 = this.callAlertAllCalls;
        boolean z15 = this.callAlertRevertidaCalls;
        List<String> list2 = this.planExpiryNotified;
        String str5 = this.appUpdateNotifiedVersion;
        String str6 = this.saldoUssdSim1;
        String str7 = this.saldoUssdSim2;
        List<String> list3 = this.asterisco99History;
        String str8 = this.transferPin;
        boolean z16 = this.planesSinConfirmacion;
        String str9 = this.nautaLogoutUrl;
        List<String> list4 = this.nautaCookies;
        String str10 = this.nautaSessionUser;
        String str11 = this.nautaSessionAvailableTime;
        List<String> list5 = this.nautaSavedAccounts;
        String str12 = this.accountId;
        String str13 = this.accountName;
        String str14 = this.accountEmail;
        String str15 = this.accountAvatarUrl;
        String str16 = this.spotsNick;
        String str17 = this.spotsDeviceId;
        long j = this.spotsLastPublishMillis;
        String str18 = this.licenseStatus;
        String str19 = this.licenseTransferId;
        long j2 = this.licenseActivatedAt;
        long j3 = this.licenseLastCheckMillis;
        int i2 = this.licensePriceTransferCup;
        int i3 = this.licensePriceSaldoCup;
        int i4 = this.licenseDiscountPercent;
        String str20 = this.licenseDiscountSource;
        String str21 = this.licenseCouponCode;
        boolean z17 = this.voiceNotificationsUssdEnabled;
        boolean z18 = this.voiceNotificationsIncomingEnabled;
        boolean z19 = this.speedOverlayAutoEnabled;
        boolean z20 = this.ussdAutoEnabled;
        boolean z21 = this.ussdAutoAfterCallEnabled;
        boolean z22 = this.ussdAutoAfterSmsEnabled;
        boolean z23 = this.ussdAutoAfterDataOffEnabled;
        boolean z24 = this.ussdAutoPeriodicEnabled;
        int i5 = this.ussdAutoIntervalMinutes;
        String str22 = this.ussdAutoVoiceCode;
        String str23 = this.ussdAutoSmsCode;
        String str24 = this.ussdAutoDataCode;
        String str25 = this.ussdAutoPeriodicQuery;
        String str26 = this.invitationCode;
        StringBuilder o = f21.o("UserDataPreferences(id=", str, ", userName=", str2, ", profilePictureUriString=");
        o.append(str3);
        o.append(", darkThemeConfigPreferences=");
        o.append(darkThemeConfigPreferences);
        o.append(", useDynamicColor=");
        pb4.s(o, z, ", ussdRefreshModeEnabled=", z2, ", defaultSimSlot=");
        o.append(i);
        o.append(", showEtecsaBanner=");
        o.append(z3);
        o.append(", homeCollapsedSections=");
        o.append(list);
        o.append(", balanceSecondaryInfo=");
        o.append(str4);
        o.append(", planExpiryNotifyEnabled=");
        pb4.s(o, z4, ", appLockEnabled=", z5, ", termsAccepted=");
        pb4.s(o, z6, ", forumTermsAccepted=", z7, ", permissionsRequestedOnce=");
        pb4.s(o, z8, ", blockAnonymousCalls=", z9, ", blockRevertidaCalls=");
        pb4.s(o, z10, ", blockFijoCalls=", z11, ", blockUnknownCalls=");
        pb4.s(o, z12, ", blockAllCalls=", z13, ", callAlertAllCalls=");
        pb4.s(o, z14, ", callAlertRevertidaCalls=", z15, ", planExpiryNotified=");
        o.append(list2);
        o.append(", appUpdateNotifiedVersion=");
        o.append(str5);
        o.append(", saldoUssdSim1=");
        f21.v(o, str6, ", saldoUssdSim2=", str7, ", asterisco99History=");
        o.append(list3);
        o.append(", transferPin=");
        o.append(str8);
        o.append(", planesSinConfirmacion=");
        o.append(z16);
        o.append(", nautaLogoutUrl=");
        o.append(str9);
        o.append(", nautaCookies=");
        o.append(list4);
        o.append(", nautaSessionUser=");
        o.append(str10);
        o.append(", nautaSessionAvailableTime=");
        o.append(str11);
        o.append(", nautaSavedAccounts=");
        o.append(list5);
        o.append(", accountId=");
        f21.v(o, str12, ", accountName=", str13, ", accountEmail=");
        f21.v(o, str14, ", accountAvatarUrl=", str15, ", spotsNick=");
        f21.v(o, str16, ", spotsDeviceId=", str17, ", spotsLastPublishMillis=");
        o.append(j);
        o.append(", licenseStatus=");
        o.append(str18);
        o.append(", licenseTransferId=");
        o.append(str19);
        o.append(", licenseActivatedAt=");
        o.append(j2);
        o.append(", licenseLastCheckMillis=");
        o.append(j3);
        o.append(", licensePriceTransferCup=");
        o.append(i2);
        o.append(", licensePriceSaldoCup=");
        o.append(i3);
        o.append(", licenseDiscountPercent=");
        o.append(i4);
        o.append(", licenseDiscountSource=");
        o.append(str20);
        o.append(", licenseCouponCode=");
        o.append(str21);
        o.append(", voiceNotificationsUssdEnabled=");
        o.append(z17);
        o.append(", voiceNotificationsIncomingEnabled=");
        pb4.s(o, z18, ", speedOverlayAutoEnabled=", z19, ", ussdAutoEnabled=");
        pb4.s(o, z20, ", ussdAutoAfterCallEnabled=", z21, ", ussdAutoAfterSmsEnabled=");
        pb4.s(o, z22, ", ussdAutoAfterDataOffEnabled=", z23, ", ussdAutoPeriodicEnabled=");
        o.append(z24);
        o.append(", ussdAutoIntervalMinutes=");
        o.append(i5);
        o.append(", ussdAutoVoiceCode=");
        f21.v(o, str22, ", ussdAutoSmsCode=", str23, ", ussdAutoDataCode=");
        f21.v(o, str24, ", ussdAutoPeriodicQuery=", str25, ", invitationCode=");
        return f21.l(o, str26, ")");
    }

    /* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences$Companion;", "", "<init>", "()V", "Lzr3;", "Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;", "serializer", "()Lzr3;", "preferences"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(hl1 hl1Var) {
            this();
        }

        public final zr3 serializer() {
            return UserDataPreferences$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public UserDataPreferences(String str, String str2, String str3, DarkThemeConfigPreferences darkThemeConfigPreferences, boolean z, boolean z2, int i, boolean z3, List<String> list, String str4, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, List<String> list2, String str5, String str6, String str7, List<String> list3, String str8, boolean z16, String str9, List<String> list4, String str10, String str11, List<String> list5, String str12, String str13, String str14, String str15, String str16, String str17, long j, String str18, String str19, long j2, long j3, int i2, int i3, int i4, String str20, String str21, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, int i5, String str22, String str23, String str24, String str25, String str26) {
        str.getClass();
        darkThemeConfigPreferences.getClass();
        list.getClass();
        str4.getClass();
        list2.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        list3.getClass();
        str8.getClass();
        str9.getClass();
        list4.getClass();
        str10.getClass();
        str11.getClass();
        list5.getClass();
        hl6.t(str12, str13, str14, str15, str16);
        hl6.t(str17, str18, str19, str20, str21);
        hl6.t(str22, str23, str24, str25, str26);
        this.id = str;
        this.userName = str2;
        this.profilePictureUriString = str3;
        this.darkThemeConfigPreferences = darkThemeConfigPreferences;
        this.useDynamicColor = z;
        this.ussdRefreshModeEnabled = z2;
        this.defaultSimSlot = i;
        this.showEtecsaBanner = z3;
        this.homeCollapsedSections = list;
        this.balanceSecondaryInfo = str4;
        this.planExpiryNotifyEnabled = z4;
        this.appLockEnabled = z5;
        this.termsAccepted = z6;
        this.forumTermsAccepted = z7;
        this.permissionsRequestedOnce = z8;
        this.blockAnonymousCalls = z9;
        this.blockRevertidaCalls = z10;
        this.blockFijoCalls = z11;
        this.blockUnknownCalls = z12;
        this.blockAllCalls = z13;
        this.callAlertAllCalls = z14;
        this.callAlertRevertidaCalls = z15;
        this.planExpiryNotified = list2;
        this.appUpdateNotifiedVersion = str5;
        this.saldoUssdSim1 = str6;
        this.saldoUssdSim2 = str7;
        this.asterisco99History = list3;
        this.transferPin = str8;
        this.planesSinConfirmacion = z16;
        this.nautaLogoutUrl = str9;
        this.nautaCookies = list4;
        this.nautaSessionUser = str10;
        this.nautaSessionAvailableTime = str11;
        this.nautaSavedAccounts = list5;
        this.accountId = str12;
        this.accountName = str13;
        this.accountEmail = str14;
        this.accountAvatarUrl = str15;
        this.spotsNick = str16;
        this.spotsDeviceId = str17;
        this.spotsLastPublishMillis = j;
        this.licenseStatus = str18;
        this.licenseTransferId = str19;
        this.licenseActivatedAt = j2;
        this.licenseLastCheckMillis = j3;
        this.licensePriceTransferCup = i2;
        this.licensePriceSaldoCup = i3;
        this.licenseDiscountPercent = i4;
        this.licenseDiscountSource = str20;
        this.licenseCouponCode = str21;
        this.voiceNotificationsUssdEnabled = z17;
        this.voiceNotificationsIncomingEnabled = z18;
        this.speedOverlayAutoEnabled = z19;
        this.ussdAutoEnabled = z20;
        this.ussdAutoAfterCallEnabled = z21;
        this.ussdAutoAfterSmsEnabled = z22;
        this.ussdAutoAfterDataOffEnabled = z23;
        this.ussdAutoPeriodicEnabled = z24;
        this.ussdAutoIntervalMinutes = i5;
        this.ussdAutoVoiceCode = str22;
        this.ussdAutoSmsCode = str23;
        this.ussdAutoDataCode = str24;
        this.ussdAutoPeriodicQuery = str25;
        this.invitationCode = str26;
    }

    public UserDataPreferences() {
        this(null, null, null, null, false, false, 0, false, null, null, false, false, false, false, false, false, false, false, false, false, false, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, 0L, 0L, 0, 0, 0, null, null, false, false, false, false, false, false, false, false, 0, null, null, null, null, null, -1, -1, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ UserDataPreferences(java.lang.String r64, java.lang.String r65, java.lang.String r66, cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences r67, boolean r68, boolean r69, int r70, boolean r71, java.util.List r72, java.lang.String r73, boolean r74, boolean r75, boolean r76, boolean r77, boolean r78, boolean r79, boolean r80, boolean r81, boolean r82, boolean r83, boolean r84, boolean r85, java.util.List r86, java.lang.String r87, java.lang.String r88, java.lang.String r89, java.util.List r90, java.lang.String r91, boolean r92, java.lang.String r93, java.util.List r94, java.lang.String r95, java.lang.String r96, java.util.List r97, java.lang.String r98, java.lang.String r99, java.lang.String r100, java.lang.String r101, java.lang.String r102, java.lang.String r103, long r104, java.lang.String r106, java.lang.String r107, long r108, long r110, int r112, int r113, int r114, java.lang.String r115, java.lang.String r116, boolean r117, boolean r118, boolean r119, boolean r120, boolean r121, boolean r122, boolean r123, boolean r124, int r125, java.lang.String r126, java.lang.String r127, java.lang.String r128, java.lang.String r129, java.lang.String r130, int r131, int r132, defpackage.hl1 r133) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences.<init>(java.lang.String, java.lang.String, java.lang.String, cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences, boolean, boolean, int, boolean, java.util.List, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, boolean, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, long, long, int, int, int, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, hl1):void");
    }
}
