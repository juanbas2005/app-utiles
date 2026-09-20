.class public final Li53;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final b:Li53;

.field public static final c:Li53;

.field public static final d:Li53;

.field public static final e:Li53;

.field public static final f:Li53;

.field public static final g:Li53;

.field public static final h:Li53;

.field public static final i:Li53;

.field public static final j:Ljava/util/List;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Li53;

    .line 2
    .line 3
    const-string v1, "GET"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Li53;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Li53;->b:Li53;

    .line 9
    .line 10
    new-instance v1, Li53;

    .line 11
    .line 12
    const-string v2, "POST"

    .line 13
    .line 14
    invoke-direct {v1, v2}, Li53;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Li53;->c:Li53;

    .line 18
    .line 19
    new-instance v2, Li53;

    .line 20
    .line 21
    const-string v3, "PUT"

    .line 22
    .line 23
    invoke-direct {v2, v3}, Li53;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v2, Li53;->d:Li53;

    .line 27
    .line 28
    new-instance v3, Li53;

    .line 29
    .line 30
    const-string v4, "PATCH"

    .line 31
    .line 32
    invoke-direct {v3, v4}, Li53;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v3, Li53;->e:Li53;

    .line 36
    .line 37
    new-instance v4, Li53;

    .line 38
    .line 39
    const-string v5, "DELETE"

    .line 40
    .line 41
    invoke-direct {v4, v5}, Li53;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sput-object v4, Li53;->f:Li53;

    .line 45
    .line 46
    new-instance v5, Li53;

    .line 47
    .line 48
    const-string v6, "HEAD"

    .line 49
    .line 50
    invoke-direct {v5, v6}, Li53;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    sput-object v5, Li53;->g:Li53;

    .line 54
    .line 55
    new-instance v6, Li53;

    .line 56
    .line 57
    const-string v7, "OPTIONS"

    .line 58
    .line 59
    invoke-direct {v6, v7}, Li53;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    sput-object v6, Li53;->h:Li53;

    .line 63
    .line 64
    new-instance v7, Li53;

    .line 65
    .line 66
    const-string v8, "TRACE"

    .line 67
    .line 68
    invoke-direct {v7, v8}, Li53;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v7, Li53;->i:Li53;

    .line 72
    .line 73
    filled-new-array/range {v0 .. v6}, [Li53;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v0}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sput-object v0, Li53;->j:Ljava/util/List;

    .line 82
    .line 83
    return-void
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
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li53;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Li53;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Li53;

    .line 10
    .line 11
    iget-object p0, p0, Li53;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object p1, p1, Li53;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-nez p0, :cond_2

    .line 20
    .line 21
    :goto_0
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 24
    return p0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Li53;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
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

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Li53;->a:Ljava/lang/String;

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
