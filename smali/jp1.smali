.class public final synthetic Ljp1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkp1;


# direct methods
.method public synthetic constructor <init>(Lkp1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ljp1;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ljp1;->x:Lkp1;

    .line 8
    .line 9
    return-void
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

.method public synthetic constructor <init>(Lkp1;Lwv2;Lf96;)V
    .locals 0

    .line 10
    const/4 p2, 0x1

    iput p2, p0, Ljp1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljp1;->x:Lkp1;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Ljp1;->w:I

    .line 2
    .line 3
    iget-object p0, p0, Ljp1;->x:Lkp1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, Lch4;->b:Lt37;

    .line 9
    .line 10
    invoke-static {p0, v0}, Lh49;->w(Lry0;Lhu5;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lzg4;

    .line 15
    .line 16
    iget-object v0, v0, Lzg4;->d:Lum4;

    .line 17
    .line 18
    sget-object v0, Ld86;->a:Lyy0;

    .line 19
    .line 20
    invoke-static {p0, v0}, Lh49;->w(Lry0;Lhu5;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lq86;

    .line 25
    .line 26
    sget-object v1, Ld86;->b:Lyy0;

    .line 27
    .line 28
    invoke-static {p0, v1}, Lh49;->w(Lry0;Lhu5;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ly76;

    .line 33
    .line 34
    new-instance v1, Ln86;

    .line 35
    .line 36
    iget-boolean v2, p0, Lkp1;->Q:Z

    .line 37
    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    new-instance v2, Lm86;

    .line 41
    .line 42
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    sget-object v2, Ll86;->d:Ll86;

    .line 47
    .line 48
    :goto_0
    iget-boolean v3, p0, Lkp1;->R:Z

    .line 49
    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    iget-object v0, v0, Lq86;->a:Lp86;

    .line 53
    .line 54
    new-instance v0, Li86;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    sget-object v0, Lh86;->g:Lh86;

    .line 61
    .line 62
    :goto_1
    iget-boolean v3, p0, Lkp1;->S:Z

    .line 63
    .line 64
    if-eqz v3, :cond_2

    .line 65
    .line 66
    new-instance v3, Lk86;

    .line 67
    .line 68
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    sget-object v3, Lj86;->d:Lj86;

    .line 73
    .line 74
    :goto_2
    iget-boolean p0, p0, Lkp1;->T:Z

    .line 75
    .line 76
    if-eqz p0, :cond_3

    .line 77
    .line 78
    new-instance p0, Lg86;

    .line 79
    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_3
    sget-object p0, Lf86;->f:Lf86;

    .line 85
    .line 86
    :goto_3
    invoke-direct {v1, v2, v0, v3, p0}, Ln86;-><init>(Lza5;Laa5;Lya5;Lw95;)V

    .line 87
    .line 88
    .line 89
    return-object v1

    .line 90
    :pswitch_0
    sget-object v0, Ld86;->b:Lyy0;

    .line 91
    .line 92
    invoke-static {p0, v0}, Lh49;->w(Lry0;Lhu5;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, Ly76;

    .line 97
    .line 98
    iget-object v1, p0, Lkp1;->U:Le86;

    .line 99
    .line 100
    if-nez v0, :cond_5

    .line 101
    .line 102
    if-eqz v1, :cond_4

    .line 103
    .line 104
    invoke-virtual {p0, v1}, Lwo1;->W0(Lvo1;)V

    .line 105
    .line 106
    .line 107
    :cond_4
    const/4 v0, 0x0

    .line 108
    iput-object v0, p0, Lkp1;->U:Le86;

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_5
    if-nez v1, :cond_6

    .line 112
    .line 113
    new-instance v5, Lns8;

    .line 114
    .line 115
    const/16 v0, 0x12

    .line 116
    .line 117
    invoke-direct {v5, v0, p0}, Lns8;-><init>(ILjava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    new-instance v0, Lwv2;

    .line 121
    .line 122
    const/16 v1, 0xe

    .line 123
    .line 124
    invoke-direct {v0, v1, p0}, Lwv2;-><init>(ILjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    new-instance v1, Lf96;

    .line 128
    .line 129
    const/16 v2, 0x11

    .line 130
    .line 131
    invoke-direct {v1, v2, p0}, Lf96;-><init>(ILjava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    new-instance v6, Ljp1;

    .line 135
    .line 136
    invoke-direct {v6, p0, v0, v1}, Ljp1;-><init>(Lkp1;Lwv2;Lf96;)V

    .line 137
    .line 138
    .line 139
    iget-object v2, p0, Lkp1;->M:Lef3;

    .line 140
    .line 141
    iget-boolean v3, p0, Lkp1;->N:Z

    .line 142
    .line 143
    iget v4, p0, Lkp1;->O:F

    .line 144
    .line 145
    sget-object v0, Lc86;->a:Ljo7;

    .line 146
    .line 147
    new-instance v0, Le86;

    .line 148
    .line 149
    invoke-direct {v0}, Lwo1;-><init>()V

    .line 150
    .line 151
    .line 152
    new-instance v1, Lai;

    .line 153
    .line 154
    invoke-direct/range {v1 .. v6}, Lai;-><init>(Lef3;ZFLns8;Ljp1;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v1}, Lwo1;->V0(Lvo1;)Lvo1;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0, v0}, Lwo1;->V0(Lvo1;)Lvo1;

    .line 161
    .line 162
    .line 163
    iput-object v0, p0, Lkp1;->U:Le86;

    .line 164
    .line 165
    :cond_6
    :goto_4
    sget-object p0, Lvs7;->a:Lvs7;

    .line 166
    .line 167
    return-object p0

    .line 168
    nop

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 170
    .line 171
    .line 172
.end method
