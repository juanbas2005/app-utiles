.class public final synthetic Lwc;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lbd;


# direct methods
.method public synthetic constructor <init>(Lbd;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwc;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lwc;->x:Lbd;

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
    .locals 4

    .line 1
    iget v0, p0, Lwc;->w:I

    .line 2
    .line 3
    iget-object p0, p0, Lwc;->x:Lbd;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lbd;->b()Lll1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object p0, p0, Lbd;->i:Loq1;

    .line 13
    .line 14
    invoke-virtual {p0}, Loq1;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance v1, Lyb5;

    .line 19
    .line 20
    invoke-direct {v1, v0, p0}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-object v1

    .line 24
    :pswitch_0
    invoke-virtual {p0}, Lbd;->b()Lll1;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_1
    invoke-virtual {p0}, Lbd;->b()Lll1;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v1, p0, Lbd;->h:Led5;

    .line 34
    .line 35
    invoke-virtual {v1}, Led5;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Lll1;->c(Ljava/lang/Object;)F

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual {p0}, Lbd;->b()Lll1;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iget-object v2, p0, Lbd;->i:Loq1;

    .line 48
    .line 49
    invoke-virtual {v2}, Loq1;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v1, v2}, Lll1;->c(Ljava/lang/Object;)F

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    sub-float/2addr v1, v0

    .line 58
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-nez v3, :cond_1

    .line 67
    .line 68
    const v3, 0x358637bd    # 1.0E-6f

    .line 69
    .line 70
    .line 71
    cmpl-float v2, v2, v3

    .line 72
    .line 73
    if-lez v2, :cond_1

    .line 74
    .line 75
    invoke-virtual {p0}, Lbd;->e()F

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    sub-float/2addr p0, v0

    .line 80
    div-float/2addr p0, v1

    .line 81
    cmpg-float v0, p0, v3

    .line 82
    .line 83
    if-gez v0, :cond_0

    .line 84
    .line 85
    const/4 p0, 0x0

    .line 86
    goto :goto_0

    .line 87
    :cond_0
    const v0, 0x3f7fffef    # 0.999999f

    .line 88
    .line 89
    .line 90
    cmpl-float v0, p0, v0

    .line 91
    .line 92
    if-lez v0, :cond_2

    .line 93
    .line 94
    :cond_1
    const/high16 p0, 0x3f800000    # 1.0f

    .line 95
    .line 96
    :cond_2
    :goto_0
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0

    .line 101
    :pswitch_2
    iget-object v0, p0, Lbd;->l:Led5;

    .line 102
    .line 103
    invoke-virtual {v0}, Led5;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    if-nez v0, :cond_6

    .line 108
    .line 109
    iget-object v0, p0, Lbd;->j:Lad5;

    .line 110
    .line 111
    invoke-virtual {v0}, Lad5;->d()F

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iget-object v1, p0, Lbd;->g:Led5;

    .line 116
    .line 117
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-nez v2, :cond_5

    .line 122
    .line 123
    invoke-virtual {p0}, Lbd;->b()Lll1;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {v1}, Led5;->getValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-virtual {v2, v3}, Lll1;->c(Ljava/lang/Object;)F

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-nez v3, :cond_4

    .line 140
    .line 141
    cmpg-float v2, v0, v2

    .line 142
    .line 143
    if-nez v2, :cond_3

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_3
    invoke-virtual {p0}, Lbd;->b()Lll1;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-virtual {p0, v0}, Lll1;->a(F)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    if-nez v0, :cond_6

    .line 155
    .line 156
    invoke-virtual {v1}, Led5;->getValue()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    goto :goto_2

    .line 161
    :cond_4
    :goto_1
    invoke-virtual {v1}, Led5;->getValue()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    goto :goto_2

    .line 166
    :cond_5
    invoke-virtual {v1}, Led5;->getValue()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    :cond_6
    :goto_2
    return-object v0

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 172
.end method
