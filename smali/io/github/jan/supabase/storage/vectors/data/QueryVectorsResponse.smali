.class public final Lio/github/jan/supabase/storage/vectors/data/QueryVectorsResponse;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001fB!\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008B5\u0008\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0007\u0010\rJ\'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006 "
    }
    d2 = {
        "Lio/github/jan/supabase/storage/vectors/data/QueryVectorsResponse;",
        "",
        "",
        "Lio/github/jan/supabase/storage/vectors/data/VectorMatch;",
        "vectors",
        "Lqw1;",
        "distanceMetric",
        "<init>",
        "(Ljava/util/List;Lqw1;)V",
        "",
        "seen0",
        "Lrl6;",
        "serializationConstructorMarker",
        "(ILjava/util/List;Lqw1;Lrl6;)V",
        "self",
        "Lhy0;",
        "output",
        "Lll6;",
        "serialDesc",
        "Lvs7;",
        "write$Self$storage_kt",
        "(Lio/github/jan/supabase/storage/vectors/data/QueryVectorsResponse;Lhy0;Lll6;)V",
        "write$Self",
        "Ljava/util/List;",
        "getVectors",
        "()Ljava/util/List;",
        "Lqw1;",
        "getDistanceMetric",
        "()Lqw1;",
        "Companion",
        "bv5",
        "cv5",
        "storage-kt"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlinx/serialization/Serializable;
.end annotation


# static fields
.field private static final $childSerializers:[Lnz3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lnz3;"
        }
    .end annotation
.end field

.field public static final Companion:Lcv5;


# instance fields
.field private final distanceMetric:Lqw1;

.field private final vectors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/github/jan/supabase/storage/vectors/data/VectorMatch;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcv5;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/github/jan/supabase/storage/vectors/data/QueryVectorsResponse;->Companion:Lcv5;

    .line 7
    .line 8
    new-instance v0, Lpp5;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, v1}, Lpp5;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sget-object v2, Li44;->w:Li44;

    .line 15
    .line 16
    invoke-static {v2, v0}, Lrg3;->y(Li44;Lsr2;)Lnz3;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v3, Lpp5;

    .line 21
    .line 22
    const/4 v4, 0x3

    .line 23
    invoke-direct {v3, v4}, Lpp5;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v3}, Lrg3;->y(Li44;Lsr2;)Lnz3;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    new-array v1, v1, [Lnz3;

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    aput-object v0, v1, v3

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    aput-object v2, v1, v0

    .line 37
    .line 38
    sput-object v1, Lio/github/jan/supabase/storage/vectors/data/QueryVectorsResponse;->$childSerializers:[Lnz3;

    .line 39
    .line 40
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public synthetic constructor <init>(ILjava/util/List;Lqw1;Lrl6;)V
    .locals 2

    .line 1
    and-int/lit8 p4, p1, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    if-ne v1, p4, :cond_1

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lio/github/jan/supabase/storage/vectors/data/QueryVectorsResponse;->vectors:Ljava/util/List;

    .line 11
    .line 12
    and-int/lit8 p1, p1, 0x2

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    iput-object v0, p0, Lio/github/jan/supabase/storage/vectors/data/QueryVectorsResponse;->distanceMetric:Lqw1;

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iput-object p3, p0, Lio/github/jan/supabase/storage/vectors/data/QueryVectorsResponse;->distanceMetric:Lqw1;

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    sget-object p0, Lbv5;->a:Lbv5;

    .line 23
    .line 24
    invoke-virtual {p0}, Lbv5;->getDescriptor()Lll6;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p1, v1, p0}, Lwn6;->x(IILll6;)V

    .line 29
    .line 30
    .line 31
    throw v0
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method public constructor <init>(Ljava/util/List;Lqw1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/github/jan/supabase/storage/vectors/data/VectorMatch;",
            ">;",
            "Lqw1;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lio/github/jan/supabase/storage/vectors/data/QueryVectorsResponse;->vectors:Ljava/util/List;

    .line 34
    iput-object p2, p0, Lio/github/jan/supabase/storage/vectors/data/QueryVectorsResponse;->distanceMetric:Lqw1;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lqw1;ILhl1;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 35
    :cond_0
    invoke-direct {p0, p1, p2}, Lio/github/jan/supabase/storage/vectors/data/QueryVectorsResponse;-><init>(Ljava/util/List;Lqw1;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lzr3;
    .locals 3

    .line 1
    new-instance v0, Lcs;

    .line 2
    .line 3
    sget-object v1, Lf38;->a:Lf38;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcs;-><init>(Lzr3;I)V

    .line 7
    .line 8
    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private static final _childSerializers$_anonymous_$0()Lzr3;
    .locals 3

    .line 1
    invoke-static {}, Lqw1;->values()[Lqw1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v1, La62;

    .line 9
    .line 10
    const-string v2, "io.github.jan.supabase.storage.vectors.DistanceMetric"

    .line 11
    .line 12
    invoke-direct {v1, v2, v0}, La62;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 13
    .line 14
    .line 15
    return-object v1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static synthetic a()Lzr3;
    .locals 1

    .line 1
    invoke-static {}, Lio/github/jan/supabase/storage/vectors/data/QueryVectorsResponse;->_childSerializers$_anonymous_()Lzr3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lnz3;
    .locals 1

    .line 1
    sget-object v0, Lio/github/jan/supabase/storage/vectors/data/QueryVectorsResponse;->$childSerializers:[Lnz3;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static synthetic b()Lzr3;
    .locals 1

    .line 1
    invoke-static {}, Lio/github/jan/supabase/storage/vectors/data/QueryVectorsResponse;->_childSerializers$_anonymous_$0()Lzr3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static final synthetic write$Self$storage_kt(Lio/github/jan/supabase/storage/vectors/data/QueryVectorsResponse;Lhy0;Lll6;)V
    .locals 4

    .line 1
    sget-object v0, Lio/github/jan/supabase/storage/vectors/data/QueryVectorsResponse;->$childSerializers:[Lnz3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v2, v0, v1

    .line 5
    .line 6
    invoke-interface {v2}, Lnz3;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    check-cast v2, Lzr3;

    .line 11
    .line 12
    iget-object v3, p0, Lio/github/jan/supabase/storage/vectors/data/QueryVectorsResponse;->vectors:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {p1, p2, v1, v2, v3}, Lhy0;->o(Lll6;ILzr3;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, p2}, Lhy0;->f(Lll6;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v1, p0, Lio/github/jan/supabase/storage/vectors/data/QueryVectorsResponse;->distanceMetric:Lqw1;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    :goto_0
    const/4 v1, 0x1

    .line 29
    aget-object v0, v0, v1

    .line 30
    .line 31
    invoke-interface {v0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lzr3;

    .line 36
    .line 37
    iget-object p0, p0, Lio/github/jan/supabase/storage/vectors/data/QueryVectorsResponse;->distanceMetric:Lqw1;

    .line 38
    .line 39
    invoke-interface {p1, p2, v1, v0, p0}, Lhy0;->A(Lll6;ILzr3;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method


# virtual methods
.method public final getDistanceMetric()Lqw1;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/storage/vectors/data/QueryVectorsResponse;->distanceMetric:Lqw1;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getVectors()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/jan/supabase/storage/vectors/data/VectorMatch;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/storage/vectors/data/QueryVectorsResponse;->vectors:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
