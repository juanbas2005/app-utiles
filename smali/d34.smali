.class public final Ld34;
.super Lll4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ldk6;


# instance fields
.field public K:Lsr2;

.field public L:Lx24;

.field public M:Lz75;

.field public N:Z

.field public O:Lvg6;

.field public final P:Lb34;

.field public Q:Lb34;


# direct methods
.method public constructor <init>(Lsr2;Lx24;Lz75;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lll4;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld34;->K:Lsr2;

    .line 5
    .line 6
    iput-object p2, p0, Ld34;->L:Lx24;

    .line 7
    .line 8
    iput-object p3, p0, Ld34;->M:Lz75;

    .line 9
    .line 10
    iput-boolean p4, p0, Ld34;->N:Z

    .line 11
    .line 12
    new-instance p1, Lb34;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-direct {p1, p0, p2}, Lb34;-><init>(Ld34;I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Ld34;->P:Lb34;

    .line 19
    .line 20
    invoke-virtual {p0}, Ld34;->V0()V

    .line 21
    .line 22
    .line 23
    return-void
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


# virtual methods
.method public final D0(Lok6;)V
    .locals 6

    .line 1
    invoke-static {p1}, Lmk6;->i(Lok6;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ld34;->P:Lb34;

    .line 5
    .line 6
    sget-object v1, Ljk6;->N:Lnk6;

    .line 7
    .line 8
    invoke-interface {p1, v1, v0}, Lok6;->f(Lnk6;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ld34;->M:Lz75;

    .line 12
    .line 13
    iget-object v1, p0, Ld34;->O:Lvg6;

    .line 14
    .line 15
    const-string v2, "scrollAxisRange"

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    sget-object v4, Lz75;->w:Lz75;

    .line 19
    .line 20
    if-ne v0, v4, :cond_1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    sget-object v0, Ljk6;->w:Lnk6;

    .line 25
    .line 26
    sget-object v2, Lmk6;->a:[Lyr3;

    .line 27
    .line 28
    const/16 v4, 0xd

    .line 29
    .line 30
    aget-object v2, v2, v4

    .line 31
    .line 32
    invoke-interface {p1, v0, v1}, Lok6;->f(Lnk6;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {v2}, Lsg3;->a0(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v3

    .line 40
    :cond_1
    if-eqz v1, :cond_3

    .line 41
    .line 42
    sget-object v0, Ljk6;->v:Lnk6;

    .line 43
    .line 44
    sget-object v2, Lmk6;->a:[Lyr3;

    .line 45
    .line 46
    const/16 v4, 0xc

    .line 47
    .line 48
    aget-object v2, v2, v4

    .line 49
    .line 50
    invoke-interface {p1, v0, v1}, Lok6;->f(Lnk6;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    iget-object v0, p0, Ld34;->Q:Lb34;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    sget-object v1, Lzj6;->f:Lnk6;

    .line 58
    .line 59
    new-instance v2, Lh4;

    .line 60
    .line 61
    invoke-direct {v2, v3, v0}, Lh4;-><init>(Ljava/lang/String;Lds2;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p1, v1, v2}, Lok6;->f(Lnk6;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    new-instance v0, Lc34;

    .line 68
    .line 69
    const/4 v1, 0x2

    .line 70
    invoke-direct {v0, p0, v1}, Lc34;-><init>(Ld34;I)V

    .line 71
    .line 72
    .line 73
    sget-object v1, Lzj6;->C:Lnk6;

    .line 74
    .line 75
    new-instance v2, Lh4;

    .line 76
    .line 77
    new-instance v4, Lpb;

    .line 78
    .line 79
    const/16 v5, 0x14

    .line 80
    .line 81
    invoke-direct {v4, v5, v0}, Lpb;-><init>(ILjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-direct {v2, v3, v4}, Lh4;-><init>(Ljava/lang/String;Lds2;)V

    .line 85
    .line 86
    .line 87
    invoke-interface {p1, v1, v2}, Lok6;->f(Lnk6;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object p0, p0, Ld34;->L:Lx24;

    .line 91
    .line 92
    invoke-interface {p0}, Lx24;->f()Lat0;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    sget-object v0, Ljk6;->f:Lnk6;

    .line 97
    .line 98
    sget-object v1, Lmk6;->a:[Lyr3;

    .line 99
    .line 100
    const/16 v2, 0x18

    .line 101
    .line 102
    aget-object v1, v1, v2

    .line 103
    .line 104
    invoke-interface {p1, v0, p0}, Lok6;->f(Lnk6;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_3
    invoke-static {v2}, Lsg3;->a0(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw v3
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
.end method

.method public final K0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
    .line 3
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

.method public final V0()V
    .locals 4

    .line 1
    new-instance v0, Lvg6;

    .line 2
    .line 3
    new-instance v1, Lc34;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, v2}, Lc34;-><init>(Ld34;I)V

    .line 7
    .line 8
    .line 9
    new-instance v2, Lc34;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-direct {v2, p0, v3}, Lc34;-><init>(Ld34;I)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lvg6;-><init>(Lsr2;Lsr2;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Ld34;->O:Lvg6;

    .line 19
    .line 20
    iget-boolean v0, p0, Ld34;->N:Z

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    new-instance v0, Lb34;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {v0, p0, v1}, Lb34;-><init>(Ld34;I)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_0
    iput-object v0, p0, Ld34;->Q:Lb34;

    .line 33
    .line 34
    return-void
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
