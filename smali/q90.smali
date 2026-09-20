.class public final Lq90;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lpk1;


# instance fields
.field public final a:Lu83;

.field public final b:Lv75;

.field public final c:Ltk6;

.field public final d:Lt82;


# direct methods
.method public constructor <init>(Lu83;Lv75;Ltk6;Lt82;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq90;->a:Lu83;

    .line 5
    .line 6
    iput-object p2, p0, Lq90;->b:Lv75;

    .line 7
    .line 8
    iput-object p3, p0, Lq90;->c:Ltk6;

    .line 9
    .line 10
    iput-object p4, p0, Lq90;->d:Lt82;

    .line 11
    .line 12
    return-void
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
.method public final a(Lf61;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Lp90;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lp90;

    .line 7
    .line 8
    iget v1, v0, Lp90;->D:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lp90;->D:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lp90;

    .line 21
    .line 22
    check-cast p1, Lh61;

    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lp90;-><init>(Lq90;Lh61;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v0, Lp90;->B:Ljava/lang/Object;

    .line 28
    .line 29
    iget v1, v0, Lp90;->D:I

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    const/4 v3, 0x0

    .line 33
    const/4 v4, 0x1

    .line 34
    sget-object v5, Lp81;->w:Lp81;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v4, :cond_2

    .line 39
    .line 40
    if-ne v1, v2, :cond_1

    .line 41
    .line 42
    iget-object p0, v0, Lp90;->z:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Ltk6;

    .line 45
    .line 46
    :try_start_0
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_3

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_4

    .line 52
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v3

    .line 58
    :cond_2
    iget-object p0, v0, Lp90;->A:Ltk6;

    .line 59
    .line 60
    iget-object v1, v0, Lp90;->z:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Lq90;

    .line 63
    .line 64
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    move-object p1, p0

    .line 68
    move-object p0, v1

    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iput-object p0, v0, Lp90;->z:Ljava/lang/Object;

    .line 74
    .line 75
    iget-object p1, p0, Lq90;->c:Ltk6;

    .line 76
    .line 77
    iput-object p1, v0, Lp90;->A:Ltk6;

    .line 78
    .line 79
    iput v4, v0, Lp90;->D:I

    .line 80
    .line 81
    invoke-virtual {p1, v0}, Lsk6;->b(Lh61;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-ne v1, v5, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    :goto_1
    :try_start_1
    new-instance v1, Lzh;

    .line 89
    .line 90
    const/4 v4, 0x5

    .line 91
    invoke-direct {v1, v4, p0}, Lzh;-><init>(ILjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iput-object p1, v0, Lp90;->z:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object v3, v0, Lp90;->A:Ltk6;

    .line 97
    .line 98
    iput v2, v0, Lp90;->D:I

    .line 99
    .line 100
    invoke-static {v1, v0}, Lh49;->N(Lsr2;Lh61;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 104
    if-ne p0, v5, :cond_5

    .line 105
    .line 106
    :goto_2
    return-object v5

    .line 107
    :cond_5
    move-object v6, p1

    .line 108
    move-object p1, p0

    .line 109
    move-object p0, v6

    .line 110
    :goto_3
    :try_start_2
    check-cast p1, Lgk1;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 111
    .line 112
    invoke-virtual {p0}, Lsk6;->d()V

    .line 113
    .line 114
    .line 115
    return-object p1

    .line 116
    :catchall_1
    move-exception p0

    .line 117
    move-object v6, p1

    .line 118
    move-object p1, p0

    .line 119
    move-object p0, v6

    .line 120
    :goto_4
    invoke-virtual {p0}, Lsk6;->d()V

    .line 121
    .line 122
    .line 123
    throw p1
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
