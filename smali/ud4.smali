.class public final Lud4;
.super La97;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# instance fields
.field public final synthetic A:I

.field public synthetic B:Z

.field public synthetic C:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILf61;I)V
    .locals 0

    .line 1
    iput p3, p0, Lud4;->A:I

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, La97;-><init>(ILf61;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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
.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lud4;->A:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lud4;->B:Z

    .line 7
    .line 8
    iget-object p0, p0, Lud4;->C:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v0, Lyb5;

    .line 20
    .line 21
    invoke-direct {v0, p1, p0}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_0
    iget-boolean v0, p0, Lud4;->B:Z

    .line 26
    .line 27
    iget-object p0, p0, Lud4;->C:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Lis7;

    .line 30
    .line 31
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget p1, Lee4;->a:I

    .line 35
    .line 36
    iget-object p0, p0, Lis7;->a:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;

    .line 39
    .line 40
    invoke-virtual {p0}, Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;->getDarkThemeConfigPreferences()Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    sget-object p1, Lde4;->a:[I

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    aget p0, p1, p0

    .line 51
    .line 52
    const/4 p1, 0x1

    .line 53
    if-eq p0, p1, :cond_3

    .line 54
    .line 55
    const/4 v0, 0x2

    .line 56
    if-eq p0, v0, :cond_2

    .line 57
    .line 58
    const/4 v0, 0x3

    .line 59
    if-eq p0, v0, :cond_1

    .line 60
    .line 61
    const/4 v0, 0x4

    .line 62
    if-ne p0, v0, :cond_0

    .line 63
    .line 64
    sget-object p0, Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences;->AMOLED:Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    invoke-static {}, Lh;->c()V

    .line 68
    .line 69
    .line 70
    const/4 p0, 0x0

    .line 71
    goto :goto_3

    .line 72
    :cond_1
    sget-object p0, Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences;->DARK:Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    sget-object p0, Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences;->LIGHT:Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences;

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    if-eqz v0, :cond_4

    .line 79
    .line 80
    sget-object p0, Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences;->DARK:Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences;

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    sget-object p0, Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences;->LIGHT:Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences;

    .line 84
    .line 85
    :goto_0
    new-instance v0, Ldh7;

    .line 86
    .line 87
    sget-object v1, Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences;->LIGHT:Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences;

    .line 88
    .line 89
    const/4 v2, 0x0

    .line 90
    if-eq p0, v1, :cond_5

    .line 91
    .line 92
    move v1, p1

    .line 93
    goto :goto_1

    .line 94
    :cond_5
    move v1, v2

    .line 95
    :goto_1
    sget-object v3, Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences;->AMOLED:Lcu/lestebang/utiletecsa/core/preferences/model/DarkThemeConfigPreferences;

    .line 96
    .line 97
    if-ne p0, v3, :cond_6

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_6
    move p1, v2

    .line 101
    :goto_2
    invoke-direct {v0, v1, p1}, Ldh7;-><init>(ZZ)V

    .line 102
    .line 103
    .line 104
    move-object p0, v0

    .line 105
    :goto_3
    return-object p0

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget p0, p0, Lud4;->A:I

    .line 2
    .line 3
    sget-object v0, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    packed-switch p0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    check-cast p2, Ljava/lang/String;

    .line 16
    .line 17
    check-cast p3, Lf61;

    .line 18
    .line 19
    new-instance p1, Lud4;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct {p1, v1, p3, v2}, Lud4;-><init>(ILf61;I)V

    .line 23
    .line 24
    .line 25
    iput-boolean p0, p1, Lud4;->B:Z

    .line 26
    .line 27
    iput-object p2, p1, Lud4;->C:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lud4;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    check-cast p2, Lis7;

    .line 39
    .line 40
    check-cast p3, Lf61;

    .line 41
    .line 42
    new-instance p1, Lud4;

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    invoke-direct {p1, v1, p3, v2}, Lud4;-><init>(ILf61;I)V

    .line 46
    .line 47
    .line 48
    iput-boolean p0, p1, Lud4;->B:Z

    .line 49
    .line 50
    iput-object p2, p1, Lud4;->C:Ljava/lang/Object;

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lud4;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
