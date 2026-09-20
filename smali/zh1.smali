.class public final synthetic Lzh1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lhi1;


# direct methods
.method public synthetic constructor <init>(Lhi1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lzh1;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lzh1;->x:Lhi1;

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
    .locals 6

    .line 1
    iget v0, p0, Lzh1;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    iget-object p0, p0, Lzh1;->x:Lhi1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Long;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    iget-object p1, p0, Lhi1;->c:Lvh0;

    .line 17
    .line 18
    invoke-virtual {p1, v2, v3}, Lvh0;->f(J)Lyh0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object v0, p0, Lhi1;->a:Lre3;

    .line 23
    .line 24
    iget v2, p1, Lyh0;->a:I

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Lre3;->f(I)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    iget-object p0, p0, Lhi1;->e:Led5;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Led5;->setValue(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-object v1

    .line 38
    :pswitch_0
    check-cast p1, Ljava/lang/Long;

    .line 39
    .line 40
    iget-object v0, p0, Lhi1;->f:Led5;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    iget-object v3, p0, Lhi1;->c:Lvh0;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide v4

    .line 51
    invoke-virtual {v3, v4, v5}, Lvh0;->b(J)Lth0;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object p0, p0, Lhi1;->a:Lre3;

    .line 56
    .line 57
    iget v3, p1, Lth0;->w:I

    .line 58
    .line 59
    invoke-virtual {p0, v3}, Lre3;->f(I)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_1

    .line 64
    .line 65
    move-object v2, p1

    .line 66
    :cond_1
    invoke-virtual {v0, v2}, Led5;->setValue(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    invoke-virtual {v0, v2}, Led5;->setValue(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :goto_0
    return-object v1

    .line 74
    :pswitch_1
    iget-object v0, p0, Lhi1;->c:Lvh0;

    .line 75
    .line 76
    check-cast p1, Lcw1;

    .line 77
    .line 78
    iget p1, p1, Lcw1;->a:I

    .line 79
    .line 80
    invoke-virtual {p0}, Lhi1;->b()Ljava/lang/Long;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    if-eqz v2, :cond_3

    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 87
    .line 88
    .line 89
    move-result-wide v2

    .line 90
    invoke-virtual {v0, v2, v3}, Lvh0;->f(J)Lyh0;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    iget-wide v2, v2, Lyh0;->e:J

    .line 95
    .line 96
    invoke-virtual {v0, v2, v3}, Lvh0;->f(J)Lyh0;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iget-object v2, p0, Lhi1;->a:Lre3;

    .line 101
    .line 102
    iget v3, v0, Lyh0;->a:I

    .line 103
    .line 104
    invoke-virtual {v2, v3}, Lre3;->f(I)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_3

    .line 109
    .line 110
    iget-object v2, p0, Lhi1;->e:Led5;

    .line 111
    .line 112
    invoke-virtual {v2, v0}, Led5;->setValue(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_3
    iget-object p0, p0, Lhi1;->g:Led5;

    .line 116
    .line 117
    new-instance v0, Lcw1;

    .line 118
    .line 119
    invoke-direct {v0, p1}, Lcw1;-><init>(I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v0}, Led5;->setValue(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    return-object v1

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
