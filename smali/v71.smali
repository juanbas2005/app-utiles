.class public final synthetic Lv71;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lx71;


# direct methods
.method public synthetic constructor <init>(Lx71;I)V
    .locals 0

    .line 1
    iput p2, p0, Lv71;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lv71;->x:Lx71;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lv71;->w:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sget-object v2, Lvs7;->a:Lvs7;

    .line 5
    .line 6
    iget-object p0, p0, Lv71;->x:Lx71;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lx71;->O:Lu44;

    .line 12
    .line 13
    iget-object v1, p0, Lx71;->V:Lok2;

    .line 14
    .line 15
    iget-boolean p0, p0, Lx71;->P:Z

    .line 16
    .line 17
    invoke-virtual {v0}, Lu44;->b()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    invoke-static {v1}, Lok2;->a(Lok2;)Z

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-nez p0, :cond_1

    .line 28
    .line 29
    iget-object p0, v0, Lu44;->c:Lgy6;

    .line 30
    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    check-cast p0, Lip1;

    .line 34
    .line 35
    invoke-virtual {p0}, Lip1;->b()V

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_0
    iget-object v0, p0, Lx71;->O:Lu44;

    .line 42
    .line 43
    iget-object v0, v0, Lu44;->w:Lj71;

    .line 44
    .line 45
    iget-object p0, p0, Lx71;->U:Lc93;

    .line 46
    .line 47
    iget p0, p0, Lc93;->e:I

    .line 48
    .line 49
    iget-object v0, v0, Lj71;->x:Lu44;

    .line 50
    .line 51
    iget-object v0, v0, Lu44;->r:Lys3;

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Lys3;->b(I)Z

    .line 54
    .line 55
    .line 56
    :goto_1
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_1
    iget-object p0, p0, Lx71;->T:Lze7;

    .line 60
    .line 61
    invoke-virtual {p0}, Lze7;->p()V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :pswitch_2
    invoke-static {p0}, Lrc9;->L0(Lvo1;)V

    .line 66
    .line 67
    .line 68
    return-object v2

    .line 69
    :pswitch_3
    iget-object p0, p0, Lx71;->T:Lze7;

    .line 70
    .line 71
    invoke-virtual {p0}, Lze7;->f()V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :pswitch_4
    iget-object p0, p0, Lx71;->T:Lze7;

    .line 76
    .line 77
    invoke-virtual {p0, v1}, Lze7;->d(Z)Lh27;

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :pswitch_5
    iget-object p0, p0, Lx71;->T:Lze7;

    .line 82
    .line 83
    invoke-virtual {p0, v1}, Lze7;->h(Z)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :pswitch_6
    invoke-static {p0}, Lrc9;->L0(Lvo1;)V

    .line 88
    .line 89
    .line 90
    return-object v2

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
