.class public final Lz56;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public a:Lkd6;

.field public b:Lgu5;

.field public c:I

.field public d:Ljava/lang/String;

.field public e:Ljy2;

.field public f:Lzy2;

.field public g:Ld66;

.field public h:Ldy6;

.field public i:La66;

.field public j:La66;

.field public k:La66;

.field public l:J

.field public m:J

.field public n:Lu72;

.field public o:Ldl7;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lz56;->c:I

    .line 6
    .line 7
    sget-object v0, Ld66;->w:Lc66;

    .line 8
    .line 9
    iput-object v0, p0, Lz56;->g:Ld66;

    .line 10
    .line 11
    sget-object v0, Ldl7;->l:Ljv2;

    .line 12
    .line 13
    iput-object v0, p0, Lz56;->o:Ldl7;

    .line 14
    .line 15
    new-instance v0, Lzy2;

    .line 16
    .line 17
    invoke-direct {v0}, Lzy2;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lz56;->f:Lzy2;

    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
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
.end method

.method public static b(Ljava/lang/String;La66;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    iget-object v0, p1, La66;->E:La66;

    .line 4
    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p1, La66;->F:La66;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object p1, p1, La66;->G:La66;

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p1, ".priorResponse != null"

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Lh;->j(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const-string p1, ".cacheResponse != null"

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Lh;->j(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    const-string p1, ".networkResponse != null"

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lh;->j(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_3
    :goto_0
    return-void
    .line 46
    .line 47
.end method


# virtual methods
.method public final a()La66;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v4, v0, Lz56;->c:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-ltz v4, :cond_3

    .line 7
    .line 8
    move-object v2, v1

    .line 9
    iget-object v1, v0, Lz56;->a:Lkd6;

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    move-object v3, v2

    .line 14
    iget-object v2, v0, Lz56;->b:Lgu5;

    .line 15
    .line 16
    move-object v5, v3

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-object v3, v0, Lz56;->d:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    iget-object v5, v0, Lz56;->e:Ljy2;

    .line 24
    .line 25
    iget-object v6, v0, Lz56;->f:Lzy2;

    .line 26
    .line 27
    invoke-virtual {v6}, Lzy2;->a()Lbz2;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    iget-object v7, v0, Lz56;->g:Ld66;

    .line 32
    .line 33
    iget-object v8, v0, Lz56;->h:Ldy6;

    .line 34
    .line 35
    iget-object v9, v0, Lz56;->i:La66;

    .line 36
    .line 37
    iget-object v10, v0, Lz56;->j:La66;

    .line 38
    .line 39
    iget-object v11, v0, Lz56;->k:La66;

    .line 40
    .line 41
    iget-wide v12, v0, Lz56;->l:J

    .line 42
    .line 43
    iget-wide v14, v0, Lz56;->m:J

    .line 44
    .line 45
    move-object/from16 v16, v1

    .line 46
    .line 47
    iget-object v1, v0, Lz56;->n:Lu72;

    .line 48
    .line 49
    iget-object v0, v0, Lz56;->o:Ldl7;

    .line 50
    .line 51
    move-object/from16 v17, v0

    .line 52
    .line 53
    new-instance v0, La66;

    .line 54
    .line 55
    move-object/from16 v18, v16

    .line 56
    .line 57
    move-object/from16 v16, v1

    .line 58
    .line 59
    move-object/from16 v1, v18

    .line 60
    .line 61
    invoke-direct/range {v0 .. v17}, La66;-><init>(Lkd6;Lgu5;Ljava/lang/String;ILjy2;Lbz2;Ld66;Ldy6;La66;La66;La66;JJLu72;Ldl7;)V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_0
    const-string v0, "message == null"

    .line 66
    .line 67
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object v5

    .line 71
    :cond_1
    const-string v0, "protocol == null"

    .line 72
    .line 73
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-object v5

    .line 77
    :cond_2
    move-object v5, v2

    .line 78
    const-string v0, "request == null"

    .line 79
    .line 80
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-object v5

    .line 84
    :cond_3
    move-object v5, v1

    .line 85
    const-string v1, "code < 0: "

    .line 86
    .line 87
    iget v0, v0, Lz56;->c:I

    .line 88
    .line 89
    invoke-static {v0, v1}, Lku4;->q(ILjava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-object v5
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
