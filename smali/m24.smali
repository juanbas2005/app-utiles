.class public final synthetic Lm24;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lob5;


# direct methods
.method public synthetic constructor <init>(Lob5;I)V
    .locals 0

    .line 1
    iput p2, p0, Lm24;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lm24;->x:Lob5;

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
    iget v0, p0, Lm24;->w:I

    .line 2
    .line 3
    iget-object p0, p0, Lm24;->x:Lob5;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lob5;->k()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    :goto_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :pswitch_0
    invoke-virtual {p0}, Lob5;->n()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    goto :goto_0

    .line 22
    :pswitch_1
    iget-object v0, p0, Lob5;->k:Lhn1;

    .line 23
    .line 24
    invoke-virtual {v0}, Lhn1;->a()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v1, p0, Lob5;->q:Lbd5;

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Lob5;->k()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-virtual {v1}, Lbd5;->d()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v2, -0x1

    .line 42
    if-eq v0, v2, :cond_1

    .line 43
    .line 44
    invoke-virtual {v1}, Lbd5;->d()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-virtual {p0}, Lob5;->l()F

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iget-object v1, p0, Lob5;->n:Ltp1;

    .line 58
    .line 59
    sget-object v2, Lrb5;->a:Lqb5;

    .line 60
    .line 61
    const/high16 v2, 0x42600000    # 56.0f

    .line 62
    .line 63
    invoke-interface {v1, v2}, Ltp1;->e0(F)F

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-virtual {p0}, Lob5;->o()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    int-to-float v2, v2

    .line 72
    const/high16 v3, 0x40000000    # 2.0f

    .line 73
    .line 74
    div-float/2addr v2, v3

    .line 75
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    invoke-virtual {p0}, Lob5;->o()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    int-to-float v2, v2

    .line 84
    div-float/2addr v1, v2

    .line 85
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    cmpl-float v0, v0, v1

    .line 90
    .line 91
    if-ltz v0, :cond_3

    .line 92
    .line 93
    iget-object v0, p0, Lob5;->E:Led5;

    .line 94
    .line 95
    invoke-virtual {v0}, Led5;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Ljava/lang/Boolean;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    iget v1, p0, Lob5;->e:I

    .line 106
    .line 107
    if-eqz v0, :cond_2

    .line 108
    .line 109
    add-int/lit8 v0, v1, 0x1

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    move v0, v1

    .line 113
    goto :goto_1

    .line 114
    :cond_3
    invoke-virtual {p0}, Lob5;->k()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    :goto_1
    invoke-virtual {p0, v0}, Lob5;->j(I)I

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    goto :goto_0

    .line 123
    :pswitch_2
    iget-object v0, p0, Lob5;->k:Lhn1;

    .line 124
    .line 125
    invoke-virtual {v0}, Lhn1;->a()Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eqz v0, :cond_4

    .line 130
    .line 131
    iget-object p0, p0, Lob5;->r:Lbd5;

    .line 132
    .line 133
    invoke-virtual {p0}, Lbd5;->d()I

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    goto :goto_2

    .line 138
    :cond_4
    invoke-virtual {p0}, Lob5;->k()I

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    :goto_2
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    return-object p0

    .line 147
    :pswitch_3
    invoke-virtual {p0}, Lob5;->n()I

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    goto/16 :goto_0

    .line 152
    .line 153
    :pswitch_4
    invoke-virtual {p0}, Lob5;->n()I

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    goto/16 :goto_0

    .line 158
    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
