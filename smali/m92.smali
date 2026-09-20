.class public final synthetic Lm92;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lvr2;Laq4;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lm92;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lm92;->y:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p1, p0, Lm92;->z:Ljava/lang/Object;

    .line 10
    .line 11
    iput-boolean p3, p0, Lm92;->x:Z

    .line 12
    .line 13
    return-void
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
.end method

.method public synthetic constructor <init>(ZLsr2;Laq4;)V
    .locals 1

    .line 15
    const/4 v0, 0x1

    iput v0, p0, Lm92;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lm92;->x:Z

    iput-object p2, p0, Lm92;->z:Ljava/lang/Object;

    iput-object p3, p0, Lm92;->y:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLxz1;Lo81;)V
    .locals 1

    .line 14
    const/4 v0, 0x2

    iput v0, p0, Lm92;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lm92;->x:Z

    iput-object p2, p0, Lm92;->y:Ljava/lang/Object;

    iput-object p3, p0, Lm92;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lm92;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    iget-object v2, p0, Lm92;->z:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lm92;->y:Ljava/lang/Object;

    .line 8
    .line 9
    iget-boolean p0, p0, Lm92;->x:Z

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v3, Lxz1;

    .line 15
    .line 16
    check-cast v2, Lo81;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    iget-object p0, v3, Lxz1;->a:Lvr2;

    .line 21
    .line 22
    sget-object v0, Lyz1;->w:Lyz1;

    .line 23
    .line 24
    invoke-interface {p0, v0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    new-instance p0, Lmk3;

    .line 37
    .line 38
    const/4 v0, 0x6

    .line 39
    const/4 v4, 0x0

    .line 40
    invoke-direct {p0, v3, v4, v0}, Lmk3;-><init>(Lxz1;Lf61;I)V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x3

    .line 44
    invoke-static {v2, v4, v4, p0, v0}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 45
    .line 46
    .line 47
    :cond_0
    return-object v1

    .line 48
    :pswitch_0
    check-cast v2, Lsr2;

    .line 49
    .line 50
    check-cast v3, Laq4;

    .line 51
    .line 52
    if-eqz p0, :cond_1

    .line 53
    .line 54
    invoke-interface {v3}, La37;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    xor-int/lit8 p0, p0, 0x1

    .line 65
    .line 66
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-interface {v3, p0}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-interface {v3, p0}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v2}, Lsr2;->b()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    :goto_0
    return-object v1

    .line 83
    :pswitch_1
    check-cast v3, Laq4;

    .line 84
    .line 85
    check-cast v2, Lvr2;

    .line 86
    .line 87
    new-instance v0, Lg92;

    .line 88
    .line 89
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-interface {v3, v0}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    xor-int/lit8 p0, p0, 0x1

    .line 96
    .line 97
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-interface {v2, p0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    return-object v1

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
