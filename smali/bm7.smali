.class public final Lbm7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Llo7;

.field public final b:Led5;

.field public final synthetic c:Lmm7;


# direct methods
.method public constructor <init>(Lmm7;Llo7;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbm7;->c:Lmm7;

    .line 5
    .line 6
    iput-object p2, p0, Lbm7;->a:Llo7;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-static {p1}, Lu55;->p(Ljava/lang/Object;)Led5;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lbm7;->b:Led5;

    .line 14
    .line 15
    return-void
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
.end method


# virtual methods
.method public final a(Lvr2;Ljava/lang/Object;Lol;Lvr2;)Lam7;
    .locals 8

    .line 1
    iget-object v0, p0, Lbm7;->b:Led5;

    .line 2
    .line 3
    invoke-virtual {v0}, Led5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lam7;

    .line 8
    .line 9
    iget-object v2, p0, Lbm7;->c:Lmm7;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lam7;

    .line 14
    .line 15
    new-instance v3, Lim7;

    .line 16
    .line 17
    iget-object v4, v2, Lmm7;->a:Lin8;

    .line 18
    .line 19
    invoke-virtual {v4}, Lin8;->H0()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-interface {p4, v4}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iget-object v5, v2, Lmm7;->a:Lin8;

    .line 28
    .line 29
    invoke-virtual {v5}, Lin8;->H0()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-interface {p4, v5}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    iget-object v6, p0, Lbm7;->a:Llo7;

    .line 38
    .line 39
    iget-object v7, v6, Llo7;->a:Lvr2;

    .line 40
    .line 41
    invoke-interface {v7, v5}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    check-cast v5, Lol;

    .line 46
    .line 47
    invoke-virtual {v5}, Lol;->d()V

    .line 48
    .line 49
    .line 50
    invoke-direct {v3, v2, v4, v5, v6}, Lim7;-><init>(Lmm7;Ljava/lang/Object;Lol;Llo7;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {v1, p0, v3, p1, p4}, Lam7;-><init>(Lbm7;Lim7;Lvr2;Lvr2;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Led5;->setValue(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object p0, v2, Lmm7;->j:Lyx6;

    .line 60
    .line 61
    invoke-virtual {p0, v3}, Lyx6;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    :cond_0
    iput-object p4, v1, Lam7;->y:Lvr2;

    .line 65
    .line 66
    iput-object p1, v1, Lam7;->x:Lvr2;

    .line 67
    .line 68
    invoke-virtual {v2}, Lmm7;->f()Lgm7;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {v1, p0, p2, p3}, Lam7;->b(Lgm7;Ljava/lang/Object;Lol;)V

    .line 73
    .line 74
    .line 75
    return-object v1
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
