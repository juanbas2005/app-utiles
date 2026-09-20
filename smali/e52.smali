.class public final Le52;
.super Lwx3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic A:Ltr6;

.field public final synthetic x:I

.field public final synthetic y:Ln52;

.field public final synthetic z:Lx82;


# direct methods
.method public synthetic constructor <init>(Ln52;Lx82;Ltr6;I)V
    .locals 0

    .line 1
    iput p4, p0, Le52;->x:I

    .line 2
    .line 3
    iput-object p1, p0, Le52;->y:Ln52;

    .line 4
    .line 5
    iput-object p2, p0, Le52;->z:Lx82;

    .line 6
    .line 7
    iput-object p3, p0, Le52;->A:Ltr6;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lwx3;-><init>(I)V

    .line 11
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
    iget v0, p0, Le52;->x:I

    .line 2
    .line 3
    iget-object v1, p0, Le52;->y:Ln52;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Le52;->A:Ltr6;

    .line 7
    .line 8
    iget-object p0, p0, Le52;->z:Lx82;

    .line 9
    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v5, 0x1

    .line 12
    const/high16 v6, 0x3f800000    # 1.0f

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p1, La52;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    if-eq p1, v5, :cond_3

    .line 26
    .line 27
    if-ne p1, v4, :cond_1

    .line 28
    .line 29
    iget-object p0, p0, Lx82;->a:Lnm7;

    .line 30
    .line 31
    iget-object p0, p0, Lnm7;->d:Lxf6;

    .line 32
    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    iget v6, p0, Lxf6;->a:F

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget v6, v3, Ltr6;->g:F

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-static {}, Lh;->c()V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    iget-object p0, v1, Ln52;->a:Lnm7;

    .line 46
    .line 47
    iget-object p0, p0, Lnm7;->d:Lxf6;

    .line 48
    .line 49
    if-eqz p0, :cond_3

    .line 50
    .line 51
    iget v6, p0, Lxf6;->a:F

    .line 52
    .line 53
    :cond_3
    :goto_0
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    :goto_1
    return-object v2

    .line 58
    :pswitch_0
    check-cast p1, La52;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_6

    .line 65
    .line 66
    if-eq p1, v5, :cond_7

    .line 67
    .line 68
    if-ne p1, v4, :cond_5

    .line 69
    .line 70
    iget-object p0, p0, Lx82;->a:Lnm7;

    .line 71
    .line 72
    iget-object p0, p0, Lnm7;->a:Lgb2;

    .line 73
    .line 74
    if-eqz p0, :cond_4

    .line 75
    .line 76
    iget v6, p0, Lgb2;->a:F

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    iget v6, v3, Ltr6;->f:F

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_5
    invoke-static {}, Lh;->c()V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_6
    iget-object p0, v1, Ln52;->a:Lnm7;

    .line 87
    .line 88
    iget-object p0, p0, Lnm7;->a:Lgb2;

    .line 89
    .line 90
    if-eqz p0, :cond_7

    .line 91
    .line 92
    iget v6, p0, Lgb2;->a:F

    .line 93
    .line 94
    :cond_7
    :goto_2
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    :goto_3
    return-object v2

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
