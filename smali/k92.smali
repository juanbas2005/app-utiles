.class public final Lk92;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lk92;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lk92;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk92;->a:Lk92;

    .line 7
    .line 8
    const/high16 v0, 0x41800000    # 16.0f

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v0, v1}, Lx91;->d(FF)Lpa5;

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public final a(ZLml4;Lyt2;I)V
    .locals 9

    .line 1
    const v0, -0x6748cc87

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, Lyt2;->g0(I)Lyt2;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3, p1}, Lyt2;->h(Z)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    :goto_0
    or-int/2addr v0, p4

    .line 17
    or-int/lit8 v0, v0, 0x30

    .line 18
    .line 19
    and-int/lit8 v1, v0, 0x13

    .line 20
    .line 21
    const/16 v2, 0x12

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    if-eq v1, v2, :cond_1

    .line 25
    .line 26
    move v1, v3

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/4 v1, 0x0

    .line 29
    :goto_1
    and-int/2addr v0, v3

    .line 30
    invoke-virtual {p3, v0, v1}, Lyt2;->V(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-static {}, Lsu0;->q()Lx83;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    const/high16 p2, 0x43340000    # 180.0f

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/4 p2, 0x0

    .line 46
    :goto_2
    sget-object v0, Ljl4;->w:Ljl4;

    .line 47
    .line 48
    invoke-static {v0, p2}, Lub5;->r(Lml4;F)Lml4;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    const/16 v7, 0x30

    .line 53
    .line 54
    const/16 v8, 0x8

    .line 55
    .line 56
    const/4 v2, 0x0

    .line 57
    const-wide/16 v4, 0x0

    .line 58
    .line 59
    move-object v6, p3

    .line 60
    invoke-static/range {v1 .. v8}, Ld83;->a(Lx83;Ljava/lang/String;Lml4;JLyt2;II)V

    .line 61
    .line 62
    .line 63
    move-object v5, v0

    .line 64
    goto :goto_3

    .line 65
    :cond_3
    move-object v6, p3

    .line 66
    invoke-virtual {v6}, Lyt2;->Y()V

    .line 67
    .line 68
    .line 69
    move-object v5, p2

    .line 70
    :goto_3
    invoke-virtual {v6}, Lyt2;->v()Lyx5;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    if-eqz p2, :cond_4

    .line 75
    .line 76
    new-instance v1, Lj92;

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    move-object v4, p0

    .line 80
    move v6, p1

    .line 81
    move v2, p4

    .line 82
    invoke-direct/range {v1 .. v6}, Lj92;-><init>(IILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 83
    .line 84
    .line 85
    iput-object v1, p2, Lyx5;->d:Lgs2;

    .line 86
    .line 87
    :cond_4
    return-void
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
