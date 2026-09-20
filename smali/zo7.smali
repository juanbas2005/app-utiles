.class public final Lzo7;
.super Ljava/lang/Object;

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final x:Lbk7;


# direct methods
.method public synthetic constructor <init>(Lbk7;I)V
    .locals 0

    .line 1
    iput p2, p0, Lzo7;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lzo7;->x:Lbk7;

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
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lzo7;->w:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lzo7;->x:Lbk7;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Lbt5;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lbk7;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lz00;

    .line 17
    .line 18
    iget-object p0, p0, Lz00;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lwv1;

    .line 21
    .line 22
    invoke-static {p1, p0}, Lp25;->w(Lbt5;Lwv1;)Lbt5;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iget-object p0, p0, Lbk7;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Lz00;

    .line 36
    .line 37
    iget-object v0, p0, Lz00;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Lvq4;

    .line 40
    .line 41
    invoke-static {v0, p1}, Lt49;->J(Lvq4;I)Lgq0;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-boolean v0, p1, Lgq0;->c:Z

    .line 46
    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iget-object p0, p0, Lz00;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, Lws1;

    .line 53
    .line 54
    iget-object p0, p0, Lws1;->b:Lsl4;

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {p0, p1}, Lr16;->z(Lsl4;Lgq0;)Lvq0;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    instance-of p1, p0, Lut1;

    .line 64
    .line 65
    if-eqz p1, :cond_1

    .line 66
    .line 67
    move-object v1, p0

    .line 68
    check-cast v1, Lut1;

    .line 69
    .line 70
    :cond_1
    :goto_0
    return-object v1

    .line 71
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    iget-object p0, p0, Lbk7;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p0, Lz00;

    .line 80
    .line 81
    iget-object v0, p0, Lz00;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Lvq4;

    .line 84
    .line 85
    invoke-static {v0, p1}, Lt49;->J(Lvq4;I)Lgq0;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iget-boolean v0, p1, Lgq0;->c:Z

    .line 90
    .line 91
    iget-object p0, p0, Lz00;->a:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p0, Lws1;

    .line 94
    .line 95
    if-eqz v0, :cond_2

    .line 96
    .line 97
    iget-object p0, p0, Lws1;->t:Leq0;

    .line 98
    .line 99
    sget-object v0, Leq0;->c:Ljava/util/Set;

    .line 100
    .line 101
    invoke-virtual {p0, p1, v1}, Leq0;->a(Lgq0;Lxp0;)Lql4;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    goto :goto_1

    .line 106
    :cond_2
    iget-object p0, p0, Lws1;->b:Lsl4;

    .line 107
    .line 108
    invoke-static {p0, p1}, Lr16;->z(Lsl4;Lgq0;)Lvq0;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    :goto_1
    return-object p0

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
