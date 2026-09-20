.class public final Lei1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:Lik2;

.field public final synthetic x:Ls34;

.field public final synthetic y:Z

.field public final synthetic z:Lo81;


# direct methods
.method public constructor <init>(Lik2;Ls34;ZLo81;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lei1;->w:Lik2;

    .line 5
    .line 6
    iput-object p2, p0, Lei1;->x:Ls34;

    .line 7
    .line 8
    iput-boolean p3, p0, Lei1;->y:Z

    .line 9
    .line 10
    iput-object p4, p0, Lei1;->z:Lo81;

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
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Lqs3;

    .line 2
    .line 3
    iget-object p1, p1, Lqs3;->a:Landroid/view/KeyEvent;

    .line 4
    .line 5
    invoke-static {p1}, Ldh4;->w(Landroid/view/KeyEvent;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v4, p0, Lei1;->w:Lik2;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x6

    .line 15
    check-cast v4, Llk2;

    .line 16
    .line 17
    invoke-virtual {v4, p0, v3}, Llk2;->h(IZ)Z

    .line 18
    .line 19
    .line 20
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    iget-object v2, p0, Lei1;->x:Ls34;

    .line 24
    .line 25
    iget-object v0, v2, Ls34;->j:Lhn1;

    .line 26
    .line 27
    invoke-virtual {v0}, Lhn1;->a()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_1
    iget-boolean v0, p0, Lei1;->y:Z

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-static {p1}, Lgi1;->p(Landroid/view/KeyEvent;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static {p1}, Lgi1;->q(Landroid/view/KeyEvent;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    :goto_0
    if-eqz v1, :cond_3

    .line 50
    .line 51
    new-instance v1, Lfi1;

    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    move v5, v3

    .line 55
    invoke-direct/range {v1 .. v6}, Lfi1;-><init>(Ls34;ILik2;ILf61;)V

    .line 56
    .line 57
    .line 58
    const/4 p1, 0x3

    .line 59
    iget-object p0, p0, Lei1;->z:Lo81;

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    invoke-static {p0, v0, v0, v1, p1}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 63
    .line 64
    .line 65
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_3
    if-eqz v0, :cond_4

    .line 69
    .line 70
    invoke-static {p1}, Lgi1;->q(Landroid/view/KeyEvent;)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    goto :goto_1

    .line 75
    :cond_4
    invoke-static {p1}, Lgi1;->p(Landroid/view/KeyEvent;)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    :goto_1
    if-eqz p0, :cond_5

    .line 80
    .line 81
    const/4 p0, 0x2

    .line 82
    check-cast v4, Llk2;

    .line 83
    .line 84
    invoke-virtual {v4, p0, v3}, Llk2;->h(IZ)Z

    .line 85
    .line 86
    .line 87
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_5
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 91
    .line 92
    return-object p0
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
.end method
